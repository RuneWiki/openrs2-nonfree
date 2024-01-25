import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class51_Sub1 extends Class51 {

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "Lclient!mt;")
	private Class164 aClass164_8;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "Lclient!gw;")
	private Class7_Sub5 aClass7_Sub5_1;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "Z")
	private boolean aBoolean76;

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
	private int anInt1271;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "Z")
	private boolean aBoolean77;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
	public int anInt1272;

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "F")
	private float aFloat34;

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
	public int anInt1273;

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
	public int anInt1274;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
	public int anInt1275;

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "Lclient!ct;")
	public Class33_Sub1 aClass33_Sub1_1;

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
	public int anInt1276;

	@OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
	public int anInt1277;

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
	public int anInt1278;

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
	private int anInt1279;

	@OriginalMember(owner = "client!dg", name = "J", descriptor = "F")
	private float aFloat35;

	@OriginalMember(owner = "client!dg", name = "K", descriptor = "Z")
	public boolean aBoolean78;

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
	private int anInt1280;

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
	public int anInt1281;

	@OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
	public int anInt1282;

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
	public int anInt1283;

	@OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
	public int anInt1284;

	@OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
	private int anInt1285;

	@OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
	public int anInt1286;

	@OriginalMember(owner = "client!dg", name = "S", descriptor = "Lclient!l;")
	private Class11 aClass11_4;

	@OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
	public int anInt1287;

	@OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
	public int anInt1288;

	@OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
	public int anInt1289;

	@OriginalMember(owner = "client!dg", name = "W", descriptor = "Lclient!jo;")
	private final Class126 aClass126_9;

	@OriginalMember(owner = "client!dg", name = "X", descriptor = "[Lclient!gg;")
	private Class90[] aClass90Array1;

	@OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
	public int anInt1290;

	@OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
	public int anInt1291;

	@OriginalMember(owner = "client!dg", name = "ab", descriptor = "Z")
	private boolean aBoolean79;

	@OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
	public int anInt1292;

	@OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
	public int anInt1293;

	@OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
	public int anInt1294;

	@OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
	private int anInt1295;

	@OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
	public int anInt1296;

	@OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
	public int anInt1297;

	@OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
	public int anInt1298;

	@OriginalMember(owner = "client!dg", name = "ib", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
	public int anInt1299;

	@OriginalMember(owner = "client!dg", name = "kb", descriptor = "I")
	public int anInt1300;

	@OriginalMember(owner = "client!dg", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!dg", name = "mb", descriptor = "Lclient!jo;")
	private final Class126 aClass126_10;

	@OriginalMember(owner = "client!dg", name = "nb", descriptor = "Z")
	public boolean aBoolean80;

	@OriginalMember(owner = "client!dg", name = "ob", descriptor = "I")
	private int anInt1301;

	@OriginalMember(owner = "client!dg", name = "pb", descriptor = "I")
	private int anInt1302;

	@OriginalMember(owner = "client!dg", name = "qb", descriptor = "Lclient!l;")
	private Class11 aClass11_5;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;)V")
	public Class51_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2) {
		this(arg0, arg2);
		this.method5330(arg1);
		this.method5314(arg1);
	}

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(ILclient!ga;)V")
	private Class51_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
		this.aBoolean76 = false;
		this.aBoolean77 = false;
		this.aClass164_8 = new Class164(4);
		this.anInt1276 = 512;
		this.anInt1289 = 75518;
		this.anInt1281 = 0;
		this.anInt1278 = 512;
		this.anInt1283 = 3500;
		this.anInt1285 = 3500;
		this.anInt1287 = this.anInt1285 - 255;
		this.anInt1299 = 78642;
		this.anInt1296 = 0;
		this.anInt1295 = 0;
		this.anInt1294 = 0;
		this.anInt1279 = 0;
		this.anInt1293 = 0;
		this.anInt1273 = 0;
		this.anInt1282 = 45823;
		this.aBoolean79 = false;
		this.anInt1297 = 0;
		this.anInt1300 = 50;
		this.aBoolean80 = false;
		this.anInt1301 = 0;
		this.anInt1298 = 0;
		this.aClass126_9 = new Class126(16);
		this.anInt1302 = -1;
		this.aClass126_10 = new Class126(20);
		this.aClass33_Sub1_1 = new Class33_Sub1();
		this.method5340(1);
		this.method5341(0);
		Static394.method5010(false, true);
		this.aBoolean77 = true;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5314(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas2 = null;
			this.aClass7_Sub5_1 = null;
			if (this.aClass11_4 == null) {
				this.anIntArray97 = null;
				this.anInt1284 = this.anInt1280 = 1;
				this.method1128();
			}
			return;
		}
		@Pc(10) Class7_Sub5 local10 = (Class7_Sub5) this.aClass164_8.method3512((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas2 = arg0;
		this.aClass7_Sub5_1 = local10;
		if (this.aClass11_4 != null) {
			return;
		}
		this.anIntArray97 = local10.anIntArray577;
		this.anInt1284 = local10.anInt6466;
		this.anInt1280 = local10.anInt6469;
		this.method1128();
		return;
	}

	@OriginalMember(owner = "client!dg", name = "T", descriptor = "(IFFFFF)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1282 = (int) (arg1 * 65535.0F);
		this.anInt1299 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1277 = (int) (arg3 * 65535.0F / local26);
		this.anInt1272 = (int) (arg4 * 65535.0F / local26);
		this.anInt1292 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!qs;)V")
	@Override
	public void method5344(@OriginalArg(0) Class96 arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "()Z")
	@Override
	public boolean method5305() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
	@Override
	public void method5306(@OriginalArg(0) int arg0) {
		this.aClass90Array1[arg0].method2097(null);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	@Override
	public void method5279(@OriginalArg(0) boolean arg0) {
		this.aBoolean79 = arg0;
		this.aClass126_10.method2827();
	}

	@OriginalMember(owner = "client!dg", name = "DA", descriptor = "(IIIIII[BII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1284;
		@Pc(35) int local35 = this.anInt1284 - arg2;
		if (arg1 + arg3 > this.anInt1297) {
			arg3 -= arg1 + arg3 - this.anInt1297;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1281) {
			local59 = this.anInt1281 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1284;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt1273) {
			local59 = arg0 + arg2 - this.anInt1273;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1298) {
			local59 = this.anInt1298 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 += local14 * local59;
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
						this.anIntArray97[local30++] = arg4;
					} else {
						this.anIntArray97[local30++] = arg5;
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
					local245 = this.anIntArray97[local30];
					this.anIntArray97[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray97[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray97[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "(F)V")
	@Override
	public void B(@OriginalArg(0) float arg0) {
		this.anInt1289 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class90 local3 = this.method1132(Thread.currentThread());
		@Pc(6) Class31 local6 = local3.aClass31_1;
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
		@Pc(93) int local93 = arg0 - local6.method531();
		@Pc(98) int local98 = arg1 - local6.method534();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt658 = 0;
		local6.aBoolean34 = local102 < 0 || local102 > local6.anInt657 || local106 < 0 || local106 > local6.anInt657 || local112 < 0 || local112 > local6.anInt657;
		local6.method533(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean34 = local102 < 0 || local102 > local6.anInt657 || local106 < 0 || local106 > local6.anInt657 || local118 < 0 || local118 > local6.anInt657;
		local6.method533(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIF)Lclient!wr;")
	@Override
	public Class7_Sub30 method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "()I")
	@Override
	public int method5290() {
		return 0;
	}

	@OriginalMember(owner = "client!dg", name = "ea", descriptor = "(Lclient!c;)V")
	@Override
	public void ea(@OriginalArg(0) Class33 arg0) {
		this.aClass33_Sub1_1 = (Class33_Sub1) arg0;
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5330(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class7_Sub5 local8 = (Class7_Sub5) this.aClass164_8.method3512((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static113.method1928(arg0);
			this.aClass164_8.method3508((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!dg", name = "da", descriptor = "([I)V")
	@Override
	public void da(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1298;
		arg0[1] = this.anInt1281;
		arg0[2] = this.anInt1273;
		arg0[3] = this.anInt1297;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1281 || arg1 >= this.anInt1297) {
			return;
		}
		if (arg0 < this.anInt1298) {
			arg2 -= this.anInt1298 - arg0;
			arg0 = this.anInt1298;
		}
		if (arg0 + arg2 > this.anInt1273) {
			arg2 = this.anInt1273 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1284;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray97[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray97[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray97[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray97[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray97[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "()V")
	@Override
	public void method5302() {
	}

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "()Lclient!c;")
	@Override
	public Class33 method5293() {
		return new Class33_Sub1();
	}

	@OriginalMember(owner = "client!dg", name = "TA", descriptor = "(IIIII)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1298 || arg0 >= this.anInt1273) {
			return;
		}
		if (arg1 < this.anInt1281) {
			arg2 -= this.anInt1281 - arg1;
			arg1 = this.anInt1281;
		}
		if (arg1 + arg2 > this.anInt1297) {
			arg2 = this.anInt1297 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1284;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray97[local40 + local54 * this.anInt1284] = arg3;
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
				local111 = local40 + local103 * this.anInt1284;
				local116 = this.anIntArray97[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray97[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1284;
				local111 = this.anIntArray97[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray97[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "()Z")
	@Override
	public boolean method5326() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt1300;
	}

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "(I)Z")
	public boolean method1122(@OriginalArg(0) int arg0) {
		return super.anInterface4_8.method3138(arg0).aBoolean361;
	}

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "()Z")
	public boolean method1123() {
		return this.aBoolean76;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!pv;)V")
	@Override
	public void method5311(@OriginalArg(0) Class201 arg0) {
		@Pc(3) Class28_Sub1 local3 = arg0.aClass232_1.aClass28_Sub1_7;
		for (@Pc(6) Class28_Sub1 local6 = local3.aClass28_Sub1_10; local6 != local3; local6 = local6.aClass28_Sub1_10) {
			@Pc(10) Class28_Sub1_Sub1 local10 = (Class28_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt4770 >> 12;
			@Pc(20) int local20 = local10.anInt4763 >> 12;
			@Pc(25) int local25 = local10.anInt4765 >> 12;
			@Pc(49) int local49 = this.aClass33_Sub1_1.anInt1076 + (this.aClass33_Sub1_1.anInt1075 * local15 + this.aClass33_Sub1_1.anInt1073 * local20 + this.aClass33_Sub1_1.anInt1078 * local25 >> 15);
			if (local49 >= this.anInt1300 && local49 <= this.anInt1287) {
				@Pc(90) int local90 = this.anInt1288 + this.anInt1278 * (this.aClass33_Sub1_1.anInt1080 + (this.aClass33_Sub1_1.anInt1077 * local15 + this.aClass33_Sub1_1.anInt1082 * local20 + this.aClass33_Sub1_1.anInt1079 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt1275 + this.anInt1276 * (this.aClass33_Sub1_1.anInt1081 + (this.aClass33_Sub1_1.anInt1072 * local15 + this.aClass33_Sub1_1.anInt1074 * local20 + this.aClass33_Sub1_1.anInt1083 * local25 >> 15)) / local49;
				if (local90 >= this.anInt1298 && local90 <= this.anInt1273 && local122 >= this.anInt1281 && local122 <= this.anInt1297) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method1133(local10, local90, local122, (local10.anInt4760 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
	@Override
	public void method5340(@OriginalArg(0) int arg0) {
		if (this.anInt1290 == arg0) {
			return;
		}
		this.anInt1290 = arg0;
		this.aClass90Array1 = new Class90[this.anInt1290];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1290; local14++) {
			this.aClass90Array1[local14] = new Class90(this);
		}
	}

	@OriginalMember(owner = "client!dg", name = "JA", descriptor = "(IIIIII)Z")
	@Override
	public boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass33_Sub1_1.anInt1075 * arg0 + this.aClass33_Sub1_1.anInt1073 * arg1 + this.aClass33_Sub1_1.anInt1078 * arg2 >> 15) + this.aClass33_Sub1_1.anInt1076;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass33_Sub1_1.anInt1075 * arg3 + this.aClass33_Sub1_1.anInt1073 * arg4 + this.aClass33_Sub1_1.anInt1078 * arg5 >> 15) + this.aClass33_Sub1_1.anInt1076;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt1300 && local52 < this.anInt1300 || !(local23 <= this.anInt1285 || local52 <= this.anInt1285)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt1278 * ((this.aClass33_Sub1_1.anInt1077 * arg0 + this.aClass33_Sub1_1.anInt1082 * arg1 + this.aClass33_Sub1_1.anInt1079 * arg2 >> 15) + this.aClass33_Sub1_1.anInt1080) / local23;
		@Pc(133) int local133 = this.anInt1278 * ((this.aClass33_Sub1_1.anInt1077 * arg3 + this.aClass33_Sub1_1.anInt1082 * arg4 + this.aClass33_Sub1_1.anInt1079 * arg5 >> 15) + this.aClass33_Sub1_1.anInt1080) / local52;
		if (local104 < this.anInt1291 && local133 < this.anInt1291 || local104 > this.anInt1286 && local133 > this.anInt1286) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt1276 * ((this.aClass33_Sub1_1.anInt1072 * arg0 + this.aClass33_Sub1_1.anInt1074 * arg1 + this.aClass33_Sub1_1.anInt1083 * arg2 >> 15) + this.aClass33_Sub1_1.anInt1081) / local23;
			@Pc(209) int local209 = this.anInt1276 * ((this.aClass33_Sub1_1.anInt1072 * arg3 + this.aClass33_Sub1_1.anInt1074 * arg4 + this.aClass33_Sub1_1.anInt1083 * arg5 >> 15) + this.aClass33_Sub1_1.anInt1081) / local52;
			return (local180 >= this.anInt1274 || local209 >= this.anInt1274) && (local180 <= this.lb || local209 <= this.lb);
		}
	}

	@OriginalMember(owner = "client!dg", name = "A", descriptor = "()Z")
	@Override
	public boolean method5348() {
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "(I)[I")
	private int[] method1124(@OriginalArg(0) int arg0) {
		@Pc(2) Class126 local2 = this.aClass126_10;
		@Pc(12) Class7_Sub38 local12;
		synchronized (this.aClass126_10) {
			local12 = (Class7_Sub38) this.aClass126_10.method2822((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_8.method3140(arg0)) {
					return null;
				}
				@Pc(32) Class203 local32 = super.anInterface4_8.method3138(arg0);
				@Pc(42) int local42 = local32.aBoolean365 || this.aBoolean79 ? 64 : 128;
				local12 = new Class7_Sub38(arg0, local42, super.anInterface4_8.method3139(0.7F, arg0, local42, local42), local32.aBoolean364);
				this.aClass126_10.method2824((long) arg0, local12);
			}
		}
		local12.aBoolean377 = true;
		return local12.method4520();
	}

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "(I)Z")
	public boolean method1125(@OriginalArg(0) int arg0) {
		return this.aBoolean79 || super.anInterface4_8.method3138(arg0).aBoolean365;
	}

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "()Z")
	@Override
	public boolean method5337() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "(I)Lclient!u;")
	@Override
	public Class7_Sub40 method5347(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "()Z")
	@Override
	public boolean method5328() {
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method5289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.b(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.b(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt1298) {
					arg1 += local104 * (this.anInt1298 - arg0);
					arg0 = this.anInt1298;
				}
				if (arg2 >= this.anInt1273) {
					arg2 = this.anInt1273 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1281 && local150 < this.anInt1297) {
							this.anIntArray97[arg0 + local150 * this.anInt1284] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1281 && local213 < this.anInt1297) {
							local228 = arg0 + local213 * this.anInt1284;
							local233 = this.anIntArray97[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray97[local228] = local204 + local233;
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
				if (arg1 < this.anInt1281) {
					arg0 += local104 * (this.anInt1281 - arg1);
					arg1 = this.anInt1281;
				}
				if (arg3 >= this.anInt1297) {
					arg3 = this.anInt1297 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1298 && local150 < this.anInt1273) {
							this.anIntArray97[local150 + arg1 * this.anInt1284] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1298 && local213 < this.anInt1273) {
							local228 = local213 + arg1 * this.anInt1284;
							local233 = this.anIntArray97[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray97[local213 + arg1 * this.anInt1284] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.TA(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.TA(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "(I)[I")
	public int[] method1126(@OriginalArg(0) int arg0) {
		@Pc(2) Class126 local2 = this.aClass126_10;
		@Pc(12) Class7_Sub38 local12;
		synchronized (this.aClass126_10) {
			local12 = (Class7_Sub38) this.aClass126_10.method2822((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_8.method3140(arg0)) {
					return null;
				}
				@Pc(32) Class203 local32 = super.anInterface4_8.method3138(arg0);
				@Pc(42) int local42 = local32.aBoolean365 || this.aBoolean79 ? 64 : 128;
				local12 = new Class7_Sub38(arg0, local42, super.anInterface4_8.method3142(true, local42, 0.7F, arg0, local42), local32.aBoolean364);
				this.aClass126_10.method2824((long) arg0, local12);
			}
		}
		local12.aBoolean377 = true;
		return local12.method4520();
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
	@Override
	public void method5341(@OriginalArg(0) int arg0) {
		this.aClass90Array1[arg0].method2097(Thread.currentThread());
	}

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "()Z")
	@Override
	public boolean method5327() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "W", descriptor = "()F")
	@Override
	public float W() {
		return this.aFloat35;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!qs;Lclient!qs;FLclient!qs;)Lclient!qs;")
	@Override
	public Class96 method5320(@OriginalArg(0) Class96 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class96 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "()Z")
	@Override
	public boolean method5342() {
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "B", descriptor = "()Z")
	@Override
	public boolean method5350() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		@Pc(2) int local2 = this.anInt1301;
		this.anInt1301 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.b(arg0, arg1, arg2, arg4, arg5);
		this.b(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.TA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.TA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!dg", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "(IIII)[I")
	@Override
	public int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt1284 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray97[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(FF)V")
	@Override
	public void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat35 = arg0;
		this.aFloat34 = arg1;
		this.method1127();
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "()V")
	@Override
	public void method5278() {
	}

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "()V")
	@Override
	public void method5292() {
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5343(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas2 == null || this.aClass7_Sub5_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas2.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt1284 && local21.y <= this.anInt1280 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass7_Sub5_1.method5132(local14, local21.y, local21.x, local21.width, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!io;IIII)Lclient!t;")
	@Override
	public Class163 method5346(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class163_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([Lclient!t;Lclient!pv;Lclient!c;[Lclient!qb;I)V")
	@Override
	public void method5322(@OriginalArg(0) Class163[] arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class28_Sub6[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class163_Sub1[] local3 = new Class163_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class163_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class163_Sub1 local26 = Static260.method3490(this, local3);
		local26.method3496(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5298(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			this.method5314(null);
		}
		@Pc(15) Class7_Sub5 local15 = (Class7_Sub5) this.aClass164_8.method3512((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5802();
		}
	}

	@OriginalMember(owner = "client!dg", name = "E", descriptor = "()V")
	private void method1127() {
		if (this.aFloat34 == 0.0F) {
			this.anInt1283 = this.anInt1285;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt1285;
		@Pc(12) float local12 = (float) this.anInt1300;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat35 / (this.aFloat34 + this.aFloat35);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat34;
		this.anInt1283 = (int) (((float) this.anInt1285 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!dg", name = "OA", descriptor = "(IIII)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1284) {
			arg2 = this.anInt1284;
		}
		if (arg3 > this.anInt1280) {
			arg3 = this.anInt1280;
		}
		this.anInt1298 = arg0;
		this.anInt1273 = arg2;
		this.anInt1281 = arg1;
		this.anInt1297 = arg3;
		this.method1131();
	}

	@OriginalMember(owner = "client!dg", name = "NA", descriptor = "(IIIII)V")
	@Override
	protected void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1281) {
			local8 = this.anInt1281;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1297) {
			local21 = this.anInt1297;
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
		if (arg4 == 0 || arg4 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt1298) {
					local91 = this.anInt1298;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1273) {
					local102 = this.anInt1273;
				}
				local116 = local91 + local30 * this.anInt1284;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray97[local116++] = arg3;
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
				if (local91 < this.anInt1298) {
					local91 = this.anInt1298;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1273 - 1) {
					local102 = this.anInt1273 - 1;
				}
				local116 = local91 + local30 * this.anInt1284;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray97[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(334) int local334;
		@Pc(340) int local340;
		if (arg4 == 1) {
			@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt1298) {
					local102 = this.anInt1298;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1273) {
					local116 = this.anInt1273;
				}
				local118 = local102 + local30 * this.anInt1284;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray97[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray97[local118++] = local277 + local340;
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
				if (local102 < this.anInt1298) {
					local102 = this.anInt1298;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1273 - 1) {
					local116 = this.anInt1273 - 1;
				}
				local118 = local102 + local30 * this.anInt1284;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray97[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray97[local118++] = local277 + local340;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg4 == 2) {
			@Pc(593) int local593;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt1298) {
					local91 = this.anInt1298;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1273) {
					local102 = this.anInt1273;
				}
				local116 = local91 + local30 * this.anInt1284;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray97[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray97[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				local91 = arg0 - local36;
				if (local91 < this.anInt1298) {
					local91 = this.anInt1298;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1273 - 1) {
					local102 = this.anInt1273 - 1;
				}
				local116 = local91 + local30 * this.anInt1284;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray97[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray97[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dg", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1296 = arg0;
		this.anInt1294 = arg1;
		this.anInt1293 = arg2;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5309(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class7_Sub5 local8 = (Class7_Sub5) this.aClass164_8.method3512((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method5802();
		local8 = Static113.method1928(arg0);
		this.aClass164_8.method3508((long) arg0.hashCode(), local8);
		if (this.aCanvas2 != arg0 || this.aClass11_4 != null) {
			return;
		}
		this.aClass7_Sub5_1 = local8;
		this.anIntArray97 = local8.anIntArray577;
		this.anInt1284 = local8.anInt6466;
		this.anInt1280 = local8.anInt6469;
		this.method1128();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class119 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class119_Sub1 local2 = (Class119_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray292;
		@Pc(8) int[] local8 = local2.anIntArray290;
		@Pc(17) int local17 = this.anInt1281 > arg7 ? this.anInt1281 : arg7;
		@Pc(32) int local32 = this.anInt1297 < arg7 + local5.length ? this.anInt1297 : arg7 + local5.length;
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
					if (local129 >= this.anInt1298 && local129 < this.anInt1273 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray97[local129 + arg1 * this.anInt1284] = arg4;
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
					if (local133 >= this.anInt1298 && local133 < this.anInt1273 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1284;
						local248 = this.anIntArray97[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray97[local133 + arg1 * this.anInt1284] = local201 + local584;
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
		if (arg0 < this.anInt1298) {
			arg1 += local83 * (this.anInt1298 - arg0);
			arg0 = this.anInt1298;
		}
		if (arg2 >= this.anInt1273) {
			arg2 = this.anInt1273 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray97[arg0 + local129 * this.anInt1284] = arg4;
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
					local243 = arg0 + local133 * this.anInt1284;
					local248 = this.anIntArray97[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray97[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "()Z")
	@Override
	public boolean method5307() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5297() {
		@Pc(3) Class90 local3 = this.method1132(Thread.currentThread());
		@Pc(6) Class31 local6 = local3.aClass31_1;
		local6.aBoolean31 = false;
		local6.aBoolean31 = false;
		local6.anInt658 = 0;
		local6.aBoolean34 = true;
		local6.method543(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean31 = true;
	}

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "()V")
	private void method1128() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1290; local1++) {
			this.aClass90Array1[local1].method2098();
		}
		this.e();
	}

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "()V")
	@Override
	protected void method5338() {
		if (this.aBoolean77) {
			Static388.method4970(true, false);
			this.aBoolean77 = false;
		}
		this.aClass7_Sub5_1 = null;
		this.aCanvas2 = null;
		this.aClass164_8 = null;
		this.aBoolean76 = true;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class11 method5310(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class11_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class11_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class11_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class11_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "()V")
	@Override
	public void method5353() {
		if (this.aCanvas2 == null || this.aClass7_Sub5_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas2.getGraphics();
			this.aClass7_Sub5_1.method5130(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "(IIIIII)Lclient!qs;")
	@Override
	public Class96 method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "()Z")
	@Override
	public boolean method5317() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method5336(@OriginalArg(0) Class7_Sub40 arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "()I")
	@Override
	public int w() {
		@Pc(2) int local2 = this.anInt1295;
		this.anInt1295 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!dg", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return 0;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)I")
	@Override
	public int method5352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!dg", name = "O", descriptor = "(IIIIII)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1298) {
			arg2 -= this.anInt1298 - arg0;
			arg0 = this.anInt1298;
		}
		if (arg1 < this.anInt1281) {
			arg3 -= this.anInt1281 - arg1;
			arg1 = this.anInt1281;
		}
		if (arg0 + arg2 > this.anInt1273) {
			arg2 = this.anInt1273 - arg0;
		}
		if (arg1 + arg3 > this.anInt1297) {
			arg3 = this.anInt1297 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1273 || arg1 > this.anInt1297) {
			return;
		}
		@Pc(67) int local67 = this.anInt1284 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1284;
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
						local221 = this.anIntArray97[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray97[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray97[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray97[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray97[arg2] = arg4;
					arg2++;
					this.anIntArray97[arg2] = arg4;
					arg2++;
					this.anIntArray97[arg2] = arg4;
					arg2++;
					this.anIntArray97[arg2] = arg4;
					arg2++;
					this.anIntArray97[arg2] = arg4;
					arg2++;
					this.anIntArray97[arg2] = arg4;
					arg2++;
					this.anIntArray97[arg2] = arg4;
					arg2++;
					this.anIntArray97[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray97[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "()Z")
	@Override
	public boolean method5284() {
		return true;
	}

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "()V")
	@Override
	public void e() {
		this.anInt1298 = 0;
		this.anInt1281 = 0;
		this.anInt1273 = this.anInt1284;
		this.anInt1297 = this.anInt1280;
		this.method1131();
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
	@Override
	public void method5331(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!qb;I)V")
	@Override
	public void method5334(@OriginalArg(0) Class163[] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class28_Sub6[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class163_Sub1[] local3 = new Class163_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class163_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class163_Sub1 local26 = Static260.method3490(this, local3);
		local26.method3496(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!ul;Z)Lclient!l;")
	@Override
	public Class11 method5308(@OriginalArg(0) Class246 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray578;
		@Pc(5) byte[] local5 = arg0.aByteArray90;
		@Pc(8) int local8 = arg0.anInt6476;
		@Pc(11) int local11 = arg0.anInt6475;
		@Pc(76) Class11_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray89 == null) {
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
			local76 = new Class11_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray89;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class11_Sub1_Sub2(this, local20, local8, local11);
				local76 = new Class11_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class11_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.MA(arg0.anInt6473, arg0.anInt6478, arg0.anInt6474, arg0.anInt6477);
		return local76;
	}

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "()Z")
	@Override
	public boolean method5301() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "ia", descriptor = "(II)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1300 = arg0;
		this.anInt1285 = arg1;
		this.anInt1287 = this.anInt1285 - 255;
		this.method1127();
	}

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "(I)I")
	public int method1129(@OriginalArg(0) int arg0) {
		return super.anInterface4_8.method3138(arg0).aShort67 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "()Lclient!c;")
	@Override
	public Class33 method5285() {
		@Pc(3) Class90 local3 = this.method1132(Thread.currentThread());
		return local3.aClass33_Sub1_2;
	}

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "()Z")
	@Override
	public boolean method5316() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "X", descriptor = "(III[I)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass33_Sub1_1.anInt1076 + (this.aClass33_Sub1_1.anInt1075 * arg0 + this.aClass33_Sub1_1.anInt1073 * arg1 + this.aClass33_Sub1_1.anInt1078 * arg2 >> 15);
		if (local23 < this.anInt1300 || local23 > this.anInt1285) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt1278 * (this.aClass33_Sub1_1.anInt1080 + (this.aClass33_Sub1_1.anInt1077 * arg0 + this.aClass33_Sub1_1.anInt1082 * arg1 + this.aClass33_Sub1_1.anInt1079 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt1276 * (this.aClass33_Sub1_1.anInt1081 + (this.aClass33_Sub1_1.anInt1072 * arg0 + this.aClass33_Sub1_1.anInt1074 * arg1 + this.aClass33_Sub1_1.anInt1083 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt1291 && local73 <= this.anInt1286 && local102 >= this.anInt1274 && local102 <= this.lb) {
			arg3[0] = local73 - this.anInt1291;
			arg3[1] = local102 - this.anInt1274;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5282(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "()Z")
	@Override
	public boolean method5295() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(Z)V")
	@Override
	public void method5333(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "(IIII)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1288 = arg0;
		this.anInt1275 = arg1;
		this.anInt1278 = arg2;
		this.anInt1276 = arg3;
		this.method1131();
	}

	@OriginalMember(owner = "client!dg", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1298 < arg0) {
			this.anInt1298 = arg0;
		}
		if (this.anInt1281 < arg1) {
			this.anInt1281 = arg1;
		}
		if (this.anInt1273 > arg2) {
			this.anInt1273 = arg2;
		}
		if (this.anInt1297 > arg3) {
			this.anInt1297 = arg3;
		}
		this.method1131();
	}

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "(I)V")
	@Override
	public void method5345(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!t;Lclient!pv;Lclient!c;Lclient!qb;I)V")
	@Override
	public void method5291(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class28_Sub6 arg3) {
		((Class163_Sub1) arg0).method3496(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!du;[Lclient!ul;Z)Lclient!la;")
	@Override
	public Class63 method5281(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class246[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt6476;
			local7[local11] = arg1[local11].anInt6475;
			if (arg1[local11].aByteArray89 != null) {
			}
		}
		return new Class63_Sub2(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "(I)Z")
	public boolean method1130(@OriginalArg(0) int arg0) {
		return super.anInterface4_8.method3140(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "(I)V")
	@Override
	public void p(@OriginalArg(0) int arg0) {
		this.O(0, 0, this.anInt1284, this.anInt1280, arg0, 0);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)I")
	@Override
	public int method5323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class165 method5288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class165_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "()V")
	@Override
	public void l() {
		this.anInt1294 = this.anInt1279;
		this.aBoolean80 = false;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class11 method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1284 + arg0;
		@Pc(16) int local16 = this.anInt1284 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray97[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class11_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class11_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	@Override
	public void method5299(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1271;
		for (@Pc(9) Object local9 = this.aClass126_10.method2820(); local9 != null; local9 = this.aClass126_10.method2823()) {
			@Pc(13) Class7_Sub38 local13 = (Class7_Sub38) local9;
			if (local13.aBoolean377) {
				local13.anInt5610 += local4;
				@Pc(27) int local27 = local13.anInt5610 / 20;
				if (local27 > 0) {
					@Pc(36) Class203 local36 = super.anInterface4_8.method3138(local13.anInt5611);
					local13.method4521(local36.aByte58 * local4 * 50 / 1000, local36.aByte56 * local4 * 50 / 1000);
					local13.anInt5610 -= local27 * 20;
				}
				local13.aBoolean377 = false;
			}
		}
		this.anInt1271 = arg0;
		this.aClass126_9.method2828(5);
	}

	@OriginalMember(owner = "client!dg", name = "G", descriptor = "()V")
	private void method1131() {
		this.anInt1291 = this.anInt1298 - this.anInt1288;
		this.anInt1286 = this.anInt1273 - this.anInt1288;
		this.anInt1274 = this.anInt1281 - this.anInt1275;
		this.lb = this.anInt1297 - this.anInt1275;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1290; local29++) {
			@Pc(36) Class31 local36 = this.aClass90Array1[local29].aClass31_1;
			local36.anInt655 = this.anInt1288 - this.anInt1298;
			local36.anInt660 = this.anInt1275 - this.anInt1281;
			local36.anInt657 = this.anInt1273 - this.anInt1298;
			local36.anInt656 = this.anInt1297 - this.anInt1281;
		}
		@Pc(78) int local78 = this.anInt1281 * this.anInt1284 + this.anInt1298;
		for (@Pc(81) int local81 = this.anInt1281; local81 < this.anInt1297; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1290; local84++) {
				this.aClass90Array1[local84].aClass31_1.anIntArray56[local81 - this.anInt1281] = local78;
			}
			local78 += this.anInt1284;
		}
	}

	@OriginalMember(owner = "client!dg", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt1285;
	}

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "()Z")
	@Override
	public boolean method5321() {
		return false;
	}

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "()V")
	@Override
	public void method5300() {
		this.aClass126_10.method2827();
	}

	@OriginalMember(owner = "client!dg", name = "ca", descriptor = "(ILclient!ma;II)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class119 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class119_Sub1 local2 = (Class119_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray292;
		@Pc(8) int[] local8 = local2.anIntArray290;
		@Pc(20) int local20;
		if (this.anInt1297 < arg3 + local5.length) {
			local20 = this.anInt1297 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1281 > arg3) {
			local33 = this.anInt1281 - arg3;
			arg3 = this.anInt1281;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt1284;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1298 > local58) {
				local62 -= this.anInt1298 - local58;
				local58 = this.anInt1298;
			}
			if (this.anInt1273 < local58 + local62) {
				local62 = this.anInt1273 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray97[local58++] = arg0;
			}
			local49 += this.anInt1284;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!gg;")
	public Class90 method1132(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1290; local1++) {
			if (this.aClass90Array1[local1].aRunnable1 == arg0) {
				return this.aClass90Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class119 method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class119_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!dg", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1279 = this.anInt1294;
		this.anInt1296 = arg0;
		this.anInt1294 = arg1;
		this.anInt1293 = arg2;
		this.aBoolean80 = true;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!bq;III)V")
	public void method1133(@OriginalArg(0) Class28_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt4771;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.NA(arg1, arg2, local6, arg0.anInt4767, 1);
			return;
		}
		if (this.anInt1302 != local2) {
			@Pc(30) Class11 local30 = (Class11) this.aClass126_9.method2822((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method1124(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method1125(local2) ? 64 : 128;
				local30 = this.method5310(local36, local46, local46, local46);
				this.aClass126_9.method2824((long) local2, local30);
			}
			this.anInt1302 = local2;
			this.aClass11_5 = local30;
		}
		if (this.aClass11_5.j() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass11_5.s(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt4767, 1);
	}

	@OriginalMember(owner = "client!dg", name = "UA", descriptor = "(III)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1294 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt1294 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt1294 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt1294 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt1294 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean78 = false;
		} else {
			this.aBoolean78 = true;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface4_8.method3138(arg5).aBoolean360) {
			this.NA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt1302 != arg5) {
			@Pc(26) Class11 local26 = (Class11) this.aClass126_9.method2822((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method1124(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method1125(arg5) ? 64 : 128;
				local26 = this.method5310(local32, local43, local43, local43);
				this.aClass126_9.method2824((long) arg5, local26);
			}
			this.anInt1302 = arg5;
			this.aClass11_5 = local26;
		}
		this.aClass11_5.s(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I[Lclient!wr;)V")
	@Override
	public void method5318(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub30[] arg1) {
	}

	@OriginalMember(owner = "client!dg", name = "xa", descriptor = "()F")
	@Override
	public float xa() {
		return this.aFloat34;
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "()V")
	@Override
	public void method5283() {
	}
}
