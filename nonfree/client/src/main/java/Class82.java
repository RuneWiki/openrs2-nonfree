import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class82 implements Interface3 {

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
	private int anInt3453 = 50;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
	private int anInt3447 = 128;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Lclient!ab;")
	private final Class3 aClass3_32;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "Lclient!ab;")
	private final Class3 aClass3_33;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "Lclient!ig;")
	private Class47 aClass47_23;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!ab;Lclient!ab;II)V")
	public Class82(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass3_32 = arg1;
		this.anInt3453 = arg2;
		this.anInt3447 = arg3;
		this.aClass3_33 = arg0;
		this.aClass47_23 = new Class47(this.anInt3453);
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(II)Z")
	@Override
	public boolean method2598(@OriginalArg(0) int arg0) {
		return this.anInt3447 == 64 || this.method2602(arg0).anInt3841 == 64;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
	public void method2600() {
		this.aClass47_23 = new Class47(this.anInt3453);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method2593(@OriginalArg(0) int arg0) {
		return this.method2602(arg0).aBoolean215;
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "(II)V")
	public void method2601(@OriginalArg(0) int arg0) {
		for (@Pc(11) Class1_Sub3_Sub21 local11 = (Class1_Sub3_Sub21) this.aClass47_23.method1277(); local11 != null; local11 = (Class1_Sub3_Sub21) this.aClass47_23.method1272()) {
			if (local11.aBoolean216) {
				local11.method2904(arg0);
				local11.aBoolean216 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method2596(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub3_Sub21 local9 = this.method2602(arg0);
		return local9.method2907(this.anInt3447, this.aClass3_32, this);
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "(II)Lclient!te;")
	private Class1_Sub3_Sub21 method2602(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub3_Sub21 local11 = (Class1_Sub3_Sub21) this.aClass47_23.method1281((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(22) byte[] local22 = this.aClass3_33.method3265(0, arg0);
		if (local22 == null) {
			return Static119.method1754();
		} else {
			@Pc(36) Class1_Sub14 local36 = new Class1_Sub14(local22);
			local11 = new Class1_Sub3_Sub21(local36);
			this.aClass47_23.method1273((long) arg0, local11);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIF)[I")
	@Override
	public int[] method2595(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(4) Class1_Sub3_Sub21 local4 = this.method2602(arg0);
		local4.aBoolean216 = true;
		return local4.method2903(this.anInt3447, arg1, this, this.aClass3_32);
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(II)Z")
	@Override
	public boolean method2597(@OriginalArg(0) int arg0) {
		return this.method2602(arg0).aBoolean217;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method2594(@OriginalArg(1) int arg0) {
		return this.method2602(arg0).method2901(this, this.aClass3_32);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	@Override
	public int method2592(@OriginalArg(1) int arg0) {
		return this.method2602(arg0).anInt3834;
	}
}
