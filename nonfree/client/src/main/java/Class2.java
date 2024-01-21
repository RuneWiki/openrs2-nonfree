import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 implements Interface1 {

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
	private int anInt224 = 128;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	private int anInt223 = 50;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!ga;")
	private final Class30 aClass30_6;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "Lclient!ga;")
	private final Class30 aClass30_5;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!td;")
	private Class79 aClass79_1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;II)V")
	public Class2(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt224 = arg3;
		this.aClass30_6 = arg1;
		this.anInt223 = arg2;
		this.aClass30_5 = arg0;
		this.aClass79_1 = new Class79(this.anInt223);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(FIB)[I")
	@Override
	public int[] method107(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub1_Sub15 local16 = this.method114(arg1);
		local16.aBoolean178 = true;
		return local16.method2428(this.aClass30_6, this, arg0, this.anInt224);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method104(@OriginalArg(0) int arg0) {
		return this.method114(arg0).aBoolean179;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
	public void method113() {
		this.aClass79_1 = new Class79(this.anInt223);
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(BI)Lclient!r;")
	private Class1_Sub1_Sub15 method114(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub1_Sub15 local11 = (Class1_Sub1_Sub15) this.aClass79_1.method2657((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27 = this.aClass30_5.method1301(0, arg0);
		if (local27 == null) {
			return Static160.method2778();
		} else {
			@Pc(37) Class1_Sub8 local37 = new Class1_Sub8(local27);
			local11 = new Class1_Sub1_Sub15(local37);
			this.aClass79_1.method2658((long) arg0, local11);
			return local11;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method106(@OriginalArg(1) int arg0) {
		return this.method114(arg0).method2424(this.aClass30_6, this);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method108(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub8 local18 = new Class1_Sub8(this.aClass30_5.method1301(0, arg0));
		@Pc(23) Class1_Sub1_Sub15 local23 = new Class1_Sub1_Sub15(local18);
		return local23.method2425(this.anInt224, this, this.aClass30_6);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(IB)V")
	public void method117(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class1_Sub1_Sub15 local11 = (Class1_Sub1_Sub15) this.aClass79_1.method2660(); local11 != null; local11 = (Class1_Sub1_Sub15) this.aClass79_1.method2655()) {
			if (local11.aBoolean178) {
				local11.method2427(arg0);
				local11.aBoolean178 = false;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method105(@OriginalArg(0) int arg0) {
		return this.method114(arg0).aBoolean180;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(BI)Z")
	@Override
	public boolean method110(@OriginalArg(1) int arg0) {
		return this.anInt224 == 64 || this.method114(arg0).anInt3522 == 64;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)I")
	@Override
	public int method109(@OriginalArg(0) int arg0) {
		return this.method114(arg0).anInt3526;
	}
}
