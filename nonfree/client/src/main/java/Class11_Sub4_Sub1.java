import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class11_Sub4_Sub1 extends Class11_Sub4 {

	@OriginalMember(owner = "client!n", name = "r", descriptor = "[I")
	public static final int[] anIntArray258 = new int[256];

	@OriginalMember(owner = "client!n", name = "w", descriptor = "[I")
	public static final int[] anIntArray259;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "I")
	public static int anInt3974;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "[I")
	public static final int[] anIntArray260;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	public int anInt3973;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	public int anInt3977;

	@OriginalMember(owner = "client!n", name = "D", descriptor = "I")
	public int anInt3979;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "I")
	public int anInt3980;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "I")
	public int anInt3975 = -1;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "I")
	public int anInt3976 = -1;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray258[local4] = local7;
		}
		anIntArray259 = new int[14];
		anInt3974 = -1;
		anIntArray260 = new int[2048];
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;", line = 7)
	@Override
	public Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0) {
		@Pc(6) Class14 local6 = arg0.method2810();
		local6.method3923(super.anInt3963, super.anInt3960, super.anInt3962);
		@Pc(18) Class12_Sub4 local18 = Static138.method2708(3);
		@Pc(40) Class31 local40;
		if (this.anInt3976 != -1) {
			local40 = Static290.aClass107_2.method2761(this.anInt3976).method4777(0, 1024, -1, null, arg0, this.anInt3977, null, 0);
			if (local40 != null) {
				local40.method3836(local6, local18.aClass12_Sub2Array1[2], 0);
			}
		}
		if (this.anInt3975 != -1) {
			local40 = Static290.aClass107_2.method2761(this.anInt3975).method4777(0, 1024, -1, null, arg0, this.anInt3973, null, 0);
			if (local40 != null) {
				local40.method3836(local6, local18.aClass12_Sub2Array1[1], 0);
			}
		}
		local40 = Static290.aClass107_2.method2761(this.anInt3980).method4777(0, 1024, -1, null, arg0, this.anInt3979, null, 0);
		if (local40 != null) {
			local40.method3836(local6, local18.aClass12_Sub2Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIBLclient!wm;)Z", line = 100)
	@Override
	public boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2) {
		@Pc(11) Class14 local11 = arg2.method2810();
		local11.method3923(super.anInt3963, super.anInt3960, super.anInt3962);
		@Pc(36) Class31 local36 = Static290.aClass107_2.method2761(this.anInt3980).method4777(0, 65536, -1, null, arg2, this.anInt3979, null, 0);
		if (local36 != null && local36.method3821(arg0, arg1, local11, true)) {
			return true;
		}
		if (this.anInt3975 != -1) {
			local36 = Static290.aClass107_2.method2761(this.anInt3975).method4777(0, 65536, -1, null, arg2, this.anInt3973, null, 0);
			if (local36 != null && local36.method3821(arg0, arg1, local11, true)) {
				return true;
			}
		}
		if (this.anInt3976 != -1) {
			local36 = Static290.aClass107_2.method2761(this.anInt3976).method4777(0, 65536, -1, null, arg2, this.anInt3977, null, 0);
			if (local36 != null && local36.method3821(arg0, arg1, local11, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!wm;B)V", line = 307)
	@Override
	public void method6071(@OriginalArg(0) Class19 arg0) {
	}
}
