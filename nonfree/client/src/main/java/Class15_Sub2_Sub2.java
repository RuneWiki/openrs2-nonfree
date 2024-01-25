import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class15_Sub2_Sub2 extends Class15_Sub2 implements Interface10 {

	@OriginalMember(owner = "client!cda", name = "K", descriptor = "Lclient!km;")
	private Class175 aClass175_1;

	@OriginalMember(owner = "client!cda", name = "I", descriptor = "Lclient!wca;")
	public final Class311 aClass311_1;

	@OriginalMember(owner = "client!cda", name = "x", descriptor = "Z")
	private final boolean aBoolean67;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Lclient!qa;Lclient!tk;IIIIIZIIIIIII)V")
	public Class15_Sub2_Sub2(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8181 == 1, Static112.method2230(arg13, arg12));
		this.aClass311_1 = new Class311(arg0, arg1, arg12, arg13, super.aByte91, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean67 = arg1.anInt8152 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
		this.aClass311_1.method7256(arg0);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		@Pc(18) Class36 local18 = this.aClass311_1.method7253(2048, arg0, false, true, super.anInt8493, super.anInt8492);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class78 local25 = arg0.method6994();
		local25.oa(super.anInt8492, super.anInt8494, super.anInt8493);
		@Pc(35) Class30_Sub1 local35 = null;
		if (this.aBoolean67) {
			local35 = Static363.method5549(1);
		}
		if (this.aClass311_1.aClass30_Sub7_7 == null) {
			local18.method7360(local25, local35 == null ? null : local35.aClass30_Sub6Array1[0], 0);
		} else {
			@Pc(65) Class267 local65 = this.aClass311_1.aClass30_Sub7_7.method5906();
			arg0.method7066(local18, local65, local25, local35 == null ? null : local35.aClass30_Sub6Array1[0]);
		}
		if (this.aClass175_1 == null) {
			this.aClass175_1 = Static272.method4491(local18, super.anInt8492, super.anInt8493, super.anInt8494);
		} else {
			Static82.method1444(local18, this.aClass175_1, super.anInt8493, super.anInt8492, super.anInt8494);
		}
		this.aClass311_1.method7252(local18, true, super.aShort109, arg0, super.aShort108, super.aShort111, super.aShort110);
		return local35;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return false;
	}

	@OriginalMember(owner = "client!cda", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
		@Pc(23) Class36 local23 = this.aClass311_1.method7253(262144, arg0, true, true, super.anInt8493, super.anInt8492);
		if (local23 != null) {
			this.aClass311_1.method7252(local23, false, super.aShort109, arg0, super.aShort108, super.aShort111, super.aShort110);
		}
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return this.aClass175_1;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return this.aClass311_1.method7253(arg0, arg1, false, false, 0, 0);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return this.aClass311_1.anInt8958;
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return this.aClass311_1.anInt8974;
	}

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return this.aClass311_1.method7255();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
		this.aClass311_1.method7264(arg0);
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(Z)I")
	@Override
	public int method6864() {
		return this.aClass311_1.method7263();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class36 local16 = this.aClass311_1.method7253(131072, arg0, false, false, super.anInt8493, super.anInt8492);
		if (local16 == null) {
			return false;
		} else {
			@Pc(28) Class78 local28 = arg0.method6994();
			local28.oa(super.anInt8492, super.anInt8494, super.anInt8493);
			return local16.method7359(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return this.aClass311_1.anInt8956;
	}

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
	}
}
