import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class15_Sub1_Sub2 extends Class15_Sub1 implements Interface10 {

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "Lclient!km;")
	private Class175 aClass175_3;

	@OriginalMember(owner = "client!jf", name = "G", descriptor = "Lclient!wca;")
	public final Class311 aClass311_2;

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "Z")
	private final boolean aBoolean267;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!qa;Lclient!tk;IIIIIZIIIIII)V")
	public Class15_Sub1_Sub2(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static447.method6325(arg11, arg12));
		this.aClass311_2 = new Class311(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean267 = arg1.anInt8152 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return this.aClass311_2.method7253(arg0, arg1, false, false, 0, 0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
		this.aClass311_2.method7264(arg0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return this.aClass311_2.anInt8956;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return this.aClass175_3;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(B)I")
	@Override
	public int method6155() {
		return this.aClass311_2.method7263();
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return this.aClass311_2.method7255();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class36 local18 = this.aClass311_2.method7253(131072, arg0, false, false, super.anInt7573, super.anInt7582);
		if (local18 == null) {
			return false;
		} else {
			@Pc(30) Class78 local30 = arg0.method6994();
			local30.oa(super.anInt7574 + super.anInt7582, super.anInt7580, super.anInt7573 + super.anInt7577);
			return local18.method7359(arg1, arg2, local30, false);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return this.aClass311_2.anInt8974;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
		@Pc(16) Class36 local16 = this.aClass311_2.method7253(262144, arg0, false, true, super.anInt7573, super.anInt7582);
		if (local16 != null) {
			@Pc(28) int local28 = super.anInt7582 >> 7;
			@Pc(33) int local33 = super.anInt7573 >> 7;
			this.aClass311_2.method7252(local16, false, local33, arg0, local33, local28, local28);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		@Pc(18) Class36 local18 = this.aClass311_2.method7253(2048, arg0, false, true, super.anInt7573, super.anInt7582);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class78 local25 = arg0.method6994();
		local25.oa(super.anInt7574 + super.anInt7582, super.anInt7580, super.anInt7573 + super.anInt7577);
		@Pc(42) Class30_Sub1 local42 = null;
		if (this.aBoolean267) {
			local42 = Static363.method5549(1);
		}
		if (this.aClass311_2.aClass30_Sub7_7 == null) {
			local18.method7360(local25, local42 == null ? null : local42.aClass30_Sub6Array1[0], 0);
		} else {
			@Pc(58) Class267 local58 = this.aClass311_2.aClass30_Sub7_7.method5906();
			arg0.method7066(local18, local58, local25, local42 == null ? null : local42.aClass30_Sub6Array1[0]);
		}
		if (this.aClass175_3 == null) {
			this.aClass175_3 = Static272.method4491(local18, super.anInt7582, super.anInt7573, super.anInt7580);
		} else {
			Static82.method1444(local18, this.aClass175_3, super.anInt7573, super.anInt7582, super.anInt7580);
		}
		@Pc(123) int local123 = super.anInt7582 >> 7;
		@Pc(128) int local128 = super.anInt7573 >> 7;
		this.aClass311_2.method7252(local18, true, local128, arg0, local128, local123, local123);
		return local42;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
		this.aClass311_2.method7256(arg0);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return this.aClass311_2.anInt8958;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
	}
}
