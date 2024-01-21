import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	public final int anInt1975;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "[B")
	public final byte[] aByteArray31;

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "[S")
	public final short[] aShortArray74 = new short[128];

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "[Lclient!db;")
	public final Class16[] aClass16Array1 = new Class16[128];

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "[Lclient!jb;")
	public final Class2_Sub5_Sub1[] aClass2_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "[B")
	public final byte[] aByteArray33 = new byte[128];

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "[I")
	private int[] anIntArray329 = new int[128];

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "([B)V")
	public Class2_Sub12(@OriginalArg(0) byte[] arg0) {
		@Pc(19) int local19 = 0;
		this.aClass2_Sub5_Sub1Array1 = new Class2_Sub5_Sub1[128];
		this.aByteArray32 = new byte[128];
		this.aByteArray31 = new byte[128];
		@Pc(36) Class2_Sub18 local36 = new Class2_Sub18(arg0);
		while (local36.aByteArray39[local36.anInt3423 + local19] != 0) {
			local19++;
		}
		@Pc(50) byte[] local50 = new byte[local19];
		for (@Pc(52) int local52 = 0; local52 < local19; local52++) {
			local50[local52] = local36.method2392();
		}
		local19++;
		local36.anInt3423++;
		@Pc(72) int local72 = 0;
		@Pc(75) int local75 = local36.anInt3423;
		local36.anInt3423 += local19;
		while (local36.aByteArray39[local72 + local36.anInt3423] != 0) {
			local72++;
		}
		@Pc(94) byte[] local94 = new byte[local72];
		for (@Pc(96) int local96 = 0; local96 < local72; local96++) {
			local94[local96] = local36.method2392();
		}
		@Pc(113) int local113 = 0;
		local36.anInt3423++;
		@Pc(122) int local122 = local36.anInt3423;
		local72++;
		local36.anInt3423 += local72;
		while (local36.aByteArray39[local36.anInt3423 + local113] != 0) {
			local113++;
		}
		@Pc(146) byte[] local146 = new byte[local113];
		for (@Pc(148) int local148 = 0; local148 < local113; local148++) {
			local146[local148] = local36.method2392();
		}
		local113++;
		@Pc(167) byte[] local167 = new byte[local113];
		local36.anInt3423++;
		@Pc(180) int local180;
		@Pc(188) int local188;
		@Pc(193) int local193;
		if (local113 > 1) {
			local180 = 2;
			local167[1] = 1;
			@Pc(186) int local186 = 1;
			for (local188 = 2; local188 < local113; local188++) {
				local193 = local36.method2387();
				if (local193 == 0) {
					local186 = local180++;
				} else {
					if (local193 <= local186) {
						local193--;
					}
					local186 = local193;
				}
				local167[local188] = (byte) local186;
			}
		} else {
			local180 = local113;
		}
		@Pc(220) Class16[] local220 = new Class16[local180];
		for (local188 = 0; local188 < local220.length; local188++) {
			@Pc(231) Class16 local231 = local220[local188] = new Class16();
			@Pc(235) int local235 = local36.method2387();
			if (local235 > 0) {
				local231.aByteArray8 = new byte[local235 * 2];
			}
			local235 = local36.method2387();
			if (local235 > 0) {
				local231.aByteArray9 = new byte[local235 * 2 + 2];
				local231.aByteArray9[1] = 64;
			}
		}
		local193 = local36.method2387();
		@Pc(290) byte[] local290 = local193 > 0 ? new byte[local193 * 2] : null;
		local193 = local36.method2387();
		@Pc(306) byte[] local306 = local193 <= 0 ? null : new byte[local193 * 2];
		@Pc(308) int local308;
		for (local308 = 0; local36.aByteArray39[local36.anInt3423 + local308] != 0; local308++) {
		}
		@Pc(324) byte[] local324 = new byte[local308];
		for (@Pc(326) int local326 = 0; local326 < local308; local326++) {
			local324[local326] = local36.method2392();
		}
		local308++;
		local36.anInt3423++;
		@Pc(350) int local350 = 0;
		for (@Pc(352) int local352 = 0; local352 < 128; local352++) {
			local350 += local36.method2387();
			this.aShortArray74[local352] = (short) local350;
		}
		local350 = 0;
		for (@Pc(375) int local375 = 0; local375 < 128; local375++) {
			local350 += local36.method2387();
			this.aShortArray74[local375] = (short) (this.aShortArray74[local375] + (local350 << 8));
		}
		@Pc(399) int local399 = 0;
		@Pc(401) int local401 = 0;
		@Pc(403) int local403 = 0;
		for (@Pc(405) int local405 = 0; local405 < 128; local405++) {
			if (local403 == 0) {
				if (local399 < local324.length) {
					local403 = local324[local399++];
				} else {
					local403 = -1;
				}
				local401 = local36.method2343();
			}
			local403--;
			this.aShortArray74[local405] = (short) (this.aShortArray74[local405] + ((local401 - 1 & 0x2) << 14));
			this.anIntArray329[local405] = local401;
		}
		local403 = 0;
		@Pc(460) int local460 = 0;
		local399 = 0;
		for (@Pc(464) int local464 = 0; local464 < 128; local464++) {
			if (this.anIntArray329[local464] != 0) {
				if (local403 == 0) {
					if (local50.length > local399) {
						local403 = local50[local399++];
					} else {
						local403 = -1;
					}
					local460 = local36.aByteArray39[local75++] - 1;
				}
				this.aByteArray31[local464] = (byte) local460;
				local403--;
			}
		}
		local403 = 0;
		local399 = 0;
		@Pc(509) int local509 = 0;
		for (@Pc(511) int local511 = 0; local511 < 128; local511++) {
			if (this.anIntArray329[local511] != 0) {
				if (local403 == 0) {
					local509 = local36.aByteArray39[local122++] + 16 << 2;
					if (local399 >= local94.length) {
						local403 = -1;
					} else {
						local403 = local94[local399++];
					}
				}
				this.aByteArray33[local511] = (byte) local509;
				local403--;
			}
		}
		local403 = 0;
		local399 = 0;
		@Pc(562) Class16 local562 = null;
		for (@Pc(564) int local564 = 0; local564 < 128; local564++) {
			if (this.anIntArray329[local564] != 0) {
				if (local403 == 0) {
					local562 = local220[local167[local399]];
					if (local399 >= local146.length) {
						local403 = -1;
					} else {
						local403 = local146[local399++];
					}
				}
				local403--;
				this.aClass16Array1[local564] = local562;
			}
		}
		local403 = 0;
		local399 = 0;
		@Pc(609) int local609 = 0;
		for (@Pc(611) int local611 = 0; local611 < 128; local611++) {
			if (local403 == 0) {
				if (local399 >= local324.length) {
					local403 = -1;
				} else {
					local403 = local324[local399++];
				}
				if (this.anIntArray329[local611] > 0) {
					local609 = local36.method2387() + 1;
				}
			}
			local403--;
			this.aByteArray32[local611] = (byte) local609;
		}
		this.anInt1975 = local36.method2387() + 1;
		@Pc(676) int local676;
		for (@Pc(666) int local666 = 0; local666 < local180; local666++) {
			@Pc(671) Class16 local671 = local220[local666];
			if (local671.aByteArray8 != null) {
				for (local676 = 1; local676 < local671.aByteArray8.length; local676 += 2) {
					local671.aByteArray8[local676] = local36.method2392();
				}
			}
			if (local671.aByteArray9 != null) {
				for (local676 = 3; local676 < local671.aByteArray9.length - 2; local676 += 2) {
					local671.aByteArray9[local676] = local36.method2392();
				}
			}
		}
		@Pc(731) int local731;
		if (local290 != null) {
			for (local731 = 1; local731 < local290.length; local731 += 2) {
				local290[local731] = local36.method2392();
			}
		}
		if (local306 != null) {
			for (local731 = 1; local731 < local306.length; local731 += 2) {
				local306[local731] = local36.method2392();
			}
		}
		@Pc(773) int local773;
		for (local731 = 0; local731 < local180; local731++) {
			@Pc(766) Class16 local766 = local220[local731];
			if (local766.aByteArray9 != null) {
				local350 = 0;
				for (local773 = 2; local773 < local766.aByteArray9.length; local773 += 2) {
					local350 += local36.method2387() + 1;
					local766.aByteArray9[local773] = (byte) local350;
				}
			}
		}
		@Pc(816) int local816;
		for (local676 = 0; local676 < local180; local676++) {
			@Pc(809) Class16 local809 = local220[local676];
			if (local809.aByteArray8 != null) {
				local350 = 0;
				for (local816 = 2; local816 < local809.aByteArray8.length; local816 += 2) {
					local350 = local350 + local36.method2387() + 1;
					local809.aByteArray8[local816] = (byte) local350;
				}
			}
		}
		@Pc(884) int local884;
		@Pc(906) int local906;
		@Pc(911) byte local911;
		@Pc(926) int local926;
		@Pc(934) int local934;
		@Pc(943) int local943;
		@Pc(878) byte local878;
		@Pc(990) int local990;
		if (local290 != null) {
			local350 = local36.method2387();
			local290[0] = (byte) local350;
			for (local773 = 2; local773 < local290.length; local773 += 2) {
				local350 = local350 + local36.method2387() + 1;
				local290[local773] = (byte) local350;
			}
			local878 = local290[0];
			@Pc(882) byte local882 = local290[1];
			for (local884 = 0; local884 < local878; local884++) {
				this.aByteArray32[local884] = (byte) (local882 * this.aByteArray32[local884] + 32 >> 6);
			}
			local906 = 2;
			while (local906 < local290.length) {
				local911 = local290[local906];
				local926 = local882 * (local911 - local878) + (local911 - local878) / 2;
				@Pc(932) byte local932 = local290[local906 + 1];
				for (local934 = local878; local934 < local911; local934++) {
					local943 = Static103.method1804(local911 - local878, local926);
					this.aByteArray32[local934] = (byte) (this.aByteArray32[local934] * local943 + 32 >> 6);
					local926 += local932 - local882;
				}
				local882 = local932;
				local906 += 2;
				local878 = local911;
			}
			for (local990 = local878; local990 < 128; local990++) {
				this.aByteArray32[local990] = (byte) (this.aByteArray32[local990] * local882 + 32 >> 6);
			}
		}
		@Pc(1056) int local1056;
		if (local306 != null) {
			local350 = local36.method2387();
			local306[0] = (byte) local350;
			for (local773 = 2; local773 < local306.length; local773 += 2) {
				local350 = local350 + local36.method2387() + 1;
				local306[local773] = (byte) local350;
			}
			local878 = local306[0];
			local1056 = local306[1] << 1;
			for (local884 = 0; local884 < local878; local884++) {
				local906 = (this.aByteArray33[local884] & 0xFF) + local1056;
				if (local906 < 0) {
					local906 = 0;
				}
				if (local906 > 128) {
					local906 = 128;
				}
				this.aByteArray33[local884] = (byte) local906;
			}
			local906 = 2;
			@Pc(1108) int local1108;
			while (local306.length > local906) {
				local911 = local306[local906];
				local1108 = local306[local906 + 1] << 1;
				local906 += 2;
				local926 = (local911 - local878) / 2 + (local911 - local878) * local1056;
				for (local934 = local878; local934 < local911; local934++) {
					local943 = Static103.method1804(local911 - local878, local926);
					local926 += local1108 - local1056;
					@Pc(1147) int local1147 = (this.aByteArray33[local934] & 0xFF) + local943;
					if (local1147 < 0) {
						local1147 = 0;
					}
					if (local1147 > 128) {
						local1147 = 128;
					}
					this.aByteArray33[local934] = (byte) local1147;
				}
				local878 = local911;
				local1056 = local1108;
			}
			for (local990 = local878; local990 < 128; local990++) {
				local1108 = local1056 + (this.aByteArray33[local990] & 0xFF);
				if (local1108 < 0) {
					local1108 = 0;
				}
				if (local1108 > 128) {
					local1108 = 128;
				}
				this.aByteArray33[local990] = (byte) local1108;
			}
		}
		for (local773 = 0; local773 < local180; local773++) {
			local220[local773].anInt869 = local36.method2387();
		}
		for (local816 = 0; local816 < local180; local816++) {
			@Pc(1242) Class16 local1242 = local220[local816];
			if (local1242.aByteArray8 != null) {
				local1242.anInt872 = local36.method2387();
			}
			if (local1242.aByteArray9 != null) {
				local1242.anInt879 = local36.method2387();
			}
			if (local1242.anInt869 > 0) {
				local1242.anInt875 = local36.method2387();
			}
		}
		for (local1056 = 0; local1056 < local180; local1056++) {
			local220[local1056].anInt870 = local36.method2387();
		}
		for (local884 = 0; local884 < local180; local884++) {
			@Pc(1295) Class16 local1295 = local220[local884];
			if (local1295.anInt870 > 0) {
				local1295.anInt878 = local36.method2387();
			}
		}
		for (local906 = 0; local906 < local180; local906++) {
			@Pc(1321) Class16 local1321 = local220[local906];
			if (local1321.anInt878 > 0) {
				local1321.anInt867 = local36.method2387();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([BLclient!ha;I[I)Z")
	public boolean method1417(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) int[] arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(7) int local7 = 0;
		@Pc(9) Class2_Sub5_Sub1 local9 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg0 == null || arg0[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray329[local19];
				if (local34 != 0) {
					if (local7 != local34) {
						local7 = local34--;
						if ((local34 & 0x1) == 0) {
							local9 = arg1.method1067(local34 >> 2, arg2);
						} else {
							local9 = arg1.method1064(arg2, local34 >> 2);
						}
						if (local9 == null) {
							local5 = false;
						}
					}
					if (local9 != null) {
						this.aClass2_Sub5_Sub1Array1[local19] = local9;
						this.anIntArray329[local19] = 0;
					}
				}
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public void method1418() {
		this.anIntArray329 = null;
	}
}
