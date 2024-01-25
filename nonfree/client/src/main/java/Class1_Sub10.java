import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "[B")
	public byte[] aByteArray11;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "[S")
	public short[] aShortArray14;

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "[Lclient!ua;")
	public Class1_Sub39_Sub1[] aClass1_Sub39_Sub1Array1;

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "[Lclient!ag;")
	public Class5[] aClass5Array1;

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "[I")
	private int[] anIntArray44;

	static {
		new Class106("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	private Class1_Sub10() {
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B)V")
	public Class1_Sub10(@OriginalArg(0) byte[] arg0) {
		this.anIntArray44 = new int[128];
		this.aShortArray14 = new short[128];
		this.aByteArray13 = new byte[128];
		this.aByteArray11 = new byte[128];
		this.aClass5Array1 = new Class5[128];
		this.aByteArray12 = new byte[128];
		this.aClass1_Sub39_Sub1Array1 = new Class1_Sub39_Sub1[128];
		@Pc(36) Class1_Sub7 local36 = new Class1_Sub7(arg0);
		@Pc(38) int local38;
		for (local38 = 0; local36.aByteArray41[local36.anInt2219 + local38] != 0; local38++) {
		}
		@Pc(53) byte[] local53 = new byte[local38];
		for (@Pc(55) int local55 = 0; local55 < local38; local55++) {
			local53[local55] = local36.method2122();
		}
		local36.anInt2219++;
		local38++;
		@Pc(81) int local81 = local36.anInt2219;
		local36.anInt2219 += local38;
		@Pc(89) int local89;
		for (local89 = 0; local36.aByteArray41[local36.anInt2219 + local89] != 0; local89++) {
		}
		@Pc(107) byte[] local107 = new byte[local89];
		for (@Pc(109) int local109 = 0; local109 < local89; local109++) {
			local107[local109] = local36.method2122();
		}
		local36.anInt2219++;
		local89++;
		@Pc(131) int local131 = local36.anInt2219;
		local36.anInt2219 += local89;
		@Pc(139) int local139;
		for (local139 = 0; local36.aByteArray41[local36.anInt2219 + local139] != 0; local139++) {
		}
		@Pc(156) byte[] local156 = new byte[local139];
		for (@Pc(158) int local158 = 0; local158 < local139; local158++) {
			local156[local158] = local36.method2122();
		}
		local36.anInt2219++;
		local139++;
		@Pc(184) byte[] local184 = new byte[local139];
		@Pc(189) int local189;
		@Pc(201) int local201;
		@Pc(207) int local207;
		if (local139 <= 1) {
			local189 = local139;
		} else {
			local184[1] = 1;
			@Pc(197) int local197 = 1;
			local189 = 2;
			for (local201 = 2; local201 < local139; local201++) {
				local207 = local36.method2132();
				if (local207 == 0) {
					local197 = local189++;
				} else {
					if (local197 >= local207) {
						local207--;
					}
					local197 = local207;
				}
				local184[local201] = (byte) local197;
			}
		}
		@Pc(243) Class5[] local243 = new Class5[local189];
		for (local201 = 0; local201 < local243.length; local201++) {
			@Pc(255) Class5 local255 = local243[local201] = new Class5();
			@Pc(259) int local259 = local36.method2132();
			if (local259 > 0) {
				local255.aByteArray6 = new byte[local259 * 2];
			}
			local259 = local36.method2132();
			if (local259 > 0) {
				local255.aByteArray5 = new byte[local259 * 2 + 2];
				local255.aByteArray5[1] = 64;
			}
		}
		local207 = local36.method2132();
		@Pc(308) byte[] local308 = local207 <= 0 ? null : new byte[local207 * 2];
		local207 = local36.method2132();
		@Pc(324) byte[] local324 = local207 > 0 ? new byte[local207 * 2] : null;
		@Pc(326) int local326;
		for (local326 = 0; local36.aByteArray41[local36.anInt2219 + local326] != 0; local326++) {
		}
		@Pc(340) byte[] local340 = new byte[local326];
		for (@Pc(342) int local342 = 0; local342 < local326; local342++) {
			local340[local342] = local36.method2122();
		}
		local36.anInt2219++;
		local326++;
		@Pc(363) int local363 = 0;
		for (@Pc(365) int local365 = 0; local365 < 128; local365++) {
			local363 += local36.method2132();
			this.aShortArray14[local365] = (short) local363;
		}
		local363 = 0;
		for (@Pc(389) int local389 = 0; local389 < 128; local389++) {
			local363 += local36.method2132();
			this.aShortArray14[local389] = (short) (this.aShortArray14[local389] + (local363 << 8));
		}
		@Pc(416) int local416 = 0;
		@Pc(418) int local418 = 0;
		@Pc(420) int local420 = 0;
		for (@Pc(422) int local422 = 0; local422 < 128; local422++) {
			if (local416 == 0) {
				if (local340.length <= local418) {
					local416 = -1;
				} else {
					local416 = local340[local418++];
				}
				local420 = local36.method2129();
			}
			this.aShortArray14[local422] = (short) (this.aShortArray14[local422] + ((local420 - 1 & 0x2) << 14));
			this.anIntArray44[local422] = local420;
			local416--;
		}
		local418 = 0;
		local416 = 0;
		@Pc(480) int local480 = 0;
		for (@Pc(482) int local482 = 0; local482 < 128; local482++) {
			if (this.anIntArray44[local482] != 0) {
				if (local416 == 0) {
					if (local53.length > local418) {
						local416 = local53[local418++];
					} else {
						local416 = -1;
					}
					local480 = local36.aByteArray41[local81++] - 1;
				}
				this.aByteArray11[local482] = (byte) local480;
				local416--;
			}
		}
		local416 = 0;
		local418 = 0;
		@Pc(529) int local529 = 0;
		for (@Pc(531) int local531 = 0; local531 < 128; local531++) {
			if (this.anIntArray44[local531] != 0) {
				if (local416 == 0) {
					local529 = local36.aByteArray41[local131++] + 16 << 2;
					if (local107.length > local418) {
						local416 = local107[local418++];
					} else {
						local416 = -1;
					}
				}
				this.aByteArray13[local531] = (byte) local529;
				local416--;
			}
		}
		local416 = 0;
		local418 = 0;
		@Pc(589) Class5 local589 = null;
		for (@Pc(591) int local591 = 0; local591 < 128; local591++) {
			if (this.anIntArray44[local591] != 0) {
				if (local416 == 0) {
					local589 = local243[local184[local418]];
					if (local156.length <= local418) {
						local416 = -1;
					} else {
						local416 = local156[local418++];
					}
				}
				this.aClass5Array1[local591] = local589;
				local416--;
			}
		}
		local418 = 0;
		local416 = 0;
		@Pc(644) int local644 = 0;
		for (@Pc(646) int local646 = 0; local646 < 128; local646++) {
			if (local416 == 0) {
				if (local418 >= local340.length) {
					local416 = -1;
				} else {
					local416 = local340[local418++];
				}
				if (this.anIntArray44[local646] > 0) {
					local644 = local36.method2132() + 1;
				}
			}
			this.aByteArray12[local646] = (byte) local644;
			local416--;
		}
		this.anInt618 = local36.method2132() + 1;
		@Pc(709) int local709;
		for (@Pc(698) int local698 = 0; local698 < local189; local698++) {
			@Pc(704) Class5 local704 = local243[local698];
			if (local704.aByteArray6 != null) {
				for (local709 = 1; local709 < local704.aByteArray6.length; local709 += 2) {
					local704.aByteArray6[local709] = local36.method2122();
				}
			}
			if (local704.aByteArray5 != null) {
				for (local709 = 3; local709 < local704.aByteArray5.length - 2; local709 += 2) {
					local704.aByteArray5[local709] = local36.method2122();
				}
			}
		}
		@Pc(758) int local758;
		if (local308 != null) {
			for (local758 = 1; local758 < local308.length; local758 += 2) {
				local308[local758] = local36.method2122();
			}
		}
		if (local324 != null) {
			for (local758 = 1; local758 < local324.length; local758 += 2) {
				local324[local758] = local36.method2122();
			}
		}
		@Pc(807) int local807;
		for (local758 = 0; local758 < local189; local758++) {
			@Pc(800) Class5 local800 = local243[local758];
			if (local800.aByteArray5 != null) {
				local363 = 0;
				for (local807 = 2; local807 < local800.aByteArray5.length; local807 += 2) {
					local363 = local363 + local36.method2132() + 1;
					local800.aByteArray5[local807] = (byte) local363;
				}
			}
		}
		@Pc(852) int local852;
		for (local709 = 0; local709 < local189; local709++) {
			@Pc(845) Class5 local845 = local243[local709];
			if (local845.aByteArray6 != null) {
				local363 = 0;
				for (local852 = 2; local852 < local845.aByteArray6.length; local852 += 2) {
					local363 = local363 + local36.method2132() + 1;
					local845.aByteArray6[local852] = (byte) local363;
				}
			}
		}
		@Pc(934) int local934;
		@Pc(961) int local961;
		@Pc(967) byte local967;
		@Pc(987) int local987;
		@Pc(989) int local989;
		@Pc(999) int local999;
		@Pc(928) byte local928;
		@Pc(1039) int local1039;
		if (local308 != null) {
			local363 = local36.method2132();
			local308[0] = (byte) local363;
			for (local807 = 2; local807 < local308.length; local807 += 2) {
				local363 += local36.method2132() + 1;
				local308[local807] = (byte) local363;
			}
			local928 = local308[0];
			@Pc(932) byte local932 = local308[1];
			for (local934 = 0; local934 < local928; local934++) {
				this.aByteArray12[local934] = (byte) (local932 * this.aByteArray12[local934] + 32 >> 6);
			}
			local961 = 2;
			while (local308.length > local961) {
				local967 = local308[local961];
				@Pc(973) byte local973 = local308[local961 + 1];
				local987 = (local967 - local928) / 2 + (local967 - local928) * local932;
				for (local989 = local928; local989 < local967; local989++) {
					local999 = Static306.method5305(local987, local967 - local928);
					local987 += local973 - local932;
					this.aByteArray12[local989] = (byte) (local999 * this.aByteArray12[local989] + 32 >> 6);
				}
				local928 = local967;
				local961 += 2;
				local932 = local973;
			}
			for (local1039 = local928; local1039 < 128; local1039++) {
				this.aByteArray12[local1039] = (byte) (local932 * this.aByteArray12[local1039] + 32 >> 6);
			}
		}
		@Pc(1106) int local1106;
		if (local324 != null) {
			local363 = local36.method2132();
			local324[0] = (byte) local363;
			for (local807 = 2; local807 < local324.length; local807 += 2) {
				local363 = local363 + local36.method2132() + 1;
				local324[local807] = (byte) local363;
			}
			local928 = local324[0];
			local1106 = local324[1] << 1;
			for (local934 = 0; local934 < local928; local934++) {
				local961 = (this.aByteArray13[local934] & 0xFF) + local1106;
				if (local961 < 0) {
					local961 = 0;
				}
				if (local961 > 128) {
					local961 = 128;
				}
				this.aByteArray13[local934] = (byte) local961;
			}
			@Pc(1154) int local1154;
			for (local961 = 2; local961 < local324.length; local961 += 2) {
				local967 = local324[local961];
				local1154 = local324[local961 + 1] << 1;
				local987 = local1106 * (local967 - local928) + (local967 - local928) / 2;
				for (local989 = local928; local989 < local967; local989++) {
					local999 = Static306.method5305(local987, local967 - local928);
					@Pc(1190) int local1190 = local999 + (this.aByteArray13[local989] & 0xFF);
					if (local1190 < 0) {
						local1190 = 0;
					}
					if (local1190 > 128) {
						local1190 = 128;
					}
					this.aByteArray13[local989] = (byte) local1190;
					local987 += local1154 - local1106;
				}
				local928 = local967;
				local1106 = local1154;
			}
			for (local1039 = local928; local1039 < 128; local1039++) {
				local1154 = local1106 + (this.aByteArray13[local1039] & 0xFF);
				if (local1154 < 0) {
					local1154 = 0;
				}
				if (local1154 > 128) {
					local1154 = 128;
				}
				this.aByteArray13[local1039] = (byte) local1154;
			}
		}
		for (local807 = 0; local807 < local189; local807++) {
			local243[local807].anInt200 = local36.method2132();
		}
		for (local852 = 0; local852 < local189; local852++) {
			@Pc(1288) Class5 local1288 = local243[local852];
			if (local1288.aByteArray6 != null) {
				local1288.anInt203 = local36.method2132();
			}
			if (local1288.aByteArray5 != null) {
				local1288.anInt196 = local36.method2132();
			}
			if (local1288.anInt200 > 0) {
				local1288.anInt199 = local36.method2132();
			}
		}
		for (local1106 = 0; local1106 < local189; local1106++) {
			local243[local1106].anInt202 = local36.method2132();
		}
		for (local934 = 0; local934 < local189; local934++) {
			@Pc(1343) Class5 local1343 = local243[local934];
			if (local1343.anInt202 > 0) {
				local1343.anInt204 = local36.method2132();
			}
		}
		for (local961 = 0; local961 < local189; local961++) {
			@Pc(1367) Class5 local1367 = local243[local961];
			if (local1367.anInt204 > 0) {
				local1367.anInt201 = local36.method2132();
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!oq;[II[B)Z")
	public boolean method649(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) boolean local13 = true;
		@Pc(15) int local15 = 0;
		@Pc(17) Class1_Sub39_Sub1 local17 = null;
		for (@Pc(19) int local19 = 0; local19 < 128; local19++) {
			if (arg2 == null || arg2[local19] != 0) {
				@Pc(31) int local31 = this.anIntArray44[local19];
				if (local31 != 0) {
					if (local31 != local15) {
						local15 = local31--;
						if ((local31 & 0x1) == 0) {
							local17 = arg0.method4301(local31 >> 2, arg1);
						} else {
							local17 = arg0.method4296(local31 >> 2, arg1);
						}
						if (local17 == null) {
							local13 = false;
						}
					}
					if (local17 != null) {
						this.aClass1_Sub39_Sub1Array1[local19] = local17;
						this.anIntArray44[local19] = 0;
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
	public void method650() {
		this.anIntArray44 = null;
	}
}
