import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mu")
public final class Class211 {

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "[F")
	public static final float[] aFloatArray50 = new float[16384];

	@OriginalMember(owner = "client!mu", name = "h", descriptor = "[F")
	public static final float[] aFloatArray51 = new float[16384];

	@OriginalMember(owner = "client!mu", name = "r", descriptor = "I")
	private int anInt5949 = -1;

	@OriginalMember(owner = "client!mu", name = "g", descriptor = "Z")
	public boolean aBoolean418 = true;

	@OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
	private final int anInt5946;

	@OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
	private final int anInt5948;

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "Lclient!k;")
	private final Class166 aClass166_1;

	@OriginalMember(owner = "client!mu", name = "p", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_28;

	@OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
	private final int anInt5947;

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "Lclient!co;")
	private Class51_Sub1 aClass51_Sub1_4;

	@OriginalMember(owner = "client!mu", name = "o", descriptor = "Lclient!wb;")
	private Interface24 anInterface24_4;

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "Lclient!ea;")
	private Class77_Sub1 aClass77_Sub1_1;

	static {
		@Pc(7) double local7 = 3.834951969714103E-4D;
		for (@Pc(9) int local9 = 0; local9 < 16384; local9++) {
			aFloatArray50[local9] = (float) Math.sin((double) local9 * local7);
			aFloatArray51[local9] = (float) Math.cos((double) local9 * local7);
		}
	}

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lclient!jaa;Lclient!k;Lclient!rk;IIIII)V")
	public Class211(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) Class166 arg1, @OriginalArg(2) Class59_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt5946 = arg7;
		this.anInt5948 = arg6;
		this.aClass166_1 = arg1;
		this.aClass14_Sub3_28 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local37 + local35) * arg2.anInt9640;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray9[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt5947 = local27;
		if (local27 <= 0) {
			this.aClass51_Sub1_4 = null;
		} else {
			@Pc(96) Class6_Sub21 local96 = new Class6_Sub21(local27 * 2);
			@Pc(115) int local115;
			@Pc(123) short[] local123;
			@Pc(127) int local127;
			@Pc(113) int local113;
			if (this.aClass14_Sub3_28.aBoolean298) {
				for (local50 = 0; local50 < local25; local50++) {
					local113 = local31 + (local50 + local35) * arg2.anInt9640;
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray9[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local96.method6052(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local113 = (local35 + local50) * arg2.anInt9640 + local31;
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray9[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local96.method6032(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface24_4 = this.aClass14_Sub3_28.method3941(local96.aByteArray93, local96.anInt7338, false);
			this.aClass77_Sub1_1 = new Class77_Sub1(this.aClass14_Sub3_28, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B[BII)V")
	public void method5112(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass77_Sub1_1.method5683(arg0, arg1 * this.aClass14_Sub3_28.method3964(5123));
		this.method5116(arg1, this.aClass77_Sub1_1);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
	private void method5113() {
		if (!this.aBoolean418) {
			return;
		}
		this.aBoolean418 = false;
		@Pc(16) byte[] local16 = this.aClass166_1.aByteArray57;
		@Pc(20) byte[] local20 = this.aClass14_Sub3_28.aByteArray42;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass166_1.anInt4900;
		@Pc(36) int local36 = this.aClass166_1.anInt4900 * this.anInt5946 + this.anInt5948;
		@Pc(58) int local58;
		for (@Pc(47) int local47 = -128; local47 < 0; local47++) {
			local22 = (local22 << 8) - local22;
			for (local58 = -128; local58 < 0; local58++) {
				if (local16[local36++] != 0) {
					local22++;
				}
			}
			local36 += local26 - 128;
		}
		if (this.aClass51_Sub1_4 != null && local22 == this.anInt5949) {
			this.aBoolean418 = false;
			return;
		}
		this.anInt5949 = local22;
		local36 = this.anInt5948 + this.anInt5946 * local26;
		local58 = 0;
		for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
			for (@Pc(114) int local114 = -128; local114 < 0; local114++) {
				if (local16[local36] == 0) {
					@Pc(132) int local132 = 0;
					if (local16[local36 - 1] != 0) {
						local132++;
					}
					if (local16[local36 + 1] != 0) {
						local132++;
					}
					if (local16[local36 - local26] != 0) {
						local132++;
					}
					if (local16[local26 + local36] != 0) {
						local132++;
					}
					local20[local58++] = (byte) (local132 * 17);
				} else {
					local20[local58++] = 68;
				}
				local36++;
			}
			local36 += this.aClass166_1.anInt4900 - 128;
		}
		if (this.aClass51_Sub1_4 == null) {
			this.aClass51_Sub1_4 = new Class51_Sub1(this.aClass14_Sub3_28, 3553, 6406, 128, 128, false, this.aClass14_Sub3_28.aByteArray42, 6406, false);
			this.aClass51_Sub1_4.method3535(false, false);
			this.aClass51_Sub1_4.method7734(true);
		} else {
			this.aClass51_Sub1_4.method3542(128, 6406, false, this.aClass14_Sub3_28.aByteArray42, 128);
		}
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V")
	public void method5115() {
		this.method5116(this.anInt5947, this.anInterface24_4);
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(IBLclient!wb;)V")
	private void method5116(@OriginalArg(0) int arg0, @OriginalArg(2) Interface24 arg1) {
		if (arg0 != 0) {
			this.method5113();
			this.aClass14_Sub3_28.method3985(this.aClass51_Sub1_4);
			this.aClass14_Sub3_28.method3920(arg1, 0, arg0);
		}
	}
}
