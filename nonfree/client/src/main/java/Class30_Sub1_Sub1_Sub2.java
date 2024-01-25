import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class30_Sub1_Sub1_Sub2 extends Class30_Sub1_Sub1 {

	@OriginalMember(owner = "client!ch", name = "ud", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ch", name = "Lc", descriptor = "I")
	public int anInt1327;

	@OriginalMember(owner = "client!ch", name = "Mc", descriptor = "I")
	private int anInt1328;

	@OriginalMember(owner = "client!ch", name = "Nc", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!ch", name = "dd", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!ch", name = "fd", descriptor = "Lclient!qp;")
	public Class210 aClass210_1;

	@OriginalMember(owner = "client!ch", name = "hd", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!ch", name = "Pc", descriptor = "I")
	public int anInt1330 = 0;

	@OriginalMember(owner = "client!ch", name = "Kc", descriptor = "B")
	private byte aByte33 = 0;

	@OriginalMember(owner = "client!ch", name = "Uc", descriptor = "I")
	public int anInt1335 = -1;

	@OriginalMember(owner = "client!ch", name = "Hc", descriptor = "I")
	public int anInt1325 = -1;

	@OriginalMember(owner = "client!ch", name = "Zc", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!ch", name = "zc", descriptor = "I")
	public int anInt1318 = -1;

	@OriginalMember(owner = "client!ch", name = "Sc", descriptor = "I")
	public int anInt1333 = -1;

	@OriginalMember(owner = "client!ch", name = "Jc", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!ch", name = "Xc", descriptor = "I")
	public int anInt1338 = -1;

	@OriginalMember(owner = "client!ch", name = "Oc", descriptor = "I")
	public int anInt1329 = 0;

	@OriginalMember(owner = "client!ch", name = "cd", descriptor = "B")
	private byte aByte34 = 0;

	@OriginalMember(owner = "client!ch", name = "ld", descriptor = "I")
	public int anInt1347 = 0;

	@OriginalMember(owner = "client!ch", name = "ed", descriptor = "Z")
	public boolean aBoolean85 = false;

	@OriginalMember(owner = "client!ch", name = "Dc", descriptor = "B")
	private byte aByte32 = 0;

	@OriginalMember(owner = "client!ch", name = "nd", descriptor = "I")
	public int anInt1348 = 0;

	@OriginalMember(owner = "client!ch", name = "Wc", descriptor = "I")
	public int anInt1337 = -1;

	@OriginalMember(owner = "client!ch", name = "Gc", descriptor = "I")
	public int anInt1324 = 255;

	@OriginalMember(owner = "client!ch", name = "id", descriptor = "I")
	public int anInt1344 = 0;

	@OriginalMember(owner = "client!ch", name = "kd", descriptor = "I")
	public int anInt1346 = -1;

	@OriginalMember(owner = "client!ch", name = "td", descriptor = "I")
	public int anInt1354 = -1;

	static {
		for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
			aRectangleArray2[local12] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIB)V")
	public void method958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.anInt1316 = 0;
		super.anIntArray130[0] = arg1;
		super.anInt1314 = 0;
		super.anInt1315 = 0;
		super.anIntArray129[0] = arg0;
		@Pc(26) int local26 = this.method944();
		super.anInt7490 = local26 * 64 + super.anIntArray130[0] * 128;
		super.anInt7488 = super.anIntArray129[0] * 128 + local26 * 64;
		if (Static429.aClass30_Sub1_Sub1_Sub2_2 == this) {
			Static448.method6102();
		}
		if (super.aClass41_Sub1_3 != null) {
			super.aClass41_Sub1_3.method877();
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method5717(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.aClass210_1 == null || !this.method960(arg0, 131072)) {
			return false;
		}
		@Pc(17) Class40 local17 = arg0.method5918();
		@Pc(22) int local22 = super.aClass15_7.method327();
		local17.ca(local22);
		local17.W(super.anInt7490, super.anInt7495, super.anInt7488);
		@Pc(40) boolean local40 = false;
		for (@Pc(42) int local42 = 0; super.aClass17Array3.length > local42; local42++) {
			if (super.aClass17Array3[local42] != null && super.aClass17Array3[local42].method6203(arg2, arg1, local17, true)) {
				local40 = true;
				break;
			}
		}
		super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = super.aClass17Array3[3] = null;
		return local40;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!za;Lclient!c;Lclient!e;III)V")
	private void method959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class106 arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(4) Class17 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg5 * arg5 + arg0 * arg0;
		if (local17 < 16384 || arg1 < local17) {
			return;
		}
		@Pc(39) int local39 = (int) (Math.atan2((double) arg5, (double) arg0) * 2607.5945876176133D) & 0x3FFF;
		@Pc(51) Class17 local51 = Static411.method5579(arg2, local39, super.anInt1250, arg6, super.anInt1286, super.anInt1273);
		if (local51 != null) {
			arg2.method5955(false);
			local51.method6189(arg3, null, 0);
			arg2.method5955(true);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!za;II)Z")
	private boolean method960(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg1;
		@Pc(9) Class212 local9 = this.method948();
		@Pc(25) Class235 local25 = super.anInt1303 != -1 && super.anInt1271 == 0 ? Static107.aClass239_1.method5420(super.anInt1303) : null;
		@Pc(47) Class235 local47 = super.anInt1255 == -1 || this.aBoolean84 || super.aBoolean81 && local25 != null ? null : Static107.aClass239_1.method5420(super.anInt1255);
		@Pc(50) int local50 = local9.anInt6249;
		@Pc(53) int local53 = local9.anInt6264;
		if (local50 != 0 || local53 != 0 || local9.anInt6268 != 0 || local9.anInt6286 != 0) {
			arg1 |= 0x7;
		}
		@Pc(96) boolean local96 = super.aByte28 != 0 && super.anInt1258 <= Static187.anInt3975 && Static187.anInt3975 < super.anInt1310;
		if (local96) {
			arg1 |= 0x80000;
		}
		@Pc(137) Class17 local137 = super.aClass17Array3[0] = this.aClass210_1.method4724(Static300.aClass44_2, Static366.aClass190_1, super.anInt1242, super.anInt1297, super.anInt1294, Static43.aClass57_1, super.anInt1260, local47, super.aClass232Array3, super.anInt1267, arg1, local25, Static19.aClass143_1, arg0, Static107.aClass239_1, super.anInt1278, Static241.aClass258_1);
		@Pc(140) int local140 = Static322.method4581();
		if (Static155.anInt3339 < 96 && local140 > 50) {
			Static363.method5088();
		}
		@Pc(169) int local169;
		if (Static314.aClass248_7 != Static59.aClass248_1 && local140 < 50) {
			local169 = 50 - local140;
			while (local169 > Static348.anInt6431) {
				Static166.aByteArrayArray13[Static348.anInt6431] = new byte[102400];
				Static348.anInt6431++;
			}
			while (local169 < Static348.anInt6431) {
				Static348.anInt6431--;
				Static166.aByteArrayArray13[Static348.anInt6431] = null;
			}
		} else if (Static59.aClass248_1 != Static314.aClass248_7) {
			Static348.anInt6431 = 0;
			Static166.aByteArrayArray13 = new byte[50][];
		}
		if (local137 == null) {
			return false;
		}
		super.anInt1257 = local137.B();
		this.method955(local137);
		local169 = super.aClass15_7.method327();
		if (local50 == 0 && local53 == 0) {
			this.method938(0, this.method944() << 7, local169, 0, this.method944() << 7);
		} else {
			this.method938(local9.anInt6289, local53, local169, local9.anInt6295, local50);
			if (super.anInt1286 != 0) {
				local137.W(super.anInt1286);
			}
			if (super.anInt1273 != 0) {
				local137.K(super.anInt1273);
			}
			if (super.anInt1250 != 0) {
				local137.a(0, super.anInt1250, 0);
			}
		}
		if (local96) {
			local137.method6197(super.aByte31, super.aByte30, super.aByte29, super.aByte28 & 0xFF);
		}
		@Pc(315) Class223 local315;
		@Pc(327) boolean local327;
		@Pc(329) int local329;
		@Pc(371) Class17 local371;
		if (this.aBoolean84 || super.anInt1279 == -1 || super.anInt1261 == -1) {
			super.aClass17Array3[1] = null;
		} else {
			local315 = Static145.aClass63_1.method1524(super.anInt1279);
			local327 = local315.aByte91 == 3 && (local50 != 0 || local53 != 0);
			local329 = local5;
			if (local327) {
				local329 = local5 | 0x7;
			} else {
				if (super.anInt1308 != 0) {
					local329 = local5 | 0x5;
				}
				if (super.anInt1296 != 0) {
					local329 |= 0x2;
				}
			}
			local371 = super.aClass17Array3[1] = local315.method5069(local329, super.anInt1261, Static107.aClass239_1, arg0, super.anInt1264, super.anInt1284);
			if (local371 != null) {
				if (super.anInt1296 != 0) {
					local371.a(0, -super.anInt1296 << 0, 0);
				}
				if (super.anInt1308 != 0) {
					local371.ma(super.anInt1308 * 2048);
				}
				if (local327) {
					if (super.anInt1286 != 0) {
						local371.W(super.anInt1286);
					}
					if (super.anInt1273 != 0) {
						local371.K(super.anInt1273);
					}
					if (super.anInt1250 != 0) {
						local371.a(0, super.anInt1250, 0);
					}
				}
			}
		}
		if (this.aBoolean84 || super.anInt1249 == -1 || super.anInt1252 == -1) {
			super.aClass17Array3[3] = null;
		} else {
			local315 = Static145.aClass63_1.method1524(super.anInt1249);
			local327 = local315.aByte91 == 3 && (local50 != 0 || local53 != 0);
			local329 = local5;
			if (local327) {
				local329 = local5 | 0x7;
			} else {
				if (super.anInt1275 != 0) {
					local329 = local5 | 0x5;
				}
				if (super.anInt1287 != 0) {
					local329 |= 0x2;
				}
			}
			local371 = super.aClass17Array3[3] = local315.method5072(super.anInt1270, arg0, super.anInt1289, super.anInt1252, Static107.aClass239_1, local329);
			if (local371 != null) {
				if (super.anInt1287 != 0) {
					local371.a(0, -super.anInt1287 << 0, 0);
				}
				if (super.anInt1275 != 0) {
					local371.ma(super.anInt1275 * 2048);
				}
				if (local327) {
					if (super.anInt1286 != 0) {
						local371.W(super.anInt1286);
					}
					if (super.anInt1273 != 0) {
						local371.K(super.anInt1273);
					}
					if (super.anInt1250 != 0) {
						local371.a(0, super.anInt1250, 0);
					}
				}
			}
		}
		super.aClass17Array3[2] = null;
		if (!this.aBoolean84 && super.aClass1_Sub31_3 != null) {
			if (Static187.anInt3975 >= super.aClass1_Sub31_3.anInt5423) {
				super.aClass1_Sub31_3 = null;
			} else if (super.aClass1_Sub31_3.anInt5420 <= Static187.anInt3975) {
				@Pc(604) Class17 local604 = super.aClass1_Sub31_3.method4186(local5 | 0x7, arg0);
				if (local604 != null) {
					local604.a(super.aClass1_Sub31_3.anInt5431 - super.anInt7490, super.aClass1_Sub31_3.anInt5421 + -super.anInt7495, -super.anInt7488 + super.aClass1_Sub31_3.anInt5432);
					if (local169 != 0) {
						local604.ma(-local169 & 0x3FFF);
					}
					super.aClass17Array3[2] = local604;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(Z)Z")
	public boolean method961() {
		return this.aClass210_1 != null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method962() {
		@Pc(5) String local5 = "";
		if (Static382.aStringArray41 != null) {
			local5 = local5 + Static382.aStringArray41[this.aByte32];
		}
		@Pc(27) int[] local27;
		if (this.aByte34 == 1 && Static85.anIntArray219 != null) {
			local27 = Static85.anIntArray219;
		} else {
			local27 = Static80.anIntArray744;
		}
		if (local27 != null && local27[this.aByte32] != -1) {
			@Pc(46) Class216 local46 = Static118.aClass145_3.method3324(local27[this.aByte32]);
			if (local46.aChar3 == 's') {
				local5 = local5 + local46.method4949(this.aByte33 & 0xFF);
			} else {
				Static247.method3669("gdn1", new Throwable());
				local27[this.aByte32] = -1;
			}
		}
		local5 = local5 + this.aString8;
		if (Static27.aStringArray4 != null) {
			local5 = local5 + Static27.aStringArray4[this.aByte32];
		}
		return local5;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
	@Override
	public void method5721() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BIII)V")
	public void method963(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (super.anInt1303 != -1 && Static107.aClass239_1.method5420(super.anInt1303).anInt6850 == 1) {
			super.anInt1303 = -1;
		}
		@Pc(35) Class223 local35;
		if (super.anInt1279 != -1) {
			local35 = Static145.aClass63_1.method1524(super.anInt1279);
			if (local35.aBoolean420 && local35.anInt6642 != -1 && Static107.aClass239_1.method5420(local35.anInt6642).anInt6850 == 1) {
				super.anInt1279 = -1;
			}
		}
		if (super.anInt1249 != -1) {
			local35 = Static145.aClass63_1.method1524(super.anInt1249);
			if (local35.aBoolean420 && local35.anInt6642 != -1 && Static107.aClass239_1.method5420(local35.anInt6642).anInt6850 == 1) {
				super.anInt1249 = -1;
			}
		}
		this.anInt1318 = -1;
		if (arg2 < 0 || Static209.anInt4283 <= arg2 || arg1 < 0 || arg1 >= Static211.anInt4295) {
			this.method958(arg1, arg2);
		} else if (super.anIntArray130[0] >= 0 && Static209.anInt4283 > super.anIntArray130[0] && super.anIntArray129[0] >= 0 && super.anIntArray129[0] < Static211.anInt4295) {
			if (arg0 == 2) {
				Static381.method5709(this, arg1, arg2);
			}
			this.method966(arg0, arg1, arg2);
		} else {
			this.method958(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZLclient!ia;)V")
	public void method964(@OriginalArg(1) Class1_Sub3 arg0) {
		arg0.anInt1710 = 0;
		@Pc(10) int local10 = arg0.method1171();
		this.aByte34 = (byte) (local10 & 0x1);
		@Pc(24) boolean local24 = (local10 & 0x2) != 0;
		@Pc(35) boolean local35 = (local10 & 0x4) != 0;
		@Pc(39) int local39 = super.method944();
		this.method949((local10 >> 3 & 0x7) + 1);
		this.aByte32 = (byte) (local10 >> 6 & 0x3);
		super.anInt7490 += this.method944() - local39 << 6;
		super.anInt7488 += this.method944() - local39 << 6;
		this.aByte33 = arg0.method1212();
		this.anInt1325 = arg0.method1212();
		this.anInt1335 = arg0.method1212();
		this.anInt1330 = 0;
		@Pc(103) int local103 = -1;
		@Pc(106) int[] local106 = new int[12];
		@Pc(124) int local124;
		@Pc(130) int local130;
		@Pc(168) int local168;
		for (@Pc(108) int local108 = 0; local108 < 12; local108++) {
			@Pc(113) int local113 = arg0.method1171();
			if (local113 == 0) {
				local106[local108] = 0;
			} else {
				local124 = arg0.method1171();
				local130 = local124 + (local113 << 8);
				if (local108 == 0 && local130 == 65535) {
					local103 = arg0.method1177();
					this.anInt1330 = arg0.method1171();
					break;
				}
				if (local130 >= 32768) {
					local130 = Static353.anIntArray704[local130 - 32768];
					local106[local108] = local130 | 0x40000000;
					local168 = Static43.aClass57_1.method1414(local130).anInt4824;
					if (local168 != 0) {
						this.anInt1330 = local168;
					}
				} else {
					local106[local108] = Integer.MIN_VALUE | local130 - 256;
				}
			}
		}
		@Pc(198) int[] local198 = new int[5];
		for (local124 = 0; local124 < 5; local124++) {
			local130 = arg0.method1171();
			if (local130 < 0 || Static182.aShortArrayArray2[local124].length <= local130) {
				local130 = 0;
			}
			local198[local124] = local130;
		}
		this.anInt1328 = arg0.method1177();
		this.aString8 = arg0.method1201();
		if (local24) {
			this.aString9 = arg0.method1201();
		} else {
			this.aString9 = this.aString8;
		}
		this.anInt1348 = arg0.method1171();
		if (local35) {
			this.anInt1347 = arg0.method1177();
			this.anInt1344 = this.anInt1348;
			this.anInt1337 = -1;
		} else {
			this.anInt1347 = 0;
			this.anInt1344 = arg0.method1171();
			this.anInt1337 = arg0.method1171();
			if (this.anInt1337 == 255) {
				this.anInt1337 = -1;
			}
		}
		local130 = this.anInt1329;
		this.anInt1329 = arg0.method1171();
		@Pc(313) int local313;
		if (this.anInt1329 == 0) {
			Static207.method3294(this);
		} else {
			local168 = this.anInt1333;
			@Pc(310) int local310 = this.anInt1354;
			local313 = this.anInt1338;
			@Pc(316) int local316 = this.anInt1346;
			@Pc(319) int local319 = this.anInt1324;
			this.anInt1333 = arg0.method1177();
			this.anInt1354 = arg0.method1177();
			this.anInt1338 = arg0.method1177();
			this.anInt1346 = arg0.method1177();
			this.anInt1324 = arg0.method1171();
			if (this.anInt1329 != local130 || local168 != this.anInt1333 || this.anInt1354 != local310 || local313 != this.anInt1338 || local316 != this.anInt1346 || this.anInt1324 != local319) {
				Static434.method5792(this);
			}
		}
		if (this.aClass210_1 == null) {
			this.aClass210_1 = new Class210();
		}
		local168 = this.aClass210_1.anInt6156;
		@Pc(403) int[] local403 = this.aClass210_1.anIntArray579;
		this.aClass210_1.method4728(this.aByte34 == 1, this.method946(), local103, local198, local106);
		if (local103 != local168) {
			super.anInt7490 = (super.anIntArray130[0] << 7) + (this.method944() << 6);
			super.anInt7488 = (super.anIntArray129[0] << 7) + (this.method944() << 6);
		}
		if (Static32.anInt894 == super.anInt1299 && local403 != null) {
			for (local313 = 0; local313 < local198.length; local313++) {
				if (local198[local313] != local403[local313]) {
					Static43.aClass57_1.method1405();
					break;
				}
			}
		}
		if (super.aClass41_Sub1_3 != null) {
			super.aClass41_Sub1_3.method877();
		}
		if (super.anInt1255 == -1 || !super.aBoolean81) {
			return;
		}
		@Pc(508) Class212 local508 = this.method948();
		if (!local508.method4812(super.anInt1255)) {
			super.aBoolean81 = false;
			super.anInt1255 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)I")
	@Override
	public int method942() {
		return -1;
	}

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "(I)I")
	@Override
	public int method5724() {
		return super.anInt1257;
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)I")
	@Override
	protected int method946() {
		return this.anInt1328;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)I")
	@Override
	public int method944() {
		return this.aClass210_1 == null || this.aClass210_1.anInt6156 == -1 ? super.method944() : Static300.aClass44_2.method999(this.aClass210_1.anInt6156).anInt162;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5719() {
		return false;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(ILclient!za;)Lclient!sr;")
	@Override
	public Class41_Sub7 method5722(@OriginalArg(1) Class106 arg0) {
		if (this.aClass210_1 == null || !this.method960(arg0, 2048)) {
			return null;
		}
		@Pc(19) Class40 local19 = arg0.method5918();
		@Pc(24) int local24 = super.aClass15_7.method327();
		local19.ca(local24);
		local19.W(super.anInt7490, super.anInt7495, super.anInt7488);
		@Pc(38) float local38 = arg0.T();
		@Pc(41) float local41 = arg0.aa();
		@Pc(106) int local106;
		if (Static12.aClass34_Sub1_1.aBoolean452) {
			@Pc(48) Class212 local48 = this.method948();
			if (local48.aBoolean398 && (this.aClass210_1.anInt6156 == -1 || Static300.aClass44_2.method999(this.aClass210_1.anInt6156).aBoolean14)) {
				@Pc(84) Class235 local84 = super.anInt1303 != -1 && super.anInt1271 == 0 ? Static107.aClass239_1.method5420(super.anInt1303) : null;
				@Pc(104) Class235 local104 = super.anInt1255 == -1 || this.aBoolean84 || super.aBoolean81 && local84 != null ? null : Static107.aClass239_1.method5420(super.anInt1255);
				local106 = 0;
				if (super.anInt1298 != 0) {
					local106 = this.method953();
				}
				@Pc(149) Class17 local149 = Static389.method5424(0, 160, local24, 240, 1, local106, super.anInt1273, super.anInt1286, local104 == null ? super.anInt1294 : super.anInt1297, super.aClass17Array3[0], local104 == null ? local84 : local104, arg0, super.anInt1250, 0);
				if (local149 != null) {
					arg0.da(local38, local41 - 128.0F);
					arg0.method5955(false);
					local149.method6189(local19, null, 0);
					arg0.method5955(true);
				}
			}
		}
		if (Static429.aClass30_Sub1_Sub1_Sub2_2 == this) {
			arg0.da(local38, local41 - 144.0F);
			local19.U(super.anInt7490, super.anInt7495, super.anInt7488);
			for (@Pc(190) int local190 = Static393.aClass178Array1.length - 1; local190 >= 0; local190--) {
				@Pc(196) Class178 local196 = Static393.aClass178Array1[local190];
				if (local196 != null && local196.anInt5264 != -1) {
					@Pc(229) int local229;
					if (local196.anInt5270 == 1) {
						@Pc(217) Class1_Sub27 local217 = (Class1_Sub27) Static24.aClass38_3.method765((long) local196.anInt5275);
						if (local217 != null) {
							@Pc(222) Class30_Sub1_Sub1_Sub1 local222 = local217.aClass30_Sub1_Sub1_Sub1_2;
							local229 = local222.anInt7490 - Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490;
							@Pc(236) int local236 = local222.anInt7488 - Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488;
							this.method959(local236, 5760000, arg0, local19, super.aClass17Array3[0], local229, local196.anInt5264);
						}
					}
					if (local196.anInt5270 == 2) {
						@Pc(265) int local265 = local196.anInt5272 + 64 - Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490;
						local106 = local196.anInt5273 + 64 - Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488;
						local229 = local196.anInt5267 << 7;
						local229 *= local229;
						this.method959(local106, local229, arg0, local19, super.aClass17Array3[0], local265, local196.anInt5264);
					}
					if (local196.anInt5270 == 10 && local196.anInt5275 >= 0 && Static135.aClass30_Sub1_Sub1_Sub2Array1.length > local196.anInt5275) {
						@Pc(317) Class30_Sub1_Sub1_Sub2 local317 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local196.anInt5275];
						if (local317 != null) {
							local106 = local317.anInt7490 - Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490;
							local229 = local317.anInt7488 - Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488;
							this.method959(local229, 5760000, arg0, local19, super.aClass17Array3[0], local106, local196.anInt5264);
						}
					}
				}
			}
			local19.ca(local24);
			local19.W(super.anInt7490, super.anInt7495, super.anInt7488);
		}
		arg0.da(local38, local41);
		@Pc(379) Class41_Sub7 local379 = Static306.method4409(super.aClass17Array3.length);
		if (super.aClass41_Sub1_3 == null) {
			arg0.method5943(super.aClass17Array3, local19, local379.aClass41_Sub8Array1, Static429.aClass30_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
		} else {
			@Pc(401) Class51 local401 = super.aClass41_Sub1_3.method875();
			arg0.method5947(super.aClass17Array3, local401, local19, local379.aClass41_Sub8Array1, Static429.aClass30_Sub1_Sub1_Sub2_2 == this ? 1 : 0);
		}
		this.method954(super.aClass17Array3, false, arg0);
		if (super.aClass17Array3[2] != null) {
			if (local24 != 0) {
				super.aClass17Array3[2].ma(local24);
			}
			super.aClass17Array3[2].a(-super.aClass1_Sub31_3.anInt5431 + super.anInt7490, super.anInt7495 + -super.aClass1_Sub31_3.anInt5421, -super.aClass1_Sub31_3.anInt5432 + super.anInt7488);
		}
		super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = super.aClass17Array3[3] = null;
		super.anInt1251 = Static140.anInt3086;
		return local379;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BZ)Ljava/lang/String;")
	public String method965() {
		return this.aString9;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!za;IILclient!vl;Z)V")
	@Override
	public void method5718(@OriginalArg(1) int arg0, @OriginalArg(2) Class106 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class30 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(BIII)V")
	public void method966(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (super.anInt1314 < 9) {
			super.anInt1314++;
		}
		for (@Pc(18) int local18 = super.anInt1314; local18 > 0; local18--) {
			super.anIntArray130[local18] = super.anIntArray130[local18 - 1];
			super.anIntArray129[local18] = super.anIntArray129[local18 - 1];
			super.aByteArray13[local18] = super.aByteArray13[local18 - 1];
		}
		super.anIntArray130[0] = arg2;
		super.anIntArray129[0] = arg1;
		super.aByteArray13[0] = arg0;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(BLclient!za;)V")
	@Override
	public void method5716(@OriginalArg(1) Class106 arg0) {
		if (this.aClass210_1 != null && (super.aBoolean82 || this.method960(arg0, 0))) {
			this.method954(super.aClass17Array3, super.aBoolean82, arg0);
			super.aClass17Array3[0] = super.aClass17Array3[1] = super.aClass17Array3[2] = super.aClass17Array3[3] = null;
		}
	}
}
