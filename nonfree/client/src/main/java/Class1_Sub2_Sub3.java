import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 implements Interface6 {

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "Lclient!ed;")
	private Class68 aClass68_7;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "Lclient!ba;")
	public final Class18 aClass18_4;

	@OriginalMember(owner = "client!pq", name = "I", descriptor = "Z")
	private final boolean aBoolean525;

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Lclient!qa;Lclient!ih;IIIIIZIII)V")
	public Class1_Sub2_Sub3(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static339.method5350(arg8, arg9));
		this.aClass18_4 = new Class18(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6985, super.anInt6986, arg7, arg10);
		this.aBoolean525 = arg1.anInt3660 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	@Override
	public Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1) {
		return this.aClass18_4.method636(arg0, arg1, 0, false, false, 0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7673(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class63 local16 = this.aClass18_4.method636(131072, arg1, super.anInt6985, false, false, super.anInt6986);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class181 local29 = arg1.method6022();
			local29.oa(super.anInt6985, super.anInt6992, super.anInt6986);
			return local16.method7697(arg0, arg2, local29, false);
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
	@Override
	public void method7675() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
	@Override
	public void method7683() {
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method7677(@OriginalArg(0) Class39 arg0) {
		@Pc(16) Class63 local16 = this.aClass18_4.method636(262144, arg0, super.anInt6985, true, true, super.anInt6986);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt6985 >> 7;
			@Pc(28) int local28 = super.anInt6986 >> 7;
			this.aClass18_4.method630(local16, arg0, local28, local23, local28, local23, false);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!qa;IIZLclient!se;I)V")
	@Override
	public void method7672(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILclient!qa;)Lclient!lb;")
	@Override
	public Class6_Sub5 method7680(@OriginalArg(1) Class39 arg0) {
		@Pc(18) Class63 local18 = this.aClass18_4.method636(2048, arg0, super.anInt6985, false, true, super.anInt6986);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class181 local25 = arg0.method6022();
		local25.oa(super.anInt6985, super.anInt6992, super.anInt6986);
		@Pc(35) Class6_Sub5 local35 = null;
		if (this.aBoolean525) {
			local35 = Static356.method2696(1);
		}
		if (this.aClass18_4.aClass6_Sub7_1 == null) {
			local18.method7700(local25, local35 == null ? null : local35.aClass6_Sub4Array1[0], 0);
		} else {
			@Pc(58) Class208 local58 = this.aClass18_4.aClass6_Sub7_1.method6400();
			arg0.method6020(local18, local58, local25, local35 == null ? null : local35.aClass6_Sub4Array1[0]);
		}
		if (this.aClass68_7 == null) {
			this.aClass68_7 = Static51.method920(super.anInt6992, super.anInt6985, super.anInt6986, local18);
		} else {
			Static220.method3485(this.aClass68_7, super.anInt6986, super.anInt6985, local18, super.anInt6992);
		}
		@Pc(118) int local118 = super.anInt6985 >> 7;
		@Pc(123) int local123 = super.anInt6986 >> 7;
		this.aClass18_4.method630(local18, arg0, local123, local118, local123, local118, true);
		return local35;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLclient!qa;)Lclient!ed;")
	@Override
	public Class68 method7676(@OriginalArg(1) Class39 arg0) {
		return this.aClass68_7;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)I")
	@Override
	public int method7687() {
		return this.aClass18_4.anInt534;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7671() {
		return false;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)I")
	@Override
	public int method7685() {
		return this.aClass18_4.anInt532;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7684() {
		return this.aClass18_4.method634();
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7686(@OriginalArg(0) Class39 arg0) {
		this.aClass18_4.method640(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method7682(@OriginalArg(0) Class39 arg0) {
		this.aClass18_4.method633(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I")
	@Override
	public int method7688() {
		return this.aClass18_4.anInt542;
	}
}
