import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class6_Sub22 extends Class6 {

	@OriginalMember(owner = "client!hea", name = "n", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!hea", name = "i", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!hea", name = "u", descriptor = "[Lclient!vfa;")
	public Class6_Sub54_Sub1[] aClass6_Sub54_Sub1Array1;

	@OriginalMember(owner = "client!hea", name = "q", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!hea", name = "k", descriptor = "[S")
	public short[] aShortArray47;

	@OriginalMember(owner = "client!hea", name = "j", descriptor = "[Lclient!q;")
	public Class293[] aClass293Array1;

	@OriginalMember(owner = "client!hea", name = "v", descriptor = "I")
	public int anInt4347;

	@OriginalMember(owner = "client!hea", name = "s", descriptor = "[I")
	private int[] anIntArray220;

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V")
	private Class6_Sub22() {
	}

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "([B)V")
	public Class6_Sub22(@OriginalArg(0) byte[] arg0) {
		this.anIntArray220 = new int[128];
		this.aByteArray31 = new byte[128];
		this.aClass6_Sub54_Sub1Array1 = new Class6_Sub54_Sub1[128];
		this.aClass293Array1 = new Class293[128];
		this.aByteArray30 = new byte[128];
		this.aShortArray47 = new short[128];
		this.aByteArray32 = new byte[128];
		@Pc(36) Class6_Sub15 local36 = new Class6_Sub15(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray20[local36.anInt3174 + local38] != 0; local38++) {
		}
		@Pc(54) byte[] local54 = new byte[local38];
		for (@Pc(56) int local56 = 0; local56 < local38; local56++) {
			local54[local56] = local36.method3027();
		}
		local36.anInt3174++;
		local38++;
		@Pc(80) int local80 = local36.anInt3174;
		local36.anInt3174 += local38;
		@Pc(88) int local88;
		for (local88 = 0; local36.aByteArray20[local88 + local36.anInt3174] != 0; local88++) {
		}
		@Pc(109) byte[] local109 = new byte[local88];
		for (@Pc(111) int local111 = 0; local111 < local88; local111++) {
			local109[local111] = local36.method3027();
		}
		local88++;
		local36.anInt3174++;
		@Pc(135) int local135 = local36.anInt3174;
		local36.anInt3174 += local88;
		@Pc(143) int local143;
		for (local143 = 0; local36.aByteArray20[local143 + local36.anInt3174] != 0; local143++) {
		}
		@Pc(164) byte[] local164 = new byte[local143];
		for (@Pc(166) int local166 = 0; local166 < local143; local166++) {
			local164[local166] = local36.method3027();
		}
		local36.anInt3174++;
		local143++;
		@Pc(190) byte[] local190 = new byte[local143];
		@Pc(199) int local199;
		@Pc(211) int local211;
		@Pc(217) int local217;
		if (local143 <= 1) {
			local199 = local143;
		} else {
			local190[1] = 1;
			@Pc(207) int local207 = 1;
			local199 = 2;
			for (local211 = 2; local211 < local143; local211++) {
				local217 = local36.method3030();
				if (local217 == 0) {
					local207 = local199++;
				} else {
					if (local207 >= local217) {
						local217--;
					}
					local207 = local217;
				}
				local190[local211] = (byte) local207;
			}
		}
		@Pc(253) Class293[] local253 = new Class293[local199];
		for (local211 = 0; local211 < local253.length; local211++) {
			@Pc(265) Class293 local265 = local253[local211] = new Class293();
			@Pc(269) int local269 = local36.method3030();
			if (local269 > 0) {
				local265.aByteArray83 = new byte[local269 * 2];
			}
			local269 = local36.method3030();
			if (local269 > 0) {
				local265.aByteArray82 = new byte[local269 * 2 + 2];
				local265.aByteArray82[1] = 64;
			}
		}
		local217 = local36.method3030();
		@Pc(322) byte[] local322 = local217 <= 0 ? null : new byte[local217 * 2];
		local217 = local36.method3030();
		@Pc(339) byte[] local339 = local217 <= 0 ? null : new byte[local217 * 2];
		@Pc(341) int local341;
		for (local341 = 0; local36.aByteArray20[local36.anInt3174 + local341] != 0; local341++) {
		}
		@Pc(357) byte[] local357 = new byte[local341];
		for (@Pc(359) int local359 = 0; local359 < local341; local359++) {
			local357[local359] = local36.method3027();
		}
		local341++;
		local36.anInt3174++;
		@Pc(382) int local382 = 0;
		for (@Pc(384) int local384 = 0; local384 < 128; local384++) {
			local382 += local36.method3030();
			this.aShortArray47[local384] = (short) local382;
		}
		local382 = 0;
		for (@Pc(408) int local408 = 0; local408 < 128; local408++) {
			local382 += local36.method3030();
			this.aShortArray47[local408] = (short) (this.aShortArray47[local408] + (local382 << 8));
		}
		@Pc(435) int local435 = 0;
		@Pc(437) int local437 = 0;
		@Pc(439) int local439 = 0;
		for (@Pc(441) int local441 = 0; local441 < 128; local441++) {
			if (local435 == 0) {
				if (local357.length <= local437) {
					local435 = -1;
				} else {
					local435 = local357[local437++];
				}
				local439 = local36.method3041();
			}
			this.aShortArray47[local441] = (short) (this.aShortArray47[local441] + ((local439 - 1 & 0x2) << 14));
			this.anIntArray220[local441] = local439;
			local435--;
		}
		local435 = 0;
		local437 = 0;
		@Pc(508) int local508 = 0;
		for (@Pc(510) int local510 = 0; local510 < 128; local510++) {
			if (this.anIntArray220[local510] != 0) {
				if (local435 == 0) {
					if (local437 >= local54.length) {
						local435 = -1;
					} else {
						local435 = local54[local437++];
					}
					local508 = local36.aByteArray20[local80++] - 1;
				}
				this.aByteArray32[local510] = (byte) local508;
				local435--;
			}
		}
		local437 = 0;
		local435 = 0;
		@Pc(574) int local574 = 0;
		for (@Pc(576) int local576 = 0; local576 < 128; local576++) {
			if (this.anIntArray220[local576] != 0) {
				if (local435 == 0) {
					if (local109.length <= local437) {
						local435 = -1;
					} else {
						local435 = local109[local437++];
					}
					local574 = local36.aByteArray20[local135++] + 16 << 2;
				}
				this.aByteArray31[local576] = (byte) local574;
				local435--;
			}
		}
		local437 = 0;
		local435 = 0;
		@Pc(638) Class293 local638 = null;
		for (@Pc(640) int local640 = 0; local640 < 128; local640++) {
			if (this.anIntArray220[local640] != 0) {
				if (local435 == 0) {
					local638 = local253[local190[local437]];
					if (local437 < local164.length) {
						local435 = local164[local437++];
					} else {
						local435 = -1;
					}
				}
				this.aClass293Array1[local640] = local638;
				local435--;
			}
		}
		local435 = 0;
		local437 = 0;
		@Pc(694) int local694 = 0;
		for (@Pc(696) int local696 = 0; local696 < 128; local696++) {
			if (local435 == 0) {
				if (local437 < local357.length) {
					local435 = local357[local437++];
				} else {
					local435 = -1;
				}
				if (this.anIntArray220[local696] > 0) {
					local694 = local36.method3030() + 1;
				}
			}
			this.aByteArray30[local696] = (byte) local694;
			local435--;
		}
		this.anInt4347 = local36.method3030() + 1;
		@Pc(770) int local770;
		for (@Pc(757) int local757 = 0; local757 < local199; local757++) {
			@Pc(765) Class293 local765 = local253[local757];
			if (local765.aByteArray83 != null) {
				for (local770 = 1; local770 < local765.aByteArray83.length; local770 += 2) {
					local765.aByteArray83[local770] = local36.method3027();
				}
			}
			if (local765.aByteArray82 != null) {
				for (local770 = 3; local770 < local765.aByteArray82.length - 2; local770 += 2) {
					local765.aByteArray82[local770] = local36.method3027();
				}
			}
		}
		@Pc(833) int local833;
		if (local322 != null) {
			for (local833 = 1; local833 < local322.length; local833 += 2) {
				local322[local833] = local36.method3027();
			}
		}
		if (local339 != null) {
			for (local833 = 1; local833 < local339.length; local833 += 2) {
				local339[local833] = local36.method3027();
			}
		}
		@Pc(892) int local892;
		for (local833 = 0; local833 < local199; local833++) {
			@Pc(885) Class293 local885 = local253[local833];
			if (local885.aByteArray82 != null) {
				local382 = 0;
				for (local892 = 2; local892 < local885.aByteArray82.length; local892 += 2) {
					local382 = local36.method3030() + local382 + 1;
					local885.aByteArray82[local892] = (byte) local382;
				}
			}
		}
		@Pc(943) int local943;
		for (local770 = 0; local770 < local199; local770++) {
			@Pc(936) Class293 local936 = local253[local770];
			if (local936.aByteArray83 != null) {
				local382 = 0;
				for (local943 = 2; local943 < local936.aByteArray83.length; local943 += 2) {
					local382 = local382 + local36.method3030() + 1;
					local936.aByteArray83[local943] = (byte) local382;
				}
			}
		}
		@Pc(1017) int local1017;
		@Pc(1048) int local1048;
		@Pc(1056) byte local1056;
		@Pc(1076) int local1076;
		@Pc(1078) int local1078;
		@Pc(1090) int local1090;
		@Pc(1011) byte local1011;
		@Pc(1135) int local1135;
		if (local322 != null) {
			local382 = local36.method3030();
			local322[0] = (byte) local382;
			for (local892 = 2; local892 < local322.length; local892 += 2) {
				local382 = local36.method3030() + local382 + 1;
				local322[local892] = (byte) local382;
			}
			local1011 = local322[0];
			@Pc(1015) byte local1015 = local322[1];
			for (local1017 = 0; local1017 < local1011; local1017++) {
				this.aByteArray30[local1017] = (byte) (this.aByteArray30[local1017] * local1015 + 32 >> 6);
			}
			for (local1048 = 2; local1048 < local322.length; local1048 += 2) {
				local1056 = local322[local1048];
				@Pc(1062) byte local1062 = local322[local1048 + 1];
				local1076 = local1015 * (local1056 - local1011) + (local1056 - local1011) / 2;
				for (local1078 = local1011; local1078 < local1056; local1078++) {
					local1090 = Static404.method6211(local1076, local1056 - local1011);
					this.aByteArray30[local1078] = (byte) (this.aByteArray30[local1078] * local1090 + 32 >> 6);
					local1076 += local1062 - local1015;
				}
				local1015 = local1062;
				local1011 = local1056;
			}
			for (local1135 = local1011; local1135 < 128; local1135++) {
				this.aByteArray30[local1135] = (byte) (local1015 * this.aByteArray30[local1135] + 32 >> 6);
			}
		}
		@Pc(1207) int local1207;
		if (local339 != null) {
			local382 = local36.method3030();
			local339[0] = (byte) local382;
			for (local892 = 2; local892 < local339.length; local892 += 2) {
				local382 += local36.method3030() + 1;
				local339[local892] = (byte) local382;
			}
			local1011 = local339[0];
			local1207 = local339[1] << 1;
			for (local1017 = 0; local1017 < local1011; local1017++) {
				local1048 = local1207 + (this.aByteArray31[local1017] & 0xFF);
				if (local1048 < 0) {
					local1048 = 0;
				}
				if (local1048 > 128) {
					local1048 = 128;
				}
				this.aByteArray31[local1017] = (byte) local1048;
			}
			local1048 = 2;
			@Pc(1268) int local1268;
			while (local1048 < local339.length) {
				local1056 = local339[local1048];
				local1268 = local339[local1048 + 1] << 1;
				local1076 = (local1056 - local1011) / 2 + local1207 * (local1056 - local1011);
				for (local1078 = local1011; local1078 < local1056; local1078++) {
					local1090 = Static404.method6211(local1076, local1056 - local1011);
					@Pc(1304) int local1304 = (this.aByteArray31[local1078] & 0xFF) + local1090;
					if (local1304 < 0) {
						local1304 = 0;
					}
					if (local1304 > 128) {
						local1304 = 128;
					}
					local1076 += local1268 - local1207;
					this.aByteArray31[local1078] = (byte) local1304;
				}
				local1048 += 2;
				local1011 = local1056;
				local1207 = local1268;
			}
			for (local1135 = local1011; local1135 < 128; local1135++) {
				local1268 = (this.aByteArray31[local1135] & 0xFF) + local1207;
				if (local1268 < 0) {
					local1268 = 0;
				}
				if (local1268 > 128) {
					local1268 = 128;
				}
				this.aByteArray31[local1135] = (byte) local1268;
			}
		}
		for (local892 = 0; local892 < local199; local892++) {
			local253[local892].anInt8098 = local36.method3030();
		}
		for (local943 = 0; local943 < local199; local943++) {
			@Pc(1415) Class293 local1415 = local253[local943];
			if (local1415.aByteArray83 != null) {
				local1415.anInt8096 = local36.method3030();
			}
			if (local1415.aByteArray82 != null) {
				local1415.anInt8100 = local36.method3030();
			}
			if (local1415.anInt8098 > 0) {
				local1415.anInt8102 = local36.method3030();
			}
		}
		for (local1207 = 0; local1207 < local199; local1207++) {
			local253[local1207].anInt8099 = local36.method3030();
		}
		for (local1017 = 0; local1017 < local199; local1017++) {
			@Pc(1480) Class293 local1480 = local253[local1017];
			if (local1480.anInt8099 > 0) {
				local1480.anInt8094 = local36.method3030();
			}
		}
		for (local1048 = 0; local1048 < local199; local1048++) {
			@Pc(1506) Class293 local1506 = local253[local1048];
			if (local1506.anInt8094 > 0) {
				local1506.anInt8101 = local36.method3030();
			}
		}
	}

	@OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V")
	public void method4006() {
		this.anIntArray220 = null;
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "([I[BBLclient!iv;)Z")
	public boolean method4008(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class181 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(17) int local17 = 0;
		@Pc(19) Class6_Sub54_Sub1 local19 = null;
		for (@Pc(21) int local21 = 0; local21 < 128; local21++) {
			if (arg1 == null || arg1[local21] != 0) {
				@Pc(40) int local40 = this.anIntArray220[local21];
				if (local40 != 0) {
					if (local17 != local40) {
						local17 = local40--;
						if ((local40 & 0x1) == 0) {
							local19 = arg2.method4565(arg0, local40 >> 2);
						} else {
							local19 = arg2.method4562(local40 >> 2, arg0);
						}
						if (local19 == null) {
							local7 = false;
						}
					}
					if (local19 != null) {
						this.aClass6_Sub54_Sub1Array1[local21] = local19;
						this.anIntArray220[local21] = 0;
					}
				}
			}
		}
		return local7;
	}
}
