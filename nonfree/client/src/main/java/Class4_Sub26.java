import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class4_Sub26 extends Class4 {

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "[Lclient!gl;")
	public Class4_Sub15_Sub1[] aClass4_Sub15_Sub1Array1 = new Class4_Sub15_Sub1[128];

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "[I")
	private int[] anIntArray301 = new int[128];

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "[B")
	public byte[] aByteArray38 = new byte[128];

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
	public int anInt3588;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "[B")
	public byte[] aByteArray39 = new byte[128];

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "[B")
	public byte[] aByteArray40 = new byte[128];

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "[Lclient!of;")
	public Class122[] aClass122Array1 = new Class122[128];

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "[S")
	public short[] aShortArray34 = new short[128];

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "([B)V")
	public Class4_Sub26(@OriginalArg(0) byte[] arg0) {
		@Pc(36) Class4_Sub17 local36 = new Class4_Sub17(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray30[local38 + local36.anInt2400] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		@Pc(57) int local57;
		for (local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method1892();
		}
		local36.anInt2400++;
		local38++;
		local57 = local36.anInt2400;
		@Pc(81) int local81 = 0;
		local36.anInt2400 += local38;
		while (local36.aByteArray30[local36.anInt2400 + local81] != 0) {
			local81++;
		}
		@Pc(104) byte[] local104 = new byte[local81];
		@Pc(106) int local106;
		for (local106 = 0; local106 < local81; local106++) {
			local104[local106] = local36.method1892();
		}
		local81++;
		@Pc(125) int local125 = 0;
		local36.anInt2400++;
		local106 = local36.anInt2400;
		local36.anInt2400 += local81;
		while (local36.aByteArray30[local125 + local36.anInt2400] != 0) {
			local125++;
		}
		@Pc(157) byte[] local157 = new byte[local125];
		for (@Pc(159) int local159 = 0; local159 < local125; local159++) {
			local157[local159] = local36.method1892();
		}
		local125++;
		local36.anInt2400++;
		@Pc(181) byte[] local181 = new byte[local125];
		@Pc(186) int local186;
		@Pc(198) int local198;
		if (local125 <= 1) {
			local186 = local125;
		} else {
			@Pc(190) int local190 = 1;
			local181[1] = 1;
			local186 = 2;
			for (local198 = 2; local198 < local125; local198++) {
				@Pc(209) int local209 = local36.method1874();
				if (local209 == 0) {
					local190 = local186++;
				} else {
					if (local209 <= local190) {
						local209--;
					}
					local190 = local209;
				}
				local181[local198] = (byte) local190;
			}
		}
		@Pc(240) Class122[] local240 = new Class122[local186];
		for (local198 = 0; local198 < local240.length; local198++) {
			@Pc(254) Class122 local254 = local240[local198] = new Class122();
			@Pc(258) int local258 = local36.method1874();
			if (local258 > 0) {
				local254.aByteArray45 = new byte[local258 * 2];
			}
			local258 = local36.method1874();
			if (local258 > 0) {
				local254.aByteArray44 = new byte[local258 * 2 + 2];
				local254.aByteArray44[1] = 64;
			}
		}
		local198 = local36.method1874();
		@Pc(307) byte[] local307 = local198 > 0 ? new byte[local198 * 2] : null;
		local198 = local36.method1874();
		@Pc(320) byte[] local320 = local198 <= 0 ? null : new byte[local198 * 2];
		@Pc(322) int local322;
		for (local322 = 0; local36.aByteArray30[local322 + local36.anInt2400] != 0; local322++) {
		}
		@Pc(339) byte[] local339 = new byte[local322];
		@Pc(341) int local341;
		for (local341 = 0; local341 < local322; local341++) {
			local339[local341] = local36.method1892();
		}
		local36.anInt2400++;
		local322++;
		local341 = 0;
		@Pc(368) int local368;
		for (local368 = 0; local368 < 128; local368++) {
			local341 += local36.method1874();
			this.aShortArray34[local368] = (short) local341;
		}
		local341 = 0;
		for (local368 = 0; local368 < 128; local368++) {
			local341 += local36.method1874();
			this.aShortArray34[local368] = (short) (this.aShortArray34[local368] + (local341 << 8));
		}
		local368 = 0;
		@Pc(419) int local419 = 0;
		@Pc(421) int local421 = 0;
		@Pc(423) int local423;
		for (local423 = 0; local423 < 128; local423++) {
			if (local368 == 0) {
				if (local339.length > local421) {
					local368 = local339[local421++];
				} else {
					local368 = -1;
				}
				local419 = local36.method1885();
			}
			this.aShortArray34[local423] = (short) (this.aShortArray34[local423] + ((local419 - 1 & 0x2) << 14));
			local368--;
			this.anIntArray301[local423] = local419;
		}
		local368 = 0;
		local421 = 0;
		local423 = 0;
		@Pc(485) int local485;
		for (local485 = 0; local485 < 128; local485++) {
			if (this.anIntArray301[local485] != 0) {
				if (local368 == 0) {
					local423 = local36.aByteArray30[local57++] - 1;
					if (local55.length > local421) {
						local368 = local55[local421++];
					} else {
						local368 = -1;
					}
				}
				this.aByteArray38[local485] = (byte) local423;
				local368--;
			}
		}
		local368 = 0;
		local421 = 0;
		local485 = 0;
		for (@Pc(544) int local544 = 0; local544 < 128; local544++) {
			if (this.anIntArray301[local544] != 0) {
				if (local368 == 0) {
					local485 = local36.aByteArray30[local106++] + 16 << 2;
					if (local421 < local104.length) {
						local368 = local104[local421++];
					} else {
						local368 = -1;
					}
				}
				this.aByteArray40[local544] = (byte) local485;
				local368--;
			}
		}
		local368 = 0;
		@Pc(605) Class122 local605 = null;
		local421 = 0;
		@Pc(609) int local609;
		for (local609 = 0; local609 < 128; local609++) {
			if (this.anIntArray301[local609] != 0) {
				if (local368 == 0) {
					local605 = local240[local181[local421]];
					if (local157.length <= local421) {
						local368 = -1;
					} else {
						local368 = local157[local421++];
					}
				}
				this.aClass122Array1[local609] = local605;
				local368--;
			}
		}
		local368 = 0;
		local421 = 0;
		local609 = 0;
		@Pc(666) int local666;
		for (local666 = 0; local666 < 128; local666++) {
			if (local368 == 0) {
				if (local421 >= local339.length) {
					local368 = -1;
				} else {
					local368 = local339[local421++];
				}
				if (this.anIntArray301[local666] > 0) {
					local609 = local36.method1874() + 1;
				}
			}
			this.aByteArray39[local666] = (byte) local609;
			local368--;
		}
		this.anInt3588 = local36.method1874() + 1;
		@Pc(735) Class122 local735;
		@Pc(740) int local740;
		for (local666 = 0; local666 < local186; local666++) {
			local735 = local240[local666];
			if (local735.aByteArray45 != null) {
				for (local740 = 1; local740 < local735.aByteArray45.length; local740 += 2) {
					local735.aByteArray45[local740] = local36.method1892();
				}
			}
			if (local735.aByteArray44 != null) {
				for (local740 = 3; local740 < local735.aByteArray44.length - 2; local740 += 2) {
					local735.aByteArray44[local740] = local36.method1892();
				}
			}
		}
		if (local307 != null) {
			for (local666 = 1; local666 < local307.length; local666 += 2) {
				local307[local666] = local36.method1892();
			}
		}
		if (local320 != null) {
			for (local666 = 1; local666 < local320.length; local666 += 2) {
				local320[local666] = local36.method1892();
			}
		}
		for (local666 = 0; local666 < local186; local666++) {
			local735 = local240[local666];
			if (local735.aByteArray44 != null) {
				local341 = 0;
				for (local740 = 2; local740 < local735.aByteArray44.length; local740 += 2) {
					local341 = local341 + local36.method1874() + 1;
					local735.aByteArray44[local740] = (byte) local341;
				}
			}
		}
		for (local666 = 0; local666 < local186; local666++) {
			local735 = local240[local666];
			if (local735.aByteArray45 != null) {
				local341 = 0;
				for (local740 = 2; local740 < local735.aByteArray45.length; local740 += 2) {
					local341 = local36.method1874() + local341 + 1;
					local735.aByteArray45[local740] = (byte) local341;
				}
			}
		}
		@Pc(1003) byte local1003;
		@Pc(1022) int local1022;
		@Pc(1025) int local1025;
		@Pc(1040) int local1040;
		@Pc(1073) int local1073;
		@Pc(958) byte local958;
		if (local307 != null) {
			local341 = local36.method1874();
			local307[0] = (byte) local341;
			for (local666 = 2; local666 < local307.length; local666 += 2) {
				local341 = local36.method1874() + local341 + 1;
				local307[local666] = (byte) local341;
			}
			local958 = local307[0];
			@Pc(962) byte local962 = local307[1];
			for (local740 = 0; local740 < local958; local740++) {
				this.aByteArray39[local740] = (byte) (local962 * this.aByteArray39[local740] + 32 >> 6);
			}
			local740 = 2;
			while (local740 < local307.length) {
				local1003 = local307[local740];
				@Pc(1009) byte local1009 = local307[local740 + 1];
				local1022 = local962 * (local1003 - local958) + (local1003 - local958) / 2;
				local740 += 2;
				for (local1025 = local958; local1025 < local1003; local1025++) {
					local1040 = Static16.method277(local1022, local1003 - local958);
					local1022 += local1009 - local962;
					this.aByteArray39[local1025] = (byte) (this.aByteArray39[local1025] * local1040 + 32 >> 6);
				}
				local962 = local1009;
				local958 = local1003;
			}
			for (local1073 = local958; local1073 < 128; local1073++) {
				this.aByteArray39[local1073] = (byte) (this.aByteArray39[local1073] * local962 + 32 >> 6);
			}
		}
		if (local320 != null) {
			local341 = local36.method1874();
			local320[0] = (byte) local341;
			for (local666 = 2; local666 < local320.length; local666 += 2) {
				local341 = local36.method1874() + local341 + 1;
				local320[local666] = (byte) local341;
			}
			local958 = local320[0];
			@Pc(1140) int local1140 = local320[1] << 1;
			for (local740 = 0; local740 < local958; local740++) {
				local1073 = (this.aByteArray40[local740] & 0xFF) + local1140;
				if (local1073 < 0) {
					local1073 = 0;
				}
				if (local1073 > 128) {
					local1073 = 128;
				}
				this.aByteArray40[local740] = (byte) local1073;
			}
			local740 = 2;
			@Pc(1211) int local1211;
			while (local740 < local320.length) {
				local1003 = local320[local740];
				local1022 = (local1003 - local958) * local1140 + (local1003 - local958) / 2;
				local1211 = local320[local740 + 1] << 1;
				local740 += 2;
				for (local1025 = local958; local1025 < local1003; local1025++) {
					local1040 = Static16.method277(local1022, local1003 - local958);
					@Pc(1238) int local1238 = (this.aByteArray40[local1025] & 0xFF) + local1040;
					local1022 += local1211 - local1140;
					if (local1238 < 0) {
						local1238 = 0;
					}
					if (local1238 > 128) {
						local1238 = 128;
					}
					this.aByteArray40[local1025] = (byte) local1238;
				}
				local958 = local1003;
				local1140 = local1211;
			}
			for (local1073 = local958; local1073 < 128; local1073++) {
				local1211 = (this.aByteArray40[local1073] & 0xFF) + local1140;
				if (local1211 < 0) {
					local1211 = 0;
				}
				if (local1211 > 128) {
					local1211 = 128;
				}
				this.aByteArray40[local1073] = (byte) local1211;
			}
		}
		for (local666 = 0; local666 < local186; local666++) {
			local240[local666].anInt3780 = local36.method1874();
		}
		for (local666 = 0; local666 < local186; local666++) {
			local735 = local240[local666];
			if (local735.aByteArray45 != null) {
				local735.anInt3789 = local36.method1874();
			}
			if (local735.aByteArray44 != null) {
				local735.anInt3782 = local36.method1874();
			}
			if (local735.anInt3780 > 0) {
				local735.anInt3787 = local36.method1874();
			}
		}
		for (local666 = 0; local666 < local186; local666++) {
			local240[local666].anInt3781 = local36.method1874();
		}
		for (local666 = 0; local666 < local186; local666++) {
			local735 = local240[local666];
			if (local735.anInt3781 > 0) {
				local735.anInt3784 = local36.method1874();
			}
		}
		for (local666 = 0; local666 < local186; local666++) {
			local735 = local240[local666];
			if (local735.anInt3784 > 0) {
				local735.anInt3788 = local36.method1874();
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V")
	public void method2859() {
		this.anIntArray301 = null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I[B[ILclient!ll;)Z")
	public boolean method2861(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class102 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(9) int local9 = 0;
		@Pc(11) Class4_Sub15_Sub1 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			if (arg0 == null || arg0[local13] != 0) {
				@Pc(32) int local32 = this.anIntArray301[local13];
				if (local32 != 0) {
					if (local32 != local9) {
						local9 = local32--;
						if ((local32 & 0x1) == 0) {
							local11 = arg2.method2480(local32 >> 2, arg1);
						} else {
							local11 = arg2.method2482(local32 >> 2, arg1);
						}
						if (local11 == null) {
							local7 = false;
						}
					}
					if (local11 != null) {
						this.aClass4_Sub15_Sub1Array1[local13] = local11;
						this.anIntArray301[local13] = 0;
					}
				}
			}
		}
		return local7;
	}
}
