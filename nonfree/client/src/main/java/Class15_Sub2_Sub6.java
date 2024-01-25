import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class15_Sub2_Sub6 extends Class15_Sub2 implements Interface10 {

	@OriginalMember(owner = "client!ul", name = "X", descriptor = "[F")
	public static final float[] aFloatArray69 = new float[16384];

	@OriginalMember(owner = "client!ul", name = "W", descriptor = "[F")
	public static final float[] aFloatArray68 = new float[16384];

	@OriginalMember(owner = "client!ul", name = "E", descriptor = "Lclient!km;")
	private Class175 aClass175_8;

	@OriginalMember(owner = "client!ul", name = "Z", descriptor = "B")
	private final byte aByte94;

	@OriginalMember(owner = "client!ul", name = "I", descriptor = "Z")
	private final boolean aBoolean616;

	@OriginalMember(owner = "client!ul", name = "N", descriptor = "S")
	private final short aShort112;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "Z")
	private final boolean aBoolean614;

	@OriginalMember(owner = "client!ul", name = "P", descriptor = "B")
	private final byte aByte93;

	@OriginalMember(owner = "client!ul", name = "Y", descriptor = "Z")
	private boolean aBoolean617;

	@OriginalMember(owner = "client!ul", name = "G", descriptor = "B")
	private final byte aByte92;

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "Z")
	private final boolean aBoolean615;

	@OriginalMember(owner = "client!ul", name = "O", descriptor = "Lclient!k;")
	private Class5_Sub2_Sub13 aClass5_Sub2_Sub13_5;

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "Lclient!r;")
	public Class36 aClass36_6;

	static {
		@Pc(15) double local15 = 3.834951969714103E-4D;
		for (@Pc(17) int local17 = 0; local17 < 16384; local17++) {
			aFloatArray68[local17] = (float) Math.sin((double) local17 * local15);
			aFloatArray69[local17] = (float) Math.cos((double) local17 * local15);
		}
	}

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!qa;Lclient!tk;IIIIIZIIIIIIZ)V")
	public Class15_Sub2_Sub6(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class283 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8181 == 1, Static373.method5614(arg12, arg13));
		this.aByte94 = (byte) arg13;
		this.aBoolean616 = arg1.anInt8152 != 0 && !arg7;
		this.aShort112 = (short) arg1.anInt8190;
		this.aBoolean614 = arg7;
		this.aByte93 = (byte) arg12;
		this.aBoolean617 = arg14;
		this.aByte92 = (byte) arg3;
		this.aBoolean615 = arg0.method7047() && arg1.aBoolean592 && !this.aBoolean614 && Static300.aClass5_Sub28_Sub1_1.method4116(Static17.anInt459) != 0;
		@Pc(77) int local77 = 2048;
		if (this.aBoolean617) {
			local77 |= 0x10000;
		}
		@Pc(92) Class89 local92 = this.method6878(this.aBoolean615, local77, arg0);
		if (local92 != null) {
			this.aClass5_Sub2_Sub13_5 = local92.aClass5_Sub2_Sub13_1;
			this.aClass36_6 = local92.aClass36_1;
			if (this.aBoolean617) {
				this.aClass36_6 = this.aClass36_6.method7356((byte) 0, local77, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(ILclient!qa;)Lclient!km;")
	@Override
	public Class175 method6854(@OriginalArg(1) Class62 arg0) {
		if (this.aClass175_8 == null) {
			this.aClass175_8 = Static272.method4491(this.method6877(arg0, 0), super.anInt8492, super.anInt8493, super.anInt8494);
		}
		return this.aClass175_8;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method6872(@OriginalArg(1) Class62 arg0) {
		@Pc(22) Class5_Sub2_Sub13 local22;
		if (this.aClass5_Sub2_Sub13_5 == null && this.aBoolean615) {
			@Pc(33) Class89 local33 = this.method6878(true, 262144, arg0);
			local22 = local33 == null ? null : local33.aClass5_Sub2_Sub13_1;
		} else {
			local22 = this.aClass5_Sub2_Sub13_5;
			this.aClass5_Sub2_Sub13_5 = null;
		}
		if (local22 != null) {
			Static44.method899(local22, this.aByte92, super.anInt8492, super.anInt8493, null);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6869(@OriginalArg(1) Class62 arg0) {
		@Pc(25) Class5_Sub2_Sub13 local25;
		if (this.aClass5_Sub2_Sub13_5 == null && this.aBoolean615) {
			@Pc(18) Class89 local18 = this.method6878(true, 262144, arg0);
			local25 = local18 == null ? null : local18.aClass5_Sub2_Sub13_1;
		} else {
			local25 = this.aClass5_Sub2_Sub13_5;
			this.aClass5_Sub2_Sub13_5 = null;
		}
		if (local25 != null) {
			Static135.method2556(local25, this.aByte92, super.anInt8492, super.anInt8493, null);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!qa;II)Z")
	@Override
	public boolean method6857(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class36 local18 = this.method6877(arg0, 131072);
		if (local18 == null) {
			return false;
		} else {
			@Pc(23) Class78 local23 = arg0.method6994();
			local23.oa(super.anInt8492, super.anInt8494, super.anInt8493);
			return local18.method7359(arg1, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6871() {
		return this.aBoolean615;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!qa;B)V")
	@Override
	public void method6862(@OriginalArg(0) Class62 arg0) {
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(Z)I")
	public int method6874() {
		return this.aClass36_6 == null ? 15 : this.aClass36_6.e() / 4;
	}

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V")
	@Override
	public void method6860() {
		this.aBoolean617 = false;
		if (this.aClass36_6 != null) {
			this.aClass36_6.m(this.aClass36_6.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6861() {
		return this.aBoolean617;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)I")
	@Override
	public int method6864() {
		return this.aClass36_6 == null ? 0 : this.aClass36_6.TA();
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I")
	@Override
	public int method6867() {
		return this.aByte93;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!qa;II)Lclient!r;")
	private Class36 method6877(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass36_6 != null && arg0.method7017(this.aClass36_6.ba(), arg1) == 0) {
			return this.aClass36_6;
		} else {
			@Pc(25) Class89 local25 = this.method6878(false, arg1, arg0);
			return local25 == null ? null : local25.aClass36_1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!qa;I)Lclient!bi;")
	@Override
	public Class30_Sub1 method6858(@OriginalArg(0) Class62 arg0) {
		if (this.aClass36_6 == null) {
			return null;
		}
		@Pc(20) Class78 local20 = arg0.method6994();
		local20.oa(super.anInt8492, super.anInt8494, super.anInt8493);
		@Pc(30) Class30_Sub1 local30 = null;
		if (this.aBoolean616) {
			local30 = Static363.method5549(1);
		}
		this.aClass36_6.method7360(local20, local30 == null ? null : local30.aClass30_Sub6Array1[0], 0);
		return local30;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)I")
	@Override
	public int method6868() {
		return this.aShort112 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
	@Override
	public void method6870() {
		if (this.aClass36_6 != null) {
			this.aClass36_6.method7357();
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I")
	@Override
	public int method6866() {
		return this.aByte94;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZIILclient!qa;)Lclient!ep;")
	private Class89 method6878(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2) {
		@Pc(23) Class283 local23 = Static453.aClass88_3.method2294(this.aShort112 & 0xFFFF);
		@Pc(31) Class131 local31;
		@Pc(42) Class131 local42;
		if (this.aBoolean614) {
			local31 = Static511.aClass131Array6[this.aByte92];
			local42 = Static493.aClass131Array5[0];
		} else {
			local31 = Static493.aClass131Array5[this.aByte92];
			if (this.aByte92 < 3) {
				local42 = Static493.aClass131Array5[this.aByte92 + 1];
			} else {
				local42 = null;
			}
		}
		return local23.method6612(this.aByte93 == 11 ? 10 : this.aByte93, local31, local42, this.aByte93 == 11 ? this.aByte94 + 4 : this.aByte94, super.anInt8492, arg0, super.anInt8493, arg1, arg2, super.anInt8494);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!qa;Z)Lclient!r;")
	@Override
	public Class36 method6873(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1) {
		return this.method6877(arg1, arg0);
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BZILclient!qa;IILclient!cea;)V")
	@Override
	public void method6859(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class15 arg5) {
		if (arg5 instanceof Class15_Sub3_Sub2) {
			@Pc(9) Class15_Sub3_Sub2 local9 = (Class15_Sub3_Sub2) arg5;
			if (this.aClass36_6 != null && local9.aClass36_2 != null) {
				this.aClass36_6.method7349(local9.aClass36_2, arg3, arg1, arg4, arg0);
			}
		} else if (arg5 instanceof Class15_Sub2_Sub6) {
			@Pc(32) Class15_Sub2_Sub6 local32 = (Class15_Sub2_Sub6) arg5;
			if (this.aClass36_6 != null && local32.aClass36_6 != null) {
				this.aClass36_6.method7349(local32.aClass36_6, arg3, arg1, arg4, arg0);
			}
		}
	}
}
