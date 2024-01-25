import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oba")
public final class Class2_Sub3 extends Class2 {

	@OriginalMember(owner = "client!oba", name = "t", descriptor = "I")
	private int anInt6476;

	@OriginalMember(owner = "client!oba", name = "u", descriptor = "I")
	private int anInt6477;

	@OriginalMember(owner = "client!oba", name = "x", descriptor = "Lclient!pr;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!oba", name = "K", descriptor = "I")
	private int anInt6489;

	@OriginalMember(owner = "client!oba", name = "Q", descriptor = "I")
	private int anInt6495;

	@OriginalMember(owner = "client!oba", name = "S", descriptor = "Lclient!pr;")
	private Class235 aClass235_2;

	@OriginalMember(owner = "client!oba", name = "gb", descriptor = "I")
	private int anInt6504;

	@OriginalMember(owner = "client!oba", name = "kb", descriptor = "Lclient!pr;")
	private Class235 aClass235_3;

	@OriginalMember(owner = "client!oba", name = "tb", descriptor = "I")
	private int anInt6511;

	@OriginalMember(owner = "client!oba", name = "Bb", descriptor = "I")
	private int anInt6518;

	@OriginalMember(owner = "client!oba", name = "Ib", descriptor = "Lclient!pr;")
	private Class235 aClass235_4;

	@OriginalMember(owner = "client!oba", name = "Ob", descriptor = "I")
	private int anInt6526;

	@OriginalMember(owner = "client!oba", name = "Wb", descriptor = "Z")
	private boolean aBoolean411;

	@OriginalMember(owner = "client!oba", name = "ec", descriptor = "Lclient!uca;")
	private Class292 aClass292_1;

	@OriginalMember(owner = "client!oba", name = "jc", descriptor = "Z")
	private boolean aBoolean412;

	@OriginalMember(owner = "client!oba", name = "mc", descriptor = "I")
	private int anInt6539;

	@OriginalMember(owner = "client!oba", name = "rc", descriptor = "I")
	private int anInt6543;

	@OriginalMember(owner = "client!oba", name = "tc", descriptor = "Z")
	private boolean aBoolean413;

	@OriginalMember(owner = "client!oba", name = "yc", descriptor = "Lclient!ps;")
	private Class236 aClass236_1;

	@OriginalMember(owner = "client!oba", name = "zc", descriptor = "Lclient!tu;")
	private final Class5_Sub3 aClass5_Sub3_14;

	@OriginalMember(owner = "client!oba", name = "Vb", descriptor = "[I")
	private int[] anIntArray560;

	@OriginalMember(owner = "client!oba", name = "db", descriptor = "I")
	private int anInt6502;

	@OriginalMember(owner = "client!oba", name = "X", descriptor = "I")
	private int anInt6499;

	@OriginalMember(owner = "client!oba", name = "Ub", descriptor = "[I")
	private int[] anIntArray559;

	@OriginalMember(owner = "client!oba", name = "C", descriptor = "I")
	private int anInt6483;

	@OriginalMember(owner = "client!oba", name = "Mb", descriptor = "[I")
	private int[] anIntArray558;

