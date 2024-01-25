import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class25_Sub5_Sub1 extends Class25_Sub5 implements Interface6 {

	@OriginalMember(owner = "client!kg", name = "O", descriptor = "Lclient!co;")
	public final Class44 aClass44_1;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "Z")
	private final boolean aBoolean296;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!tq;Lclient!vc;IIIIIZIII)V")
	public Class25_Sub5_Sub1(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static245.method1562(arg9, arg8));
		this.aClass44_1 = new Class44(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt4748, super.anInt4751, arg7, arg10);
		this.aBoolean296 = arg1.anInt5915 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		@Pc(16) Class22 local16 = this.aClass44_1.method862(true, super.anInt4751, arg0, false, super.anInt4748, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(29) Class127 local29 = arg0.method5378();
		local29.method5265(super.anInt4748, super.anInt4749, super.anInt4751);
		@Pc(39) Class41_Sub1 local39 = null;
		if (this.aBoolean296) {
			local39 = Static277.method4255(1);
		}
		if (this.aClass44_1.aClass41_Sub3_3 == null) {
			local16.method1565(local29, local39 == null ? null : local39.aClass41_Sub5Array1[0], 0);
		} else {
			@Pc(55) Class108 local55 = this.aClass44_1.aClass41_Sub3_3.method2143();
			arg0.method5365(local16, local55, local29, local39 == null ? null : local39.aClass41_Sub5Array1[0]);
		}
		this.aClass44_1.method857(arg0, local16, super.anInt4751 >> 7, super.anInt4748 >> 7, super.anInt4751 >> 7, super.anInt4748 >> 7, true);
		return local39;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return this.aClass44_1.anInt1092;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return this.aClass44_1.method862(false, 0, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class22 local16 = this.aClass44_1.method862(false, super.anInt4751, arg0, false, super.anInt4748, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class127 local31 = arg0.method5378();
			local31.method5265(super.anInt4748, super.anInt4749, super.anInt4751);
			return local16.method1584(arg1, arg2, local31, false);
		}
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return this.aClass44_1.anInt1094;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return this.aClass44_1.anInt1093;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return this.aClass44_1.method863();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
		this.aClass44_1.method856(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
		this.aClass44_1.method861(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
		@Pc(16) Class22 local16 = this.aClass44_1.method862(true, super.anInt4751, arg0, true, super.anInt4748, 131072);
		if (local16 != null) {
			this.aClass44_1.method857(arg0, local16, super.anInt4751 >> 7, super.anInt4748 >> 7, super.anInt4751 >> 7, super.anInt4748 >> 7, false);
		}
	}

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return false;
	}
}
