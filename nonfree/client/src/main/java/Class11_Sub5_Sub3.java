import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class11_Sub5_Sub3 extends Class11_Sub5 implements Interface4 {

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "Lclient!oh;")
	public final Class156 aClass156_2;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "Z")
	private final boolean aBoolean382;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!fp;Lclient!gn;IIIIIIIZI)V")
	public Class11_Sub5_Sub3(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static186.method3506(arg3, arg2));
		this.aClass156_2 = new Class156(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt5140, super.anInt5141, arg9, arg10);
		this.aBoolean382 = arg1.anInt2377 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
		@Pc(16) Class3 local16 = this.aClass156_2.method4181(true, super.anInt5140, true, super.anInt5141, arg0, 131072);
		if (local16 != null) {
			this.aClass156_2.method4183(super.anInt5141 >> 7, super.anInt5141 >> 7, super.anInt5140 >> 7, false, arg0, local16, super.anInt5140 >> 7);
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return this.aClass156_2.anInt4552;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return this.aClass156_2.method4181(false, 0, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(22) Class3 local22 = this.aClass156_2.method4181(false, super.anInt5140, false, super.anInt5141, arg0, 65536);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class129 local29 = arg0.method4634();
			local29.method5774(super.anInt5140, super.anInt5142, super.anInt5141);
			return local22.method1283(arg2, arg1, local29, false);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return this.aClass156_2.anInt4545;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return this.aClass156_2.anInt4554;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		@Pc(16) Class3 local16 = this.aClass156_2.method4181(false, super.anInt5140, true, super.anInt5141, arg0, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class129 local23 = arg0.method4634();
		local23.method5774(super.anInt5140, super.anInt5142, super.anInt5141);
		@Pc(38) Class32_Sub7 local38 = null;
		if (this.aBoolean382) {
			local38 = Static67.method1550(1);
		}
		if (this.aClass156_2.aClass32_Sub2_2 == null) {
			local16.method1242(local23, local38 == null ? null : local38.aClass32_Sub4Array1[0], 0);
		} else {
			@Pc(54) Class26 local54 = this.aClass156_2.aClass32_Sub2_2.method1403();
			arg0.method4655(local16, local54, local23, local38 == null ? null : local38.aClass32_Sub4Array1[0]);
		}
		this.aClass156_2.method4183(super.anInt5141 >> 7, super.anInt5141 >> 7, super.anInt5140 >> 7, true, arg0, local16, super.anInt5140 >> 7);
		return local38;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return false;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
		this.aClass156_2.method4189(arg0);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return this.aClass156_2.method4192();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
		this.aClass156_2.method4187(arg0);
	}
}
