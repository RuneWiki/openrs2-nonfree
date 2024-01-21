import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class19 implements Interface1 {

	@OriginalMember(owner = "client!d", name = "n", descriptor = "I")
	private int anInt702 = 128;

	@OriginalMember(owner = "client!d", name = "o", descriptor = "I")
	private int anInt703 = 50;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "Lclient!ke;")
	private final Class52 aClass52_8;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!ke;")
	private final Class52 aClass52_9;

	@OriginalMember(owner = "client!d", name = "m", descriptor = "Lclient!ri;")
	private Class85 aClass85_2;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!ke;Lclient!ke;II)V")
	public Class19(@OriginalArg(0) Class52 arg0, @OriginalArg(1) Class52 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt703 = arg2;
		this.aClass52_8 = arg1;
		this.aClass52_9 = arg0;
		this.anInt702 = arg3;
		this.aClass85_2 = new Class85(this.anInt703);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBF)[I")
	@Override
	public int[] method560(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(4) Class3_Sub3_Sub7 local4 = this.method571(arg0);
		local4.aBoolean51 = true;
		return local4.method665(this, this.aClass52_8, arg1, this.anInt702);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method562(@OriginalArg(0) int arg0) {
		return this.method571(arg0).aBoolean47;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method565(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub3_Sub7 local8 = this.method571(arg0);
		return local8.method671(this, this.anInt702, this.aClass52_8);
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method563(@OriginalArg(1) int arg0) {
		return this.method571(arg0).method666(this.aClass52_8, this);
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(II)V")
	public void method569(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class3_Sub3_Sub7 local16 = (Class3_Sub3_Sub7) this.aClass85_2.method2559(); local16 != null; local16 = (Class3_Sub3_Sub7) this.aClass85_2.method2554()) {
			if (local16.aBoolean51) {
				local16.method668(arg0);
				local16.aBoolean51 = false;
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method564(@OriginalArg(0) int arg0) {
		return this.method571(arg0).aBoolean49;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method559(@OriginalArg(1) int arg0) {
		return this.anInt702 == 64 || this.method571(arg0).anInt849 == 64;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)I")
	@Override
	public int method561(@OriginalArg(1) int arg0) {
		return this.method571(arg0).anInt852;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(II)Lclient!dh;")
	private Class3_Sub3_Sub7 method571(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub3_Sub7 local11 = (Class3_Sub3_Sub7) this.aClass85_2.method2558((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) byte[] local22 = this.aClass52_9.method1581(0, arg0);
		if (local22 == null) {
			return Static187.method2945();
		} else {
			@Pc(32) Class3_Sub4 local32 = new Class3_Sub4(local22);
			local11 = new Class3_Sub3_Sub7(local32);
			this.aClass85_2.method2560(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public void method572() {
		this.aClass85_2 = new Class85(this.anInt703);
	}
}
