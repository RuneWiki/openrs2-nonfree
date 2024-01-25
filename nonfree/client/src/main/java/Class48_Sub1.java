import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!d")
public final class Class48_Sub1 extends Class48 {

	@OriginalMember(owner = "client!d", name = "v", descriptor = "I")
	private int anInt1314;

	@OriginalMember(owner = "client!d", name = "w", descriptor = "Lclient!co;")
	private Class41 aClass41_14;

	@OriginalMember(owner = "client!d", name = "y", descriptor = "[Lclient!pp;")
	private Class185[] aClass185Array1;

	@OriginalMember(owner = "client!d", name = "A", descriptor = "F")
	private float aFloat4;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "F")
	private float aFloat5;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "I")
	public int anInt1318;

	@OriginalMember(owner = "client!d", name = "E", descriptor = "I")
	public int anInt1319;

	@OriginalMember(owner = "client!d", name = "F", descriptor = "I")
	public int anInt1320;

	@OriginalMember(owner = "client!d", name = "G", descriptor = "I")
	public int anInt1321;

	@OriginalMember(owner = "client!d", name = "L", descriptor = "I")
	public int anInt1325;

	@OriginalMember(owner = "client!d", name = "O", descriptor = "I")
	public int anInt1328;

	@OriginalMember(owner = "client!d", name = "R", descriptor = "I")
	public int anInt1330;

	@OriginalMember(owner = "client!d", name = "U", descriptor = "I")
	public int anInt1333;

	@OriginalMember(owner = "client!d", name = "W", descriptor = "I")
	public int anInt1335;

	@OriginalMember(owner = "client!d", name = "Y", descriptor = "Lclient!lr;")
	public Class21_Sub2 aClass21_Sub2_1;

	@OriginalMember(owner = "client!d", name = "Z", descriptor = "Z")
	public boolean aBoolean108;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "I")
	public int anInt1339;

	@OriginalMember(owner = "client!d", name = "kb", descriptor = "Lclient!sh;")
	private Class2_Sub35 aClass2_Sub35_1;

	@OriginalMember(owner = "client!d", name = "t", descriptor = "I")
	private int anInt1313 = 0;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "I")
	public int anInt1317 = 512;

	@OriginalMember(owner = "client!d", name = "z", descriptor = "I")
	private int anInt1316 = 0;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	private int anInt1311 = 0;

	@OriginalMember(owner = "client!d", name = "M", descriptor = "I")
	public int anInt1326 = 0;

	@OriginalMember(owner = "client!d", name = "u", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!d", name = "s", descriptor = "I")
	private int anInt1312 = 3500;

	@OriginalMember(owner = "client!d", name = "P", descriptor = "I")
	public int anInt1329 = 78642;

	@OriginalMember(owner = "client!d", name = "K", descriptor = "I")
	public int anInt1324 = 3500;

	@OriginalMember(owner = "client!d", name = "I", descriptor = "I")
	public int anInt1322 = 0;

	@OriginalMember(owner = "client!d", name = "X", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!d", name = "S", descriptor = "I")
	public int anInt1331 = this.anInt1312 - 255;

	@OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
	public int anInt1337 = 50;

	@OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
	public int anInt1340 = 0;

	@OriginalMember(owner = "client!d", name = "ab", descriptor = "I")
	public int anInt1336 = 0;

	@OriginalMember(owner = "client!d", name = "J", descriptor = "I")
	public int anInt1323 = 75518;

	@OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
	public int anInt1341 = 45823;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
	public int anInt1338 = 512;

	@OriginalMember(owner = "client!d", name = "T", descriptor = "I")
	public int anInt1332 = 0;

	@OriginalMember(owner = "client!d", name = "N", descriptor = "I")
	public int anInt1327 = 0;

	@OriginalMember(owner = "client!d", name = "V", descriptor = "I")
	public int anInt1334 = 0;

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!d", name = "H", descriptor = "Lclient!co;")
	private final Class41 aClass41_15 = new Class41(16);

	@OriginalMember(owner = "client!d", name = "Q", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!d", name = "eb", descriptor = "Lclient!jq;")
	private Class77 aClass77_1;

	@OriginalMember(owner = "client!d", name = "r", descriptor = "[I")
	public int[] anIntArray99;

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!d", name = "x", descriptor = "I")
	private int anInt1315;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!eg;I)V")
	public Class48_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2) {
		super(arg2, arg1);
		this.aCanvas1 = arg0;
		this.aClass77_1 = Static92.method1557(this.aCanvas1);
		this.anIntArray99 = this.aClass77_1.anIntArray499;
		this.anInt1342 = this.aClass77_1.anInt5685;
		this.anInt1315 = this.aClass77_1.anInt5690;
		this.method1120();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIZ)Lclient!rg;")
	@Override
	public Class27 method2510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1342 + arg0;
		@Pc(16) int local16 = this.anInt1342 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray99[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class27_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class27_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(I)V")
	@Override
	public void method2512(@OriginalArg(0) int arg0) {
		this.method2470(0, 0, this.anInt1342, this.anInt1315, arg0, 0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ar;III)V")
	public void method1111(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt493;
		if (local6 == -1) {
			this.method2467(arg1, arg2, local3, arg0.anInt500);
			return;
		}
		if (this.aClass2_Sub35_1 == null || this.aClass2_Sub35_1.aLong213 != (long) local6) {
			this.aClass2_Sub35_1 = (Class2_Sub35) this.aClass41_15.method823((long) local6);
		}
		if (this.aClass2_Sub35_1 == null) {
			@Pc(44) int[] local44 = this.method1113(local6);
			if (local44 == null) {
				return;
			}
			this.aClass2_Sub35_1 = new Class2_Sub35();
			this.aClass2_Sub35_1.aBoolean428 = this.method1119(local6);
			@Pc(65) int local65 = this.aClass2_Sub35_1.aBoolean428 ? 64 : 128;
			this.aClass2_Sub35_1.aClass27_21 = this.method2456(local44, local65, local65, local65);
			this.aClass41_15.method832((long) local6, this.aClass2_Sub35_1);
		}
		if (this.aClass2_Sub35_1.aBoolean428) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.aClass2_Sub35_1.aClass27_21.method5334(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt500, 1);
	}

	@OriginalMember(owner = "client!d", name = "q", descriptor = "()Lclient!bd;")
	@Override
	public Class21 method2483() {
		return new Class21_Sub2();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	@Override
	public void method2487(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
	@Override
	public void method2501(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1314;
		for (@Pc(9) Object local9 = this.aClass41_14.method836(); local9 != null; local9 = this.aClass41_14.method833()) {
			@Pc(13) Class2_Sub33 local13 = (Class2_Sub33) local9;
			if (local13.aBoolean411) {
				local13.anInt5568 += local4;
				@Pc(27) int local27 = local13.anInt5568 / 20;
				if (local27 > 0) {
					@Pc(36) Class166 local36 = super.anInterface3_4.method1278(local13.anInt5569);
					local13.method4893(local36.aByte35 * local4 * 50 / 1000, local36.aByte40 * local4 * 50 / 1000);
					local13.anInt5568 -= local27 * 20;
				}
				local13.aBoolean411 = false;
			}
		}
		this.anInt1314 = arg0;
		this.aClass41_15.method826(5);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!bd;)V")
	@Override
	public void method2482(@OriginalArg(0) Class21 arg0) {
		this.aClass21_Sub2_1 = (Class21_Sub2) arg0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIILclient!hg;II)V")
	@Override
	public void method2530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class8 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class8_Sub1 local2 = (Class8_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray18;
		@Pc(8) int[] local8 = local2.anIntArray19;
		@Pc(17) int local17 = this.anInt1334 > arg7 ? this.anInt1334 : arg7;
		@Pc(32) int local32 = this.anInt1326 < arg7 + local5.length ? this.anInt1326 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(83) int local83;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(145) int local145;
		@Pc(226) int local226;
		@Pc(243) int local243;
		@Pc(248) int local248;
		@Pc(201) int local201;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(390) int local390 = arg2 << 16;
			local83 = (int) Math.floor((double) local390 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local17) {
				arg0 += local83 * (local17 - arg1);
				arg1 = local17;
			}
			if (arg3 >= local32) {
				arg3 = local32 - 1;
			}
			local116 = arg4 >>> 24;
			if (local116 == 255) {
				while (arg1 <= arg3) {
					local129 = arg0 >> 16;
					local133 = arg1 - arg7;
					local145 = arg6 + local5[local133];
					if (local129 >= this.anInt1340 && local129 < this.anInt1327 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray99[local129 + arg1 * this.anInt1342] = arg4;
					}
					arg0 += local83;
					arg1++;
				}
			} else {
				local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
				local129 = 256 - local116;
				while (arg1 <= arg3) {
					local133 = arg0 >> 16;
					local145 = arg1 - arg7;
					local226 = arg6 + local5[local145];
					if (local133 >= this.anInt1340 && local133 < this.anInt1327 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1342;
						local248 = this.anIntArray99[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray99[local133 + arg1 * this.anInt1342] = local201 + local584;
					}
					arg0 += local83;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(73) int local73 = arg3 << 16;
		local83 = (int) Math.floor((double) local73 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt1340) {
			arg1 += local83 * (this.anInt1340 - arg0);
			arg0 = this.anInt1340;
		}
		if (arg2 >= this.anInt1327) {
			arg2 = this.anInt1327 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray99[arg0 + local129 * this.anInt1342] = arg4;
					}
				}
				arg1 += local83;
				arg0++;
			}
			return;
		}
		local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
		local129 = 256 - local116;
		while (arg0 <= arg2) {
			local133 = arg1 >> 16;
			local145 = local133 - arg7;
			if (local133 >= local17 && local133 < local32) {
				local226 = arg6 + local5[local145];
				if (arg0 >= local226 && arg0 < local226 + local8[local145]) {
					local243 = arg0 + local133 * this.anInt1342;
					local248 = this.anIntArray99[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray99[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(IIIII)V")
	@Override
	public void method2532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1334 || arg1 >= this.anInt1326) {
			return;
		}
		if (arg0 < this.anInt1340) {
			arg2 -= this.anInt1340 - arg0;
			arg0 = this.anInt1340;
		}
		if (arg0 + arg2 > this.anInt1327) {
			arg2 = this.anInt1327 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1342;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray99[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray99[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray99[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray99[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray99[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!d", name = "G", descriptor = "()V")
	@Override
	public void method2537() {
	}

	@OriginalMember(owner = "client!d", name = "k", descriptor = "()V")
	@Override
	public void method2465() {
		this.aClass41_14.method825();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[[I[[IIII)Lclient!mi;")
	@Override
	public Class149 method2461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class149_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()Z")
	public boolean method1112() {
		return this.aBoolean107;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2525() {
		@Pc(3) Class185 local3 = this.method1114(Thread.currentThread());
		@Pc(6) Class111 local6 = local3.aClass111_2;
		local6.aBoolean248 = false;
		local6.aBoolean248 = false;
		local6.anInt3223 = 0;
		local6.aBoolean246 = true;
		local6.method2761(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!d", name = "h", descriptor = "(I)[I")
	private int[] method1113(@OriginalArg(0) int arg0) {
		@Pc(2) Class41 local2 = this.aClass41_14;
		@Pc(12) Class2_Sub33 local12;
		synchronized (this.aClass41_14) {
			local12 = (Class2_Sub33) this.aClass41_14.method823((long) arg0);
			if (local12 == null) {
				if (!super.anInterface3_4.method1277(arg0)) {
					return null;
				}
				@Pc(32) Class166 local32 = super.anInterface3_4.method1278(arg0);
				@Pc(42) int local42 = local32.aBoolean346 || this.aBoolean109 ? 64 : 128;
				local12 = new Class2_Sub33(arg0, local42, super.anInterface3_4.method1281(arg0, 0.7F, local42, local42), local32.aBoolean345);
				this.aClass41_14.method832((long) arg0, local12);
			}
		}
		local12.aBoolean411 = true;
		return local12.method4895();
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "()I")
	@Override
	public int method2446() {
		return 0;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(II)V")
	@Override
	public void method2492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1337 = arg0;
		this.anInt1312 = arg1;
		this.anInt1331 = this.anInt1312 - 255;
		this.method1117();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2480(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas1 == null || this.aClass77_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt1342 && local21.y <= this.anInt1315 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass77_1.method5043(local21.width, local21.height, local21.x, local14, local21.y);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method2522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1342;
		@Pc(35) int local35 = this.anInt1342 - arg2;
		if (arg1 + arg3 > this.anInt1326) {
			arg3 -= arg1 + arg3 - this.anInt1326;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1334) {
			local59 = this.anInt1334 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1342;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt1327) {
			local59 = arg0 + arg2 - this.anInt1327;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1340) {
			local59 = this.anInt1340 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 = local14 * local59;
			local35 += local59;
		}
		local59 = arg4 >>> 24;
		@Pc(132) int local132 = arg5 >>> 24;
		@Pc(145) int local145;
		@Pc(148) int local148;
		@Pc(155) int local155;
		@Pc(158) int local158;
		if (arg8 == 0 || arg8 == 1 && local59 == 255 && local132 == 255) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					if (arg6[(local6 >> 16) + local155] == 0) {
						this.anIntArray99[local30++] = arg4;
					} else {
						this.anIntArray99[local30++] = arg5;
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(236) int local236;
		@Pc(240) int local240;
		@Pc(245) int local245;
		if (arg8 == 1) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					local236 = local222 >>> 24;
					local240 = 255 - local236;
					local245 = this.anIntArray99[local30];
					this.anIntArray99[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else if (arg8 == 2) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					if (local222 == 0) {
						local30++;
					} else {
						local236 = this.anIntArray99[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray99[local30++] = local240 - local360 | local360 - (local360 >>> 8);
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!d", name = "y", descriptor = "()Z")
	@Override
	public boolean method2515() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!pp;")
	public Class185 method1114(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1330; local1++) {
			if (this.aClass185Array1[local1].aRunnable1 == arg0) {
				return this.aClass185Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!aj;)V")
	@Override
	public void method2489(@OriginalArg(0) Class10 arg0) {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class185 local3 = this.method1114(Thread.currentThread());
		@Pc(6) Class111 local6 = local3.aClass111_2;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(21) int local21 = local10 >= 0 ? local10 : -local10;
		@Pc(28) int local28 = local14 >= 0 ? local14 : -local14;
		@Pc(30) int local30 = local21;
		if (local21 < local28) {
			local30 = local28;
		}
		if (local30 == 0) {
			return;
		}
		@Pc(44) int local44 = (local10 << 16) / local30;
		@Pc(50) int local50 = (local14 << 16) / local30;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(66) int local66 = arg5 * local50 >> 17;
		@Pc(74) int local74 = arg5 * local50 + 1 >> 17;
		@Pc(80) int local80 = arg5 * local44 >> 17;
		@Pc(88) int local88 = arg5 * local44 + 1 >> 17;
		@Pc(93) int local93 = arg0 - local6.method2750();
		@Pc(98) int local98 = arg1 - local6.method2751();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt3223 = 0;
		local6.aBoolean246 = local102 < 0 || local102 > local6.anInt3227 || local106 < 0 || local106 > local6.anInt3227 || local112 < 0 || local112 > local6.anInt3227;
		local6.method2749(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean246 = local102 < 0 || local102 > local6.anInt3227 || local106 < 0 || local106 > local6.anInt3227 || local118 < 0 || local118 > local6.anInt3227;
		local6.method2749(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!d", name = "z", descriptor = "()F")
	@Override
	public float method2517() {
		return this.aFloat5;
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "()Z")
	@Override
	public boolean method2450() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "H", descriptor = "()V")
	@Override
	public void method2538() {
		if (this.aCanvas1 == null || this.aClass77_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			this.aClass77_1.method5044(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)I")
	@Override
	public int method2451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!cd;)V")
	@Override
	public void method2516(@OriginalArg(0) Class34 arg0) {
		@Pc(3) Class7_Sub1 local3 = arg0.aClass180_1.aClass7_Sub1_7;
		for (@Pc(6) Class7_Sub1 local6 = local3.aClass7_Sub1_5; local6 != local3; local6 = local6.aClass7_Sub1_5) {
			@Pc(10) Class7_Sub1_Sub1 local10 = (Class7_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt496 >> 12;
			@Pc(20) int local20 = local10.anInt494 >> 12;
			@Pc(25) int local25 = local10.anInt495 >> 12;
			@Pc(49) int local49 = this.aClass21_Sub2_1.anInt4161 + (this.aClass21_Sub2_1.anInt4165 * local15 + this.aClass21_Sub2_1.anInt4170 * local20 + this.aClass21_Sub2_1.anInt4167 * local25 >> 15);
			if (local49 >= this.anInt1337 && local49 <= this.anInt1312) {
				@Pc(90) int local90 = this.anInt1319 + this.anInt1317 * (this.aClass21_Sub2_1.anInt4159 + (this.aClass21_Sub2_1.anInt4163 * local15 + this.aClass21_Sub2_1.anInt4166 * local20 + this.aClass21_Sub2_1.anInt4168 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt1320 + this.anInt1338 * (this.aClass21_Sub2_1.anInt4160 + (this.aClass21_Sub2_1.anInt4169 * local15 + this.aClass21_Sub2_1.anInt4164 * local20 + this.aClass21_Sub2_1.anInt4162 * local25 >> 15)) / local49;
				if (local90 >= this.anInt1340 && local90 <= this.anInt1327 && local122 >= this.anInt1334 && local122 <= this.anInt1326) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method1111(local10, local90, local122, (local10.anInt497 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(IIII)V")
	@Override
	public void method2485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1322 = arg0;
		this.anInt1332 = arg1;
		this.anInt1336 = arg2;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!bg;[Lclient!km;Z)Lclient!cr;")
	@Override
	public Class44 method2526(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class128[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3865;
			local7[local11] = arg1[local11].anInt3863;
			if (arg1[local11].aByteArray45 != null) {
			}
		}
		return new Class44_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!d", name = "p", descriptor = "()Z")
	@Override
	public boolean method2481() {
		return true;
	}

	@OriginalMember(owner = "client!d", name = "i", descriptor = "(I)I")
	public int method1115(@OriginalArg(0) int arg0) {
		return super.anInterface3_4.method1278(arg0).aShort62 & 0xFFFF;
	}

	@OriginalMember(owner = "client!d", name = "r", descriptor = "()V")
	@Override
	public void method2486() {
	}

	@OriginalMember(owner = "client!d", name = "I", descriptor = "()I")
	@Override
	public int method2539() {
		return this.anInt1337;
	}

	@OriginalMember(owner = "client!d", name = "j", descriptor = "(I)[I")
	public int[] method1116(@OriginalArg(0) int arg0) {
		@Pc(2) Class41 local2 = this.aClass41_14;
		@Pc(12) Class2_Sub33 local12;
		synchronized (this.aClass41_14) {
			local12 = (Class2_Sub33) this.aClass41_14.method823((long) arg0);
			if (local12 == null) {
				if (!super.anInterface3_4.method1277(arg0)) {
					return null;
				}
				@Pc(32) Class166 local32 = super.anInterface3_4.method1278(arg0);
				@Pc(42) int local42 = local32.aBoolean346 || this.aBoolean109 ? 64 : 128;
				local12 = new Class2_Sub33(arg0, local42, super.anInterface3_4.method1279(true, arg0, local42, 0.7F, local42), local32.aBoolean345);
				this.aClass41_14.method832((long) arg0, local12);
			}
		}
		local12.aBoolean411 = true;
		return local12.method4895();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method2467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1334) {
			local8 = this.anInt1334;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1326) {
			local21 = this.anInt1326;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg3 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt1340) {
					local91 = this.anInt1340;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1327) {
					local102 = this.anInt1327;
				}
				local116 = local91 + local30 * this.anInt1342;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray99[local116++] = arg3;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt1340) {
					local91 = this.anInt1340;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1327 - 1) {
					local102 = this.anInt1327 - 1;
				}
				local116 = local91 + local30 * this.anInt1342;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray99[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
		local91 = 256 - local57;
		@Pc(334) int local334;
		@Pc(340) int local340;
		while (local30 < arg1) {
			while (local48 <= local34 || local44 <= local34) {
				local44 += local36 + local36;
				local48 += local36++ + local36;
			}
			local102 = arg0 + 1 - local36;
			if (local102 < this.anInt1340) {
				local102 = this.anInt1340;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt1327) {
				local116 = this.anInt1327;
			}
			local118 = local102 + local30 * this.anInt1342;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray99[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray99[local118++] = local277 + local360;
			}
			local30++;
			local44 -= local40-- + local40;
			local48 -= local40 + local40;
		}
		local36 = arg2;
		local40 = -local40;
		local48 = local40 * local40 + local34;
		local44 = local48 - arg2;
		local48 -= local40;
		while (local30 < local21) {
			while (local48 > local34 && local44 > local34) {
				local48 -= local36-- + local36;
				local44 -= local36 + local36;
			}
			local102 = arg0 - local36;
			if (local102 < this.anInt1340) {
				local102 = this.anInt1340;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt1327 - 1) {
				local116 = this.anInt1327 - 1;
			}
			local118 = local102 + local30 * this.anInt1342;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray99[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray99[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I)Lclient!hg;")
	@Override
	public Class8 method2502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class8_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!d", name = "m", descriptor = "()V")
	@Override
	public void method2471() {
		this.aClass77_1 = Static92.method1557(this.aCanvas1);
		this.anIntArray99 = this.aClass77_1.anIntArray499;
		this.anInt1342 = this.aClass77_1.anInt5685;
		this.anInt1315 = this.aClass77_1.anInt5690;
		for (@Pc(22) int local22 = 0; local22 < this.anInt1330; local22++) {
			this.aClass185Array1[local22].method4581();
		}
		this.method2505();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!wt;)V")
	@Override
	public void method2449(@OriginalArg(0) Class2_Sub44 arg0) {
	}

	@OriginalMember(owner = "client!d", name = "n", descriptor = "()Z")
	@Override
	public boolean method2473() {
		return true;
	}

	@OriginalMember(owner = "client!d", name = "K", descriptor = "()Z")
	@Override
	public boolean method2544() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(Z)V")
	@Override
	public void method2504(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method2532(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method2532(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(104) int local104;
			@Pc(137) int local137;
			@Pc(150) int local150;
			@Pc(213) int local213;
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt1340) {
					arg1 += local104 * (this.anInt1340 - arg0);
					arg0 = this.anInt1340;
				}
				if (arg2 >= this.anInt1327) {
					arg2 = this.anInt1327 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1334 && local150 < this.anInt1326) {
							this.anIntArray99[arg0 + local150 * this.anInt1342] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1334 && local213 < this.anInt1326) {
							local228 = arg0 + local213 * this.anInt1342;
							local233 = this.anIntArray99[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray99[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(357) int local357 = arg2 << 16;
				local104 = (int) Math.floor((double) local357 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt1334) {
					arg0 += local104 * (this.anInt1334 - arg1);
					arg1 = this.anInt1334;
				}
				if (arg3 >= this.anInt1326) {
					arg3 = this.anInt1326 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1340 && local150 < this.anInt1327) {
							this.anIntArray99[local150 + arg1 * this.anInt1342] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1340 && local213 < this.anInt1327) {
							local228 = local213 + arg1 * this.anInt1342;
							local233 = this.anIntArray99[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray99[local213 + arg1 * this.anInt1342] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method2491(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method2491(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[Lclient!hq;)V")
	@Override
	public void method2474(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub8[] arg1) {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method2543(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1341 = (int) (arg1 * 65535.0F);
		this.anInt1329 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1333 = (int) (arg3 * 65535.0F / local26);
		this.anInt1325 = (int) (arg4 * 65535.0F / local26);
		this.anInt1339 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(I)V")
	@Override
	public void method2518(@OriginalArg(0) int arg0) {
		this.aClass185Array1[arg0].method4580(Thread.currentThread());
	}

	@OriginalMember(owner = "client!d", name = "A", descriptor = "()Z")
	@Override
	public boolean method2519() {
		return true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!qh;Lclient!cd;Lclient!bd;Lclient!qt;I)V")
	@Override
	public void method2520(@OriginalArg(0) Class159 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class7_Sub6 arg3) {
		((Class159_Sub1) arg0).method4067(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	@Override
	public void method2478(@OriginalArg(0) int arg0) {
		if (this.anInt1330 == arg0) {
			return;
		}
		this.anInt1330 = arg0;
		this.aClass185Array1 = new Class185[this.anInt1330];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1330; local14++) {
			this.aClass185Array1[local14] = new Class185(this);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()V")
	private void method1117() {
		if (this.aFloat5 == 0.0F) {
			this.anInt1324 = this.anInt1312;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt1312;
		@Pc(12) float local12 = (float) this.anInt1337;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat4 / (this.aFloat5 + this.aFloat4);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat5;
		this.anInt1324 = (int) (((float) this.anInt1312 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!d", name = "h", descriptor = "()Z")
	@Override
	public boolean method2454() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "L", descriptor = "()I")
	@Override
	public int method2546() {
		return 0;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(IIII)V")
	@Override
	public void method2464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIII)Lclient!aj;")
	@Override
	public Class10 method2447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!d", name = "u", descriptor = "()V")
	@Override
	public void method2503() {
	}

	@OriginalMember(owner = "client!d", name = "C", descriptor = "()I")
	@Override
	public int method2528() {
		@Pc(2) int local2 = this.anInt1311;
		this.anInt1311 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!d", name = "k", descriptor = "(I)Z")
	public boolean method1118(@OriginalArg(0) int arg0) {
		return super.anInterface3_4.method1277(arg0);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III[I)V")
	@Override
	public void method2524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass21_Sub2_1.anInt4161 + (this.aClass21_Sub2_1.anInt4165 * arg0 + this.aClass21_Sub2_1.anInt4170 * arg1 + this.aClass21_Sub2_1.anInt4167 * arg2 >> 15);
		if (local23 < this.anInt1337 || local23 > this.anInt1312) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt1317 * (this.aClass21_Sub2_1.anInt4159 + (this.aClass21_Sub2_1.anInt4163 * arg0 + this.aClass21_Sub2_1.anInt4166 * arg1 + this.aClass21_Sub2_1.anInt4168 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt1338 * (this.aClass21_Sub2_1.anInt4160 + (this.aClass21_Sub2_1.anInt4169 * arg0 + this.aClass21_Sub2_1.anInt4164 * arg1 + this.aClass21_Sub2_1.anInt4162 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt1335 && local73 <= this.anInt1321 && local102 >= this.anInt1318 && local102 <= this.anInt1328) {
			arg3[0] = local73 - this.anInt1335;
			arg3[1] = local102 - this.anInt1318;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!d", name = "v", descriptor = "()V")
	@Override
	public void method2505() {
		this.anInt1340 = 0;
		this.anInt1334 = 0;
		this.anInt1327 = this.anInt1342;
		this.anInt1326 = this.anInt1315;
		this.method1122();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!km;Z)Lclient!rg;")
	@Override
	public Class27 method2527(@OriginalArg(0) Class128 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray289;
		@Pc(5) byte[] local5 = arg0.aByteArray46;
		@Pc(8) int local8 = arg0.anInt3865;
		@Pc(11) int local11 = arg0.anInt3863;
		@Pc(76) Class27_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray45 == null) {
			local20 = new int[local2.length];
			local25 = new byte[local8 * local11];
			for (local27 = 0; local27 < local11; local27++) {
				local32 = local27 * local8;
				for (local34 = 0; local34 < local8; local34++) {
					local25[local32 + local34] = local5[local32 + local34];
				}
			}
			for (local32 = 0; local32 < local2.length; local32++) {
				local20[local32] = local2[local32];
			}
			local76 = new Class27_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray45;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class27_Sub1_Sub3(this, local20, local8, local11);
				local76 = new Class27_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class27_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.method5325(arg0.anInt3866, arg0.anInt3864, arg0.anInt3867, arg0.anInt3862);
		return local76;
	}

	@OriginalMember(owner = "client!d", name = "s", descriptor = "()Z")
	@Override
	public boolean method2488() {
		return true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
	@Override
	public int method2448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
	@Override
	public void method2457(@OriginalArg(0) int arg0) {
		this.aClass185Array1[arg0].method4580(null);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1340 < arg0) {
			this.anInt1340 = arg0;
		}
		if (this.anInt1334 < arg1) {
			this.anInt1334 = arg1;
		}
		if (this.anInt1327 > arg2) {
			this.anInt1327 = arg2;
		}
		if (this.anInt1326 > arg3) {
			this.anInt1326 = arg3;
		}
		this.method1122();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!kp;IIII)Lclient!qh;")
	@Override
	public Class159 method2540(@OriginalArg(0) Class130 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class159_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FF)V")
	@Override
	public void method2460(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat4 = arg0;
		this.aFloat5 = arg1;
		this.method1117();
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(IIII)V")
	@Override
	public void method2496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1342) {
			arg2 = this.anInt1342;
		}
		if (arg3 > this.anInt1315) {
			arg3 = this.anInt1315;
		}
		this.anInt1340 = arg0;
		this.anInt1327 = arg2;
		this.anInt1334 = arg1;
		this.anInt1326 = arg3;
		this.method1122();
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1340) {
			arg2 -= this.anInt1340 - arg0;
			arg0 = this.anInt1340;
		}
		if (arg1 < this.anInt1334) {
			arg3 -= this.anInt1334 - arg1;
			arg1 = this.anInt1334;
		}
		if (arg0 + arg2 > this.anInt1327) {
			arg2 = this.anInt1327 - arg0;
		}
		if (arg1 + arg3 > this.anInt1326) {
			arg3 = this.anInt1326 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1327 || arg1 > this.anInt1326) {
			return;
		}
		@Pc(67) int local67 = this.anInt1342 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1342;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(221) int local221;
			if (arg5 == 1) {
				@Pc(205) int local205 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local78 >> 8 & 0xFF00) + (local78 << 24);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local221 = this.anIntArray99[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray99[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray99[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray99[local74++] = local221 - local298 | local298 - (local298 >>> 8);
					}
					local74 += local67;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local90 = arg2 >> 3;
		local94 = arg2 & 0x7;
		arg2 = local74 - 1;
		for (local101 = -arg3; local101 < 0; local101++) {
			if (local90 > 0) {
				arg0 = local90;
				do {
					arg2++;
					this.anIntArray99[arg2] = arg4;
					arg2++;
					this.anIntArray99[arg2] = arg4;
					arg2++;
					this.anIntArray99[arg2] = arg4;
					arg2++;
					this.anIntArray99[arg2] = arg4;
					arg2++;
					this.anIntArray99[arg2] = arg4;
					arg2++;
					this.anIntArray99[arg2] = arg4;
					arg2++;
					this.anIntArray99[arg2] = arg4;
					arg2++;
					this.anIntArray99[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray99[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!aj;Lclient!aj;FLclient!aj;)Lclient!aj;")
	@Override
	public Class10 method2506(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class10 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!d", name = "D", descriptor = "()V")
	@Override
	public void method2529() {
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Lclient!wt;")
	@Override
	public Class2_Sub44 method2466() {
		return null;
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(IIII)V")
	@Override
	public void method2521() {
		this.anInt1316 = this.anInt1332;
		this.anInt1322 = -1;
		this.anInt1332 = 1583160;
		this.anInt1336 = 40;
		this.aBoolean110 = true;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(ILclient!hg;II)V")
	@Override
	public void method2513(@OriginalArg(1) Class8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class8_Sub1 local2 = (Class8_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray18;
		@Pc(8) int[] local8 = local2.anIntArray19;
		@Pc(20) int local20;
		if (this.anInt1326 < arg2 + local5.length) {
			local20 = this.anInt1326 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1334 > arg2) {
			local33 = this.anInt1334 - arg2;
			arg2 = this.anInt1334;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt1342;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1340 > local58) {
				local62 -= this.anInt1340 - local58;
				local58 = this.anInt1340;
			}
			if (this.anInt1327 < local58 + local62) {
				local62 = this.anInt1327 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray99[local58++] = -16777216;
			}
			local49 += this.anInt1342;
		}
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(II)V")
	@Override
	public void method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1332 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt1332 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt1332 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt1332 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt1332 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean108 = false;
		} else {
			this.aBoolean108 = true;
		}
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "(I)Z")
	public boolean method1119(@OriginalArg(0) int arg0) {
		return this.aBoolean109 || super.anInterface3_4.method1278(arg0).aBoolean346;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()Lclient!bd;")
	@Override
	public Class21 method2445() {
		@Pc(3) Class185 local3 = this.method1114(Thread.currentThread());
		return local3.aClass21_Sub2_3;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(IIII)V")
	@Override
	public void method2469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1319 = arg0;
		this.anInt1320 = arg1;
		this.anInt1317 = arg2;
		this.anInt1338 = arg3;
		this.method1122();
	}

	@OriginalMember(owner = "client!d", name = "j", descriptor = "()F")
	@Override
	public float method2462() {
		return this.aFloat4;
	}

	@OriginalMember(owner = "client!d", name = "F", descriptor = "()Z")
	@Override
	public boolean method2535() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "o", descriptor = "()Z")
	@Override
	public boolean method2476() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([IIIII)Lclient!rg;")
	@Override
	public Class27 method2456(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class27_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class27_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class27_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class27_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!d", name = "w", descriptor = "()I")
	@Override
	public int method2508() {
		return this.anInt1312;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()V")
	private void method1120() {
		this.aClass41_14 = new Class41(20);
		this.aClass21_Sub2_1 = new Class21_Sub2();
		Static119.method2125(false);
		this.aBoolean106 = true;
		this.method2478(1);
		this.method2518(0);
		this.method2505();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2472(@OriginalArg(0) Canvas arg0) {
		this.aCanvas1 = arg0;
		this.method2471();
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IIII)[I")
	@Override
	public int[] method2463() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt1342;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray99[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!d", name = "J", descriptor = "()Z")
	@Override
	public boolean method2542() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2531(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method2534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2532(arg0, arg1, arg2, arg4, arg5);
		this.method2532(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method2491(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method2491(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!d", name = "i", descriptor = "()Z")
	@Override
	public boolean method2459() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(F)V")
	@Override
	public void method2498(@OriginalArg(0) float arg0) {
		this.anInt1323 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!d", name = "E", descriptor = "()V")
	@Override
	public void method2533() {
		this.anInt1332 = this.anInt1316;
		this.aBoolean110 = false;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(IIIIII)Z")
	@Override
	public boolean method2497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass21_Sub2_1.anInt4165 * arg0 + this.aClass21_Sub2_1.anInt4170 * arg1 + this.aClass21_Sub2_1.anInt4167 * arg2 >> 15) + this.aClass21_Sub2_1.anInt4161;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass21_Sub2_1.anInt4165 * arg3 + this.aClass21_Sub2_1.anInt4170 * arg4 + this.aClass21_Sub2_1.anInt4167 * arg5 >> 15) + this.aClass21_Sub2_1.anInt4161;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt1337 && local52 < this.anInt1337 || !(local23 <= this.anInt1312 || local52 <= this.anInt1312)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt1317 * ((this.aClass21_Sub2_1.anInt4163 * arg0 + this.aClass21_Sub2_1.anInt4166 * arg1 + this.aClass21_Sub2_1.anInt4168 * arg2 >> 15) + this.aClass21_Sub2_1.anInt4159) / local23;
		@Pc(133) int local133 = this.anInt1317 * ((this.aClass21_Sub2_1.anInt4163 * arg3 + this.aClass21_Sub2_1.anInt4166 * arg4 + this.aClass21_Sub2_1.anInt4168 * arg5 >> 15) + this.aClass21_Sub2_1.anInt4159) / local52;
		if (local104 < this.anInt1335 && local133 < this.anInt1335 || local104 > this.anInt1321 && local133 > this.anInt1321) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt1338 * ((this.aClass21_Sub2_1.anInt4169 * arg0 + this.aClass21_Sub2_1.anInt4164 * arg1 + this.aClass21_Sub2_1.anInt4162 * arg2 >> 15) + this.aClass21_Sub2_1.anInt4160) / local23;
			@Pc(209) int local209 = this.anInt1338 * ((this.aClass21_Sub2_1.anInt4169 * arg3 + this.aClass21_Sub2_1.anInt4164 * arg4 + this.aClass21_Sub2_1.anInt4162 * arg5 >> 15) + this.aClass21_Sub2_1.anInt4160) / local52;
			return (local180 >= this.anInt1318 || local209 >= this.anInt1318) && (local180 <= this.anInt1328 || local209 <= this.anInt1328);
		}
	}

	@OriginalMember(owner = "client!d", name = "g", descriptor = "()Z")
	@Override
	public boolean method2453() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(IIIII)V")
	@Override
	public void method2491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1340 || arg0 >= this.anInt1327) {
			return;
		}
		if (arg1 < this.anInt1334) {
			arg2 -= this.anInt1334 - arg1;
			arg1 = this.anInt1334;
		}
		if (arg1 + arg2 > this.anInt1326) {
			arg2 = this.anInt1326 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1342;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray99[local40 + local54 * this.anInt1342] = arg3;
			}
			return;
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local103 = 0; local103 < arg2; local103++) {
				local111 = local40 + local103 * this.anInt1342;
				local116 = this.anIntArray99[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray99[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1342;
				local111 = this.anIntArray99[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray99[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([Lclient!qh;Lclient!cd;Lclient!bd;[Lclient!qt;I)V")
	@Override
	public void method2541(@OriginalArg(0) Class159[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class7_Sub6[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class159_Sub1[] local3 = new Class159_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class159_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class159_Sub1 local26 = Static225.method4079(this, local3);
		local26.method4067(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!d", name = "m", descriptor = "(I)Z")
	public boolean method1121(@OriginalArg(0) int arg0) {
		return super.anInterface3_4.method1278(arg0).aBoolean342;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([I)V")
	@Override
	public void method2495(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1340;
		arg0[1] = this.anInt1334;
		arg0[2] = this.anInt1327;
		arg0[3] = this.anInt1326;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([Lclient!qh;Lclient!bd;[Lclient!qt;I)V")
	@Override
	public void method2477(@OriginalArg(0) Class159[] arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) Class7_Sub6[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class159_Sub1[] local3 = new Class159_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class159_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class159_Sub1 local26 = Static225.method4079(this, local3);
		local26.method4067(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!d", name = "M", descriptor = "()V")
	private void method1122() {
		this.anInt1335 = this.anInt1340 - this.anInt1319;
		this.anInt1321 = this.anInt1327 - this.anInt1319;
		this.anInt1318 = this.anInt1334 - this.anInt1320;
		this.anInt1328 = this.anInt1326 - this.anInt1320;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1330; local29++) {
			@Pc(36) Class111 local36 = this.aClass185Array1[local29].aClass111_2;
			local36.anInt3228 = this.anInt1319 - this.anInt1340;
			local36.anInt3225 = this.anInt1320 - this.anInt1334;
			local36.anInt3227 = this.anInt1327 - this.anInt1340;
			local36.anInt3224 = this.anInt1326 - this.anInt1334;
		}
		@Pc(78) int local78 = this.anInt1334 * this.anInt1342 + this.anInt1340;
		for (@Pc(81) int local81 = this.anInt1334; local81 < this.anInt1326; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1330; local84++) {
				this.aClass185Array1[local84].aClass111_2.anIntArray253[local81 - this.anInt1334] = local78;
			}
			local78 += this.anInt1342;
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)V")
	@Override
	public void method2499(@OriginalArg(0) boolean arg0) {
		this.aBoolean109 = arg0;
		this.aClass41_14.method825();
	}

	@OriginalMember(owner = "client!d", name = "l", descriptor = "()V")
	@Override
	protected void method2468() {
		if (this.aBoolean106) {
			Static206.method3768(false);
			this.aBoolean106 = false;
		}
		this.aCanvas1 = null;
		this.aClass77_1 = null;
		this.aBoolean107 = true;
	}

	@OriginalMember(owner = "client!d", name = "t", descriptor = "()Z")
	@Override
	public boolean method2500() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "x", descriptor = "()Z")
	@Override
	public boolean method2511() {
		return false;
	}

	@OriginalMember(owner = "client!d", name = "B", descriptor = "()I")
	@Override
	public int method2523() {
		@Pc(2) int local2 = this.anInt1313;
		this.anInt1313 = 0;
		return local2;
	}
}
