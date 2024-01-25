import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class25_Sub1_Sub4 extends Class25_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!ne", name = "J", descriptor = "Lclient!co;")
	public final Class44 aClass44_2;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "Z")
	private final boolean aBoolean386;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!tq;Lclient!vc;IIIIIZIIIIIII)V")
	public Class25_Sub1_Sub4(@OriginalArg(0) Class164 arg0, @OriginalArg(1) Class236 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5923 == 1, Static358.method4965(arg12, arg13));
		this.aClass44_2 = new Class44(arg0, arg1, arg12, arg13, super.aByte70, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean386 = arg1.anInt5915 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
		@Pc(16) Class22 local16 = this.aClass44_2.method862(true, super.anInt6077, arg0, true, super.anInt6080, 131072);
		if (local16 != null) {
			this.aClass44_2.method857(arg0, local16, super.aShort89, super.aShort88, super.aShort90, super.aShort87, false);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class22 local16 = this.aClass44_2.method862(false, super.anInt6077, arg0, false, super.anInt6080, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class127 local23 = arg0.method5378();
			local23.method5265(super.anInt6080, super.anInt6085, super.anInt6077);
			return local16.method1584(arg1, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
		this.aClass44_2.method861(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
		this.aClass44_2.method856(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return this.aClass44_2.anInt1093;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		@Pc(16) Class22 local16 = this.aClass44_2.method862(true, super.anInt6077, arg0, false, super.anInt6080, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class127 local23 = arg0.method5378();
		local23.method5265(super.anInt6080, super.anInt6085, super.anInt6077);
		@Pc(40) Class41_Sub1 local40 = null;
		if (this.aBoolean386) {
			local40 = Static277.method4255(1);
		}
		if (this.aClass44_2.aClass41_Sub3_3 == null) {
			local16.method1565(local23, local40 == null ? null : local40.aClass41_Sub5Array1[0], 0);
		} else {
			@Pc(58) Class108 local58 = this.aClass44_2.aClass41_Sub3_3.method2143();
			arg0.method5365(local16, local58, local23, local40 == null ? null : local40.aClass41_Sub5Array1[0]);
		}
		this.aClass44_2.method857(arg0, local16, super.aShort89, super.aShort88, super.aShort90, super.aShort87, true);
		return local40;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return this.aClass44_2.method862(false, 0, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)I")
	@Override
	public int method5239() {
		return this.aClass44_2.method864();
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BZLclient!tq;Lclient!hm;III)V")
	@Override
	public void method5235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class164 arg1, @OriginalArg(3) Class25 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5236() {
		return false;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return this.aClass44_2.anInt1092;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return this.aClass44_2.method863();
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return this.aClass44_2.anInt1094;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	@Override
	public void method5233() {
		throw new IllegalStateException();
	}
}
