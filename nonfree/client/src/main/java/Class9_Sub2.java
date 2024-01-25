import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public abstract class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas10;

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "Lclient!ie;")
	protected Class1_Sub22 aClass1_Sub22_3;

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "I")
	private int anInt5315;

	@OriginalMember(owner = "client!aw", name = "v", descriptor = "I")
	public int anInt5316;

	@OriginalMember(owner = "client!aw", name = "y", descriptor = "I")
	public int anInt5318;

	@OriginalMember(owner = "client!aw", name = "z", descriptor = "I")
	public int anInt5319;

	@OriginalMember(owner = "client!aw", name = "A", descriptor = "I")
	public int anInt5320;

	@OriginalMember(owner = "client!aw", name = "E", descriptor = "[Lclient!rk;")
	protected Class253[] aClass253Array3;

	@OriginalMember(owner = "client!aw", name = "F", descriptor = "Lclient!ha;")
	protected Class12 aClass12_10;

	@OriginalMember(owner = "client!aw", name = "L", descriptor = "I")
	public int anInt5329;

	@OriginalMember(owner = "client!aw", name = "Q", descriptor = "I")
	public int anInt5333;

	@OriginalMember(owner = "client!aw", name = "R", descriptor = "I")
	public int anInt5334;

	@OriginalMember(owner = "client!aw", name = "T", descriptor = "I")
	public int anInt5336;

	@OriginalMember(owner = "client!aw", name = "X", descriptor = "I")
	protected int anInt5339;

	@OriginalMember(owner = "client!aw", name = "bb", descriptor = "I")
	public int anInt5343;

	@OriginalMember(owner = "client!aw", name = "db", descriptor = "F")
	private float aFloat106;

	@OriginalMember(owner = "client!aw", name = "gb", descriptor = "I")
	public int anInt5345;

	@OriginalMember(owner = "client!aw", name = "hb", descriptor = "Z")
	public boolean aBoolean370;

	@OriginalMember(owner = "client!aw", name = "ib", descriptor = "I")
	public int anInt5346;

	@OriginalMember(owner = "client!aw", name = "jb", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!aw", name = "kb", descriptor = "F")
	private float aFloat107;

	@OriginalMember(owner = "client!aw", name = "lb", descriptor = "Lclient!ha;")
	private Class12 lb;

	@OriginalMember(owner = "client!aw", name = "t", descriptor = "Z")
	private boolean aBoolean366;

	@OriginalMember(owner = "client!aw", name = "u", descriptor = "Z")
	private boolean aBoolean367;

	@OriginalMember(owner = "client!aw", name = "s", descriptor = "Lclient!lb;")
	protected Class174 aClass174_18;

	@OriginalMember(owner = "client!aw", name = "C", descriptor = "I")
	public int anInt5322;

	@OriginalMember(owner = "client!aw", name = "H", descriptor = "I")
	public int anInt5325;

	@OriginalMember(owner = "client!aw", name = "x", descriptor = "I")
	private int anInt5317;

	@OriginalMember(owner = "client!aw", name = "M", descriptor = "I")
	public int anInt5330;

	@OriginalMember(owner = "client!aw", name = "P", descriptor = "I")
	public int anInt5332;

	@OriginalMember(owner = "client!aw", name = "I", descriptor = "I")
	public int anInt5326;

	@OriginalMember(owner = "client!aw", name = "B", descriptor = "I")
	public int anInt5321;

	@OriginalMember(owner = "client!aw", name = "cb", descriptor = "Z")
	public boolean aBoolean368;

	@OriginalMember(owner = "client!aw", name = "J", descriptor = "I")
	private int anInt5327;

	@OriginalMember(owner = "client!aw", name = "Z", descriptor = "I")
	public int anInt5341;

	@OriginalMember(owner = "client!aw", name = "D", descriptor = "I")
	public int anInt5323;

	@OriginalMember(owner = "client!aw", name = "S", descriptor = "I")
	private int anInt5335;

	@OriginalMember(owner = "client!aw", name = "fb", descriptor = "I")
	public int anInt5344;

	@OriginalMember(owner = "client!aw", name = "G", descriptor = "I")
	public int anInt5324;

	@OriginalMember(owner = "client!aw", name = "O", descriptor = "I")
	public int anInt5331;

	@OriginalMember(owner = "client!aw", name = "U", descriptor = "I")
	public int anInt5337;

	@OriginalMember(owner = "client!aw", name = "W", descriptor = "I")
	public int anInt5338;

	@OriginalMember(owner = "client!aw", name = "ab", descriptor = "I")
	public int anInt5342;

	@OriginalMember(owner = "client!aw", name = "eb", descriptor = "Z")
	private boolean aBoolean369;

	@OriginalMember(owner = "client!aw", name = "Y", descriptor = "I")
	public int anInt5340;

	@OriginalMember(owner = "client!aw", name = "K", descriptor = "I")
	private int anInt5328;

	@OriginalMember(owner = "client!aw", name = "V", descriptor = "Lclient!wf;")
	private final Class316 aClass316_38;

	@OriginalMember(owner = "client!aw", name = "mb", descriptor = "I")
	private int anInt5347;

	@OriginalMember(owner = "client!aw", name = "N", descriptor = "Lclient!wf;")
	private final Class316 aClass316_37;

	@OriginalMember(owner = "client!aw", name = "w", descriptor = "Lclient!ba;")
	public Class22_Sub1 aClass22_Sub1_5;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lclient!n;)V")
	private Class9_Sub2(@OriginalArg(0) Interface8 arg0) {
		super(arg0);
		this.aBoolean366 = false;
		this.aBoolean367 = false;
		this.aClass174_18 = new Class174(4);
		this.anInt5322 = 512;
		this.anInt5325 = 45823;
		this.anInt5317 = 0;
		this.anInt5330 = 0;
		this.anInt5332 = 0;
		this.anInt5326 = 0;
		this.anInt5321 = 0;
		this.aBoolean368 = false;
		this.anInt5327 = 0;
		this.anInt5341 = 78642;
		this.anInt5323 = 3500;
		this.anInt5335 = 3500;
		this.anInt5344 = 0;
		this.anInt5324 = 75518;
		this.anInt5331 = this.anInt5335 - 255;
		this.anInt5337 = 512;
		this.anInt5338 = 50;
		this.anInt5342 = 0;
		this.aBoolean369 = false;
		this.anInt5340 = 0;
		this.anInt5328 = 0;
		this.aClass316_38 = new Class316(16);
		this.anInt5347 = -1;
		this.aClass316_37 = new Class316(20);
		this.aClass22_Sub1_5 = new Class22_Sub1();
		this.method7643(1);
		this.method7596(0);
		Static105.method2288(true, false);
		this.aBoolean367 = true;
	}

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class9_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		this(arg1);
		this.method7592(arg0);
		this.method7634(arg0);
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(I)V")
	@Override
	public final void method7598(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		@Pc(2) int local2 = this.anInt5317;
		this.anInt5317 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!aw", name = "Z", descriptor = "(I)V")
	@Override
	public final void Z(@OriginalArg(0) int arg0) {
		this.f(0, 0, this.anInt5320, this.anInt5339, arg0, 0);
	}

	@OriginalMember(owner = "client!aw", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat107 = arg0;
		this.aFloat106 = arg1;
		this.method4651();
	}

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7591() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(IIIIII)Lclient!qba;")
	@Override
	public final Class25 method7608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!aw", name = "w", descriptor = "()V")
	protected abstract void method4648();

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!qba;)V")
	@Override
	public final void method7580(@OriginalArg(0) Class25 arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!si;III)V")
	public final void method4649(@OriginalArg(0) Class2_Sub4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt2552;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.A(arg1, arg2, arg3, arg0.anInt2550, 1);
			return;
		}
		if (this.anInt5347 != local2) {
			@Pc(32) Class12 local32 = (Class12) this.aClass316_38.method7799((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method4653(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method4650(local2) ? 64 : 128;
				local32 = this.method7641(local38, local48, local48, local48);
				this.aClass316_38.method7792((long) local2, local32);
			}
			this.anInt5347 = local2;
			this.lb = local32;
		}
		local8++;
		this.lb.ra(arg1 - arg3, arg2 - arg3, local8, local8, 0, arg0.anInt2550, 1);
	}

	@OriginalMember(owner = "client!aw", name = "C", descriptor = "()Lclient!m;")
	@Override
	public final Class22 method7642() {
		@Pc(3) Class253 local3 = this.method4655(Thread.currentThread());
		return local3.aClass22_Sub1_9;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I[Lclient!nm;)V")
	@Override
	public final void method7588(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub27[] arg1) {
	}

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7575() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5332;
		arg0[1] = this.anInt5321;
		arg0[2] = this.anInt5326;
		arg0[3] = this.anInt5330;
	}

	@OriginalMember(owner = "client!aw", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5321 || arg1 >= this.anInt5330) {
			return;
		}
		if (arg0 < this.anInt5332) {
			arg2 -= this.anInt5332 - arg0;
			arg0 = this.anInt5332;
		}
		if (arg0 + arg2 > this.anInt5326) {
			arg2 = this.anInt5326 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5320;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray379[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray379[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray379[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray379[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray379[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "()V")
	@Override
	public final void method7586() {
	}

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7605() {
		return true;
	}

	@OriginalMember(owner = "client!aw", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt5335;
	}

	@OriginalMember(owner = "client!aw", name = "o", descriptor = "()V")
	@Override
	public final void method7602() {
	}

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "()Z")
	@Override
	public final boolean method7576() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "()Z")
	@Override
	public final boolean method7569() {
		return true;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!qba;Lclient!qba;FLclient!qba;)Lclient!qba;")
	@Override
	public final Class25 method7609(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class25 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!aw", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.anInt5344 = this.anInt5328;
		this.aBoolean368 = false;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method7594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class23 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class23_Sub2 local2 = (Class23_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray429;
		@Pc(8) int[] local8 = local2.anIntArray430;
		@Pc(17) int local17 = this.anInt5321 > arg7 ? this.anInt5321 : arg7;
		@Pc(32) int local32 = this.anInt5330 < arg7 + local5.length ? this.anInt5330 : arg7 + local5.length;
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
					if (local129 >= this.anInt5332 && local129 < this.anInt5326 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray379[local129 + arg1 * this.anInt5320] = arg4;
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
					if (local133 >= this.anInt5332 && local133 < this.anInt5326 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5320;
						local248 = this.anIntArray379[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray379[local133 + arg1 * this.anInt5320] = local201 + local584;
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
		if (arg0 < this.anInt5332) {
			arg1 += local83 * (this.anInt5332 - arg0);
			arg0 = this.anInt5332;
		}
		if (arg2 >= this.anInt5326) {
			arg2 = this.anInt5326 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray379[arg0 + local129 * this.anInt5320] = arg4;
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
					local243 = arg0 + local133 * this.anInt5320;
					local248 = this.anIntArray379[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray379[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class12 method7612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5320 + arg0;
		@Pc(16) int local16 = this.anInt5320 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray379[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class12_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class12_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5328 = this.anInt5344;
		this.anInt5342 = arg0;
		this.anInt5344 = arg1;
		this.anInt5340 = arg2;
		this.aBoolean368 = true;
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7634(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5332 || arg0 >= this.anInt5326) {
			return;
		}
		if (arg1 < this.anInt5321) {
			arg2 -= this.anInt5321 - arg1;
			arg1 = this.anInt5321;
		}
		if (arg1 + arg2 > this.anInt5330) {
			arg2 = this.anInt5330 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5320;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray379[local40 + local54 * this.anInt5320] = arg3;
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
				local111 = local40 + local103 * this.anInt5320;
				local116 = this.anIntArray379[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray379[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5320;
				local111 = this.anIntArray379[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray379[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "(I)Z")
	public final boolean method4650(@OriginalArg(0) int arg0) {
		return this.aBoolean369 || super.anInterface8_13.method7085(arg0).aBoolean354;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method7600(@OriginalArg(0) Class1_Sub16 arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7610(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "P", descriptor = "()F")
	@Override
	public final float P() {
		return this.aFloat107;
	}

	@OriginalMember(owner = "client!aw", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5338 = arg0;
		this.anInt5335 = arg1;
		this.anInt5331 = this.anInt5335 - 255;
		this.method4651();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "([Lclient!r;Lclient!rd;Lclient!m;[Lclient!pr;I)V")
	public abstract void method7593(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aw", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5342 = arg0;
		this.anInt5344 = arg1;
		this.anInt5340 = arg2;
	}

	@OriginalMember(owner = "client!aw", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return 0;
	}

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public final Class1_Sub16 method7629(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aw", name = "v", descriptor = "(IIII)[I")
	@Override
	public final int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt5320 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray379[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!aw", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7611() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class10 method7574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)V")
	@Override
	public void method7596(@OriginalArg(0) int arg0) {
		this.aClass253Array3[arg0].method7883(Thread.currentThread());
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7589(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public abstract void method7584(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aw", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class23_Sub2 local2 = (Class23_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray429;
		@Pc(8) int[] local8 = local2.anIntArray430;
		@Pc(20) int local20;
		if (this.anInt5330 < arg3 + local5.length) {
			local20 = this.anInt5330 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5321 > arg3) {
			local33 = this.anInt5321 - arg3;
			arg3 = this.anInt5321;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt5320;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5332 > local58) {
				local62 -= this.anInt5332 - local58;
				local58 = this.anInt5332;
			}
			if (this.anInt5326 < local58 + local62) {
				local62 = this.anInt5326 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray379[local58++] = arg0;
			}
			local49 += this.anInt5320;
		}
	}

	@OriginalMember(owner = "client!aw", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!aw", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7622() {
		return true;
	}

	@OriginalMember(owner = "client!aw", name = "v", descriptor = "()V")
	@Override
	public void method7623() {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class12 method7641(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class12_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class12_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class12_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class12_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!aw", name = "E", descriptor = "()V")
	private void method4651() {
		if (this.aFloat106 == 0.0F) {
			this.anInt5323 = this.anInt5335;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5335;
		@Pc(12) float local12 = (float) this.anInt5338;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat107 / (this.aFloat106 + this.aFloat107);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat106;
		this.anInt5323 = (int) (((float) this.anInt5335 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIF)Lclient!nm;")
	@Override
	public final Class1_Sub27 method7616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method7604(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!aw", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7630() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "ra", descriptor = "()F")
	@Override
	public final float ra() {
		return this.aFloat106;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "()V")
	@Override
	protected final void method7566() {
		if (this.aBoolean367) {
			Static88.method2132(false, true);
			this.aBoolean367 = false;
		}
		this.aClass1_Sub22_3 = null;
		this.aCanvas10 = null;
		this.aClass174_18 = null;
		this.aBoolean366 = true;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!qm;Z)Lclient!ha;")
	@Override
	public final Class12 method7625(@OriginalArg(0) Class242 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray518;
		@Pc(5) byte[] local5 = arg0.aByteArray83;
		@Pc(8) int local8 = arg0.anInt6863;
		@Pc(11) int local11 = arg0.anInt6866;
		@Pc(76) Class12_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray82 == null) {
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
			local76 = new Class12_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray82;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class12_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class12_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.KA(arg0.anInt6862, arg0.anInt6865, arg0.anInt6861, arg0.anInt6864);
		return local76;
	}

	@OriginalMember(owner = "client!aw", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass22_Sub1_5.anInt1072 + (this.aClass22_Sub1_5.anInt1071 * arg0 + this.aClass22_Sub1_5.anInt1070 * arg1 + this.aClass22_Sub1_5.anInt1079 * arg2 >> 15);
		if (local23 < this.anInt5338 || local23 > this.anInt5335) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt5337 * (this.aClass22_Sub1_5.anInt1073 + (this.aClass22_Sub1_5.anInt1076 * arg0 + this.aClass22_Sub1_5.anInt1081 * arg1 + this.aClass22_Sub1_5.anInt1075 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt5322 * (this.aClass22_Sub1_5.anInt1080 + (this.aClass22_Sub1_5.anInt1078 * arg0 + this.aClass22_Sub1_5.anInt1074 * arg1 + this.aClass22_Sub1_5.anInt1077 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt5336 && local73 <= this.anInt5346 && local102 >= this.anInt5345 && local102 <= this.anInt5334) {
			arg3[0] = local73 - this.anInt5336;
			arg3[1] = local102 - this.anInt5345;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!aw", name = "j", descriptor = "(I)I")
	public final int method4652(@OriginalArg(0) int arg0) {
		return super.anInterface8_13.method7085(arg0).aShort81 & 0xFFFF;
	}

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7636(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			this.method7634(null);
		}
		@Pc(15) Class1_Sub22 local15 = (Class1_Sub22) this.aClass174_18.method4422((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7983();
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)I")
	@Override
	public final int method7606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		this.anInt5332 = 0;
		this.anInt5321 = 0;
		this.anInt5326 = this.anInt5320;
		this.anInt5330 = this.anInt5339;
		this.method4648();
	}

	@OriginalMember(owner = "client!aw", name = "y", descriptor = "()Lclient!cr;")
	@Override
	public final Class49 method7626() {
		return new Class49(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.UA(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.UA(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
			@Pc(309) int local309;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt5332) {
					arg1 += local104 * (this.anInt5332 - arg0);
					arg0 = this.anInt5332;
				}
				if (arg2 >= this.anInt5326) {
					arg2 = this.anInt5326 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5321 && local150 < this.anInt5330) {
							this.anIntArray379[arg0 + local150 * this.anInt5320] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5321 && local213 < this.anInt5330) {
							local228 = arg0 + local213 * this.anInt5320;
							local233 = this.anIntArray379[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray379[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5321 && local150 < this.anInt5330) {
							local213 = arg0 + local150 * this.anInt5320;
							local228 = this.anIntArray379[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray379[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt5321) {
					arg0 += local104 * (this.anInt5321 - arg1);
					arg1 = this.anInt5321;
				}
				if (arg3 >= this.anInt5330) {
					arg3 = this.anInt5330 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5332 && local150 < this.anInt5326) {
							this.anIntArray379[local150 + arg1 * this.anInt5320] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5332 && local213 < this.anInt5326) {
							local228 = local213 + arg1 * this.anInt5320;
							local233 = this.anIntArray379[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray379[local213 + arg1 * this.anInt5320] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5332 && local150 < this.anInt5326) {
							local213 = local150 + arg1 * this.anInt5320;
							local228 = this.anIntArray379[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray379[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.e(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.e(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!aw", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5321) {
			local8 = this.anInt5321;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5330) {
			local21 = this.anInt5330;
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
				if (local91 < this.anInt5332) {
					local91 = this.anInt5332;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5326) {
					local102 = this.anInt5326;
				}
				local116 = local91 + local30 * this.anInt5320;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray379[local116++] = arg3;
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
				if (local91 < this.anInt5332) {
					local91 = this.anInt5332;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5326 - 1) {
					local102 = this.anInt5326 - 1;
				}
				local116 = local91 + local30 * this.anInt5320;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray379[local116++] = arg3;
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
				if (local102 < this.anInt5332) {
					local102 = this.anInt5332;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5326) {
					local116 = this.anInt5326;
				}
				local118 = local102 + local30 * this.anInt5320;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray379[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray379[local118++] = local277 + local340;
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
				if (local102 < this.anInt5332) {
					local102 = this.anInt5332;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5326 - 1) {
					local116 = this.anInt5326 - 1;
				}
				local118 = local102 + local30 * this.anInt5320;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray379[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray379[local118++] = local277 + local340;
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
				if (local91 < this.anInt5332) {
					local91 = this.anInt5332;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5326) {
					local102 = this.anInt5326;
				}
				local116 = local91 + local30 * this.anInt5320;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray379[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray379[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt5332) {
					local91 = this.anInt5332;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5326 - 1) {
					local102 = this.anInt5326 - 1;
				}
				local116 = local91 + local30 * this.anInt5320;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray379[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray379[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method7597(@OriginalArg(0) Class22 arg0) {
		this.aClass22_Sub1_5 = (Class22_Sub1) arg0;
	}

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "(I)V")
	@Override
	public final void method7613(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5315;
		for (@Pc(9) Object local9 = this.aClass316_37.method7800(); local9 != null; local9 = this.aClass316_37.method7802()) {
			@Pc(13) Class1_Sub15 local13 = (Class1_Sub15) local9;
			if (local13.aBoolean189) {
				local13.anInt2892 += local4;
				@Pc(27) int local27 = local13.anInt2892 / 20;
				if (local27 > 0) {
					@Pc(36) Class175 local36 = super.anInterface8_13.method7085(local13.anInt2890);
					local13.method2694(local36.aByte57 * local4 * 50 / 1000, local36.aByte60 * local4 * 50 / 1000);
					local13.anInt2892 -= local27 * 20;
				}
				local13.aBoolean189 = false;
			}
		}
		this.anInt5315 = arg0;
		this.aClass316_38.method7791(5);
	}

	@OriginalMember(owner = "client!aw", name = "x", descriptor = "()V")
	@Override
	public final void method7624() {
		this.aClass316_37.method7794();
	}

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "()Z")
	@Override
	public final boolean method7579() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7583() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public final void method7577(@OriginalArg(0) Class249 arg0) {
		@Pc(3) Class2_Sub4 local3 = arg0.aClass120_1.aClass2_Sub4_7;
		for (@Pc(6) Class2_Sub4 local6 = local3.aClass2_Sub4_9; local6 != local3; local6 = local6.aClass2_Sub4_9) {
			@Pc(10) Class2_Sub4_Sub1 local10 = (Class2_Sub4_Sub1) local6;
			@Pc(15) int local15 = local10.anInt2551 >> 12;
			@Pc(20) int local20 = local10.anInt2549 >> 12;
			@Pc(25) int local25 = local10.anInt2546 >> 12;
			@Pc(49) int local49 = this.aClass22_Sub1_5.anInt1072 + (this.aClass22_Sub1_5.anInt1071 * local15 + this.aClass22_Sub1_5.anInt1070 * local20 + this.aClass22_Sub1_5.anInt1079 * local25 >> 15);
			if (local49 >= this.anInt5338 && local49 <= this.anInt5331) {
				@Pc(90) int local90 = this.anInt5343 + this.anInt5337 * (this.aClass22_Sub1_5.anInt1073 + (this.aClass22_Sub1_5.anInt1076 * local15 + this.aClass22_Sub1_5.anInt1081 * local20 + this.aClass22_Sub1_5.anInt1075 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt5318 + this.anInt5322 * (this.aClass22_Sub1_5.anInt1080 + (this.aClass22_Sub1_5.anInt1078 * local15 + this.aClass22_Sub1_5.anInt1074 * local20 + this.aClass22_Sub1_5.anInt1077 * local25 >> 15)) / local49;
				if (local90 >= this.anInt5332 && local90 <= this.anInt5326 && local122 >= this.anInt5321 && local122 <= this.anInt5330) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method4649(local10, local90, local122, (local10.anInt2553 * this.anInt5337 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5344 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt5344 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt5344 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt5344 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt5344 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean370 = false;
		} else {
			this.aBoolean370 = true;
		}
	}

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "(I)[I")
	private int[] method4653(@OriginalArg(0) int arg0) {
		@Pc(2) Class316 local2 = this.aClass316_37;
		@Pc(12) Class1_Sub15 local12;
		synchronized (this.aClass316_37) {
			local12 = (Class1_Sub15) this.aClass316_37.method7799((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_13.method7084(arg0)) {
					return null;
				}
				@Pc(32) Class175 local32 = super.anInterface8_13.method7085(arg0);
				@Pc(42) int local42 = local32.aBoolean354 || this.aBoolean369 ? 64 : 128;
				local12 = new Class1_Sub15(arg0, local42, super.anInterface8_13.method7086(local42, local42, arg0, 0.7F), local32.aBoolean355);
				this.aClass316_37.method7792((long) arg0, local12);
			}
		}
		local12.aBoolean189 = true;
		return local12.method2693();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!fd;IIII)Lclient!r;")
	public abstract Class19 method7635(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!lg;[Lclient!qm;Z)Lclient!ra;")
	@Override
	public final Class27 method7603(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class242[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt6863;
			local7[local11] = arg1[local11].anInt6866;
			if (arg1[local11].aByteArray82 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class27_Sub2(this, arg0, arg1, local3, local7);
		} else {
			return new Class27_Sub3(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!aw", name = "A", descriptor = "()V")
	@Override
	public final void method7637() throws Exception_Sub1 {
		if (this.aCanvas10 == null || this.aClass1_Sub22_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas10.getGraphics();
			this.aClass1_Sub22_3.method5313(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "(I)Z")
	public final boolean method4654(@OriginalArg(0) int arg0) {
		return super.anInterface8_13.method7084(arg0);
	}

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7615(@OriginalArg(0) boolean arg0) {
		this.aBoolean369 = arg0;
		this.aClass316_37.method7794();
	}

	@OriginalMember(owner = "client!aw", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass22_Sub1_5.anInt1071 * arg0 + this.aClass22_Sub1_5.anInt1070 * arg1 + this.aClass22_Sub1_5.anInt1079 * arg2 >> 15) + this.aClass22_Sub1_5.anInt1072;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass22_Sub1_5.anInt1071 * arg3 + this.aClass22_Sub1_5.anInt1070 * arg4 + this.aClass22_Sub1_5.anInt1079 * arg5 >> 15) + this.aClass22_Sub1_5.anInt1072;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt5338 && local52 < this.anInt5338 || !(local23 <= this.anInt5335 || local52 <= this.anInt5335)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt5337 * ((this.aClass22_Sub1_5.anInt1076 * arg0 + this.aClass22_Sub1_5.anInt1081 * arg1 + this.aClass22_Sub1_5.anInt1075 * arg2 >> 15) + this.aClass22_Sub1_5.anInt1073) / local23;
		@Pc(133) int local133 = this.anInt5337 * ((this.aClass22_Sub1_5.anInt1076 * arg3 + this.aClass22_Sub1_5.anInt1081 * arg4 + this.aClass22_Sub1_5.anInt1075 * arg5 >> 15) + this.aClass22_Sub1_5.anInt1073) / local52;
		if (local104 < this.anInt5336 && local133 < this.anInt5336 || local104 > this.anInt5346 && local133 > this.anInt5346) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt5322 * ((this.aClass22_Sub1_5.anInt1078 * arg0 + this.aClass22_Sub1_5.anInt1074 * arg1 + this.aClass22_Sub1_5.anInt1077 * arg2 >> 15) + this.aClass22_Sub1_5.anInt1080) / local23;
			@Pc(209) int local209 = this.anInt5322 * ((this.aClass22_Sub1_5.anInt1078 * arg3 + this.aClass22_Sub1_5.anInt1074 * arg4 + this.aClass22_Sub1_5.anInt1077 * arg5 >> 15) + this.aClass22_Sub1_5.anInt1080) / local52;
			return (local180 >= this.anInt5345 || local209 >= this.anInt5345) && (local180 <= this.anInt5334 || local209 <= this.anInt5334);
		}
	}

	@OriginalMember(owner = "client!aw", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7620() {
		return true;
	}

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5332) {
			arg2 -= this.anInt5332 - arg0;
			arg0 = this.anInt5332;
		}
		if (arg1 < this.anInt5321) {
			arg3 -= this.anInt5321 - arg1;
			arg1 = this.anInt5321;
		}
		if (arg0 + arg2 > this.anInt5326) {
			arg2 = this.anInt5326 - arg0;
		}
		if (arg1 + arg3 > this.anInt5330) {
			arg3 = this.anInt5330 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5326 || arg1 > this.anInt5330) {
			return;
		}
		@Pc(67) int local67 = this.anInt5320 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5320;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(217) int local217;
			if (arg5 == 1) {
				@Pc(201) int local201 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + (((arg4 & 0xFF00FF00) >>> 8) * local78 & 0xFF00FF00);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local217 = this.anIntArray379[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray379[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray379[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray379[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray379[arg2] = arg4;
					arg2++;
					this.anIntArray379[arg2] = arg4;
					arg2++;
					this.anIntArray379[arg2] = arg4;
					arg2++;
					this.anIntArray379[arg2] = arg4;
					arg2++;
					this.anIntArray379[arg2] = arg4;
					arg2++;
					this.anIntArray379[arg2] = arg4;
					arg2++;
					this.anIntArray379[arg2] = arg4;
					arg2++;
					this.anIntArray379[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray379[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!aw", name = "B", descriptor = "()Z")
	public abstract boolean method7640();

	@OriginalMember(owner = "client!aw", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		this.anInt5324 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!aw", name = "s", descriptor = "()V")
	@Override
	public final void method7619() {
	}

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "(I)V")
	public abstract void method7643(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7627(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "()V")
	@Override
	public final void method7570() {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!rk;")
	public abstract Class253 method4655(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method7617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!pr;I)V")
	public abstract void method7578(@OriginalArg(0) Class19[] arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) Class2_Sub7[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7571() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "F", descriptor = "()V")
	protected final void method4656() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5333; local1++) {
			this.aClass253Array3[local1].method7885();
		}
		this.n();
	}

	@OriginalMember(owner = "client!aw", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5320) {
			arg2 = this.anInt5320;
		}
		if (arg3 > this.anInt5339) {
			arg3 = this.anInt5339;
		}
		this.anInt5332 = arg0;
		this.anInt5326 = arg2;
		this.anInt5321 = arg1;
		this.anInt5330 = arg3;
		this.method4648();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Lclient!r;Lclient!rd;Lclient!m;Lclient!pr;I)V")
	@Override
	public final void method7573(@OriginalArg(0) Class19 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) Class2_Sub7 arg3) {
		((Class19_Sub1) arg0).method7276(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!aw", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5332 < arg0) {
			this.anInt5332 = arg0;
		}
		if (this.anInt5321 < arg1) {
			this.anInt5321 = arg1;
		}
		if (this.anInt5326 > arg2) {
			this.anInt5326 = arg2;
		}
		if (this.anInt5330 > arg3) {
			this.anInt5330 = arg3;
		}
		this.method4648();
	}

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "()I")
	@Override
	public final int method7582() {
		return 0;
	}

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "(I)Z")
	public final boolean method4657(@OriginalArg(0) int arg0) {
		return super.anInterface8_13.method7085(arg0).aBoolean359;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7592(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub22 local8 = (Class1_Sub22) this.aClass174_18.method4422((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static167.method3277(arg0);
			this.aClass174_18.method4420(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5343 = arg0;
		this.anInt5318 = arg1;
		this.anInt5337 = arg2;
		this.anInt5322 = arg3;
		this.method4648();
	}

	@OriginalMember(owner = "client!aw", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5320;
		@Pc(35) int local35 = this.anInt5320 - arg2;
		if (arg1 + arg3 > this.anInt5330) {
			arg3 -= arg1 + arg3 - this.anInt5330;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5321) {
			local59 = this.anInt5321 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5320;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5326) {
			local59 = arg0 + arg2 - this.anInt5326;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5332) {
			local59 = this.anInt5332 - arg0;
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
						this.anIntArray379[local30++] = arg4;
					} else {
						this.anIntArray379[local30++] = arg5;
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
					local245 = this.anIntArray379[local30];
					this.anIntArray379[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray379[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray379[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIIIII)V")
	public final void method4658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface8_13.method7085(arg5).aBoolean356) {
			this.A(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt5347 != arg5) {
			@Pc(26) Class12 local26 = (Class12) this.aClass316_38.method7799((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method4653(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method4650(arg5) ? 64 : 128;
				local26 = this.method7641(local32, local43, local43, local43);
				this.aClass316_38.method7792((long) arg5, local26);
			}
			this.anInt5347 = arg5;
			this.lb = local26;
		}
		this.lb.ra(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!aw", name = "G", descriptor = "()Z")
	public final boolean method4659() {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5325 = (int) (arg1 * 65535.0F);
		this.anInt5341 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5329 = (int) (arg3 * 65535.0F / local26);
		this.anInt5316 = (int) (arg4 * 65535.0F / local26);
		this.anInt5319 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!aw", name = "n", descriptor = "(I)[I")
	public final int[] method4660(@OriginalArg(0) int arg0) {
		@Pc(2) Class316 local2 = this.aClass316_37;
		@Pc(12) Class1_Sub15 local12;
		synchronized (this.aClass316_37) {
			local12 = (Class1_Sub15) this.aClass316_37.method7799((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_13.method7084(arg0)) {
					return null;
				}
				@Pc(32) Class175 local32 = super.anInterface8_13.method7085(arg0);
				@Pc(42) int local42 = local32.aBoolean354 || this.aBoolean369 ? 64 : 128;
				local12 = new Class1_Sub15(arg0, local42, super.anInterface8_13.method7088(local42, true, local42, 0.7F, arg0), local32.aBoolean355);
				this.aClass316_37.method7792((long) arg0, local12);
			}
		}
		local12.aBoolean189 = true;
		return local12.method2693();
	}

	@OriginalMember(owner = "client!aw", name = "D", descriptor = "()Lclient!m;")
	@Override
	public final Class22 method7644() {
		return new Class22_Sub1();
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7595();

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt5338;
	}

	@OriginalMember(owner = "client!aw", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		@Pc(2) int local2 = this.anInt5327;
		this.anInt5327 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class23 method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class23_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7614() {
		return false;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(II)I")
	@Override
	public final int method7607(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method7567(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas10 == null || this.aClass1_Sub22_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas10.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5320 && local21.y <= this.anInt5339 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub22_3.method5312(local21.x, local21.y, local21.height, local14, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7601() {
		return false;
	}
}
