import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 implements Interface17 {

	@OriginalMember(owner = "client!bq", name = "H", descriptor = "[I")
	public static final int[] anIntArray135 = new int[256];

	@OriginalMember(owner = "client!bq", name = "y", descriptor = "Lclient!dd;")
	private Class68 aClass68_1;

	@OriginalMember(owner = "client!bq", name = "M", descriptor = "B")
	private final byte aByte14;

	@OriginalMember(owner = "client!bq", name = "L", descriptor = "B")
	private final byte aByte13;

	@OriginalMember(owner = "client!bq", name = "Q", descriptor = "B")
	private final byte aByte15;

	@OriginalMember(owner = "client!bq", name = "F", descriptor = "Z")
	private boolean aBoolean75;

	@OriginalMember(owner = "client!bq", name = "s", descriptor = "S")
	private final short aShort23;

	@OriginalMember(owner = "client!bq", name = "I", descriptor = "Z")
	private final boolean aBoolean76;

	@OriginalMember(owner = "client!bq", name = "P", descriptor = "Z")
	private final boolean aBoolean77;

	@OriginalMember(owner = "client!bq", name = "z", descriptor = "Z")
	private final boolean aBoolean74;

	@OriginalMember(owner = "client!bq", name = "B", descriptor = "Lclient!ba;")
	public Class9 aClass9_1;

	@OriginalMember(owner = "client!bq", name = "t", descriptor = "Lclient!w;")
	private Class4_Sub7_Sub3 aClass4_Sub7_Sub3_1;

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
			anIntArray135[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lclient!oa;Lclient!bd;IIIIIZIIIIIIZ)V")
	public Class10_Sub1_Sub1(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt602 == 1, Static148.method5911(arg12, arg13));
		this.aByte14 = (byte) arg12;
		this.aByte13 = (byte) arg13;
		this.aByte15 = (byte) arg3;
		this.aBoolean75 = arg14;
		this.aShort23 = (short) arg1.anInt605;
		this.aBoolean76 = arg7;
		this.aBoolean77 = arg1.anInt599 != 0 && !arg7;
		this.aBoolean74 = arg0.method6789() && arg1.aBoolean57 && !this.aBoolean76 && Static189.aClass4_Sub2_Sub1_1.method7643(Static403.anInt6994) != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean75) {
			local77 |= 0x10000;
		}
		@Pc(92) Class339 local92 = this.method766(this.aBoolean74, arg0, local77);
		if (local92 != null) {
			this.aClass9_1 = local92.aClass9_6;
			this.aClass4_Sub7_Sub3_1 = local92.aClass4_Sub7_Sub3_5;
			if (this.aBoolean75) {
				this.aClass9_1 = this.aClass9_1.method4006((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class9 local17 = this.method767(arg1, 131072);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class134 local22 = arg1.method6842();
			local22.GA(super.anInt8934, super.anInt8931, super.anInt8929);
			return local17.method4007(arg2, arg0, local22, false);
		}
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)I")
	public int method764() {
		return this.aClass9_1 == null ? 15 : this.aClass9_1.ZA() / 4;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return this.aByte14;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7730() {
		return this.aBoolean75;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		if (this.aClass9_1 == null) {
			return null;
		}
		@Pc(11) Class134 local11 = arg0.method6842();
		local11.GA(super.anInt8934, super.anInt8931, super.anInt8929);
		@Pc(21) Class26_Sub6 local21 = null;
		if (this.aBoolean77) {
			local21 = Static292.method4579(1);
		}
		this.aClass9_1.method4023(local11, local21 == null ? null : local21.aClass26_Sub5Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "(Z)I")
	@Override
	public int method7342() {
		return this.aClass9_1 == null ? 0 : this.aClass9_1.DA();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
		@Pc(19) Class4_Sub7_Sub3 local19;
		if (this.aClass4_Sub7_Sub3_1 == null && this.aBoolean74) {
			@Pc(32) Class339 local32 = this.method766(true, arg0, 262144);
			local19 = local32 == null ? null : local32.aClass4_Sub7_Sub3_5;
		} else {
			local19 = this.aClass4_Sub7_Sub3_1;
			this.aClass4_Sub7_Sub3_1 = null;
		}
		if (local19 != null) {
			Static159.method3156(local19, this.aByte15, super.anInt8934, super.anInt8929, null);
		}
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return this.aByte13;
	}

	@OriginalMember(owner = "client!bq", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return this.aShort23 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZILclient!oa;I)Lclient!un;")
	private Class339 method766(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class25 local13 = Static553.aClass288_4.method6419(this.aShort23 & 0xFFFF);
		@Pc(29) Class16 local29;
		@Pc(42) Class16 local42;
		if (this.aBoolean76) {
			local42 = Static45.aClass16Array1[0];
			local29 = Static109.aClass16Array2[this.aByte15];
		} else {
			local29 = Static45.aClass16Array1[this.aByte15];
			if (this.aByte15 < 3) {
				local42 = Static45.aClass16Array1[this.aByte15 + 1];
			} else {
				local42 = null;
			}
		}
		return local13.method564(local42, super.anInt8934, super.anInt8929, arg2, super.anInt8931, arg1, arg0, this.aByte14 == 11 ? 10 : this.aByte14, local29, this.aByte14 == 11 ? this.aByte13 + 4 : this.aByte13);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!oa;ILclient!ni;ZZI)V")
	@Override
	public void method7732(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg3 instanceof Class10_Sub2_Sub2) {
			@Pc(35) Class10_Sub2_Sub2 local35 = (Class10_Sub2_Sub2) arg3;
			if (this.aClass9_1 == null || local35.aClass9_4 == null) {
				return;
			}
			this.aClass9_1.method4010(local35.aClass9_4, arg0, arg2, arg5, arg4);
		} else if (arg3 instanceof Class10_Sub1_Sub1) {
			@Pc(16) Class10_Sub1_Sub1 local16 = (Class10_Sub1_Sub1) arg3;
			if (this.aClass9_1 != null && local16.aClass9_1 != null) {
				this.aClass9_1.method4010(local16.aClass9_1, arg0, arg2, arg5, arg4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return this.aBoolean74;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
		if (this.aClass9_1 != null) {
			this.aClass9_1.method4016();
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
		@Pc(20) Class4_Sub7_Sub3 local20;
		if (this.aClass4_Sub7_Sub3_1 == null && this.aBoolean74) {
			@Pc(33) Class339 local33 = this.method766(true, arg0, 262144);
			local20 = local33 == null ? null : local33.aClass4_Sub7_Sub3_5;
		} else {
			local20 = this.aClass4_Sub7_Sub3_1;
			this.aClass4_Sub7_Sub3_1 = null;
		}
		if (local20 != null) {
			Static55.method846(local20, this.aByte15, super.anInt8934, super.anInt8929, null);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		if (this.aClass68_1 == null) {
			this.aClass68_1 = Static56.method848(super.anInt8931, this.method767(arg0, 0), super.anInt8934, super.anInt8929);
		}
		return this.aClass68_1;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!oa;IB)Lclient!ba;")
	private Class9 method767(@OriginalArg(0) Class66 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass9_1 != null && arg0.method6831(this.aClass9_1.h(), arg1) == 0) {
			return this.aClass9_1;
		} else {
			@Pc(30) Class339 local30 = this.method766(false, arg0, arg1);
			return local30 == null ? null : local30.aClass9_6;
		}
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)V")
	@Override
	public void method7733() {
		this.aBoolean75 = false;
		if (this.aClass9_1 != null) {
			this.aClass9_1.ia(this.aClass9_1.h() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return this.method767(arg0, arg1);
	}
}
