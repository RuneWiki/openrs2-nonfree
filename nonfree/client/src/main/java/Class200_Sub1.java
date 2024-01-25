import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class200_Sub1 extends Class200 {

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "Z")
	private boolean aBoolean367;

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
	private int anInt5398;

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "Z")
	private boolean aBoolean368;

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "Lclient!vg;")
	private Class252 aClass252_31;

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "Lclient!gq;")
	private Class5_Sub17 aClass5_Sub17_1;

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
	public int anInt5399;

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
	public int anInt5400;

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
	public int anInt5401;

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
	private int anInt5402;

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "Lclient!d;")
	private final Class44 aClass44_53;

	@OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
	public int anInt5403;

	@OriginalMember(owner = "client!qf", name = "G", descriptor = "I")
	public int anInt5404;

	@OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
	public int anInt5405;

	@OriginalMember(owner = "client!qf", name = "I", descriptor = "I")
	public int anInt5406;

	@OriginalMember(owner = "client!qf", name = "J", descriptor = "I")
	public int anInt5407;

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "I")
	public int anInt5408;

	@OriginalMember(owner = "client!qf", name = "L", descriptor = "I")
	public int anInt5409;

	@OriginalMember(owner = "client!qf", name = "M", descriptor = "Z")
	private boolean aBoolean369;

	@OriginalMember(owner = "client!qf", name = "N", descriptor = "Lclient!lc;")
	public Class29_Sub2 aClass29_Sub2_3;

	@OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
	private int anInt5410;

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
	public int anInt5411;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
	public int anInt5412;

	@OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
	public int anInt5413;

	@OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
	public int anInt5414;

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "Z")
	public boolean aBoolean370;

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
	public int anInt5415;

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
	public int anInt5416;

	@OriginalMember(owner = "client!qf", name = "W", descriptor = "Lclient!d;")
	private final Class44 aClass44_54;

	@OriginalMember(owner = "client!qf", name = "X", descriptor = "I")
	public int anInt5417;

	@OriginalMember(owner = "client!qf", name = "Y", descriptor = "F")
	private float aFloat128;

	@OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
	public int anInt5418;

	@OriginalMember(owner = "client!qf", name = "ab", descriptor = "I")
	public int anInt5419;

	@OriginalMember(owner = "client!qf", name = "bb", descriptor = "I")
	public int anInt5420;

	@OriginalMember(owner = "client!qf", name = "cb", descriptor = "Lclient!o;")
	private Class49 aClass49_18;

	@OriginalMember(owner = "client!qf", name = "db", descriptor = "F")
	private float aFloat129;

	@OriginalMember(owner = "client!qf", name = "eb", descriptor = "I")
	private int anInt5421;

	@OriginalMember(owner = "client!qf", name = "fb", descriptor = "I")
	public int anInt5422;

	@OriginalMember(owner = "client!qf", name = "gb", descriptor = "I")
	private int anInt5423;

	@OriginalMember(owner = "client!qf", name = "hb", descriptor = "I")
	public int anInt5424;

	@OriginalMember(owner = "client!qf", name = "ib", descriptor = "I")
	public int anInt5425;

	@OriginalMember(owner = "client!qf", name = "jb", descriptor = "[Lclient!mh;")
	private Class159[] aClass159Array1;

	@OriginalMember(owner = "client!qf", name = "kb", descriptor = "I")
	public int anInt5426;

	@OriginalMember(owner = "client!qf", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!qf", name = "mb", descriptor = "Z")
	public boolean aBoolean371;

	@OriginalMember(owner = "client!qf", name = "nb", descriptor = "I")
	private int anInt5427;

	@OriginalMember(owner = "client!qf", name = "ob", descriptor = "I")
	public int anInt5428;

	@OriginalMember(owner = "client!qf", name = "pb", descriptor = "I")
	private int anInt5429;

	@OriginalMember(owner = "client!qf", name = "qb", descriptor = "Lclient!o;")
	private Class49 aClass49_19;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;)V")
	public Class200_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface8 arg2) {
		this(arg0, arg2);
		this.method5840(arg1);
		this.method5878(arg1);
	}

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(ILclient!l;)V")
	private Class200_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg0, arg1);
		this.aBoolean367 = false;
		this.aBoolean368 = false;
		this.aClass252_31 = new Class252(4);
		this.anInt5401 = 0;
		this.anInt5407 = 45823;
		this.anInt5412 = 75518;
		this.anInt5416 = 0;
		this.anInt5410 = 3500;
		this.aBoolean369 = false;
		this.anInt5404 = 0;
		this.anInt5413 = 0;
		this.anInt5422 = 512;
		this.anInt5417 = this.anInt5410 - 255;
		this.anInt5419 = 78642;
		this.anInt5411 = 0;
		this.anInt5427 = 0;
		this.anInt5399 = 0;
		this.lb = 50;
		this.aBoolean371 = false;
		this.anInt5421 = 0;
		this.anInt5420 = 3500;
		this.anInt5418 = 512;
		this.anInt5423 = 0;
		this.anInt5409 = 0;
		this.aClass44_53 = new Class44(16);
		this.anInt5429 = -1;
		this.aClass44_54 = new Class44(20);
		this.aClass29_Sub2_3 = new Class29_Sub2();
		this.method5845(1);
		this.method5838(0);
		Static209.method2788(false, true);
		this.aBoolean368 = true;
	}

	@OriginalMember(owner = "client!qf", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt5416 = 0;
		this.anInt5404 = 0;
		this.anInt5411 = this.anInt5426;
		this.anInt5401 = this.anInt5402;
		this.method4315();
	}

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5407 = (int) (arg1 * 65535.0F);
		this.anInt5419 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5403 = (int) (arg3 * 65535.0F / local26);
		this.anInt5415 = (int) (arg4 * 65535.0F / local26);
		this.anInt5405 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!qf", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5416) {
			arg2 -= this.anInt5416 - arg0;
			arg0 = this.anInt5416;
		}
		if (arg1 < this.anInt5404) {
			arg3 -= this.anInt5404 - arg1;
			arg1 = this.anInt5404;
		}
		if (arg0 + arg2 > this.anInt5411) {
			arg2 = this.anInt5411 - arg0;
		}
		if (arg1 + arg3 > this.anInt5401) {
			arg3 = this.anInt5401 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5411 || arg1 > this.anInt5401) {
			return;
		}
		@Pc(67) int local67 = this.anInt5426 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5426;
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
						local221 = this.anIntArray388[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray388[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray388[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray388[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray388[arg2] = arg4;
					arg2++;
					this.anIntArray388[arg2] = arg4;
					arg2++;
					this.anIntArray388[arg2] = arg4;
					arg2++;
					this.anIntArray388[arg2] = arg4;
					arg2++;
					this.anIntArray388[arg2] = arg4;
					arg2++;
					this.anIntArray388[arg2] = arg4;
					arg2++;
					this.anIntArray388[arg2] = arg4;
					arg2++;
					this.anIntArray388[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray388[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!qf", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat129;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class159 local3 = this.method4316(Thread.currentThread());
		@Pc(6) Class201 local6 = local3.aClass201_2;
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
		@Pc(93) int local93 = arg0 - local6.method4347();
		@Pc(98) int local98 = arg1 - local6.method4350();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt5453 = 0;
		local6.aBoolean373 = local102 < 0 || local102 > local6.anInt5452 || local106 < 0 || local106 > local6.anInt5452 || local112 < 0 || local112 > local6.anInt5452;
		local6.method4353(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean373 = local102 < 0 || local102 > local6.anInt5452 || local106 < 0 || local106 > local6.anInt5452 || local118 < 0 || local118 > local6.anInt5452;
		local6.method4353(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)[I")
	public int[] method4312(@OriginalArg(0) int arg0) {
		@Pc(2) Class44 local2 = this.aClass44_54;
		@Pc(12) Class5_Sub25 local12;
		synchronized (this.aClass44_54) {
			local12 = (Class5_Sub25) this.aClass44_54.method1028((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_134.method4123(arg0)) {
					return null;
				}
				@Pc(32) Class178 local32 = super.anInterface8_134.method4125(arg0);
				@Pc(42) int local42 = local32.aBoolean324 || this.aBoolean369 ? 64 : 128;
				local12 = new Class5_Sub25(arg0, local42, super.anInterface8_134.method4126(local42, arg0, local42, true, 0.7F), local32.aBoolean320);
				this.aClass44_54.method1017((long) arg0, local12);
			}
		}
		local12.aBoolean230 = true;
		return local12.method2816();
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIIIII)Lclient!bn;")
	@Override
	public Class24 method5851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	@Override
	public void method5838(@OriginalArg(0) int arg0) {
		this.aClass159Array1[arg0].method3313(Thread.currentThread());
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!rr;Z)Lclient!o;")
	@Override
	public Class49 method5871(@OriginalArg(0) Class214 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray419;
		@Pc(5) byte[] local5 = arg0.aByteArray75;
		@Pc(8) int local8 = arg0.anInt5882;
		@Pc(11) int local11 = arg0.anInt5885;
		@Pc(76) Class49_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray76 == null) {
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
			local76 = new Class49_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray76;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class49_Sub1_Sub1(this, local20, local8, local11);
				local76 = new Class49_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class49_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.ha(arg0.anInt5884, arg0.anInt5881, arg0.anInt5883, arg0.anInt5880);
		return local76;
	}

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "()V")
	private void method4313() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5424; local1++) {
			this.aClass159Array1[local1].method3311();
		}
		this.va();
	}

	@OriginalMember(owner = "client!qf", name = "C", descriptor = "()Z")
	public boolean method4314() {
		return this.aBoolean367;
	}

	@OriginalMember(owner = "client!qf", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5404 || arg1 >= this.anInt5401) {
			return;
		}
		if (arg0 < this.anInt5416) {
			arg2 -= this.anInt5416 - arg0;
			arg0 = this.anInt5416;
		}
		if (arg0 + arg2 > this.anInt5411) {
			arg2 = this.anInt5411 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5426;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray388[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray388[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray388[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray388[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray388[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qf", name = "D", descriptor = "()V")
	private void method4315() {
		this.anInt5428 = this.anInt5416 - this.anInt5406;
		this.anInt5425 = this.anInt5411 - this.anInt5406;
		this.anInt5414 = this.anInt5404 - this.anInt5400;
		this.anInt5408 = this.anInt5401 - this.anInt5400;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5424; local29++) {
			@Pc(36) Class201 local36 = this.aClass159Array1[local29].aClass201_2;
			local36.anInt5451 = this.anInt5406 - this.anInt5416;
			local36.anInt5449 = this.anInt5400 - this.anInt5404;
			local36.anInt5452 = this.anInt5411 - this.anInt5416;
			local36.anInt5450 = this.anInt5401 - this.anInt5404;
		}
		@Pc(78) int local78 = this.anInt5404 * this.anInt5426 + this.anInt5416;
		for (@Pc(81) int local81 = this.anInt5404; local81 < this.anInt5401; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt5424; local84++) {
				this.aClass159Array1[local84].aClass201_2.anIntArray391[local81 - this.anInt5404] = local78;
			}
			local78 += this.anInt5426;
		}
	}

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt5399 = this.anInt5427;
		this.aBoolean371 = false;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "()V")
	@Override
	public void method5813() {
		if (this.aCanvas5 == null || this.aClass5_Sub17_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			this.aClass5_Sub17_1.method4119(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "()Z")
	@Override
	public boolean method5821() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
	@Override
	public void method5884(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class29 arg0) {
		this.aClass29_Sub2_3 = (Class29_Sub2) arg0;
	}

	@OriginalMember(owner = "client!qf", name = "m", descriptor = "()Z")
	@Override
	public boolean method5850() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Lclient!n;")
	@Override
	public Class5_Sub28 method5817(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "()V")
	@Override
	protected void method5885() {
		if (this.aBoolean368) {
			Static356.method4615(true, false);
			this.aBoolean368 = false;
		}
		this.aClass5_Sub17_1 = null;
		this.aCanvas5 = null;
		this.aClass252_31 = null;
		this.aBoolean367 = true;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "()Z")
	@Override
	public boolean method5816() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.ma(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.ma(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt5416) {
					arg1 += local104 * (this.anInt5416 - arg0);
					arg0 = this.anInt5416;
				}
				if (arg2 >= this.anInt5411) {
					arg2 = this.anInt5411 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5404 && local150 < this.anInt5401) {
							this.anIntArray388[arg0 + local150 * this.anInt5426] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5404 && local213 < this.anInt5401) {
							local228 = arg0 + local213 * this.anInt5426;
							local233 = this.anIntArray388[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray388[local228] = local204 + local233;
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
				if (arg1 < this.anInt5404) {
					arg0 += local104 * (this.anInt5404 - arg1);
					arg1 = this.anInt5404;
				}
				if (arg3 >= this.anInt5401) {
					arg3 = this.anInt5401 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5416 && local150 < this.anInt5411) {
							this.anIntArray388[local150 + arg1 * this.anInt5426] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5416 && local213 < this.anInt5411) {
							local228 = local213 + arg1 * this.anInt5426;
							local233 = this.anIntArray388[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray388[local213 + arg1 * this.anInt5426] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.IA(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.IA(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!qf", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5426) {
			arg2 = this.anInt5426;
		}
		if (arg3 > this.anInt5402) {
			arg3 = this.anInt5402;
		}
		this.anInt5416 = arg0;
		this.anInt5411 = arg2;
		this.anInt5404 = arg1;
		this.anInt5401 = arg3;
		this.method4315();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!mh;")
	public Class159 method4316(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5424; local1++) {
			if (this.aClass159Array1[local1].aRunnable2 == arg0) {
				return this.aClass159Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qf", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5416 < arg0) {
			this.anInt5416 = arg0;
		}
		if (this.anInt5404 < arg1) {
			this.anInt5404 = arg1;
		}
		if (this.anInt5411 > arg2) {
			this.anInt5411 = arg2;
		}
		if (this.anInt5401 > arg3) {
			this.anInt5401 = arg3;
		}
		this.method4315();
	}

	@OriginalMember(owner = "client!qf", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		this.anInt5412 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!qf", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat128 = arg0;
		this.aFloat129 = arg1;
		this.method4318();
	}

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "()V")
	@Override
	public void method5883() {
		this.aClass44_54.method1031();
	}

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "()Lclient!c;")
	@Override
	public Class29 method5866() {
		@Pc(3) Class159 local3 = this.method4316(Thread.currentThread());
		return local3.aClass29_Sub2_2;
	}

	@OriginalMember(owner = "client!qf", name = "w", descriptor = "()Lclient!c;")
	@Override
	public Class29 method5880() {
		return new Class29_Sub2();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5409 = arg0;
		this.anInt5399 = arg1;
		this.anInt5413 = arg2;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class49 method5849(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class49_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class49_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class49_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class49_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ij;III)V")
	public void method4317(@OriginalArg(0) Class88_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt2371;
		@Pc(4) int local4 = arg3;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.ZA(arg1, arg2, local4, arg0.anInt2366, 1);
			return;
		}
		if (this.anInt5429 != local2) {
			@Pc(32) Class49 local32 = (Class49) this.aClass44_53.method1028((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method4319(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method4324(local2) ? 64 : 128;
				local32 = this.method5849(local38, local48, local48, local48);
				this.aClass44_53.method1017((long) local2, local32);
			}
			this.anInt5429 = local2;
			this.aClass49_19 = local32;
		}
		this.aClass49_19.ya(arg1 - local4, arg2 - local4, local8, local8, 0, arg0.anInt2366, 1);
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "()V")
	@Override
	public void method5818() {
	}

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "()Z")
	@Override
	public boolean method5862() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "()Z")
	@Override
	public boolean method5812() {
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "E", descriptor = "()V")
	private void method4318() {
		if (this.aFloat129 == 0.0F) {
			this.anInt5420 = this.anInt5410;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5410;
		@Pc(12) float local12 = (float) this.lb;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat128 / (this.aFloat129 + this.aFloat128);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat129;
		this.anInt5420 = (int) (((float) this.anInt5410 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!e;Lclient!vm;Lclient!c;Lclient!wg;I)V")
	@Override
	public void method5869(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) Class88_Sub8 arg3) {
		((Class57_Sub1) arg0).method3280(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)[I")
	private int[] method4319(@OriginalArg(0) int arg0) {
		@Pc(2) Class44 local2 = this.aClass44_54;
		@Pc(12) Class5_Sub25 local12;
		synchronized (this.aClass44_54) {
			local12 = (Class5_Sub25) this.aClass44_54.method1028((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_134.method4123(arg0)) {
					return null;
				}
				@Pc(32) Class178 local32 = super.anInterface8_134.method4125(arg0);
				@Pc(42) int local42 = local32.aBoolean324 || this.aBoolean369 ? 64 : 128;
				local12 = new Class5_Sub25(arg0, local42, super.anInterface8_134.method4124(arg0, local42, local42, 0.7F), local32.aBoolean320);
				this.aClass44_54.method1017((long) arg0, local12);
			}
		}
		local12.aBoolean230 = true;
		return local12.method2816();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIII)V")
	public void method4320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface8_134.method4125(arg5).aBoolean321) {
			this.ZA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt5429 != arg5) {
			@Pc(26) Class49 local26 = (Class49) this.aClass44_53.method1028((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method4319(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method4324(arg5) ? 64 : 128;
				local26 = this.method5849(local32, local43, local43, local43);
				this.aClass44_53.method1017((long) arg5, local26);
			}
			this.anInt5429 = arg5;
			this.aClass49_19 = local26;
		}
		this.aClass49_19.ya(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!wg;I)V")
	@Override
	public void method5843(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) Class88_Sub8[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class57_Sub1[] local3 = new Class57_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class57_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class57_Sub1 local26 = Static254.method3266(this, local3);
		local26.method3280(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass29_Sub2_3.anInt3838 + (this.aClass29_Sub2_3.anInt3846 * arg0 + this.aClass29_Sub2_3.anInt3844 * arg1 + this.aClass29_Sub2_3.anInt3840 * arg2 >> 15);
		if (local23 < this.lb || local23 > this.anInt5410) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt5422 * (this.aClass29_Sub2_3.anInt3841 + (this.aClass29_Sub2_3.anInt3839 * arg0 + this.aClass29_Sub2_3.anInt3845 * arg1 + this.aClass29_Sub2_3.anInt3842 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt5418 * (this.aClass29_Sub2_3.anInt3843 + (this.aClass29_Sub2_3.anInt3836 * arg0 + this.aClass29_Sub2_3.anInt3837 * arg1 + this.aClass29_Sub2_3.anInt3835 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt5428 && local73 <= this.anInt5425 && local102 >= this.anInt5414 && local102 <= this.anInt5408) {
			arg3[0] = local73 - this.anInt5428;
			arg3[1] = local102 - this.anInt5414;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!qf", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5426;
		@Pc(35) int local35 = this.anInt5426 - arg2;
		if (arg1 + arg3 > this.anInt5401) {
			arg3 -= arg1 + arg3 - this.anInt5401;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5404) {
			local59 = this.anInt5404 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5426;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5411) {
			local59 = arg0 + arg2 - this.anInt5411;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5416) {
			local59 = this.anInt5416 - arg0;
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
						this.anIntArray388[local30++] = arg4;
					} else {
						this.anIntArray388[local30++] = arg5;
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
					local245 = this.anIntArray388[local30];
					this.anIntArray388[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray388[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray388[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819(@OriginalArg(0) boolean arg0) {
		this.aBoolean369 = arg0;
		this.aClass44_54.method1031();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5831(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class5_Sub17 local8 = (Class5_Sub17) this.aClass252_31.method5659((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method6003();
		local8 = Static142.method2031(arg0);
		this.aClass252_31.method5658(local8, (long) arg0.hashCode());
		if (this.aCanvas5 != arg0 || this.aClass49_18 != null) {
			return;
		}
		this.aClass5_Sub17_1 = local8;
		this.anIntArray388 = local8.anIntArray386;
		this.anInt5426 = local8.anInt5326;
		this.anInt5402 = local8.anInt5324;
		this.method4313();
	}

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)I")
	public int method4321(@OriginalArg(0) int arg0) {
		return super.anInterface8_134.method4125(arg0).aShort54 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
	@Override
	public void method5845(@OriginalArg(0) int arg0) {
		if (this.anInt5424 == arg0) {
			return;
		}
		this.anInt5424 = arg0;
		this.aClass159Array1 = new Class159[this.anInt5424];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5424; local14++) {
			this.aClass159Array1[local14] = new Class159(this);
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)V")
	@Override
	public void method5863(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5840(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class5_Sub17 local8 = (Class5_Sub17) this.aClass252_31.method5659((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static142.method2031(arg0);
			this.aClass252_31.method5658(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
	@Override
	public void method5854(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5398;
		for (@Pc(9) Object local9 = this.aClass44_54.method1033(); local9 != null; local9 = this.aClass44_54.method1022()) {
			@Pc(13) Class5_Sub25 local13 = (Class5_Sub25) local9;
			if (local13.aBoolean230) {
				local13.anInt3555 += local4;
				@Pc(27) int local27 = local13.anInt3555 / 20;
				if (local27 > 0) {
					@Pc(36) Class178 local36 = super.anInterface8_134.method4125(local13.anInt3553);
					local13.method2815(local36.aByte54 * local4 * 50 / 1000, local36.aByte50 * local4 * 50 / 1000);
					local13.anInt3555 -= local27 * 20;
				}
				local13.aBoolean230 = false;
			}
		}
		this.anInt5398 = arg0;
		this.aClass44_53.method1025(5);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIF)Lclient!rd;")
	@Override
	public Class5_Sub19 method5858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "(I)Z")
	public boolean method4322(@OriginalArg(0) int arg0) {
		return super.anInterface8_134.method4123(arg0);
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
	@Override
	public void method5848(@OriginalArg(0) int arg0) {
		this.aClass159Array1[arg0].method3313(null);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!fe;IIII)Lclient!e;")
	@Override
	public Class57 method5882(@OriginalArg(0) Class74 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5399 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt5399 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt5399 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt5399 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt5399 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean370 = false;
		} else {
			this.aBoolean370 = true;
		}
	}

	@OriginalMember(owner = "client!qf", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class97 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class97_Sub1 local2 = (Class97_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray140;
		@Pc(8) int[] local8 = local2.anIntArray141;
		@Pc(20) int local20;
		if (this.anInt5401 < arg3 + local5.length) {
			local20 = this.anInt5401 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5404 > arg3) {
			local33 = this.anInt5404 - arg3;
			arg3 = this.anInt5404;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt5426;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5416 > local58) {
				local62 -= this.anInt5416 - local58;
				local58 = this.anInt5416;
			}
			if (this.anInt5411 < local58 + local62) {
				local62 = this.anInt5411 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray388[local58++] = arg0;
			}
			local49 += this.anInt5426;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I[Lclient!rd;)V")
	@Override
	public void method5846(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub19[] arg1) {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!bn;)V")
	@Override
	public void method5826(@OriginalArg(0) Class24 arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5406 = arg0;
		this.anInt5400 = arg1;
		this.anInt5422 = arg2;
		this.anInt5418 = arg3;
		this.method4315();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5877(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas5 == null || this.aClass5_Sub17_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5426 && local21.y <= this.anInt5402 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass5_Sub17_1.method4122(local21.y, local21.x, local14, local21.width, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "()Z")
	@Override
	public boolean method5864() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5416;
		arg0[1] = this.anInt5404;
		arg0[2] = this.anInt5411;
		arg0[3] = this.anInt5401;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5820(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!qf", name = "g", descriptor = "()V")
	@Override
	public void method5829() {
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class125 method5841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class125_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "()Z")
	@Override
	public boolean method5832() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt5410;
	}

	@OriginalMember(owner = "client!qf", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5416 || arg0 >= this.anInt5411) {
			return;
		}
		if (arg1 < this.anInt5404) {
			arg2 -= this.anInt5404 - arg1;
			arg1 = this.anInt5404;
		}
		if (arg1 + arg2 > this.anInt5401) {
			arg2 = this.anInt5401 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5426;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray388[local40 + local54 * this.anInt5426] = arg3;
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
				local111 = local40 + local103 * this.anInt5426;
				local116 = this.anIntArray388[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray388[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5426;
				local111 = this.anIntArray388[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray388[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "()I")
	@Override
	public int method5852() {
		return 0;
	}

	@OriginalMember(owner = "client!qf", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat128;
	}

	@OriginalMember(owner = "client!qf", name = "v", descriptor = "()Z")
	@Override
	public boolean method5873() {
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5427 = this.anInt5399;
		this.anInt5409 = arg0;
		this.anInt5399 = arg1;
		this.anInt5413 = arg2;
		this.aBoolean371 = true;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!ap;[Lclient!rr;Z)Lclient!la;")
	@Override
	public Class23 method5837(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class214[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt5882;
			local7[local11] = arg1[local11].anInt5885;
			if (arg1[local11].aByteArray76 != null) {
			}
		}
		return new Class23_Sub2(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class97 method5847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class97_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "()Z")
	@Override
	public boolean method5853() {
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!qf", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt5426 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray388[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.P(0, 0, this.anInt5426, this.anInt5402, arg0, 0);
	}

	@OriginalMember(owner = "client!qf", name = "B", descriptor = "()V")
	@Override
	public void method5887() {
	}

	@OriginalMember(owner = "client!qf", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass29_Sub2_3.anInt3846 * arg0 + this.aClass29_Sub2_3.anInt3844 * arg1 + this.aClass29_Sub2_3.anInt3840 * arg2 >> 15) + this.aClass29_Sub2_3.anInt3838;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass29_Sub2_3.anInt3846 * arg3 + this.aClass29_Sub2_3.anInt3844 * arg4 + this.aClass29_Sub2_3.anInt3840 * arg5 >> 15) + this.aClass29_Sub2_3.anInt3838;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.lb && local52 < this.lb || !(local23 <= this.anInt5410 || local52 <= this.anInt5410)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt5422 * ((this.aClass29_Sub2_3.anInt3839 * arg0 + this.aClass29_Sub2_3.anInt3845 * arg1 + this.aClass29_Sub2_3.anInt3842 * arg2 >> 15) + this.aClass29_Sub2_3.anInt3841) / local23;
		@Pc(133) int local133 = this.anInt5422 * ((this.aClass29_Sub2_3.anInt3839 * arg3 + this.aClass29_Sub2_3.anInt3845 * arg4 + this.aClass29_Sub2_3.anInt3842 * arg5 >> 15) + this.aClass29_Sub2_3.anInt3841) / local52;
		if (local104 < this.anInt5428 && local133 < this.anInt5428 || local104 > this.anInt5425 && local133 > this.anInt5425) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt5418 * ((this.aClass29_Sub2_3.anInt3836 * arg0 + this.aClass29_Sub2_3.anInt3837 * arg1 + this.aClass29_Sub2_3.anInt3835 * arg2 >> 15) + this.aClass29_Sub2_3.anInt3843) / local23;
			@Pc(209) int local209 = this.anInt5418 * ((this.aClass29_Sub2_3.anInt3836 * arg3 + this.aClass29_Sub2_3.anInt3837 * arg4 + this.aClass29_Sub2_3.anInt3835 * arg5 >> 15) + this.aClass29_Sub2_3.anInt3843) / local52;
			return (local180 >= this.anInt5414 || local209 >= this.anInt5414) && (local180 <= this.anInt5408 || local209 <= this.anInt5408);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class97 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class97_Sub1 local2 = (Class97_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray140;
		@Pc(8) int[] local8 = local2.anIntArray141;
		@Pc(17) int local17 = this.anInt5404 > arg7 ? this.anInt5404 : arg7;
		@Pc(32) int local32 = this.anInt5401 < arg7 + local5.length ? this.anInt5401 : arg7 + local5.length;
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
					if (local129 >= this.anInt5416 && local129 < this.anInt5411 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray388[local129 + arg1 * this.anInt5426] = arg4;
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
					if (local133 >= this.anInt5416 && local133 < this.anInt5411 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5426;
						local248 = this.anIntArray388[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray388[local133 + arg1 * this.anInt5426] = local201 + local584;
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
		if (arg0 < this.anInt5416) {
			arg1 += local83 * (this.anInt5416 - arg0);
			arg0 = this.anInt5416;
		}
		if (arg2 >= this.anInt5411) {
			arg2 = this.anInt5411 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray388[arg0 + local129 * this.anInt5426] = arg4;
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
					local243 = arg0 + local133 * this.anInt5426;
					local248 = this.anIntArray388[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray388[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!vm;)V")
	@Override
	public void method5872(@OriginalArg(0) Class255 arg0) {
		@Pc(3) Class88_Sub1 local3 = arg0.aClass225_1.aClass88_Sub1_9;
		for (@Pc(6) Class88_Sub1 local6 = local3.aClass88_Sub1_7; local6 != local3; local6 = local6.aClass88_Sub1_7) {
			@Pc(10) Class88_Sub1_Sub1 local10 = (Class88_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt2368 >> 12;
			@Pc(20) int local20 = local10.anInt2372 >> 12;
			@Pc(25) int local25 = local10.anInt2373 >> 12;
			@Pc(49) int local49 = this.aClass29_Sub2_3.anInt3838 + (this.aClass29_Sub2_3.anInt3846 * local15 + this.aClass29_Sub2_3.anInt3844 * local20 + this.aClass29_Sub2_3.anInt3840 * local25 >> 15);
			if (local49 >= this.lb && local49 <= this.anInt5417) {
				@Pc(90) int local90 = this.anInt5406 + this.anInt5422 * (this.aClass29_Sub2_3.anInt3841 + (this.aClass29_Sub2_3.anInt3839 * local15 + this.aClass29_Sub2_3.anInt3845 * local20 + this.aClass29_Sub2_3.anInt3842 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt5400 + this.anInt5418 * (this.aClass29_Sub2_3.anInt3843 + (this.aClass29_Sub2_3.anInt3836 * local15 + this.aClass29_Sub2_3.anInt3837 * local20 + this.aClass29_Sub2_3.anInt3835 * local25 >> 15)) / local49;
				if (local90 >= this.anInt5416 && local90 <= this.anInt5411 && local122 >= this.anInt5404 && local122 <= this.anInt5401) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method4317(local10, local90, local122, (local10.anInt2367 * this.anInt5422 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.lb;
	}

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "()Z")
	@Override
	public boolean method5835() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "()Z")
	@Override
	public boolean method5825() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(2) int local2 = this.anInt5423;
		this.anInt5423 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class49 method5855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5426 + arg0;
		@Pc(16) int local16 = this.anInt5426 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray388[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class49_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class49_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5868(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas5 == arg0) {
			this.method5878(null);
		}
		@Pc(15) Class5_Sub17 local15 = (Class5_Sub17) this.aClass252_31.method5659((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6003();
		}
	}

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "()V")
	@Override
	public void method5881() {
	}

	@OriginalMember(owner = "client!qf", name = "A", descriptor = "()Z")
	@Override
	public boolean method5886() {
		return true;
	}

	@OriginalMember(owner = "client!qf", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(2) int local2 = this.anInt5421;
		this.anInt5421 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "()Z")
	@Override
	public boolean method5833() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "([Lclient!e;Lclient!vm;Lclient!c;[Lclient!wg;I)V")
	@Override
	public void method5874(@OriginalArg(0) Class57[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class29 arg2, @OriginalArg(3) Class88_Sub8[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class57_Sub1[] local3 = new Class57_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class57_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class57_Sub1 local26 = Static254.method3266(this, local3);
		local26.method3280(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "()Z")
	@Override
	public boolean method5844() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "(I)Z")
	public boolean method4323(@OriginalArg(0) int arg0) {
		return super.anInterface8_134.method4125(arg0).aBoolean326;
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.lb = arg0;
		this.anInt5410 = arg1;
		this.anInt5417 = this.anInt5410 - 255;
		this.method4318();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5828() {
		@Pc(3) Class159 local3 = this.method4316(Thread.currentThread());
		@Pc(6) Class201 local6 = local3.aClass201_2;
		local6.aBoolean375 = false;
		local6.aBoolean375 = false;
		local6.anInt5453 = 0;
		local6.aBoolean373 = true;
		local6.method4348(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean375 = true;
	}

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "(I)Z")
	public boolean method4324(@OriginalArg(0) int arg0) {
		return this.aBoolean369 || super.anInterface8_134.method4125(arg0).aBoolean324;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!bn;Lclient!bn;FLclient!bn;)Lclient!bn;")
	@Override
	public Class24 method5823(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class24 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "()Z")
	@Override
	public boolean method5839() {
		return false;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V")
	@Override
	public void method5859(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)I")
	@Override
	public int method5879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!qf", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return 0;
	}

	@OriginalMember(owner = "client!qf", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5404) {
			local8 = this.anInt5404;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5401) {
			local21 = this.anInt5401;
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
				if (local91 < this.anInt5416) {
					local91 = this.anInt5416;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5411) {
					local102 = this.anInt5411;
				}
				local116 = local91 + local30 * this.anInt5426;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray388[local116++] = arg3;
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
				if (local91 < this.anInt5416) {
					local91 = this.anInt5416;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5411 - 1) {
					local102 = this.anInt5411 - 1;
				}
				local116 = local91 + local30 * this.anInt5426;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray388[local116++] = arg3;
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
				if (local102 < this.anInt5416) {
					local102 = this.anInt5416;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5411) {
					local116 = this.anInt5411;
				}
				local118 = local102 + local30 * this.anInt5426;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray388[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray388[local118++] = local277 + local340;
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
				if (local102 < this.anInt5416) {
					local102 = this.anInt5416;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5411 - 1) {
					local116 = this.anInt5411 - 1;
				}
				local118 = local102 + local30 * this.anInt5426;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray388[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray388[local118++] = local277 + local340;
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
				if (local91 < this.anInt5416) {
					local91 = this.anInt5416;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5411) {
					local102 = this.anInt5411;
				}
				local116 = local91 + local30 * this.anInt5426;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray388[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray388[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt5416) {
					local91 = this.anInt5416;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5411 - 1) {
					local102 = this.anInt5411 - 1;
				}
				local116 = local91 + local30 * this.anInt5426;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray388[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray388[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)I")
	@Override
	public int method5860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5822(@OriginalArg(0) Class5_Sub28 arg0) {
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5878(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas5 = null;
			this.aClass5_Sub17_1 = null;
			if (this.aClass49_18 == null) {
				this.anIntArray388 = null;
				this.anInt5426 = this.anInt5402 = 1;
				this.method4313();
			}
			return;
		}
		@Pc(10) Class5_Sub17 local10 = (Class5_Sub17) this.aClass252_31.method5659((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas5 = arg0;
		this.aClass5_Sub17_1 = local10;
		if (this.aClass49_18 != null) {
			return;
		}
		this.anIntArray388 = local10.anIntArray386;
		this.anInt5426 = local10.anInt5326;
		this.anInt5402 = local10.anInt5324;
		this.method4313();
		return;
	}
}
