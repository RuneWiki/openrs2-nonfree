import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class15_Sub5_Sub2 extends Class15_Sub5 implements Interface10 {

	@OriginalMember(owner = "client!sc", name = "y", descriptor = "Lclient!km;")
	private Class175 aClass175_7;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!wca;")
	public final Class311 aClass311_4;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Z")
	private final boolean aBoolean553;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lclient!qa;Lclient!tk;IIIIIZII)V")
	public Class15_Sub5_Sub2(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt8173, arg1.aBoolean578, arg1.aBoolean580);
		this.aClass311_4 = new Class311(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean553 = arg1.anInt8152 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return this.aClass311_4.method7253(arg0, arg1, false, false, 0, 0);
	}

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return this.aClass311_4.anInt8958;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		@Pc(20) Class36 local20 = this.aClass311_4.method7253(2048, arg0, false, true, super.anInt8441, super.anInt8440);
		if (local20 == null) {
			return null;
		}
		@Pc(27) Class78 local27 = arg0.method6994();
		local27.oa(super.anInt8440, super.anInt8442, super.anInt8441);
		@Pc(37) Class30_Sub1 local37 = null;
		if (this.aBoolean553) {
			local37 = Static363.method5549(1);
		}
		if (this.aClass311_4.aClass30_Sub7_7 == null) {
			local20.method7360(local27, local37 == null ? null : local37.aClass30_Sub6Array1[0], 0);
		} else {
			@Pc(67) Class267 local67 = this.aClass311_4.aClass30_Sub7_7.method5906();
			arg0.method7066(local20, local67, local27, local37 == null ? null : local37.aClass30_Sub6Array1[0]);
		}
		if (this.aClass175_7 == null) {
			this.aClass175_7 = Static272.method4491(local20, super.anInt8440, super.anInt8441, super.anInt8442);
		} else {
			Static82.method1444(local20, this.aClass175_7, super.anInt8441, super.anInt8440, super.anInt8442);
		}
		@Pc(119) int local119 = super.anInt8440 >> 7;
		@Pc(124) int local124 = super.anInt8441 >> 7;
		this.aClass311_4.method7252(local20, true, local124, arg0, local124, local119, local119);
		return local37;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
		@Pc(23) Class36 local23 = this.aClass311_4.method7253(262144, arg0, true, true, super.anInt8441, super.anInt8440);
		if (local23 != null) {
			@Pc(30) int local30 = super.anInt8440 >> 7;
			@Pc(35) int local35 = super.anInt8441 >> 7;
			this.aClass311_4.method7252(local23, false, local35, arg0, local35, local30, local30);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return this.aClass311_4.anInt8956;
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
		this.aClass311_4.method7264(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return false;
	}

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return this.aClass311_4.method7255();
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return this.aClass311_4.anInt8974;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class36 local18 = this.aClass311_4.method7253(131072, arg0, false, false, super.anInt8441, super.anInt8440);
		if (local18 == null) {
			return false;
		} else {
			@Pc(30) Class78 local30 = arg0.method6994();
			local30.oa(super.anInt8440, super.anInt8442, super.anInt8441);
			return local18.method7359(arg1, arg2, local30, false);
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
		this.aClass311_4.method7256(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		return this.aClass175_7;
	}
}
