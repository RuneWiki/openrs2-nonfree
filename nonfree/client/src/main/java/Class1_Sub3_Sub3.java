import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "Lclient!ed;")
	private Class68 aClass68_3;

	@OriginalMember(owner = "client!gca", name = "H", descriptor = "Lclient!ba;")
	public final Class18 aClass18_2;

	@OriginalMember(owner = "client!gca", name = "E", descriptor = "Z")
	private final boolean aBoolean223;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(Lclient!qa;Lclient!ih;IIIIIZIIIIII)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static390.method6256(arg12, arg11));
		this.aClass18_2 = new Class18(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean223 = arg1.anInt3660 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return this.aClass18_2.anInt534;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return this.aClass18_2.anInt532;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		@Pc(18) Class63 local18 = this.aClass18_2.method636(2048, arg0, super.anInt2743, false, true, super.anInt2737);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class181 local25 = arg0.method6022();
		local25.oa(super.anInt2743 + super.anInt2744, super.anInt2738, super.anInt2737 + super.anInt2733);
		@Pc(42) Class6_Sub5 local42 = null;
		if (this.aBoolean223) {
			local42 = Static356.method2696(1);
		}
		if (this.aClass18_2.aClass6_Sub7_1 == null) {
			local18.method7700(local25, local42 == null ? null : local42.aClass6_Sub4Array1[0], 0);
		} else {
			@Pc(58) Class208 local58 = this.aClass18_2.aClass6_Sub7_1.method6400();
			arg0.method6020(local18, local58, local25, local42 == null ? null : local42.aClass6_Sub4Array1[0]);
		}
		if (this.aClass68_3 == null) {
			this.aClass68_3 = Static51.method920(super.anInt2738, super.anInt2743, super.anInt2737, local18);
		} else {
			Static220.method3485(this.aClass68_3, super.anInt2737, super.anInt2743, local18, super.anInt2738);
		}
		@Pc(120) int local120 = super.anInt2743 >> 7;
		@Pc(125) int local125 = super.anInt2737 >> 7;
		this.aClass18_2.method630(local18, arg0, local125, local120, local125, local120, true);
		return local42;
	}

	@OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return this.aClass18_2.anInt542;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return this.aClass68_3;
	}

	@OriginalMember(owner = "client!gca", name = "f", descriptor = "(I)I")
	@Override
	public int method2595() {
		return this.aClass18_2.method631();
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
		this.aClass18_2.method640(arg0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
		@Pc(16) Class63 local16 = this.aClass18_2.method636(262144, arg0, super.anInt2743, false, true, super.anInt2737);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt2743 >> 7;
			@Pc(28) int local28 = super.anInt2737 >> 7;
			this.aClass18_2.method630(local16, arg0, local28, local23, local28, local23, false);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
		this.aClass18_2.method633(arg0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		@Pc(23) Class63 local23 = this.aClass18_2.method636(131072, arg1, super.anInt2743, false, false, super.anInt2737);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class181 local30 = arg1.method6022();
			local30.oa(super.anInt2743 + super.anInt2744, super.anInt2738, super.anInt2737 + super.anInt2733);
			return local23.method7697(arg0, arg2, local30, false);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return this.aClass18_2.method636(arg0, arg1, 0, false, false, 0);
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return this.aClass18_2.method634();
	}
}
