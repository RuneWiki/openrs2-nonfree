import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class11_Sub2_Sub5 extends Class11_Sub2 implements Interface4 {

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "Lclient!oh;")
	public final Class156 aClass156_3;

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "Z")
	private final boolean aBoolean415;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!fp;Lclient!gn;IIIIIIIZIIIII)V")
	public Class11_Sub2_Sub5(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt2409 == 1, Static12.method331(arg3, arg2));
		this.aClass156_3 = new Class156(arg0, arg1, arg2, arg3, super.aByte79, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean415 = arg1.anInt2377 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!fp;)Lclient!uq;")
	@Override
	public Class32_Sub7 method5909(@OriginalArg(1) Class63 arg0) {
		@Pc(16) Class3 local16 = this.aClass156_3.method4181(false, super.anInt6729, true, super.anInt6726, arg0, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class129 local23 = arg0.method4634();
		local23.method5774(super.anInt6729, super.anInt6727, super.anInt6726);
		@Pc(33) Class32_Sub7 local33 = null;
		if (this.aBoolean415) {
			local33 = Static67.method1550(1);
		}
		if (this.aClass156_3.aClass32_Sub2_2 == null) {
			local16.method1242(local23, local33 == null ? null : local33.aClass32_Sub4Array1[0], 0);
		} else {
			@Pc(54) Class26 local54 = this.aClass156_3.aClass32_Sub2_2.method1403();
			arg0.method4655(local16, local54, local23, local33 == null ? null : local33.aClass32_Sub4Array1[0]);
		}
		this.aClass156_3.method4183(super.aShort93, super.aShort91, super.aShort92, true, arg0, local16, super.aShort94);
		return local33;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	@Override
	public Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1) {
		return this.aClass156_3.method4181(false, 0, false, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
	@Override
	public void method5911() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!fp;Z)V")
	@Override
	public void method5920(@OriginalArg(0) Class63 arg0) {
		this.aClass156_3.method4189(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(ILclient!fp;)V")
	@Override
	public void method5912(@OriginalArg(1) Class63 arg0) {
		@Pc(23) Class3 local23 = this.aClass156_3.method4181(true, super.anInt6729, true, super.anInt6726, arg0, 131072);
		if (local23 != null) {
			this.aClass156_3.method4183(super.aShort93, super.aShort91, super.aShort92, false, arg0, local23, super.aShort94);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)I")
	@Override
	public int method5922() {
		return this.aClass156_3.anInt4554;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)I")
	@Override
	public int method5927() {
		return this.aClass156_3.anInt4545;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!fp;Lclient!je;ZIIII)V")
	@Override
	public void method5915(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!fp;I)V")
	@Override
	public void method5926(@OriginalArg(0) Class63 arg0) {
		this.aClass156_3.method4187(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5924() {
		return this.aClass156_3.method4192();
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5913() {
		return false;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)I")
	@Override
	public int method5925() {
		return this.aClass156_3.anInt4552;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(B)I")
	@Override
	public int method5877() {
		return this.aClass156_3.method4191();
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	@Override
	public void method5923() {
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!fp;III)Z")
	@Override
	public boolean method5914(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class3 local21 = this.aClass156_3.method4181(false, super.anInt6729, false, super.anInt6726, arg0, 65536);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class129 local28 = arg0.method4634();
			local28.method5774(super.anInt6729, super.anInt6727, super.anInt6726);
			return local21.method1283(arg2, arg1, local28, false);
		}
	}
}