	@OriginalMember(owner = "client!oba", name = "ob", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!oba", name = "rb", descriptor = "I")
	private int anInt6510;

	@OriginalMember(owner = "client!oba", name = "wc", descriptor = "[I")
	private int[] anIntArray562;

	@OriginalMember(owner = "client!oba", name = "Kb", descriptor = "[Lclient!gl;")
	private Class109[] aClass109Array5;

	@OriginalMember(owner = "client!oba", name = "xc", descriptor = "[Lclient!fca;")
	private Class83[] aClass83Array5;

	@OriginalMember(owner = "client!oba", name = "zb", descriptor = "I")
	private int anInt6516;

	@OriginalMember(owner = "client!oba", name = "A", descriptor = "[Lclient!ao;")
	private Class17[] aClass17Array1;

	@OriginalMember(owner = "client!oba", name = "G", descriptor = "[Lclient!mg;")
	private Class191[] aClass191Array1;

	@OriginalMember(owner = "client!oba", name = "qc", descriptor = "[S")
	private short[] aShortArray143;

	@OriginalMember(owner = "client!oba", name = "gc", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!oba", name = "Ac", descriptor = "[S")
	private short[] aShortArray145;

	@OriginalMember(owner = "client!oba", name = "Jb", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!oba", name = "V", descriptor = "[S")
	private short[] aShortArray133;

	@OriginalMember(owner = "client!oba", name = "Rb", descriptor = "S")
	private short aShort98;

	@OriginalMember(owner = "client!oba", name = "Cb", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!oba", name = "fc", descriptor = "[B")
	private byte[] aByteArray64;

	@OriginalMember(owner = "client!oba", name = "vc", descriptor = "[S")
	private short[] aShortArray144;

	@OriginalMember(owner = "client!oba", name = "Z", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!oba", name = "eb", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!oba", name = "sb", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!oba", name = "wb", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!oba", name = "ic", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!oba", name = "cb", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!oba", name = "dc", descriptor = "[F")
	private float[] aFloatArray45;

	@OriginalMember(owner = "client!oba", name = "bb", descriptor = "[S")
	private short[] aShortArray136;

	@OriginalMember(owner = "client!oba", name = "W", descriptor = "[S")
	private short[] aShortArray134;

	@OriginalMember(owner = "client!oba", name = "H", descriptor = "[I")
	private int[] anIntArray556;

	@OriginalMember(owner = "client!oba", name = "Yb", descriptor = "[I")
	private int[] anIntArray561;

	@OriginalMember(owner = "client!oba", name = "qb", descriptor = "[I")
	private int[] anIntArray557;

	@OriginalMember(owner = "client!oba", name = "Cc", descriptor = "[[I")
	private int[][] anIntArrayArray60;

	@OriginalMember(owner = "client!oba", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!oba", name = "uc", descriptor = "[[I")
	private int[][] anIntArrayArray59;

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!tu;Lclient!or;IIII)V")
	public Class2_Sub3(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) Class222 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface4 local11 = arg0.anInterface4_14;
		this.anIntArray560 = new int[arg1.anInt6708 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt6712];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt6712; local24++) {
			if ((arg1.aByteArray69 == null || arg1.aByteArray69[local24] != 2) && (arg1.aShortArray159 == null || arg1.aShortArray159[local24] == -1 || !local11.method6712(arg1.aShortArray159[local24] & 0xFFFF).aBoolean470)) {
				local22[this.anInt6502++] = local24;
				this.anIntArray560[arg1.aShortArray150[local24]]++;
				this.anIntArray560[arg1.aShortArray155[local24]]++;
				this.anIntArray560[arg1.aShortArray153[local24]]++;
			}
		}
		this.anInt6499 = this.anInt6502;
		@Pc(111) long[] local111 = new long[this.anInt6502];
		@Pc(123) boolean local123 = (this.anInt6489 & 0x100) != 0;
		@Pc(135) int local135;
		@Pc(146) int local146;
		@Pc(275) int local275;
		label496: for (@Pc(125) int local125 = 0; local125 < this.anInt6502; local125++) {
			@Pc(131) int local131 = local22[local125];
			@Pc(133) Class238 local133 = null;
			local135 = 0;
			@Pc(137) byte local137 = 0;
			@Pc(139) byte local139 = 0;
			@Pc(141) byte local141 = 0;
			if (arg1.aClass114Array1 != null) {
				for (local146 = 0; local146 < arg1.aClass114Array1.length; local146++) {
					@Pc(153) Class114 local153 = arg1.aClass114Array1[local146];
					if (local131 == local153.anInt3857) {
						@Pc(166) Class294 local166 = Static152.method2629(local153.anInt3854);
						if (local166.aBoolean646) {
							local111[local125] = Long.MAX_VALUE;
							this.anInt6499--;
							continue label496;
						}
					}
				}
			}
			@Pc(189) short local189 = -1;
			if (arg1.aShortArray159 != null) {
				local189 = arg1.aShortArray159[local131];
				if (local189 != -1) {
					local133 = local11.method6712(local189 & 0xFFFF);
					local139 = local133.aByte70;
					local141 = local133.aByte66;
				}
			}
			@Pc(231) boolean local231 = arg1.aByteArray67 != null && arg1.aByteArray67[local131] != 0 || local133 != null && !local133.aBoolean464;
			if ((local123 || local231) && arg1.aByteArray70 != null) {
				local135 += arg1.aByteArray70[local131] << 17;
			}
			if (local231) {
				local135 += 65536;
			}
			local135 += (local139 & 0xFF) << 8;
			local135 += local141 & 0xFF;
			local275 = local137 + ((local189 & 0xFFFF) << 16);
			@Pc(281) int local281 = local275 + (local125 & 0xFFFF);
			local111[local125] = ((long) local135 << 32) + ((long) local281);
		}
		Static229.method4101(local111, local22);
		this.anIntArray559 = arg1.anIntArray578;
		this.anInt6483 = arg1.anInt6692;
		this.anIntArray558 = arg1.anIntArray574;
		this.aShortArray138 = arg1.aShortArray152;
		this.anInt6510 = arg1.anInt6708;
		this.anIntArray562 = arg1.anIntArray570;
		this.aClass109Array5 = arg1.aClass109Array6;
		this.aClass83Array5 = arg1.aClass83Array6;
		@Pc(337) Class129[] local337 = new Class129[this.anInt6510];
		@Pc(357) int local357;
		@Pc(371) int local371;
		if (arg1.aClass114Array1 != null) {
			this.anInt6516 = arg1.aClass114Array1.length;
			this.aClass17Array1 = new Class17[this.anInt6516];
			this.aClass191Array1 = new Class191[this.anInt6516];
			for (local357 = 0; local357 < this.anInt6516; local357++) {
				@Pc(364) Class114 local364 = arg1.aClass114Array1[local357];
				@Pc(369) Class294 local369 = Static152.method2629(local364.anInt3854);
				local371 = -1;
				for (@Pc(373) int local373 = 0; local373 < this.anInt6502; local373++) {
					if (local22[local373] == local364.anInt3857) {
						local371 = local373;
						break;
					}
				}
				if (local371 == -1) {
					throw new RuntimeException();
				}
				local146 = Static393.anIntArray638[arg1.aShortArray154[local364.anInt3857] & 0xFFFF] & 0xFFFFFF;
				local146 |= 255 - (arg1.aByteArray67 == null ? 0 : arg1.aByteArray67[local364.anInt3857]) << 24;
				this.aClass191Array1[local357] = new Class191(local371, arg1.aShortArray150[local364.anInt3857], arg1.aShortArray155[local364.anInt3857], arg1.aShortArray153[local364.anInt3857], local369.anInt8731, local369.anInt8725, local369.anInt8723, local369.anInt8726, local369.anInt8732, local369.aBoolean646, local369.aBoolean647, local364.anInt3858);
				this.aClass17Array1[local357] = new Class17(local146);
			}
		}
		local357 = this.anInt6502 * 3;
		this.aShortArray143 = new short[this.anInt6502];
		Static89.aLongArray4 = new long[local357];
		this.aShortArray141 = new short[local357];
		this.aShortArray145 = new short[this.anInt6502];
		if (arg1.aShortArray158 != null) {
			this.aShortArray140 = new short[this.anInt6502];
		}
		this.aShortArray133 = new short[local357];
		this.aShort98 = (short) arg3;
		this.aShort97 = (short) arg4;
		this.aByteArray64 = new byte[local357];
		this.aShortArray144 = new short[local357];
		this.aShortArray135 = new short[local357];
		this.aShortArray137 = new short[this.anInt6502];
		this.aFloatArray44 = new float[local357];
		this.aShortArray139 = new short[local357];
		this.aShortArray142 = new short[this.anInt6502];
		this.aByteArray63 = new byte[this.anInt6502];
		this.aFloatArray45 = new float[local357];
		this.aShortArray136 = new short[this.anInt6502];
		this.aShortArray134 = new short[local357];
		local135 = 0;
		for (local275 = 0; local275 < arg1.anInt6708; local275++) {
			local371 = this.anIntArray560[local275];
			this.anIntArray560[local275] = local135;
			local135 += local371;
			local337[local275] = new Class129();
		}
		this.anIntArray560[arg1.anInt6708] = local135;
		@Pc(617) int[] local617 = null;
		@Pc(619) int[] local619 = null;
		@Pc(621) int[] local621 = null;
		@Pc(623) float[][] local623 = null;
		@Pc(641) int[] local641;
		@Pc(649) int local649;
		@Pc(684) int local684;
		@Pc(690) int local690;
		@Pc(704) int local704;
		@Pc(706) int local706;
		@Pc(737) int local737;
		@Pc(742) int local742;
		@Pc(904) float local904;
		@Pc(895) float local895;
		@Pc(909) float local909;
		if (arg1.aByteArray66 != null) {
			@Pc(629) int local629 = arg1.anInt6691;
			@Pc(632) int[] local632 = new int[local629];
			@Pc(635) int[] local635 = new int[local629];
			@Pc(638) int[] local638 = new int[local629];
			local641 = new int[local629];
			@Pc(644) int[] local644 = new int[local629];
			@Pc(647) int[] local647 = new int[local629];
			for (local649 = 0; local649 < local629; local649++) {
				local632[local649] = Integer.MAX_VALUE;
				local635[local649] = -2147483647;
				local638[local649] = Integer.MAX_VALUE;
				local641[local649] = -2147483647;
				local644[local649] = Integer.MAX_VALUE;
				local647[local649] = -2147483647;
			}
			local621 = new int[local629];
			for (local684 = 0; local684 < this.anInt6502; local684++) {
				local690 = local22[local684];
				if (arg1.aByteArray66[local690] != -1) {
					local704 = arg1.aByteArray66[local690] & 0xFF;
					for (local706 = 0; local706 < 3; local706++) {
						@Pc(715) short local715;
						if (local706 == 0) {
							local715 = arg1.aShortArray150[local690];
						} else if (local706 == 1) {
							local715 = arg1.aShortArray155[local690];
						} else {
							local715 = arg1.aShortArray153[local690];
						}
						local737 = arg1.anIntArray578[local715];
						local742 = arg1.anIntArray574[local715];
						@Pc(747) int local747 = arg1.anIntArray570[local715];
						if (local737 < local632[local704]) {
							local632[local704] = local737;
						}
						if (local737 > local635[local704]) {
							local635[local704] = local737;
						}
						if (local638[local704] > local742) {
							local638[local704] = local742;
						}
						if (local641[local704] < local742) {
							local641[local704] = local742;
						}
						if (local747 < local644[local704]) {
							local644[local704] = local747;
						}
						if (local747 > local647[local704]) {
							local647[local704] = local747;
						}
					}
				}
			}
			local623 = new float[local629][];
			local619 = new int[local629];
			local617 = new int[local629];
			for (local690 = 0; local690 < local629; local690++) {
				@Pc(838) byte local838 = arg1.aByteArray71[local690];
				if (local838 > 0) {
					local617[local690] = (local632[local690] + local635[local690]) / 2;
					local619[local690] = (local641[local690] + local638[local690]) / 2;
					local621[local690] = (local647[local690] + local644[local690]) / 2;
					if (local838 == 1) {
						local742 = arg1.anIntArray568[local690];
						local895 = 64.0F / (float) arg1.anIntArray569[local690];
						if (local742 == 0) {
							local909 = 1.0F;
							local904 = 1.0F;
						} else if (local742 > 0) {
							local904 = 1.0F;
							local909 = (float) local742 / 1024.0F;
						} else {
							local904 = (float) -local742 / 1024.0F;
							local909 = 1.0F;
						}
					} else if (local838 == 2) {
						local904 = 64.0F / (float) arg1.anIntArray568[local690];
						local895 = 64.0F / (float) arg1.anIntArray569[local690];
						local909 = 64.0F / (float) arg1.anIntArray573[local690];
					} else {
						local895 = (float) arg1.anIntArray569[local690] / 1024.0F;
						local904 = (float) arg1.anIntArray568[local690] / 1024.0F;
						local909 = (float) arg1.anIntArray573[local690] / 1024.0F;
					}
					local623[local690] = Static396.method6036(arg1.aShortArray157[local690], arg1.aShortArray156[local690], local909, arg1.aByteArray68[local690] & 0xFF, arg1.aShortArray151[local690], local895, local904);
				}
			}
		}
		@Pc(1016) Class147[] local1016 = new Class147[arg1.anInt6712];
		@Pc(1035) short local1035;
		@Pc(1045) int local1045;
		@Pc(1056) int local1056;
		for (@Pc(1018) int local1018 = 0; local1018 < arg1.anInt6712; local1018++) {
			@Pc(1025) short local1025 = arg1.aShortArray150[local1018];
			@Pc(1030) short local1030 = arg1.aShortArray155[local1018];
			local1035 = arg1.aShortArray153[local1018];
			local1045 = this.anIntArray559[local1030] - this.anIntArray559[local1025];
			local1056 = this.anIntArray558[local1030] - this.anIntArray558[local1025];
			local649 = this.anIntArray562[local1030] - this.anIntArray562[local1025];
			local684 = this.anIntArray559[local1035] - this.anIntArray559[local1025];
			local690 = this.anIntArray558[local1035] - this.anIntArray558[local1025];
			local704 = this.anIntArray562[local1035] - this.anIntArray562[local1025];
			local706 = local704 * local1056 - local690 * local649;
			@Pc(1117) int local1117 = local649 * local684 - local1045 * local704;
			local737 = local1045 * local690 - local684 * local1056;
			while (local706 > 8192 || local1117 > 8192 || local737 > 8192 || local706 < -8192 || local1117 < -8192 || local737 < -8192) {
				local1117 >>= 0x1;
				local737 >>= 0x1;
				local706 >>= 0x1;
			}
			local742 = (int) Math.sqrt((double) (local737 * local737 + local706 * local706 + local1117 * local1117));
			if (local742 <= 0) {
				local742 = 1;
			}
			local1117 = local1117 * 256 / local742;
			local737 = local737 * 256 / local742;
			local706 = local706 * 256 / local742;
			@Pc(1216) byte local1216 = arg1.aByteArray69 == null ? 0 : arg1.aByteArray69[local1018];
			if (local1216 == 0) {
				@Pc(1225) Class129 local1225 = local337[local1025];
				local1225.anInt4391 += local1117;
				local1225.anInt4398++;
				local1225.anInt4395 += local737;
				local1225.anInt4392 += local706;
				@Pc(1253) Class129 local1253 = local337[local1030];
				local1253.anInt4398++;
				local1253.anInt4395 += local737;
				local1253.anInt4391 += local1117;
				local1253.anInt4392 += local706;
				@Pc(1281) Class129 local1281 = local337[local1035];
				local1281.anInt4391 += local1117;
				local1281.anInt4392 += local706;
				local1281.anInt4398++;
				local1281.anInt4395 += local737;
			} else if (local1216 == 1) {
				@Pc(1320) Class147 local1320 = local1016[local1018] = new Class147();
				local1320.anInt4803 = local706;
				local1320.anInt4799 = local737;
				local1320.anInt4800 = local1117;
			}
		}
		@Pc(1342) int local1342;
		for (@Pc(1336) int local1336 = 0; local1336 < this.anInt6502; local1336++) {
			local1342 = local22[local1336];
			@Pc(1349) int local1349 = arg1.aShortArray154[local1342] & 0xFFFF;
			@Pc(1357) short local1357;
			if (arg1.aShortArray159 == null) {
				local1357 = -1;
			} else {
				local1357 = arg1.aShortArray159[local1342];
			}
			if (arg1.aByteArray66 == null) {
				local1056 = -1;
			} else {
				local1056 = arg1.aByteArray66[local1342];
			}
			if (arg1.aByteArray67 == null) {
				local649 = 0;
			} else {
				local649 = arg1.aByteArray67[local1342] & 0xFF;
			}
			@Pc(1389) float local1389 = 0.0F;
			@Pc(1391) float local1391 = 0.0F;
			@Pc(1393) float local1393 = 0.0F;
			local904 = 0.0F;
			local895 = 0.0F;
			local909 = 0.0F;
			@Pc(1401) byte local1401 = 0;
			@Pc(1403) byte local1403 = 0;
			@Pc(1405) int local1405 = 0;
			@Pc(1439) byte local1439;
			@Pc(1456) short local1456;
			@Pc(1461) short local1461;
			@Pc(1466) short local1466;
			if (local1357 != -1) {
				if (local1056 == -1) {
					local1403 = 2;
					local904 = 1.0F;
					local1391 = 1.0F;
					local1401 = 1;
					local1389 = 0.0F;
					local1393 = 1.0F;
					local895 = 0.0F;
					local909 = 0.0F;
				} else {
					local1056 &= 0xFF;
					local1439 = arg1.aByteArray71[local1056];
					@Pc(1446) short local1446;
					@Pc(1451) short local1451;
					@Pc(1489) float local1489;
					@Pc(1497) float local1497;
					@Pc(1505) float local1505;
					@Pc(1591) float local1591;
					@Pc(1600) float local1600;
					@Pc(1608) float local1608;
					@Pc(1617) float local1617;
					@Pc(1626) float local1626;
					@Pc(1635) float local1635;
					if (local1439 == 0) {
						local1446 = arg1.aShortArray150[local1342];
						local1451 = arg1.aShortArray155[local1342];
						local1456 = arg1.aShortArray153[local1342];
						local1461 = arg1.aShortArray157[local1056];
						local1466 = arg1.aShortArray156[local1056];
						@Pc(1471) short local1471 = arg1.aShortArray151[local1056];
						@Pc(1477) float local1477 = (float) arg1.anIntArray578[local1461];
						@Pc(1483) float local1483 = (float) arg1.anIntArray574[local1461];
						local1489 = arg1.anIntArray570[local1461];
						local1497 = (float) arg1.anIntArray578[local1466] - local1477;
						local1505 = (float) arg1.anIntArray574[local1466] - local1483;
						@Pc(1514) float local1514 = (float) arg1.anIntArray570[local1466] - local1489;
						@Pc(1523) float local1523 = (float) arg1.anIntArray578[local1471] - local1477;
						@Pc(1532) float local1532 = (float) arg1.anIntArray574[local1471] - local1483;
						@Pc(1540) float local1540 = (float) arg1.anIntArray570[local1471] - local1489;
						@Pc(1548) float local1548 = (float) arg1.anIntArray578[local1446] - local1477;
						@Pc(1557) float local1557 = (float) arg1.anIntArray574[local1446] - local1483;
						@Pc(1566) float local1566 = (float) arg1.anIntArray570[local1446] - local1489;
						@Pc(1575) float local1575 = (float) arg1.anIntArray578[local1451] - local1477;
						@Pc(1583) float local1583 = (float) arg1.anIntArray574[local1451] - local1483;
						local1591 = (float) arg1.anIntArray570[local1451] - local1489;
						local1600 = (float) arg1.anIntArray578[local1456] - local1477;
						local1608 = (float) arg1.anIntArray574[local1456] - local1483;
						local1617 = (float) arg1.anIntArray570[local1456] - local1489;
						local1626 = local1505 * local1540 - local1514 * local1532;
						local1635 = local1514 * local1523 - local1540 * local1497;
						@Pc(1644) float local1644 = local1532 * local1497 - local1523 * local1505;
						@Pc(1652) float local1652 = local1532 * local1644 - local1635 * local1540;
						@Pc(1661) float local1661 = local1626 * local1540 - local1644 * local1523;
						@Pc(1669) float local1669 = local1523 * local1635 - local1532 * local1626;
						@Pc(1683) float local1683 = 1.0F / (local1497 * local1652 + local1505 * local1661 + local1669 * local1514);
						local1393 = local1683 * (local1575 * local1652 + local1583 * local1661 + local1591 * local1669);
						local1389 = (local1669 * local1566 + local1548 * local1652 + local1557 * local1661) * local1683;
						local895 = (local1608 * local1661 + local1652 * local1600 + local1617 * local1669) * local1683;
						@Pc(1733) float local1733 = local1505 * local1644 - local1514 * local1635;
						@Pc(1742) float local1742 = local1626 * local1514 - local1497 * local1644;
						@Pc(1751) float local1751 = local1497 * local1635 - local1505 * local1626;
						@Pc(1765) float local1765 = 1.0F / (local1742 * local1532 + local1733 * local1523 + local1540 * local1751);
						local904 = local1765 * (local1751 * local1591 + local1583 * local1742 + local1575 * local1733);
						local1391 = (local1557 * local1742 + local1733 * local1548 + local1751 * local1566) * local1765;
						local909 = local1765 * (local1751 * local1617 + local1742 * local1608 + local1733 * local1600);
					} else {
						local1446 = arg1.aShortArray150[local1342];
						local1451 = arg1.aShortArray155[local1342];
						local1456 = arg1.aShortArray153[local1342];
						@Pc(1828) int local1828 = local617[local1056];
						@Pc(1832) int local1832 = local619[local1056];
						@Pc(1836) int local1836 = local621[local1056];
						@Pc(1840) float[] local1840 = local623[local1056];
						@Pc(1845) byte local1845 = arg1.aByteArray72[local1056];
						local1489 = (float) arg1.anIntArray571[local1056] / 256.0F;
						if (local1439 == 1) {
							local1497 = (float) arg1.anIntArray573[local1056] / 1024.0F;
							Static276.method4786(arg1.anIntArray578[local1446], local1840, local1828, arg1.anIntArray574[local1446], local1832, local1845, local1489, local1836, local1497, arg1.anIntArray570[local1446]);
							local1391 = Static2.aFloat5;
							local1389 = Static418.aFloat234;
							Static276.method4786(arg1.anIntArray578[local1451], local1840, local1828, arg1.anIntArray574[local1451], local1832, local1845, local1489, local1836, local1497, arg1.anIntArray570[local1451]);
							local904 = Static2.aFloat5;
							local1393 = Static418.aFloat234;
							Static276.method4786(arg1.anIntArray578[local1456], local1840, local1828, arg1.anIntArray574[local1456], local1832, local1845, local1489, local1836, local1497, arg1.anIntArray570[local1456]);
							local909 = Static2.aFloat5;
							local895 = Static418.aFloat234;
							local1505 = local1497 / 2.0F;
							if ((local1845 & 0x1) == 0) {
								if (local1505 < local895 - local1389) {
									local895 -= local1497;
									local1403 = 1;
								} else if (local1505 < local1389 - local895) {
									local895 += local1497;
									local1403 = 2;
								}
								if (local1505 < local1393 - local1389) {
									local1401 = 1;
									local1393 -= local1497;
								} else if (local1389 - local1393 > local1505) {
									local1401 = 2;
									local1393 += local1497;
								}
							} else {
								if (local904 - local1391 > local1505) {
									local904 -= local1497;
									local1401 = 1;
								} else if (local1505 < local1391 - local904) {
									local904 += local1497;
									local1401 = 2;
								}
								if (local1505 < local909 - local1391) {
									local909 -= local1497;
									local1403 = 1;
								} else if (local1391 - local909 > local1505) {
									local1403 = 2;
									local909 += local1497;
								}
							}
						} else if (local1439 == 2) {
							local1497 = (float) arg1.anIntArray576[local1056] / 256.0F;
							local1505 = (float) arg1.anIntArray572[local1056] / 256.0F;
							@Pc(1887) int local1887 = arg1.anIntArray578[local1451] - arg1.anIntArray578[local1446];
							@Pc(1898) int local1898 = arg1.anIntArray574[local1451] - arg1.anIntArray574[local1446];
							@Pc(1909) int local1909 = arg1.anIntArray570[local1451] - arg1.anIntArray570[local1446];
							@Pc(1919) int local1919 = arg1.anIntArray578[local1456] - arg1.anIntArray578[local1446];
							@Pc(1930) int local1930 = arg1.anIntArray574[local1456] - arg1.anIntArray574[local1446];
							@Pc(1941) int local1941 = arg1.anIntArray570[local1456] - arg1.anIntArray570[local1446];
							@Pc(1950) int local1950 = local1898 * local1941 - local1930 * local1909;
							@Pc(1959) int local1959 = local1919 * local1909 - local1887 * local1941;
							@Pc(1968) int local1968 = local1887 * local1930 - local1898 * local1919;
							local1591 = 64.0F / (float) arg1.anIntArray568[local1056];
							local1600 = 64.0F / (float) arg1.anIntArray569[local1056];
							local1608 = 64.0F / (float) arg1.anIntArray573[local1056];
							local1617 = (local1840[1] * (float) local1959 + local1840[0] * (float) local1950 + local1840[2] * (float) local1968) / local1591;
							local1626 = ((float) local1950 * local1840[3] + local1840[4] * (float) local1959 + local1840[5] * (float) local1968) / local1600;
							local1635 = ((float) local1950 * local1840[6] + (float) local1959 * local1840[7] + local1840[8] * (float) local1968) / local1608;
							local1405 = Static523.method7516(local1626, local1617, local1635);
							Static241.method7406(local1497, local1832, local1845, local1840, local1489, local1405, arg1.anIntArray570[local1446], local1505, arg1.anIntArray578[local1446], local1836, arg1.anIntArray574[local1446], local1828);
							local1389 = Static426.aFloat235;
							local1391 = Static263.aFloat167;
							Static241.method7406(local1497, local1832, local1845, local1840, local1489, local1405, arg1.anIntArray570[local1451], local1505, arg1.anIntArray578[local1451], local1836, arg1.anIntArray574[local1451], local1828);
							local1393 = Static426.aFloat235;
							local904 = Static263.aFloat167;
							Static241.method7406(local1497, local1832, local1845, local1840, local1489, local1405, arg1.anIntArray570[local1456], local1505, arg1.anIntArray578[local1456], local1836, arg1.anIntArray574[local1456], local1828);
							local909 = Static263.aFloat167;
							local895 = Static426.aFloat235;
						} else if (local1439 == 3) {
							Static393.method5993(arg1.anIntArray574[local1446], local1832, arg1.anIntArray578[local1446], arg1.anIntArray570[local1446], local1840, local1845, local1828, local1489, local1836);
							local1391 = Static307.aFloat155;
							local1389 = Static497.aFloat259;
							Static393.method5993(arg1.anIntArray574[local1451], local1832, arg1.anIntArray578[local1451], arg1.anIntArray570[local1451], local1840, local1845, local1828, local1489, local1836);
							local904 = Static307.aFloat155;
							local1393 = Static497.aFloat259;
							Static393.method5993(arg1.anIntArray574[local1456], local1832, arg1.anIntArray578[local1456], arg1.anIntArray570[local1456], local1840, local1845, local1828, local1489, local1836);
							local895 = Static497.aFloat259;
							local909 = Static307.aFloat155;
							if ((local1845 & 0x1) == 0) {
								if (local895 - local1389 > 0.5F) {
									local895--;
									local1403 = 1;
								} else if (local1389 - local895 > 0.5F) {
									local1403 = 2;
									local895++;
								}
								if (local1393 - local1389 > 0.5F) {
									local1401 = 1;
									local1393--;
								} else if (local1389 - local1393 > 0.5F) {
									local1393++;
									local1401 = 2;
								}
							} else {
								if (local904 - local1391 > 0.5F) {
									local1401 = 1;
									local904--;
								} else if (local1391 - local904 > 0.5F) {
									local1401 = 2;
									local904++;
								}
								if (local909 - local1391 > 0.5F) {
									local909--;
									local1403 = 1;
								} else if (local1391 - local909 > 0.5F) {
									local909++;
									local1403 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray69 == null) {
				local1439 = 0;
			} else {
				local1439 = arg1.aByteArray69[local1342];
			}
			if (local1439 == 0) {
				@Pc(2713) long local2713 = (long) (local1056 << 2) + ((long) local649 + (long) (local1405 << 24) + (long) (local1349 << 8) << 32);
				local1456 = arg1.aShortArray150[local1342];
				local1461 = arg1.aShortArray155[local1342];
				local1466 = arg1.aShortArray153[local1342];
				@Pc(2732) Class129 local2732 = local337[local1456];
				this.aShortArray143[local1336] = this.method5462(arg1, local2713, local2732.anInt4391, local1456, local1391, local2732.anInt4395, local2732.anInt4392, local2732.anInt4398, local1336, local1389);
				@Pc(2757) Class129 local2757 = local337[local1461];
				this.aShortArray137[local1336] = this.method5462(arg1, (long) local1401 + local2713, local2757.anInt4391, local1461, local904, local2757.anInt4395, local2757.anInt4392, local2757.anInt4398, local1336, local1393);
				@Pc(2785) Class129 local2785 = local337[local1466];
				this.aShortArray145[local1336] = this.method5462(arg1, local2713 + (long) local1403, local2785.anInt4391, local1466, local909, local2785.anInt4395, local2785.anInt4392, local2785.anInt4398, local1336, local895);
			} else if (local1439 == 1) {
				@Pc(2570) Class147 local2570 = local1016[local1342];
				@Pc(2614) long local2614 = ((long) (local1349 << 8) + (long) (local1405 << 24) + (long) local649 << 32) + (long) ((local2570.anInt4799 + 256 << 22) + (local1056 << 2) + (local2570.anInt4803 > 0 ? 1024 : 2048) + (local2570.anInt4800 - -256 << 12));
				this.aShortArray143[local1336] = this.method5462(arg1, local2614, local2570.anInt4800, arg1.aShortArray150[local1342], local1391, local2570.anInt4799, local2570.anInt4803, 0, local1336, local1389);
				this.aShortArray137[local1336] = this.method5462(arg1, (long) local1401 + local2614, local2570.anInt4800, arg1.aShortArray155[local1342], local904, local2570.anInt4799, local2570.anInt4803, 0, local1336, local1393);
				this.aShortArray145[local1336] = this.method5462(arg1, local2614 + (long) local1403, local2570.anInt4800, arg1.aShortArray153[local1342], local909, local2570.anInt4799, local2570.anInt4803, 0, local1336, local895);
			}
			if (arg1.aShortArray159 == null) {
				this.aShortArray136[local1336] = -1;
			} else {
				this.aShortArray136[local1336] = arg1.aShortArray159[local1342];
			}
			if (arg1.aByteArray67 != null) {
				this.aByteArray63[local1336] = arg1.aByteArray67[local1342];
			}
			if (arg1.aShortArray158 != null) {
				this.aShortArray140[local1336] = arg1.aShortArray158[local1342];
			}
			this.aShortArray142[local1336] = arg1.aShortArray154[local1342];
		}
		if (this.anInt6499 > 0) {
			local1342 = 1;
			local1035 = this.aShortArray136[0];
			for (local1045 = 0; local1045 < this.anInt6499; local1045++) {
				@Pc(2884) short local2884 = this.aShortArray136[local1045];
				if (local1035 != local2884) {
					local1035 = local2884;
					local1342++;
				}
			}
			this.anIntArray556 = new int[local1342 + 1];
			this.anIntArray561 = new int[local1342];
			this.anIntArray557 = new int[local1342];
			this.anIntArray556[0] = 0;
			local1056 = this.anInt6495;
			local1342 = 0;
			@Pc(2929) short local2929 = 0;
			local1035 = this.aShortArray136[0];
			for (local684 = 0; local684 < this.anInt6499; local684++) {
				@Pc(2943) short local2943 = this.aShortArray136[local684];
				if (local2943 != local1035) {
					this.anIntArray557[local1342] = local1056;
					this.anIntArray561[local1342] = local2929 + 1 - local1056;
					local1342++;
					this.anIntArray556[local1342] = local684;
					local1056 = this.anInt6495;
					local1035 = local2943;
					local2929 = 0;
				}
				@Pc(2979) short local2979 = this.aShortArray143[local684];
				if (local2979 > local2929) {
					local2929 = local2979;
				}
				if (local2979 < local1056) {
					local1056 = local2979;
				}
				local2979 = this.aShortArray137[local684];
				if (local2979 > local2929) {
					local2929 = local2979;
				}
				if (local1056 > local2979) {
					local1056 = local2979;
				}
				local2979 = this.aShortArray145[local684];
				if (local2979 > local2929) {
					local2929 = local2979;
				}
				if (local2979 < local1056) {
					local1056 = local2979;
				}
			}
			this.anIntArray557[local1342] = local1056;
			this.anIntArray561[local1342] = local2929 + 1 - local1056;
			local1342++;
			this.anIntArray556[local1342] = this.anInt6499;
		}
		Static89.aLongArray4 = null;
		this.aShortArray135 = Static114.method6667(this.aShortArray135, this.anInt6495);
		this.aShortArray144 = Static114.method6667(this.aShortArray144, this.anInt6495);
		this.aShortArray134 = Static114.method6667(this.aShortArray134, this.anInt6495);
		this.aShortArray133 = Static114.method6667(this.aShortArray133, this.anInt6495);
		this.aShortArray139 = Static114.method6667(this.aShortArray139, this.anInt6495);
		this.aByteArray64 = Static305.method5020(this.aByteArray64, this.anInt6495);
		this.aFloatArray45 = Static499.method3122(this.aFloatArray45, this.anInt6495);
		this.aFloatArray44 = Static499.method3122(this.aFloatArray44, this.anInt6495);
		if (arg1.anIntArray575 != null && Static411.method6198(this.anInt6477, arg2)) {
			this.anIntArrayArray60 = arg1.method5607(false);
		}
		if (arg1.aClass114Array1 != null && Static537.method7689(this.anInt6477, arg2)) {
			this.anIntArrayArray58 = arg1.method5598();
		}
		if (arg1.anIntArray577 != null && Static161.method3129(arg2, this.anInt6477)) {
			local1342 = 0;
			local641 = new int[256];
			for (local1045 = 0; local1045 < this.anInt6502; local1045++) {
				local1056 = arg1.anIntArray577[local22[local1045]];
				if (local1056 >= 0) {
					@Pc(3180) int local3180 = local641[local1056]++;
					if (local1056 > local1342) {
						local1342 = local1056;
					}
				}
			}
			this.anIntArrayArray59 = new int[local1342 + 1][];
			for (local1056 = 0; local1056 <= local1342; local1056++) {
				this.anIntArrayArray59[local1056] = new int[local641[local1056]];
				local641[local1056] = 0;
			}
			for (local649 = 0; local649 < this.anInt6502; local649++) {
				local684 = arg1.anIntArray577[local22[local649]];
				if (local684 >= 0) {
					this.anIntArrayArray59[local684][local641[local684]++] = local649;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Lclient!tu;IIZZ)V")
	public Class2_Sub3(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6483 = 0;
		this.anInt6502 = 0;
		this.anInt6495 = 0;
		this.aBoolean411 = true;
		this.aBoolean412 = false;
		this.anInt6510 = 0;
		this.anInt6499 = 0;
		this.aBoolean413 = false;
		this.aClass5_Sub3_14 = arg0;
		this.aBoolean413 = arg4;
		this.anInt6477 = arg2;
		this.anInt6489 = arg1;
		if (arg3 || Static386.method5950(this.anInt6489, this.anInt6477)) {
			this.aClass235_4 = new Class235(Static490.method7167(this.anInt6489, this.anInt6477));
		}
		if (arg3 || Static164.method3199(this.anInt6477, this.anInt6489)) {
			this.aClass235_2 = new Class235(Static104.method2057(this.anInt6489, this.anInt6477));
		}
		if (arg3 || Static188.method3553(this.anInt6489, this.anInt6477)) {
			this.aClass235_3 = new Class235(Static424.method6501(this.anInt6489, this.anInt6477));
		}
		if (arg3 || Static464.method6916(this.anInt6489, this.anInt6477)) {
			this.aClass235_1 = new Class235(Static349.method5539(this.anInt6477, this.anInt6489));
		}
		if (arg3 || Static384.method5928(this.anInt6489, this.anInt6477)) {
			this.aClass236_1 = new Class236(Static39.method946(this.anInt6489, this.anInt6477));
		}
	}

	@OriginalMember(owner = "client!oba", name = "ia", descriptor = "(I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0) {
		if (this.aClass235_4 != null) {
			this.aClass235_4.aBoolean457 = Static490.method7167(arg0, this.anInt6477);
		}
		if (this.aClass235_2 != null) {
			this.aClass235_2.aBoolean457 = Static104.method2057(arg0, this.anInt6477);
		}
		if (this.aClass235_3 != null) {
			this.aClass235_3.aBoolean457 = Static424.method6501(arg0, this.anInt6477);
		}
		if (this.aClass235_1 != null) {
			this.aClass235_1.aBoolean457 = Static349.method5539(this.anInt6477, arg0);
		}
		this.anInt6489 = arg0;
		if (this.aClass292_1 != null && (this.anInt6489 & 0x10000) == 0) {
			this.aByteArray64 = this.aClass292_1.aByteArray102;
			this.aShortArray133 = this.aClass292_1.aShortArray191;
			this.aShortArray134 = this.aClass292_1.aShortArray190;
			this.aShortArray139 = this.aClass292_1.aShortArray189;
			this.aClass292_1 = null;
		}
		this.aBoolean411 = true;
		this.method5469();
	}

	@OriginalMember(owner = "client!oba", name = "UA", descriptor = "(SS)V")
	@Override
	public void UA(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6502; local7++) {
			if (this.aShortArray142[local7] == arg0) {
				this.aShortArray142[local7] = arg1;
			}
		}
		if (this.aClass191Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt6516; local38++) {
				@Pc(45) Class191 local45 = this.aClass191Array1[local38];
				@Pc(50) Class17 local50 = this.aClass17Array1[local38];
				local50.anInt645 = local50.anInt645 & 0xFF000000 | Static393.anIntArray638[this.aShortArray142[local45.anInt5951] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5472();
	}

	@OriginalMember(owner = "client!oba", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
		this.aShort97 = (short) arg0;
		this.method5474();
		this.method5464();
	}

	@OriginalMember(owner = "client!oba", name = "u", descriptor = "()I")
	@Override
	public int u() {
		return this.aShort98;
	}

	@OriginalMember(owner = "client!oba", name = "V", descriptor = "(I)V")
	@Override
	public void V(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5.anIntArray761[arg0];
		@Pc(13) int local13 = Class5.anIntArray760[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6510; local15++) {
			local33 = this.anIntArray559[local15] * local13 + this.anIntArray562[local15] * local9 >> 14;
			this.anIntArray562[local15] = local13 * this.anIntArray562[local15] - local9 * this.anIntArray559[local15] >> 14;
			this.anIntArray559[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6495; local33++) {
			@Pc(82) int local82 = local9 * this.aShortArray139[local33] + local13 * this.aShortArray134[local33] >> 14;
			this.aShortArray139[local33] = (short) (local13 * this.aShortArray139[local33] - local9 * this.aShortArray134[local33] >> 14);
			this.aShortArray134[local33] = (short) local82;
		}
		this.method5474();
		this.method5464();
		this.aBoolean412 = false;
	}

	@OriginalMember(owner = "client!oba", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean412) {
			this.method5477();
		}
		return this.anInt6539;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(Z)V")
	public void method5461() {
		if (this.aClass235_4 != null) {
			this.aClass235_4.method5917();
		}
		if (this.aClass235_2 != null) {
			this.aClass235_2.method5917();
		}
		if (this.aClass235_3 != null) {
			this.aClass235_3.method5917();
		}
		if (this.aClass235_1 != null) {
			this.aClass235_1.method5917();
		}
		if (this.aClass236_1 != null) {
			this.aClass236_1.method5922();
		}
	}

	@OriginalMember(owner = "client!oba", name = "ka", descriptor = "(SS)V")
	@Override
	public void ka(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass5_Sub3_14.anInterface4_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6502; local11++) {
			if (arg0 == this.aShortArray136[local11]) {
				this.aShortArray136[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class238 local47 = local9.method6712(arg0 & 0xFFFF);
			local37 = local47.aByte71;
			local35 = local47.aByte67;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class238 local67 = local9.method6712(arg1 & 0xFFFF);
			local57 = local67.aByte71;
			local55 = local67.aByte67;
		}
		if (!(local37 != local57 | local55 != local35)) {
			return;
		}
		if (this.aClass191Array1 != null) {
			for (@Pc(100) int local100 = 0; local100 < this.anInt6516; local100++) {
				@Pc(107) Class191 local107 = this.aClass191Array1[local100];
				@Pc(112) Class17 local112 = this.aClass17Array1[local100];
				local112.anInt645 = local112.anInt645 & 0xFF000000 | Static393.anIntArray638[this.aShortArray142[local107.anInt5951] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5472();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(BIZ)Lclient!ba;")
	@Override
	public Class2 method5775(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class2_Sub3 local18;
		@Pc(14) Class2_Sub3 local14;
		if (arg0 == 1) {
			local14 = this.aClass5_Sub3_14.aClass2_Sub3_27;
			local18 = this.aClass5_Sub3_14.aClass2_Sub3_25;
		} else if (arg0 == 2) {
			local18 = this.aClass5_Sub3_14.aClass2_Sub3_30;
			local14 = this.aClass5_Sub3_14.aClass2_Sub3_23;
		} else if (arg0 == 3) {
			local18 = this.aClass5_Sub3_14.aClass2_Sub3_24;
			local14 = this.aClass5_Sub3_14.aClass2_Sub3_29;
		} else if (arg0 == 4) {
			local14 = this.aClass5_Sub3_14.aClass2_Sub3_22;
			local18 = this.aClass5_Sub3_14.aClass2_Sub3_21;
		} else if (arg0 == 5) {
			local14 = this.aClass5_Sub3_14.aClass2_Sub3_26;
			local18 = this.aClass5_Sub3_14.aClass2_Sub3_28;
		} else {
			local18 = local14 = new Class2_Sub3(this.aClass5_Sub3_14, 0, 0, true, false);
		}
		return this.method5463(local14, arg2, local18, arg1, arg0 != 0);
	}

	@OriginalMember(owner = "client!oba", name = "K", descriptor = "()I")
	@Override
	public int K() {
		if (!this.aBoolean412) {
			this.method5477();
		}
		return this.anInt6511;
	}

	@OriginalMember(owner = "client!oba", name = "v", descriptor = "(I)V")
	@Override
	public void v(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5.anIntArray761[arg0];
		@Pc(13) int local13 = Class5.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6510; local15++) {
			@Pc(33) int local33 = this.anIntArray559[local15] * local13 + local9 * this.anIntArray558[local15] >> 14;
			this.anIntArray558[local15] = local13 * this.anIntArray558[local15] - local9 * this.anIntArray559[local15] >> 14;
			this.anIntArray559[local15] = local33;
		}
		this.method5474();
		this.aBoolean412 = false;
	}

	@OriginalMember(owner = "client!oba", name = "ua", descriptor = "(IIII)V")
	@Override
	protected void ua(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static135.anInt2758 = 0;
			Static142.anInt2901 = 0;
			Static328.anInt6268 = 0;
			for (local17 = 0; local17 < this.anInt6510; local17++) {
				Static135.anInt2758 += this.anIntArray559[local17];
				Static328.anInt6268 += this.anIntArray558[local17];
				local9++;
				Static142.anInt2901 += this.anIntArray562[local17];
			}
			if (local9 <= 0) {
				Static328.anInt6268 = arg2;
				Static142.anInt2901 = arg3;
				Static135.anInt2758 = arg1;
			} else {
				Static328.anInt6268 = arg2 + Static328.anInt6268 / local9;
				Static135.anInt2758 = Static135.anInt2758 / local9 + arg1;
				Static142.anInt2901 = arg3 + Static142.anInt2901 / local9;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt6510; local9++) {
				this.anIntArray559[local9] += arg1;
				this.anIntArray558[local9] += arg2;
				this.anIntArray562[local9] += arg3;
			}
		} else {
			@Pc(164) int local164;
			@Pc(182) int local182;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt6510; local9++) {
					this.anIntArray559[local9] -= Static135.anInt2758;
					this.anIntArray558[local9] -= Static328.anInt6268;
					this.anIntArray562[local9] -= Static142.anInt2901;
					if (arg3 != 0) {
						local17 = Class5.anIntArray761[arg3];
						local164 = Class5.anIntArray760[arg3];
						local182 = local17 * this.anIntArray558[local9] + this.anIntArray559[local9] * local164 + 16383 >> 14;
						this.anIntArray558[local9] = local164 * this.anIntArray558[local9] + 16383 - this.anIntArray559[local9] * local17 >> 14;
						this.anIntArray559[local9] = local182;
					}
					if (arg1 != 0) {
						local17 = Class5.anIntArray761[arg1];
						local164 = Class5.anIntArray760[arg1];
						local182 = local164 * this.anIntArray558[local9] + 16383 - local17 * this.anIntArray562[local9] >> 14;
						this.anIntArray562[local9] = local17 * this.anIntArray558[local9] + local164 * this.anIntArray562[local9] + 16383 >> 14;
						this.anIntArray558[local9] = local182;
					}
					if (arg2 != 0) {
						local17 = Class5.anIntArray761[arg2];
						local164 = Class5.anIntArray760[arg2];
						local182 = this.anIntArray559[local9] * local164 + local17 * this.anIntArray562[local9] + 16383 >> 14;
						this.anIntArray562[local9] = this.anIntArray562[local9] * local164 + 16383 - local17 * this.anIntArray559[local9] >> 14;
						this.anIntArray559[local9] = local182;
					}
					this.anIntArray559[local9] += Static135.anInt2758;
					this.anIntArray558[local9] += Static328.anInt6268;
					this.anIntArray562[local9] += Static142.anInt2901;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt6510; local9++) {
					this.anIntArray559[local9] -= Static135.anInt2758;
					this.anIntArray558[local9] -= Static328.anInt6268;
					this.anIntArray562[local9] -= Static142.anInt2901;
					this.anIntArray559[local9] = this.anIntArray559[local9] * arg1 / 128;
					this.anIntArray558[local9] = this.anIntArray558[local9] * arg2 / 128;
					this.anIntArray562[local9] = arg3 * this.anIntArray562[local9] / 128;
					this.anIntArray559[local9] += Static135.anInt2758;
					this.anIntArray558[local9] += Static328.anInt6268;
					this.anIntArray562[local9] += Static142.anInt2901;
				}
			} else {
				@Pc(511) Class191 local511;
				@Pc(516) Class17 local516;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt6502; local9++) {
						local17 = arg1 * 8 + (this.aByteArray63[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray63[local9] = (byte) local17;
					}
					if (this.aClass191Array1 != null) {
						for (local17 = 0; local17 < this.anInt6516; local17++) {
							local511 = this.aClass191Array1[local17];
							local516 = this.aClass17Array1[local17];
							local516.anInt645 = local516.anInt645 & 0xFFFFFF | 255 - (this.aByteArray63[local511.anInt5951] & 0xFF) << 24;
						}
					}
					this.method5472();
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt6502; local9++) {
						local17 = this.aShortArray142[local9] & 0xFFFF;
						local164 = local17 >> 10 & 0x3F;
						local182 = local17 >> 7 & 0x7;
						@Pc(579) int local579 = arg1 + local164 & 0x3F;
						local182 += arg2 / 4;
						@Pc(589) int local589 = local17 & 0x7F;
						if (local182 < 0) {
							local182 = 0;
						} else if (local182 > 7) {
							local182 = 7;
						}
						local589 += arg3;
						if (local589 < 0) {
							local589 = 0;
						} else if (local589 > 127) {
							local589 = 127;
						}
						this.aShortArray142[local9] = (short) (local589 | local182 << 7 | local579 << 10);
					}
					if (this.aClass191Array1 != null) {
						for (local17 = 0; local17 < this.anInt6516; local17++) {
							local511 = this.aClass191Array1[local17];
							local516 = this.aClass17Array1[local17];
							local516.anInt645 = local516.anInt645 & 0xFF000000 | Static393.anIntArray638[this.aShortArray142[local511.anInt5951] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5472();
				} else {
					@Pc(696) Class17 local696;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt6516; local9++) {
							local696 = this.aClass17Array1[local9];
							local696.anInt635 += arg2;
							local696.anInt644 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt6516; local9++) {
							local696 = this.aClass17Array1[local9];
							local696.anInt636 = local696.anInt636 * arg2 >> 7;
							local696.anInt639 = local696.anInt639 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt6516; local9++) {
							local696 = this.aClass17Array1[local9];
							local696.anInt641 = local696.anInt641 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!ba;IIIZ)V")
	@Override
	public void method5781(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class2_Sub3 local8 = (Class2_Sub3) arg0;
		if (this.anInt6502 == 0 || local8.anInt6502 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt6510;
		@Pc(24) int[] local24 = local8.anIntArray559;
		@Pc(27) int[] local27 = local8.anIntArray558;
		@Pc(30) int[] local30 = local8.anIntArray562;
		@Pc(33) short[] local33 = local8.aShortArray134;
		@Pc(36) short[] local36 = local8.aShortArray133;
		@Pc(39) short[] local39 = local8.aShortArray139;
		@Pc(42) byte[] local42 = local8.aByteArray64;
		@Pc(53) short[] local53;
		@Pc(49) short[] local49;
		@Pc(61) short[] local61;
		@Pc(57) byte[] local57;
		if (this.aClass292_1 == null) {
			local49 = null;
			local53 = null;
			local57 = null;
			local61 = null;
		} else {
			local49 = this.aClass292_1.aShortArray191;
			local53 = this.aClass292_1.aShortArray190;
			local57 = this.aClass292_1.aByteArray102;
			local61 = this.aClass292_1.aShortArray189;
		}
		@Pc(78) short[] local78;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		@Pc(82) byte[] local82;
		if (local8.aClass292_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local76 = local8.aClass292_1.aShortArray191;
			local80 = local8.aClass292_1.aShortArray189;
			local78 = local8.aClass292_1.aShortArray190;
			local82 = local8.aClass292_1.aByteArray102;
		}
		@Pc(103) int[] local103 = local8.anIntArray560;
		@Pc(106) short[] local106 = local8.aShortArray141;
		if (!local8.aBoolean412) {
			local8.method5477();
		}
		@Pc(115) int local115 = local8.anInt6543;
		@Pc(118) int local118 = local8.anInt6539;
		@Pc(121) int local121 = local8.anInt6504;
		@Pc(124) int local124 = local8.anInt6476;
		@Pc(127) int local127 = local8.anInt6526;
		@Pc(130) int local130 = local8.anInt6511;
		for (@Pc(132) int local132 = 0; local132 < this.anInt6510; local132++) {
			@Pc(142) int local142 = this.anIntArray558[local132] - arg2;
			if (local142 >= local115 && local118 >= local142) {
				@Pc(158) int local158 = this.anIntArray559[local132] - arg1;
				if (local121 <= local158 && local158 <= local124) {
					@Pc(178) int local178 = this.anIntArray562[local132] - arg3;
					if (local127 <= local178 && local130 >= local178) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray560[local132];
						@Pc(204) int local204 = this.anIntArray560[local132 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray141[local206] - 1;
							if (local192 == -1 || this.aByteArray64[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(238) int local238 = 0; local238 < local21; local238++) {
								if (local158 == local24[local238] && local178 == local30[local238] && local142 == local27[local238]) {
									local204 = local103[local238 + 1];
									@Pc(275) int local275 = -1;
									local197 = local103[local238];
									for (@Pc(281) int local281 = local197; local281 < local204; local281++) {
										local275 = local106[local281] - 1;
										if (local275 == -1 || local42[local275] != 0) {
											break;
										}
									}
									if (local275 != -1) {
										if (local53 == null) {
											this.aClass292_1 = new Class292();
											local53 = this.aClass292_1.aShortArray190 = Static390.method5967(this.aShortArray134);
											local49 = this.aClass292_1.aShortArray191 = Static390.method5967(this.aShortArray133);
											local61 = this.aClass292_1.aShortArray189 = Static390.method5967(this.aShortArray139);
											local57 = this.aClass292_1.aByteArray102 = Static205.method3798(this.aByteArray64);
										}
										if (local78 == null) {
											@Pc(360) Class292 local360 = local8.aClass292_1 = new Class292();
											local78 = local360.aShortArray190 = Static390.method5967(local33);
											local76 = local360.aShortArray191 = Static390.method5967(local36);
											local80 = local360.aShortArray189 = Static390.method5967(local39);
											local82 = local360.aByteArray102 = Static205.method3798(local42);
										}
										@Pc(393) short local393 = this.aShortArray134[local192];
										@Pc(398) short local398 = this.aShortArray133[local192];
										@Pc(403) short local403 = this.aShortArray139[local192];
										local204 = local103[local238 + 1];
										local197 = local103[local238];
										@Pc(418) byte local418 = this.aByteArray64[local192];
										@Pc(428) int local428;
										for (@Pc(420) int local420 = local197; local420 < local204; local420++) {
											local428 = local106[local420] - 1;
											if (local428 == -1) {
												break;
											}
											if (local82[local428] != 0) {
												local78[local428] += local393;
												local76[local428] += local398;
												local80[local428] += local403;
												local82[local428] += local418;
											}
										}
										local204 = this.anIntArray560[local132 + 1];
										local197 = this.anIntArray560[local132];
										local418 = local42[local275];
										local398 = local36[local275];
										local393 = local33[local275];
										local403 = local39[local275];
										for (local428 = local197; local428 < local204; local428++) {
											@Pc(514) int local514 = this.aShortArray141[local428] - 1;
											if (local514 == -1) {
												break;
											}
											if (local57[local514] != 0) {
												local53[local514] += local393;
												local49[local514] += local398;
												local61[local514] += local403;
												local57[local514] += local418;
											}
										}
										local8.method5464();
										this.method5464();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!or;JIIFIIIIIF)S")
	private short method5462(@OriginalArg(0) Class222 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(10) int local10 = this.anIntArray560[arg3];
		@Pc(17) int local17 = this.anIntArray560[arg3 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray141[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static89.aLongArray4[local21] == arg1) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray141[local19] = (short) (this.anInt6495 + 1);
		Static89.aLongArray4[local19] = arg1;
		this.aShortArray144[this.anInt6495] = (short) arg8;
		this.aShortArray135[this.anInt6495] = (short) arg3;
		this.aShortArray134[this.anInt6495] = (short) arg6;
		this.aShortArray133[this.anInt6495] = (short) arg2;
		this.aShortArray139[this.anInt6495] = (short) arg5;
		this.aByteArray64[this.anInt6495] = (byte) arg7;
		this.aFloatArray45[this.anInt6495] = arg9;
		this.aFloatArray44[this.anInt6495] = arg4;
		return (short) this.anInt6495++;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!oba;ZLclient!oba;BIZ)Lclient!ba;")
	private Class2 method5463(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class2_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg2.anInt6477 = this.anInt6477;
		arg2.anInt6483 = this.anInt6483;
		arg2.aShort97 = this.aShort97;
		arg2.anInt6489 = arg3;
		arg2.aShort98 = this.aShort98;
		arg2.anInt6495 = this.anInt6495;
		arg2.anInt6516 = this.anInt6516;
		arg2.anInt6502 = this.anInt6502;
		arg2.anInt6510 = this.anInt6510;
		arg2.anInt6499 = this.anInt6499;
		@Pc(50) boolean local50 = Static449.method6811(this.anInt6477, arg3);
		@Pc(56) boolean local56 = Static440.method6638(arg3, this.anInt6477);
		@Pc(62) boolean local62 = Static190.method3581(arg3, this.anInt6477);
		@Pc(68) boolean local68 = local56 | local50 | local62;
		@Pc(191) int local191;
		if (local68) {
			if (!local50) {
				arg2.anIntArray559 = this.anIntArray559;
			} else if (arg0.anIntArray559 == null || this.anInt6483 > arg0.anIntArray559.length) {
				arg2.anIntArray559 = arg0.anIntArray559 = new int[this.anInt6483];
			} else {
				arg2.anIntArray559 = arg0.anIntArray559;
			}
			if (!local56) {
				arg2.anIntArray558 = this.anIntArray558;
			} else if (arg0.anIntArray558 == null || this.anInt6483 > arg0.anIntArray558.length) {
				arg2.anIntArray558 = arg0.anIntArray558 = new int[this.anInt6483];
			} else {
				arg2.anIntArray558 = arg0.anIntArray558;
			}
			if (!local62) {
				arg2.anIntArray562 = this.anIntArray562;
			} else if (arg0.anIntArray562 == null || arg0.anIntArray562.length < this.anInt6483) {
				arg2.anIntArray562 = arg0.anIntArray562 = new int[this.anInt6483];
			} else {
				arg2.anIntArray562 = arg0.anIntArray562;
			}
			for (local191 = 0; local191 < this.anInt6483; local191++) {
				if (local50) {
					arg2.anIntArray559[local191] = this.anIntArray559[local191];
				}
				if (local56) {
					arg2.anIntArray558[local191] = this.anIntArray558[local191];
				}
				if (local62) {
					arg2.anIntArray562[local191] = this.anIntArray562[local191];
				}
			}
		} else {
			arg2.anIntArray562 = this.anIntArray562;
			arg2.anIntArray558 = this.anIntArray558;
			arg2.anIntArray559 = this.anIntArray559;
		}
		if (Static490.method7167(arg3, this.anInt6477)) {
			arg2.aClass235_4 = arg0.aClass235_4;
			arg2.aClass235_4.aBoolean457 = true;
			arg2.aClass235_4.anInterface3_11 = this.aClass235_4.anInterface3_11;
			arg2.aClass235_4.aBoolean456 = this.aClass235_4.aBoolean456;
		} else if (Static386.method5950(arg3, this.anInt6477)) {
			arg2.aClass235_4 = this.aClass235_4;
		} else {
			arg2.aClass235_4 = null;
		}
		if (Static459.method6873(this.anInt6477, arg3)) {
			if (arg0.aShortArray142 == null || this.anInt6502 > arg0.aShortArray142.length) {
				arg2.aShortArray142 = arg0.aShortArray142 = new short[this.anInt6502];
			} else {
				arg2.aShortArray142 = arg0.aShortArray142;
			}
			for (local191 = 0; local191 < this.anInt6502; local191++) {
				arg2.aShortArray142[local191] = this.aShortArray142[local191];
			}
		} else {
			arg2.aShortArray142 = this.aShortArray142;
		}
		if (Static151.method2597(arg3, this.anInt6477)) {
			if (arg0.aByteArray63 == null || arg0.aByteArray63.length < this.anInt6502) {
				arg2.aByteArray63 = arg0.aByteArray63 = new byte[this.anInt6502];
			} else {
				arg2.aByteArray63 = arg0.aByteArray63;
			}
			for (local191 = 0; local191 < this.anInt6502; local191++) {
				arg2.aByteArray63[local191] = this.aByteArray63[local191];
			}
		} else {
			arg2.aByteArray63 = this.aByteArray63;
		}
		if (Static424.method6501(arg3, this.anInt6477)) {
			arg2.aClass235_3 = arg0.aClass235_3;
			arg2.aClass235_3.aBoolean456 = this.aClass235_3.aBoolean456;
			arg2.aClass235_3.anInterface3_11 = this.aClass235_3.anInterface3_11;
			arg2.aClass235_3.aBoolean457 = true;
		} else if (Static188.method3553(arg3, this.anInt6477)) {
			arg2.aClass235_3 = this.aClass235_3;
		} else {
			arg2.aClass235_3 = null;
		}
		@Pc(514) int local514;
		if (Static469.method7009(arg3, this.anInt6477)) {
			if (arg0.aShortArray134 == null || this.anInt6495 > arg0.aShortArray134.length) {
				local191 = this.anInt6495;
				arg2.aShortArray139 = arg0.aShortArray139 = new short[local191];
				arg2.aShortArray133 = arg0.aShortArray133 = new short[local191];
				arg2.aShortArray134 = arg0.aShortArray134 = new short[local191];
			} else {
				arg2.aShortArray139 = arg0.aShortArray139;
				arg2.aShortArray133 = arg0.aShortArray133;
				arg2.aShortArray134 = arg0.aShortArray134;
			}
			if (this.aClass292_1 == null) {
				arg2.aClass292_1 = null;
				for (local191 = 0; local191 < this.anInt6495; local191++) {
					arg2.aShortArray134[local191] = this.aShortArray134[local191];
					arg2.aShortArray133[local191] = this.aShortArray133[local191];
					arg2.aShortArray139[local191] = this.aShortArray139[local191];
				}
			} else {
				if (arg0.aClass292_1 == null) {
					arg0.aClass292_1 = new Class292();
				}
				@Pc(498) Class292 local498 = arg2.aClass292_1 = arg0.aClass292_1;
				if (local498.aShortArray190 == null || this.anInt6495 > local498.aShortArray190.length) {
					local514 = this.anInt6495;
					local498.aByteArray102 = new byte[local514];
					local498.aShortArray190 = new short[local514];
					local498.aShortArray189 = new short[local514];
					local498.aShortArray191 = new short[local514];
				}
				for (local514 = 0; local514 < this.anInt6495; local514++) {
					arg2.aShortArray134[local514] = this.aShortArray134[local514];
					arg2.aShortArray133[local514] = this.aShortArray133[local514];
					arg2.aShortArray139[local514] = this.aShortArray139[local514];
					local498.aShortArray190[local514] = this.aClass292_1.aShortArray190[local514];
					local498.aShortArray191[local514] = this.aClass292_1.aShortArray191[local514];
					local498.aShortArray189[local514] = this.aClass292_1.aShortArray189[local514];
					local498.aByteArray102[local514] = this.aClass292_1.aByteArray102[local514];
				}
			}
			arg2.aByteArray64 = this.aByteArray64;
		} else {
			arg2.aShortArray139 = this.aShortArray139;
			arg2.aShortArray133 = this.aShortArray133;
			arg2.aByteArray64 = this.aByteArray64;
			arg2.aShortArray134 = this.aShortArray134;
			arg2.aClass292_1 = this.aClass292_1;
		}
		if (Static349.method5539(this.anInt6477, arg3)) {
			arg2.aClass235_1 = arg0.aClass235_1;
			arg2.aClass235_1.anInterface3_11 = this.aClass235_1.anInterface3_11;
			arg2.aClass235_1.aBoolean457 = true;
			arg2.aClass235_1.aBoolean456 = this.aClass235_1.aBoolean456;
		} else if (Static464.method6916(arg3, this.anInt6477)) {
			arg2.aClass235_1 = this.aClass235_1;
		} else {
			arg2.aClass235_1 = null;
		}
		if (Static168.method3214(this.anInt6477, arg3)) {
			if (arg0.aFloatArray45 == null || this.anInt6502 > arg0.aFloatArray45.length) {
				local191 = this.anInt6495;
				arg2.aFloatArray44 = arg0.aFloatArray44 = new float[local191];
				arg2.aFloatArray45 = arg0.aFloatArray45 = new float[local191];
			} else {
				arg2.aFloatArray44 = arg0.aFloatArray44;
				arg2.aFloatArray45 = arg0.aFloatArray45;
			}
			for (local191 = 0; local191 < this.anInt6495; local191++) {
				arg2.aFloatArray45[local191] = this.aFloatArray45[local191];
				arg2.aFloatArray44[local191] = this.aFloatArray44[local191];
			}
		} else {
			arg2.aFloatArray44 = this.aFloatArray44;
			arg2.aFloatArray45 = this.aFloatArray45;
		}
		if (Static104.method2057(arg3, this.anInt6477)) {
			arg2.aClass235_2 = arg0.aClass235_2;
			arg2.aClass235_2.anInterface3_11 = this.aClass235_2.anInterface3_11;
			arg2.aClass235_2.aBoolean456 = this.aClass235_2.aBoolean456;
			arg2.aClass235_2.aBoolean457 = true;
		} else if (Static164.method3199(this.anInt6477, arg3)) {
			arg2.aClass235_2 = this.aClass235_2;
		} else {
			arg2.aClass235_2 = null;
		}
		if (Static504.method7747(this.anInt6477, arg3)) {
			if (arg0.aShortArray143 == null || this.anInt6502 > arg0.aShortArray143.length) {
				local191 = this.anInt6502;
				arg2.aShortArray137 = arg0.aShortArray137 = new short[local191];
				arg2.aShortArray145 = arg0.aShortArray145 = new short[local191];
				arg2.aShortArray143 = arg0.aShortArray143 = new short[local191];
			} else {
				arg2.aShortArray143 = arg0.aShortArray143;
				arg2.aShortArray137 = arg0.aShortArray137;
				arg2.aShortArray145 = arg0.aShortArray145;
			}
			for (local191 = 0; local191 < this.anInt6502; local191++) {
				arg2.aShortArray143[local191] = this.aShortArray143[local191];
				arg2.aShortArray137[local191] = this.aShortArray137[local191];
				arg2.aShortArray145[local191] = this.aShortArray145[local191];
			}
		} else {
			arg2.aShortArray137 = this.aShortArray137;
			arg2.aShortArray143 = this.aShortArray143;
			arg2.aShortArray145 = this.aShortArray145;
		}
		if (Static39.method946(arg3, this.anInt6477)) {
			arg2.aClass236_1 = arg0.aClass236_1;
			arg2.aClass236_1.aBoolean459 = this.aClass236_1.aBoolean459;
			arg2.aClass236_1.anInterface14_6 = this.aClass236_1.anInterface14_6;
			arg2.aClass236_1.aBoolean458 = true;
		} else if (Static384.method5928(arg3, this.anInt6477)) {
			arg2.aClass236_1 = this.aClass236_1;
		} else {
			arg2.aClass236_1 = null;
		}
		if (Static446.method6774(arg3, this.anInt6477)) {
			if (arg0.aShortArray136 == null || arg0.aShortArray136.length < this.anInt6502) {
				local191 = this.anInt6502;
				arg2.aShortArray136 = arg0.aShortArray136 = new short[local191];
			} else {
				arg2.aShortArray136 = arg0.aShortArray136;
			}
			for (local191 = 0; local191 < this.anInt6502; local191++) {
				arg2.aShortArray136[local191] = this.aShortArray136[local191];
			}
		} else {
			arg2.aShortArray136 = this.aShortArray136;
		}
		if (!Static27.method792(arg3, this.anInt6477)) {
			arg2.aClass17Array1 = this.aClass17Array1;
		} else if (arg0.aClass17Array1 == null || this.anInt6516 > arg0.aClass17Array1.length) {
			local191 = this.anInt6516;
			arg2.aClass17Array1 = arg0.aClass17Array1 = new Class17[local191];
			for (local514 = 0; local514 < this.anInt6516; local514++) {
				arg2.aClass17Array1[local514] = this.aClass17Array1[local514].method663();
			}
		} else {
			arg2.aClass17Array1 = arg0.aClass17Array1;
			for (local191 = 0; local191 < this.anInt6516; local191++) {
				arg2.aClass17Array1[local191].method662(this.aClass17Array1[local191]);
			}
		}
		arg2.anIntArray561 = this.anIntArray561;
		arg2.aShortArray140 = this.aShortArray140;
		arg2.aShortArray144 = this.aShortArray144;
		arg2.anIntArray557 = this.anIntArray557;
		arg2.aShortArray141 = this.aShortArray141;
		arg2.anIntArray560 = this.anIntArray560;
		arg2.aClass191Array1 = this.aClass191Array1;
		arg2.anIntArrayArray58 = this.anIntArrayArray58;
		arg2.anIntArrayArray60 = this.anIntArrayArray60;
		if (this.aBoolean412) {
			arg2.anInt6526 = this.anInt6526;
			arg2.anInt6476 = this.anInt6476;
			arg2.anInt6511 = this.anInt6511;
			arg2.aBoolean412 = true;
			arg2.anInt6504 = this.anInt6504;
			arg2.anInt6543 = this.anInt6543;
			arg2.anInt6518 = this.anInt6518;
			arg2.anInt6539 = this.anInt6539;
		} else {
			arg2.aBoolean412 = false;
		}
		arg2.aShortArray135 = this.aShortArray135;
		arg2.aShortArray138 = this.aShortArray138;
		arg2.anIntArrayArray59 = this.anIntArrayArray59;
		arg2.aClass83Array5 = this.aClass83Array5;
		arg2.aClass109Array5 = this.aClass109Array5;
		arg2.anIntArray556 = this.anIntArray556;
		return arg2;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!q;Lclient!sda;I)V")
	@Override
	public void method5774(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6495 == 0) {
			return;
		}
		@Pc(13) Class205_Sub1 local13 = this.aClass5_Sub3_14.aClass205_Sub1_16;
		@Pc(16) Class205_Sub1 local16 = (Class205_Sub1) arg0;
		if (!this.aBoolean412) {
			this.method5477();
		}
		Static203.aFloat148 = local13.aFloat187 * local16.aFloat189 + local13.aFloat183 * local16.aFloat181 + local16.aFloat187 * local13.aFloat182;
		Static377.aFloat207 = local13.aFloat182 * local16.aFloat184 + local16.aFloat191 * local13.aFloat187 + local13.aFloat183 * local16.aFloat188 + local13.aFloat184;
		@Pc(69) float local69 = Static203.aFloat148 * (float) this.anInt6543 + Static377.aFloat207;
		@Pc(77) float local77 = (float) this.anInt6539 * Static203.aFloat148 + Static377.aFloat207;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = local69 + (float) this.anInt6518;
			local93 = local77 - (float) this.anInt6518;
		} else {
			local87 = local77 + (float) this.anInt6518;
			local93 = (float) -this.anInt6518 + local69;
		}
		if (this.aClass5_Sub3_14.aFloat218 <= local93 || local87 <= (float) this.aClass5_Sub3_14.anInt7778) {
			return;
		}
		Static522.aFloat264 = local13.aFloat188 + local13.aFloat181 * local16.aFloat191 + local13.aFloat192 * local16.aFloat188 + local13.aFloat185 * local16.aFloat184;
		Static40.aFloat40 = local16.aFloat181 * local13.aFloat192 + local16.aFloat189 * local13.aFloat181 + local13.aFloat185 * local16.aFloat187;
		@Pc(170) float local170 = Static522.aFloat264 + (float) this.anInt6543 * Static40.aFloat40;
		@Pc(178) float local178 = (float) this.anInt6539 * Static40.aFloat40 + Static522.aFloat264;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local178 < local170) {
			local193 = ((float) this.anInt6518 + local170) * (float) this.aClass5_Sub3_14.anInt7755;
			local204 = (float) this.aClass5_Sub3_14.anInt7755 * ((float) -this.anInt6518 + local178);
		} else {
			local193 = (local178 + (float) this.anInt6518) * (float) this.aClass5_Sub3_14.anInt7755;
			local204 = (float) this.aClass5_Sub3_14.anInt7755 * (local170 - (float) this.anInt6518);
		}
		if (local204 / local87 >= this.aClass5_Sub3_14.aFloat221 || this.aClass5_Sub3_14.aFloat231 >= local193 / local87) {
			return;
		}
		Static446.aFloat242 = local13.aFloat191 + local16.aFloat188 * local13.aFloat186 + local16.aFloat191 * local13.aFloat189 + local13.aFloat190 * local16.aFloat184;
		Static469.aFloat248 = local16.aFloat189 * local13.aFloat189 + local13.aFloat186 * local16.aFloat181 + local13.aFloat190 * local16.aFloat187;
		@Pc(294) float local294 = Static469.aFloat248 * (float) this.anInt6543 + Static446.aFloat242;
		@Pc(302) float local302 = (float) this.anInt6539 * Static469.aFloat248 + Static446.aFloat242;
		@Pc(317) float local317;
		@Pc(328) float local328;
		if (local302 < local294) {
			local317 = (float) this.aClass5_Sub3_14.anInt7758 * (local302 - (float) this.anInt6518);
			local328 = ((float) this.anInt6518 + local294) * (float) this.aClass5_Sub3_14.anInt7758;
		} else {
			local328 = ((float) this.anInt6518 + local302) * (float) this.aClass5_Sub3_14.anInt7758;
			local317 = (float) this.aClass5_Sub3_14.anInt7758 * ((float) -this.anInt6518 + local294);
		}
		if (this.aClass5_Sub3_14.aFloat233 <= local317 / local87 || this.aClass5_Sub3_14.bf >= local328 / local87) {
			return;
		}
		if (arg1 != null || this.aClass191Array1 != null) {
			Static222.aFloat153 = local13.aFloat189 * local16.aFloat186 + local13.aFloat186 * local16.aFloat192 + local13.aFloat190 * local16.aFloat183;
			Static248.aFloat156 = local13.aFloat185 * local16.aFloat183 + local13.aFloat192 * local16.aFloat192 + local13.aFloat181 * local16.aFloat186;
			Static486.aFloat237 = local13.aFloat182 * local16.aFloat183 + local16.aFloat192 * local13.aFloat183 + local16.aFloat186 * local13.aFloat187;
			Static66.aFloat49 = local16.aFloat182 * local13.aFloat185 + local13.aFloat192 * local16.aFloat185 + local16.aFloat190 * local13.aFloat181;
			Static475.aFloat250 = local13.aFloat190 * local16.aFloat182 + local13.aFloat186 * local16.aFloat185 + local13.aFloat189 * local16.aFloat190;
			Static338.aFloat196 = local13.aFloat182 * local16.aFloat182 + local16.aFloat185 * local13.aFloat183 + local13.aFloat187 * local16.aFloat190;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(498) int local498 = this.anInt6476 + this.anInt6504 >> 1;
			@Pc(507) int local507 = this.anInt6526 + this.anInt6511 >> 1;
			@Pc(526) int local526 = (int) (Static66.aFloat49 * (float) local507 + Static522.aFloat264 + (float) local498 * Static248.aFloat156 + Static40.aFloat40 * (float) this.anInt6543);
			@Pc(545) int local545 = (int) ((float) local507 * Static475.aFloat250 + Static446.aFloat242 + Static222.aFloat153 * (float) local498 + Static469.aFloat248 * (float) this.anInt6543);
			@Pc(564) int local564 = (int) (Static338.aFloat196 * (float) local507 + (float) local498 * Static486.aFloat237 + Static377.aFloat207 + (float) this.anInt6543 * Static203.aFloat148);
			if (local564 < this.aClass5_Sub3_14.anInt7778) {
				local488 = true;
			} else {
				arg1.anInt8049 = this.aClass5_Sub3_14.anInt7781 + local526 * this.aClass5_Sub3_14.anInt7755 / local564;
				arg1.anInt8050 = this.aClass5_Sub3_14.anInt7776 + local545 * this.aClass5_Sub3_14.anInt7758 / local564;
			}
			@Pc(623) int local623 = (int) ((float) this.anInt6539 * Static40.aFloat40 + Static522.aFloat264 + (float) local498 * Static248.aFloat156 + Static66.aFloat49 * (float) local507);
			@Pc(642) int local642 = (int) ((float) local507 * Static475.aFloat250 + Static469.aFloat248 * (float) this.anInt6539 + Static446.aFloat242 + Static222.aFloat153 * (float) local498);
			@Pc(661) int local661 = (int) ((float) local507 * Static338.aFloat196 + (float) this.anInt6539 * Static203.aFloat148 + (float) local498 * Static486.aFloat237 + Static377.aFloat207);
			if (local661 >= this.aClass5_Sub3_14.anInt7778) {
				arg1.anInt8051 = local642 * this.aClass5_Sub3_14.anInt7758 / local661 + this.aClass5_Sub3_14.anInt7776;
				arg1.anInt8047 = this.aClass5_Sub3_14.anInt7781 + local623 * this.aClass5_Sub3_14.anInt7755 / local661;
			} else {
				local488 = true;
			}
			if (local488) {
				if (this.aClass5_Sub3_14.anInt7778 > local564 && local661 < this.aClass5_Sub3_14.anInt7778) {
					local490 = false;
				} else {
					@Pc(736) int local736;
					@Pc(747) int local747;
					@Pc(758) int local758;
					if (local564 < this.aClass5_Sub3_14.anInt7778) {
						local736 = (local661 - this.aClass5_Sub3_14.anInt7778 << 16) / (local661 - local564);
						local747 = local623 + ((local623 - local526) * local736 >> 16);
						local758 = local642 + (local736 * (local642 - local545) >> 16);
						arg1.anInt8049 = local747 * this.aClass5_Sub3_14.anInt7755 / this.aClass5_Sub3_14.anInt7778 + this.aClass5_Sub3_14.anInt7781;
						arg1.anInt8050 = this.aClass5_Sub3_14.anInt7776 + this.aClass5_Sub3_14.anInt7758 * local758 / this.aClass5_Sub3_14.anInt7778;
					} else if (this.aClass5_Sub3_14.anInt7778 > local661) {
						local736 = (local564 - this.aClass5_Sub3_14.anInt7778 << 16) / (local564 - local661);
						local747 = ((local526 - local623) * local736 >> 16) + local526;
						local758 = (local736 * (local545 - local642) >> 16) + local545;
						arg1.anInt8049 = this.aClass5_Sub3_14.anInt7781 + this.aClass5_Sub3_14.anInt7755 * local747 / this.aClass5_Sub3_14.anInt7778;
						arg1.anInt8050 = this.aClass5_Sub3_14.anInt7758 * local758 / this.aClass5_Sub3_14.anInt7778 + this.aClass5_Sub3_14.anInt7776;
					}
				}
			}
			if (local490) {
				if (local661 < local564) {
					arg1.anInt8048 = this.aClass5_Sub3_14.anInt7781 + this.aClass5_Sub3_14.anInt7755 * (local526 + this.anInt6518) / local564 - arg1.anInt8049;
				} else {
					arg1.anInt8048 = this.aClass5_Sub3_14.anInt7781 + (this.anInt6518 + local623) * this.aClass5_Sub3_14.anInt7755 / local661 - arg1.anInt8047;
				}
				arg1.aBoolean573 = true;
			}
		}
		this.aClass5_Sub3_14.method6375();
		this.aClass5_Sub3_14.method6381(local16);
		this.method5468();
		this.method5470();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!q;Lclient!sda;II)V")
	@Override
	public void method5772(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6495 == 0) {
			return;
		}
		@Pc(13) Class205_Sub1 local13 = this.aClass5_Sub3_14.aClass205_Sub1_16;
		if (!this.aBoolean412) {
			this.method5477();
		}
		@Pc(22) Class205_Sub1 local22 = (Class205_Sub1) arg0;
		Static203.aFloat148 = local13.aFloat183 * local22.aFloat181 + local13.aFloat187 * local22.aFloat189 + local13.aFloat182 * local22.aFloat187;
		Static377.aFloat207 = local13.aFloat182 * local22.aFloat184 + local22.aFloat188 * local13.aFloat183 + local22.aFloat191 * local13.aFloat187 + local13.aFloat184;
		@Pc(69) float local69 = Static377.aFloat207 + Static203.aFloat148 * (float) this.anInt6543;
		@Pc(77) float local77 = (float) this.anInt6539 * Static203.aFloat148 + Static377.aFloat207;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = local69 + (float) this.anInt6518;
			local94 = (float) -this.anInt6518 + local77;
		} else {
			local87 = local77 + (float) this.anInt6518;
			local94 = (float) -this.anInt6518 + local69;
		}
		if (this.aClass5_Sub3_14.aFloat223 <= local94 || local87 <= (float) this.aClass5_Sub3_14.anInt7778) {
			return;
		}
		Static40.aFloat40 = local13.aFloat185 * local22.aFloat187 + local22.aFloat181 * local13.aFloat192 + local22.aFloat189 * local13.aFloat181;
		Static522.aFloat264 = local22.aFloat184 * local13.aFloat185 + local22.aFloat188 * local13.aFloat192 + local13.aFloat181 * local22.aFloat191 + local13.aFloat188;
		@Pc(171) float local171 = (float) this.anInt6543 * Static40.aFloat40 + Static522.aFloat264;
		@Pc(179) float local179 = Static522.aFloat264 + (float) this.anInt6539 * Static40.aFloat40;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local179 < local171) {
			local195 = (local179 - (float) this.anInt6518) * (float) this.aClass5_Sub3_14.anInt7755;
			local206 = (float) this.aClass5_Sub3_14.anInt7755 * (local171 + (float) this.anInt6518);
		} else {
			local195 = (float) this.aClass5_Sub3_14.anInt7755 * ((float) -this.anInt6518 + local171);
			local206 = (float) this.aClass5_Sub3_14.anInt7755 * ((float) this.anInt6518 + local179);
		}
		if (local195 / (float) arg2 >= this.aClass5_Sub3_14.aFloat221 || local206 / (float) arg2 <= this.aClass5_Sub3_14.aFloat231) {
			return;
		}
		Static446.aFloat242 = local13.aFloat191 + local22.aFloat184 * local13.aFloat190 + local22.aFloat188 * local13.aFloat186 + local22.aFloat191 * local13.aFloat189;
		Static469.aFloat248 = local13.aFloat189 * local22.aFloat189 + local22.aFloat181 * local13.aFloat186 + local22.aFloat187 * local13.aFloat190;
		@Pc(297) float local297 = (float) this.anInt6543 * Static469.aFloat248 + Static446.aFloat242;
		@Pc(305) float local305 = Static469.aFloat248 * (float) this.anInt6539 + Static446.aFloat242;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local297 > local305) {
			local320 = (float) this.aClass5_Sub3_14.anInt7758 * (local305 - (float) this.anInt6518);
			local331 = ((float) this.anInt6518 + local297) * (float) this.aClass5_Sub3_14.anInt7758;
		} else {
			local331 = (float) this.aClass5_Sub3_14.anInt7758 * (local305 + (float) this.anInt6518);
			local320 = ((float) -this.anInt6518 + local297) * (float) this.aClass5_Sub3_14.anInt7758;
		}
		if (this.aClass5_Sub3_14.aFloat233 <= local320 / (float) arg2 || this.aClass5_Sub3_14.bf >= local331 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass191Array1 != null) {
			Static66.aFloat49 = local13.aFloat181 * local22.aFloat190 + local22.aFloat185 * local13.aFloat192 + local22.aFloat182 * local13.aFloat185;
			Static222.aFloat153 = local13.aFloat189 * local22.aFloat186 + local13.aFloat186 * local22.aFloat192 + local22.aFloat183 * local13.aFloat190;
			Static248.aFloat156 = local13.aFloat185 * local22.aFloat183 + local13.aFloat192 * local22.aFloat192 + local13.aFloat181 * local22.aFloat186;
			Static486.aFloat237 = local22.aFloat186 * local13.aFloat187 + local13.aFloat183 * local22.aFloat192 + local22.aFloat183 * local13.aFloat182;
			Static475.aFloat250 = local22.aFloat182 * local13.aFloat190 + local13.aFloat189 * local22.aFloat190 + local22.aFloat185 * local13.aFloat186;
			Static338.aFloat196 = local13.aFloat183 * local22.aFloat185 + local22.aFloat190 * local13.aFloat187 + local13.aFloat182 * local22.aFloat182;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.anInt6504 + this.anInt6476 >> 1;
			@Pc(509) int local509 = this.anInt6526 + this.anInt6511 >> 1;
			@Pc(528) int local528 = (int) (Static522.aFloat264 + (float) local500 * Static248.aFloat156 + Static40.aFloat40 * (float) this.anInt6543 + (float) local509 * Static66.aFloat49);
			@Pc(547) int local547 = (int) (Static475.aFloat250 * (float) local509 + Static222.aFloat153 * (float) local500 + Static446.aFloat242 + Static469.aFloat248 * (float) this.anInt6543);
			@Pc(566) int local566 = (int) (Static203.aFloat148 * (float) this.anInt6543 + Static486.aFloat237 * (float) local500 + Static377.aFloat207 + Static338.aFloat196 * (float) local509);
			@Pc(585) int local585 = (int) (Static40.aFloat40 * (float) this.anInt6539 + (float) local500 * Static248.aFloat156 + Static522.aFloat264 + (float) local509 * Static66.aFloat49);
			@Pc(604) int local604 = (int) ((float) this.anInt6539 * Static469.aFloat248 + Static446.aFloat242 + Static222.aFloat153 * (float) local500 + (float) local509 * Static475.aFloat250);
			arg1.anInt8051 = local604 * this.aClass5_Sub3_14.anInt7758 / arg2 + this.aClass5_Sub3_14.anInt7776;
			arg1.anInt8047 = this.aClass5_Sub3_14.anInt7781 + this.aClass5_Sub3_14.anInt7755 * local585 / arg2;
			@Pc(649) int local649 = (int) (Static203.aFloat148 * (float) this.anInt6539 + Static486.aFloat237 * (float) local500 + Static377.aFloat207 + (float) local509 * Static338.aFloat196);
			arg1.anInt8050 = local547 * this.aClass5_Sub3_14.anInt7758 / arg2 + this.aClass5_Sub3_14.anInt7776;
			arg1.anInt8049 = this.aClass5_Sub3_14.anInt7781 + local528 * this.aClass5_Sub3_14.anInt7755 / arg2;
			if (local566 < this.aClass5_Sub3_14.anInt7778 && local649 < this.aClass5_Sub3_14.anInt7778) {
				arg1.anInt8048 = this.aClass5_Sub3_14.anInt7781 + (local528 + this.anInt6518) * this.aClass5_Sub3_14.anInt7755 / arg2 - arg1.anInt8049;
				arg1.aBoolean573 = true;
			}
		}
		this.aClass5_Sub3_14.method6318((float) arg2);
		this.aClass5_Sub3_14.method6319();
		this.aClass5_Sub3_14.method6381(local22);
		this.method5468();
		this.method5470();
	}

	@OriginalMember(owner = "client!oba", name = "LA", descriptor = "()I")
	@Override
	public int LA() {
		if (!this.aBoolean412) {
			this.method5477();
		}
		return this.anInt6526;
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(Z)V")
	private void method5464() {
		if ((this.anInt6477 & 0x37) == 0) {
			if (this.aClass235_3 != null) {
				this.aClass235_3.aBoolean456 = false;
			}
		} else if (this.aClass235_1 != null) {
			this.aClass235_1.aBoolean456 = false;
		}
	}

	@OriginalMember(owner = "client!oba", name = "Z", descriptor = "(Lclient!w;)Lclient!w;")
	@Override
	public Class3_Sub10_Sub18 Z(@OriginalArg(0) Class3_Sub10_Sub18 arg0) {
		if (this.anInt6495 == 0) {
			return null;
		}
		if (!this.aBoolean412) {
			this.method5477();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass5_Sub3_14.anInt7762 <= 0) {
			local40 = this.anInt6504 - (this.aClass5_Sub3_14.anInt7762 * this.anInt6543 >> 8) >> this.aClass5_Sub3_14.anInt7761;
			local57 = this.anInt6476 - (this.aClass5_Sub3_14.anInt7762 * this.anInt6539 >> 8) >> this.aClass5_Sub3_14.anInt7761;
		} else {
			local40 = this.anInt6504 - (this.aClass5_Sub3_14.anInt7762 * this.anInt6539 >> 8) >> this.aClass5_Sub3_14.anInt7761;
			local57 = this.anInt6476 - (this.anInt6543 * this.aClass5_Sub3_14.anInt7762 >> 8) >> this.aClass5_Sub3_14.anInt7761;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass5_Sub3_14.anInt7756 > 0) {
			local116 = this.anInt6526 - (this.aClass5_Sub3_14.anInt7756 * this.anInt6539 >> 8) >> this.aClass5_Sub3_14.anInt7761;
			local133 = this.anInt6511 - (this.aClass5_Sub3_14.anInt7756 * this.anInt6543 >> 8) >> this.aClass5_Sub3_14.anInt7761;
		} else {
			local116 = this.anInt6526 - (this.anInt6543 * this.aClass5_Sub3_14.anInt7756 >> 8) >> this.aClass5_Sub3_14.anInt7761;
			local133 = this.anInt6511 - (this.aClass5_Sub3_14.anInt7756 * this.anInt6539 >> 8) >> this.aClass5_Sub3_14.anInt7761;
		}
		@Pc(175) int local175 = local57 + 1 - local40;
		@Pc(182) int local182 = local133 + 1 - local116;
		@Pc(185) Class3_Sub10_Sub18_Sub1 local185 = (Class3_Sub10_Sub18_Sub1) arg0;
		@Pc(201) Class3_Sub10_Sub18_Sub1 local201;
		if (local185 != null && local185.method7512(local175, local182)) {
			local201 = local185;
			local185.method7513();
		} else {
			local201 = new Class3_Sub10_Sub18_Sub1(this.aClass5_Sub3_14, local175, local182);
		}
		local201.method7517(local40, local116, local133, local57);
		this.method5476(local201);
		return local201;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)Z")
	private boolean method5466() {
		if (this.aClass236_1.aBoolean459) {
			return true;
		}
		if (this.aClass236_1.anInterface14_5 == null) {
			this.aClass236_1.anInterface14_5 = this.aClass5_Sub3_14.method6325(this.aBoolean413);
		}
		@Pc(28) Interface14 local28 = this.aClass236_1.anInterface14_5;
		local28.method3137(this.anInt6499 * 6);
		@Pc(47) Buffer local47 = local28.method3136();
		if (local47 != null) {
			@Pc(55) Stream local55 = this.aClass5_Sub3_14.method6352(local47);
			@Pc(59) int local59;
			if (Stream.c()) {
				for (local59 = 0; local59 < this.anInt6499; local59++) {
					local55.c(this.aShortArray143[local59]);
					local55.c(this.aShortArray137[local59]);
					local55.c(this.aShortArray145[local59]);
				}
			} else {
				for (local59 = 0; local59 < this.anInt6499; local59++) {
					local55.b(this.aShortArray143[local59]);
					local55.b(this.aShortArray137[local59]);
					local55.b(this.aShortArray145[local59]);
				}
			}
			local55.a();
			if (local28.method3135()) {
				this.aClass236_1.aBoolean459 = true;
				this.aClass236_1.anInterface14_6 = local28;
				this.aBoolean411 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "(Z)Z")
	private boolean method5467() {
		@Pc(13) boolean local13 = !this.aClass235_3.aBoolean456;
		@Pc(29) boolean local29 = (this.anInt6477 & 0x37) != 0 && !this.aClass235_1.aBoolean456;
		@Pc(37) boolean local37 = !this.aClass235_4.aBoolean456;
		@Pc(45) boolean local45 = !this.aClass235_2.aBoolean456;
		if (!local37 && !local13 && !local29 && !local45) {
			return true;
		}
		@Pc(57) boolean local57 = true;
		@Pc(76) Interface3 local76;
		@Pc(90) Buffer local90;
		if (local37) {
			if (this.aClass235_4.anInterface3_10 == null) {
				this.aClass235_4.anInterface3_10 = this.aClass5_Sub3_14.method6422(this.aBoolean413);
			}
			local76 = this.aClass235_4.anInterface3_10;
			local76.method2580(12, this.anInt6495 * 12);
			local90 = local76.method3136();
			if (local90 == null) {
				local57 = false;
			} else {
				this.aClass5_Sub3_14.aNativeInterface3.copyPositions(this.anIntArray559, this.anIntArray558, this.anIntArray562, this.aShortArray135, 0, 12, this.anInt6495, local90.getAddress());
				if (local76.method3135()) {
					this.aClass235_4.aBoolean456 = true;
					this.aClass235_4.anInterface3_11 = local76;
				} else {
					local57 = false;
				}
			}
		}
		@Pc(207) short[] local207;
		@Pc(201) short[] local201;
		@Pc(204) short[] local204;
		@Pc(210) byte[] local210;
		if (local13) {
			if (this.aClass235_3.anInterface3_10 == null) {
				this.aClass235_3.anInterface3_10 = this.aClass5_Sub3_14.method6422(this.aBoolean413);
			}
			local76 = this.aClass235_3.anInterface3_10;
			local76.method2580(4, this.anInt6495 * 4);
			local90 = local76.method3136();
			if (local90 == null) {
				local57 = false;
			} else {
				if ((this.anInt6477 & 0x37) == 0) {
					if (this.aClass292_1 == null) {
						local201 = this.aShortArray133;
						local204 = this.aShortArray139;
						local207 = this.aShortArray134;
						local210 = this.aByteArray64;
					} else {
						local210 = this.aClass292_1.aByteArray102;
						local207 = this.aClass292_1.aShortArray190;
						local204 = this.aClass292_1.aShortArray189;
						local201 = this.aClass292_1.aShortArray191;
					}
					this.aClass5_Sub3_14.aNativeInterface3.copyLighting(this.aShortArray142, this.aByteArray63, this.aShortArray136, local207, local201, local204, local210, this.aShort98, this.aShort97, this.aShortArray144, 0, 4, this.anInt6495, local90.getAddress());
				} else {
					this.aClass5_Sub3_14.aNativeInterface3.copyColours(this.aShortArray142, this.aByteArray63, this.aShortArray136, this.aShort98, this.aShortArray144, 0, 4, this.anInt6495, local90.getAddress());
				}
				if (local76.method3135()) {
					this.aClass235_3.aBoolean456 = true;
					this.aClass235_3.anInterface3_11 = local76;
				} else {
					local57 = false;
				}
			}
		}
		if (local29) {
			if (this.aClass235_1.anInterface3_10 == null) {
				this.aClass235_1.anInterface3_10 = this.aClass5_Sub3_14.method6422(this.aBoolean413);
			}
			local76 = this.aClass235_1.anInterface3_10;
			local76.method2580(12, this.anInt6495 * 12);
			local90 = local76.method3136();
			if (local90 == null) {
				local57 = false;
			} else {
				if (this.aClass292_1 == null) {
					local204 = this.aShortArray139;
					local201 = this.aShortArray133;
					local207 = this.aShortArray134;
					local210 = this.aByteArray64;
				} else {
					local210 = this.aClass292_1.aByteArray102;
					local207 = this.aClass292_1.aShortArray190;
					local201 = this.aClass292_1.aShortArray191;
					local204 = this.aClass292_1.aShortArray189;
				}
				this.aClass5_Sub3_14.aNativeInterface3.copyNormals(local207, local201, local204, local210, 3.0F / (float) this.aShort97, 3.0F / (float) (this.aShort97 + this.aShort97 / 2), 0, 12, this.anInt6495, local90.getAddress());
				if (local76.method3135()) {
					this.aClass235_1.anInterface3_11 = local76;
					this.aClass235_1.aBoolean456 = true;
				} else {
					local57 = false;
				}
			}
		}
		if (local45) {
			if (this.aClass235_2.anInterface3_10 == null) {
				this.aClass235_2.anInterface3_10 = this.aClass5_Sub3_14.method6422(this.aBoolean413);
			}
			local76 = this.aClass235_2.anInterface3_10;
			local76.method2580(8, this.anInt6495 * 8);
			local90 = local76.method3136();
			if (local90 == null) {
				local57 = false;
			} else {
				this.aClass5_Sub3_14.aNativeInterface3.copyTexCoords(this.aFloatArray45, this.aFloatArray44, 0, 8, this.anInt6495, local90.getAddress());
				if (local76.method3135()) {
					this.aClass235_2.anInterface3_11 = local76;
					this.aClass235_2.aBoolean456 = true;
				} else {
					local57 = false;
				}
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
	private void method5468() {
		if (this.anInt6499 == 0) {
			return;
		}
		if (this.method5467() && this.method5466()) {
			this.aClass5_Sub3_14.method6382(this.aClass235_4.anInterface3_11, 0);
			this.aClass5_Sub3_14.method6382(this.aClass235_3.anInterface3_11, 1);
			this.aClass5_Sub3_14.method6382(this.aClass235_2.anInterface3_11, 2);
			@Pc(59) boolean local59;
			if ((this.anInt6477 & 0x37) == 0) {
				this.aClass5_Sub3_14.method6349(false);
				local59 = false;
				this.aClass5_Sub3_14.method6333(this.aClass5_Sub3_14.aClass76_14);
			} else {
				this.aClass5_Sub3_14.method6349(true);
				local59 = true;
				this.aClass5_Sub3_14.method6382(this.aClass235_1.anInterface3_11, 3);
				this.aClass5_Sub3_14.method6333(this.aClass5_Sub3_14.aClass76_18);
			}
			for (@Pc(92) int local92 = 0; local92 < this.anIntArray557.length; local92++) {
				@Pc(99) int local99 = this.anIntArray556[local92];
				@Pc(106) int local106 = this.anIntArray556[local92 + 1];
				@Pc(113) int local113 = this.aShortArray136[local99] & 0xFFFF;
				if (local113 == 65535) {
					local113 = -1;
				}
				this.aClass5_Sub3_14.method6299(local59, local113, true);
				this.aClass5_Sub3_14.method6295(this.anIntArray557[local92], local106 - local99, this.anIntArray561[local92], local99 * 3, Static524.aClass87_7, this.aClass236_1.anInterface14_6);
			}
		}
		this.method5469();
	}

	@OriginalMember(owner = "client!oba", name = "Q", descriptor = "()Z")
	@Override
	protected boolean Q() {
		if (this.anIntArrayArray60 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6483; local12++) {
			this.anIntArray559[local12] <<= 0x4;
			this.anIntArray558[local12] <<= 0x4;
			this.anIntArray562[local12] <<= 0x4;
		}
		Static135.anInt2758 = 0;
		Static142.anInt2901 = 0;
		Static328.anInt6268 = 0;
		return true;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(B)V")
	private void method5469() {
		if (!this.aBoolean411) {
			return;
		}
		this.aBoolean411 = false;
		if (this.aClass83Array5 == null && this.aClass109Array5 == null && this.aClass191Array1 == null) {
			if (this.anIntArray559 != null && !Static51.method1078(this.anInt6489, this.anInt6477)) {
				if (this.aClass235_4 == null || this.aClass235_4.method5918()) {
					if (!this.aBoolean412) {
						this.method5477();
					}
					this.anIntArray559 = null;
				} else {
					this.aBoolean411 = true;
				}
			}
			if (this.anIntArray558 != null && !Static458.method6865(this.anInt6477, this.anInt6489)) {
				if (this.aClass235_4 == null || this.aClass235_4.method5918()) {
					if (!this.aBoolean412) {
						this.method5477();
					}
					this.anIntArray558 = null;
				} else {
					this.aBoolean411 = true;
				}
			}
			if (this.anIntArray562 != null && !Static45.method979(this.anInt6489, this.anInt6477)) {
				if (this.aClass235_4 == null || this.aClass235_4.method5918()) {
					if (!this.aBoolean412) {
						this.method5477();
					}
					this.anIntArray562 = null;
				} else {
					this.aBoolean411 = true;
				}
			}
		}
		if (this.aShortArray141 != null && this.anIntArray559 == null && this.anIntArray558 == null && this.anIntArray562 == null) {
			this.aShortArray141 = null;
			this.anIntArray560 = null;
		}
		if (this.aByteArray64 != null && !Static53.method1121(this.anInt6489, this.anInt6477)) {
			label197: {
				label196: {
					@Pc(159) boolean local159;
					if ((this.anInt6477 & 0x37) == 0) {
						if (this.aClass235_3 == null || this.aClass235_3.method5918()) {
							break label196;
						}
						local159 = false;
					} else {
						if (this.aClass235_1 == null || this.aClass235_1.method5918()) {
							break label196;
						}
						local159 = false;
					}
					if (!local159) {
						this.aBoolean411 = true;
						break label197;
					}
				}
				this.aByteArray64 = null;
				this.aShortArray134 = this.aShortArray133 = this.aShortArray139 = null;
			}
		}
		if (this.aShortArray142 != null && !Static66.method1332(this.anInt6489, this.anInt6477)) {
			if (this.aClass235_3 == null || this.aClass235_3.method5918()) {
				this.aShortArray142 = null;
			} else {
				this.aBoolean411 = true;
			}
		}
		if (this.aByteArray63 != null && !Static30.method2208(this.anInt6477, this.anInt6489)) {
			if (this.aClass235_3 == null || this.aClass235_3.method5918()) {
				this.aByteArray63 = null;
			} else {
				this.aBoolean411 = true;
			}
		}
		if (this.aFloatArray45 != null && !Static156.method3092(this.anInt6477, this.anInt6489)) {
			if (this.aClass235_2 == null || this.aClass235_2.method5918()) {
				this.aFloatArray45 = this.aFloatArray44 = null;
			} else {
				this.aBoolean411 = true;
			}
		}
		if (this.aShortArray136 != null && !Static536.method7664(this.anInt6477, this.anInt6489)) {
			if (this.aClass235_3 == null || this.aClass235_3.method5918()) {
				this.aShortArray136 = null;
			} else {
				this.aBoolean411 = true;
			}
		}
		if (this.aShortArray143 != null && !Static70.method612(this.anInt6477, this.anInt6489)) {
			if ((this.aClass236_1 == null || this.aClass236_1.method5923()) && (this.aClass235_3 == null || this.aClass235_3.method5918())) {
				this.aShortArray143 = this.aShortArray137 = this.aShortArray145 = null;
			} else {
				this.aBoolean411 = true;
			}
		}
		if (this.aShortArray135 != null) {
			if (this.aClass235_4 == null || this.aClass235_4.method5918()) {
				this.aShortArray135 = null;
			} else {
				this.aBoolean411 = true;
			}
		}
		if (this.aShortArray144 != null) {
			if (this.aClass235_3 == null || this.aClass235_3.method5918()) {
				this.aShortArray144 = null;
			} else {
				this.aBoolean411 = true;
			}
		}
		if (this.anIntArrayArray59 != null && !Static161.method3129(this.anInt6489, this.anInt6477)) {
			this.aShortArray140 = null;
			this.anIntArrayArray59 = null;
		}
		if (this.anIntArrayArray60 != null && !Static411.method6198(this.anInt6477, this.anInt6489)) {
			this.anIntArrayArray60 = null;
			this.aShortArray138 = null;
		}
		if (this.anIntArrayArray58 != null && !Static537.method7689(this.anInt6477, this.anInt6489)) {
			this.anIntArrayArray58 = null;
		}
		if (this.anIntArray556 != null && (this.anInt6489 & 0x800) == 0 && (this.anInt6489 & 0x40000) == 0) {
			this.anIntArray561 = null;
			this.anIntArray557 = null;
			this.anIntArray556 = null;
		}
	}

	@OriginalMember(owner = "client!oba", name = "m", descriptor = "(III)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6510; local7++) {
			if (arg0 != 0) {
				this.anIntArray559[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray558[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray562[local7] += arg2;
			}
		}
		this.method5474();
		this.aBoolean412 = false;
	}

	@OriginalMember(owner = "client!oba", name = "OA", descriptor = "(IILclient!d;Lclient!d;III)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class52 arg2, @OriginalArg(3) Class52 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean412) {
			this.method5477();
		}
		@Pc(16) int local16 = this.anInt6504 + arg4;
		@Pc(21) int local21 = arg4 + this.anInt6476;
		@Pc(26) int local26 = this.anInt6526 + arg6;
		@Pc(31) int local31 = arg6 + this.anInt6511;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9491 <= arg2.anInt9493 + local21 >> arg2.anInt9494 || local26 < 0 || local31 + arg2.anInt9493 >> arg2.anInt9494 >= arg2.anInt9492)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9491 <= arg3.anInt9493 + local21 >> arg3.anInt9494 || local26 < 0 || arg3.anInt9492 <= local31 + arg3.anInt9493 >> arg3.anInt9494) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9494;
			local21 = local21 + arg2.anInt9493 - 1 >> arg2.anInt9494;
			local26 >>= arg2.anInt9494;
			local31 = local31 + arg2.anInt9493 - 1 >> arg2.anInt9494;
			if (arg5 == arg2.JA(local16, local26) && arg2.JA(local21, local26) == arg5 && arg2.JA(local16, local31) == arg5 && arg5 == arg2.JA(local21, local31)) {
				return;
			}
		}
		@Pc(184) int local184;
		if (arg0 == 1) {
			for (local184 = 0; local184 < this.anInt6510; local184++) {
				this.anIntArray558[local184] = this.anIntArray558[local184] + arg2.sa(this.anIntArray559[local184] - -arg4, this.anIntArray562[local184] - -arg6) - arg5;
			}
		} else {
			@Pc(240) int local240;
			@Pc(305) int local305;
			if (arg0 == 2) {
				local184 = this.anInt6543;
				if (local184 == 0) {
					return;
				}
				for (local240 = 0; local240 < this.anInt6510; local240++) {
					local305 = (this.anIntArray558[local240] << 16) / local184;
					if (local305 < arg1) {
						this.anIntArray558[local240] -= -((arg2.sa(arg4 + this.anIntArray559[local240], arg6 + this.anIntArray562[local240]) - arg5) * (-local305 + arg1) / arg1);
					}
				}
			} else {
				@Pc(312) int local312;
				if (arg0 == 3) {
					local184 = (arg1 & 0xFF) * 4;
					local240 = (arg1 >> 8 & 0xFF) * 4;
					local305 = (arg1 >> 16 & 0xFF) << 6;
					local312 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local184 >> 1) < 0 || arg2.anInt9491 << arg2.anInt9494 <= arg4 + (local184 >> 1) + arg2.anInt9493 || arg6 - (local240 >> 1) < 0 || arg2.anInt9492 << arg2.anInt9494 <= arg2.anInt9493 + arg6 + (local240 >> 1)) {
						return;
					}
					this.method5787(arg2, local240, arg6, arg5, local305, local312, arg4, local184);
				} else if (arg0 == 4) {
					local184 = this.anInt6539 - this.anInt6543;
					for (local240 = 0; local240 < this.anInt6510; local240++) {
						this.anIntArray558[local240] = local184 + this.anIntArray558[local240] + arg3.sa(this.anIntArray559[local240] + arg4, this.anIntArray562[local240] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local184 = this.anInt6539 - this.anInt6543;
					for (local240 = 0; local240 < this.anInt6510; local240++) {
						local305 = arg4 + this.anIntArray559[local240];
						local312 = this.anIntArray562[local240] + arg6;
						@Pc(317) int local317 = arg2.sa(local305, local312);
						@Pc(322) int local322 = arg3.sa(local305, local312);
						@Pc(327) int local327 = local317 - local322;
						this.anIntArray558[local240] = local317 + ((this.anIntArray558[local240] << 8) / local184 * local327 >> 8) - arg5;
					}
				}
			}
		}
		this.method5474();
		this.aBoolean412 = false;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "(B)V")
	private void method5470() {
		if (this.aClass191Array1 == null) {
			return;
		}
		@Pc(16) float local16 = this.aClass5_Sub3_14.method6399();
		@Pc(20) float local20 = this.aClass5_Sub3_14.method6384();
		this.aClass5_Sub3_14.method7412(false);
		this.aClass5_Sub3_14.method6349(false);
		this.aClass5_Sub3_14.method6415(Static144.aClass166_2, 1);
		this.aClass5_Sub3_14.method6314(Static144.aClass166_2, 1);
		for (@Pc(43) int local43 = 0; local43 < this.anInt6516; local43++) {
			@Pc(50) Class191 local50 = this.aClass191Array1[local43];
			@Pc(55) Class17 local55 = this.aClass17Array1[local43];
			if (!local50.aBoolean386 || !this.aClass5_Sub3_14.method7441()) {
				@Pc(83) float local83 = (float) (this.anIntArray559[local50.anInt5956] + this.anIntArray559[local50.anInt5958] + this.anIntArray559[local50.anInt5952]) * 0.3333333F;
				@Pc(105) float local105 = (float) (this.anIntArray558[local50.anInt5956] + this.anIntArray558[local50.anInt5952] + this.anIntArray558[local50.anInt5958]) * 0.3333333F;
				@Pc(126) float local126 = (float) (this.anIntArray562[local50.anInt5956] + this.anIntArray562[local50.anInt5958] + this.anIntArray562[local50.anInt5952]) * 0.3333333F;
				@Pc(140) float local140 = Static522.aFloat264 + local126 * Static66.aFloat49 + local83 * Static248.aFloat156 + Static40.aFloat40 * local105;
				@Pc(154) float local154 = Static446.aFloat242 + Static469.aFloat248 * local105 + local83 * Static222.aFloat153 + local126 * Static475.aFloat250;
				@Pc(168) float local168 = Static338.aFloat196 * local126 + Static486.aFloat237 * local83 + Static203.aFloat148 * local105 + Static377.aFloat207;
				@Pc(173) Class205_Sub1 local173 = this.aClass5_Sub3_14.method6297();
				local173.method5235(local140 + (float) local55.anInt644, local168, local55.anInt636 * local50.aShort88 >> 7, local55.anInt641, local55.anInt639 * local50.aShort86 >> 7, (float) local55.anInt635 + local154);
				local173.method5223(this.aClass5_Sub3_14.aClass205_Sub1_17);
				this.aClass5_Sub3_14.method6392();
				this.aClass5_Sub3_14.ka(local20, local16 - (float) local50.anInt5959 * 1.5F);
				@Pc(228) int local228 = local55.anInt645;
				this.aClass5_Sub3_14.method6299(false, local50.aShort87, false);
				this.aClass5_Sub3_14.method6398(local50.aByte49);
				this.aClass5_Sub3_14.method6363(local228);
				this.aClass5_Sub3_14.method6342();
			}
		}
		this.aClass5_Sub3_14.method6314(Static28.aClass166_1, 1);
		this.aClass5_Sub3_14.method6415(Static28.aClass166_1, 1);
		this.aClass5_Sub3_14.ka(local20, local16);
		this.aClass5_Sub3_14.method7412(true);
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IILclient!q;Z)Z")
	@Override
	public boolean method5786(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) Class205_Sub1 local8 = (Class205_Sub1) arg2;
		@Pc(12) Class205_Sub1 local12 = this.aClass5_Sub3_14.aClass205_Sub1_16;
		@Pc(33) float local33 = local8.aFloat188 * local12.aFloat192 + local8.aFloat191 * local12.aFloat181 + local8.aFloat184 * local12.aFloat185 + local12.aFloat188;
		@Pc(54) float local54 = local8.aFloat188 * local12.aFloat186 + local8.aFloat191 * local12.aFloat189 + local12.aFloat190 * local8.aFloat184 + local12.aFloat191;
		Static203.aFloat148 = local8.aFloat187 * local12.aFloat182 + local8.aFloat189 * local12.aFloat187 + local8.aFloat181 * local12.aFloat183;
		Static40.aFloat40 = local8.aFloat189 * local12.aFloat181 + local8.aFloat181 * local12.aFloat192 + local12.aFloat185 * local8.aFloat187;
		Static469.aFloat248 = local12.aFloat189 * local8.aFloat189 + local8.aFloat181 * local12.aFloat186 + local12.aFloat190 * local8.aFloat187;
		Static222.aFloat153 = local12.aFloat189 * local8.aFloat186 + local8.aFloat192 * local12.aFloat186 + local12.aFloat190 * local8.aFloat183;
		Static338.aFloat196 = local12.aFloat187 * local8.aFloat190 + local8.aFloat185 * local12.aFloat183 + local12.aFloat182 * local8.aFloat182;
		@Pc(165) float local165 = local12.aFloat182 * local8.aFloat184 + local8.aFloat191 * local12.aFloat187 + local12.aFloat183 * local8.aFloat188 + local12.aFloat184;
		Static475.aFloat250 = local12.aFloat189 * local8.aFloat190 + local12.aFloat186 * local8.aFloat185 + local12.aFloat190 * local8.aFloat182;
		Static486.aFloat237 = local12.aFloat182 * local8.aFloat183 + local12.aFloat183 * local8.aFloat192 + local8.aFloat186 * local12.aFloat187;
		Static66.aFloat49 = local12.aFloat185 * local8.aFloat182 + local8.aFloat185 * local12.aFloat192 + local8.aFloat190 * local12.aFloat181;
		Static248.aFloat156 = local12.aFloat181 * local8.aFloat186 + local12.aFloat192 * local8.aFloat192 + local12.aFloat185 * local8.aFloat183;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass5_Sub3_14.anInt7755;
		@Pc(255) int local255 = this.aClass5_Sub3_14.anInt7758;
		if (!this.aBoolean412) {
			this.method5477();
		}
		Static140.anIntArray280[0] = this.anInt6504;
		Static81.anIntArray202[0] = this.anInt6543;
		Static324.anIntArray544[0] = this.anInt6526;
		Static140.anIntArray280[1] = this.anInt6476;
		Static81.anIntArray202[1] = this.anInt6543;
		Static140.anIntArray280[2] = this.anInt6504;
		Static324.anIntArray544[1] = this.anInt6526;
		Static81.anIntArray202[2] = this.anInt6539;
		Static140.anIntArray280[3] = this.anInt6476;
		Static324.anIntArray544[2] = this.anInt6526;
		Static81.anIntArray202[3] = this.anInt6539;
		Static140.anIntArray280[4] = this.anInt6504;
		Static324.anIntArray544[3] = this.anInt6526;
		Static81.anIntArray202[4] = this.anInt6543;
		Static140.anIntArray280[5] = this.anInt6476;
		Static324.anIntArray544[4] = this.anInt6511;
		Static81.anIntArray202[5] = this.anInt6543;
		Static324.anIntArray544[5] = this.anInt6511;
		Static140.anIntArray280[6] = this.anInt6504;
		Static81.anIntArray202[6] = this.anInt6539;
		Static140.anIntArray280[7] = this.anInt6476;
		Static324.anIntArray544[6] = this.anInt6511;
		Static81.anIntArray202[7] = this.anInt6539;
		Static324.anIntArray544[7] = this.anInt6511;
		@Pc(414) float local414;
		@Pc(428) float local428;
		@Pc(442) float local442;
		@Pc(390) float local390;
		@Pc(400) float local400;
		@Pc(395) float local395;
		for (@Pc(383) int local383 = 0; local383 < 8; local383++) {
			local390 = Static140.anIntArray280[local383];
			local395 = Static324.anIntArray544[local383];
			local400 = Static81.anIntArray202[local383];
			local414 = Static248.aFloat156 * local390 + Static40.aFloat40 * local400 + local395 * Static66.aFloat49 + local33;
			local428 = local400 * Static469.aFloat248 + Static222.aFloat153 * local390 + Static475.aFloat250 * local395 + local54;
			local442 = local165 + Static338.aFloat196 * local395 + local390 * Static486.aFloat237 + local400 * Static203.aFloat148;
			if (local442 >= (float) this.aClass5_Sub3_14.anInt7778) {
				@Pc(461) float local461 = (float) local251 * local414 / local442 + (float) this.aClass5_Sub3_14.anInt7781;
				if (local461 > local243) {
					local243 = local461;
				}
				if (local461 < local241) {
					local241 = local461;
				}
				@Pc(485) float local485 = (float) this.aClass5_Sub3_14.anInt7776 + (float) local255 * local428 / local442;
				if (local485 > local247) {
					local247 = local485;
				}
				local239 = true;
				if (local485 < local245) {
					local245 = local485;
				}
			}
		}
		if (local239 && (float) arg0 > local241 && local243 > (float) arg0 && (float) arg1 > local245 && local247 > (float) arg1) {
			if (arg3) {
				return true;
			}
			if (Static195.anIntArray409.length < this.anInt6495) {
				Static288.anIntArray521 = new int[this.anInt6495];
				Static195.anIntArray409 = new int[this.anInt6495];
			}
			@Pc(618) int local618;
			for (@Pc(544) int local544 = 0; local544 < this.anInt6510; local544++) {
				local390 = this.anIntArray559[local544];
				local395 = this.anIntArray562[local544];
				local400 = this.anIntArray558[local544];
				local442 = local165 + local395 * Static338.aFloat196 + Static203.aFloat148 * local400 + local390 * Static486.aFloat237;
				local414 = Static66.aFloat49 * local395 + Static248.aFloat156 * local390 + Static40.aFloat40 * local400 + local33;
				local428 = local54 + Static222.aFloat153 * local390 + local400 * Static469.aFloat248 + Static475.aFloat250 * local395;
				@Pc(625) int local625;
				@Pc(627) int local627;
				@Pc(636) int local636;
				if (local442 >= (float) this.aClass5_Sub3_14.anInt7778) {
					local618 = (int) ((float) this.aClass5_Sub3_14.anInt7781 + local414 * (float) local251 / local442);
					local625 = (int) (local428 * (float) local255 / local442 + (float) this.aClass5_Sub3_14.anInt7776);
					local627 = this.anIntArray560[local544];
					local636 = this.anIntArray560[local544 + 1];
					for (@Pc(695) int local695 = local627; local695 < local636; local695++) {
						@Pc(704) int local704 = this.aShortArray141[local695] - 1;
						if (local704 == -1) {
							break;
						}
						Static195.anIntArray409[local704] = local618;
						Static288.anIntArray521[local704] = local625;
					}
				} else {
					local618 = this.anIntArray560[local544];
					local625 = this.anIntArray560[local544 + 1];
					for (local627 = local618; local627 < local625; local627++) {
						local636 = this.aShortArray141[local627] - 1;
						if (local636 == -1) {
							break;
						}
						Static195.anIntArray409[this.aShortArray141[local627] - 1] = -999999;
					}
				}
			}
			for (local618 = 0; local618 < this.anInt6502; local618++) {
				if (Static195.anIntArray409[this.aShortArray143[local618]] != -999999 && Static195.anIntArray409[this.aShortArray137[local618]] != -999999 && Static195.anIntArray409[this.aShortArray145[local618]] != -999999 && this.method5471(Static288.anIntArray521[this.aShortArray143[local618]], Static195.anIntArray409[this.aShortArray143[local618]], arg0, arg1, Static288.anIntArray521[this.aShortArray137[local618]], Static195.anIntArray409[this.aShortArray137[local618]], Static195.anIntArray409[this.aShortArray145[local618]], Static288.anIntArray521[this.aShortArray145[local618]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > arg3 && arg3 < arg4 && arg7 > arg3) {
			return false;
		} else if (arg3 > arg0 && arg4 < arg3 && arg7 < arg3) {
			return false;
		} else if (arg2 < arg1 && arg2 < arg5 && arg6 > arg2) {
			return false;
		} else {
			return arg1 >= arg2 || arg2 <= arg5 || arg2 <= arg6;
		}
	}

	@OriginalMember(owner = "client!oba", name = "M", descriptor = "()I")
	@Override
	public int M() {
		if (!this.aBoolean412) {
			this.method5477();
		}
		return this.anInt6476;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "()[Lclient!fca;")
	@Override
	public Class83[] method5778() {
		return this.aClass83Array5;
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method5770(@OriginalArg(0) Class205 arg0) {
		@Pc(8) Class205_Sub1 local8 = (Class205_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass83Array5 != null) {
			for (local13 = 0; local13 < this.aClass83Array5.length; local13++) {
				@Pc(20) Class83 local20 = this.aClass83Array5[local13];
				@Pc(22) Class83 local22 = local20;
				if (local20.aClass83_1 != null) {
					local22 = local20.aClass83_1;
				}
				local22.anInt2691 = (int) (local8.aFloat188 + local8.aFloat185 * (float) this.anIntArray562[local20.anInt2680] + local8.aFloat181 * (float) this.anIntArray558[local20.anInt2680] + local8.aFloat192 * (float) this.anIntArray559[local20.anInt2680]);
				local22.anInt2684 = (int) (local8.aFloat191 + local8.aFloat186 * (float) this.anIntArray559[local20.anInt2680] + (float) this.anIntArray558[local20.anInt2680] * local8.aFloat189 + (float) this.anIntArray562[local20.anInt2680] * local8.aFloat190);
				local22.anInt2682 = (int) (local8.aFloat187 * (float) this.anIntArray558[local20.anInt2680] + local8.aFloat183 * (float) this.anIntArray559[local20.anInt2680] + (float) this.anIntArray562[local20.anInt2680] * local8.aFloat182 + local8.aFloat184);
				local22.anInt2686 = (int) ((float) this.anIntArray558[local20.anInt2681] * local8.aFloat181 + local8.aFloat192 * (float) this.anIntArray559[local20.anInt2681] + (float) this.anIntArray562[local20.anInt2681] * local8.aFloat185 + local8.aFloat188);
				local22.anInt2690 = (int) (local8.aFloat191 + local8.aFloat186 * (float) this.anIntArray559[local20.anInt2681] + (float) this.anIntArray558[local20.anInt2681] * local8.aFloat189 + local8.aFloat190 * (float) this.anIntArray562[local20.anInt2681]);
				local22.anInt2683 = (int) (local8.aFloat184 + (float) this.anIntArray562[local20.anInt2681] * local8.aFloat182 + (float) this.anIntArray558[local20.anInt2681] * local8.aFloat187 + (float) this.anIntArray559[local20.anInt2681] * local8.aFloat183);
				local22.anInt2689 = (int) ((float) this.anIntArray562[local20.anInt2687] * local8.aFloat185 + (float) this.anIntArray559[local20.anInt2687] * local8.aFloat192 + (float) this.anIntArray558[local20.anInt2687] * local8.aFloat181 + local8.aFloat188);
				local22.anInt2676 = (int) (local8.aFloat191 + local8.aFloat190 * (float) this.anIntArray562[local20.anInt2687] + (float) this.anIntArray558[local20.anInt2687] * local8.aFloat189 + local8.aFloat186 * (float) this.anIntArray559[local20.anInt2687]);
				local22.anInt2677 = (int) ((float) this.anIntArray559[local20.anInt2687] * local8.aFloat183 + (float) this.anIntArray558[local20.anInt2687] * local8.aFloat187 + (float) this.anIntArray562[local20.anInt2687] * local8.aFloat182 + local8.aFloat184);
			}
		}
		if (this.aClass109Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass109Array5.length; local13++) {
			@Pc(361) Class109 local361 = this.aClass109Array5[local13];
			@Pc(363) Class109 local363 = local361;
			if (local361.aClass109_1 != null) {
				local363 = local361.aClass109_1;
			}
			if (local361.aClass205_4 == null) {
				local361.aClass205_4 = local8.method7801();
			} else {
				local361.aClass205_4.la(local8);
			}
			local363.anInt3778 = (int) (local8.aFloat188 + local8.aFloat185 * (float) this.anIntArray562[local361.anInt3776] + (float) this.anIntArray558[local361.anInt3776] * local8.aFloat181 + (float) this.anIntArray559[local361.anInt3776] * local8.aFloat192);
			local363.anInt3780 = (int) ((float) this.anIntArray558[local361.anInt3776] * local8.aFloat189 + local8.aFloat186 * (float) this.anIntArray559[local361.anInt3776] + (float) this.anIntArray562[local361.anInt3776] * local8.aFloat190 + local8.aFloat191);
			local363.anInt3779 = (int) ((float) this.anIntArray559[local361.anInt3776] * local8.aFloat183 + (float) this.anIntArray558[local361.anInt3776] * local8.aFloat187 + (float) this.anIntArray562[local361.anInt3776] * local8.aFloat182 + local8.aFloat184);
		}
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "()Z")
	@Override
	public boolean method5788() {
		if (this.aShortArray136 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray136.length; local12++) {
			if (this.aShortArray136[local12] != -1 && !this.aClass5_Sub3_14.anInterface4_14.method6708(this.aShortArray136[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!oba", name = "P", descriptor = "()V")
	@Override
	public void P() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6510; local7++) {
			this.anIntArray562[local7] = -this.anIntArray562[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt6495; local29++) {
			this.aShortArray139[local29] = (short) -this.aShortArray139[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt6502; local52++) {
			@Pc(59) short local59 = this.aShortArray143[local52];
			this.aShortArray143[local52] = this.aShortArray145[local52];
			this.aShortArray145[local52] = local59;
		}
		this.method5474();
		this.method5464();
		this.method5475();
		this.aBoolean412 = false;
	}

	@OriginalMember(owner = "client!oba", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		if (!this.aBoolean412) {
			this.method5477();
		}
		return this.anInt6543;
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(I)V")
	private void method5472() {
		if (this.aClass235_3 != null) {
			this.aClass235_3.aBoolean456 = false;
		}
	}

	@OriginalMember(owner = "client!oba", name = "F", descriptor = "()I")
	@Override
	public int F() {
		return this.aShort97;
	}

	@OriginalMember(owner = "client!oba", name = "I", descriptor = "(I)V")
	@Override
	public void I(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5.anIntArray761[arg0];
		@Pc(13) int local13 = Class5.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6510; local15++) {
			@Pc(34) int local34 = this.anIntArray562[local15] * local9 + local13 * this.anIntArray559[local15] >> 14;
			this.anIntArray562[local15] = local13 * this.anIntArray562[local15] - local9 * this.anIntArray559[local15] >> 14;
			this.anIntArray559[local15] = local34;
		}
		this.method5474();
		this.aBoolean412 = false;
	}

	@OriginalMember(owner = "client!oba", name = "ha", descriptor = "()I")
	@Override
	public int ha() {
		if (!this.aBoolean412) {
			this.method5477();
		}
		return this.anInt6504;
	}

	@OriginalMember(owner = "client!oba", name = "Y", descriptor = "()V")
	@Override
	protected void Y() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6483; local7++) {
			this.anIntArray559[local7] = this.anIntArray559[local7] + 7 >> 4;
			this.anIntArray558[local7] = this.anIntArray558[local7] + 7 >> 4;
			this.anIntArray562[local7] = this.anIntArray562[local7] + 7 >> 4;
		}
		this.method5474();
		this.aBoolean412 = false;
	}

	@OriginalMember(owner = "client!oba", name = "c", descriptor = "(B)V")
	private void method5474() {
		if (this.aClass235_4 != null) {
			this.aClass235_4.aBoolean456 = false;
		}
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "(I)V")
	private void method5475() {
		if (this.aClass236_1 != null) {
			this.aClass236_1.aBoolean459 = false;
		}
	}

	@OriginalMember(owner = "client!oba", name = "AA", descriptor = "(I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5.anIntArray761[arg0];
		@Pc(13) int local13 = Class5.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6510; local15++) {
			@Pc(34) int local34 = this.anIntArray558[local15] * local13 - local9 * this.anIntArray562[local15] >> 14;
			this.anIntArray562[local15] = this.anIntArray562[local15] * local13 + local9 * this.anIntArray558[local15] >> 14;
			this.anIntArray558[local15] = local34;
		}
		this.method5474();
		this.aBoolean412 = false;
	}

	@OriginalMember(owner = "client!oba", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		if (!this.aBoolean412) {
			this.method5477();
		}
		return this.anInt6518;
	}

	@OriginalMember(owner = "client!oba", name = "l", descriptor = "(III)V")
	@Override
	public void l(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6510; local7++) {
			if (arg0 != 128) {
				this.anIntArray559[local7] = this.anIntArray559[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray558[local7] = this.anIntArray558[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray562[local7] = this.anIntArray562[local7] * arg2 >> 7;
			}
		}
		this.method5474();
		this.aBoolean412 = false;
	}

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "()V")
	@Override
	public void method5785() {
		if (this.anInt6495 > 0 && this.anInt6499 > 0) {
			this.method5467();
			this.method5466();
			this.method5469();
		}
	}

	@OriginalMember(owner = "client!oba", name = "da", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void da(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static135.anInt2758 = 0;
			local26 = 0;
			Static142.anInt2901 = 0;
			Static328.anInt6268 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray60.length) {
					local52 = this.anIntArrayArray60[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray138 == null || (arg6 & this.aShortArray138[local60]) != 0) {
							Static135.anInt2758 += this.anIntArray559[local60];
							Static328.anInt6268 += this.anIntArray558[local60];
							local26++;
							Static142.anInt2901 += this.anIntArray562[local60];
						}
					}
				}
			}
			if (local26 <= 0) {
				Static135.anInt2758 = arg2;
				Static142.anInt2901 = arg4;
				Static328.anInt6268 = arg3;
			} else {
				Static135.anInt2758 = Static135.anInt2758 / local26 + arg2;
				Static142.anInt2901 = arg4 + Static142.anInt2901 / local26;
				Static250.aBoolean350 = true;
				Static328.anInt6268 = Static328.anInt6268 / local26 + arg3;
			}
			return;
		}
		@Pc(257) int[] local257;
		@Pc(259) int local259;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg7[1] * arg3 + arg2 * arg7[0] + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg4 * arg7[5] + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
				local38 = arg7[8] * arg4 + arg3 * arg7[7] + arg7[6] * arg2 + 8192 >> 14;
				arg2 = local26;
				arg3 = local32;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray60.length > local32) {
					local257 = this.anIntArrayArray60[local32];
					for (local259 = 0; local259 < local257.length; local259++) {
						local54 = local257[local259];
						if (this.aShortArray138 == null || (this.aShortArray138[local54] & arg6) != 0) {
							this.anIntArray559[local54] += arg2;
							this.anIntArray558[local54] += arg3;
							this.anIntArray562[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(395) int local395;
		@Pc(413) int local413;
		@Pc(646) int local646;
		@Pc(655) int local655;
		@Pc(667) int local667;
		@Pc(671) int local671;
		@Pc(690) int local690;
		@Pc(1025) int local1025;
		@Pc(1033) int local1033;
		@Pc(1188) int local1188;
		@Pc(1213) int local1213;
		@Pc(1218) int local1218;
		@Pc(1226) int local1226;
		@Pc(1231) int local1231;
		@Pc(1235) int local1235;
		@Pc(1239) int local1239;
		@Pc(1241) int local1241;
		@Pc(1372) int[] local1372;
		@Pc(1374) int local1374;
		@Pc(1378) int local1378;
		@Pc(1382) int local1382;
		@Pc(1384) int local1384;
		@Pc(1512) int local1512;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray60.length) {
						local257 = this.anIntArrayArray60[local32];
						for (local259 = 0; local259 < local257.length; local259++) {
							local54 = local257[local259];
							if (this.aShortArray138 == null || (arg6 & this.aShortArray138[local54]) != 0) {
								this.anIntArray559[local54] -= Static135.anInt2758;
								this.anIntArray558[local54] -= Static328.anInt6268;
								this.anIntArray562[local54] -= Static142.anInt2901;
								if (arg4 != 0) {
									local60 = Class5.anIntArray761[arg4];
									local395 = Class5.anIntArray760[arg4];
									local413 = this.anIntArray559[local54] * local395 + this.anIntArray558[local54] * local60 + 16383 >> 14;
									this.anIntArray558[local54] = this.anIntArray558[local54] * local395 + 16383 - this.anIntArray559[local54] * local60 >> 14;
									this.anIntArray559[local54] = local413;
								}
								if (arg2 != 0) {
									local60 = Class5.anIntArray761[arg2];
									local395 = Class5.anIntArray760[arg2];
									local413 = this.anIntArray558[local54] * local395 + 16383 - local60 * this.anIntArray562[local54] >> 14;
									this.anIntArray562[local54] = this.anIntArray558[local54] * local60 + this.anIntArray562[local54] * local395 + 16383 >> 14;
									this.anIntArray558[local54] = local413;
								}
								if (arg3 != 0) {
									local60 = Class5.anIntArray761[arg3];
									local395 = Class5.anIntArray760[arg3];
									local413 = this.anIntArray559[local54] * local395 + this.anIntArray562[local54] * local60 + 16383 >> 14;
									this.anIntArray562[local54] = this.anIntArray562[local54] * local395 + 16383 - local60 * this.anIntArray559[local54] >> 14;
									this.anIntArray559[local54] = local413;
								}
								this.anIntArray559[local54] += Static135.anInt2758;
								this.anIntArray558[local54] += Static328.anInt6268;
								this.anIntArray562[local54] += Static142.anInt2901;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray60.length) {
							local52 = this.anIntArrayArray60[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray138 == null || (this.aShortArray138[local60] & arg6) != 0) {
									local395 = this.anIntArray560[local60];
									local413 = this.anIntArray560[local60 + 1];
									for (local646 = local395; local646 < local413; local646++) {
										local655 = this.aShortArray141[local646] - 1;
										if (local655 == -1) {
											break;
										}
										if (arg4 != 0) {
											local667 = Class5.anIntArray761[arg4];
											local671 = Class5.anIntArray760[arg4];
											local690 = local667 * this.aShortArray133[local655] + this.aShortArray134[local655] * local671 + 16383 >> 14;
											this.aShortArray133[local655] = (short) (this.aShortArray133[local655] * local671 + 16383 - this.aShortArray134[local655] * local667 >> 14);
											this.aShortArray134[local655] = (short) local690;
										}
										if (arg2 != 0) {
											local667 = Class5.anIntArray761[arg2];
											local671 = Class5.anIntArray760[arg2];
											local690 = local671 * this.aShortArray133[local655] + 16383 - local667 * this.aShortArray139[local655] >> 14;
											this.aShortArray139[local655] = (short) (this.aShortArray133[local655] * local667 + this.aShortArray139[local655] * local671 + 16383 >> 14);
											this.aShortArray133[local655] = (short) local690;
										}
										if (arg3 != 0) {
											local667 = Class5.anIntArray761[arg3];
											local671 = Class5.anIntArray760[arg3];
											local690 = this.aShortArray134[local655] * local671 + local667 * this.aShortArray139[local655] + 16383 >> 14;
											this.aShortArray139[local655] = (short) (this.aShortArray139[local655] * local671 + 16383 - this.aShortArray134[local655] * local667 >> 14);
											this.aShortArray134[local655] = (short) local690;
										}
									}
								}
							}
						}
					}
					this.method5464();
					return;
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local259 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static250.aBoolean350) {
					local395 = Static142.anInt2901 * arg7[6] + Static328.anInt6268 * arg7[3] + Static135.anInt2758 * arg7[0] + 8192 >> 14;
					local413 = Static135.anInt2758 * arg7[1] + Static328.anInt6268 * arg7[4] + arg7[7] * Static142.anInt2901 + 8192 >> 14;
					local395 += local259;
					local413 += local54;
					local646 = arg7[5] * Static328.anInt6268 + arg7[2] * Static135.anInt2758 + Static142.anInt2901 * arg7[8] + 8192 >> 14;
					Static135.anInt2758 = local395;
					Static328.anInt6268 = local413;
					local646 += local60;
					Static142.anInt2901 = local646;
					Static250.aBoolean350 = false;
				}
				@Pc(993) int[] local993 = new int[9];
				local413 = Class5.anIntArray760[arg2];
				local646 = Class5.anIntArray761[arg2];
				local655 = Class5.anIntArray760[arg3];
				local667 = Class5.anIntArray761[arg3];
				local671 = Class5.anIntArray760[arg4];
				local690 = Class5.anIntArray761[arg4];
				local1025 = local671 * local646 + 8192 >> 14;
				local1033 = local690 * local646 + 8192 >> 14;
				local993[2] = local667 * local413 + 8192 >> 14;
				local993[5] = -local646;
				local993[6] = -local667 * local671 + local1033 * local655 + 8192 >> 14;
				local993[3] = local690 * local413 + 8192 >> 14;
				local993[7] = local667 * local690 + local655 * local1025 + 8192 >> 14;
				local993[0] = local1033 * local667 + local655 * local671 + 8192 >> 14;
				local993[1] = local1025 * local667 + -local655 * local690 + 8192 >> 14;
				local993[4] = local671 * local413 + 8192 >> 14;
				local993[8] = local655 * local413 + 8192 >> 14;
				@Pc(1162) int local1162 = -Static142.anInt2901 * local993[2] + -Static328.anInt6268 * local993[1] + -Static135.anInt2758 * local993[0] + 8192 >> 14;
				local1188 = local993[4] * -Static328.anInt6268 + local993[3] * -Static135.anInt2758 + local993[5] * -Static142.anInt2901 + 8192 >> 14;
				local1213 = local993[8] * -Static142.anInt2901 + -Static135.anInt2758 * local993[6] + -Static328.anInt6268 * local993[7] + 8192 >> 14;
				local1218 = local1162 + Static135.anInt2758;
				@Pc(1222) int local1222 = local1188 + Static328.anInt6268;
				local1226 = Static142.anInt2901 + local1213;
				@Pc(1229) int[] local1229 = new int[9];
				for (local1231 = 0; local1231 < 3; local1231++) {
					for (local1235 = 0; local1235 < 3; local1235++) {
						local1239 = 0;
						for (local1241 = 0; local1241 < 3; local1241++) {
							local1239 += local993[local1231 * 3 + local1241] * arg7[local1241 + local1235 * 3];
						}
						local1229[local1231 * 3 + local1235] = local1239 + 8192 >> 14;
					}
				}
				local1235 = local60 * local993[2] + local259 * local993[0] + local54 * local993[1] + 8192 >> 14;
				local1239 = local60 * local993[5] + local993[4] * local54 + local993[3] * local259 + 8192 >> 14;
				local1239 += local1222;
				local1241 = local993[8] * local60 + local993[7] * local54 + local993[6] * local259 + 8192 >> 14;
				local1235 += local1218;
				local1241 += local1226;
				local1372 = new int[9];
				for (local1374 = 0; local1374 < 3; local1374++) {
					for (local1378 = 0; local1378 < 3; local1378++) {
						local1382 = 0;
						for (local1384 = 0; local1384 < 3; local1384++) {
							local1382 += local1229[local1378 + local1384 * 3] * arg7[local1384 + local1374 * 3];
						}
						local1372[local1378 + local1374 * 3] = local1382 + 8192 >> 14;
					}
				}
				local1378 = local1235 * arg7[0] + arg7[1] * local1239 + local1241 * arg7[2] + 8192 >> 14;
				local1382 = local1241 * arg7[5] + local1239 * arg7[4] + local1235 * arg7[3] + 8192 >> 14;
				local1382 += local32;
				local1378 += local26;
				local1384 = arg7[8] * local1241 + arg7[6] * local1235 + arg7[7] * local1239 + 8192 >> 14;
				local1384 += local38;
				for (local1512 = 0; local1512 < local8; local1512++) {
					@Pc(1518) int local1518 = arg1[local1512];
					if (local1518 < this.anIntArrayArray60.length) {
						@Pc(1532) int[] local1532 = this.anIntArrayArray60[local1518];
						for (@Pc(1534) int local1534 = 0; local1534 < local1532.length; local1534++) {
							@Pc(1540) int local1540 = local1532[local1534];
							if (this.aShortArray138 == null || (this.aShortArray138[local1540] & arg6) != 0) {
								@Pc(1584) int local1584 = this.anIntArray562[local1540] * local1372[2] + local1372[0] * this.anIntArray559[local1540] + this.anIntArray558[local1540] * local1372[1] + 8192 >> 14;
								@Pc(1615) int local1615 = this.anIntArray562[local1540] * local1372[5] + local1372[4] * this.anIntArray558[local1540] + local1372[3] * this.anIntArray559[local1540] + 8192 >> 14;
								@Pc(1646) int local1646 = local1372[8] * this.anIntArray562[local1540] + local1372[7] * this.anIntArray558[local1540] + local1372[6] * this.anIntArray559[local1540] + 8192 >> 14;
								@Pc(1650) int local1650 = local1615 + local1382;
								@Pc(1654) int local1654 = local1584 + local1378;
								@Pc(1658) int local1658 = local1646 + local1384;
								this.anIntArray559[local1540] = local1654;
								this.anIntArray558[local1540] = local1650;
								this.anIntArray562[local1540] = local1658;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2591) Class17 local2591;
			@Pc(2487) boolean local2487;
			@Pc(2586) Class191 local2586;
			if (arg0 == 5) {
				if (this.anIntArrayArray59 != null) {
					local2487 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray59.length > local38) {
							local52 = this.anIntArrayArray59[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray140 == null || (this.aShortArray140[local60] & arg6) != 0) {
									local395 = (this.aByteArray63[local60] & 0xFF) + (arg2 * 8);
									if (local395 < 0) {
										local395 = 0;
									} else if (local395 > 255) {
										local395 = 255;
									}
									this.aByteArray63[local60] = (byte) local395;
								}
							}
							local2487 |= local52.length > 0;
						}
					}
					if (local2487) {
						if (this.aClass191Array1 != null) {
							for (local38 = 0; local38 < this.anInt6516; local38++) {
								local2586 = this.aClass191Array1[local38];
								local2591 = this.aClass17Array1[local38];
								local2591.anInt645 = 255 - (this.aByteArray63[local2586.anInt5951] & 0xFF) << 24 | local2591.anInt645 & 0xFFFFFF;
							}
						}
						this.method5472();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray59 != null) {
					local2487 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray59.length > local38) {
							local52 = this.anIntArrayArray59[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray140 == null || (arg6 & this.aShortArray140[local60]) != 0) {
									local395 = this.aShortArray142[local60] & 0xFFFF;
									local413 = local395 >> 10 & 0x3F;
									local646 = local395 >> 7 & 0x7;
									local646 += arg3 / 4;
									local655 = local395 & 0x7F;
									@Pc(2705) int local2705 = local413 + arg2 & 0x3F;
									local655 += arg4;
									if (local646 < 0) {
										local646 = 0;
									} else if (local646 > 7) {
										local646 = 7;
									}
									if (local655 < 0) {
										local655 = 0;
									} else if (local655 > 127) {
										local655 = 127;
									}
									this.aShortArray142[local60] = (short) (local2705 << 10 | local646 << 7 | local655);
								}
							}
							local2487 |= local52.length > 0;
						}
					}
					if (local2487) {
						if (this.aClass191Array1 != null) {
							for (local38 = 0; local38 < this.anInt6516; local38++) {
								local2586 = this.aClass191Array1[local38];
								local2591 = this.aClass17Array1[local38];
								local2591.anInt645 = Static393.anIntArray638[this.aShortArray142[local2586.anInt5951] & 0xFFFF] & 0xFFFFFF | local2591.anInt645 & 0xFF000000;
							}
						}
						this.method5472();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray58 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray58.length > local32) {
							local257 = this.anIntArrayArray58[local32];
							for (local259 = 0; local259 < local257.length; local259++) {
								local2591 = this.aClass17Array1[local257[local259]];
								local2591.anInt644 += arg2;
								local2591.anInt635 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray58 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray58.length > local32) {
							local257 = this.anIntArrayArray58[local32];
							for (local259 = 0; local259 < local257.length; local259++) {
								local2591 = this.aClass17Array1[local257[local259]];
								local2591.anInt636 = arg3 * local2591.anInt636 >> 7;
								local2591.anInt639 = arg2 * local2591.anInt639 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray58 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray58.length > local32) {
						local257 = this.anIntArrayArray58[local32];
						for (local259 = 0; local259 < local257.length; local259++) {
							local2591 = this.aClass17Array1[local257[local259]];
							local2591.anInt641 = arg2 + local2591.anInt641 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray60.length) {
					local257 = this.anIntArrayArray60[local32];
					for (local259 = 0; local259 < local257.length; local259++) {
						local54 = local257[local259];
						if (this.aShortArray138 == null || (this.aShortArray138[local54] & arg6) != 0) {
							this.anIntArray559[local54] -= Static135.anInt2758;
							this.anIntArray558[local54] -= Static328.anInt6268;
							this.anIntArray562[local54] -= Static142.anInt2901;
							this.anIntArray559[local54] = arg2 * this.anIntArray559[local54] >> 7;
							this.anIntArray558[local54] = this.anIntArray558[local54] * arg3 >> 7;
							this.anIntArray562[local54] = arg4 * this.anIntArray562[local54] >> 7;
							this.anIntArray559[local54] += Static135.anInt2758;
							this.anIntArray558[local54] += Static328.anInt6268;
							this.anIntArray562[local54] += Static142.anInt2901;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local259 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static250.aBoolean350) {
				local395 = arg7[3] * Static328.anInt6268 + arg7[0] * Static135.anInt2758 + Static142.anInt2901 * arg7[6] + 8192 >> 14;
				local413 = arg7[7] * Static142.anInt2901 + arg7[1] * Static135.anInt2758 + Static328.anInt6268 * arg7[4] + 8192 >> 14;
				local395 += local259;
				local413 += local54;
				local646 = Static142.anInt2901 * arg7[8] + Static328.anInt6268 * arg7[5] + Static135.anInt2758 * arg7[2] + 8192 >> 14;
				Static135.anInt2758 = local395;
				local646 += local60;
				Static328.anInt6268 = local413;
				Static250.aBoolean350 = false;
				Static142.anInt2901 = local646;
			}
			local395 = arg2 << 15 >> 7;
			local413 = arg3 << 15 >> 7;
			local646 = arg4 << 15 >> 7;
			local655 = local395 * -Static135.anInt2758 + 8192 >> 14;
			local667 = local413 * -Static328.anInt6268 + 8192 >> 14;
			local671 = -Static142.anInt2901 * local646 + 8192 >> 14;
			local690 = local655 + Static135.anInt2758;
			local1025 = Static328.anInt6268 + local667;
			local1033 = Static142.anInt2901 + local671;
			@Pc(1879) int[] local1879 = new int[] { local395 * arg7[0] + 8192 >> 14, local395 * arg7[3] + 8192 >> 14, local395 * arg7[6] + 8192 >> 14, local413 * arg7[1] + 8192 >> 14, arg7[4] * local413 + 8192 >> 14, arg7[7] * local413 + 8192 >> 14, local646 * arg7[2] + 8192 >> 14, arg7[5] * local646 + 8192 >> 14, arg7[8] * local646 + 8192 >> 14 };
			local1188 = local395 * local259 + 8192 >> 14;
			local1213 = local413 * local54 + 8192 >> 14;
			@Pc(2007) int local2007 = local1213 + local1025;
			local1218 = local60 * local646 + 8192 >> 14;
			@Pc(2019) int local2019 = local1188 + local690;
			@Pc(2023) int local2023 = local1218 + local1033;
			@Pc(2026) int[] local2026 = new int[9];
			@Pc(2032) int local2032;
			for (local1226 = 0; local1226 < 3; local1226++) {
				for (local2032 = 0; local2032 < 3; local2032++) {
					local1231 = 0;
					for (local1235 = 0; local1235 < 3; local1235++) {
						local1231 += local1879[local2032 + local1235 * 3] * arg7[local1226 * 3 + local1235];
					}
					local2026[local2032 + local1226 * 3] = local1231 + 8192 >> 14;
				}
			}
			local2032 = local2023 * arg7[2] + arg7[0] * local2019 + local2007 * arg7[1] + 8192 >> 14;
			local1231 = local2023 * arg7[5] + local2019 * arg7[3] + local2007 * arg7[4] + 8192 >> 14;
			local1231 += local32;
			local2032 += local26;
			local1235 = arg7[7] * local2007 + arg7[6] * local2019 + local2023 * arg7[8] + 8192 >> 14;
			local1235 += local38;
			for (local1239 = 0; local1239 < local8; local1239++) {
				local1241 = arg1[local1239];
				if (this.anIntArrayArray60.length > local1241) {
					local1372 = this.anIntArrayArray60[local1241];
					for (local1374 = 0; local1374 < local1372.length; local1374++) {
						local1378 = local1372[local1374];
						if (this.aShortArray138 == null || (this.aShortArray138[local1378] & arg6) != 0) {
							local1382 = this.anIntArray559[local1378] * local2026[0] + local2026[1] * this.anIntArray558[local1378] + this.anIntArray562[local1378] * local2026[2] + 8192 >> 14;
							local1384 = local2026[3] * this.anIntArray559[local1378] + local2026[4] * this.anIntArray558[local1378] + this.anIntArray562[local1378] * local2026[5] + 8192 >> 14;
							local1512 = this.anIntArray559[local1378] * local2026[6] + local2026[7] * this.anIntArray558[local1378] + local2026[8] * this.anIntArray562[local1378] + 8192 >> 14;
							@Pc(2307) int local2307 = local1384 + local1231;
							@Pc(2311) int local2311 = local1382 + local2032;
							this.anIntArray559[local1378] = local2311;
							@Pc(2320) int local2320 = local1512 + local1235;
							this.anIntArray558[local1378] = local2307;
							this.anIntArray562[local1378] = local2320;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(Lclient!vs;I)V")
	private void method5476(@OriginalArg(0) Class3_Sub10_Sub18_Sub1 arg0) {
		if (Static195.anIntArray409.length < this.anInt6495) {
			Static288.anIntArray521 = new int[this.anInt6495];
			Static195.anIntArray409 = new int[this.anInt6495];
		}
		@Pc(47) int local47;
		@Pc(84) int local84;
		@Pc(93) int local93;
		for (@Pc(20) int local20 = 0; local20 < this.anInt6510; local20++) {
			local47 = (this.anIntArray559[local20] - (this.anIntArray558[local20] * this.aClass5_Sub3_14.anInt7762 >> 8) >> this.aClass5_Sub3_14.anInt7761) - arg0.anInt9114;
			@Pc(70) int local70 = (this.anIntArray562[local20] - (this.aClass5_Sub3_14.anInt7756 * this.anIntArray558[local20] >> 8) >> this.aClass5_Sub3_14.anInt7761) - arg0.anInt9112;
			@Pc(75) int local75 = this.anIntArray560[local20];
			@Pc(82) int local82 = this.anIntArray560[local20 + 1];
			for (local84 = local75; local84 < local82; local84++) {
				local93 = this.aShortArray141[local84] - 1;
				if (local93 == -1) {
					break;
				}
				Static195.anIntArray409[local93] = local47;
				Static288.anIntArray521[local93] = local70;
			}
		}
		for (local47 = 0; local47 < this.anInt6499; local47++) {
			if (this.aByteArray63 == null || this.aByteArray63[local47] <= 128) {
				@Pc(131) short local131 = this.aShortArray143[local47];
				@Pc(136) short local136 = this.aShortArray137[local47];
				@Pc(141) short local141 = this.aShortArray145[local47];
				local84 = Static195.anIntArray409[local131];
				local93 = Static195.anIntArray409[local136];
				@Pc(153) int local153 = Static195.anIntArray409[local141];
				@Pc(157) int local157 = Static288.anIntArray521[local131];
				@Pc(161) int local161 = Static288.anIntArray521[local136];
				@Pc(165) int local165 = Static288.anIntArray521[local141];
				if (-((local153 - local93) * (local161 - local157)) + (local84 - local93) * (local161 - local165) > 0) {
					arg0.method7518(local93, local157, local153, local161, local84, local165);
				}
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "()[Lclient!gl;")
	@Override
	public Class109[] method5789() {
		return this.aClass109Array5;
	}

	@OriginalMember(owner = "client!oba", name = "D", descriptor = "(I)V")
	@Override
	public void D(@OriginalArg(0) int arg0) {
		this.aShort98 = (short) arg0;
		this.method5472();
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt6502; local3++) {
			local12 = this.aShortArray142[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local42 += (arg2 - local42) * arg3 >> 7;
			}
			this.aShortArray142[local3] = (short) (local42 | local24 << 7 | local18 << 10);
		}
		if (this.aClass191Array1 != null) {
			for (local12 = 0; local12 < this.anInt6516; local12++) {
				@Pc(109) Class191 local109 = this.aClass191Array1[local12];
				@Pc(114) Class17 local114 = this.aClass17Array1[local12];
				local114.anInt645 = local114.anInt645 & 0xFF000000 | Static393.anIntArray638[this.aShortArray142[local109.anInt5951] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5472();
	}

	@OriginalMember(owner = "client!oba", name = "h", descriptor = "()I")
	@Override
	public int h() {
		return this.anInt6489;
	}

	@OriginalMember(owner = "client!oba", name = "d", descriptor = "(B)V")
	private void method5477() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt6510; local23++) {
			@Pc(36) int local36 = this.anIntArray559[local23];
			@Pc(41) int local41 = this.anIntArray558[local23];
			if (local36 > local13) {
				local13 = local36;
			}
			@Pc(51) int local51 = this.anIntArray562[local23];
			if (local41 < local9) {
				local9 = local41;
			}
			if (local15 < local41) {
				local15 = local41;
			}
			if (local7 > local36) {
				local7 = local36;
			}
			if (local51 > local17) {
				local17 = local51;
			}
			if (local51 < local11) {
				local11 = local51;
			}
			@Pc(100) int local100 = local51 * local51 + local36 * local36;
			if (local19 < local100) {
				local19 = local100;
			}
			local100 = local41 * local41 + local51 * local51 + local36 * local36;
			if (local100 > local21) {
				local21 = local100;
			}
		}
		this.anInt6504 = local7;
		this.anInt6476 = local13;
		this.anInt6543 = local9;
		this.anInt6511 = local17;
		this.anInt6539 = local15;
		this.anInt6526 = local11;
		this.anInt6518 = (int) (Math.sqrt((double) local19) + 0.99D);
		Math.sqrt((double) local21);
		this.aBoolean412 = true;
	}

	@OriginalMember(owner = "client!oba", name = "E", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void E(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg2 << 4;
			local25 = arg4 << 4;
			Static328.anInt6268 = 0;
			Static135.anInt2758 = 0;
			Static142.anInt2901 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray60.length) {
					local55 = this.anIntArrayArray60[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static135.anInt2758 += this.anIntArray559[local63];
						Static328.anInt6268 += this.anIntArray558[local63];
						Static142.anInt2901 += this.anIntArray562[local63];
						local33++;
					}
				}
			}
			if (local33 > 0) {
				Static135.anInt2758 = local21 + Static135.anInt2758 / local33;
				Static142.anInt2901 = Static142.anInt2901 / local33 + local25;
				Static328.anInt6268 = Static328.anInt6268 / local33 + local17;
			} else {
				Static142.anInt2901 = local25;
				Static328.anInt6268 = local17;
				Static135.anInt2758 = local21;
			}
			return;
		}
		@Pc(167) int[] local167;
		@Pc(169) int local169;
		if (arg0 == 1) {
			local21 = arg2 << 4;
			local17 = arg3 << 4;
			local25 = arg4 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray60.length > local35) {
					local167 = this.anIntArrayArray60[local35];
					for (local169 = 0; local169 < local167.length; local169++) {
						local57 = local167[local169];
						this.anIntArray559[local57] += local21;
						this.anIntArray558[local57] += local17;
						this.anIntArray562[local57] += local25;
					}
				}
			}
			return;
		}
		@Pc(276) int local276;
		@Pc(295) int local295;
		@Pc(759) int local759;
		@Pc(768) int local768;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray60.length) {
					local167 = this.anIntArrayArray60[local35];
					if ((arg5 & 0x1) == 0) {
						for (local169 = 0; local169 < local167.length; local169++) {
							local57 = local167[local169];
							this.anIntArray559[local57] -= Static135.anInt2758;
							this.anIntArray558[local57] -= Static328.anInt6268;
							this.anIntArray562[local57] -= Static142.anInt2901;
							if (arg4 != 0) {
								local63 = Class5.anIntArray761[arg4];
								local276 = Class5.anIntArray760[arg4];
								local295 = local276 * this.anIntArray559[local57] + local63 * this.anIntArray558[local57] + 16383 >> 14;
								this.anIntArray558[local57] = local276 * this.anIntArray558[local57] + 16383 - local63 * this.anIntArray559[local57] >> 14;
								this.anIntArray559[local57] = local295;
							}
							if (arg2 != 0) {
								local63 = Class5.anIntArray761[arg2];
								local276 = Class5.anIntArray760[arg2];
								local295 = local276 * this.anIntArray558[local57] + 16383 - local63 * this.anIntArray562[local57] >> 14;
								this.anIntArray562[local57] = local276 * this.anIntArray562[local57] + this.anIntArray558[local57] * local63 + 16383 >> 14;
								this.anIntArray558[local57] = local295;
							}
							if (arg3 != 0) {
								local63 = Class5.anIntArray761[arg3];
								local276 = Class5.anIntArray760[arg3];
								local295 = local63 * this.anIntArray562[local57] + this.anIntArray559[local57] * local276 + 16383 >> 14;
								this.anIntArray562[local57] = local276 * this.anIntArray562[local57] + 16383 - this.anIntArray559[local57] * local63 >> 14;
								this.anIntArray559[local57] = local295;
							}
							this.anIntArray559[local57] += Static135.anInt2758;
							this.anIntArray558[local57] += Static328.anInt6268;
							this.anIntArray562[local57] += Static142.anInt2901;
						}
					} else {
						for (local169 = 0; local169 < local167.length; local169++) {
							local57 = local167[local169];
							this.anIntArray559[local57] -= Static135.anInt2758;
							this.anIntArray558[local57] -= Static328.anInt6268;
							this.anIntArray562[local57] -= Static142.anInt2901;
							if (arg2 != 0) {
								local63 = Class5.anIntArray761[arg2];
								local276 = Class5.anIntArray760[arg2];
								local295 = this.anIntArray558[local57] * local276 + 16383 - local63 * this.anIntArray562[local57] >> 14;
								this.anIntArray562[local57] = this.anIntArray562[local57] * local276 + this.anIntArray558[local57] * local63 + 16383 >> 14;
								this.anIntArray558[local57] = local295;
							}
							if (arg4 != 0) {
								local63 = Class5.anIntArray761[arg4];
								local276 = Class5.anIntArray760[arg4];
								local295 = this.anIntArray558[local57] * local63 + this.anIntArray559[local57] * local276 + 16383 >> 14;
								this.anIntArray558[local57] = local276 * this.anIntArray558[local57] + 16383 - local63 * this.anIntArray559[local57] >> 14;
								this.anIntArray559[local57] = local295;
							}
							if (arg3 != 0) {
								local63 = Class5.anIntArray761[arg3];
								local276 = Class5.anIntArray760[arg3];
								local295 = this.anIntArray562[local57] * local63 + local276 * this.anIntArray559[local57] + 16383 >> 14;
								this.anIntArray562[local57] = this.anIntArray562[local57] * local276 + 16383 - local63 * this.anIntArray559[local57] >> 14;
								this.anIntArray559[local57] = local295;
							}
							this.anIntArray559[local57] += Static135.anInt2758;
							this.anIntArray558[local57] += Static328.anInt6268;
							this.anIntArray562[local57] += Static142.anInt2901;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray60.length) {
						local55 = this.anIntArrayArray60[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local276 = this.anIntArray560[local63];
							local295 = this.anIntArray560[local63 + 1];
							for (local759 = local276; local759 < local295; local759++) {
								local768 = this.aShortArray141[local759] - 1;
								if (local768 == -1) {
									break;
								}
								@Pc(780) int local780;
								@Pc(784) int local784;
								@Pc(802) int local802;
								if (arg4 != 0) {
									local780 = Class5.anIntArray761[arg4];
									local784 = Class5.anIntArray760[arg4];
									local802 = this.aShortArray134[local768] * local784 + local780 * this.aShortArray133[local768] + 16383 >> 14;
									this.aShortArray133[local768] = (short) (local784 * this.aShortArray133[local768] + 16383 - local780 * this.aShortArray134[local768] >> 14);
									this.aShortArray134[local768] = (short) local802;
								}
								if (arg2 != 0) {
									local780 = Class5.anIntArray761[arg2];
									local784 = Class5.anIntArray760[arg2];
									local802 = local784 * this.aShortArray133[local768] + 16383 - local780 * this.aShortArray139[local768] >> 14;
									this.aShortArray139[local768] = (short) (this.aShortArray139[local768] * local784 + this.aShortArray133[local768] * local780 + 16383 >> 14);
									this.aShortArray133[local768] = (short) local802;
								}
								if (arg3 != 0) {
									local780 = Class5.anIntArray761[arg3];
									local784 = Class5.anIntArray760[arg3];
									local802 = this.aShortArray134[local768] * local784 + this.aShortArray139[local768] * local780 + 16383 >> 14;
									this.aShortArray139[local768] = (short) (local784 * this.aShortArray139[local768] + 16383 - this.aShortArray134[local768] * local780 >> 14);
									this.aShortArray134[local768] = (short) local802;
								}
							}
						}
					}
				}
				this.method5464();
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray60.length > local35) {
					local167 = this.anIntArrayArray60[local35];
					for (local169 = 0; local169 < local167.length; local169++) {
						local57 = local167[local169];
						this.anIntArray559[local57] -= Static135.anInt2758;
						this.anIntArray558[local57] -= Static328.anInt6268;
						this.anIntArray562[local57] -= Static142.anInt2901;
						this.anIntArray559[local57] = this.anIntArray559[local57] * arg2 >> 7;
						this.anIntArray558[local57] = arg3 * this.anIntArray558[local57] >> 7;
						this.anIntArray562[local57] = this.anIntArray562[local57] * arg4 >> 7;
						this.anIntArray559[local57] += Static135.anInt2758;
						this.anIntArray558[local57] += Static328.anInt6268;
						this.anIntArray562[local57] += Static142.anInt2901;
					}
				}
			}
		} else {
			@Pc(1204) Class17 local1204;
			@Pc(1106) boolean local1106;
			@Pc(1199) Class191 local1199;
			if (arg0 == 5) {
				if (this.anIntArrayArray59 != null) {
					local1106 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray59.length > local41) {
							local55 = this.anIntArrayArray59[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local276 = arg2 * 8 + (this.aByteArray63[local63] & 0xFF);
								if (local276 < 0) {
									local276 = 0;
								} else if (local276 > 255) {
									local276 = 255;
								}
								this.aByteArray63[local63] = (byte) local276;
							}
							local1106 |= local55.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass191Array1 != null) {
							for (local41 = 0; local41 < this.anInt6516; local41++) {
								local1199 = this.aClass191Array1[local41];
								local1204 = this.aClass17Array1[local41];
								local1204.anInt645 = 255 - (this.aByteArray63[local1199.anInt5951] & 0xFF) << 24 | local1204.anInt645 & 0xFFFFFF;
							}
						}
						this.method5472();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray59 != null) {
					local1106 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray59.length) {
							local55 = this.anIntArrayArray59[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local276 = this.aShortArray142[local63] & 0xFFFF;
								local295 = local276 >> 10 & 0x3F;
								local759 = local276 >> 7 & 0x7;
								@Pc(1297) int local1297 = local295 + arg2 & 0x3F;
								local759 += arg3 / 4;
								local768 = local276 & 0x7F;
								local768 += arg4;
								if (local759 < 0) {
									local759 = 0;
								} else if (local759 > 7) {
									local759 = 7;
								}
								if (local768 < 0) {
									local768 = 0;
								} else if (local768 > 127) {
									local768 = 127;
								}
								this.aShortArray142[local63] = (short) (local768 | local1297 << 10 | local759 << 7);
							}
							local1106 |= local55.length > 0;
						}
					}
					if (local1106) {
						if (this.aClass191Array1 != null) {
							for (local41 = 0; local41 < this.anInt6516; local41++) {
								local1199 = this.aClass191Array1[local41];
								local1204 = this.aClass17Array1[local41];
								local1204.anInt645 = Static393.anIntArray638[this.aShortArray142[local1199.anInt5951] & 0xFFFF] & 0xFFFFFF | local1204.anInt645 & 0xFF000000;
							}
						}
						this.method5472();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray58 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray58.length) {
							local167 = this.anIntArrayArray58[local35];
							for (local169 = 0; local169 < local167.length; local169++) {
								local1204 = this.aClass17Array1[local167[local169]];
								local1204.anInt635 += arg3;
								local1204.anInt644 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray58 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray58.length) {
							local167 = this.anIntArrayArray58[local35];
							for (local169 = 0; local169 < local167.length; local169++) {
								local1204 = this.aClass17Array1[local167[local169]];
								local1204.anInt639 = arg2 * local1204.anInt639 >> 7;
								local1204.anInt636 = local1204.anInt636 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray58 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray58.length) {
						local167 = this.anIntArrayArray58[local35];
						for (local169 = 0; local169 < local167.length; local169++) {
							local1204 = this.aClass17Array1[local167[local169]];
							local1204.anInt641 = local1204.anInt641 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}
}
