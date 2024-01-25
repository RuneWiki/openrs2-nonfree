import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class1_Sub4_Sub1 extends Class1_Sub4 implements Interface6 {

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "Lclient!ed;")
	private Class68 aClass68_4;

	@OriginalMember(owner = "client!hv", name = "H", descriptor = "Lclient!ba;")
	public final Class18 aClass18_3;

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "Z")
	private final boolean aBoolean272;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!qa;Lclient!ih;IIIIIZII)V")
	public Class1_Sub4_Sub1(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt3647, arg1.aBoolean290, arg1.aBoolean288);
		this.aClass18_3 = new Class18(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean272 = arg1.anInt3660 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return this.aClass18_3.method636(arg0, arg1, 0, false, false, 0);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return this.aClass68_4;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		@Pc(18) Class63 local18 = this.aClass18_3.method636(2048, arg0, super.anInt9269, false, true, super.anInt9271);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class181 local25 = arg0.method6022();
		local25.oa(super.anInt9269, super.anInt9270, super.anInt9271);
		@Pc(35) Class6_Sub5 local35 = null;
		if (this.aBoolean272) {
			local35 = Static356.method2696(1);
		}
		if (this.aClass18_3.aClass6_Sub7_1 == null) {
			local18.method7700(local25, local35 == null ? null : local35.aClass6_Sub4Array1[0], 0);
		} else {
			@Pc(51) Class208 local51 = this.aClass18_3.aClass6_Sub7_1.method6400();
			arg0.method6020(local18, local51, local25, local35 == null ? null : local35.aClass6_Sub4Array1[0]);
		}
		if (this.aClass68_4 == null) {
			this.aClass68_4 = Static51.method920(super.anInt9270, super.anInt9269, super.anInt9271, local18);
		} else {
			Static220.method3485(this.aClass68_4, super.anInt9271, super.anInt9269, local18, super.anInt9270);
		}
		@Pc(111) int local111 = super.anInt9269 >> 7;
		@Pc(116) int local116 = super.anInt9271 >> 7;
		this.aClass18_3.method630(local18, arg0, local116, local111, local116, local111, true);
		return local35;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return this.aClass18_3.method634();
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return this.aClass18_3.anInt542;
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return this.aClass18_3.anInt534;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
		this.aClass18_3.method633(arg0);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return this.aClass18_3.anInt532;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
		@Pc(16) Class63 local16 = this.aClass18_3.method636(262144, arg0, super.anInt9269, true, true, super.anInt9271);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt9269 >> 7;
			@Pc(28) int local28 = super.anInt9271 >> 7;
			this.aClass18_3.method630(local16, arg0, local28, local23, local28, local23, false);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		@Pc(21) Class63 local21 = this.aClass18_3.method636(131072, arg1, super.anInt9269, false, false, super.anInt9271);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class181 local28 = arg1.method6022();
			local28.oa(super.anInt9269, super.anInt9270, super.anInt9271);
			return local21.method7697(arg0, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
		this.aClass18_3.method640(arg0);
	}
}
