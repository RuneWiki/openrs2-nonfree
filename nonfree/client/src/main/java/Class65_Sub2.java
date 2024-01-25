import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class65_Sub2 extends Class65 {

	@OriginalMember(owner = "client!qb", name = "n", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "[F")
	private float[] aFloatArray59;

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "[I")
	private int[] anIntArray449;

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "Lclient!nu;")
	private Interface16 anInterface16_7;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "[I")
	private int[] anIntArray450;

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
	private int anInt8024;

	@OriginalMember(owner = "client!qb", name = "Z", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!qb", name = "fb", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!qb", name = "gb", descriptor = "[I")
	private int[] anIntArray451;

	@OriginalMember(owner = "client!qb", name = "qb", descriptor = "[Lclient!cea;")
	private Class52[] aClass52Array3;

	@OriginalMember(owner = "client!qb", name = "rb", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!qb", name = "wb", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!qb", name = "yb", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!qb", name = "Ab", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!qb", name = "Gb", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!qb", name = "Hb", descriptor = "I")
	private int anInt8047;

	@OriginalMember(owner = "client!qb", name = "Kb", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!qb", name = "Mb", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!qb", name = "Pb", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!qb", name = "Qb", descriptor = "[Lclient!kw;")
	private Class190[] aClass190Array2;

	@OriginalMember(owner = "client!qb", name = "Rb", descriptor = "I")
	private int anInt8053;

	@OriginalMember(owner = "client!qb", name = "Sb", descriptor = "[F")
	private float[] aFloatArray60;

	@OriginalMember(owner = "client!qb", name = "Wb", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!qb", name = "cc", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!qb", name = "kc", descriptor = "Lclient!mn;")
	private Interface14 anInterface14_5;

	@OriginalMember(owner = "client!qb", name = "mc", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!qb", name = "nc", descriptor = "[Lclient!gv;")
	private Class131[] aClass131Array1;

	@OriginalMember(owner = "client!qb", name = "oc", descriptor = "Lclient!rp;")
	private Class293 aClass293_1;

	@OriginalMember(owner = "client!qb", name = "pc", descriptor = "[I")
	private int[] anIntArray452;

	@OriginalMember(owner = "client!qb", name = "uc", descriptor = "[I")
	private int[] anIntArray453;

	@OriginalMember(owner = "client!qb", name = "vc", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!qb", name = "yc", descriptor = "B")
	private byte aByte114;

	@OriginalMember(owner = "client!qb", name = "Cc", descriptor = "[Lclient!et;")
	private Class98[] aClass98Array1;

	@OriginalMember(owner = "client!qb", name = "Ec", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
	private int anInt8020 = 0;

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
	private int anInt8022 = 0;

	@OriginalMember(owner = "client!qb", name = "Lb", descriptor = "I")
	private int anInt8050 = 0;

	@OriginalMember(owner = "client!qb", name = "ob", descriptor = "Z")
	private boolean aBoolean577 = true;

	@OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
	private int anInt8032 = 0;

	@OriginalMember(owner = "client!qb", name = "xc", descriptor = "Z")
	private boolean aBoolean579 = false;

	@OriginalMember(owner = "client!qb", name = "fc", descriptor = "I")
	private int anInt8062 = 0;

	@OriginalMember(owner = "client!qb", name = "ec", descriptor = "Z")
	private boolean aBoolean578 = false;

	@OriginalMember(owner = "client!qb", name = "ic", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_34;

	@OriginalMember(owner = "client!qb", name = "xb", descriptor = "Lclient!mba;")
	private Class209 aClass209_15;

	@OriginalMember(owner = "client!qb", name = "Tb", descriptor = "Lclient!mba;")
	private Class209 aClass209_16;

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "Lclient!mba;")
	private Class209 aClass209_13;

	@OriginalMember(owner = "client!qb", name = "tb", descriptor = "Lclient!mba;")
	private Class209 aClass209_14;

	@OriginalMember(owner = "client!qb", name = "C", descriptor = "Lclient!io;")
	private Class153 aClass153_1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class65_Sub2(@OriginalArg(0) Class7_Sub2 arg0) {
		this.aClass7_Sub2_34 = arg0;
		this.aClass209_15 = new Class209(null, 5126, 3, 0);
		this.aClass209_16 = new Class209(null, 5126, 2, 0);
		this.aClass209_13 = new Class209(null, 5126, 3, 0);
		this.aClass209_14 = new Class209(null, 5121, 4, 0);
		this.aClass153_1 = new Class153();
	}

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!kfa;Lclient!cr;IIII)V")
	public Class65_Sub2(@OriginalArg(0) Class7_Sub2 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass7_Sub2_34 = arg0;
		this.anInt8053 = arg5;
		this.anInt8047 = arg2;
		if (Static436.method6473(arg5, arg2)) {
			this.aClass209_15 = new Class209(null, 5126, 3, 0);
		}
		if (Static404.method6136(arg5, arg2)) {
			this.aClass209_16 = new Class209(null, 5126, 2, 0);
		}
		if (Static448.method7384(arg5, arg2)) {
			this.aClass209_13 = new Class209(null, 5126, 3, 0);
		}
		if (Static183.method3007(arg5, arg2)) {
			this.aClass209_14 = new Class209(null, 5121, 4, 0);
		}
		if (Static405.method6140(arg2, arg5)) {
			this.aClass153_1 = new Class153();
		}
		@Pc(105) Interface7 local105 = arg0.anInterface7_12;
		@Pc(109) int[] local109 = new int[arg1.anInt1912];
		this.anIntArray449 = new int[arg1.anInt1902 + 1];
		for (@Pc(118) int local118 = 0; local118 < arg1.anInt1912; local118++) {
			if ((arg1.aByteArray10 == null || arg1.aByteArray10[local118] != 2) && (arg1.aShortArray11 == null || arg1.aShortArray11[local118] == -1 || !local105.method4460(arg1.aShortArray11[local118] & 0xFFFF).aBoolean176)) {
				local109[this.anInt8050++] = local118;
				this.anIntArray449[arg1.aShortArray19[local118]]++;
				this.anIntArray449[arg1.aShortArray18[local118]]++;
				this.anIntArray449[arg1.aShortArray15[local118]]++;
			}
		}
		this.anInt8020 = this.anInt8050;
		@Pc(207) long[] local207 = new long[this.anInt8050];
		@Pc(216) boolean local216 = (this.anInt8047 & 0x100) != 0;
		@Pc(228) int local228;
		@Pc(404) int local404;
		for (@Pc(218) int local218 = 0; local218 < this.anInt8050; local218++) {
			@Pc(224) int local224 = local109[local218];
			@Pc(226) Class69 local226 = null;
			local228 = 0;
			@Pc(230) byte local230 = 0;
			@Pc(232) byte local232 = 0;
			@Pc(234) byte local234 = 0;
			if (arg1.aClass138Array1 != null) {
				@Pc(239) boolean local239 = false;
				for (@Pc(241) int local241 = 0; local241 < arg1.aClass138Array1.length; local241++) {
					@Pc(248) Class138 local248 = arg1.aClass138Array1[local241];
					if (local248.anInt3902 == local224) {
						@Pc(261) Class74 local261 = Static16.method4958(local248.anInt3901);
						if (local261.aBoolean189) {
							local239 = true;
						}
						if (local261.anInt2384 != -1) {
							@Pc(276) Class69 local276 = local105.method4460(local261.anInt2384);
							if (local276.aBoolean180) {
								this.aBoolean578 = true;
							}
						}
					}
				}
				if (local239) {
					local207[local218] = Long.MAX_VALUE;
					this.anInt8020--;
					continue;
				}
			}
			@Pc(308) short local308 = -1;
			if (arg1.aShortArray11 != null) {
				local308 = arg1.aShortArray11[local224];
				if (local308 != -1) {
					local226 = local105.method4460(local308 & 0xFFFF);
					local232 = local226.aByte40;
					local234 = local226.aByte44;
				}
			}
			@Pc(360) boolean local360 = arg1.aByteArray12 != null && arg1.aByteArray12[local224] != 0 || local226 != null && !local226.aBoolean177 | local226.aBoolean180;
			if ((local216 || local360) && arg1.aByteArray8 != null) {
				local228 += arg1.aByteArray8[local224] << 17;
			}
			if (local360) {
				local228 += 65536;
			}
			local228 += (local232 & 0xFF) << 8;
			local228 += local234 & 0xFF;
			local404 = local230 + ((local308 & 0xFFFF) << 16);
			@Pc(410) int local410 = local404 + (local218 & 0xFFFF);
			local207[local218] = (long) local410 + ((long) local228 << 32);
			this.aBoolean578 |= local360;
		}
		Static257.method4065(local109, local207);
		this.anIntArray450 = arg1.anIntArray84;
		this.anIntArray452 = arg1.anIntArray78;
		this.anInt8032 = arg1.anInt1902;
		this.anInt8022 = arg1.anInt1904;
		this.aShortArray104 = arg1.aShortArray16;
		this.anIntArray451 = arg1.anIntArray75;
		this.aClass190Array2 = arg1.aClass190Array1;
		this.aClass52Array3 = arg1.aClass52Array1;
		@Pc(475) Class264[] local475 = new Class264[this.anInt8032];
		@Pc(495) int local495;
		@Pc(509) int local509;
		if (arg1.aClass138Array1 != null) {
			this.anInt8024 = arg1.aClass138Array1.length;
			this.aClass131Array1 = new Class131[this.anInt8024];
			this.aClass98Array1 = new Class98[this.anInt8024];
			for (local495 = 0; local495 < this.anInt8024; local495++) {
				@Pc(502) Class138 local502 = arg1.aClass138Array1[local495];
				@Pc(507) Class74 local507 = Static16.method4958(local502.anInt3901);
				local509 = -1;
				for (@Pc(511) int local511 = 0; local511 < this.anInt8050; local511++) {
					if (local109[local511] == local502.anInt3902) {
						local509 = local511;
						break;
					}
				}
				if (local509 == -1) {
					throw new RuntimeException();
				}
				@Pc(551) int local551 = Static394.anIntArray413[arg1.aShortArray14[local502.anInt3902] & 0xFFFF] & 0xFFFFFF;
				@Pc(568) int local568 = local551 | 255 - (arg1.aByteArray12 == null ? 0 : arg1.aByteArray12[local502.anInt3902]) << 24;
				this.aClass98Array1[local495] = new Class98(local509, arg1.aShortArray19[local502.anInt3902], arg1.aShortArray18[local502.anInt3902], arg1.aShortArray15[local502.anInt3902], local507.anInt2389, local507.anInt2388, local507.anInt2384, local507.anInt2383, local507.anInt2387, local507.aBoolean189, local507.aBoolean190, local502.anInt3907);
				this.aClass131Array1[local495] = new Class131(local568);
			}
		}
		local495 = this.anInt8050 * 3;
		this.aShortArray97 = new short[this.anInt8050];
		this.aShortArray102 = new short[local495];
		if (arg1.aShortArray10 != null) {
			this.aShortArray100 = new short[this.anInt8050];
		}
		this.aShort101 = (short) arg4;
		this.aShortArray103 = new short[this.anInt8050];
		this.aShortArray98 = new short[local495];
		this.aByteArray74 = new byte[this.anInt8050];
		this.aFloatArray60 = new float[local495];
		this.aShortArray105 = new short[this.anInt8050];
		this.aShortArray106 = new short[this.anInt8050];
		this.aShort100 = (short) arg3;
		this.aByteArray75 = new byte[local495];
		this.aShortArray101 = new short[local495];
		this.aShortArray107 = new short[this.anInt8050];
		Static343.aLongArray13 = new long[local495];
		this.aShortArray99 = new short[local495];
		this.aFloatArray59 = new float[local495];
		local228 = 0;
		for (local404 = 0; local404 < arg1.anInt1902; local404++) {
			local509 = this.anIntArray449[local404];
			this.anIntArray449[local404] = local228;
			local228 += local509;
			local475[local404] = new Class264();
		}
		this.anIntArray449[arg1.anInt1902] = local228;
		@Pc(741) int[] local741 = null;
		@Pc(743) int[] local743 = null;
		@Pc(745) int[] local745 = null;
		@Pc(747) float[][] local747 = null;
		@Pc(773) int local773;
		@Pc(805) int local805;
		@Pc(811) int local811;
		@Pc(825) int local825;
		@Pc(827) int local827;
		@Pc(863) int local863;
		@Pc(868) int local868;
		@Pc(1026) float local1026;
		@Pc(1055) float local1055;
		@Pc(1024) float local1024;
		if (arg1.aByteArray13 != null) {
			@Pc(753) int local753 = arg1.anInt1899;
			@Pc(756) int[] local756 = new int[local753];
			@Pc(759) int[] local759 = new int[local753];
			@Pc(762) int[] local762 = new int[local753];
			@Pc(765) int[] local765 = new int[local753];
			@Pc(768) int[] local768 = new int[local753];
			@Pc(771) int[] local771 = new int[local753];
			for (local773 = 0; local773 < local753; local773++) {
				local756[local773] = Integer.MAX_VALUE;
				local759[local773] = -2147483647;
				local762[local773] = Integer.MAX_VALUE;
				local765[local773] = -2147483647;
				local768[local773] = Integer.MAX_VALUE;
				local771[local773] = -2147483647;
			}
			for (local805 = 0; local805 < this.anInt8050; local805++) {
				local811 = local109[local805];
				if (arg1.aByteArray13[local811] != -1) {
					local825 = arg1.aByteArray13[local811] & 0xFF;
					for (local827 = 0; local827 < 3; local827++) {
						@Pc(844) short local844;
						if (local827 == 0) {
							local844 = arg1.aShortArray19[local811];
						} else if (local827 == 1) {
							local844 = arg1.aShortArray18[local811];
						} else {
							local844 = arg1.aShortArray15[local811];
						}
						local863 = arg1.anIntArray78[local844];
						local868 = arg1.anIntArray75[local844];
						@Pc(873) int local873 = arg1.anIntArray84[local844];
						if (local863 < local756[local825]) {
							local756[local825] = local863;
						}
						if (local863 > local759[local825]) {
							local759[local825] = local863;
						}
						if (local762[local825] > local868) {
							local762[local825] = local868;
						}
						if (local868 > local765[local825]) {
							local765[local825] = local868;
						}
						if (local768[local825] > local873) {
							local768[local825] = local873;
						}
						if (local873 > local771[local825]) {
							local771[local825] = local873;
						}
					}
				}
			}
			local745 = new int[local753];
			local741 = new int[local753];
			local747 = new float[local753][];
			local743 = new int[local753];
			for (local811 = 0; local811 < local753; local811++) {
				@Pc(969) byte local969 = arg1.aByteArray9[local811];
				if (local969 > 0) {
					local741[local811] = (local756[local811] + local759[local811]) / 2;
					local743[local811] = (local762[local811] + local765[local811]) / 2;
					local745[local811] = (local771[local811] + local768[local811]) / 2;
					if (local969 == 1) {
						local868 = arg1.anIntArray82[local811];
						if (local868 == 0) {
							local1024 = 1.0F;
							local1026 = 1.0F;
						} else if (local868 <= 0) {
							local1026 = (float) -local868 / 1024.0F;
							local1024 = 1.0F;
						} else {
							local1024 = (float) local868 / 1024.0F;
							local1026 = 1.0F;
						}
						local1055 = 64.0F / (float) arg1.anIntArray79[local811];
					} else if (local969 == 2) {
						local1026 = 64.0F / (float) arg1.anIntArray82[local811];
						local1024 = 64.0F / (float) arg1.anIntArray85[local811];
						local1055 = 64.0F / (float) arg1.anIntArray79[local811];
					} else {
						local1055 = (float) arg1.anIntArray79[local811] / 1024.0F;
						local1024 = (float) arg1.anIntArray85[local811] / 1024.0F;
						local1026 = (float) arg1.anIntArray82[local811] / 1024.0F;
					}
					local747[local811] = Static159.method2597(arg1.aShortArray13[local811], local1055, local1026, local1024, arg1.aByteArray11[local811] & 0xFF, arg1.aShortArray12[local811], arg1.aShortArray17[local811]);
				}
			}
		}
		@Pc(1150) Class309[] local1150 = new Class309[arg1.anInt1912];
		@Pc(1169) short local1169;
		@Pc(1180) int local1180;
		@Pc(1191) int local1191;
		@Pc(1251) int local1251;
		for (@Pc(1152) int local1152 = 0; local1152 < arg1.anInt1912; local1152++) {
			@Pc(1159) short local1159 = arg1.aShortArray19[local1152];
			@Pc(1164) short local1164 = arg1.aShortArray18[local1152];
			local1169 = arg1.aShortArray15[local1152];
			local1180 = this.anIntArray452[local1164] - this.anIntArray452[local1159];
			local1191 = this.anIntArray451[local1164] - this.anIntArray451[local1159];
			local773 = this.anIntArray450[local1164] - this.anIntArray450[local1159];
			local805 = this.anIntArray452[local1169] - this.anIntArray452[local1159];
			local811 = this.anIntArray451[local1169] - this.anIntArray451[local1159];
			local825 = this.anIntArray450[local1169] - this.anIntArray450[local1159];
			local827 = local1191 * local825 - local811 * local773;
			local1251 = local773 * local805 - local1180 * local825;
			local863 = local811 * local1180 - local805 * local1191;
			while (local827 > 8192 || local1251 > 8192 || local863 > 8192 || local827 < -8192 || local1251 < -8192 || local863 < -8192) {
				local863 >>= 0x1;
				local827 >>= 0x1;
				local1251 >>= 0x1;
			}
			local868 = (int) Math.sqrt((double) (local827 * local827 + local1251 * local1251 + local863 * local863));
			if (local868 <= 0) {
				local868 = 1;
			}
			local863 = local863 * 256 / local868;
			local827 = local827 * 256 / local868;
			local1251 = local1251 * 256 / local868;
			@Pc(1347) byte local1347 = arg1.aByteArray10 == null ? 0 : arg1.aByteArray10[local1152];
			if (local1347 == 0) {
				@Pc(1353) Class264 local1353 = local475[local1159];
				local1353.anInt7851 += local863;
				local1353.anInt7852 += local827;
				local1353.anInt7848++;
				local1353.anInt7850 += local1251;
				@Pc(1381) Class264 local1381 = local475[local1164];
				local1381.anInt7852 += local827;
				local1381.anInt7848++;
				local1381.anInt7850 += local1251;
				local1381.anInt7851 += local863;
				@Pc(1409) Class264 local1409 = local475[local1169];
				local1409.anInt7850 += local1251;
				local1409.anInt7852 += local827;
				local1409.anInt7848++;
				local1409.anInt7851 += local863;
			} else if (local1347 == 1) {
				@Pc(1448) Class309 local1448 = local1150[local1152] = new Class309();
				local1448.anInt9290 = local1251;
				local1448.anInt9289 = local827;
				local1448.anInt9291 = local863;
			}
		}
		@Pc(1474) int local1474;
		for (@Pc(1468) int local1468 = 0; local1468 < this.anInt8050; local1468++) {
			local1474 = local109[local1468];
			@Pc(1481) int local1481 = arg1.aShortArray14[local1474] & 0xFFFF;
			@Pc(1486) short local1486;
			if (arg1.aShortArray11 == null) {
				local1486 = -1;
			} else {
				local1486 = arg1.aShortArray11[local1474];
			}
			if (arg1.aByteArray13 == null) {
				local1191 = -1;
			} else {
				local1191 = arg1.aByteArray13[local1474];
			}
			if (arg1.aByteArray12 == null) {
				local773 = 0;
			} else {
				local773 = arg1.aByteArray12[local1474] & 0xFF;
			}
			@Pc(1521) float local1521 = 0.0F;
			@Pc(1523) float local1523 = 0.0F;
			@Pc(1525) float local1525 = 0.0F;
			local1026 = 0.0F;
			local1055 = 0.0F;
			local1024 = 0.0F;
			@Pc(1533) byte local1533 = 0;
			@Pc(1535) byte local1535 = 0;
			@Pc(1537) int local1537 = 0;
			@Pc(1571) byte local1571;
			@Pc(1588) short local1588;
			@Pc(1593) short local1593;
			@Pc(1598) short local1598;
			if (local1486 != -1) {
				if (local1191 == -1) {
					local1024 = 0.0F;
					local1521 = 0.0F;
					local1535 = 2;
					local1055 = 0.0F;
					local1525 = 1.0F;
					local1523 = 1.0F;
					local1026 = 1.0F;
					local1533 = 1;
				} else {
					local1191 &= 0xFF;
					local1571 = arg1.aByteArray9[local1191];
					@Pc(1578) short local1578;
					@Pc(1583) short local1583;
					@Pc(1621) float local1621;
					@Pc(1629) float local1629;
					@Pc(1637) float local1637;
					@Pc(1721) float local1721;
					@Pc(1730) float local1730;
					@Pc(1738) float local1738;
					@Pc(1747) float local1747;
					@Pc(1755) float local1755;
					@Pc(1764) float local1764;
					if (local1571 == 0) {
						local1578 = arg1.aShortArray19[local1474];
						local1583 = arg1.aShortArray18[local1474];
						local1588 = arg1.aShortArray15[local1474];
						local1593 = arg1.aShortArray13[local1191];
						local1598 = arg1.aShortArray12[local1191];
						@Pc(1603) short local1603 = arg1.aShortArray17[local1191];
						@Pc(1609) float local1609 = (float) arg1.anIntArray78[local1593];
						@Pc(1615) float local1615 = (float) arg1.anIntArray75[local1593];
						local1621 = arg1.anIntArray84[local1593];
						local1629 = (float) arg1.anIntArray78[local1598] - local1609;
						local1637 = (float) arg1.anIntArray75[local1598] - local1615;
						@Pc(1646) float local1646 = (float) arg1.anIntArray84[local1598] - local1621;
						@Pc(1654) float local1654 = (float) arg1.anIntArray78[local1603] - local1609;
						@Pc(1662) float local1662 = (float) arg1.anIntArray75[local1603] - local1615;
						@Pc(1671) float local1671 = (float) arg1.anIntArray84[local1603] - local1621;
						@Pc(1680) float local1680 = (float) arg1.anIntArray78[local1578] - local1609;
						@Pc(1688) float local1688 = (float) arg1.anIntArray75[local1578] - local1615;
						@Pc(1696) float local1696 = (float) arg1.anIntArray84[local1578] - local1621;
						@Pc(1705) float local1705 = (float) arg1.anIntArray78[local1583] - local1609;
						@Pc(1713) float local1713 = (float) arg1.anIntArray75[local1583] - local1615;
						local1721 = (float) arg1.anIntArray84[local1583] - local1621;
						local1730 = (float) arg1.anIntArray78[local1588] - local1609;
						local1738 = (float) arg1.anIntArray75[local1588] - local1615;
						local1747 = (float) arg1.anIntArray84[local1588] - local1621;
						local1755 = local1637 * local1671 - local1662 * local1646;
						local1764 = local1654 * local1646 - local1629 * local1671;
						@Pc(1773) float local1773 = local1662 * local1629 - local1654 * local1637;
						@Pc(1781) float local1781 = local1773 * local1662 - local1671 * local1764;
						@Pc(1790) float local1790 = local1671 * local1755 - local1654 * local1773;
						@Pc(1799) float local1799 = local1654 * local1764 - local1662 * local1755;
						@Pc(1813) float local1813 = 1.0F / (local1637 * local1790 + local1781 * local1629 + local1646 * local1799);
						local1521 = (local1790 * local1688 + local1781 * local1680 + local1696 * local1799) * local1813;
						local1525 = local1813 * (local1713 * local1790 + local1781 * local1705 + local1721 * local1799);
						local1055 = (local1781 * local1730 + local1738 * local1790 + local1747 * local1799) * local1813;
						@Pc(1864) float local1864 = local1646 * local1755 - local1629 * local1773;
						@Pc(1872) float local1872 = local1764 * local1629 - local1755 * local1637;
						@Pc(1880) float local1880 = local1773 * local1637 - local1764 * local1646;
						@Pc(1894) float local1894 = 1.0F / (local1671 * local1872 + local1864 * local1662 + local1654 * local1880);
						local1523 = local1894 * (local1696 * local1872 + local1864 * local1688 + local1880 * local1680);
						local1026 = (local1880 * local1705 + local1864 * local1713 + local1721 * local1872) * local1894;
						local1024 = (local1738 * local1864 + local1880 * local1730 + local1872 * local1747) * local1894;
					} else {
						local1578 = arg1.aShortArray19[local1474];
						local1583 = arg1.aShortArray18[local1474];
						local1588 = arg1.aShortArray15[local1474];
						@Pc(1957) int local1957 = local741[local1191];
						@Pc(1961) int local1961 = local743[local1191];
						@Pc(1965) int local1965 = local745[local1191];
						@Pc(1969) float[] local1969 = local747[local1191];
						@Pc(1974) byte local1974 = arg1.aByteArray7[local1191];
						local1621 = (float) arg1.anIntArray81[local1191] / 256.0F;
						if (local1571 == 1) {
							local1629 = (float) arg1.anIntArray85[local1191] / 1024.0F;
							Static314.method4961(arg1.anIntArray78[local1578], local1961, local1974, local1629, arg1.anIntArray84[local1578], local1621, local1957, arg1.anIntArray75[local1578], local1965, local1969);
							local1521 = Static254.aFloat111;
							local1523 = Static166.aFloat81;
							Static314.method4961(arg1.anIntArray78[local1583], local1961, local1974, local1629, arg1.anIntArray84[local1583], local1621, local1957, arg1.anIntArray75[local1583], local1965, local1969);
							local1525 = Static254.aFloat111;
							local1026 = Static166.aFloat81;
							Static314.method4961(arg1.anIntArray78[local1588], local1961, local1974, local1629, arg1.anIntArray84[local1588], local1621, local1957, arg1.anIntArray75[local1588], local1965, local1969);
							local1055 = Static254.aFloat111;
							local1024 = Static166.aFloat81;
							local1637 = local1629 / 2.0F;
							if ((local1974 & 0x1) == 0) {
								if (local1637 < local1525 - local1521) {
									local1533 = 1;
									local1525 -= local1629;
								} else if (local1637 < local1521 - local1525) {
									local1533 = 2;
									local1525 += local1629;
								}
								if (local1055 - local1521 > local1637) {
									local1055 -= local1629;
									local1535 = 1;
								} else if (local1521 - local1055 > local1637) {
									local1055 += local1629;
									local1535 = 2;
								}
							} else {
								if (local1637 < local1026 - local1523) {
									local1533 = 1;
									local1026 -= local1629;
								} else if (local1523 - local1026 > local1637) {
									local1026 += local1629;
									local1533 = 2;
								}
								if (local1024 - local1523 > local1637) {
									local1024 -= local1629;
									local1535 = 1;
								} else if (local1637 < local1523 - local1024) {
									local1535 = 2;
									local1024 += local1629;
								}
							}
						} else if (local1571 == 2) {
							local1629 = (float) arg1.anIntArray77[local1191] / 256.0F;
							local1637 = (float) arg1.anIntArray83[local1191] / 256.0F;
							@Pc(2415) int local2415 = arg1.anIntArray78[local1583] - arg1.anIntArray78[local1578];
							@Pc(2426) int local2426 = arg1.anIntArray75[local1583] - arg1.anIntArray75[local1578];
							@Pc(2436) int local2436 = arg1.anIntArray84[local1583] - arg1.anIntArray84[local1578];
							@Pc(2447) int local2447 = arg1.anIntArray78[local1588] - arg1.anIntArray78[local1578];
							@Pc(2457) int local2457 = arg1.anIntArray75[local1588] - arg1.anIntArray75[local1578];
							@Pc(2468) int local2468 = arg1.anIntArray84[local1588] - arg1.anIntArray84[local1578];
							@Pc(2477) int local2477 = local2426 * local2468 - local2436 * local2457;
							@Pc(2486) int local2486 = local2447 * local2436 - local2468 * local2415;
							@Pc(2494) int local2494 = local2457 * local2415 - local2447 * local2426;
							local1721 = 64.0F / (float) arg1.anIntArray82[local1191];
							local1730 = 64.0F / (float) arg1.anIntArray79[local1191];
							local1738 = 64.0F / (float) arg1.anIntArray85[local1191];
							local1747 = (local1969[2] * (float) local2494 + (float) local2486 * local1969[1] + local1969[0] * (float) local2477) / local1721;
							local1755 = (local1969[4] * (float) local2486 + (float) local2477 * local1969[3] + local1969[5] * (float) local2494) / local1730;
							local1764 = (local1969[6] * (float) local2477 + local1969[7] * (float) local2486 + local1969[8] * (float) local2494) / local1738;
							local1537 = Static107.method2008(local1755, local1747, local1764);
							Static580.method5874(arg1.anIntArray78[local1578], local1957, local1969, local1637, local1537, local1965, arg1.anIntArray84[local1578], local1961, arg1.anIntArray75[local1578], local1621, local1974, local1629);
							local1523 = Static131.aFloat67;
							local1521 = Static71.aFloat52;
							Static580.method5874(arg1.anIntArray78[local1583], local1957, local1969, local1637, local1537, local1965, arg1.anIntArray84[local1583], local1961, arg1.anIntArray75[local1583], local1621, local1974, local1629);
							local1026 = Static131.aFloat67;
							local1525 = Static71.aFloat52;
							Static580.method5874(arg1.anIntArray78[local1588], local1957, local1969, local1637, local1537, local1965, arg1.anIntArray84[local1588], local1961, arg1.anIntArray75[local1588], local1621, local1974, local1629);
							local1024 = Static131.aFloat67;
							local1055 = Static71.aFloat52;
						} else if (local1571 == 3) {
							Static259.method4094(arg1.anIntArray75[local1578], local1969, local1965, arg1.anIntArray84[local1578], local1957, local1621, local1961, arg1.anIntArray78[local1578], local1974);
							local1523 = Static259.aFloat124;
							local1521 = Static181.aFloat82;
							Static259.method4094(arg1.anIntArray75[local1583], local1969, local1965, arg1.anIntArray84[local1583], local1957, local1621, local1961, arg1.anIntArray78[local1583], local1974);
							local1026 = Static259.aFloat124;
							local1525 = Static181.aFloat82;
							Static259.method4094(arg1.anIntArray75[local1588], local1969, local1965, arg1.anIntArray84[local1588], local1957, local1621, local1961, arg1.anIntArray78[local1588], local1974);
							local1055 = Static181.aFloat82;
							local1024 = Static259.aFloat124;
							if ((local1974 & 0x1) == 0) {
								if (local1055 - local1521 > 0.5F) {
									local1535 = 1;
									local1055--;
								} else if (local1521 - local1055 > 0.5F) {
									local1055++;
									local1535 = 2;
								}
								if (local1525 - local1521 > 0.5F) {
									local1533 = 1;
									local1525--;
								} else if (local1521 - local1525 > 0.5F) {
									local1525++;
									local1533 = 2;
								}
							} else {
								if (local1026 - local1523 > 0.5F) {
									local1533 = 1;
									local1026--;
								} else if (local1523 - local1026 > 0.5F) {
									local1026++;
									local1533 = 2;
								}
								if (local1024 - local1523 > 0.5F) {
									local1535 = 1;
									local1024--;
								} else if (local1523 - local1024 > 0.5F) {
									local1024++;
									local1535 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray10 == null) {
				local1571 = 0;
			} else {
				local1571 = arg1.aByteArray10[local1474];
			}
			if (local1571 == 0) {
				@Pc(2835) long local2835 = ((long) (local1481 << 8) + (long) (local1537 << 24) + (long) local773 << 32) + (long) (local1191 << 2);
				local1588 = arg1.aShortArray19[local1474];
				local1593 = arg1.aShortArray18[local1474];
				local1598 = arg1.aShortArray15[local1474];
				@Pc(2854) Class264 local2854 = local475[local1588];
				this.aShortArray106[local1468] = this.method6295(local2835, local2854.anInt7852, local2854.anInt7848, local1523, local1521, arg1, local2854.anInt7851, local1588, local2854.anInt7850);
				@Pc(2878) Class264 local2878 = local475[local1593];
				this.aShortArray103[local1468] = this.method6295(local2835 + (long) local1533, local2878.anInt7852, local2878.anInt7848, local1026, local1525, arg1, local2878.anInt7851, local1593, local2878.anInt7850);
				@Pc(2905) Class264 local2905 = local475[local1598];
				this.aShortArray107[local1468] = this.method6295(local2835 + (long) local1535, local2905.anInt7852, local2905.anInt7848, local1024, local1055, arg1, local2905.anInt7851, local1598, local2905.anInt7850);
			} else if (local1571 == 1) {
				@Pc(2695) Class309 local2695 = local1150[local1474];
				@Pc(2740) long local2740 = (long) ((local2695.anInt9290 + 256 << 12) + ((local1191 << 2) - (-(local2695.anInt9289 > 0 ? 1024 : 2048) - (local2695.anInt9291 + 256 << 22)))) + ((long) (local1481 << 8) + (long) (local1537 << 24) + (long) local773 << 32);
				this.aShortArray106[local1468] = this.method6295(local2740, local2695.anInt9289, 0, local1523, local1521, arg1, local2695.anInt9291, arg1.aShortArray19[local1474], local2695.anInt9290);
				this.aShortArray103[local1468] = this.method6295(local2740 + (long) local1533, local2695.anInt9289, 0, local1026, local1525, arg1, local2695.anInt9291, arg1.aShortArray18[local1474], local2695.anInt9290);
				this.aShortArray107[local1468] = this.method6295(local2740 + (long) local1535, local2695.anInt9289, 0, local1024, local1055, arg1, local2695.anInt9291, arg1.aShortArray15[local1474], local2695.anInt9290);
			}
			if (arg1.aShortArray11 == null) {
				this.aShortArray97[local1468] = -1;
			} else {
				this.aShortArray97[local1468] = arg1.aShortArray11[local1474];
			}
			if (arg1.aByteArray12 != null) {
				this.aByteArray74[local1468] = arg1.aByteArray12[local1474];
			}
			if (arg1.aShortArray10 != null) {
				this.aShortArray100[local1468] = arg1.aShortArray10[local1474];
			}
			this.aShortArray105[local1468] = arg1.aShortArray14[local1474];
		}
		local1474 = 0;
		local1169 = -10000;
		for (local1180 = 0; local1180 < this.anInt8020; local1180++) {
			@Pc(2994) short local2994 = this.aShortArray97[local1180];
			if (local2994 != local1169) {
				local1474++;
				local1169 = local2994;
			}
		}
		this.anIntArray453 = new int[local1474 + 1];
		local1169 = -10000;
		local1474 = 0;
		for (local1191 = 0; local1191 < this.anInt8020; local1191++) {
			@Pc(3032) short local3032 = this.aShortArray97[local1191];
			if (local1169 != local3032) {
				local1169 = local3032;
				this.anIntArray453[local1474++] = local1191;
			}
		}
		this.anIntArray453[local1474] = this.anInt8020;
		Static343.aLongArray13 = null;
		this.aShortArray102 = Static73.method1575(this.anInt8062, this.aShortArray102);
		this.aShortArray98 = Static73.method1575(this.anInt8062, this.aShortArray98);
		this.aShortArray101 = Static73.method1575(this.anInt8062, this.aShortArray101);
		this.aByteArray75 = Static355.method5358(this.aByteArray75, this.anInt8062);
		this.aFloatArray60 = Static118.method2167(this.anInt8062, this.aFloatArray60);
		this.aFloatArray59 = Static118.method2167(this.anInt8062, this.aFloatArray59);
		if (arg1.anIntArray76 != null && Static254.method4044(arg2, this.anInt8053)) {
			this.anIntArrayArray44 = arg1.method1582(false);
		}
		if (arg1.aClass138Array1 != null && Static281.method4485(this.anInt8053, arg2)) {
			this.anIntArrayArray42 = arg1.method1577();
		}
		if (arg1.anIntArray80 != null && Static270.method4365(arg2, this.anInt8053)) {
			local773 = 0;
			@Pc(3151) int[] local3151 = new int[256];
			for (local811 = 0; local811 < this.anInt8050; local811++) {
				local825 = arg1.anIntArray80[local109[local811]];
				if (local825 >= 0) {
					if (local773 < local825) {
						local773 = local825;
					}
					@Pc(3176) int local3176 = local3151[local825]++;
				}
			}
			this.anIntArrayArray43 = new int[local773 + 1][];
			for (local825 = 0; local825 <= local773; local825++) {
				this.anIntArrayArray43[local825] = new int[local3151[local825]];
				local3151[local825] = 0;
			}
			for (local827 = 0; local827 < this.anInt8050; local827++) {
				local1251 = arg1.anIntArray80[local109[local827]];
				if (local1251 >= 0) {
					this.anIntArrayArray43[local1251][local3151[local1251]++] = local827;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "(III)V")
	@Override
	public void R(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8032; local7++) {
			if (arg0 != 128) {
				this.anIntArray452[local7] = this.anIntArray452[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray451[local7] = this.anIntArray451[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray450[local7] = arg2 * this.anIntArray450[local7] >> 7;
			}
		}
		this.aBoolean579 = false;
		if (this.aClass209_15 != null) {
			this.aClass209_15.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()V")
	@Override
	protected void method7666() {
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
	private void method6280() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt8032; local23++) {
			@Pc(30) int local30 = this.anIntArray452[local23];
			@Pc(35) int local35 = this.anIntArray451[local23];
			if (local30 > local13) {
				local13 = local30;
			}
			@Pc(45) int local45 = this.anIntArray450[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local45 > local17) {
				local17 = local45;
			}
			if (local11 > local45) {
				local11 = local45;
			}
			@Pc(82) int local82 = local45 * local45 + local30 * local30;
			if (local19 < local82) {
				local19 = local82;
			}
			local82 = local30 * local30 + local45 * local45 + local35 * local35;
			if (local21 < local82) {
				local21 = local82;
			}
		}
		this.aShort99 = (short) local13;
		this.aShort93 = (short) local17;
		this.aShort96 = (short) local15;
		this.aShort95 = (short) local7;
		this.aShort92 = (short) local11;
		this.aShort97 = (short) local9;
		this.aShort94 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort98 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean579 = true;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIBIS)I")
	private int method6281(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short arg3) {
		@Pc(12) int local12 = Static394.anIntArray413[Static456.method6710(arg0, arg2)];
		if (arg3 != -1) {
			@Pc(24) Class69 local24 = this.aClass7_Sub2_34.anInterface7_12.method4460(arg3 & 0xFFFF);
			@Pc(29) int local29 = local24.aByte43 & 0xFF;
			@Pc(35) int local35;
			@Pc(66) int local66;
			if (local29 != 0) {
				if (arg2 < 0) {
					local35 = 0;
				} else if (arg2 <= 127) {
					local35 = arg2 * 131586;
				} else {
					local35 = 16777215;
				}
				if (local29 == 256) {
					local12 = local35;
				} else {
					local66 = 256 - local29;
					local12 = ((local35 & 0xFF00FF) * local29 + local66 * (local12 & 0xFF00FF) & 0xFF00FF00) + ((local35 & 0xFF00) * local29 + local66 * (local12 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local35 = local24.aByte46 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(117) int local117 = local35 * (local12 >> 16 & 0xFF);
				if (local117 > 65535) {
					local117 = 65535;
				}
				local66 = local35 * (local12 >> 8 & 0xFF);
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(145) int local145 = (local12 & 0xFF) * local35;
				if (local145 > 65535) {
					local145 = 65535;
				}
				local12 = (local145 >> 8) + ((local117 & 0xD600FF00) << 8) + (local66 & 0xFF00);
			}
		}
		return (local12 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!qb", name = "TA", descriptor = "()I")
	@Override
	public int TA() {
		return this.aShort100;
	}

	@OriginalMember(owner = "client!qb", name = "za", descriptor = "()I")
	@Override
	public int za() {
		if (!this.aBoolean579) {
			this.method6280();
		}
		return this.aShort93;
	}

	@OriginalMember(owner = "client!qb", name = "KA", descriptor = "()I")
	@Override
	public int KA() {
		if (!this.aBoolean579) {
			this.method6280();
		}
		return this.aShort95;
	}

	@OriginalMember(owner = "client!qb", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean579) {
			this.method6280();
		}
		return this.aShort98;
	}

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "()V")
	@Override
	protected void L() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt8022; local3++) {
			this.anIntArray452[local3] = this.anIntArray452[local3] + 7 >> 4;
			this.anIntArray451[local3] = this.anIntArray451[local3] + 7 >> 4;
			this.anIntArray450[local3] = this.anIntArray450[local3] + 7 >> 4;
		}
		if (this.aClass209_15 != null) {
			this.aClass209_15.anInterface16_6 = null;
		}
		this.aBoolean579 = false;
	}

	@OriginalMember(owner = "client!qb", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray420[arg0];
		@Pc(13) int local13 = Class262.anIntArray421[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8032; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray451[local15] - this.anIntArray450[local15] * local9 >> 14;
			this.anIntArray450[local15] = this.anIntArray450[local15] * local13 + local9 * this.anIntArray451[local15] >> 14;
			this.anIntArray451[local15] = local34;
		}
		this.aBoolean579 = false;
		if (this.aClass209_15 != null) {
			this.aClass209_15.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "SA", descriptor = "(I)V")
	@Override
	public void SA(@OriginalArg(0) int arg0) {
		this.anInt8047 = arg0;
		if (this.aClass293_1 != null && (this.anInt8047 & 0x10000) == 0) {
			this.aShortArray101 = this.aClass293_1.aShortArray124;
			this.aShortArray98 = this.aClass293_1.aShortArray126;
			this.aByteArray75 = this.aClass293_1.aByteArray86;
			this.aShortArray102 = this.aClass293_1.aShortArray125;
			this.aClass293_1 = null;
		}
		this.aBoolean577 = true;
		this.method6289();
	}

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void B(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static80.anInt2160 = 0;
			Static365.anInt7042 = 0;
			local31 = 0;
			Static485.anInt9204 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray44.length) {
					local51 = this.anIntArrayArray44[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray104 == null || (arg6 & this.aShortArray104[local59]) != 0) {
							Static365.anInt7042 += this.anIntArray452[local59];
							Static485.anInt9204 += this.anIntArray451[local59];
							local31++;
							Static80.anInt2160 += this.anIntArray450[local59];
						}
					}
				}
			}
			if (local31 > 0) {
				Static365.anInt7042 = Static365.anInt7042 / local31 + arg2;
				Static485.anInt9204 = arg3 + Static485.anInt9204 / local31;
				Static260.aBoolean369 = true;
				Static80.anInt2160 = Static80.anInt2160 / local31 + arg4;
			} else {
				Static365.anInt7042 = arg2;
				Static80.anInt2160 = arg4;
				Static485.anInt9204 = arg3;
			}
			return;
		}
		@Pc(253) int[] local253;
		@Pc(255) int local255;
		if (arg0 == 1) {
			if (arg7 != null) {
				local31 = arg7[0] * arg2 + arg7[1] * arg3 + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
				arg3 = local35;
				arg2 = local31;
				arg4 = local41;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray44.length) {
					local253 = this.anIntArrayArray44[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local53 = local253[local255];
						if (this.aShortArray104 == null || (arg6 & this.aShortArray104[local53]) != 0) {
							this.anIntArray452[local53] += arg2;
							this.anIntArray451[local53] += arg3;
							this.anIntArray450[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(375) int local375;
		@Pc(397) int local397;
		@Pc(424) int local424;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(638) int local638;
		@Pc(665) int local665;
		@Pc(670) int local670;
		@Pc(678) int local678;
		@Pc(683) int local683;
		@Pc(687) int local687;
		@Pc(691) int local691;
		@Pc(693) int local693;
		@Pc(826) int[] local826;
		@Pc(828) int local828;
		@Pc(832) int local832;
		@Pc(836) int local836;
		@Pc(838) int local838;
		@Pc(966) int local966;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray44.length > local35) {
						local253 = this.anIntArrayArray44[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local53 = local253[local255];
							if (this.aShortArray104 == null || (this.aShortArray104[local53] & arg6) != 0) {
								this.anIntArray452[local53] -= Static365.anInt7042;
								this.anIntArray451[local53] -= Static485.anInt9204;
								this.anIntArray450[local53] -= Static80.anInt2160;
								if (arg4 != 0) {
									local59 = Class262.anIntArray420[arg4];
									local375 = Class262.anIntArray421[arg4];
									local397 = this.anIntArray451[local53] * local59 + local375 * this.anIntArray452[local53] + 16383 >> 14;
									this.anIntArray451[local53] = local375 * this.anIntArray451[local53] + 16383 - this.anIntArray452[local53] * local59 >> 14;
									this.anIntArray452[local53] = local397;
								}
								if (arg2 != 0) {
									local59 = Class262.anIntArray420[arg2];
									local375 = Class262.anIntArray421[arg2];
									local397 = this.anIntArray451[local53] * local375 + 16383 - this.anIntArray450[local53] * local59 >> 14;
									this.anIntArray450[local53] = local59 * this.anIntArray451[local53] + local375 * this.anIntArray450[local53] + 16383 >> 14;
									this.anIntArray451[local53] = local397;
								}
								if (arg3 != 0) {
									local59 = Class262.anIntArray420[arg3];
									local375 = Class262.anIntArray421[arg3];
									local397 = local59 * this.anIntArray450[local53] + local375 * this.anIntArray452[local53] + 16383 >> 14;
									this.anIntArray450[local53] = this.anIntArray450[local53] * local375 + 16383 - local59 * this.anIntArray452[local53] >> 14;
									this.anIntArray452[local53] = local397;
								}
								this.anIntArray452[local53] += Static365.anInt7042;
								this.anIntArray451[local53] += Static485.anInt9204;
								this.anIntArray450[local53] += Static80.anInt2160;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray44.length) {
							local51 = this.anIntArrayArray44[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray104 == null || (this.aShortArray104[local59] & arg6) != 0) {
									local375 = this.anIntArray449[local59];
									local397 = this.anIntArray449[local59 + 1];
									for (local424 = local375; local424 < local397; local424++) {
										local455 = this.aShortArray99[local424] - 1;
										if (local455 == -1) {
											break;
										}
										if (arg4 != 0) {
											local459 = Class262.anIntArray420[arg4];
											local463 = Class262.anIntArray421[arg4];
											local467 = local463 * this.aShortArray102[local455] + local459 * this.aShortArray98[local455] + 16383 >> 14;
											this.aShortArray98[local455] = (short) (local463 * this.aShortArray98[local455] + 16383 - this.aShortArray102[local455] * local459 >> 14);
											this.aShortArray102[local455] = (short) local467;
										}
										if (arg2 != 0) {
											local459 = Class262.anIntArray420[arg2];
											local463 = Class262.anIntArray421[arg2];
											local467 = local463 * this.aShortArray98[local455] + 16383 - local459 * this.aShortArray101[local455] >> 14;
											this.aShortArray101[local455] = (short) (local463 * this.aShortArray101[local455] + local459 * this.aShortArray98[local455] + 16383 >> 14);
											this.aShortArray98[local455] = (short) local467;
										}
										if (arg3 != 0) {
											local459 = Class262.anIntArray420[arg3];
											local463 = Class262.anIntArray421[arg3];
											local467 = local463 * this.aShortArray102[local455] + this.aShortArray101[local455] * local459 + 16383 >> 14;
											this.aShortArray101[local455] = (short) (local463 * this.aShortArray101[local455] + 16383 - local459 * this.aShortArray102[local455] >> 14);
											this.aShortArray102[local455] = (short) local467;
										}
									}
								}
							}
						}
					}
					if (this.aClass209_13 == null && this.aClass209_14 != null) {
						this.aClass209_14.anInterface16_6 = null;
					}
					if (this.aClass209_13 != null) {
						this.aClass209_13.anInterface16_6 = null;
					}
				}
			} else {
				local31 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local255 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static260.aBoolean369) {
					local375 = Static365.anInt7042 * arg7[0] + arg7[3] * Static485.anInt9204 + Static80.anInt2160 * arg7[6] + 8192 >> 14;
					local397 = arg7[7] * Static80.anInt2160 + arg7[4] * Static485.anInt9204 + Static365.anInt7042 * arg7[1] + 8192 >> 14;
					local375 += local255;
					local424 = arg7[5] * Static485.anInt9204 + arg7[2] * Static365.anInt7042 + arg7[8] * Static80.anInt2160 + 8192 >> 14;
					local397 += local53;
					local424 += local59;
					Static365.anInt7042 = local375;
					Static485.anInt9204 = local397;
					Static80.anInt2160 = local424;
					Static260.aBoolean369 = false;
				}
				@Pc(443) int[] local443 = new int[9];
				local397 = Class262.anIntArray421[arg2];
				local424 = Class262.anIntArray420[arg2];
				local455 = Class262.anIntArray421[arg3];
				local459 = Class262.anIntArray420[arg3];
				local463 = Class262.anIntArray421[arg4];
				local467 = Class262.anIntArray420[arg4];
				local475 = local424 * local463 + 8192 >> 14;
				local483 = local467 * local424 + 8192 >> 14;
				local443[5] = -local424;
				local443[2] = local397 * local459 + 8192 >> 14;
				local443[1] = local475 * local459 + -local455 * local467 + 8192 >> 14;
				local443[0] = local455 * local463 + local483 * local459 + 8192 >> 14;
				local443[6] = local483 * local455 + local463 * -local459 + 8192 >> 14;
				local443[7] = local467 * local459 + local455 * local475 + 8192 >> 14;
				local443[8] = local397 * local455 + 8192 >> 14;
				local443[3] = local467 * local397 + 8192 >> 14;
				local443[4] = local463 * local397 + 8192 >> 14;
				@Pc(613) int local613 = -Static485.anInt9204 * local443[1] + -Static365.anInt7042 * local443[0] + local443[2] * -Static80.anInt2160 + 8192 >> 14;
				local638 = -Static80.anInt2160 * local443[5] + local443[4] * -Static485.anInt9204 + local443[3] * -Static365.anInt7042 + 8192 >> 14;
				local665 = -Static365.anInt7042 * local443[6] + local443[7] * -Static485.anInt9204 + -Static80.anInt2160 * local443[8] + 8192 >> 14;
				local670 = local613 + Static365.anInt7042;
				@Pc(674) int local674 = Static485.anInt9204 + local638;
				local678 = local665 + Static80.anInt2160;
				@Pc(681) int[] local681 = new int[9];
				for (local683 = 0; local683 < 3; local683++) {
					for (local687 = 0; local687 < 3; local687++) {
						local691 = 0;
						for (local693 = 0; local693 < 3; local693++) {
							local691 += arg7[local687 * 3 + local693] * local443[local683 * 3 + local693];
						}
						local681[local683 * 3 + local687] = local691 + 8192 >> 14;
					}
				}
				local687 = local443[1] * local53 + local255 * local443[0] + local443[2] * local59 + 8192 >> 14;
				local691 = local59 * local443[5] + local53 * local443[4] + local255 * local443[3] + 8192 >> 14;
				local693 = local443[8] * local59 + local443[7] * local53 + local443[6] * local255 + 8192 >> 14;
				local691 += local674;
				local687 += local670;
				local693 += local678;
				local826 = new int[9];
				for (local828 = 0; local828 < 3; local828++) {
					for (local832 = 0; local832 < 3; local832++) {
						local836 = 0;
						for (local838 = 0; local838 < 3; local838++) {
							local836 += arg7[local838 + local828 * 3] * local681[local838 * 3 + local832];
						}
						local826[local828 * 3 + local832] = local836 + 8192 >> 14;
					}
				}
				local832 = local693 * arg7[2] + local691 * arg7[1] + local687 * arg7[0] + 8192 >> 14;
				local836 = local691 * arg7[4] + local687 * arg7[3] + arg7[5] * local693 + 8192 >> 14;
				local838 = local691 * arg7[7] + arg7[6] * local687 + arg7[8] * local693 + 8192 >> 14;
				local836 += local35;
				local832 += local31;
				local838 += local41;
				for (local966 = 0; local966 < local8; local966++) {
					@Pc(972) int local972 = arg1[local966];
					if (local972 < this.anIntArrayArray44.length) {
						@Pc(982) int[] local982 = this.anIntArrayArray44[local972];
						for (@Pc(984) int local984 = 0; local984 < local982.length; local984++) {
							@Pc(990) int local990 = local982[local984];
							if (this.aShortArray104 == null || (this.aShortArray104[local990] & arg6) != 0) {
								@Pc(1034) int local1034 = this.anIntArray450[local990] * local826[2] + local826[0] * this.anIntArray452[local990] + this.anIntArray451[local990] * local826[1] + 8192 >> 14;
								@Pc(1065) int local1065 = this.anIntArray450[local990] * local826[5] + local826[4] * this.anIntArray451[local990] + this.anIntArray452[local990] * local826[3] + 8192 >> 14;
								@Pc(1069) int local1069 = local1065 + local836;
								@Pc(1073) int local1073 = local1034 + local832;
								@Pc(1104) int local1104 = this.anIntArray450[local990] * local826[8] + this.anIntArray451[local990] * local826[7] + local826[6] * this.anIntArray452[local990] + 8192 >> 14;
								@Pc(1108) int local1108 = local1104 + local838;
								this.anIntArray452[local990] = local1073;
								this.anIntArray451[local990] = local1069;
								this.anIntArray450[local990] = local1108;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2593) Class98 local2593;
			@Pc(2598) Class131 local2598;
			if (arg0 == 5) {
				if (this.anIntArrayArray43 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray43.length > local35) {
							local253 = this.anIntArrayArray43[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local53 = local253[local255];
								if (this.aShortArray100 == null || (arg6 & this.aShortArray100[local53]) != 0) {
									local59 = (this.aByteArray74[local53] & 0xFF) + (arg2 * 8);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray74[local53] = (byte) local59;
									if (this.aClass209_14 != null) {
										this.aClass209_14.anInterface16_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass98Array1 != null) {
						for (local35 = 0; local35 < this.anInt8024; local35++) {
							local2593 = this.aClass98Array1[local35];
							local2598 = this.aClass131Array1[local35];
							local2598.anInt3746 = local2598.anInt3746 & 0xFFFFFF | 255 - (this.aByteArray74[local2593.anInt2884] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2853) Class131 local2853;
				if (arg0 == 8) {
					if (this.anIntArrayArray42 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray42.length > local35) {
								local253 = this.anIntArrayArray42[local35];
								for (local255 = 0; local255 < local253.length; local255++) {
									local2853 = this.aClass131Array1[local253[local255]];
									local2853.anInt3747 += arg3;
									local2853.anInt3752 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray42 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray42.length > local35) {
								local253 = this.anIntArrayArray42[local35];
								for (local255 = 0; local255 < local253.length; local255++) {
									local2853 = this.aClass131Array1[local253[local255]];
									local2853.anInt3750 = arg2 * local2853.anInt3750 >> 7;
									local2853.anInt3754 = local2853.anInt3754 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray42 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (this.anIntArrayArray42.length > local35) {
							local253 = this.anIntArrayArray42[local35];
							for (local255 = 0; local255 < local253.length; local255++) {
								local2853 = this.aClass131Array1[local253[local255]];
								local2853.anInt3745 = local2853.anInt3745 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray43 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray43.length) {
						local253 = this.anIntArrayArray43[local35];
						for (local255 = 0; local255 < local253.length; local255++) {
							local53 = local253[local255];
							if (this.aShortArray100 == null || (arg6 & this.aShortArray100[local53]) != 0) {
								local59 = this.aShortArray105[local53] & 0xFFFF;
								local375 = local59 >> 10 & 0x3F;
								local397 = local59 >> 7 & 0x7;
								@Pc(2694) int local2694 = local375 + arg2 & 0x3F;
								local424 = local59 & 0x7F;
								local397 += arg3 / 4;
								local424 += arg4;
								if (local397 < 0) {
									local397 = 0;
								} else if (local397 > 7) {
									local397 = 7;
								}
								if (local424 < 0) {
									local424 = 0;
								} else if (local424 > 127) {
									local424 = 127;
								}
								this.aShortArray105[local53] = (short) (local424 | local2694 << 10 | local397 << 7);
								if (this.aClass209_14 != null) {
									this.aClass209_14.anInterface16_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass98Array1 != null) {
					for (local35 = 0; local35 < this.anInt8024; local35++) {
						local2593 = this.aClass98Array1[local35];
						local2598 = this.aClass131Array1[local35];
						local2598.anInt3746 = Static394.anIntArray413[this.aShortArray105[local2593.anInt2884] & 0xFFFF] & 0xFFFFFF | local2598.anInt3746 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray44.length) {
					local253 = this.anIntArrayArray44[local35];
					for (local255 = 0; local255 < local253.length; local255++) {
						local53 = local253[local255];
						if (this.aShortArray104 == null || (arg6 & this.aShortArray104[local53]) != 0) {
							this.anIntArray452[local53] -= Static365.anInt7042;
							this.anIntArray451[local53] -= Static485.anInt9204;
							this.anIntArray450[local53] -= Static80.anInt2160;
							this.anIntArray452[local53] = this.anIntArray452[local53] * arg2 >> 7;
							this.anIntArray451[local53] = arg3 * this.anIntArray451[local53] >> 7;
							this.anIntArray450[local53] = this.anIntArray450[local53] * arg4 >> 7;
							this.anIntArray452[local53] += Static365.anInt7042;
							this.anIntArray451[local53] += Static485.anInt9204;
							this.anIntArray450[local53] += Static80.anInt2160;
						}
					}
				}
			}
		} else {
			local31 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local255 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static260.aBoolean369) {
				local375 = arg7[6] * Static80.anInt2160 + Static485.anInt9204 * arg7[3] + arg7[0] * Static365.anInt7042 + 8192 >> 14;
				local397 = arg7[7] * Static80.anInt2160 + arg7[4] * Static485.anInt9204 + Static365.anInt7042 * arg7[1] + 8192 >> 14;
				local397 += local53;
				local375 += local255;
				local424 = Static80.anInt2160 * arg7[8] + Static485.anInt9204 * arg7[5] + arg7[2] * Static365.anInt7042 + 8192 >> 14;
				local424 += local59;
				Static485.anInt9204 = local397;
				Static365.anInt7042 = local375;
				Static80.anInt2160 = local424;
				Static260.aBoolean369 = false;
			}
			local375 = arg2 << 15 >> 7;
			local397 = arg3 << 15 >> 7;
			local424 = arg4 << 15 >> 7;
			local455 = -Static365.anInt7042 * local375 + 8192 >> 14;
			local459 = local397 * -Static485.anInt9204 + 8192 >> 14;
			local463 = local424 * -Static80.anInt2160 + 8192 >> 14;
			local467 = Static365.anInt7042 + local455;
			local475 = Static485.anInt9204 + local459;
			local483 = Static80.anInt2160 + local463;
			@Pc(2021) int[] local2021 = new int[] { local375 * arg7[0] + 8192 >> 14, local375 * arg7[3] + 8192 >> 14, local375 * arg7[6] + 8192 >> 14, arg7[1] * local397 + 8192 >> 14, arg7[4] * local397 + 8192 >> 14, local397 * arg7[7] + 8192 >> 14, local424 * arg7[2] + 8192 >> 14, local424 * arg7[5] + 8192 >> 14, local424 * arg7[8] + 8192 >> 14 };
			local638 = local375 * local255 + 8192 >> 14;
			local665 = local397 * local53 + 8192 >> 14;
			@Pc(2149) int local2149 = local665 + local475;
			@Pc(2153) int local2153 = local638 + local467;
			local670 = local59 * local424 + 8192 >> 14;
			@Pc(2165) int local2165 = local670 + local483;
			@Pc(2168) int[] local2168 = new int[9];
			@Pc(2174) int local2174;
			for (local678 = 0; local678 < 3; local678++) {
				for (local2174 = 0; local2174 < 3; local2174++) {
					local683 = 0;
					for (local687 = 0; local687 < 3; local687++) {
						local683 += arg7[local687 + local678 * 3] * local2021[local2174 + local687 * 3];
					}
					local2168[local2174 + local678 * 3] = local683 + 8192 >> 14;
				}
			}
			local2174 = local2149 * arg7[1] + local2153 * arg7[0] + local2165 * arg7[2] + 8192 >> 14;
			local683 = local2153 * arg7[3] + local2149 * arg7[4] + local2165 * arg7[5] + 8192 >> 14;
			local683 += local35;
			local687 = local2165 * arg7[8] + arg7[7] * local2149 + arg7[6] * local2153 + 8192 >> 14;
			local2174 += local31;
			local687 += local41;
			for (local691 = 0; local691 < local8; local691++) {
				local693 = arg1[local691];
				if (this.anIntArrayArray44.length > local693) {
					local826 = this.anIntArrayArray44[local693];
					for (local828 = 0; local828 < local826.length; local828++) {
						local832 = local826[local828];
						if (this.aShortArray104 == null || (this.aShortArray104[local832] & arg6) != 0) {
							local836 = local2168[2] * this.anIntArray450[local832] + this.anIntArray451[local832] * local2168[1] + this.anIntArray452[local832] * local2168[0] + 8192 >> 14;
							local838 = this.anIntArray450[local832] * local2168[5] + this.anIntArray451[local832] * local2168[4] + local2168[3] * this.anIntArray452[local832] + 8192 >> 14;
							@Pc(2415) int local2415 = local836 + local2174;
							local966 = this.anIntArray451[local832] * local2168[7] + this.anIntArray452[local832] * local2168[6] + local2168[8] * this.anIntArray450[local832] + 8192 >> 14;
							@Pc(2451) int local2451 = local838 + local683;
							this.anIntArray452[local832] = local2415;
							@Pc(2460) int local2460 = local966 + local687;
							this.anIntArray451[local832] = local2451;
							this.anIntArray450[local832] = local2460;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7673(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			local24 = 0;
			Static485.anInt9204 = 0;
			Static80.anInt2160 = 0;
			Static365.anInt7042 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray44.length) {
					local52 = this.anIntArrayArray44[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static365.anInt7042 += this.anIntArray452[local60];
						Static485.anInt9204 += this.anIntArray451[local60];
						Static80.anInt2160 += this.anIntArray450[local60];
						local24++;
					}
				}
			}
			if (local24 > 0) {
				Static365.anInt7042 = Static365.anInt7042 / local24 + local14;
				Static80.anInt2160 = Static80.anInt2160 / local24 + local22;
				Static485.anInt9204 = local18 + Static485.anInt9204 / local24;
			} else {
				Static485.anInt9204 = local18;
				Static365.anInt7042 = local14;
				Static80.anInt2160 = local22;
			}
			return;
		}
		@Pc(157) int[] local157;
		@Pc(159) int local159;
		if (arg0 == 1) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray44.length) {
					local157 = this.anIntArrayArray44[local32];
					for (local159 = 0; local159 < local157.length; local159++) {
						local54 = local157[local159];
						this.anIntArray452[local54] += local14;
						this.anIntArray451[local54] += local18;
						this.anIntArray450[local54] += local22;
					}
				}
			}
			return;
		}
		@Pc(277) int local277;
		@Pc(295) int local295;
		@Pc(750) int local750;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray44.length) {
					local157 = this.anIntArrayArray44[local32];
					if ((arg5 & 0x1) == 0) {
						for (local159 = 0; local159 < local157.length; local159++) {
							local54 = local157[local159];
							this.anIntArray452[local54] -= Static365.anInt7042;
							this.anIntArray451[local54] -= Static485.anInt9204;
							this.anIntArray450[local54] -= Static80.anInt2160;
							if (arg4 != 0) {
								local60 = Class262.anIntArray420[arg4];
								local277 = Class262.anIntArray421[arg4];
								local295 = this.anIntArray452[local54] * local277 + this.anIntArray451[local54] * local60 + 16383 >> 14;
								this.anIntArray451[local54] = this.anIntArray451[local54] * local277 + 16383 - this.anIntArray452[local54] * local60 >> 14;
								this.anIntArray452[local54] = local295;
							}
							if (arg2 != 0) {
								local60 = Class262.anIntArray420[arg2];
								local277 = Class262.anIntArray421[arg2];
								local295 = local277 * this.anIntArray451[local54] + 16383 - local60 * this.anIntArray450[local54] >> 14;
								this.anIntArray450[local54] = local60 * this.anIntArray451[local54] + this.anIntArray450[local54] * local277 + 16383 >> 14;
								this.anIntArray451[local54] = local295;
							}
							if (arg3 != 0) {
								local60 = Class262.anIntArray420[arg3];
								local277 = Class262.anIntArray421[arg3];
								local295 = this.anIntArray450[local54] * local60 + local277 * this.anIntArray452[local54] + 16383 >> 14;
								this.anIntArray450[local54] = this.anIntArray450[local54] * local277 + 16383 - local60 * this.anIntArray452[local54] >> 14;
								this.anIntArray452[local54] = local295;
							}
							this.anIntArray452[local54] += Static365.anInt7042;
							this.anIntArray451[local54] += Static485.anInt9204;
							this.anIntArray450[local54] += Static80.anInt2160;
						}
					} else {
						for (local159 = 0; local159 < local157.length; local159++) {
							local54 = local157[local159];
							this.anIntArray452[local54] -= Static365.anInt7042;
							this.anIntArray451[local54] -= Static485.anInt9204;
							this.anIntArray450[local54] -= Static80.anInt2160;
							if (arg2 != 0) {
								local60 = Class262.anIntArray420[arg2];
								local277 = Class262.anIntArray421[arg2];
								local295 = local277 * this.anIntArray451[local54] + 16383 - this.anIntArray450[local54] * local60 >> 14;
								this.anIntArray450[local54] = local277 * this.anIntArray450[local54] + this.anIntArray451[local54] * local60 + 16383 >> 14;
								this.anIntArray451[local54] = local295;
							}
							if (arg4 != 0) {
								local60 = Class262.anIntArray420[arg4];
								local277 = Class262.anIntArray421[arg4];
								local295 = this.anIntArray452[local54] * local277 + this.anIntArray451[local54] * local60 + 16383 >> 14;
								this.anIntArray451[local54] = local277 * this.anIntArray451[local54] + 16383 - this.anIntArray452[local54] * local60 >> 14;
								this.anIntArray452[local54] = local295;
							}
							if (arg3 != 0) {
								local60 = Class262.anIntArray420[arg3];
								local277 = Class262.anIntArray421[arg3];
								local295 = this.anIntArray450[local54] * local60 + local277 * this.anIntArray452[local54] + 16383 >> 14;
								this.anIntArray450[local54] = this.anIntArray450[local54] * local277 + 16383 - this.anIntArray452[local54] * local60 >> 14;
								this.anIntArray452[local54] = local295;
							}
							this.anIntArray452[local54] += Static365.anInt7042;
							this.anIntArray451[local54] += Static485.anInt9204;
							this.anIntArray450[local54] += Static80.anInt2160;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray44.length > local38) {
						local52 = this.anIntArrayArray44[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local277 = this.anIntArray449[local60];
							local295 = this.anIntArray449[local60 + 1];
							for (local750 = local277; local750 < local295; local750++) {
								@Pc(759) int local759 = this.aShortArray99[local750] - 1;
								if (local759 == -1) {
									break;
								}
								@Pc(771) int local771;
								@Pc(775) int local775;
								@Pc(794) int local794;
								if (arg4 != 0) {
									local771 = Class262.anIntArray420[arg4];
									local775 = Class262.anIntArray421[arg4];
									local794 = local771 * this.aShortArray98[local759] + local775 * this.aShortArray102[local759] + 16383 >> 14;
									this.aShortArray98[local759] = (short) (local775 * this.aShortArray98[local759] + 16383 - local771 * this.aShortArray102[local759] >> 14);
									this.aShortArray102[local759] = (short) local794;
								}
								if (arg2 != 0) {
									local771 = Class262.anIntArray420[arg2];
									local775 = Class262.anIntArray421[arg2];
									local794 = local775 * this.aShortArray98[local759] + 16383 - this.aShortArray101[local759] * local771 >> 14;
									this.aShortArray101[local759] = (short) (local775 * this.aShortArray101[local759] + local771 * this.aShortArray98[local759] + 16383 >> 14);
									this.aShortArray98[local759] = (short) local794;
								}
								if (arg3 != 0) {
									local771 = Class262.anIntArray420[arg3];
									local775 = Class262.anIntArray421[arg3];
									local794 = local771 * this.aShortArray101[local759] + local775 * this.aShortArray102[local759] + 16383 >> 14;
									this.aShortArray101[local759] = (short) (local775 * this.aShortArray101[local759] + 16383 - local771 * this.aShortArray102[local759] >> 14);
									this.aShortArray102[local759] = (short) local794;
								}
							}
						}
					}
				}
				if (this.aClass209_13 == null && this.aClass209_14 != null) {
					this.aClass209_14.anInterface16_6 = null;
				}
				if (this.aClass209_13 != null) {
					this.aClass209_13.anInterface16_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray44.length) {
					local157 = this.anIntArrayArray44[local32];
					for (local159 = 0; local159 < local157.length; local159++) {
						local54 = local157[local159];
						this.anIntArray452[local54] -= Static365.anInt7042;
						this.anIntArray451[local54] -= Static485.anInt9204;
						this.anIntArray450[local54] -= Static80.anInt2160;
						this.anIntArray452[local54] = arg2 * this.anIntArray452[local54] >> 7;
						this.anIntArray451[local54] = this.anIntArray451[local54] * arg3 >> 7;
						this.anIntArray450[local54] = this.anIntArray450[local54] * arg4 >> 7;
						this.anIntArray452[local54] += Static365.anInt7042;
						this.anIntArray451[local54] += Static485.anInt9204;
						this.anIntArray450[local54] += Static80.anInt2160;
					}
				}
			}
		} else {
			@Pc(1198) Class98 local1198;
			@Pc(1203) Class131 local1203;
			if (arg0 == 5) {
				if (this.anIntArrayArray43 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray43.length > local32) {
							local157 = this.anIntArrayArray43[local32];
							for (local159 = 0; local159 < local157.length; local159++) {
								local54 = local157[local159];
								local60 = arg2 * 8 + (this.aByteArray74[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray74[local54] = (byte) local60;
							}
							if (local157.length > 0 && this.aClass209_14 != null) {
								this.aClass209_14.anInterface16_6 = null;
							}
						}
					}
					if (this.aClass98Array1 != null) {
						for (local32 = 0; local32 < this.anInt8024; local32++) {
							local1198 = this.aClass98Array1[local32];
							local1203 = this.aClass131Array1[local32];
							local1203.anInt3746 = 255 - (this.aByteArray74[local1198.anInt2884] & 0xFF) << 24 | local1203.anInt3746 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1463) Class131 local1463;
				if (arg0 == 8) {
					if (this.anIntArrayArray42 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray42.length > local32) {
								local157 = this.anIntArrayArray42[local32];
								for (local159 = 0; local159 < local157.length; local159++) {
									local1463 = this.aClass131Array1[local157[local159]];
									local1463.anInt3752 += arg2;
									local1463.anInt3747 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray42 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray42.length) {
								local157 = this.anIntArrayArray42[local32];
								for (local159 = 0; local159 < local157.length; local159++) {
									local1463 = this.aClass131Array1[local157[local159]];
									local1463.anInt3754 = arg3 * local1463.anInt3754 >> 7;
									local1463.anInt3750 = local1463.anInt3750 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray42 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray42.length) {
							local157 = this.anIntArrayArray42[local32];
							for (local159 = 0; local159 < local157.length; local159++) {
								local1463 = this.aClass131Array1[local157[local159]];
								local1463.anInt3745 = local1463.anInt3745 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray43 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray43.length > local32) {
						local157 = this.anIntArrayArray43[local32];
						for (local159 = 0; local159 < local157.length; local159++) {
							local54 = local157[local159];
							local60 = this.aShortArray105[local54] & 0xFFFF;
							local277 = local60 >> 10 & 0x3F;
							local295 = local60 >> 7 & 0x7;
							local750 = local60 & 0x7F;
							local295 += arg3 / 4;
							@Pc(1302) int local1302 = local277 + arg2 & 0x3F;
							if (local295 < 0) {
								local295 = 0;
							} else if (local295 > 7) {
								local295 = 7;
							}
							local750 += arg4;
							if (local750 < 0) {
								local750 = 0;
							} else if (local750 > 127) {
								local750 = 127;
							}
							this.aShortArray105[local54] = (short) (local750 | local1302 << 10 | local295 << 7);
						}
						if (local157.length > 0 && this.aClass209_14 != null) {
							this.aClass209_14.anInterface16_6 = null;
						}
					}
				}
				if (this.aClass98Array1 != null) {
					for (local32 = 0; local32 < this.anInt8024; local32++) {
						local1198 = this.aClass98Array1[local32];
						local1203 = this.aClass131Array1[local32];
						local1203.anInt3746 = local1203.anInt3746 & 0xFF000000 | Static394.anIntArray413[this.aShortArray105[local1198.anInt2884] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	private void method6284() {
		if (this.aClass98Array1 == null) {
			return;
		}
		@Pc(17) Class81_Sub2 local17 = this.aClass7_Sub2_34.aClass81_Sub2_2;
		this.aClass7_Sub2_34.method4303();
		this.aClass7_Sub2_34.ZA(!this.aBoolean578);
		this.aClass7_Sub2_34.method4290(false);
		this.aClass7_Sub2_34.method4354(null, this.aClass7_Sub2_34.aClass209_12, null, this.aClass7_Sub2_34.aClass209_11);
		for (@Pc(49) int local49 = 0; local49 < this.anInt8024; local49++) {
			@Pc(56) Class98 local56 = this.aClass98Array1[local49];
			@Pc(61) Class131 local61 = this.aClass131Array1[local49];
			if (!local56.aBoolean213 || !this.aClass7_Sub2_34.method7850()) {
				@Pc(90) float local90 = (float) (this.anIntArray452[local56.anInt2879] + this.anIntArray452[local56.anInt2881] + this.anIntArray452[local56.anInt2880]) * 0.3333333F;
				@Pc(111) float local111 = (float) (this.anIntArray451[local56.anInt2881] + this.anIntArray451[local56.anInt2879] + this.anIntArray451[local56.anInt2880]) * 0.3333333F;
				@Pc(133) float local133 = (float) (this.anIntArray450[local56.anInt2880] + this.anIntArray450[local56.anInt2879] + this.anIntArray450[local56.anInt2881]) * 0.3333333F;
				@Pc(147) float local147 = local111 * Static335.aFloat157 + local90 * Static557.aFloat203 + Static284.aFloat150 * local133 + Static212.aFloat100;
				@Pc(161) float local161 = local133 * Static244.aFloat197 + Static240.aFloat108 * local90 + Static380.aFloat182 * local111 + Static118.aFloat66;
				@Pc(175) float local175 = Static197.aFloat96 + Static307.aFloat152 * local111 + Static226.aFloat105 * local90 + Static413.aFloat186 * local133;
				local17.method3234(local61.anInt3745, local61.anInt3750 * local56.aShort24 >> 7, local56.aShort22 * local61.anInt3754 >> 7, (float) local61.anInt3752 + local147, (float) local61.anInt3747 - local161, (float) local56.anInt2878 - local175);
				this.aClass7_Sub2_34.method4322(local17);
				@Pc(218) int local218 = local61.anInt3746;
				OpenGL.glColor4ub((byte) (local218 >> 16), (byte) (local218 >> 8), (byte) local218, (byte) (local218 >> 24));
				this.aClass7_Sub2_34.method4339(local56.aShort23);
				this.aClass7_Sub2_34.method4343(local56.aByte49);
				this.aClass7_Sub2_34.method4304(4);
			}
		}
		this.aClass7_Sub2_34.ZA(true);
		this.aClass7_Sub2_34.method4325();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt8050; local7++) {
			local16 = this.aShortArray105[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 -= -(arg3 * (arg0 - local22) >> 7);
			}
			if (arg1 != -1) {
				local28 -= -(arg3 * (arg1 - local28) >> 7);
			}
			@Pc(60) int local60 = local16 & 0x7F;
			if (arg2 != -1) {
				local60 -= -((arg2 - local60) * arg3 >> 7);
			}
			this.aShortArray105[local7] = (short) (local60 | local28 << 7 | local22 << 10);
		}
		if (this.aClass98Array1 != null) {
			for (local16 = 0; local16 < this.anInt8024; local16++) {
				@Pc(107) Class98 local107 = this.aClass98Array1[local16];
				@Pc(112) Class131 local112 = this.aClass131Array1[local16];
				local112.anInt3746 = local112.anInt3746 & 0xFF000000 | Static394.anIntArray413[this.aShortArray105[local107.anInt2884] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass209_14 != null) {
			this.aClass209_14.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "()V")
	@Override
	public void method7676() {
		if (this.anInt8062 <= 0 || this.anInt8020 <= 0) {
			return;
		}
		this.method6292(false);
		if ((this.aByte114 & 0x10) == 0 && this.aClass153_1.anInterface14_3 == null) {
			this.method6288(false);
		}
		this.method6289();
	}

	@OriginalMember(owner = "client!qb", name = "FA", descriptor = "()V")
	@Override
	public void FA() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8032; local7++) {
			this.anIntArray450[local7] = -this.anIntArray450[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt8062; local29++) {
			this.aShortArray101[local29] = (short) -this.aShortArray101[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt8050; local52++) {
			@Pc(59) short local59 = this.aShortArray106[local52];
			this.aShortArray106[local52] = this.aShortArray107[local52];
			this.aShortArray107[local52] = local59;
		}
		if (this.aClass209_13 == null && this.aClass209_14 != null) {
			this.aClass209_14.anInterface16_6 = null;
		}
		if (this.aClass209_13 != null) {
			this.aClass209_13.anInterface16_6 = null;
		}
		if (this.aClass153_1 != null) {
			this.aClass153_1.anInterface14_3 = null;
		}
		if (this.aClass209_15 != null) {
			this.aClass209_15.anInterface16_6 = null;
		}
		this.aBoolean579 = false;
	}

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "()I")
	@Override
	public int H() {
		if (!this.aBoolean579) {
			this.method6280();
		}
		return this.aShort96;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIIIIIIII)Z")
	private boolean method6286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > arg7 && arg7 < arg4 && arg5 > arg7) {
			return false;
		} else if (arg7 > arg2 && arg7 > arg4 && arg7 > arg5) {
			return false;
		} else if (arg6 > arg0 && arg3 > arg0 && arg1 > arg0) {
			return false;
		} else {
			return arg6 >= arg0 || arg3 >= arg0 || arg0 <= arg1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!q;Lclient!j;II)V")
	@Override
	public void method7686(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8062 == 0) {
			return;
		}
		@Pc(13) Class81_Sub2 local13 = this.aClass7_Sub2_34.aClass81_Sub2_3;
		@Pc(16) Class81_Sub2 local16 = (Class81_Sub2) arg0;
		if (!this.aBoolean579) {
			this.method6280();
		}
		Static197.aFloat96 = local13.aFloat86 * local16.aFloat93 + local13.aFloat85 * local16.aFloat88 + local16.aFloat87 * local13.aFloat84 + local13.aFloat93;
		Static307.aFloat152 = local16.aFloat85 * local13.aFloat86 + local16.aFloat95 * local13.aFloat84 + local13.aFloat85 * local16.aFloat92;
		@Pc(69) float local69 = Static307.aFloat152 * (float) this.aShort97 + Static197.aFloat96;
		@Pc(77) float local77 = Static197.aFloat96 + (float) this.aShort96 * Static307.aFloat152;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local93 = (float) -this.aShort94 + local77;
			local87 = (float) this.aShort94 + local69;
		} else {
			local87 = (float) this.aShort94 + local77;
			local93 = local69 - (float) this.aShort94;
		}
		if (local93 >= this.aClass7_Sub2_34.aFloat138 || (float) this.aClass7_Sub2_34.anInt5624 >= local87) {
			return;
		}
		Static335.aFloat157 = local16.aFloat85 * local13.aFloat91 + local16.aFloat92 * local13.aFloat95 + local16.aFloat95 * local13.aFloat94;
		Static212.aFloat100 = local13.aFloat91 * local16.aFloat93 + local13.aFloat94 * local16.aFloat87 + local16.aFloat88 * local13.aFloat95 + local13.aFloat87;
		@Pc(170) float local170 = Static212.aFloat100 + (float) this.aShort97 * Static335.aFloat157;
		@Pc(178) float local178 = Static212.aFloat100 + (float) this.aShort96 * Static335.aFloat157;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local170 > local178) {
			local193 = (float) this.aClass7_Sub2_34.anInt5627 * (local170 + (float) this.aShort94);
			local204 = (local178 - (float) this.aShort94) * (float) this.aClass7_Sub2_34.anInt5627;
		} else {
			local193 = (float) this.aClass7_Sub2_34.anInt5627 * ((float) this.aShort94 + local178);
			local204 = (float) this.aClass7_Sub2_34.anInt5627 * (local170 - (float) this.aShort94);
		}
		if (this.aClass7_Sub2_34.aFloat130 <= local204 / (float) arg2 || this.aClass7_Sub2_34.aFloat134 >= local193 / (float) arg2) {
			return;
		}
		Static118.aFloat66 = local13.aFloat88 + local13.aFloat89 * local16.aFloat87 + local16.aFloat88 * local13.aFloat92 + local16.aFloat93 * local13.aFloat90;
		Static380.aFloat182 = local16.aFloat85 * local13.aFloat90 + local16.aFloat92 * local13.aFloat92 + local16.aFloat95 * local13.aFloat89;
		@Pc(295) float local295 = Static118.aFloat66 + (float) this.aShort97 * Static380.aFloat182;
		@Pc(303) float local303 = (float) this.aShort96 * Static380.aFloat182 + Static118.aFloat66;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local295 > local303) {
			local330 = (float) this.aClass7_Sub2_34.anInt5643 * ((float) -this.aShort94 + local303);
			local318 = (local295 + (float) this.aShort94) * (float) this.aClass7_Sub2_34.anInt5643;
		} else {
			local318 = ((float) this.aShort94 + local303) * (float) this.aClass7_Sub2_34.anInt5643;
			local330 = (float) this.aClass7_Sub2_34.anInt5643 * ((float) -this.aShort94 + local295);
		}
		if (local330 / (float) arg2 >= this.aClass7_Sub2_34.aFloat143 || this.aClass7_Sub2_34.aFloat146 >= local318 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass98Array1 != null) {
			Static557.aFloat203 = local13.aFloat91 * local16.aFloat84 + local16.aFloat89 * local13.aFloat95 + local13.aFloat94 * local16.aFloat94;
			Static413.aFloat186 = local16.aFloat86 * local13.aFloat86 + local16.aFloat91 * local13.aFloat84 + local13.aFloat85 * local16.aFloat90;
			Static226.aFloat105 = local16.aFloat89 * local13.aFloat85 + local16.aFloat94 * local13.aFloat84 + local16.aFloat84 * local13.aFloat86;
			Static240.aFloat108 = local13.aFloat90 * local16.aFloat84 + local16.aFloat89 * local13.aFloat92 + local16.aFloat94 * local13.aFloat89;
			Static284.aFloat150 = local16.aFloat91 * local13.aFloat94 + local13.aFloat95 * local16.aFloat90 + local13.aFloat91 * local16.aFloat86;
			Static244.aFloat197 = local13.aFloat90 * local16.aFloat86 + local16.aFloat90 * local13.aFloat92 + local13.aFloat89 * local16.aFloat91;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.aShort95 + this.aShort99 >> 1;
			@Pc(507) int local507 = this.aShort93 + this.aShort92 >> 1;
			@Pc(526) int local526 = (int) ((float) local507 * Static284.aFloat150 + Static335.aFloat157 * (float) this.aShort97 + (float) local499 * Static557.aFloat203 + Static212.aFloat100);
			@Pc(545) int local545 = (int) (Static380.aFloat182 * (float) this.aShort97 + Static118.aFloat66 + Static240.aFloat108 * (float) local499 + (float) local507 * Static244.aFloat197);
			@Pc(564) int local564 = (int) ((float) local507 * Static413.aFloat186 + Static197.aFloat96 + Static226.aFloat105 * (float) local499 + (float) this.aShort97 * Static307.aFloat152);
			@Pc(583) int local583 = (int) ((float) local507 * Static284.aFloat150 + (float) this.aShort96 * Static335.aFloat157 + (float) local499 * Static557.aFloat203 + Static212.aFloat100);
			@Pc(602) int local602 = (int) (Static240.aFloat108 * (float) local499 + Static118.aFloat66 + (float) this.aShort96 * Static380.aFloat182 + (float) local507 * Static244.aFloat197);
			arg1.anInt4884 = this.aClass7_Sub2_34.anInt5627 * local583 / arg2 + this.aClass7_Sub2_34.anInt5622;
			arg1.anInt4883 = this.aClass7_Sub2_34.anInt5632 + this.aClass7_Sub2_34.anInt5643 * local602 / arg2;
			arg1.anInt4885 = this.aClass7_Sub2_34.anInt5632 + this.aClass7_Sub2_34.anInt5643 * local545 / arg2;
			arg1.anInt4887 = this.aClass7_Sub2_34.anInt5622 + this.aClass7_Sub2_34.anInt5627 * local526 / arg2;
			@Pc(675) int local675 = (int) (Static197.aFloat96 + Static226.aFloat105 * (float) local499 + (float) this.aShort96 * Static307.aFloat152 + (float) local507 * Static413.aFloat186);
			if (this.aClass7_Sub2_34.anInt5624 <= local564 || local675 >= this.aClass7_Sub2_34.anInt5624) {
				arg1.anInt4886 = this.aClass7_Sub2_34.anInt5622 + (this.aShort94 + local526) * this.aClass7_Sub2_34.anInt5627 / arg2 - arg1.anInt4887;
				arg1.aBoolean341 = true;
			}
		}
		this.aClass7_Sub2_34.method4277((float) arg2);
		this.aClass7_Sub2_34.method4287();
		this.aClass7_Sub2_34.method4294(local16);
		this.method6291();
		this.aClass7_Sub2_34.method4325();
		this.method6284();
	}

	@OriginalMember(owner = "client!qb", name = "LA", descriptor = "()Z")
	@Override
	public boolean LA() {
		return this.aBoolean578;
	}

	@OriginalMember(owner = "client!qb", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		if (!this.aBoolean579) {
			this.method6280();
		}
		return this.aShort92;
	}

	@OriginalMember(owner = "client!qb", name = "ga", descriptor = "(I)V")
	@Override
	public void ga(@OriginalArg(0) int arg0) {
		this.aShort101 = (short) arg0;
		if (this.aClass209_14 != null) {
			this.aClass209_14.anInterface16_6 = null;
		}
		if (this.aClass209_13 != null) {
			this.aClass209_13.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "()I")
	@Override
	public int l() {
		if (!this.aBoolean579) {
			this.method6280();
		}
		return this.aShort99;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)V")
	private void method6288(@OriginalArg(0) boolean arg0) {
		if (this.aClass7_Sub2_34.aClass4_Sub13_Sub1_3.aByteArray88.length >= this.anInt8020 * 6) {
			this.aClass7_Sub2_34.aClass4_Sub13_Sub1_3.anInt9170 = 0;
		} else {
			this.aClass7_Sub2_34.aClass4_Sub13_Sub1_3 = new Class4_Sub13_Sub1(this.anInt8020 * 6 + 600);
		}
		@Pc(42) Class4_Sub13_Sub1 local42 = this.aClass7_Sub2_34.aClass4_Sub13_Sub1_3;
		@Pc(48) int local48;
		if (this.aClass7_Sub2_34.aBoolean388) {
			for (local48 = 0; local48 < this.anInt8020; local48++) {
				local42.method7038(this.aShortArray106[local48]);
				local42.method7038(this.aShortArray103[local48]);
				local42.method7038(this.aShortArray107[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt8020; local48++) {
				local42.method7041(this.aShortArray106[local48]);
				local42.method7041(this.aShortArray103[local48]);
				local42.method7041(this.aShortArray107[local48]);
			}
		}
		if (local42.anInt9170 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface14_5 == null) {
				this.anInterface14_5 = this.aClass7_Sub2_34.method4314(local42.anInt9170, true, local42.aByteArray88);
			} else {
				this.anInterface14_5.method4147(local42.aByteArray88, local42.anInt9170);
			}
			this.aClass153_1.anInterface14_3 = this.anInterface14_5;
		} else {
			this.aClass153_1.anInterface14_3 = this.aClass7_Sub2_34.method4314(local42.anInt9170, false, local42.aByteArray88);
		}
		if (!arg0) {
			this.aBoolean577 = true;
		}
	}

	@OriginalMember(owner = "client!qb", name = "oa", descriptor = "(III)V")
	@Override
	public void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8032; local7++) {
			if (arg0 != 0) {
				this.anIntArray452[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray451[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray450[local7] += arg2;
			}
		}
		if (this.aClass209_15 != null) {
			this.aClass209_15.anInterface16_6 = null;
		}
		this.aBoolean579 = false;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!q;IZ)V")
	@Override
	public void method7668(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray104 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt8032; local14++) {
			if ((this.aShortArray104[local14] & arg1) != 0) {
				if (arg2) {
					arg0.BA(this.anIntArray452[local14], this.anIntArray451[local14], this.anIntArray450[local14], local12);
				} else {
					arg0.method6591(this.anIntArray452[local14], this.anIntArray451[local14], this.anIntArray450[local14], local12);
				}
				this.anIntArray452[local14] = local12[0];
				this.anIntArray451[local14] = local12[1];
				this.anIntArray450[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	private void method6289() {
		if (!this.aBoolean577) {
			return;
		}
		this.aBoolean577 = false;
		if (this.aClass190Array2 == null && this.aClass52Array3 == null && this.aClass98Array1 == null) {
			if (this.anIntArray452 != null && !Static42.method1106(this.anInt8053, this.anInt8047)) {
				if (this.aClass209_15 != null && this.aClass209_15.anInterface16_6 == null) {
					this.aBoolean577 = true;
				} else {
					if (!this.aBoolean579) {
						this.method6280();
					}
					this.anIntArray452 = null;
				}
			}
			if (this.anIntArray451 != null && !Static74.method1591(this.anInt8047, this.anInt8053)) {
				if (this.aClass209_15 != null && this.aClass209_15.anInterface16_6 == null) {
					this.aBoolean577 = true;
				} else {
					if (!this.aBoolean579) {
						this.method6280();
					}
					this.anIntArray451 = null;
				}
			}
			if (this.anIntArray450 != null && !Static456.method6708(this.anInt8053, this.anInt8047)) {
				if (this.aClass209_15 != null && this.aClass209_15.anInterface16_6 == null) {
					this.aBoolean577 = true;
				} else {
					if (!this.aBoolean579) {
						this.method6280();
					}
					this.anIntArray450 = null;
				}
			}
		}
		if (this.aShortArray99 != null && this.anIntArray452 == null && this.anIntArray451 == null && this.anIntArray450 == null) {
			this.anIntArray449 = null;
			this.aShortArray99 = null;
		}
		if (this.aByteArray75 != null && !Static294.method4725(this.anInt8053, this.anInt8047)) {
			if (this.aClass209_13 == null) {
				if (this.aClass209_14 != null && this.aClass209_14.anInterface16_6 == null) {
					this.aBoolean577 = true;
				} else {
					this.aShortArray102 = this.aShortArray98 = this.aShortArray101 = null;
					this.aByteArray75 = null;
				}
			} else if (this.aClass209_13.anInterface16_6 == null) {
				this.aBoolean577 = true;
			} else {
				this.aShortArray102 = this.aShortArray98 = this.aShortArray101 = null;
				this.aByteArray75 = null;
			}
		}
		if (this.aShortArray105 != null && !Static309.method4885(this.anInt8053, this.anInt8047)) {
			if (this.aClass209_14 != null && this.aClass209_14.anInterface16_6 == null) {
				this.aBoolean577 = true;
			} else {
				this.aShortArray105 = null;
			}
		}
		if (this.aByteArray74 != null && !Static189.method3133(this.anInt8053, this.anInt8047)) {
			if (this.aClass209_14 != null && this.aClass209_14.anInterface16_6 == null) {
				this.aBoolean577 = true;
			} else {
				this.aByteArray74 = null;
			}
		}
		if (this.aFloatArray60 != null && !Static427.method6372(this.anInt8053, this.anInt8047)) {
			if (this.aClass209_16 != null && this.aClass209_16.anInterface16_6 == null) {
				this.aBoolean577 = true;
			} else {
				this.aFloatArray60 = this.aFloatArray59 = null;
			}
		}
		if (this.aShortArray97 != null && !Static394.method6040(this.anInt8053, this.anInt8047)) {
			if (this.aClass209_14 != null && this.aClass209_14.anInterface16_6 == null) {
				this.aBoolean577 = true;
			} else {
				this.aShortArray97 = null;
			}
		}
		if (this.aShortArray106 != null && !Static218.method3531(this.anInt8047, this.anInt8053)) {
			if (this.aClass153_1 != null && this.aClass153_1.anInterface14_3 == null || this.aClass209_14 != null && this.aClass209_14.anInterface16_6 == null) {
				this.aBoolean577 = true;
			} else {
				this.aShortArray106 = this.aShortArray103 = this.aShortArray107 = null;
			}
		}
		if (this.anIntArrayArray43 != null && !Static270.method4365(this.anInt8047, this.anInt8053)) {
			this.anIntArrayArray43 = null;
			this.aShortArray100 = null;
		}
		if (this.anIntArrayArray44 != null && !Static254.method4044(this.anInt8047, this.anInt8053)) {
			this.aShortArray104 = null;
			this.anIntArrayArray44 = null;
		}
		if (this.anIntArrayArray42 != null && !Static281.method4485(this.anInt8053, this.anInt8047)) {
			this.anIntArrayArray42 = null;
		}
		if (this.anIntArray453 != null && (this.anInt8047 & 0x800) == 0 && (this.anInt8047 & 0x40000) == 0) {
			this.anIntArray453 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "(I)V")
	@Override
	public void W(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray420[arg0];
		@Pc(13) int local13 = Class262.anIntArray421[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8032; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray451[local15] + local13 * this.anIntArray452[local15] >> 14;
			this.anIntArray451[local15] = this.anIntArray451[local15] * local13 - local9 * this.anIntArray452[local15] >> 14;
			this.anIntArray452[local15] = local33;
		}
		if (this.aClass209_15 != null) {
			this.aClass209_15.anInterface16_6 = null;
		}
		this.aBoolean579 = false;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!q;IIZZI)Z")
	private boolean method6290(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(8) Class81_Sub2 local8 = (Class81_Sub2) arg0;
		@Pc(12) Class81_Sub2 local12 = this.aClass7_Sub2_34.aClass81_Sub2_3;
		@Pc(33) float local33 = local12.aFloat87 + local12.aFloat91 * local8.aFloat93 + local8.aFloat87 * local12.aFloat94 + local12.aFloat95 * local8.aFloat88;
		@Pc(54) float local54 = local12.aFloat88 + local8.aFloat93 * local12.aFloat90 + local8.aFloat88 * local12.aFloat92 + local12.aFloat89 * local8.aFloat87;
		Static557.aFloat203 = local8.aFloat84 * local12.aFloat91 + local12.aFloat94 * local8.aFloat94 + local12.aFloat95 * local8.aFloat89;
		Static307.aFloat152 = local12.aFloat86 * local8.aFloat85 + local12.aFloat84 * local8.aFloat95 + local8.aFloat92 * local12.aFloat85;
		Static240.aFloat108 = local12.aFloat89 * local8.aFloat94 + local8.aFloat89 * local12.aFloat92 + local12.aFloat90 * local8.aFloat84;
		@Pc(129) float local129 = local12.aFloat93 + local12.aFloat86 * local8.aFloat93 + local12.aFloat85 * local8.aFloat88 + local8.aFloat87 * local12.aFloat84;
		Static226.aFloat105 = local8.aFloat84 * local12.aFloat86 + local8.aFloat94 * local12.aFloat84 + local12.aFloat85 * local8.aFloat89;
		Static380.aFloat182 = local8.aFloat95 * local12.aFloat89 + local8.aFloat92 * local12.aFloat92 + local12.aFloat90 * local8.aFloat85;
		Static335.aFloat157 = local8.aFloat85 * local12.aFloat91 + local8.aFloat92 * local12.aFloat95 + local12.aFloat94 * local8.aFloat95;
		Static244.aFloat197 = local8.aFloat91 * local12.aFloat89 + local12.aFloat92 * local8.aFloat90 + local8.aFloat86 * local12.aFloat90;
		Static413.aFloat186 = local8.aFloat86 * local12.aFloat86 + local8.aFloat91 * local12.aFloat84 + local8.aFloat90 * local12.aFloat85;
		Static284.aFloat150 = local12.aFloat94 * local8.aFloat91 + local12.aFloat95 * local8.aFloat90 + local8.aFloat86 * local12.aFloat91;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass7_Sub2_34.anInt5627;
		@Pc(261) int local261 = this.aClass7_Sub2_34.anInt5643;
		if (!this.aBoolean579) {
			this.method6280();
		}
		Static184.anIntArray181[0] = this.aShort95;
		Static196.anIntArray193[0] = this.aShort97;
		Static505.anIntArray539[0] = this.aShort92;
		Static184.anIntArray181[1] = this.aShort99;
		Static196.anIntArray193[1] = this.aShort97;
		Static505.anIntArray539[1] = this.aShort92;
		Static184.anIntArray181[2] = this.aShort95;
		Static196.anIntArray193[2] = this.aShort96;
		Static184.anIntArray181[3] = this.aShort99;
		Static505.anIntArray539[2] = this.aShort92;
		Static196.anIntArray193[3] = this.aShort96;
		Static184.anIntArray181[4] = this.aShort95;
		Static505.anIntArray539[3] = this.aShort92;
		Static196.anIntArray193[4] = this.aShort97;
		Static505.anIntArray539[4] = this.aShort93;
		Static184.anIntArray181[5] = this.aShort99;
		Static196.anIntArray193[5] = this.aShort97;
		Static505.anIntArray539[5] = this.aShort93;
		Static184.anIntArray181[6] = this.aShort95;
		Static196.anIntArray193[6] = this.aShort96;
		Static505.anIntArray539[6] = this.aShort93;
		Static184.anIntArray181[7] = this.aShort99;
		Static196.anIntArray193[7] = this.aShort96;
		Static505.anIntArray539[7] = this.aShort93;
		@Pc(420) float local420;
		@Pc(448) float local448;
		@Pc(434) float local434;
		@Pc(401) float local401;
		@Pc(396) float local396;
		@Pc(406) float local406;
		for (@Pc(389) int local389 = 0; local389 < 8; local389++) {
			local396 = Static196.anIntArray193[local389];
			local401 = Static184.anIntArray181[local389];
			local406 = Static505.anIntArray539[local389];
			local420 = local33 + Static335.aFloat157 * local396 + Static557.aFloat203 * local401 + local406 * Static284.aFloat150;
			local434 = local396 * Static307.aFloat152 + Static226.aFloat105 * local401 + Static413.aFloat186 * local406 + local129;
			local448 = local54 + local401 * Static240.aFloat108 + local396 * Static380.aFloat182 + local406 * Static244.aFloat197;
			if ((float) this.aClass7_Sub2_34.anInt5624 <= local434) {
				if (arg2 > 0) {
					local434 = arg2;
				}
				@Pc(475) float local475 = (float) this.aClass7_Sub2_34.anInt5622 + (float) local257 * local420 / local434;
				if (local241 > local475) {
					local241 = local475;
				}
				if (local243 < local475) {
					local243 = local475;
				}
				@Pc(499) float local499 = (float) local261 * local448 / local434 + (float) this.aClass7_Sub2_34.anInt5632;
				if (local499 < local245) {
					local245 = local499;
				}
				local239 = true;
				if (local247 < local499) {
					local247 = local499;
				}
			}
		}
		if (local239 && local241 < (float) arg4 && (float) arg4 < local243 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (this.anInt8062 > this.aClass7_Sub2_34.anIntArray294.length) {
				this.aClass7_Sub2_34.anIntArray294 = new int[this.anInt8062];
				this.aClass7_Sub2_34.anIntArray293 = new int[this.anInt8062];
			}
			@Pc(570) int[] local570 = this.aClass7_Sub2_34.anIntArray294;
			@Pc(574) int[] local574 = this.aClass7_Sub2_34.anIntArray293;
			@Pc(650) int local650;
			for (@Pc(576) int local576 = 0; local576 < this.anInt8032; local576++) {
				local396 = this.anIntArray451[local576];
				local406 = this.anIntArray450[local576];
				local401 = this.anIntArray452[local576];
				local420 = local33 + local406 * Static284.aFloat150 + local401 * Static557.aFloat203 + Static335.aFloat157 * local396;
				local434 = Static226.aFloat105 * local401 + local396 * Static307.aFloat152 + local406 * Static413.aFloat186 + local129;
				local448 = Static244.aFloat197 * local406 + Static240.aFloat108 * local401 + local396 * Static380.aFloat182 + local54;
				@Pc(657) int local657;
				@Pc(659) int local659;
				@Pc(668) int local668;
				if ((float) this.aClass7_Sub2_34.anInt5624 <= local434) {
					if (arg2 > 0) {
						local434 = arg2;
					}
					local650 = (int) ((float) local257 * local420 / local434 + (float) this.aClass7_Sub2_34.anInt5622);
					local657 = (int) ((float) this.aClass7_Sub2_34.anInt5632 + (float) local261 * local448 / local434);
					local659 = this.anIntArray449[local576];
					local668 = this.anIntArray449[local576 + 1];
					for (@Pc(738) int local738 = local659; local738 < local668; local738++) {
						@Pc(747) int local747 = this.aShortArray99[local738] - 1;
						if (local747 == -1) {
							break;
						}
						local570[local747] = local650;
						local574[local747] = local657;
					}
				} else {
					local650 = this.anIntArray449[local576];
					local657 = this.anIntArray449[local576 + 1];
					for (local659 = local650; local659 < local657; local659++) {
						local668 = this.aShortArray99[local659] - 1;
						if (local668 == -1) {
							break;
						}
						local570[this.aShortArray99[local659] - 1] = -999999;
					}
				}
			}
			for (local650 = 0; local650 < this.anInt8050; local650++) {
				if (local570[this.aShortArray106[local650]] != -999999 && local570[this.aShortArray103[local650]] != -999999 && local570[this.aShortArray107[local650]] != -999999 && this.method6286(arg4, local570[this.aShortArray107[local650]], local574[this.aShortArray106[local650]], local570[this.aShortArray103[local650]], local574[this.aShortArray103[local650]], local574[this.aShortArray107[local650]], local570[this.aShortArray106[local650]], arg1)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!q;Lclient!j;I)V")
	@Override
	public void method7679(@OriginalArg(0) Class81 arg0, @OriginalArg(1) Class21_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt8062 == 0) {
			return;
		}
		@Pc(16) Class81_Sub2 local16 = this.aClass7_Sub2_34.aClass81_Sub2_3;
		if (!this.aBoolean579) {
			this.method6280();
		}
		@Pc(25) Class81_Sub2 local25 = (Class81_Sub2) arg0;
		Static197.aFloat96 = local16.aFloat93 + local25.aFloat88 * local16.aFloat85 + local16.aFloat84 * local25.aFloat87 + local25.aFloat93 * local16.aFloat86;
		Static307.aFloat152 = local16.aFloat85 * local25.aFloat92 + local25.aFloat95 * local16.aFloat84 + local25.aFloat85 * local16.aFloat86;
		@Pc(72) float local72 = Static197.aFloat96 + (float) this.aShort97 * Static307.aFloat152;
		@Pc(80) float local80 = (float) this.aShort96 * Static307.aFloat152 + Static197.aFloat96;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = local80 - (float) this.aShort94;
			local96 = (float) this.aShort94 + local72;
		} else {
			local90 = local72 - (float) this.aShort94;
			local96 = local80 + (float) this.aShort94;
		}
		if (local90 >= this.aClass7_Sub2_34.aFloat135 || local96 <= (float) this.aClass7_Sub2_34.anInt5624) {
			return;
		}
		Static212.aFloat100 = local25.aFloat93 * local16.aFloat91 + local25.aFloat87 * local16.aFloat94 + local25.aFloat88 * local16.aFloat95 + local16.aFloat87;
		Static335.aFloat157 = local16.aFloat94 * local25.aFloat95 + local25.aFloat92 * local16.aFloat95 + local25.aFloat85 * local16.aFloat91;
		@Pc(172) float local172 = Static212.aFloat100 + (float) this.aShort97 * Static335.aFloat157;
		@Pc(180) float local180 = Static212.aFloat100 + Static335.aFloat157 * (float) this.aShort96;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local172 > local180) {
			local195 = (local180 - (float) this.aShort94) * (float) this.aClass7_Sub2_34.anInt5627;
			local206 = (local172 + (float) this.aShort94) * (float) this.aClass7_Sub2_34.anInt5627;
		} else {
			local195 = (float) this.aClass7_Sub2_34.anInt5627 * ((float) -this.aShort94 + local172);
			local206 = (float) this.aClass7_Sub2_34.anInt5627 * (local180 + (float) this.aShort94);
		}
		if (this.aClass7_Sub2_34.aFloat130 <= local195 / local96 || local206 / local96 <= this.aClass7_Sub2_34.aFloat134) {
			return;
		}
		Static118.aFloat66 = local25.aFloat87 * local16.aFloat89 + local16.aFloat92 * local25.aFloat88 + local16.aFloat90 * local25.aFloat93 + local16.aFloat88;
		Static380.aFloat182 = local25.aFloat85 * local16.aFloat90 + local25.aFloat95 * local16.aFloat89 + local25.aFloat92 * local16.aFloat92;
		@Pc(296) float local296 = Static118.aFloat66 + (float) this.aShort97 * Static380.aFloat182;
		@Pc(304) float local304 = (float) this.aShort96 * Static380.aFloat182 + Static118.aFloat66;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local296 > local304) {
			local320 = ((float) -this.aShort94 + local304) * (float) this.aClass7_Sub2_34.anInt5643;
			local331 = (float) this.aClass7_Sub2_34.anInt5643 * (local296 + (float) this.aShort94);
		} else {
			local331 = (local304 + (float) this.aShort94) * (float) this.aClass7_Sub2_34.anInt5643;
			local320 = (local296 - (float) this.aShort94) * (float) this.aClass7_Sub2_34.anInt5643;
		}
		if (this.aClass7_Sub2_34.aFloat143 <= local320 / local96 || this.aClass7_Sub2_34.aFloat146 >= local331 / local96) {
			return;
		}
		if (arg1 != null || this.aClass98Array1 != null) {
			Static226.aFloat105 = local16.aFloat86 * local25.aFloat84 + local25.aFloat89 * local16.aFloat85 + local16.aFloat84 * local25.aFloat94;
			Static240.aFloat108 = local25.aFloat84 * local16.aFloat90 + local25.aFloat94 * local16.aFloat89 + local16.aFloat92 * local25.aFloat89;
			Static557.aFloat203 = local16.aFloat94 * local25.aFloat94 + local16.aFloat95 * local25.aFloat89 + local16.aFloat91 * local25.aFloat84;
			Static284.aFloat150 = local16.aFloat91 * local25.aFloat86 + local25.aFloat91 * local16.aFloat94 + local25.aFloat90 * local16.aFloat95;
			Static244.aFloat197 = local16.aFloat90 * local25.aFloat86 + local16.aFloat92 * local25.aFloat90 + local16.aFloat89 * local25.aFloat91;
			Static413.aFloat186 = local25.aFloat90 * local16.aFloat85 + local25.aFloat91 * local16.aFloat84 + local25.aFloat86 * local16.aFloat86;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.aShort99 + this.aShort95 >> 1;
			@Pc(508) int local508 = this.aShort93 + this.aShort92 >> 1;
			@Pc(527) int local527 = (int) ((float) this.aShort97 * Static335.aFloat157 + Static212.aFloat100 + Static557.aFloat203 * (float) local500 + (float) local508 * Static284.aFloat150);
			@Pc(546) int local546 = (int) ((float) local508 * Static244.aFloat197 + Static240.aFloat108 * (float) local500 + Static118.aFloat66 + (float) this.aShort97 * Static380.aFloat182);
			@Pc(565) int local565 = (int) (Static413.aFloat186 * (float) local508 + (float) this.aShort97 * Static307.aFloat152 + Static226.aFloat105 * (float) local500 + Static197.aFloat96);
			if (this.aClass7_Sub2_34.anInt5624 > local565) {
				local490 = true;
			} else {
				arg1.anInt4885 = this.aClass7_Sub2_34.anInt5632 + local546 * this.aClass7_Sub2_34.anInt5643 / local565;
				arg1.anInt4887 = this.aClass7_Sub2_34.anInt5622 + local527 * this.aClass7_Sub2_34.anInt5627 / local565;
			}
			@Pc(624) int local624 = (int) ((float) local500 * Static557.aFloat203 + Static212.aFloat100 + (float) this.aShort96 * Static335.aFloat157 + (float) local508 * Static284.aFloat150);
			@Pc(643) int local643 = (int) ((float) this.aShort96 * Static380.aFloat182 + Static118.aFloat66 + Static240.aFloat108 * (float) local500 + Static244.aFloat197 * (float) local508);
			@Pc(662) int local662 = (int) (Static413.aFloat186 * (float) local508 + (float) this.aShort96 * Static307.aFloat152 + Static226.aFloat105 * (float) local500 + Static197.aFloat96);
			if (local662 >= this.aClass7_Sub2_34.anInt5624) {
				arg1.anInt4884 = local624 * this.aClass7_Sub2_34.anInt5627 / local662 + this.aClass7_Sub2_34.anInt5622;
				arg1.anInt4883 = this.aClass7_Sub2_34.anInt5643 * local643 / local662 + this.aClass7_Sub2_34.anInt5632;
			} else {
				local490 = true;
			}
			if (local490) {
				if (this.aClass7_Sub2_34.anInt5624 > local565 && local662 < this.aClass7_Sub2_34.anInt5624) {
					local492 = false;
				} else {
					@Pc(739) int local739;
					@Pc(750) int local750;
					@Pc(761) int local761;
					if (this.aClass7_Sub2_34.anInt5624 > local565) {
						local739 = (local662 - this.aClass7_Sub2_34.anInt5624 << 16) / (local662 - local565);
						local750 = (local739 * (local624 - local527) >> 16) + local624;
						local761 = local643 + (local739 * (local643 - local546) >> 16);
						arg1.anInt4887 = this.aClass7_Sub2_34.anInt5622 + this.aClass7_Sub2_34.anInt5627 * local750 / this.aClass7_Sub2_34.anInt5624;
						arg1.anInt4885 = local761 * this.aClass7_Sub2_34.anInt5643 / this.aClass7_Sub2_34.anInt5624 + this.aClass7_Sub2_34.anInt5632;
					} else if (this.aClass7_Sub2_34.anInt5624 > local662) {
						local739 = (local565 - this.aClass7_Sub2_34.anInt5624 << 16) / (local565 - local662);
						local750 = local527 + ((local527 - local624) * local739 >> 16);
						arg1.anInt4887 = this.aClass7_Sub2_34.anInt5622 + this.aClass7_Sub2_34.anInt5627 * local750 / this.aClass7_Sub2_34.anInt5624;
						local761 = local546 + (local739 * (local546 - local643) >> 16);
						arg1.anInt4885 = local761 * this.aClass7_Sub2_34.anInt5643 / this.aClass7_Sub2_34.anInt5624 + this.aClass7_Sub2_34.anInt5632;
					}
				}
			}
			if (local492) {
				if (local662 < local565) {
					arg1.anInt4886 = this.aClass7_Sub2_34.anInt5622 + (local527 + this.aShort94) * this.aClass7_Sub2_34.anInt5627 / local565 - arg1.anInt4887;
				} else {
					arg1.anInt4886 = this.aClass7_Sub2_34.anInt5622 + (this.aShort94 + local624) * this.aClass7_Sub2_34.anInt5627 / local662 - arg1.anInt4884;
				}
				arg1.aBoolean341 = true;
			}
		}
		this.aClass7_Sub2_34.method4329();
		this.aClass7_Sub2_34.method4294(local25);
		this.method6291();
		this.aClass7_Sub2_34.method4325();
		this.method6284();
	}

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean579) {
			this.method6280();
		}
		return this.aShort94;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()V")
	@Override
	protected void method7671() {
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	private void method6291() {
		if (this.anInt8020 == 0) {
			return;
		}
		if (this.aByte114 != 0) {
			this.method6292(true);
		}
		this.method6292(false);
		if (this.aClass153_1 != null) {
			if (this.aClass153_1.anInterface14_3 == null) {
				this.method6288((this.aByte114 & 0x10) != 0);
			}
			if (this.aClass153_1.anInterface14_3 != null) {
				this.aClass7_Sub2_34.method4290(this.aClass209_13 != null);
				this.aClass7_Sub2_34.method4354(this.aClass209_13, this.aClass209_15, this.aClass209_14, this.aClass209_16);
				@Pc(89) int local89 = this.anIntArray453.length - 1;
				for (@Pc(91) int local91 = 0; local91 < local89; local91++) {
					@Pc(98) int local98 = this.anIntArray453[local91];
					@Pc(105) int local105 = this.anIntArray453[local91 + 1];
					@Pc(112) int local112 = this.aShortArray97[local98] & 0xFFFF;
					if (local112 == 65535) {
						local112 = -1;
					}
					this.aClass7_Sub2_34.method4298(local112, this.aClass209_13 != null);
					this.aClass7_Sub2_34.method4338(local98 * 3, (local105 - local98) * 3, this.aClass153_1.anInterface14_3);
				}
			}
		}
		this.method6289();
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(SS)V")
	@Override
	public void d(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt8050; local7++) {
			if (this.aShortArray105[local7] == arg0) {
				this.aShortArray105[local7] = arg1;
			}
		}
		if (this.aClass98Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt8024; local38++) {
				@Pc(45) Class98 local45 = this.aClass98Array1[local38];
				@Pc(50) Class131 local50 = this.aClass131Array1[local38];
				local50.anInt3746 = local50.anInt3746 & 0xFF000000 | Static394.anIntArray413[this.aShortArray105[local45.anInt2884] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass209_14 != null) {
			this.aClass209_14.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "WA", descriptor = "(IIII)V")
	@Override
	protected void WA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static80.anInt2160 = 0;
			Static365.anInt7042 = 0;
			local13 = 0;
			Static485.anInt9204 = 0;
			for (local17 = 0; local17 < this.anInt8032; local17++) {
				Static365.anInt7042 += this.anIntArray452[local17];
				Static485.anInt9204 += this.anIntArray451[local17];
				local13++;
				Static80.anInt2160 += this.anIntArray450[local17];
			}
			if (local13 > 0) {
				Static365.anInt7042 = arg1 + Static365.anInt7042 / local13;
				Static485.anInt9204 = Static485.anInt9204 / local13 + arg2;
				Static80.anInt2160 = arg3 + Static80.anInt2160 / local13;
			} else {
				Static80.anInt2160 = arg3;
				Static365.anInt7042 = arg1;
				Static485.anInt9204 = arg2;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt8032; local13++) {
				this.anIntArray452[local13] += arg1;
				this.anIntArray451[local13] += arg2;
				this.anIntArray450[local13] += arg3;
			}
		} else {
			@Pc(155) int local155;
			@Pc(173) int local173;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt8032; local13++) {
					this.anIntArray452[local13] -= Static365.anInt7042;
					this.anIntArray451[local13] -= Static485.anInt9204;
					this.anIntArray450[local13] -= Static80.anInt2160;
					if (arg3 != 0) {
						local17 = Class262.anIntArray420[arg3];
						local155 = Class262.anIntArray421[arg3];
						local173 = this.anIntArray452[local13] * local155 + this.anIntArray451[local13] * local17 + 16383 >> 14;
						this.anIntArray451[local13] = this.anIntArray451[local13] * local155 + 16383 - local17 * this.anIntArray452[local13] >> 14;
						this.anIntArray452[local13] = local173;
					}
					if (arg1 != 0) {
						local17 = Class262.anIntArray420[arg1];
						local155 = Class262.anIntArray421[arg1];
						local173 = this.anIntArray451[local13] * local155 + 16383 - local17 * this.anIntArray450[local13] >> 14;
						this.anIntArray450[local13] = local17 * this.anIntArray451[local13] + this.anIntArray450[local13] * local155 + 16383 >> 14;
						this.anIntArray451[local13] = local173;
					}
					if (arg2 != 0) {
						local17 = Class262.anIntArray420[arg2];
						local155 = Class262.anIntArray421[arg2];
						local173 = local17 * this.anIntArray450[local13] + local155 * this.anIntArray452[local13] + 16383 >> 14;
						this.anIntArray450[local13] = local155 * this.anIntArray450[local13] + 16383 - local17 * this.anIntArray452[local13] >> 14;
						this.anIntArray452[local13] = local173;
					}
					this.anIntArray452[local13] += Static365.anInt7042;
					this.anIntArray451[local13] += Static485.anInt9204;
					this.anIntArray450[local13] += Static80.anInt2160;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt8032; local13++) {
					this.anIntArray452[local13] -= Static365.anInt7042;
					this.anIntArray451[local13] -= Static485.anInt9204;
					this.anIntArray450[local13] -= Static80.anInt2160;
					this.anIntArray452[local13] = arg1 * this.anIntArray452[local13] / 128;
					this.anIntArray451[local13] = this.anIntArray451[local13] * arg2 / 128;
					this.anIntArray450[local13] = arg3 * this.anIntArray450[local13] / 128;
					this.anIntArray452[local13] += Static365.anInt7042;
					this.anIntArray451[local13] += Static485.anInt9204;
					this.anIntArray450[local13] += Static80.anInt2160;
				}
			} else {
				@Pc(516) Class98 local516;
				@Pc(521) Class131 local521;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt8050; local13++) {
						local17 = arg1 * 8 + (this.aByteArray74[local13] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray74[local13] = (byte) local17;
					}
					if (this.aClass209_14 != null) {
						this.aClass209_14.anInterface16_6 = null;
					}
					if (this.aClass98Array1 != null) {
						for (local17 = 0; local17 < this.anInt8024; local17++) {
							local516 = this.aClass98Array1[local17];
							local521 = this.aClass131Array1[local17];
							local521.anInt3746 = local521.anInt3746 & 0xFFFFFF | 255 - (this.aByteArray74[local516.anInt2884] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt8050; local13++) {
						local17 = this.aShortArray105[local13] & 0xFFFF;
						local155 = local17 >> 10 & 0x3F;
						local173 = local17 >> 7 & 0x7;
						@Pc(578) int local578 = local155 + arg1 & 0x3F;
						@Pc(582) int local582 = local17 & 0x7F;
						local173 += arg2 / 4;
						if (local173 < 0) {
							local173 = 0;
						} else if (local173 > 7) {
							local173 = 7;
						}
						local582 += arg3;
						if (local582 < 0) {
							local582 = 0;
						} else if (local582 > 127) {
							local582 = 127;
						}
						this.aShortArray105[local13] = (short) (local578 << 10 | local173 << 7 | local582);
					}
					if (this.aClass209_14 != null) {
						this.aClass209_14.anInterface16_6 = null;
					}
					if (this.aClass98Array1 != null) {
						for (local17 = 0; local17 < this.anInt8024; local17++) {
							local516 = this.aClass98Array1[local17];
							local521 = this.aClass131Array1[local17];
							local521.anInt3746 = Static394.anIntArray413[this.aShortArray105[local516.anInt2884] & 0xFFFF] & 0xFFFFFF | local521.anInt3746 & 0xFF000000;
						}
					}
				} else {
					@Pc(700) Class131 local700;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt8024; local13++) {
							local700 = this.aClass131Array1[local13];
							local700.anInt3752 += arg1;
							local700.anInt3747 += arg2;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt8024; local13++) {
							local700 = this.aClass131Array1[local13];
							local700.anInt3754 = local700.anInt3754 * arg2 >> 7;
							local700.anInt3750 = arg1 * local700.anInt3750 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt8024; local13++) {
							local700 = this.aClass131Array1[local13];
							local700.anInt3745 = arg1 + local700.anInt3745 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!da;IIIZ)V")
	@Override
	public void method7677(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class65_Sub2 local8 = (Class65_Sub2) arg0;
		if (this.anInt8050 == 0 || local8.anInt8050 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt8032;
		@Pc(27) int[] local27 = local8.anIntArray452;
		@Pc(30) int[] local30 = local8.anIntArray451;
		@Pc(33) int[] local33 = local8.anIntArray450;
		@Pc(36) short[] local36 = local8.aShortArray102;
		@Pc(39) short[] local39 = local8.aShortArray98;
		@Pc(42) short[] local42 = local8.aShortArray101;
		@Pc(45) byte[] local45 = local8.aByteArray75;
		@Pc(52) short[] local52;
		@Pc(56) short[] local56;
		@Pc(60) short[] local60;
		@Pc(64) byte[] local64;
		if (this.aClass293_1 == null) {
			local60 = null;
			local56 = null;
			local64 = null;
			local52 = null;
		} else {
			local52 = this.aClass293_1.aShortArray125;
			local56 = this.aClass293_1.aShortArray126;
			local60 = this.aClass293_1.aShortArray124;
			local64 = this.aClass293_1.aByteArray86;
		}
		@Pc(79) short[] local79;
		@Pc(81) short[] local81;
		@Pc(85) short[] local85;
		@Pc(83) byte[] local83;
		if (local8.aClass293_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local81 = local8.aClass293_1.aShortArray126;
			local85 = local8.aClass293_1.aShortArray124;
			local79 = local8.aClass293_1.aShortArray125;
			local83 = local8.aClass293_1.aByteArray86;
		}
		@Pc(106) int[] local106 = local8.anIntArray449;
		@Pc(109) short[] local109 = local8.aShortArray99;
		if (!local8.aBoolean579) {
			local8.method6280();
		}
		@Pc(118) short local118 = local8.aShort97;
		@Pc(121) short local121 = local8.aShort96;
		@Pc(124) short local124 = local8.aShort95;
		@Pc(127) short local127 = local8.aShort99;
		@Pc(130) short local130 = local8.aShort92;
		@Pc(133) short local133 = local8.aShort93;
		for (@Pc(135) int local135 = 0; local135 < this.anInt8032; local135++) {
			@Pc(145) int local145 = this.anIntArray451[local135] - arg2;
			if (local118 <= local145 && local121 >= local145) {
				@Pc(169) int local169 = this.anIntArray452[local135] - arg1;
				if (local124 <= local169 && local169 <= local127) {
					@Pc(193) int local193 = this.anIntArray450[local135] - arg3;
					if (local193 >= local130 && local133 >= local193) {
						@Pc(203) int local203 = -1;
						@Pc(208) int local208 = this.anIntArray449[local135];
						@Pc(215) int local215 = this.anIntArray449[local135 + 1];
						for (@Pc(217) int local217 = local208; local217 < local215; local217++) {
							local203 = this.aShortArray99[local217] - 1;
							if (local203 == -1 || this.aByteArray75[local203] != 0) {
								break;
							}
						}
						if (local203 != -1) {
							for (@Pc(246) int local246 = 0; local246 < local24; local246++) {
								if (local169 == local27[local246] && local33[local246] == local193 && local145 == local30[local246]) {
									local208 = local106[local246];
									local215 = local106[local246 + 1];
									@Pc(279) int local279 = -1;
									for (@Pc(281) int local281 = local208; local281 < local215; local281++) {
										local279 = local109[local281] - 1;
										if (local279 == -1 || local45[local279] != 0) {
											break;
										}
									}
									if (local279 != -1) {
										if (local52 == null) {
											this.aClass293_1 = new Class293();
											local52 = this.aClass293_1.aShortArray125 = Static465.method6798(this.aShortArray102);
											local56 = this.aClass293_1.aShortArray126 = Static465.method6798(this.aShortArray98);
											local60 = this.aClass293_1.aShortArray124 = Static465.method6798(this.aShortArray101);
											local64 = this.aClass293_1.aByteArray86 = Static502.method7220(this.aByteArray75);
										}
										if (local79 == null) {
											@Pc(360) Class293 local360 = local8.aClass293_1 = new Class293();
											local79 = local360.aShortArray125 = Static465.method6798(local36);
											local81 = local360.aShortArray126 = Static465.method6798(local39);
											local85 = local360.aShortArray124 = Static465.method6798(local42);
											local83 = local360.aByteArray86 = Static502.method7220(local45);
										}
										@Pc(393) short local393 = this.aShortArray102[local203];
										@Pc(398) short local398 = this.aShortArray98[local203];
										@Pc(403) short local403 = this.aShortArray101[local203];
										local215 = local106[local246 + 1];
										local208 = local106[local246];
										@Pc(418) byte local418 = this.aByteArray75[local203];
										@Pc(428) int local428;
										for (@Pc(420) int local420 = local208; local420 < local215; local420++) {
											local428 = local109[local420] - 1;
											if (local428 == -1) {
												break;
											}
											if (local83[local428] != 0) {
												local79[local428] += local393;
												local81[local428] += local398;
												local85[local428] += local403;
												local83[local428] += local418;
											}
										}
										local398 = local39[local279];
										local418 = local45[local279];
										local215 = this.anIntArray449[local135 + 1];
										local403 = local42[local279];
										local208 = this.anIntArray449[local135];
										local393 = local36[local279];
										for (local428 = local208; local428 < local215; local428++) {
											@Pc(513) int local513 = this.aShortArray99[local428] - 1;
											if (local513 == -1) {
												break;
											}
											if (local64[local513] != 0) {
												local52[local513] += local393;
												local56[local513] += local398;
												local60[local513] += local403;
												local64[local513] += local418;
											}
										}
										if (this.aClass209_13 == null && this.aClass209_14 != null) {
											this.aClass209_14.anInterface16_6 = null;
										}
										if (this.aClass209_13 != null) {
											this.aClass209_13.anInterface16_6 = null;
										}
										if (local8.aClass209_13 == null && local8.aClass209_14 != null) {
											local8.aClass209_14.anInterface16_6 = null;
										}
										if (local8.aClass209_13 != null) {
											local8.aClass209_13.anInterface16_6 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BZ)V")
	private void method6292(@OriginalArg(1) boolean arg0) {
		@Pc(22) boolean local22 = this.aClass209_14 != null && this.aClass209_14.anInterface16_6 == null;
		@Pc(33) boolean local33 = this.aClass209_13 != null && this.aClass209_13.anInterface16_6 == null;
		@Pc(44) boolean local44 = this.aClass209_15 != null && this.aClass209_15.anInterface16_6 == null;
		@Pc(55) boolean local55 = this.aClass209_16 != null && this.aClass209_16.anInterface16_6 == null;
		if (arg0) {
			local55 &= (this.aByte114 & 0x8) != 0;
			local33 &= (this.aByte114 & 0x4) != 0;
			local22 &= (this.aByte114 & 0x2) != 0;
			local44 &= (this.aByte114 & 0x1) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		if (local44) {
			local103 = 12;
		}
		@Pc(120) byte local120 = 0;
		if (local22) {
			local107 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local33) {
			local109 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local55) {
			local120 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.aClass7_Sub2_34.aClass4_Sub13_Sub1_3.aByteArray88.length < local103 * this.anInt8062) {
			this.aClass7_Sub2_34.aClass4_Sub13_Sub1_3 = new Class4_Sub13_Sub1(local103 * (this.anInt8062 + 100));
		} else {
			this.aClass7_Sub2_34.aClass4_Sub13_Sub1_3.anInt9170 = 0;
		}
		@Pc(183) Class4_Sub13_Sub1 local183 = this.aClass7_Sub2_34.aClass4_Sub13_Sub1_3;
		@Pc(191) int local191;
		@Pc(200) int local200;
		@Pc(228) int local228;
		@Pc(237) int local237;
		if (local44) {
			@Pc(207) int local207;
			@Pc(214) int local214;
			@Pc(219) int local219;
			@Pc(226) int local226;
			if (this.aClass7_Sub2_34.aBoolean388) {
				for (local191 = 0; local191 < this.anInt8032; local191++) {
					local200 = Stream.floatToRawIntBits((float) this.anIntArray452[local191]);
					local207 = Stream.floatToRawIntBits((float) this.anIntArray451[local191]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray450[local191]);
					local219 = this.anIntArray449[local191];
					local226 = this.anIntArray449[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray99[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt9170 = local237 * local103;
						local183.method7032(local200);
						local183.method7032(local207);
						local183.method7032(local214);
					}
				}
			} else {
				for (local191 = 0; local191 < this.anInt8032; local191++) {
					local200 = Stream.floatToRawIntBits((float) this.anIntArray452[local191]);
					local207 = Stream.floatToRawIntBits((float) this.anIntArray451[local191]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray450[local191]);
					local219 = this.anIntArray449[local191];
					local226 = this.anIntArray449[local191 + 1];
					for (local228 = local219; local228 < local226; local228++) {
						local237 = this.aShortArray99[local228] - 1;
						if (local237 == -1) {
							break;
						}
						local183.anInt9170 = local103 * local237;
						local183.method7028(local200);
						local183.method7028(local207);
						local183.method7028(local214);
					}
				}
			}
		}
		@Pc(535) float local535;
		@Pc(442) short[] local442;
		@Pc(434) short[] local434;
		@Pc(446) short[] local446;
		@Pc(438) byte[] local438;
		@Pc(590) float local590;
		if (local22) {
			if (this.aClass209_13 == null) {
				if (this.aClass293_1 == null) {
					local438 = this.aByteArray75;
					local442 = this.aShortArray102;
					local434 = this.aShortArray98;
					local446 = this.aShortArray101;
				} else {
					local434 = this.aClass293_1.aShortArray126;
					local438 = this.aClass293_1.aByteArray86;
					local442 = this.aClass293_1.aShortArray125;
					local446 = this.aClass293_1.aShortArray124;
				}
				@Pc(466) float local466 = this.aClass7_Sub2_34.aFloatArray43[0];
				@Pc(472) float local472 = this.aClass7_Sub2_34.aFloatArray43[1];
				@Pc(478) float local478 = this.aClass7_Sub2_34.aFloatArray43[2];
				@Pc(482) float local482 = this.aClass7_Sub2_34.aFloat127;
				@Pc(492) float local492 = this.aClass7_Sub2_34.aFloat144 * 768.0F / (float) this.aShort101;
				@Pc(502) float local502 = this.aClass7_Sub2_34.aFloat142 * 768.0F / (float) this.aShort101;
				for (@Pc(504) int local504 = 0; local504 < this.anInt8050; local504++) {
					@Pc(524) int local524 = this.method6281(this.aShortArray105[local504], this.aByteArray74[local504], this.aShort100, this.aShortArray97[local504]);
					local535 = this.aClass7_Sub2_34.aFloat137 * (float) (local524 >> 16 & 0xFF);
					@Pc(544) float local544 = this.aClass7_Sub2_34.aFloat145 * (float) (local524 >>> 24);
					@Pc(549) short local549 = this.aShortArray106[local504];
					@Pc(560) float local560 = (float) (local524 >> 8 & 0xFF) * this.aClass7_Sub2_34.aFloat129;
					@Pc(565) short local565 = (short) local438[local549];
					if (local565 == 0) {
						local590 = ((float) local446[local549] * local478 + local472 * (float) local434[local549] + local466 * (float) local442[local549]) * 0.0026041667F;
					} else {
						local590 = ((float) local434[local549] * local472 + (float) local442[local549] * local466 + (float) local446[local549] * local478) / (float) (local565 * 256);
					}
					@Pc(630) float local630 = local482 + local590 * (local590 < 0.0F ? local502 : local492);
					@Pc(635) int local635 = (int) (local630 * local544);
					if (local635 < 0) {
						local635 = 0;
					} else if (local635 > 255) {
						local635 = 255;
					}
					@Pc(653) int local653 = (int) (local535 * local630);
					@Pc(658) int local658 = (int) (local560 * local630);
					if (local653 < 0) {
						local653 = 0;
					} else if (local653 > 255) {
						local653 = 255;
					}
					local183.anInt9170 = local107 + local103 * local549;
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					local183.method7052(local635);
					local183.method7052(local653);
					local183.method7052(local658);
					local183.method7052(255 - (this.aByteArray74[local504] & 0xFF));
					local549 = this.aShortArray103[local504];
					local565 = local438[local549];
					if (local565 == 0) {
						local590 = (local466 * (float) local442[local549] + local472 * (float) local434[local549] + local478 * (float) local446[local549]) * 0.0026041667F;
					} else {
						local590 = (local466 * (float) local442[local549] + (float) local434[local549] * local472 + local478 * (float) local446[local549]) / (float) (local565 * 256);
					}
					local630 = (local590 < 0.0F ? local502 : local492) * local590 + local482;
					local635 = (int) (local544 * local630);
					if (local635 < 0) {
						local635 = 0;
					} else if (local635 > 255) {
						local635 = 255;
					}
					local653 = (int) (local535 * local630);
					if (local653 < 0) {
						local653 = 0;
					} else if (local653 > 255) {
						local653 = 255;
					}
					local658 = (int) (local630 * local560);
					local183.anInt9170 = local107 + local549 * local103;
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					local183.method7052(local635);
					local183.method7052(local653);
					local183.method7052(local658);
					local183.method7052(255 - (this.aByteArray74[local504] & 0xFF));
					local549 = this.aShortArray107[local504];
					local565 = local438[local549];
					if (local565 == 0) {
						local590 = (local478 * (float) local446[local549] + (float) local434[local549] * local472 + local466 * (float) local442[local549]) * 0.0026041667F;
					} else {
						local590 = ((float) local434[local549] * local472 + local466 * (float) local442[local549] + local478 * (float) local446[local549]) / (float) (local565 * 256);
					}
					local630 = local590 * (local590 < 0.0F ? local502 : local492) + local482;
					local635 = (int) (local630 * local544);
					local653 = (int) (local535 * local630);
					if (local635 < 0) {
						local635 = 0;
					} else if (local635 > 255) {
						local635 = 255;
					}
					if (local653 < 0) {
						local653 = 0;
					} else if (local653 > 255) {
						local653 = 255;
					}
					local658 = (int) (local560 * local630);
					local183.anInt9170 = local103 * local549 + local107;
					if (local658 < 0) {
						local658 = 0;
					} else if (local658 > 255) {
						local658 = 255;
					}
					local183.method7052(local635);
					local183.method7052(local653);
					local183.method7052(local658);
					local183.method7052(255 - (this.aByteArray74[local504] & 0xFF));
				}
			} else {
				for (local191 = 0; local191 < this.anInt8050; local191++) {
					local200 = this.method6281(this.aShortArray105[local191], this.aByteArray74[local191], this.aShort100, this.aShortArray97[local191]);
					local183.anInt9170 = local103 * this.aShortArray106[local191] + local107;
					local183.method7032(local200);
					local183.anInt9170 = this.aShortArray103[local191] * local103 + local107;
					local183.method7032(local200);
					local183.anInt9170 = local103 * this.aShortArray107[local191] + local107;
					local183.method7032(local200);
				}
			}
		}
		if (local33) {
			if (this.aClass293_1 == null) {
				local434 = this.aShortArray98;
				local446 = this.aShortArray101;
				local442 = this.aShortArray102;
				local438 = this.aByteArray75;
			} else {
				local442 = this.aClass293_1.aShortArray125;
				local434 = this.aClass293_1.aShortArray126;
				local446 = this.aClass293_1.aShortArray124;
				local438 = this.aClass293_1.aByteArray86;
			}
			@Pc(1085) float local1085 = 3.0F / (float) this.aShort101;
			local183.anInt9170 = local109;
			local590 = 3.0F / (float) (this.aShort101 + this.aShort101 / 2);
			if (this.aClass7_Sub2_34.aBoolean388) {
				for (local228 = 0; local228 < this.anInt8062; local228++) {
					local237 = local438[local228] & 0xFF;
					if (local237 == 0) {
						local183.method3608(local590 * (float) local442[local228]);
						local183.method3608((float) local434[local228] * local590);
						local183.method3608(local590 * (float) local446[local228]);
					} else {
						local535 = local1085 / (float) local237;
						local183.method3608(local535 * (float) local442[local228]);
						local183.method3608((float) local434[local228] * local535);
						local183.method3608((float) local446[local228] * local535);
					}
					local183.anInt9170 += local103 - 12;
				}
			} else {
				for (local228 = 0; local228 < this.anInt8062; local228++) {
					local237 = local438[local228] & 0xFF;
					if (local237 == 0) {
						local183.method3607((float) local442[local228] * local590);
						local183.method3607((float) local434[local228] * local590);
						local183.method3607((float) local446[local228] * local590);
					} else {
						local535 = local1085 / (float) local237;
						local183.method3607((float) local442[local228] * local535);
						local183.method3607((float) local434[local228] * local535);
						local183.method3607(local535 * (float) local446[local228]);
					}
					local183.anInt9170 += local103 - 12;
				}
			}
		}
		if (local55) {
			local183.anInt9170 = local120;
			if (this.aClass7_Sub2_34.aBoolean388) {
				for (local191 = 0; local191 < this.anInt8062; local191++) {
					local183.method3608(this.aFloatArray60[local191]);
					local183.method3608(this.aFloatArray59[local191]);
					local183.anInt9170 += local103 - 8;
				}
			} else {
				for (local191 = 0; local191 < this.anInt8062; local191++) {
					local183.method3607(this.aFloatArray60[local191]);
					local183.method3607(this.aFloatArray59[local191]);
					local183.anInt9170 += local103 - 8;
				}
			}
		}
		local183.anInt9170 = this.anInt8062 * local103;
		@Pc(1401) Interface16 local1401;
		if (arg0) {
			if (this.anInterface16_7 == null) {
				this.anInterface16_7 = this.aClass7_Sub2_34.method4301(local183.aByteArray88, local103, true, local183.anInt9170);
			} else {
				this.anInterface16_7.method6365(local183.aByteArray88, local103, local183.anInt9170);
			}
			this.aByte114 = 0;
			local1401 = this.anInterface16_7;
		} else {
			local1401 = this.aClass7_Sub2_34.method4301(local183.aByteArray88, local103, false, local183.anInt9170);
			this.aBoolean577 = true;
		}
		if (local44) {
			this.aClass209_15.anInterface16_6 = local1401;
			this.aClass209_15.aByte96 = 0;
		}
		if (local55) {
			this.aClass209_16.anInterface16_6 = local1401;
			this.aClass209_16.aByte96 = local120;
		}
		if (local22) {
			this.aClass209_14.aByte96 = local107;
			this.aClass209_14.anInterface16_6 = local1401;
		}
		if (local33) {
			this.aClass209_13.aByte96 = local109;
			this.aClass209_13.anInterface16_6 = local1401;
		}
	}

	@OriginalMember(owner = "client!qb", name = "PA", descriptor = "()I")
	@Override
	public int PA() {
		return this.anInt8047;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method7684(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) boolean arg3) {
		return this.method6290(arg2, arg1, -1, arg3, arg0);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7665(@OriginalArg(0) Class81 arg0) {
		@Pc(8) Class81_Sub2 local8 = (Class81_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass190Array2 != null) {
			for (local13 = 0; local13 < this.aClass190Array2.length; local13++) {
				@Pc(20) Class190 local20 = this.aClass190Array2[local13];
				@Pc(22) Class190 local22 = local20;
				if (local20.aClass190_1 != null) {
					local22 = local20.aClass190_1;
				}
				local22.anInt5828 = (int) ((float) this.anIntArray450[local20.anInt5819] * local8.aFloat91 + local8.aFloat95 * (float) this.anIntArray451[local20.anInt5819] + (float) this.anIntArray452[local20.anInt5819] * local8.aFloat94 + local8.aFloat87);
				local22.anInt5820 = (int) ((float) this.anIntArray451[local20.anInt5819] * local8.aFloat92 + local8.aFloat89 * (float) this.anIntArray452[local20.anInt5819] + local8.aFloat90 * (float) this.anIntArray450[local20.anInt5819] + local8.aFloat88);
				local22.anInt5817 = (int) ((float) this.anIntArray450[local20.anInt5819] * local8.aFloat86 + (float) this.anIntArray452[local20.anInt5819] * local8.aFloat84 + (float) this.anIntArray451[local20.anInt5819] * local8.aFloat85 + local8.aFloat93);
				local22.anInt5818 = (int) (local8.aFloat87 + (float) this.anIntArray451[local20.anInt5824] * local8.aFloat95 + (float) this.anIntArray452[local20.anInt5824] * local8.aFloat94 + (float) this.anIntArray450[local20.anInt5824] * local8.aFloat91);
				local22.anInt5826 = (int) (local8.aFloat92 * (float) this.anIntArray451[local20.anInt5824] + (float) this.anIntArray452[local20.anInt5824] * local8.aFloat89 + (float) this.anIntArray450[local20.anInt5824] * local8.aFloat90 + local8.aFloat88);
				local22.anInt5815 = (int) (local8.aFloat93 + local8.aFloat85 * (float) this.anIntArray451[local20.anInt5824] + (float) this.anIntArray452[local20.anInt5824] * local8.aFloat84 + (float) this.anIntArray450[local20.anInt5824] * local8.aFloat86);
				local22.anInt5821 = (int) (local8.aFloat87 + local8.aFloat95 * (float) this.anIntArray451[local20.anInt5816] + local8.aFloat94 * (float) this.anIntArray452[local20.anInt5816] + local8.aFloat91 * (float) this.anIntArray450[local20.anInt5816]);
				local22.anInt5829 = (int) (local8.aFloat92 * (float) this.anIntArray451[local20.anInt5816] + local8.aFloat89 * (float) this.anIntArray452[local20.anInt5816] + (float) this.anIntArray450[local20.anInt5816] * local8.aFloat90 + local8.aFloat88);
				local22.anInt5814 = (int) (local8.aFloat93 + (float) this.anIntArray450[local20.anInt5816] * local8.aFloat86 + local8.aFloat85 * (float) this.anIntArray451[local20.anInt5816] + local8.aFloat84 * (float) this.anIntArray452[local20.anInt5816]);
			}
		}
		if (this.aClass52Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass52Array3.length; local13++) {
			@Pc(361) Class52 local361 = this.aClass52Array3[local13];
			@Pc(363) Class52 local363 = local361;
			if (local361.aClass52_1 != null) {
				local363 = local361.aClass52_1;
			}
			if (local361.aClass81_2 == null) {
				local361.aClass81_2 = local8.method6585();
			} else {
				local361.aClass81_2.M(local8);
			}
			local363.anInt1625 = (int) (local8.aFloat94 * (float) this.anIntArray452[local361.anInt1626] + (float) this.anIntArray451[local361.anInt1626] * local8.aFloat95 + (float) this.anIntArray450[local361.anInt1626] * local8.aFloat91 + local8.aFloat87);
			local363.anInt1621 = (int) (local8.aFloat90 * (float) this.anIntArray450[local361.anInt1626] + local8.aFloat89 * (float) this.anIntArray452[local361.anInt1626] + local8.aFloat92 * (float) this.anIntArray451[local361.anInt1626] + local8.aFloat88);
			local363.anInt1622 = (int) (local8.aFloat84 * (float) this.anIntArray452[local361.anInt1626] + local8.aFloat85 * (float) this.anIntArray451[local361.anInt1626] + local8.aFloat86 * (float) this.anIntArray450[local361.anInt1626] + local8.aFloat93);
		}
	}

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "()Z")
	@Override
	protected boolean F() {
		if (this.anIntArrayArray44 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt8022; local12++) {
			this.anIntArray452[local12] <<= 0x4;
			this.anIntArray451[local12] <<= 0x4;
			this.anIntArray450[local12] <<= 0x4;
		}
		Static365.anInt7042 = 0;
		Static485.anInt9204 = 0;
		Static80.anInt2160 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray420[arg0];
		@Pc(13) int local13 = Class262.anIntArray421[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt8032; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray452[local15] + local9 * this.anIntArray450[local15] >> 14;
			this.anIntArray450[local15] = local13 * this.anIntArray450[local15] - local9 * this.anIntArray452[local15] >> 14;
			this.anIntArray452[local15] = local33;
		}
		if (this.aClass209_15 != null) {
			this.aClass209_15.anInterface16_6 = null;
		}
		this.aBoolean579 = false;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIZ)Lclient!da;")
	@Override
	public Class65 method7682(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class65_Sub2 local14;
		@Pc(18) Class65_Sub2 local18;
		if (arg0 == 1) {
			local14 = this.aClass7_Sub2_34.aClass65_Sub2_1;
			local18 = this.aClass7_Sub2_34.aClass65_Sub2_2;
		} else if (arg0 == 2) {
			local18 = this.aClass7_Sub2_34.aClass65_Sub2_7;
			local14 = this.aClass7_Sub2_34.aClass65_Sub2_9;
		} else if (arg0 == 3) {
			local18 = this.aClass7_Sub2_34.aClass65_Sub2_10;
			local14 = this.aClass7_Sub2_34.aClass65_Sub2_4;
		} else if (arg0 == 4) {
			local18 = this.aClass7_Sub2_34.aClass65_Sub2_3;
			local14 = this.aClass7_Sub2_34.aClass65_Sub2_6;
		} else if (arg0 == 5) {
			local14 = this.aClass7_Sub2_34.aClass65_Sub2_5;
			local18 = this.aClass7_Sub2_34.aClass65_Sub2_8;
		} else {
			local14 = local18 = new Class65_Sub2(this.aClass7_Sub2_34);
		}
		return this.method6296(arg1, arg2, local14, arg0 != 0, local18);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(JIIFFLclient!cr;IIII)S")
	private short method6295(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) Class59 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) int local10 = this.anIntArray449[arg7];
		@Pc(17) int local17 = this.anIntArray449[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray99[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static343.aLongArray13[local21] == arg0) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray99[local19] = (short) (this.anInt8062 + 1);
		Static343.aLongArray13[local19] = arg0;
		this.aShortArray102[this.anInt8062] = (short) arg1;
		this.aShortArray98[this.anInt8062] = (short) arg8;
		this.aShortArray101[this.anInt8062] = (short) arg6;
		this.aByteArray75[this.anInt8062] = (byte) arg2;
		this.aFloatArray60[this.anInt8062] = arg4;
		this.aFloatArray59[this.anInt8062] = arg3;
		return (short) this.anInt8062++;
	}

	@OriginalMember(owner = "client!qb", name = "na", descriptor = "()I")
	@Override
	public int na() {
		return this.aShort101;
	}

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "()I")
	@Override
	public int J() {
		if (!this.aBoolean579) {
			this.method6280();
		}
		return this.aShort97;
	}

	@OriginalMember(owner = "client!qb", name = "DA", descriptor = "(SS)V")
	@Override
	public void DA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass7_Sub2_34.anInterface7_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt8050; local11++) {
			if (this.aShortArray97[local11] == arg0) {
				this.aShortArray97[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class69 local47 = local9.method4460(arg0 & 0xFFFF);
			local35 = local47.aByte43;
			local37 = local47.aByte46;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class69 local68 = local9.method4460(arg1 & 0xFFFF);
			local55 = local68.aByte43;
			local57 = local68.aByte46;
		}
		if (!(local35 != local55 | local37 != local57)) {
			return;
		}
		if (this.aClass98Array1 != null) {
			for (@Pc(97) int local97 = 0; local97 < this.anInt8024; local97++) {
				@Pc(104) Class98 local104 = this.aClass98Array1[local97];
				@Pc(109) Class131 local109 = this.aClass131Array1[local97];
				local109.anInt3746 = local109.anInt3746 & 0xFF000000 | Static394.anIntArray413[this.aShortArray105[local104.anInt2884] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass209_14 != null) {
			this.aClass209_14.anInterface16_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()[Lclient!kw;")
	@Override
	public Class190[] method7675() {
		return this.aClass190Array2;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBZLclient!qb;ZLclient!qb;)Lclient!da;")
	private Class65 method6296(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class65_Sub2 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class65_Sub2 arg4) {
		if ((arg0 & 0x100) == 0) {
			arg2.aBoolean578 = this.aBoolean578;
		} else {
			arg2.aBoolean578 = true;
		}
		arg2.anInt8050 = this.anInt8050;
		arg2.anInt8053 = this.anInt8053;
		arg2.aShort100 = this.aShort100;
		arg2.anInt8022 = this.anInt8022;
		arg2.aByte114 = 0;
		arg2.anInt8062 = this.anInt8062;
		arg2.anInt8032 = this.anInt8032;
		arg2.anInt8024 = this.anInt8024;
		arg2.anInt8020 = this.anInt8020;
		arg2.aShort101 = this.aShort101;
		arg2.anInt8047 = arg0;
		@Pc(66) boolean local66 = Static235.method3839(arg0, this.anInt8053);
		@Pc(72) boolean local72 = Static186.method3074(this.anInt8053, arg0);
		@Pc(78) boolean local78 = Static105.method6898(this.anInt8053, arg0);
		@Pc(84) boolean local84 = local72 | local66 | local78;
		@Pc(203) int local203;
		if (local84) {
			if (!local66) {
				arg2.anIntArray452 = this.anIntArray452;
			} else if (arg4.anIntArray452 == null || this.anInt8022 > arg4.anIntArray452.length) {
				arg2.anIntArray452 = arg4.anIntArray452 = new int[this.anInt8022];
			} else {
				arg2.anIntArray452 = arg4.anIntArray452;
			}
			if (!local72) {
				arg2.anIntArray451 = this.anIntArray451;
			} else if (arg4.anIntArray451 == null || arg4.anIntArray451.length < this.anInt8022) {
				arg2.anIntArray451 = arg4.anIntArray451 = new int[this.anInt8022];
			} else {
				arg2.anIntArray451 = arg4.anIntArray451;
			}
			if (!local78) {
				arg2.anIntArray450 = this.anIntArray450;
			} else if (arg4.anIntArray450 == null || this.anInt8022 > arg4.anIntArray450.length) {
				arg2.anIntArray450 = arg4.anIntArray450 = new int[this.anInt8022];
			} else {
				arg2.anIntArray450 = arg4.anIntArray450;
			}
			for (local203 = 0; local203 < this.anInt8022; local203++) {
				if (local66) {
					arg2.anIntArray452[local203] = this.anIntArray452[local203];
				}
				if (local72) {
					arg2.anIntArray451[local203] = this.anIntArray451[local203];
				}
				if (local78) {
					arg2.anIntArray450[local203] = this.anIntArray450[local203];
				}
			}
		} else {
			arg2.anIntArray451 = this.anIntArray451;
			arg2.anIntArray450 = this.anIntArray450;
			arg2.anIntArray452 = this.anIntArray452;
		}
		if (Static232.method3760(this.anInt8053, arg0)) {
			if (arg3) {
				arg2.aByte114 = (byte) (arg2.aByte114 | 0x1);
			}
			arg2.aClass209_15 = arg4.aClass209_15;
			arg2.aClass209_15.aByte96 = this.aClass209_15.aByte96;
			arg2.aClass209_15.anInterface16_6 = this.aClass209_15.anInterface16_6;
		} else if (Static436.method6473(this.anInt8053, arg0)) {
			arg2.aClass209_15 = this.aClass209_15;
		} else {
			arg2.aClass209_15 = null;
		}
		if (Static359.method5414(this.anInt8053, arg0)) {
			if (arg4.aShortArray105 == null || this.anInt8050 > arg4.aShortArray105.length) {
				arg2.aShortArray105 = arg4.aShortArray105 = new short[this.anInt8050];
			} else {
				arg2.aShortArray105 = arg4.aShortArray105;
			}
			for (local203 = 0; local203 < this.anInt8050; local203++) {
				arg2.aShortArray105[local203] = this.aShortArray105[local203];
			}
		} else {
			arg2.aShortArray105 = this.aShortArray105;
		}
		if (Static119.method2177(arg0, this.anInt8053)) {
			if (arg4.aByteArray74 == null || arg4.aByteArray74.length < this.anInt8050) {
				arg2.aByteArray74 = arg4.aByteArray74 = new byte[this.anInt8050];
			} else {
				arg2.aByteArray74 = arg4.aByteArray74;
			}
			for (local203 = 0; local203 < this.anInt8050; local203++) {
				arg2.aByteArray74[local203] = this.aByteArray74[local203];
			}
		} else {
			arg2.aByteArray74 = this.aByteArray74;
		}
		if (Static378.method5890(this.anInt8053, arg0)) {
			if (arg3) {
				arg2.aByte114 = (byte) (arg2.aByte114 | 0x2);
			}
			arg2.aClass209_14 = arg4.aClass209_14;
			arg2.aClass209_14.anInterface16_6 = this.aClass209_14.anInterface16_6;
			arg2.aClass209_14.aByte96 = this.aClass209_14.aByte96;
		} else if (Static183.method3007(this.anInt8053, arg0)) {
			arg2.aClass209_14 = this.aClass209_14;
		} else {
			arg2.aClass209_14 = null;
		}
		@Pc(595) int local595;
		if (Static131.method2389(arg0, this.anInt8053)) {
			if (arg4.aShortArray102 == null || this.anInt8062 > arg4.aShortArray102.length) {
				local203 = this.anInt8062;
				arg2.aShortArray101 = arg4.aShortArray101 = new short[local203];
				arg2.aShortArray102 = arg4.aShortArray102 = new short[local203];
				arg2.aShortArray98 = arg4.aShortArray98 = new short[local203];
			} else {
				arg2.aShortArray101 = arg4.aShortArray101;
				arg2.aShortArray102 = arg4.aShortArray102;
				arg2.aShortArray98 = arg4.aShortArray98;
			}
			if (this.aClass293_1 == null) {
				for (local203 = 0; local203 < this.anInt8062; local203++) {
					arg2.aShortArray102[local203] = this.aShortArray102[local203];
					arg2.aShortArray98[local203] = this.aShortArray98[local203];
					arg2.aShortArray101[local203] = this.aShortArray101[local203];
				}
			} else {
				if (arg4.aClass293_1 == null) {
					arg4.aClass293_1 = new Class293();
				}
				@Pc(579) Class293 local579 = arg2.aClass293_1 = arg4.aClass293_1;
				if (local579.aShortArray125 == null || this.anInt8062 > local579.aShortArray125.length) {
					local595 = this.anInt8062;
					local579.aShortArray124 = new short[local595];
					local579.aShortArray126 = new short[local595];
					local579.aShortArray125 = new short[local595];
					local579.aByteArray86 = new byte[local595];
				}
				for (local595 = 0; local595 < this.anInt8062; local595++) {
					arg2.aShortArray102[local595] = this.aShortArray102[local595];
					arg2.aShortArray98[local595] = this.aShortArray98[local595];
					arg2.aShortArray101[local595] = this.aShortArray101[local595];
					local579.aShortArray125[local595] = this.aClass293_1.aShortArray125[local595];
					local579.aShortArray126[local595] = this.aClass293_1.aShortArray126[local595];
					local579.aShortArray124[local595] = this.aClass293_1.aShortArray124[local595];
					local579.aByteArray86[local595] = this.aClass293_1.aByteArray86[local595];
				}
			}
			arg2.aByteArray75 = this.aByteArray75;
		} else {
			arg2.aShortArray102 = this.aShortArray102;
			arg2.aShortArray98 = this.aShortArray98;
			arg2.aShortArray101 = this.aShortArray101;
			arg2.aByteArray75 = this.aByteArray75;
			arg2.aClass293_1 = this.aClass293_1;
		}
		if (Static386.method5965(arg0, this.anInt8053)) {
			arg2.aClass209_13 = arg4.aClass209_13;
			if (arg3) {
				arg2.aByte114 = (byte) (arg2.aByte114 | 0x4);
			}
			arg2.aClass209_13.aByte96 = this.aClass209_13.aByte96;
			arg2.aClass209_13.anInterface16_6 = this.aClass209_13.anInterface16_6;
		} else if (Static448.method7384(this.anInt8053, arg0)) {
			arg2.aClass209_13 = this.aClass209_13;
		} else {
			arg2.aClass209_13 = null;
		}
		if (Static83.method1772(arg0, this.anInt8053)) {
			if (arg4.aFloatArray60 == null || this.anInt8050 > arg4.aFloatArray60.length) {
				local203 = this.anInt8062;
				arg2.aFloatArray60 = arg4.aFloatArray60 = new float[local203];
				arg2.aFloatArray59 = arg4.aFloatArray59 = new float[local203];
			} else {
				arg2.aFloatArray60 = arg4.aFloatArray60;
				arg2.aFloatArray59 = arg4.aFloatArray59;
			}
			for (local203 = 0; local203 < this.anInt8062; local203++) {
				arg2.aFloatArray60[local203] = this.aFloatArray60[local203];
				arg2.aFloatArray59[local203] = this.aFloatArray59[local203];
			}
		} else {
			arg2.aFloatArray60 = this.aFloatArray60;
			arg2.aFloatArray59 = this.aFloatArray59;
		}
		if (Static109.method2013(arg0, this.anInt8053)) {
			if (arg3) {
				arg2.aByte114 = (byte) (arg2.aByte114 | 0x8);
			}
			arg2.aClass209_16 = arg4.aClass209_16;
			arg2.aClass209_16.aByte96 = this.aClass209_16.aByte96;
			arg2.aClass209_16.anInterface16_6 = this.aClass209_16.anInterface16_6;
		} else if (Static404.method6136(this.anInt8053, arg0)) {
			arg2.aClass209_16 = this.aClass209_16;
		} else {
			arg2.aClass209_16 = null;
		}
		if (Static476.method6917(arg0, this.anInt8053)) {
			if (arg4.aShortArray106 == null || this.anInt8050 > arg4.aShortArray106.length) {
				local203 = this.anInt8050;
				arg2.aShortArray103 = arg4.aShortArray103 = new short[local203];
				arg2.aShortArray107 = arg4.aShortArray107 = new short[local203];
				arg2.aShortArray106 = arg4.aShortArray106 = new short[local203];
			} else {
				arg2.aShortArray106 = arg4.aShortArray106;
				arg2.aShortArray107 = arg4.aShortArray107;
				arg2.aShortArray103 = arg4.aShortArray103;
			}
			for (local203 = 0; local203 < this.anInt8050; local203++) {
				arg2.aShortArray106[local203] = this.aShortArray106[local203];
				arg2.aShortArray103[local203] = this.aShortArray103[local203];
				arg2.aShortArray107[local203] = this.aShortArray107[local203];
			}
		} else {
			arg2.aShortArray106 = this.aShortArray106;
			arg2.aShortArray107 = this.aShortArray107;
			arg2.aShortArray103 = this.aShortArray103;
		}
		if (Static313.method4936(this.anInt8053, arg0)) {
			arg2.aClass153_1 = arg4.aClass153_1;
			if (arg3) {
				arg2.aByte114 = (byte) (arg2.aByte114 | 0x10);
			}
			arg2.aClass153_1.anInterface14_3 = this.aClass153_1.anInterface14_3;
		} else if (Static405.method6140(arg0, this.anInt8053)) {
			arg2.aClass153_1 = this.aClass153_1;
		} else {
			arg2.aClass153_1 = null;
		}
		if (Static582.method8146(arg0, this.anInt8053)) {
			if (arg4.aShortArray97 == null || this.anInt8050 > arg4.aShortArray97.length) {
				local203 = this.anInt8050;
				arg2.aShortArray97 = arg4.aShortArray97 = new short[local203];
			} else {
				arg2.aShortArray97 = arg4.aShortArray97;
			}
			for (local203 = 0; local203 < this.anInt8050; local203++) {
				arg2.aShortArray97[local203] = this.aShortArray97[local203];
			}
		} else {
			arg2.aShortArray97 = this.aShortArray97;
		}
		if (!Static453.method6645(arg0, this.anInt8053)) {
			arg2.aClass131Array1 = this.aClass131Array1;
		} else if (arg4.aClass131Array1 == null || arg4.aClass131Array1.length < this.anInt8024) {
			local203 = this.anInt8024;
			arg2.aClass131Array1 = arg4.aClass131Array1 = new Class131[local203];
			for (local595 = 0; local595 < this.anInt8024; local595++) {
				arg2.aClass131Array1[local595] = this.aClass131Array1[local595].method2952();
			}
		} else {
			arg2.aClass131Array1 = arg4.aClass131Array1;
			for (local203 = 0; local203 < this.anInt8024; local203++) {
				arg2.aClass131Array1[local203].method2950(this.aClass131Array1[local203]);
			}
		}
		arg2.aShortArray99 = this.aShortArray99;
		arg2.anIntArray449 = this.anIntArray449;
		arg2.aClass190Array2 = this.aClass190Array2;
		arg2.aClass52Array3 = this.aClass52Array3;
		arg2.anIntArray453 = this.anIntArray453;
		arg2.anIntArrayArray44 = this.anIntArrayArray44;
		if (this.aBoolean579) {
			arg2.aShort98 = this.aShort98;
			arg2.aBoolean579 = true;
			arg2.aShort92 = this.aShort92;
			arg2.aShort93 = this.aShort93;
			arg2.aShort97 = this.aShort97;
			arg2.aShort96 = this.aShort96;
			arg2.aShort94 = this.aShort94;
			arg2.aShort95 = this.aShort95;
			arg2.aShort99 = this.aShort99;
		} else {
			arg2.aBoolean579 = false;
		}
		arg2.anIntArrayArray42 = this.anIntArrayArray42;
		arg2.aShortArray104 = this.aShortArray104;
		arg2.anIntArrayArray43 = this.anIntArrayArray43;
		arg2.aClass98Array1 = this.aClass98Array1;
		arg2.aShortArray100 = this.aShortArray100;
		return arg2;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!q;ZI)Z")
	@Override
	public boolean method7685(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6290(arg2, arg1, arg4, arg3, arg0);
	}

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "(Lclient!ha;)Lclient!ha;")
	@Override
	public Class4_Sub6_Sub7 S(@OriginalArg(0) Class4_Sub6_Sub7 arg0) {
		if (this.anInt8062 == 0) {
			return null;
		}
		if (!this.aBoolean579) {
			this.method6280();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass7_Sub2_34.anInt5636 > 0) {
			local43 = this.aShort95 - (this.aClass7_Sub2_34.anInt5636 * this.aShort96 >> 8) >> this.aClass7_Sub2_34.anInt5598;
			local60 = this.aShort99 - (this.aClass7_Sub2_34.anInt5636 * this.aShort97 >> 8) >> this.aClass7_Sub2_34.anInt5598;
		} else {
			local43 = this.aShort95 - (this.aShort97 * this.aClass7_Sub2_34.anInt5636 >> 8) >> this.aClass7_Sub2_34.anInt5598;
			local60 = this.aShort99 - (this.aShort96 * this.aClass7_Sub2_34.anInt5636 >> 8) >> this.aClass7_Sub2_34.anInt5598;
		}
		@Pc(120) int local120;
		@Pc(137) int local137;
		if (this.aClass7_Sub2_34.anInt5640 > 0) {
			local120 = this.aShort92 - (this.aClass7_Sub2_34.anInt5640 * this.aShort96 >> 8) >> this.aClass7_Sub2_34.anInt5598;
			local137 = this.aShort93 - (this.aShort97 * this.aClass7_Sub2_34.anInt5640 >> 8) >> this.aClass7_Sub2_34.anInt5598;
		} else {
			local120 = this.aShort92 - (this.aClass7_Sub2_34.anInt5640 * this.aShort97 >> 8) >> this.aClass7_Sub2_34.anInt5598;
			local137 = this.aShort93 - (this.aClass7_Sub2_34.anInt5640 * this.aShort96 >> 8) >> this.aClass7_Sub2_34.anInt5598;
		}
		@Pc(180) int local180 = local60 + 1 - local43;
		@Pc(187) int local187 = local137 + 1 - local120;
		@Pc(190) Class4_Sub6_Sub7_Sub1 local190 = (Class4_Sub6_Sub7_Sub1) arg0;
		@Pc(206) Class4_Sub6_Sub7_Sub1 local206;
		if (local190 != null && local190.method3192(local180, local187)) {
			local206 = local190;
			local190.method3195();
		} else {
			local206 = new Class4_Sub6_Sub7_Sub1(this.aClass7_Sub2_34, local180, local187);
		}
		local206.method3196(local137, local120, local43, local60);
		this.method6297(local206);
		return local206;
	}

	@OriginalMember(owner = "client!qb", name = "ba", descriptor = "(IILclient!i;Lclient!i;III)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class115 arg2, @OriginalArg(3) Class115 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean579) {
			this.method6280();
		}
		@Pc(16) int local16 = this.aShort95 + arg4;
		@Pc(21) int local21 = this.aShort99 + arg4;
		@Pc(26) int local26 = this.aShort92 + arg6;
		@Pc(31) int local31 = this.aShort93 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt10333 >> arg2.anInt10331 >= arg2.anInt10330 || local26 < 0 || arg2.anInt10333 + local31 >> arg2.anInt10331 >= arg2.anInt10327)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt10330 <= local21 + arg3.anInt10333 >> arg3.anInt10331 || local26 < 0 || local31 + arg3.anInt10333 >> arg3.anInt10331 >= arg3.anInt10327) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10331;
			local21 = arg2.anInt10333 + local21 - 1 >> arg2.anInt10331;
			local26 >>= arg2.anInt10331;
			local31 = arg2.anInt10333 + local31 - 1 >> arg2.anInt10331;
			if (arg5 == arg2.method8055(local26, local16) && arg2.method8055(local26, local21) == arg5 && arg5 == arg2.method8055(local31, local16) && arg2.method8055(local31, local21) == arg5) {
				return;
			}
		}
		@Pc(268) int local268;
		if (arg0 == 1) {
			for (local268 = 0; local268 < this.anInt8032; local268++) {
				this.anIntArray451[local268] -= arg5 - arg2.method8064(this.anIntArray452[local268] + arg4, this.anIntArray450[local268] + arg6);
			}
		} else {
			@Pc(200) int local200;
			@Pc(211) int local211;
			if (arg0 == 2) {
				@Pc(195) short local195 = this.aShort97;
				if (local195 == 0) {
					return;
				}
				for (local200 = 0; local200 < this.anInt8032; local200++) {
					local211 = (this.anIntArray451[local200] << 16) / local195;
					if (local211 < arg1) {
						this.anIntArray451[local200] += (arg1 - local211) * (arg2.method8064(arg4 + this.anIntArray452[local200], arg6 + this.anIntArray450[local200]) - arg5) / arg1;
					}
				}
			} else {
				@Pc(292) int local292;
				if (arg0 == 3) {
					local268 = (arg1 & 0xFF) * 4;
					local200 = (arg1 >> 8 & 0xFF) * 4;
					local211 = (arg1 >> 16 & 0xFF) << 6;
					local292 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local268 >> 1) < 0 || arg2.anInt10330 << arg2.anInt10331 <= (local268 >> 1) + (arg4 + arg2.anInt10333) || arg6 - (local200 >> 1) < 0 || (local200 >> 1) + arg6 + arg2.anInt10333 >= arg2.anInt10327 << arg2.anInt10331) {
						return;
					}
					this.method7672(arg2, local200, arg5, local292, local268, arg4, local211, arg6);
				} else if (arg0 == 4) {
					local268 = this.aShort96 - this.aShort97;
					for (local200 = 0; local200 < this.anInt8032; local200++) {
						this.anIntArray451[local200] = local268 + this.anIntArray451[local200] + arg3.method8064(arg4 + this.anIntArray452[local200], arg6 + this.anIntArray450[local200]) - arg5;
					}
				} else if (arg0 == 5) {
					local268 = this.aShort96 - this.aShort97;
					for (local200 = 0; local200 < this.anInt8032; local200++) {
						local211 = this.anIntArray452[local200] + arg4;
						local292 = this.anIntArray450[local200] + arg6;
						@Pc(393) int local393 = arg2.method8064(local211, local292);
						@Pc(399) int local399 = arg3.method8064(local211, local292);
						@Pc(407) int local407 = local393 - local399 - arg1;
						this.anIntArray451[local200] = (local407 * ((this.anIntArray451[local200] << 8) / local268) >> 8) + local393 - arg5;
					}
				}
			}
		}
		if (this.aClass209_15 != null) {
			this.aClass209_15.anInterface16_6 = null;
		}
		this.aBoolean579 = false;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "()Z")
	@Override
	public boolean method7687() {
		if (this.aShortArray97 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray97.length; local12++) {
			if (this.aShortArray97[local12] != -1 && !this.aClass7_Sub2_34.anInterface7_12.method4463(this.aShortArray97[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "()[Lclient!cea;")
	@Override
	public Class52[] method7688() {
		return this.aClass52Array3;
	}

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "(I)V")
	@Override
	public void T(@OriginalArg(0) int arg0) {
		this.aShort100 = (short) arg0;
		if (this.aClass209_14 != null) {
			this.aClass209_14.anInterface16_6 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "fa", descriptor = "(I)V")
	@Override
	public void fa(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class262.anIntArray420[arg0];
		@Pc(13) int local13 = Class262.anIntArray421[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt8032; local15++) {
			local33 = this.anIntArray452[local15] * local13 + local9 * this.anIntArray450[local15] >> 14;
			this.anIntArray450[local15] = local13 * this.anIntArray450[local15] - local9 * this.anIntArray452[local15] >> 14;
			this.anIntArray452[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt8062; local33++) {
			@Pc(82) int local82 = local9 * this.aShortArray101[local33] + local13 * this.aShortArray102[local33] >> 14;
			this.aShortArray101[local33] = (short) (this.aShortArray101[local33] * local13 - local9 * this.aShortArray102[local33] >> 14);
			this.aShortArray102[local33] = (short) local82;
		}
		if (this.aClass209_13 == null && this.aClass209_14 != null) {
			this.aClass209_14.anInterface16_6 = null;
		}
		if (this.aClass209_13 != null) {
			this.aClass209_13.anInterface16_6 = null;
		}
		if (this.aClass209_15 != null) {
			this.aClass209_15.anInterface16_6 = null;
		}
		this.aBoolean579 = false;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLclient!hk;)V")
	private void method6297(@OriginalArg(1) Class4_Sub6_Sub7_Sub1 arg0) {
		if (this.anInt8062 > this.aClass7_Sub2_34.anIntArray294.length) {
			this.aClass7_Sub2_34.anIntArray293 = new int[this.anInt8062];
			this.aClass7_Sub2_34.anIntArray294 = new int[this.anInt8062];
		}
		@Pc(28) int[] local28 = this.aClass7_Sub2_34.anIntArray294;
		@Pc(32) int[] local32 = this.aClass7_Sub2_34.anIntArray293;
		@Pc(65) int local65;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(38) int local38 = 0; local38 < this.anInt8032; local38++) {
			local65 = (this.anIntArray452[local38] - (this.anIntArray451[local38] * this.aClass7_Sub2_34.anInt5636 >> 8) >> this.aClass7_Sub2_34.anInt5598) - arg0.anInt4046;
			@Pc(89) int local89 = (this.anIntArray450[local38] - (this.aClass7_Sub2_34.anInt5640 * this.anIntArray451[local38] >> 8) >> this.aClass7_Sub2_34.anInt5598) - arg0.anInt4044;
			@Pc(94) int local94 = this.anIntArray449[local38];
			@Pc(101) int local101 = this.anIntArray449[local38 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray99[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local28[local112] = local65;
				local32[local112] = local89;
			}
		}
		for (local65 = 0; local65 < this.anInt8020; local65++) {
			if (this.aByteArray74 == null || this.aByteArray74[local65] <= 128) {
				@Pc(151) short local151 = this.aShortArray106[local65];
				@Pc(156) short local156 = this.aShortArray103[local65];
				@Pc(161) short local161 = this.aShortArray107[local65];
				local103 = local28[local151];
				local112 = local28[local156];
				@Pc(173) int local173 = local28[local161];
				@Pc(177) int local177 = local32[local151];
				@Pc(181) int local181 = local32[local156];
				@Pc(185) int local185 = local32[local161];
				if ((local181 - local185) * (local103 - local112) - (local181 - local177) * (-local112 + local173) > 0) {
					arg0.method3193(local181, local185, local103, local177, local173, local112);
				}
			}
		}
	}
}
