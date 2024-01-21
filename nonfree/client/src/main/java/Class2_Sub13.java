import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class2_Sub13 extends Class2 {

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "[Lclient!jd;")
	public final Class38[] aClass38Array1 = new Class38[128];

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "[S")
	public final short[] aShortArray10 = new short[128];

	@OriginalMember(owner = "client!nb", name = "A", descriptor = "[B")
	public final byte[] aByteArray29;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "[B")
	public final byte[] aByteArray30;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "[B")
	public final byte[] aByteArray31;

	@OriginalMember(owner = "client!nb", name = "P", descriptor = "[Lclient!qe;")
	public final Class2_Sub16_Sub1[] aClass2_Sub16_Sub1Array1;

	@OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
	public final int anInt2000;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([B)V")
	public Class2_Sub13(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = 0;
		this.aByteArray31 = new byte[128];
		this.aByteArray29 = new byte[128];
		this.aClass2_Sub16_Sub1Array1 = new Class2_Sub16_Sub1[128];
		this.aByteArray30 = new byte[128];
		this.anIntArray270 = new int[128];
		@Pc(38) Class2_Sub17 local38 = new Class2_Sub17(arg0);
		while (local38.aByteArray38[local13 + local38.anInt2799] != 0) {
			local13++;
		}
		@Pc(52) byte[] local52 = new byte[local13];
		for (@Pc(54) int local54 = 0; local54 < local13; local54++) {
			local52[local54] = local38.method1767();
		}
		local38.anInt2799++;
		@Pc(75) int local75 = local38.anInt2799;
		local13++;
		local38.anInt2799 += local13;
		@Pc(84) int local84;
		for (local84 = 0; local38.aByteArray38[local38.anInt2799 + local84] != 0; local84++) {
		}
		@Pc(98) byte[] local98 = new byte[local84];
		for (@Pc(100) int local100 = 0; local100 < local84; local100++) {
			local98[local100] = local38.method1767();
		}
		local84++;
		@Pc(115) int local115 = 0;
		local38.anInt2799++;
		@Pc(124) int local124 = local38.anInt2799;
		local38.anInt2799 += local84;
		while (local38.aByteArray38[local115 + local38.anInt2799] != 0) {
			local115++;
		}
		@Pc(147) byte[] local147 = new byte[local115];
		for (@Pc(149) int local149 = 0; local149 < local115; local149++) {
			local147[local149] = local38.method1767();
		}
		local38.anInt2799++;
		local115++;
		@Pc(171) byte[] local171 = new byte[local115];
		@Pc(178) int local178;
		@Pc(190) int local190;
		@Pc(196) int local196;
		if (local115 <= 1) {
			local178 = local115;
		} else {
			local178 = 2;
			local171[1] = 1;
			@Pc(188) int local188 = 1;
			for (local190 = 2; local190 < local115; local190++) {
				local196 = local38.method1780();
				if (local196 == 0) {
					local188 = local178++;
				} else {
					if (local188 >= local196) {
						local196--;
					}
					local188 = local196;
				}
				local171[local190] = (byte) local188;
			}
		}
		@Pc(229) Class38[] local229 = new Class38[local178];
		for (local190 = 0; local190 < local229.length; local190++) {
			@Pc(241) Class38 local241 = local229[local190] = new Class38();
			@Pc(245) int local245 = local38.method1780();
			if (local245 > 0) {
				local241.aByteArray24 = new byte[local245 * 2];
			}
			local245 = local38.method1780();
			if (local245 > 0) {
				local241.aByteArray25 = new byte[local245 * 2 + 2];
				local241.aByteArray25[1] = 64;
			}
		}
		local196 = local38.method1780();
		@Pc(297) byte[] local297 = local196 <= 0 ? null : new byte[local196 * 2];
		@Pc(299) int local299 = 0;
		local196 = local38.method1780();
		@Pc(315) byte[] local315 = local196 > 0 ? new byte[local196 * 2] : null;
		while (local38.aByteArray38[local299 + local38.anInt2799] != 0) {
			local299++;
		}
		@Pc(332) byte[] local332 = new byte[local299];
		for (@Pc(334) int local334 = 0; local334 < local299; local334++) {
			local332[local334] = local38.method1767();
		}
		local38.anInt2799++;
		@Pc(354) int local354 = 0;
		for (@Pc(356) int local356 = 0; local356 < 128; local356++) {
			local354 += local38.method1780();
			this.aShortArray10[local356] = (short) local354;
		}
		local299++;
		local354 = 0;
		for (@Pc(381) int local381 = 0; local381 < 128; local381++) {
			local354 += local38.method1780();
			this.aShortArray10[local381] = (short) (this.aShortArray10[local381] + (local354 << 8));
		}
		@Pc(408) int local408 = 0;
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		for (@Pc(414) int local414 = 0; local414 < 128; local414++) {
			if (local408 == 0) {
				if (local332.length <= local410) {
					local408 = -1;
				} else {
					local408 = local332[local410++];
				}
				local412 = local38.method1761();
			}
			local408--;
			this.aShortArray10[local414] = (short) (this.aShortArray10[local414] + ((local412 - 1 & 0x2) << 14));
			this.anIntArray270[local414] = local412;
		}
		local408 = 0;
		local410 = 0;
		@Pc(466) int local466 = 0;
		for (@Pc(468) int local468 = 0; local468 < 128; local468++) {
			if (this.anIntArray270[local468] != 0) {
				if (local408 == 0) {
					local466 = local38.aByteArray38[local75++] - 1;
					if (local52.length > local410) {
						local408 = local52[local410++];
					} else {
						local408 = -1;
					}
				}
				local408--;
				this.aByteArray31[local468] = (byte) local466;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(521) int local521 = 0;
		for (@Pc(523) int local523 = 0; local523 < 128; local523++) {
			if (this.anIntArray270[local523] != 0) {
				if (local408 == 0) {
					if (local98.length > local410) {
						local408 = local98[local410++];
					} else {
						local408 = -1;
					}
					local521 = local38.aByteArray38[local124++] + 16 << 2;
				}
				this.aByteArray29[local523] = (byte) local521;
				local408--;
			}
		}
		local408 = 0;
		local410 = 0;
		@Pc(584) Class38 local584 = null;
		for (@Pc(586) int local586 = 0; local586 < 128; local586++) {
			if (this.anIntArray270[local586] != 0) {
				if (local408 == 0) {
					local584 = local229[local171[local410]];
					if (local147.length > local410) {
						local408 = local147[local410++];
					} else {
						local408 = -1;
					}
				}
				this.aClass38Array1[local586] = local584;
				local408--;
			}
		}
		local408 = 0;
		@Pc(633) int local633 = 0;
		local410 = 0;
		for (@Pc(637) int local637 = 0; local637 < 128; local637++) {
			if (local408 == 0) {
				if (local332.length > local410) {
					local408 = local332[local410++];
				} else {
					local408 = -1;
				}
				if (this.anIntArray270[local637] > 0) {
					local633 = local38.method1780() + 1;
				}
			}
			this.aByteArray30[local637] = (byte) local633;
			local408--;
		}
		this.anInt2000 = local38.method1780() + 1;
		@Pc(701) int local701;
		for (@Pc(690) int local690 = 0; local690 < local178; local690++) {
			@Pc(696) Class38 local696 = local229[local690];
			if (local696.aByteArray24 != null) {
				for (local701 = 1; local701 < local696.aByteArray24.length; local701 += 2) {
					local696.aByteArray24[local701] = local38.method1767();
				}
			}
			if (local696.aByteArray25 != null) {
				for (local701 = 3; local701 < local696.aByteArray25.length - 2; local701 += 2) {
					local696.aByteArray25[local701] = local38.method1767();
				}
			}
		}
		@Pc(750) int local750;
		if (local297 != null) {
			for (local750 = 1; local750 < local297.length; local750 += 2) {
				local297[local750] = local38.method1767();
			}
		}
		if (local315 != null) {
			for (local750 = 1; local750 < local315.length; local750 += 2) {
				local315[local750] = local38.method1767();
			}
		}
		@Pc(799) int local799;
		for (local750 = 0; local750 < local178; local750++) {
			@Pc(792) Class38 local792 = local229[local750];
			if (local792.aByteArray25 != null) {
				local354 = 0;
				for (local799 = 2; local799 < local792.aByteArray25.length; local799 += 2) {
					local354 = local38.method1780() + local354 + 1;
					local792.aByteArray25[local799] = (byte) local354;
				}
			}
		}
		@Pc(840) int local840;
		for (local701 = 0; local701 < local178; local701++) {
			@Pc(833) Class38 local833 = local229[local701];
			if (local833.aByteArray24 != null) {
				local354 = 0;
				for (local840 = 2; local840 < local833.aByteArray24.length; local840 += 2) {
					local354 = local38.method1780() + local354 + 1;
					local833.aByteArray24[local840] = (byte) local354;
				}
			}
		}
		@Pc(913) int local913;
		@Pc(936) int local936;
		@Pc(942) byte local942;
		@Pc(962) int local962;
		@Pc(964) int local964;
		@Pc(974) int local974;
		@Pc(911) byte local911;
		@Pc(1013) int local1013;
		if (local297 != null) {
			local354 = local38.method1780();
			local297[0] = (byte) local354;
			for (local799 = 2; local799 < local297.length; local799 += 2) {
				local354 += local38.method1780() + 1;
				local297[local799] = (byte) local354;
			}
			@Pc(907) byte local907 = local297[1];
			local911 = local297[0];
			for (local913 = 0; local913 < local911; local913++) {
				this.aByteArray30[local913] = (byte) (this.aByteArray30[local913] * local907 + 32 >> 6);
			}
			for (local936 = 2; local936 < local297.length; local936 += 2) {
				local942 = local297[local936];
				@Pc(948) byte local948 = local297[local936 + 1];
				local962 = (local942 - local911) / 2 + local907 * (local942 - local911);
				for (local964 = local911; local964 < local942; local964++) {
					local974 = Static112.method1854(local962, local942 - local911);
					local962 += local948 - local907;
					this.aByteArray30[local964] = (byte) (this.aByteArray30[local964] * local974 + 32 >> 6);
				}
				local911 = local942;
				local907 = local948;
			}
			for (local1013 = local911; local1013 < 128; local1013++) {
				this.aByteArray30[local1013] = (byte) (this.aByteArray30[local1013] * local907 + 32 >> 6);
			}
		}
		@Pc(1081) int local1081;
		if (local315 != null) {
			local354 = local38.method1780();
			local315[0] = (byte) local354;
			for (local799 = 2; local799 < local315.length; local799 += 2) {
				local354 = local38.method1780() + local354 + 1;
				local315[local799] = (byte) local354;
			}
			local911 = local315[0];
			local1081 = local315[1] << 1;
			for (local913 = 0; local913 < local911; local913++) {
				local936 = (this.aByteArray29[local913] & 0xFF) + local1081;
				if (local936 < 0) {
					local936 = 0;
				}
				if (local936 > 128) {
					local936 = 128;
				}
				this.aByteArray29[local913] = (byte) local936;
			}
			local936 = 2;
			@Pc(1146) int local1146;
			while (local315.length > local936) {
				local942 = local315[local936];
				local962 = local1081 * (local942 - local911) + (local942 - local911) / 2;
				local1146 = local315[local936 + 1] << 1;
				local936 += 2;
				for (local964 = local911; local964 < local942; local964++) {
					local974 = Static112.method1854(local962, local942 - local911);
					@Pc(1167) int local1167 = (this.aByteArray29[local964] & 0xFF) + local974;
					local962 += local1146 - local1081;
					if (local1167 < 0) {
						local1167 = 0;
					}
					if (local1167 > 128) {
						local1167 = 128;
					}
					this.aByteArray29[local964] = (byte) local1167;
				}
				local1081 = local1146;
				local911 = local942;
			}
			for (local1013 = local911; local1013 < 128; local1013++) {
				local1146 = (this.aByteArray29[local1013] & 0xFF) + local1081;
				if (local1146 < 0) {
					local1146 = 0;
				}
				if (local1146 > 128) {
					local1146 = 128;
				}
				this.aByteArray29[local1013] = (byte) local1146;
			}
		}
		for (local799 = 0; local799 < local178; local799++) {
			local229[local799].anInt1730 = local38.method1780();
		}
		for (local840 = 0; local840 < local178; local840++) {
			@Pc(1270) Class38 local1270 = local229[local840];
			if (local1270.aByteArray24 != null) {
				local1270.anInt1742 = local38.method1780();
			}
			if (local1270.aByteArray25 != null) {
				local1270.anInt1728 = local38.method1780();
			}
			if (local1270.anInt1730 > 0) {
				local1270.anInt1743 = local38.method1780();
			}
		}
		for (local1081 = 0; local1081 < local178; local1081++) {
			local229[local1081].anInt1727 = local38.method1780();
		}
		for (local913 = 0; local913 < local178; local913++) {
			@Pc(1321) Class38 local1321 = local229[local913];
			if (local1321.anInt1727 > 0) {
				local1321.anInt1733 = local38.method1780();
			}
		}
		for (local936 = 0; local936 < local178; local936++) {
			@Pc(1348) Class38 local1348 = local229[local936];
			if (local1348.anInt1733 > 0) {
				local1348.anInt1729 = local38.method1780();
			}
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([II[BLclient!ob;)Z")
	public boolean method1210(@OriginalArg(0) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class55 arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(9) Class2_Sub16_Sub1 local9 = null;
		@Pc(11) int local11 = 0;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg1 == null || arg1[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray270[local18];
				if (local33 != 0) {
					if (local33 != local11) {
						local11 = local33--;
						if ((local33 & 0x1) == 0) {
							local9 = arg2.method1253(arg0, local33 >> 2);
						} else {
							local9 = arg2.method1254(arg0, local33 >> 2);
						}
						if (local9 == null) {
							local3 = false;
						}
					}
					if (local9 != null) {
						this.aClass2_Sub16_Sub1Array1[local18] = local9;
						this.anIntArray270[local18] = 0;
					}
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public void method1211() {
		this.anIntArray270 = null;
	}
}
