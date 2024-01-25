import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!hm", name = "j", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!hm", name = "l", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
	public int anInt2679;

	@OriginalMember(owner = "client!hm", name = "n", descriptor = "[S")
	public short[] aShortArray15;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "[Lclient!he;")
	public Class2_Sub22_Sub1[] aClass2_Sub22_Sub1Array1;

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "[Lclient!sd;")
	public Class221[] aClass221Array1;

	@OriginalMember(owner = "client!hm", name = "s", descriptor = "[B")
	public byte[] aByteArray21;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	private Class2_Sub23() {
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "([B)V")
	public Class2_Sub23(@OriginalArg(0) byte[] arg0) {
		this.anIntArray211 = new int[128];
		this.aShortArray15 = new short[128];
		this.aClass221Array1 = new Class221[128];
		this.aClass2_Sub22_Sub1Array1 = new Class2_Sub22_Sub1[128];
		this.aByteArray21 = new byte[128];
		this.aByteArray19 = new byte[128];
		this.aByteArray20 = new byte[128];
		@Pc(36) Class2_Sub13 local36 = new Class2_Sub13(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray52[local36.anInt4347 + local38] != 0; local38++) {
		}
		@Pc(55) byte[] local55 = new byte[local38];
		for (@Pc(57) int local57 = 0; local57 < local38; local57++) {
			local55[local57] = local36.method3605();
		}
		local38++;
		local36.anInt4347++;
		@Pc(79) int local79 = local36.anInt4347;
		local36.anInt4347 += local38;
		@Pc(87) int local87;
		for (local87 = 0; local36.aByteArray52[local87 + local36.anInt4347] != 0; local87++) {
		}
		@Pc(104) byte[] local104 = new byte[local87];
		for (@Pc(106) int local106 = 0; local106 < local87; local106++) {
			local104[local106] = local36.method3605();
		}
		local87++;
		local36.anInt4347++;
		@Pc(132) int local132 = local36.anInt4347;
		local36.anInt4347 += local87;
		@Pc(140) int local140;
		for (local140 = 0; local36.aByteArray52[local140 + local36.anInt4347] != 0; local140++) {
		}
		@Pc(157) byte[] local157 = new byte[local140];
		for (@Pc(159) int local159 = 0; local159 < local140; local159++) {
			local157[local159] = local36.method3605();
		}
		local36.anInt4347++;
		local140++;
		@Pc(181) byte[] local181 = new byte[local140];
		@Pc(186) int local186;
		@Pc(198) int local198;
		@Pc(204) int local204;
		if (local140 <= 1) {
			local186 = local140;
		} else {
			local181[1] = 1;
			@Pc(194) int local194 = 1;
			local186 = 2;
			for (local198 = 2; local198 < local140; local198++) {
				local204 = local36.method3580();
				if (local204 == 0) {
					local194 = local186++;
				} else {
					if (local204 <= local194) {
						local204--;
					}
					local194 = local204;
				}
				local181[local198] = (byte) local194;
			}
		}
		@Pc(236) Class221[] local236 = new Class221[local186];
		for (local198 = 0; local198 < local236.length; local198++) {
			@Pc(248) Class221 local248 = local236[local198] = new Class221();
			@Pc(252) int local252 = local36.method3580();
			if (local252 > 0) {
				local248.aByteArray77 = new byte[local252 * 2];
			}
			local252 = local36.method3580();
			if (local252 > 0) {
				local248.aByteArray78 = new byte[local252 * 2 + 2];
				local248.aByteArray78[1] = 64;
			}
		}
		local204 = local36.method3580();
		@Pc(301) byte[] local301 = local204 > 0 ? new byte[local204 * 2] : null;
		local204 = local36.method3580();
		@Pc(314) byte[] local314 = local204 > 0 ? new byte[local204 * 2] : null;
		@Pc(316) int local316;
		for (local316 = 0; local36.aByteArray52[local316 + local36.anInt4347] != 0; local316++) {
		}
		@Pc(333) byte[] local333 = new byte[local316];
		for (@Pc(335) int local335 = 0; local335 < local316; local335++) {
			local333[local335] = local36.method3605();
		}
		local36.anInt4347++;
		local316++;
		@Pc(356) int local356 = 0;
		for (@Pc(358) int local358 = 0; local358 < 128; local358++) {
			local356 += local36.method3580();
			this.aShortArray15[local358] = (short) local356;
		}
		local356 = 0;
		for (@Pc(380) int local380 = 0; local380 < 128; local380++) {
			local356 += local36.method3580();
			this.aShortArray15[local380] = (short) (this.aShortArray15[local380] + (local356 << 8));
		}
		@Pc(407) int local407 = 0;
		@Pc(409) int local409 = 0;
		@Pc(411) int local411 = 0;
		for (@Pc(413) int local413 = 0; local413 < 128; local413++) {
			if (local407 == 0) {
				if (local409 < local333.length) {
					local407 = local333[local409++];
				} else {
					local407 = -1;
				}
				local411 = local36.method3571();
			}
			this.aShortArray15[local413] = (short) (this.aShortArray15[local413] + ((local411 - 1 & 0x2) << 14));
			local407--;
			this.anIntArray211[local413] = local411;
		}
		local407 = 0;
		local409 = 0;
		@Pc(471) int local471 = 0;
		for (@Pc(473) int local473 = 0; local473 < 128; local473++) {
			if (this.anIntArray211[local473] != 0) {
				if (local407 == 0) {
					if (local409 < local55.length) {
						local407 = local55[local409++];
					} else {
						local407 = -1;
					}
					local471 = local36.aByteArray52[local79++] - 1;
				}
				local407--;
				this.aByteArray19[local473] = (byte) local471;
			}
		}
		local407 = 0;
		local409 = 0;
		@Pc(523) int local523 = 0;
		for (@Pc(525) int local525 = 0; local525 < 128; local525++) {
			if (this.anIntArray211[local525] != 0) {
				if (local407 == 0) {
					if (local104.length <= local409) {
						local407 = -1;
					} else {
						local407 = local104[local409++];
					}
					local523 = local36.aByteArray52[local132++] + 16 << 2;
				}
				local407--;
				this.aByteArray20[local525] = (byte) local523;
			}
		}
		local409 = 0;
		local407 = 0;
		@Pc(580) Class221 local580 = null;
		for (@Pc(582) int local582 = 0; local582 < 128; local582++) {
			if (this.anIntArray211[local582] != 0) {
				if (local407 == 0) {
					local580 = local236[local181[local409]];
					if (local409 >= local157.length) {
						local407 = -1;
					} else {
						local407 = local157[local409++];
					}
				}
				this.aClass221Array1[local582] = local580;
				local407--;
			}
		}
		local409 = 0;
		local407 = 0;
		@Pc(625) int local625 = 0;
		for (@Pc(627) int local627 = 0; local627 < 128; local627++) {
			if (local407 == 0) {
				if (local333.length > local409) {
					local407 = local333[local409++];
				} else {
					local407 = -1;
				}
				if (this.anIntArray211[local627] > 0) {
					local625 = local36.method3580() + 1;
				}
			}
			local407--;
			this.aByteArray21[local627] = (byte) local625;
		}
		this.anInt2679 = local36.method3580() + 1;
		@Pc(688) int local688;
		for (@Pc(677) int local677 = 0; local677 < local186; local677++) {
			@Pc(683) Class221 local683 = local236[local677];
			if (local683.aByteArray77 != null) {
				for (local688 = 1; local688 < local683.aByteArray77.length; local688 += 2) {
					local683.aByteArray77[local688] = local36.method3605();
				}
			}
			if (local683.aByteArray78 != null) {
				for (local688 = 3; local688 < local683.aByteArray78.length - 2; local688 += 2) {
					local683.aByteArray78[local688] = local36.method3605();
				}
			}
		}
		@Pc(741) int local741;
		if (local301 != null) {
			for (local741 = 1; local741 < local301.length; local741 += 2) {
				local301[local741] = local36.method3605();
			}
		}
		if (local314 != null) {
			for (local741 = 1; local741 < local314.length; local741 += 2) {
				local314[local741] = local36.method3605();
			}
		}
		@Pc(794) int local794;
		for (local741 = 0; local741 < local186; local741++) {
			@Pc(787) Class221 local787 = local236[local741];
			if (local787.aByteArray78 != null) {
				local356 = 0;
				for (local794 = 2; local794 < local787.aByteArray78.length; local794 += 2) {
					local356 = local36.method3580() + local356 + 1;
					local787.aByteArray78[local794] = (byte) local356;
				}
			}
		}
		@Pc(839) int local839;
		for (local688 = 0; local688 < local186; local688++) {
			@Pc(832) Class221 local832 = local236[local688];
			if (local832.aByteArray77 != null) {
				local356 = 0;
				for (local839 = 2; local839 < local832.aByteArray77.length; local839 += 2) {
					local356 += local36.method3580() + 1;
					local832.aByteArray77[local839] = (byte) local356;
				}
			}
		}
		@Pc(920) int local920;
		@Pc(943) int local943;
		@Pc(949) byte local949;
		@Pc(968) int local968;
		@Pc(970) int local970;
		@Pc(979) int local979;
		@Pc(914) byte local914;
		@Pc(1015) int local1015;
		if (local301 != null) {
			local356 = local36.method3580();
			local301[0] = (byte) local356;
			for (local794 = 2; local794 < local301.length; local794 += 2) {
				local356 = local36.method3580() + local356 + 1;
				local301[local794] = (byte) local356;
			}
			local914 = local301[0];
			@Pc(918) byte local918 = local301[1];
			for (local920 = 0; local920 < local914; local920++) {
				this.aByteArray21[local920] = (byte) (local918 * this.aByteArray21[local920] + 32 >> 6);
			}
			local943 = 2;
			while (local301.length > local943) {
				local949 = local301[local943];
				@Pc(955) byte local955 = local301[local943 + 1];
				local968 = (local949 - local914) / 2 + local918 * (local949 - local914);
				for (local970 = local914; local970 < local949; local970++) {
					local979 = Static209.method2807(local949 - local914, local968);
					this.aByteArray21[local970] = (byte) (this.aByteArray21[local970] * local979 + 32 >> 6);
					local968 += local955 - local918;
				}
				local918 = local955;
				local943 += 2;
				local914 = local949;
			}
			for (local1015 = local914; local1015 < 128; local1015++) {
				this.aByteArray21[local1015] = (byte) (this.aByteArray21[local1015] * local918 + 32 >> 6);
			}
		}
		@Pc(1081) int local1081;
		if (local314 != null) {
			local356 = local36.method3580();
			local314[0] = (byte) local356;
			for (local794 = 2; local794 < local314.length; local794 += 2) {
				local356 += local36.method3580() + 1;
				local314[local794] = (byte) local356;
			}
			local914 = local314[0];
			local1081 = local314[1] << 1;
			for (local920 = 0; local920 < local914; local920++) {
				local943 = local1081 + (this.aByteArray20[local920] & 0xFF);
				if (local943 < 0) {
					local943 = 0;
				}
				if (local943 > 128) {
					local943 = 128;
				}
				this.aByteArray20[local920] = (byte) local943;
			}
			local943 = 2;
			@Pc(1131) int local1131;
			while (local943 < local314.length) {
				local949 = local314[local943];
				local1131 = local314[local943 + 1] << 1;
				local968 = (local949 - local914) / 2 + (local949 - local914) * local1081;
				for (local970 = local914; local970 < local949; local970++) {
					local979 = Static209.method2807(local949 - local914, local968);
					@Pc(1166) int local1166 = (this.aByteArray20[local970] & 0xFF) + local979;
					if (local1166 < 0) {
						local1166 = 0;
					}
					if (local1166 > 128) {
						local1166 = 128;
					}
					local968 += local1131 - local1081;
					this.aByteArray20[local970] = (byte) local1166;
				}
				local1081 = local1131;
				local943 += 2;
				local914 = local949;
			}
			for (local1015 = local914; local1015 < 128; local1015++) {
				local1131 = local1081 + (this.aByteArray20[local1015] & 0xFF);
				if (local1131 < 0) {
					local1131 = 0;
				}
				if (local1131 > 128) {
					local1131 = 128;
				}
				this.aByteArray20[local1015] = (byte) local1131;
			}
		}
		for (local794 = 0; local794 < local186; local794++) {
			local236[local794].anInt6081 = local36.method3580();
		}
		for (local839 = 0; local839 < local186; local839++) {
			@Pc(1269) Class221 local1269 = local236[local839];
			if (local1269.aByteArray77 != null) {
				local1269.anInt6088 = local36.method3580();
			}
			if (local1269.aByteArray78 != null) {
				local1269.anInt6085 = local36.method3580();
			}
			if (local1269.anInt6081 > 0) {
				local1269.anInt6086 = local36.method3580();
			}
		}
		for (local1081 = 0; local1081 < local186; local1081++) {
			local236[local1081].anInt6090 = local36.method3580();
		}
		for (local920 = 0; local920 < local186; local920++) {
			@Pc(1320) Class221 local1320 = local236[local920];
			if (local1320.anInt6090 > 0) {
				local1320.anInt6083 = local36.method3580();
			}
		}
		for (local943 = 0; local943 < local186; local943++) {
			@Pc(1340) Class221 local1340 = local236[local943];
			if (local1340.anInt6083 > 0) {
				local1340.anInt6084 = local36.method3580();
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V")
	public void method2201() {
		this.anIntArray211 = null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "([B[IBLclient!sp;)Z")
	public boolean method2202(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class227 arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) Class2_Sub22_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg0 == null || arg0[local19] != 0) {
				@Pc(34) int local34 = this.anIntArray211[local19];
				if (local34 != 0) {
					if (local15 != local34) {
						local15 = local34--;
						if ((local34 & 0x1) == 0) {
							local17 = arg2.method4843(local34 >> 2, arg1);
						} else {
							local17 = arg2.method4844(arg1, local34 >> 2);
						}
						if (local17 == null) {
							local13 = false;
						}
					}
					if (local17 != null) {
						this.aClass2_Sub22_Sub1Array1[local19] = local17;
						this.anIntArray211[local19] = 0;
					}
				}
			}
		}
		return local13;
	}
}
