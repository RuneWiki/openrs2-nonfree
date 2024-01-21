import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!te", name = "s", descriptor = "[Lclient!ne;")
	public final Class63[] aClass63Array1 = new Class63[128];

	@OriginalMember(owner = "client!te", name = "x", descriptor = "[B")
	public final byte[] aByteArray44;

	@OriginalMember(owner = "client!te", name = "z", descriptor = "[S")
	public final short[] aShortArray48;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "[B")
	public final byte[] aByteArray45 = new byte[128];

	@OriginalMember(owner = "client!te", name = "E", descriptor = "[B")
	public final byte[] aByteArray46;

	@OriginalMember(owner = "client!te", name = "G", descriptor = "[I")
	private int[] anIntArray467;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	public final int anInt3860;

	@OriginalMember(owner = "client!te", name = "K", descriptor = "[Lclient!oc;")
	public final Class3_Sub19_Sub1[] aClass3_Sub19_Sub1Array1;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "([B)V")
	public Class3_Sub23(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = 0;
		this.aByteArray44 = new byte[128];
		this.aByteArray46 = new byte[128];
		this.aClass3_Sub19_Sub1Array1 = new Class3_Sub19_Sub1[128];
		this.anIntArray467 = new int[128];
		this.aShortArray48 = new short[128];
		@Pc(38) Class3_Sub17 local38 = new Class3_Sub17(arg0);
		while (local38.aByteArray40[local13 + local38.anInt2923] != 0) {
			local13++;
		}
		@Pc(55) byte[] local55 = new byte[local13];
		for (@Pc(57) int local57 = 0; local57 < local13; local57++) {
			local55[local57] = local38.method2123();
		}
		local13++;
		@Pc(72) int local72 = 0;
		local38.anInt2923++;
		@Pc(81) int local81 = local38.anInt2923;
		local38.anInt2923 += local13;
		while (local38.aByteArray40[local38.anInt2923 + local72] != 0) {
			local72++;
		}
		@Pc(104) byte[] local104 = new byte[local72];
		for (@Pc(106) int local106 = 0; local106 < local72; local106++) {
			local104[local106] = local38.method2123();
		}
		local38.anInt2923++;
		@Pc(131) int local131 = local38.anInt2923;
		local72++;
		local38.anInt2923 += local72;
		@Pc(140) int local140;
		for (local140 = 0; local38.aByteArray40[local140 + local38.anInt2923] != 0; local140++) {
		}
		@Pc(154) byte[] local154 = new byte[local140];
		for (@Pc(156) int local156 = 0; local156 < local140; local156++) {
			local154[local156] = local38.method2123();
		}
		local140++;
		local38.anInt2923++;
		@Pc(178) byte[] local178 = new byte[local140];
		@Pc(183) int local183;
		@Pc(195) int local195;
		@Pc(201) int local201;
		if (local140 <= 1) {
			local183 = local140;
		} else {
			local183 = 2;
			@Pc(189) int local189 = 1;
			local178[1] = 1;
			for (local195 = 2; local195 < local140; local195++) {
				local201 = local38.method2107();
				if (local201 == 0) {
					local189 = local183++;
				} else {
					if (local189 >= local201) {
						local201--;
					}
					local189 = local201;
				}
				local178[local195] = (byte) local189;
			}
		}
		@Pc(233) Class63[] local233 = new Class63[local183];
		for (local195 = 0; local195 < local233.length; local195++) {
			@Pc(245) Class63 local245 = local233[local195] = new Class63();
			@Pc(249) int local249 = local38.method2107();
			if (local249 > 0) {
				local245.aByteArray26 = new byte[local249 * 2];
			}
			local249 = local38.method2107();
			if (local249 > 0) {
				local245.aByteArray25 = new byte[local249 * 2 + 2];
				local245.aByteArray25[1] = 64;
			}
		}
		local201 = local38.method2107();
		@Pc(300) byte[] local300 = local201 <= 0 ? null : new byte[local201 * 2];
		local201 = local38.method2107();
		@Pc(316) byte[] local316 = local201 <= 0 ? null : new byte[local201 * 2];
		@Pc(318) int local318;
		for (local318 = 0; local38.aByteArray40[local318 + local38.anInt2923] != 0; local318++) {
		}
		@Pc(332) byte[] local332 = new byte[local318];
		for (@Pc(334) int local334 = 0; local334 < local318; local334++) {
			local332[local334] = local38.method2123();
		}
		local38.anInt2923++;
		@Pc(358) int local358 = 0;
		local318++;
		for (@Pc(361) int local361 = 0; local361 < 128; local361++) {
			local358 += local38.method2107();
			this.aShortArray48[local361] = (short) local358;
		}
		local358 = 0;
		for (@Pc(383) int local383 = 0; local383 < 128; local383++) {
			local358 += local38.method2107();
			this.aShortArray48[local383] = (short) (this.aShortArray48[local383] + (local358 << 8));
		}
		@Pc(410) int local410 = 0;
		@Pc(412) int local412 = 0;
		@Pc(414) int local414 = 0;
		for (@Pc(416) int local416 = 0; local416 < 128; local416++) {
			if (local410 == 0) {
				if (local332.length > local412) {
					local410 = local332[local412++];
				} else {
					local410 = -1;
				}
				local414 = local38.method2113();
			}
			local410--;
			this.aShortArray48[local416] = (short) (this.aShortArray48[local416] + ((local414 - 1 & 0x2) << 14));
			this.anIntArray467[local416] = local414;
		}
		@Pc(468) int local468 = 0;
		local410 = 0;
		local412 = 0;
		for (@Pc(474) int local474 = 0; local474 < 128; local474++) {
			if (this.anIntArray467[local474] != 0) {
				if (local410 == 0) {
					local468 = local38.aByteArray40[local81++] - 1;
					if (local412 >= local55.length) {
						local410 = -1;
					} else {
						local410 = local55[local412++];
					}
				}
				local410--;
				this.aByteArray45[local474] = (byte) local468;
			}
		}
		local412 = 0;
		local410 = 0;
		@Pc(523) int local523 = 0;
		for (@Pc(525) int local525 = 0; local525 < 128; local525++) {
			if (this.anIntArray467[local525] != 0) {
				if (local410 == 0) {
					local523 = local38.aByteArray40[local131++] + 16 << 2;
					if (local412 >= local104.length) {
						local410 = -1;
					} else {
						local410 = local104[local412++];
					}
				}
				this.aByteArray46[local525] = (byte) local523;
				local410--;
			}
		}
		local410 = 0;
		local412 = 0;
		@Pc(581) Class63 local581 = null;
		for (@Pc(583) int local583 = 0; local583 < 128; local583++) {
			if (this.anIntArray467[local583] != 0) {
				if (local410 == 0) {
					local581 = local233[local178[local412]];
					if (local412 < local154.length) {
						local410 = local154[local412++];
					} else {
						local410 = -1;
					}
				}
				this.aClass63Array1[local583] = local581;
				local410--;
			}
		}
		local412 = 0;
		@Pc(634) int local634 = 0;
		local410 = 0;
		for (@Pc(638) int local638 = 0; local638 < 128; local638++) {
			if (local410 == 0) {
				if (local332.length > local412) {
					local410 = local332[local412++];
				} else {
					local410 = -1;
				}
				if (this.anIntArray467[local638] > 0) {
					local634 = local38.method2107() + 1;
				}
			}
			local410--;
			this.aByteArray44[local638] = (byte) local634;
		}
		this.anInt3860 = local38.method2107() + 1;
		@Pc(709) int local709;
		for (@Pc(698) int local698 = 0; local698 < local183; local698++) {
			@Pc(704) Class63 local704 = local233[local698];
			if (local704.aByteArray26 != null) {
				for (local709 = 1; local709 < local704.aByteArray26.length; local709 += 2) {
					local704.aByteArray26[local709] = local38.method2123();
				}
			}
			if (local704.aByteArray25 != null) {
				for (local709 = 3; local709 < local704.aByteArray25.length - 2; local709 += 2) {
					local704.aByteArray25[local709] = local38.method2123();
				}
			}
		}
		@Pc(762) int local762;
		if (local300 != null) {
			for (local762 = 1; local762 < local300.length; local762 += 2) {
				local300[local762] = local38.method2123();
			}
		}
		if (local316 != null) {
			for (local762 = 1; local762 < local316.length; local762 += 2) {
				local316[local762] = local38.method2123();
			}
		}
		@Pc(815) int local815;
		for (local762 = 0; local762 < local183; local762++) {
			@Pc(808) Class63 local808 = local233[local762];
			if (local808.aByteArray25 != null) {
				local358 = 0;
				for (local815 = 2; local815 < local808.aByteArray25.length; local815 += 2) {
					local358 += local38.method2107() + 1;
					local808.aByteArray25[local815] = (byte) local358;
				}
			}
		}
		@Pc(860) int local860;
		for (local709 = 0; local709 < local183; local709++) {
			@Pc(853) Class63 local853 = local233[local709];
			if (local853.aByteArray26 != null) {
				local358 = 0;
				for (local860 = 2; local860 < local853.aByteArray26.length; local860 += 2) {
					local358 = local358 + local38.method2107() + 1;
					local853.aByteArray26[local860] = (byte) local358;
				}
			}
		}
		@Pc(934) int local934;
		@Pc(957) int local957;
		@Pc(963) byte local963;
		@Pc(985) int local985;
		@Pc(987) int local987;
		@Pc(997) int local997;
		@Pc(928) byte local928;
		@Pc(1033) int local1033;
		if (local300 != null) {
			local358 = local38.method2107();
			local300[0] = (byte) local358;
			for (local815 = 2; local815 < local300.length; local815 += 2) {
				local358 += local38.method2107() + 1;
				local300[local815] = (byte) local358;
			}
			local928 = local300[0];
			@Pc(932) byte local932 = local300[1];
			for (local934 = 0; local934 < local928; local934++) {
				this.aByteArray44[local934] = (byte) (local932 * this.aByteArray44[local934] + 32 >> 6);
			}
			local957 = 2;
			while (local300.length > local957) {
				local963 = local300[local957];
				@Pc(969) byte local969 = local300[local957 + 1];
				local957 += 2;
				local985 = (local963 - local928) * local932 + (local963 - local928) / 2;
				for (local987 = local928; local987 < local963; local987++) {
					local997 = Static97.method1462(local963 - local928, local985);
					this.aByteArray44[local987] = (byte) (this.aByteArray44[local987] * local997 + 32 >> 6);
					local985 += local969 - local932;
				}
				local932 = local969;
				local928 = local963;
			}
			for (local1033 = local928; local1033 < 128; local1033++) {
				this.aByteArray44[local1033] = (byte) (local932 * this.aByteArray44[local1033] + 32 >> 6);
			}
		}
		@Pc(1101) int local1101;
		if (local316 != null) {
			local358 = local38.method2107();
			local316[0] = (byte) local358;
			for (local815 = 2; local815 < local316.length; local815 += 2) {
				local358 = local38.method2107() + local358 + 1;
				local316[local815] = (byte) local358;
			}
			local928 = local316[0];
			local1101 = local316[1] << 1;
			for (local934 = 0; local934 < local928; local934++) {
				local957 = local1101 + (this.aByteArray46[local934] & 0xFF);
				if (local957 < 0) {
					local957 = 0;
				}
				if (local957 > 128) {
					local957 = 128;
				}
				this.aByteArray46[local934] = (byte) local957;
			}
			local957 = 2;
			@Pc(1151) int local1151;
			while (local957 < local316.length) {
				local963 = local316[local957];
				local1151 = local316[local957 + 1] << 1;
				local957 += 2;
				local985 = (local963 - local928) * local1101 + (local963 - local928) / 2;
				for (local987 = local928; local987 < local963; local987++) {
					local997 = Static97.method1462(local963 - local928, local985);
					local985 += local1151 - local1101;
					@Pc(1195) int local1195 = (this.aByteArray46[local987] & 0xFF) + local997;
					if (local1195 < 0) {
						local1195 = 0;
					}
					if (local1195 > 128) {
						local1195 = 128;
					}
					this.aByteArray46[local987] = (byte) local1195;
				}
				local928 = local963;
				local1101 = local1151;
			}
			for (local1033 = local928; local1033 < 128; local1033++) {
				local1151 = local1101 + (this.aByteArray46[local1033] & 0xFF);
				if (local1151 < 0) {
					local1151 = 0;
				}
				if (local1151 > 128) {
					local1151 = 128;
				}
				this.aByteArray46[local1033] = (byte) local1151;
			}
		}
		for (local815 = 0; local815 < local183; local815++) {
			local233[local815].anInt2647 = local38.method2107();
		}
		for (local860 = 0; local860 < local183; local860++) {
			@Pc(1294) Class63 local1294 = local233[local860];
			if (local1294.aByteArray26 != null) {
				local1294.anInt2655 = local38.method2107();
			}
			if (local1294.aByteArray25 != null) {
				local1294.anInt2649 = local38.method2107();
			}
			if (local1294.anInt2647 > 0) {
				local1294.anInt2657 = local38.method2107();
			}
		}
		for (local1101 = 0; local1101 < local183; local1101++) {
			local233[local1101].anInt2652 = local38.method2107();
		}
		for (local934 = 0; local934 < local183; local934++) {
			@Pc(1356) Class63 local1356 = local233[local934];
			if (local1356.anInt2652 > 0) {
				local1356.anInt2656 = local38.method2107();
			}
		}
		for (local957 = 0; local957 < local183; local957++) {
			@Pc(1376) Class63 local1376 = local233[local957];
			if (local1376.anInt2656 > 0) {
				local1376.anInt2654 = local38.method2107();
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	public void method2768() {
		this.anIntArray467 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([B[IBLclient!pb;)Z")
	public boolean method2769(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class72 arg2) {
		@Pc(8) int local8 = 0;
		@Pc(14) Class3_Sub19_Sub1 local14 = null;
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
			if (arg0 == null || arg0[local18] != 0) {
				@Pc(33) int local33 = this.anIntArray467[local18];
				if (local33 != 0) {
					if (local8 != local33) {
						local8 = local33--;
						if ((local33 & 0x1) == 0) {
							local14 = arg2.method2053(local33 >> 2, arg1);
						} else {
							local14 = arg2.method2051(local33 >> 2, arg1);
						}
						if (local14 == null) {
							local16 = false;
						}
					}
					if (local14 != null) {
						this.aClass3_Sub19_Sub1Array1[local18] = local14;
						this.anIntArray467[local18] = 0;
					}
				}
			}
		}
		return local16;
	}
}
