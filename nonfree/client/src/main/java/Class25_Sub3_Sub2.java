import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class25_Sub3_Sub2 extends Class25_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!rn", name = "B", descriptor = "Lclient!co;")
	public final Class44 aClass44_4;

	@OriginalMember(owner = "client!rn", name = "R", descriptor = "Z")
	private final boolean aBoolean492;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!tq;Lclient!vc;IIIIIZIIIIII)V")
	public Class25_Sub3_Sub2(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static195.method5583(arg12, arg11));
		this.aClass44_4 = new Class44(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean492 = arg1.anInt5915 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
		this.aClass44_4.method856(arg0);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return this.aClass44_4.method862(false, 0, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return this.aClass44_4.anInt1092;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
		this.aClass44_4.method861(arg0);
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		@Pc(18) Class22 local18 = this.aClass44_4.method862(true, super.anInt5257, arg0, false, super.anInt5261, 1024);
		if (local18 == null) {
			return null;
		}
		@Pc(30) Class127 local30 = arg0.method5378();
		local30.method5265(super.anInt5249 + super.anInt5261, super.anInt5248, super.anInt5257 + super.anInt5255);
		@Pc(46) Class41_Sub1 local46 = null;
		if (this.aBoolean492) {
			local46 = Static277.method4255(1);
		}
		if (this.aClass44_4.aClass41_Sub3_3 == null) {
			local18.method1565(local30, local46 == null ? null : local46.aClass41_Sub5Array1[0], 0);
		} else {
			@Pc(62) Class108 local62 = this.aClass44_4.aClass41_Sub3_3.method2143();
			arg0.method5365(local18, local62, local30, local46 == null ? null : local46.aClass41_Sub5Array1[0]);
		}
		this.aClass44_4.method857(arg0, local18, super.anInt5257 >> 7, super.anInt5261 >> 7, super.anInt5257 >> 7, super.anInt5261 >> 7, true);
		return local46;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return this.aClass44_4.anInt1093;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
		@Pc(18) Class22 local18 = this.aClass44_4.method862(true, super.anInt5257, arg0, false, super.anInt5261, 131072);
		if (local18 != null) {
			this.aClass44_4.method857(arg0, local18, super.anInt5257 >> 7, super.anInt5261 >> 7, super.anInt5257 >> 7, super.anInt5261 >> 7, false);
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return this.aClass44_4.method863();
	}

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "(B)I")
	@Override
	public int method4611() {
		return this.aClass44_4.method864();
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class22 local16 = this.aClass44_4.method862(false, super.anInt5257, arg0, false, super.anInt5261, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class127 local31 = arg0.method5378();
			local31.method5265(super.anInt5249 + super.anInt5261, super.anInt5248, super.anInt5255 + super.anInt5257);
			return local16.method1584(arg1, arg2, local31, false);
		}
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return this.aClass44_4.anInt1094;
	}
}
