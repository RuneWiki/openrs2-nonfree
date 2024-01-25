import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!et")
public abstract class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!et", name = "u", descriptor = "Z")
	private boolean aBoolean411;

	@OriginalMember(owner = "client!et", name = "v", descriptor = "Lclient!dea;")
	protected Class68 aClass68_43;

	@OriginalMember(owner = "client!et", name = "w", descriptor = "Z")
	private boolean aBoolean412;

	@OriginalMember(owner = "client!et", name = "x", descriptor = "Lclient!at;")
	protected Class12_Sub5 aClass12_Sub5_3;

	@OriginalMember(owner = "client!et", name = "y", descriptor = "I")
	private int anInt5335;

	@OriginalMember(owner = "client!et", name = "z", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas10;

	@OriginalMember(owner = "client!et", name = "A", descriptor = "I")
	public int anInt5336;

	@OriginalMember(owner = "client!et", name = "B", descriptor = "I")
	public int anInt5337;

	@OriginalMember(owner = "client!et", name = "C", descriptor = "Z")
	public boolean aBoolean413;

	@OriginalMember(owner = "client!et", name = "D", descriptor = "I")
	public int anInt5338;

	@OriginalMember(owner = "client!et", name = "E", descriptor = "I")
	private int anInt5339;

	@OriginalMember(owner = "client!et", name = "F", descriptor = "I")
	public int anInt5340;

	@OriginalMember(owner = "client!et", name = "G", descriptor = "Lclient!h;")
	private final Class125 aClass125_39;

	@OriginalMember(owner = "client!et", name = "H", descriptor = "I")
	public int anInt5341;

	@OriginalMember(owner = "client!et", name = "I", descriptor = "I")
	private int anInt5342;

	@OriginalMember(owner = "client!et", name = "J", descriptor = "I")
	protected int anInt5343;

	@OriginalMember(owner = "client!et", name = "K", descriptor = "I")
	public int anInt5344;

	@OriginalMember(owner = "client!et", name = "L", descriptor = "I")
	public int anInt5345;

	@OriginalMember(owner = "client!et", name = "M", descriptor = "[I")
	public int[] anIntArray375;

	@OriginalMember(owner = "client!et", name = "N", descriptor = "I")
	public int anInt5346;

	@OriginalMember(owner = "client!et", name = "O", descriptor = "I")
	private int anInt5347;

	@OriginalMember(owner = "client!et", name = "P", descriptor = "I")
	public int anInt5348;

	@OriginalMember(owner = "client!et", name = "Q", descriptor = "I")
	public int anInt5349;

	@OriginalMember(owner = "client!et", name = "R", descriptor = "I")
	public int anInt5350;

	@OriginalMember(owner = "client!et", name = "S", descriptor = "Lclient!h;")
	private final Class125 aClass125_40;

	@OriginalMember(owner = "client!et", name = "T", descriptor = "Lclient!tg;")
	public Class91_Sub3 aClass91_Sub3_7;

	@OriginalMember(owner = "client!et", name = "U", descriptor = "I")
	public int anInt5351;

	@OriginalMember(owner = "client!et", name = "V", descriptor = "Z")
	public boolean aBoolean414;

	@OriginalMember(owner = "client!et", name = "W", descriptor = "I")
	public int anInt5352;

	@OriginalMember(owner = "client!et", name = "X", descriptor = "I")
	public int anInt5353;

	@OriginalMember(owner = "client!et", name = "Y", descriptor = "I")
	public int anInt5354;

	@OriginalMember(owner = "client!et", name = "Z", descriptor = "I")
	public int anInt5355;

	@OriginalMember(owner = "client!et", name = "ab", descriptor = "I")
	public int anInt5356;

	@OriginalMember(owner = "client!et", name = "bb", descriptor = "[Lclient!ch;")
	protected Class54[] aClass54Array3;

	@OriginalMember(owner = "client!et", name = "cb", descriptor = "I")
	public int anInt5357;

	@OriginalMember(owner = "client!et", name = "db", descriptor = "Z")
	private boolean aBoolean415;

	@OriginalMember(owner = "client!et", name = "eb", descriptor = "I")
	public int anInt5358;

	@OriginalMember(owner = "client!et", name = "fb", descriptor = "Lclient!ha;")
	protected Class84 aClass84_11;

	@OriginalMember(owner = "client!et", name = "gb", descriptor = "I")
	public int anInt5359;

	@OriginalMember(owner = "client!et", name = "hb", descriptor = "I")
	public int anInt5360;

	@OriginalMember(owner = "client!et", name = "ib", descriptor = "I")
	public int anInt5361;

	@OriginalMember(owner = "client!et", name = "jb", descriptor = "I")
	public int anInt5362;

	@OriginalMember(owner = "client!et", name = "kb", descriptor = "F")
	private float aFloat115;

	@OriginalMember(owner = "client!et", name = "lb", descriptor = "F")
	private float lb;

	@OriginalMember(owner = "client!et", name = "mb", descriptor = "I")
	public int anInt5363;

	@OriginalMember(owner = "client!et", name = "nb", descriptor = "I")
	public int anInt5364;

	@OriginalMember(owner = "client!et", name = "ob", descriptor = "I")
	private int anInt5365;

	@OriginalMember(owner = "client!et", name = "pb", descriptor = "I")
	public int anInt5366;

	@OriginalMember(owner = "client!et", name = "qb", descriptor = "Lclient!ha;")
	private Class84 aClass84_12;

	@OriginalMember(owner = "client!et", name = "rb", descriptor = "I")
	private int anInt5367;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class42_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface11 arg1) {
		this(arg1);
		this.method5789(arg0);
		this.method5846(arg0);
	}

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lclient!n;)V")
	private Class42_Sub2(@OriginalArg(0) Interface11 arg0) {
		super(arg0);
		this.aBoolean411 = false;
		this.aBoolean412 = false;
		this.aClass68_43 = new Class68(4);
		this.anInt5336 = 78642;
		this.anInt5344 = 0;
		this.anInt5350 = 512;
		this.anInt5348 = 0;
		this.aBoolean413 = false;
		this.anInt5338 = 50;
		this.anInt5342 = 0;
		this.anInt5353 = 0;
		this.anInt5339 = 0;
		this.anInt5356 = 512;
		this.aBoolean415 = false;
		this.anInt5345 = 3500;
		this.anInt5352 = 45823;
		this.anInt5347 = 3500;
		this.anInt5358 = 0;
		this.anInt5351 = 0;
		this.anInt5346 = 75518;
		this.anInt5355 = 0;
		this.anInt5349 = this.anInt5347 - 255;
		this.anInt5365 = 0;
		this.anInt5364 = 0;
		this.aClass125_39 = new Class125(16);
		this.anInt5367 = -1;
		this.aClass125_40 = new Class125(20);
		this.aClass91_Sub3_7 = new Class91_Sub3();
		this.method5797(1);
		this.method5804(0);
		Static292.method4744(false, true);
		this.aBoolean412 = true;
	}

	@OriginalMember(owner = "client!et", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5344 || arg1 >= this.anInt5353) {
			return;
		}
		if (arg0 < this.anInt5348) {
			arg2 -= this.anInt5348 - arg0;
			arg0 = this.anInt5348;
		}
		if (arg0 + arg2 > this.anInt5351) {
			arg2 = this.anInt5351 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5359;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray375[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray375[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray375[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray375[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray375[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIII)Lclient!sv;")
	@Override
	public final Class124 method5790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!et", name = "w", descriptor = "()Z")
	public final boolean method4536() {
		return this.aBoolean411;
	}

	@OriginalMember(owner = "client!et", name = "h", descriptor = "(I)Z")
	public final boolean method4537(@OriginalArg(0) int arg0) {
		return super.anInterface11_11.method6213(arg0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!r;Lclient!hp;Lclient!m;Lclient!kn;I)V")
	@Override
	public final void method5864(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4 arg3) {
		((Class26_Sub1) arg0).method2993(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "()Z")
	@Override
	public final boolean method5808() {
		return true;
	}

	@OriginalMember(owner = "client!et", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class145_Sub1 local2 = (Class145_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray339;
		@Pc(8) int[] local8 = local2.anIntArray340;
		@Pc(20) int local20;
		if (this.anInt5353 < arg3 + local5.length) {
			local20 = this.anInt5353 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5344 > arg3) {
			local33 = this.anInt5344 - arg3;
			arg3 = this.anInt5344;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt5359;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5348 > local58) {
				local62 -= this.anInt5348 - local58;
				local58 = this.anInt5348;
			}
			if (this.anInt5351 < local58 + local62) {
				local62 = this.anInt5351 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray375[local58++] = arg0;
			}
			local49 += this.anInt5359;
		}
	}

	@OriginalMember(owner = "client!et", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		this.anInt5346 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([Lclient!r;Lclient!hp;Lclient!m;[Lclient!kn;I)V")
	public abstract void method5809(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class7_Sub4[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!bt;Z)Lclient!ha;")
	@Override
	public final Class84 method5839(@OriginalArg(0) Class40 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray124;
		@Pc(5) byte[] local5 = arg0.aByteArray21;
		@Pc(8) int local8 = arg0.anInt895;
		@Pc(11) int local11 = arg0.anInt894;
		@Pc(76) Class84_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray22 == null) {
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
			local76 = new Class84_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray22;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class84_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class84_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.KA(arg0.anInt897, arg0.anInt896, arg0.anInt899, arg0.anInt898);
		return local76;
	}

	@OriginalMember(owner = "client!et", name = "s", descriptor = "()Z")
	@Override
	public final boolean method5833() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "m", descriptor = "()Z")
	@Override
	public final boolean method5823() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "i", descriptor = "(I)I")
	public final int method4538(@OriginalArg(0) int arg0) {
		return super.anInterface11_11.method6215(arg0).aShort96 & 0xFFFF;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!sv;Lclient!sv;FLclient!sv;)Lclient!sv;")
	@Override
	public final Class124 method5805(@OriginalArg(0) Class124 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class124 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!et", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.anInt5358 = this.anInt5339;
		this.aBoolean413 = false;
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "()V")
	@Override
	protected final void method5800() {
		if (this.aBoolean412) {
			Static29.method558(false, true);
			this.aBoolean412 = false;
		}
		this.aClass12_Sub5_3 = null;
		this.aCanvas10 = null;
		this.aClass68_43 = null;
		this.aBoolean411 = true;
	}

	@OriginalMember(owner = "client!et", name = "j", descriptor = "(I)Z")
	public final boolean method4539(@OriginalArg(0) int arg0) {
		return this.aBoolean415 || super.anInterface11_11.method6215(arg0).aBoolean567;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(I)V")
	@Override
	public void method5804(@OriginalArg(0) int arg0) {
		this.aClass54Array3[arg0].method6538(Thread.currentThread());
	}

	@OriginalMember(owner = "client!et", name = "k", descriptor = "(I)[I")
	public final int[] method4540(@OriginalArg(0) int arg0) {
		@Pc(2) Class125 local2 = this.aClass125_40;
		@Pc(12) Class12_Sub19 local12;
		synchronized (this.aClass125_40) {
			local12 = (Class12_Sub19) this.aClass125_40.method3446((long) arg0);
			if (local12 == null) {
				if (!super.anInterface11_11.method6213(arg0)) {
					return null;
				}
				@Pc(32) Class278 local32 = super.anInterface11_11.method6215(arg0);
				@Pc(42) int local42 = local32.aBoolean567 || this.aBoolean415 ? 64 : 128;
				local12 = new Class12_Sub19(arg0, local42, super.anInterface11_11.method6211(true, arg0, local42, local42, 0.7F), local32.aBoolean572);
				this.aClass125_40.method3437(local12, (long) arg0);
			}
		}
		local12.aBoolean339 = true;
		return local12.method3664();
	}

	@OriginalMember(owner = "client!et", name = "t", descriptor = "()Z")
	@Override
	public final boolean method5836() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		@Pc(2) int local2 = this.anInt5365;
		this.anInt5365 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class215 method5796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!et", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5364 = arg0;
		this.anInt5358 = arg1;
		this.anInt5355 = arg2;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II)I")
	@Override
	public final int method5820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!et", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5338 = arg0;
		this.anInt5347 = arg1;
		this.anInt5349 = this.anInt5347 - 255;
		this.method4542();
	}

	@OriginalMember(owner = "client!et", name = "E", descriptor = "()V")
	protected final void method4541() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5357; local1++) {
			this.aClass54Array3[local1].method6537();
		}
		this.n();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!pu;[Lclient!bt;Z)Lclient!ra;")
	@Override
	public final Class80 method5850(@OriginalArg(0) Class244 arg0, @OriginalArg(1) Class40[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt895;
			local7[local11] = arg1[local11].anInt894;
			if (arg1[local11].aByteArray22 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class80_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class80_Sub2(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "()V")
	@Override
	public final void method5810() {
	}

	@OriginalMember(owner = "client!et", name = "p", descriptor = "()Lclient!la;")
	@Override
	public final Class179 method5828() {
		return new Class179(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!et", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5348 < arg0) {
			this.anInt5348 = arg0;
		}
		if (this.anInt5344 < arg1) {
			this.anInt5344 = arg1;
		}
		if (this.anInt5351 > arg2) {
			this.anInt5351 = arg2;
		}
		if (this.anInt5353 > arg3) {
			this.anInt5353 = arg3;
		}
		this.method4543();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method5814(@OriginalArg(0) Class12_Sub36 arg0) {
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I[Lclient!rh;)V")
	@Override
	public final void method5824(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub7[] arg1) {
	}

	@OriginalMember(owner = "client!et", name = "A", descriptor = "()Z")
	@Override
	public final boolean method5848() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!et", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5344) {
			local8 = this.anInt5344;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5353) {
			local21 = this.anInt5353;
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
				if (local91 < this.anInt5348) {
					local91 = this.anInt5348;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5351) {
					local102 = this.anInt5351;
				}
				local116 = local91 + local30 * this.anInt5359;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray375[local116++] = arg3;
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
				if (local91 < this.anInt5348) {
					local91 = this.anInt5348;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5351 - 1) {
					local102 = this.anInt5351 - 1;
				}
				local116 = local91 + local30 * this.anInt5359;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray375[local116++] = arg3;
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
				if (local102 < this.anInt5348) {
					local102 = this.anInt5348;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5351) {
					local116 = this.anInt5351;
				}
				local118 = local102 + local30 * this.anInt5359;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray375[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray375[local118++] = local277 + local340;
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
				if (local102 < this.anInt5348) {
					local102 = this.anInt5348;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5351 - 1) {
					local116 = this.anInt5351 - 1;
				}
				local118 = local102 + local30 * this.anInt5359;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray375[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray375[local118++] = local277 + local340;
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
				if (local91 < this.anInt5348) {
					local91 = this.anInt5348;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5351) {
					local102 = this.anInt5351;
				}
				local116 = local91 + local30 * this.anInt5359;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray375[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray375[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt5348) {
					local91 = this.anInt5348;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5351 - 1) {
					local102 = this.anInt5351 - 1;
				}
				local116 = local91 + local30 * this.anInt5359;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray375[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray375[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!et", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		@Pc(2) int local2 = this.anInt5342;
		this.anInt5342 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method5835(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas10 == null || this.aClass12_Sub5_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas10.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5359 && local21.y <= this.anInt5343 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass12_Sub5_3.method7570(local14, local21.width, local21.y, local21.height, local21.x);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!et", name = "y", descriptor = "()V")
	@Override
	public final void method5845() {
	}

	@OriginalMember(owner = "client!et", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass91_Sub3_7.anInt8566 + (this.aClass91_Sub3_7.anInt8573 * arg0 + this.aClass91_Sub3_7.anInt8575 * arg1 + this.aClass91_Sub3_7.anInt8568 * arg2 >> 15);
		if (local23 < this.anInt5338 || local23 > this.anInt5347) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt5356 * (this.aClass91_Sub3_7.anInt8570 + (this.aClass91_Sub3_7.anInt8572 * arg0 + this.aClass91_Sub3_7.anInt8571 * arg1 + this.aClass91_Sub3_7.anInt8574 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt5350 * (this.aClass91_Sub3_7.anInt8569 + (this.aClass91_Sub3_7.anInt8567 * arg0 + this.aClass91_Sub3_7.anInt8564 * arg1 + this.aClass91_Sub3_7.anInt8565 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt5360 && local73 <= this.anInt5363 && local102 >= this.anInt5362 && local102 <= this.anInt5366) {
			arg3[0] = local73 - this.anInt5360;
			arg3[1] = local102 - this.anInt5362;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!et", name = "o", descriptor = "()I")
	@Override
	public final int method5825() {
		return 0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5806(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!ln;IIII)Lclient!r;")
	public abstract Class26 method5812(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V")
	@Override
	public final void method5822(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!et", name = "v", descriptor = "(IIII)[I")
	@Override
	public final int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt5359 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray375[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class84 method5817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5359 + arg0;
		@Pc(16) int local16 = this.anInt5359 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray375[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class84_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class84_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(I)Lclient!u;")
	@Override
	public final Class12_Sub36 method5859(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5348) {
			arg2 -= this.anInt5348 - arg0;
			arg0 = this.anInt5348;
		}
		if (arg1 < this.anInt5344) {
			arg3 -= this.anInt5344 - arg1;
			arg1 = this.anInt5344;
		}
		if (arg0 + arg2 > this.anInt5351) {
			arg2 = this.anInt5351 - arg0;
		}
		if (arg1 + arg3 > this.anInt5353) {
			arg3 = this.anInt5353 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5351 || arg1 > this.anInt5353) {
			return;
		}
		@Pc(67) int local67 = this.anInt5359 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5359;
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
						local217 = this.anIntArray375[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray375[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray375[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray375[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray375[arg2] = arg4;
					arg2++;
					this.anIntArray375[arg2] = arg4;
					arg2++;
					this.anIntArray375[arg2] = arg4;
					arg2++;
					this.anIntArray375[arg2] = arg4;
					arg2++;
					this.anIntArray375[arg2] = arg4;
					arg2++;
					this.anIntArray375[arg2] = arg4;
					arg2++;
					this.anIntArray375[arg2] = arg4;
					arg2++;
					this.anIntArray375[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray375[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!et", name = "z", descriptor = "()Lclient!m;")
	@Override
	public final Class91 method5847() {
		@Pc(3) Class54 local3 = this.method4545(Thread.currentThread());
		return local3.aClass91_Sub3_9;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "()Z")
	@Override
	public final boolean method5798() {
		return true;
	}

	@OriginalMember(owner = "client!et", name = "F", descriptor = "()V")
	private void method4542() {
		if (this.aFloat115 == 0.0F) {
			this.anInt5345 = this.anInt5347;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5347;
		@Pc(12) float local12 = (float) this.anInt5338;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.lb / (this.aFloat115 + this.lb);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat115;
		this.anInt5345 = (int) (((float) this.anInt5347 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5844();

	@OriginalMember(owner = "client!et", name = "r", descriptor = "()Z")
	@Override
	public final boolean method5830() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "q", descriptor = "()Lclient!m;")
	@Override
	public final Class91 method5829() {
		return new Class91_Sub3();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5789(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class12_Sub5 local8 = (Class12_Sub5) this.aClass68_43.method1917((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static216.method3993(arg0);
			this.aClass68_43.method1916(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!et", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5359;
		@Pc(35) int local35 = this.anInt5359 - arg2;
		if (arg1 + arg3 > this.anInt5353) {
			arg3 -= arg1 + arg3 - this.anInt5353;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5344) {
			local59 = this.anInt5344 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5359;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5351) {
			local59 = arg0 + arg2 - this.anInt5351;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5348) {
			local59 = this.anInt5348 - arg0;
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
						this.anIntArray375[local30++] = arg4;
					} else {
						this.anIntArray375[local30++] = arg5;
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
					local245 = this.anIntArray375[local30];
					this.anIntArray375[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray375[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray375[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!et", name = "v", descriptor = "()Z")
	@Override
	public final boolean method5842() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class84 method5862(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class84_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class84_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class84_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class84_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!et", name = "G", descriptor = "()V")
	protected abstract void method4543();

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!et", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass91_Sub3_7.anInt8573 * arg0 + this.aClass91_Sub3_7.anInt8575 * arg1 + this.aClass91_Sub3_7.anInt8568 * arg2 >> 15) + this.aClass91_Sub3_7.anInt8566;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass91_Sub3_7.anInt8573 * arg3 + this.aClass91_Sub3_7.anInt8575 * arg4 + this.aClass91_Sub3_7.anInt8568 * arg5 >> 15) + this.aClass91_Sub3_7.anInt8566;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt5338 && local52 < this.anInt5338 || !(local23 <= this.anInt5347 || local52 <= this.anInt5347)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt5356 * ((this.aClass91_Sub3_7.anInt8572 * arg0 + this.aClass91_Sub3_7.anInt8571 * arg1 + this.aClass91_Sub3_7.anInt8574 * arg2 >> 15) + this.aClass91_Sub3_7.anInt8570) / local23;
		@Pc(133) int local133 = this.anInt5356 * ((this.aClass91_Sub3_7.anInt8572 * arg3 + this.aClass91_Sub3_7.anInt8571 * arg4 + this.aClass91_Sub3_7.anInt8574 * arg5 >> 15) + this.aClass91_Sub3_7.anInt8570) / local52;
		if (local104 < this.anInt5360 && local133 < this.anInt5360 || local104 > this.anInt5363 && local133 > this.anInt5363) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt5350 * ((this.aClass91_Sub3_7.anInt8567 * arg0 + this.aClass91_Sub3_7.anInt8564 * arg1 + this.aClass91_Sub3_7.anInt8565 * arg2 >> 15) + this.aClass91_Sub3_7.anInt8569) / local23;
			@Pc(209) int local209 = this.anInt5350 * ((this.aClass91_Sub3_7.anInt8567 * arg3 + this.aClass91_Sub3_7.anInt8564 * arg4 + this.aClass91_Sub3_7.anInt8565 * arg5 >> 15) + this.aClass91_Sub3_7.anInt8569) / local52;
			return (local180 >= this.anInt5362 || local209 >= this.anInt5362) && (local180 <= this.anInt5366 || local209 <= this.anInt5366);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method5793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class145_Sub1 local2 = (Class145_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray339;
		@Pc(8) int[] local8 = local2.anIntArray340;
		@Pc(17) int local17 = this.anInt5344 > arg7 ? this.anInt5344 : arg7;
		@Pc(32) int local32 = this.anInt5353 < arg7 + local5.length ? this.anInt5353 : arg7 + local5.length;
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
					if (local129 >= this.anInt5348 && local129 < this.anInt5351 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray375[local129 + arg1 * this.anInt5359] = arg4;
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
					if (local133 >= this.anInt5348 && local133 < this.anInt5351 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5359;
						local248 = this.anIntArray375[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray375[local133 + arg1 * this.anInt5359] = local201 + local584;
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
		if (arg0 < this.anInt5348) {
			arg1 += local83 * (this.anInt5348 - arg0);
			arg0 = this.anInt5348;
		}
		if (arg2 >= this.anInt5351) {
			arg2 = this.anInt5351 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray375[arg0 + local129 * this.anInt5359] = arg4;
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
					local243 = arg0 + local133 * this.anInt5359;
					local248 = this.anIntArray375[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray375[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5348 || arg0 >= this.anInt5351) {
			return;
		}
		if (arg1 < this.anInt5344) {
			arg2 -= this.anInt5344 - arg1;
			arg1 = this.anInt5344;
		}
		if (arg1 + arg2 > this.anInt5353) {
			arg2 = this.anInt5353 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5359;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray375[local40 + local54 * this.anInt5359] = arg3;
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
				local111 = local40 + local103 * this.anInt5359;
				local116 = this.anIntArray375[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray375[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5359;
				local111 = this.anIntArray375[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray375[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!et", name = "l", descriptor = "(I)[I")
	private int[] method4544(@OriginalArg(0) int arg0) {
		@Pc(2) Class125 local2 = this.aClass125_40;
		@Pc(12) Class12_Sub19 local12;
		synchronized (this.aClass125_40) {
			local12 = (Class12_Sub19) this.aClass125_40.method3446((long) arg0);
			if (local12 == null) {
				if (!super.anInterface11_11.method6213(arg0)) {
					return null;
				}
				@Pc(32) Class278 local32 = super.anInterface11_11.method6215(arg0);
				@Pc(42) int local42 = local32.aBoolean567 || this.aBoolean415 ? 64 : 128;
				local12 = new Class12_Sub19(arg0, local42, super.anInterface11_11.method6210(0.7F, local42, arg0, local42), local32.aBoolean572);
				this.aClass125_40.method3437(local12, (long) arg0);
			}
		}
		local12.aBoolean339 = true;
		return local12.method3664();
	}

	@OriginalMember(owner = "client!et", name = "ra", descriptor = "()F")
	@Override
	public final float ra() {
		return this.aFloat115;
	}

	@OriginalMember(owner = "client!et", name = "g", descriptor = "(I)V")
	@Override
	public final void method5861(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5335;
		for (@Pc(9) Object local9 = this.aClass125_40.method3443(); local9 != null; local9 = this.aClass125_40.method3441()) {
			@Pc(13) Class12_Sub19 local13 = (Class12_Sub19) local9;
			if (local13.aBoolean339) {
				local13.anInt4287 += local4;
				@Pc(27) int local27 = local13.anInt4287 / 20;
				if (local27 > 0) {
					@Pc(36) Class278 local36 = super.anInterface11_11.method6215(local13.anInt4285);
					local13.method3662(local36.aByte82 * local4 * 50 / 1000, local36.aByte88 * local4 * 50 / 1000);
					local13.anInt4287 -= local27 * 20;
				}
				local13.aBoolean339 = false;
			}
		}
		this.anInt5335 = arg0;
		this.aClass125_39.method3447(5);
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5361 = arg0;
		this.anInt5341 = arg1;
		this.anInt5356 = arg2;
		this.anInt5350 = arg3;
		this.method4543();
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt5338;
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5348;
		arg0[1] = this.anInt5344;
		arg0[2] = this.anInt5351;
		arg0[3] = this.anInt5353;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!hp;)V")
	@Override
	public final void method5856(@OriginalArg(0) Class136 arg0) {
		@Pc(3) Class7_Sub1 local3 = arg0.aClass313_1.aClass7_Sub1_9;
		for (@Pc(6) Class7_Sub1 local6 = local3.aClass7_Sub1_8; local6 != local3; local6 = local6.aClass7_Sub1_8) {
			@Pc(10) Class7_Sub1_Sub1 local10 = (Class7_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt3263 >> 12;
			@Pc(20) int local20 = local10.anInt3271 >> 12;
			@Pc(25) int local25 = local10.anInt3272 >> 12;
			@Pc(49) int local49 = this.aClass91_Sub3_7.anInt8566 + (this.aClass91_Sub3_7.anInt8573 * local15 + this.aClass91_Sub3_7.anInt8575 * local20 + this.aClass91_Sub3_7.anInt8568 * local25 >> 15);
			if (local49 >= this.anInt5338 && local49 <= this.anInt5349) {
				@Pc(90) int local90 = this.anInt5361 + this.anInt5356 * (this.aClass91_Sub3_7.anInt8570 + (this.aClass91_Sub3_7.anInt8572 * local15 + this.aClass91_Sub3_7.anInt8571 * local20 + this.aClass91_Sub3_7.anInt8574 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt5341 + this.anInt5350 * (this.aClass91_Sub3_7.anInt8569 + (this.aClass91_Sub3_7.anInt8567 * local15 + this.aClass91_Sub3_7.anInt8564 * local20 + this.aClass91_Sub3_7.anInt8565 * local25 >> 15)) / local49;
				if (local90 >= this.anInt5348 && local90 <= this.anInt5351 && local122 >= this.anInt5344 && local122 <= this.anInt5353) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method4548(local10, local90, local122, (local10.anInt3268 * this.anInt5356 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!et", name = "h", descriptor = "()Z")
	@Override
	public final boolean method5813() {
		return true;
	}

	@OriginalMember(owner = "client!et", name = "C", descriptor = "()Z")
	@Override
	public final boolean method5853() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method5803(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!et", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5359) {
			arg2 = this.anInt5359;
		}
		if (arg3 > this.anInt5343) {
			arg3 = this.anInt5343;
		}
		this.anInt5348 = arg0;
		this.anInt5351 = arg2;
		this.anInt5344 = arg1;
		this.anInt5353 = arg3;
		this.method4543();
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!ch;")
	public abstract Class54 method4545(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!sv;)V")
	@Override
	public final void method5801(@OriginalArg(0) Class124 arg0) {
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt5348) {
					arg1 += local104 * (this.anInt5348 - arg0);
					arg0 = this.anInt5348;
				}
				if (arg2 >= this.anInt5351) {
					arg2 = this.anInt5351 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5344 && local150 < this.anInt5353) {
							this.anIntArray375[arg0 + local150 * this.anInt5359] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5344 && local213 < this.anInt5353) {
							local228 = arg0 + local213 * this.anInt5359;
							local233 = this.anIntArray375[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray375[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5344 && local150 < this.anInt5353) {
							local213 = arg0 + local150 * this.anInt5359;
							local228 = this.anIntArray375[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray375[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt5344) {
					arg0 += local104 * (this.anInt5344 - arg1);
					arg1 = this.anInt5344;
				}
				if (arg3 >= this.anInt5353) {
					arg3 = this.anInt5353 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5348 && local150 < this.anInt5351) {
							this.anIntArray375[local150 + arg1 * this.anInt5359] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5348 && local213 < this.anInt5351) {
							local228 = local213 + arg1 * this.anInt5359;
							local233 = this.anIntArray375[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray375[local213 + arg1 * this.anInt5359] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5348 && local150 < this.anInt5351) {
							local213 = local150 + arg1 * this.anInt5359;
							local228 = this.anIntArray375[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray375[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!et", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5358 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt5358 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt5358 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt5358 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt5358 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean414 = false;
		} else {
			this.aBoolean414 = true;
		}
	}

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(II)I")
	@Override
	public final int method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!et", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5339 = this.anInt5358;
		this.anInt5364 = arg0;
		this.anInt5358 = arg1;
		this.anInt5355 = arg2;
		this.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)V")
	public abstract void method5837(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!et", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5799(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "()V")
	@Override
	public void method5792() {
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class145 method5832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class145_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIIIII)V")
	public final void method4546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface11_11.method6215(arg5).aBoolean568) {
			this.A(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt5367 != arg5) {
			@Pc(26) Class84 local26 = (Class84) this.aClass125_39.method3446((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method4544(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method4539(arg5) ? 64 : 128;
				local26 = this.method5862(local32, local43, local43, local43);
				this.aClass125_39.method3437(local26, (long) arg5);
			}
			this.anInt5367 = arg5;
			this.aClass84_12 = local26;
		}
		this.aClass84_12.ra(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(Z)V")
	@Override
	public final void method5863(@OriginalArg(0) boolean arg0) {
		this.aBoolean415 = arg0;
		this.aClass125_40.method3440();
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5846(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!et", name = "i", descriptor = "()V")
	@Override
	public final void method5816() {
	}

	@OriginalMember(owner = "client!et", name = "m", descriptor = "(I)Z")
	public final boolean method4547(@OriginalArg(0) int arg0) {
		return super.anInterface11_11.method6215(arg0).aBoolean571;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!kn;I)V")
	public abstract void method5860(@OriginalArg(0) Class26[] arg0, @OriginalArg(1) Class91 arg1, @OriginalArg(2) Class7_Sub4[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!et", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5352 = (int) (arg1 * 65535.0F);
		this.anInt5336 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5340 = (int) (arg3 * 65535.0F / local26);
		this.anInt5354 = (int) (arg4 * 65535.0F / local26);
		this.anInt5337 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method5855(@OriginalArg(0) Class91 arg0) {
		this.aClass91_Sub3_7 = (Class91_Sub3) arg0;
	}

	@OriginalMember(owner = "client!et", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt5347;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "()V")
	@Override
	public final void method5794() {
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5791(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas10 == arg0) {
			this.method5846(null);
		}
		@Pc(15) Class12_Sub5 local15 = (Class12_Sub5) this.aClass68_43.method1917((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7967();
		}
	}

	@OriginalMember(owner = "client!et", name = "l", descriptor = "()V")
	@Override
	public final void method5821() throws Exception_Sub1 {
		if (this.aCanvas10 == null || this.aClass12_Sub5_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas10.getGraphics();
			this.aClass12_Sub5_3.method7565(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!et", name = "u", descriptor = "()V")
	@Override
	public final void method5841() {
		this.aClass125_40.method3440();
	}

	@OriginalMember(owner = "client!et", name = "d", descriptor = "(I)V")
	@Override
	public final void method5815(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!et", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		this.anInt5348 = 0;
		this.anInt5344 = 0;
		this.anInt5351 = this.anInt5359;
		this.anInt5353 = this.anInt5343;
		this.method4543();
	}

	@OriginalMember(owner = "client!et", name = "x", descriptor = "()Z")
	public abstract boolean method5843();

	@OriginalMember(owner = "client!et", name = "P", descriptor = "()F")
	@Override
	public final float P() {
		return this.lb;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!mca;III)V")
	public final void method4548(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt3264;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.A(arg1, arg2, arg3, arg0.anInt3273, 1);
			return;
		}
		if (this.anInt5367 != local2) {
			@Pc(32) Class84 local32 = (Class84) this.aClass125_39.method3446((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method4544(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method4539(local2) ? 64 : 128;
				local32 = this.method5862(local38, local48, local48, local48);
				this.aClass125_39.method3437(local32, (long) local2);
			}
			this.anInt5367 = local2;
			this.aClass84_12 = local32;
		}
		local8++;
		this.aClass84_12.ra(arg1 - arg3, arg2 - arg3, local8, local8, 0, arg0.anInt3273, 1);
	}

	@OriginalMember(owner = "client!et", name = "D", descriptor = "()Z")
	@Override
	public final boolean method5867() {
		return true;
	}

	@OriginalMember(owner = "client!et", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.lb = arg0;
		this.aFloat115 = arg1;
		this.method4542();
	}

	@OriginalMember(owner = "client!et", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return 0;
	}

	@OriginalMember(owner = "client!et", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
	public abstract void method5797(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!et", name = "j", descriptor = "()Z")
	@Override
	public final boolean method5818() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "B", descriptor = "()Z")
	@Override
	public final boolean method5849() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "Z", descriptor = "(I)V")
	@Override
	public final void Z(@OriginalArg(0) int arg0) {
		this.f(0, 0, this.anInt5359, this.anInt5343, arg0, 0);
	}

	@OriginalMember(owner = "client!et", name = "k", descriptor = "()Z")
	@Override
	public final boolean method5819() {
		return false;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIF)Lclient!rh;")
	@Override
	public final Class12_Sub7 method5831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}
}
