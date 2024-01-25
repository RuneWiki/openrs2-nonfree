import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "Lclient!ll;")
	private Class1_Sub11 aClass1_Sub11_1;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
	public int anInt5093;

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!kt", name = "B", descriptor = "Lclient!f;")
	private Class5 aClass5_19;

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "I")
	public int anInt5097;

	@OriginalMember(owner = "client!kt", name = "G", descriptor = "I")
	public int anInt5098;

	@OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
	public int anInt5099;

	@OriginalMember(owner = "client!kt", name = "K", descriptor = "I")
	private int anInt5101;

	@OriginalMember(owner = "client!kt", name = "L", descriptor = "I")
	private int anInt5102;

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "[Lclient!lw;")
	private Class215[] aClass215Array1;

	@OriginalMember(owner = "client!kt", name = "P", descriptor = "I")
	public int anInt5105;

	@OriginalMember(owner = "client!kt", name = "S", descriptor = "I")
	public int anInt5108;

	@OriginalMember(owner = "client!kt", name = "T", descriptor = "I")
	public int anInt5109;

	@OriginalMember(owner = "client!kt", name = "U", descriptor = "[I")
	public int[] anIntArray286;

	@OriginalMember(owner = "client!kt", name = "W", descriptor = "I")
	public int anInt5110;

	@OriginalMember(owner = "client!kt", name = "Y", descriptor = "I")
	public int anInt5112;

	@OriginalMember(owner = "client!kt", name = "Z", descriptor = "I")
	public int anInt5113;

	@OriginalMember(owner = "client!kt", name = "bb", descriptor = "I")
	public int anInt5115;

	@OriginalMember(owner = "client!kt", name = "eb", descriptor = "I")
	private int anInt5117;

	@OriginalMember(owner = "client!kt", name = "hb", descriptor = "Lclient!f;")
	private Class5 aClass5_20;

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "Z")
	private boolean aBoolean388;

	@OriginalMember(owner = "client!kt", name = "v", descriptor = "Z")
	private boolean aBoolean389;

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "Lclient!faa;")
	private Class91 aClass91_20;

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
	public int anInt5094;

	@OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
	public int anInt5092;

	@OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
	public int anInt5095;

	@OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
	public int anInt5100;

	@OriginalMember(owner = "client!kt", name = "Q", descriptor = "I")
	public int anInt5106;

	@OriginalMember(owner = "client!kt", name = "R", descriptor = "I")
	public int anInt5107;

	@OriginalMember(owner = "client!kt", name = "X", descriptor = "I")
	public int anInt5111;

	@OriginalMember(owner = "client!kt", name = "N", descriptor = "I")
	private int anInt5104;

	@OriginalMember(owner = "client!kt", name = "ab", descriptor = "I")
	public int anInt5114;

	@OriginalMember(owner = "client!kt", name = "fb", descriptor = "I")
	public int anInt5118;

	@OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
	public int anInt5096;

	@OriginalMember(owner = "client!kt", name = "db", descriptor = "Z")
	private boolean aBoolean390;

	@OriginalMember(owner = "client!kt", name = "cb", descriptor = "I")
	public int anInt5116;

	@OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
	private int anInt5103;

	@OriginalMember(owner = "client!kt", name = "H", descriptor = "Lclient!lga;")
	private final Class207 aClass207_27;

	@OriginalMember(owner = "client!kt", name = "gb", descriptor = "I")
	private int anInt5119;

	@OriginalMember(owner = "client!kt", name = "F", descriptor = "Lclient!lga;")
	private final Class207 aClass207_26;

	@OriginalMember(owner = "client!kt", name = "V", descriptor = "Lclient!mba;")
	public Class34_Sub3 aClass34_Sub3_1;

	@OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
	private int anInt5091;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!fa;)V")
	private Class78_Sub2(@OriginalArg(0) Interface9 arg0) {
		super(arg0);
		this.aBoolean388 = false;
		this.aBoolean389 = false;
		this.aClass91_20 = new Class91(4);
		this.anInt5094 = 0;
		this.anInt5092 = 512;
		this.anInt5095 = 0;
		this.anInt5100 = 45823;
		this.anInt5106 = 0;
		this.anInt5107 = 50;
		this.anInt5111 = 75518;
		this.anInt5104 = 0;
		this.anInt5114 = 512;
		this.anInt5118 = 3500;
		this.anInt5096 = 0;
		this.aBoolean390 = false;
		this.anInt5116 = 78642;
		this.anInt5103 = 0;
		this.aClass207_27 = new Class207(16);
		this.anInt5119 = -1;
		this.aClass207_26 = new Class207(256);
		this.aClass34_Sub3_1 = new Class34_Sub3();
		this.method6793(1);
		this.method6849(0);
		Static171.method2748(false, true);
		this.aBoolean389 = true;
		this.anInt5091 = (int) Static480.method6650();
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public Class78_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1) {
		this(arg1);
		this.method6780(arg0);
		this.method6795(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIF)Lclient!tw;")
	@Override
	public Class1_Sub24 method6790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt5118;
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "()V")
	@Override
	protected void method6789() {
		if (this.aBoolean389) {
			Static81.method1350(true, false);
			this.aBoolean389 = false;
		}
		this.aClass1_Sub11_1 = null;
		this.aCanvas7 = null;
		this.aClass91_20 = null;
		this.aBoolean388 = true;
	}

	@OriginalMember(owner = "client!kt", name = "q", descriptor = "()Z")
	@Override
	public boolean method6831() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!wd;IIII)V")
	private void method4119(@OriginalArg(0) Class11_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt4078;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method4121(arg1, arg2, arg3, arg4, arg0.anInt4079, 1);
			return;
		}
		if (this.anInt5119 != local2) {
			@Pc(33) Class5 local33 = (Class5) this.aClass207_27.method4390((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method4127(local2);
				if (local39 == null) {
					return;
				}
				@Pc(49) int local49 = this.method4131(local2) ? 64 : 128;
				local33 = this.method6842(local39, local49, local49, local49);
				this.aClass207_27.method4391((long) local2, local33);
			}
			this.anInt5119 = local2;
			this.aClass5_20 = local33;
		}
		local8++;
		((Class5_Sub1) this.aClass5_20).method7809(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt4079, 1);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method6821(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas7 == null || this.aClass1_Sub11_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas7.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5105 && local21.y <= this.anInt5117 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub11_1.method7778(local21.y, local21.width, local14, local21.x, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!kt", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass215Array1.length; local1++) {
			this.aClass215Array1[local1].anInt5702 = this.aClass215Array1[local1].anInt5704;
			this.aClass215Array1[local1].anInt5694 = arg0;
			this.aClass215Array1[local1].anInt5704 = arg1;
			this.aClass215Array1[local1].anInt5706 = arg2;
			this.aClass215Array1[local1].aBoolean442 = true;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V")
	@Override
	public void method6824(@OriginalArg(0) boolean arg0) {
		this.aBoolean390 = arg0;
		this.aClass207_26.method4392();
	}

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "(I)Z")
	public boolean method4120(@OriginalArg(0) int arg0) {
		return super.anInterface9_13.method949(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!wn;Lclient!wn;FLclient!wn;)Lclient!wn;")
	@Override
	public Class209 method6811(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class209 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)V")
	@Override
	public void method6793(@OriginalArg(0) int arg0) {
		this.anInt5093 = arg0;
		this.aClass215Array1 = new Class215[this.anInt5093];
		for (@Pc(9) int local9 = 0; local9 < this.anInt5093; local9++) {
			this.aClass215Array1[local9] = new Class215(this);
		}
	}

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "(IIIIII)V")
	private void method4121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(12) int local12 = arg1 - arg3;
		if (local12 < this.anInt5096) {
			local12 = this.anInt5096;
		}
		@Pc(25) int local25 = arg1 + arg3 + 1;
		if (local25 > this.anInt5095) {
			local25 = this.anInt5095;
		}
		@Pc(34) int local34 = local12;
		@Pc(38) int local38 = arg3 * arg3;
		@Pc(40) int local40 = 0;
		@Pc(44) int local44 = arg1 - local12;
		@Pc(48) int local48 = local44 * local44;
		@Pc(52) int local52 = local48 - local44;
		if (arg1 > local25) {
			arg1 = local25;
		}
		@Pc(61) int local61 = arg4 >>> 24;
		@Pc(95) int local95;
		@Pc(106) int local106;
		@Pc(120) int local120;
		@Pc(122) int local122;
		if (arg5 == 0 || arg5 == 1 && local61 == 255) {
			while (local34 < arg1) {
				while (local52 <= local38 || local48 <= local38) {
					local48 += local40 + local40;
					local52 += local40++ + local40;
				}
				local95 = arg0 + 1 - local40;
				if (local95 < this.anInt5106) {
					local95 = this.anInt5106;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt5094) {
					local106 = this.anInt5094;
				}
				local120 = local95 + local34 * this.anInt5105;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray286[local120]) {
						this.anIntArray285[local120] = arg4;
					}
					local120++;
				}
				local34++;
				local48 -= local44-- + local44;
				local52 -= local44 + local44;
			}
			local40 = arg3;
			local44 = local34 - arg1;
			local52 = local44 * local44 + local38;
			local48 = local52 - arg3;
			local52 -= local44;
			while (local34 < local25) {
				while (local52 > local38 && local48 > local38) {
					local52 -= local40-- + local40;
					local48 -= local40 + local40;
				}
				local95 = arg0 - local40;
				if (local95 < this.anInt5106) {
					local95 = this.anInt5106;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt5094 - 1) {
					local106 = this.anInt5094 - 1;
				}
				local120 = local95 + local34 * this.anInt5105;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray286[local120]) {
						this.anIntArray285[local120] = arg4;
					}
					local120++;
				}
				local34++;
				local52 += local44 + local44;
				local48 += local44++ + local44;
			}
			return;
		}
		@Pc(350) int local350;
		@Pc(362) int local362;
		if (arg5 == 1) {
			@Pc(293) int local293 = ((arg4 & 0xFF00FF) * local61 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local61 >> 8 & 0xFF00) + (local61 << 24);
			local95 = 256 - local61;
			while (local34 < arg1) {
				while (local52 <= local38 || local48 <= local38) {
					local48 += local40 + local40;
					local52 += local40++ + local40;
				}
				local106 = arg0 + 1 - local40;
				if (local106 < this.anInt5106) {
					local106 = this.anInt5106;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt5094) {
					local120 = this.anInt5094;
				}
				local122 = local106 + local34 * this.anInt5105;
				for (local350 = local106; local350 < local120; local350++) {
					if (local8 < this.anIntArray286[local122]) {
						local362 = this.anIntArray285[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray285[local122] = local293 + local362;
					}
					local122++;
				}
				local34++;
				local48 -= local44-- + local44;
				local52 -= local44 + local44;
			}
			local40 = arg3;
			local44 = -local44;
			local52 = local44 * local44 + local38;
			local48 = local52 - arg3;
			local52 -= local44;
			while (local34 < local25) {
				while (local52 > local38 && local48 > local38) {
					local52 -= local40-- + local40;
					local48 -= local40 + local40;
				}
				local106 = arg0 - local40;
				if (local106 < this.anInt5106) {
					local106 = this.anInt5106;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt5094 - 1) {
					local120 = this.anInt5094 - 1;
				}
				local122 = local106 + local34 * this.anInt5105;
				for (local350 = local106; local350 <= local120; local350++) {
					if (local8 < this.anIntArray286[local122]) {
						local362 = this.anIntArray285[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray285[local122] = local293 + local362;
					}
					local122++;
				}
				local34++;
				local52 += local44 + local44;
				local48 += local44++ + local44;
			}
		} else if (arg5 == 2) {
			@Pc(627) int local627;
			while (local34 < arg1) {
				while (local52 <= local38 || local48 <= local38) {
					local48 += local40 + local40;
					local52 += local40++ + local40;
				}
				local95 = arg0 + 1 - local40;
				if (local95 < this.anInt5106) {
					local95 = this.anInt5106;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt5094) {
					local106 = this.anInt5094;
				}
				local120 = local95 + local34 * this.anInt5105;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray286[local120]) {
						local350 = this.anIntArray285[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(637) int local637 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray285[local120] = local362 - local637 | local637 - (local637 >>> 8);
					}
					local120++;
				}
				local34++;
				local48 -= local44-- + local44;
				local52 -= local44 + local44;
			}
			local40 = arg3;
			local44 = -local44;
			local52 = local44 * local44 + local38;
			local48 = local52 - arg3;
			local52 -= local44;
			while (local34 < local25) {
				while (local52 > local38 && local48 > local38) {
					local52 -= local40-- + local40;
					local48 -= local40 + local40;
				}
				local95 = arg0 - local40;
				if (local95 < this.anInt5106) {
					local95 = this.anInt5106;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt5094 - 1) {
					local106 = this.anInt5094 - 1;
				}
				local120 = local95 + local34 * this.anInt5105;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray286[local120]) {
						local350 = this.anIntArray285[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray285[local120] = local362 - local350 | local350 - (local350 >>> 8);
					}
					local120++;
				}
				local34++;
				local52 += local44 + local44;
				local48 += local44++ + local44;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kt", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5109 = arg0;
		this.anInt5112 = arg1;
		this.anInt5092 = arg2;
		this.anInt5114 = arg3;
		this.method4124();
	}

	@OriginalMember(owner = "client!kt", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass34_Sub3_1.aFloat165 + this.aClass34_Sub3_1.aFloat169 * (float) arg0 + this.aClass34_Sub3_1.aFloat161 * (float) arg1 + this.aClass34_Sub3_1.aFloat163 * (float) arg2;
		if (local24 < (float) this.anInt5107 || local24 > (float) this.anInt5118) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt5092 * (this.aClass34_Sub3_1.aFloat164 + this.aClass34_Sub3_1.aFloat159 * (float) arg0 + this.aClass34_Sub3_1.aFloat158 * (float) arg1 + this.aClass34_Sub3_1.aFloat168 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt5114 * (this.aClass34_Sub3_1.aFloat162 + this.aClass34_Sub3_1.aFloat167 * (float) arg0 + this.aClass34_Sub3_1.aFloat166 * (float) arg1 + this.aClass34_Sub3_1.aFloat160 * (float) arg2) / local24);
		arg3[0] = local81 - this.anInt5097;
		arg3[1] = local113 - this.anInt5108;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "()V")
	@Override
	public void method6813() {
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6847(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
			this.method6795(null);
		}
		@Pc(15) Class1_Sub11 local15 = (Class1_Sub11) this.aClass91_20.method2271((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7908();
		}
	}

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "()Z")
	@Override
	public boolean method6801() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method6812(@OriginalArg(0) Class34 arg0) {
		this.aClass34_Sub3_1 = (Class34_Sub3) arg0;
	}

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "(I)V")
	@Override
	public void method6849(@OriginalArg(0) int arg0) {
		this.aClass215Array1[arg0].method4638(Thread.currentThread());
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!dk;I)V")
	@Override
	public void method6850(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class215 local3 = this.method4130(Thread.currentThread());
		@Pc(7) Class11_Sub5 local7 = arg0.aClass102_1.aClass11_Sub5_1;
		for (@Pc(10) Class11_Sub5 local10 = local7.aClass11_Sub5_9; local10 != local7; local10 = local10.aClass11_Sub5_9) {
			@Pc(14) Class11_Sub5_Sub1 local14 = (Class11_Sub5_Sub1) local10;
			@Pc(19) int local19 = local14.anInt4083 >> 12;
			@Pc(24) int local24 = local14.anInt4081 >> 12;
			@Pc(29) int local29 = local14.anInt4077 >> 12;
			@Pc(54) float local54 = this.aClass34_Sub3_1.aFloat165 + this.aClass34_Sub3_1.aFloat169 * (float) local19 + this.aClass34_Sub3_1.aFloat161 * (float) local24 + this.aClass34_Sub3_1.aFloat163 * (float) local29;
			if (!(local54 < (float) this.anInt5107) && !(local54 > (float) local3.anInt5703)) {
				@Pc(103) int local103 = this.anInt5109 + (int) ((float) this.anInt5092 * (this.aClass34_Sub3_1.aFloat164 + this.aClass34_Sub3_1.aFloat159 * (float) local19 + this.aClass34_Sub3_1.aFloat158 * (float) local24 + this.aClass34_Sub3_1.aFloat168 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt5112 + (int) ((float) this.anInt5114 * (this.aClass34_Sub3_1.aFloat162 + this.aClass34_Sub3_1.aFloat167 * (float) local19 + this.aClass34_Sub3_1.aFloat166 * (float) local24 + this.aClass34_Sub3_1.aFloat160 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt5106 && local103 <= this.anInt5094 && local139 >= this.anInt5096 && local139 <= this.anInt5095) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method4119(local14, local103, local139, (int) local54, (local14.anInt4075 * this.anInt5092 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface9_13.method947(arg6).aBoolean32) {
			this.method4121(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt5119 != arg6) {
			@Pc(26) Class5 local26 = (Class5) this.aClass207_27.method4390((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method4127(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method4131(arg6) ? 64 : 128;
				local26 = this.method6842(local32, local43, local43, local43);
				this.aClass207_27.method4391((long) arg6, local26);
			}
			this.anInt5119 = arg6;
			this.aClass5_20 = local26;
		}
		((Class5_Sub1) this.aClass5_20).method7809(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "()I")
	@Override
	public int method6777() {
		return 0;
	}

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "()Z")
	@Override
	public boolean method6810() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method6798(@OriginalArg(0) Class1_Sub16 arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "()V")
	@Override
	public void method6834() {
	}

	@OriginalMember(owner = "client!kt", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt5106 = 0;
		this.anInt5096 = 0;
		this.anInt5094 = this.anInt5105;
		this.anInt5095 = this.anInt5117;
		this.method4124();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!nba;IIII)Lclient!da;")
	@Override
	public Class52 method6817(@OriginalArg(0) Class231 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class52_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method6807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class181 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class181_Sub3 local2 = (Class181_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray547;
		@Pc(8) int[] local8 = local2.anIntArray546;
		@Pc(17) int local17 = this.anInt5096 > arg7 ? this.anInt5096 : arg7;
		@Pc(32) int local32 = this.anInt5095 < arg7 + local5.length ? this.anInt5095 : arg7 + local5.length;
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
					if (local129 >= this.anInt5106 && local129 < this.anInt5094 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray285[local129 + arg1 * this.anInt5105] = arg4;
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
					if (local133 >= this.anInt5106 && local133 < this.anInt5094 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5105;
						local248 = this.anIntArray285[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray285[local133 + arg1 * this.anInt5105] = local201 + local584;
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
		if (arg0 < this.anInt5106) {
			arg1 += local83 * (this.anInt5106 - arg0);
			arg0 = this.anInt5106;
		}
		if (arg2 >= this.anInt5094) {
			arg2 = this.anInt5094 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray285[arg0 + local129 * this.anInt5105] = arg4;
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
					local243 = arg0 + local133 * this.anInt5105;
					local248 = this.anIntArray285[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray285[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "()Z")
	@Override
	public boolean method6808() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!dk;)V")
	@Override
	public void method6796(@OriginalArg(0) Class64 arg0) {
		@Pc(3) Class215 local3 = this.method4130(Thread.currentThread());
		@Pc(7) Class11_Sub5 local7 = arg0.aClass102_1.aClass11_Sub5_1;
		for (@Pc(10) Class11_Sub5 local10 = local7.aClass11_Sub5_9; local10 != local7; local10 = local10.aClass11_Sub5_9) {
			@Pc(14) Class11_Sub5_Sub1 local14 = (Class11_Sub5_Sub1) local10;
			@Pc(19) int local19 = local14.anInt4083 >> 12;
			@Pc(24) int local24 = local14.anInt4081 >> 12;
			@Pc(29) int local29 = local14.anInt4077 >> 12;
			@Pc(54) float local54 = this.aClass34_Sub3_1.aFloat165 + this.aClass34_Sub3_1.aFloat169 * (float) local19 + this.aClass34_Sub3_1.aFloat161 * (float) local24 + this.aClass34_Sub3_1.aFloat163 * (float) local29;
			if (!(local54 < (float) this.anInt5107) && !(local54 > (float) local3.anInt5703)) {
				@Pc(102) int local102 = this.anInt5109 + (int) ((float) this.anInt5092 * (this.aClass34_Sub3_1.aFloat164 + this.aClass34_Sub3_1.aFloat159 * (float) local19 + this.aClass34_Sub3_1.aFloat158 * (float) local24 + this.aClass34_Sub3_1.aFloat168 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt5112 + (int) ((float) this.anInt5114 * (this.aClass34_Sub3_1.aFloat162 + this.aClass34_Sub3_1.aFloat167 * (float) local19 + this.aClass34_Sub3_1.aFloat166 * (float) local24 + this.aClass34_Sub3_1.aFloat160 * (float) local29) / local54);
				if (local102 >= this.anInt5106 && local102 <= this.anInt5094 && local137 >= this.anInt5096 && local137 <= this.anInt5095) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method4119(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt4075 * this.anInt5092 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class181 method6797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class181_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6848() {
		@Pc(3) Class215 local3 = this.method4130(Thread.currentThread());
		return local3.aClass34_Sub3_2;
	}

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "(I)[I")
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(2) Class207 local2 = this.aClass207_26;
		@Pc(12) Class1_Sub2 local12;
		synchronized (this.aClass207_26) {
			local12 = (Class1_Sub2) this.aClass207_26.method4390((long) arg0);
			if (local12 == null) {
				if (!super.anInterface9_13.method949(arg0)) {
					return null;
				}
				@Pc(32) Class17 local32 = super.anInterface9_13.method947(arg0);
				@Pc(42) int local42 = local32.aBoolean33 || this.aBoolean390 ? 64 : 128;
				local12 = new Class1_Sub2(arg0, local42, super.anInterface9_13.method948(true, arg0, local42, 0.7F, local42), local32.aBoolean31);
				this.aClass207_26.method4391((long) arg0, local12);
			}
		}
		local12.aBoolean3 = true;
		return local12.method77();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6780(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub11 local8 = (Class1_Sub11) this.aClass91_20.method2271((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static109.method1515(arg0);
			this.aClass91_20.method2269((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class5 method6823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5105 + arg0;
		@Pc(16) int local16 = this.anInt5105 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray285[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class5_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class5_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!kt", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass34_Sub3_1.aFloat169 * (float) arg0 + this.aClass34_Sub3_1.aFloat161 * (float) arg1 + this.aClass34_Sub3_1.aFloat163 * (float) arg2 + this.aClass34_Sub3_1.aFloat165;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass34_Sub3_1.aFloat169 * (float) arg3 + this.aClass34_Sub3_1.aFloat161 * (float) arg4 + this.aClass34_Sub3_1.aFloat163 * (float) arg5 + this.aClass34_Sub3_1.aFloat165;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt5107 && local55 < (float) this.anInt5107 || !(!(local24 > (float) this.anInt5118) || !(local55 > (float) this.anInt5118))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt5092 * (this.aClass34_Sub3_1.aFloat159 * (float) arg0 + this.aClass34_Sub3_1.aFloat158 * (float) arg1 + this.aClass34_Sub3_1.aFloat168 * (float) arg2 + this.aClass34_Sub3_1.aFloat164) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt5092 * (this.aClass34_Sub3_1.aFloat159 * (float) arg3 + this.aClass34_Sub3_1.aFloat158 * (float) arg4 + this.aClass34_Sub3_1.aFloat168 * (float) arg5 + this.aClass34_Sub3_1.aFloat164) / local55);
		if (local119 < this.anInt5097 && local151 < this.anInt5097 || local119 > this.anInt5098 && local151 > this.anInt5098) {
			return false;
		} else {
			@Pc(201) int local201 = (int) ((float) this.anInt5114 * (this.aClass34_Sub3_1.aFloat167 * (float) arg0 + this.aClass34_Sub3_1.aFloat166 * (float) arg1 + this.aClass34_Sub3_1.aFloat160 * (float) arg2 + this.aClass34_Sub3_1.aFloat162) / local24);
			@Pc(233) int local233 = (int) ((float) this.anInt5114 * (this.aClass34_Sub3_1.aFloat167 * (float) arg3 + this.aClass34_Sub3_1.aFloat166 * (float) arg4 + this.aClass34_Sub3_1.aFloat160 * (float) arg5 + this.aClass34_Sub3_1.aFloat162) / local55);
			return (local201 >= this.anInt5108 || local233 >= this.anInt5108) && (local201 <= this.anInt5115 || local233 <= this.anInt5115);
		}
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "()Z")
	@Override
	public boolean method6787() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		this.anInt5111 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
	@Override
	public void method6785(@OriginalArg(0) int arg0) {
		this.aClass215Array1[arg0].method4638(null);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6853(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub11 local8 = (Class1_Sub11) this.aClass91_20.method2271((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method7908();
		local8 = Static109.method1515(arg0);
		this.aClass91_20.method2269((long) arg0.hashCode(), local8);
		if (this.aCanvas7 != arg0 || this.aClass5_19 != null) {
			return;
		}
		this.aClass1_Sub11_1 = local8;
		this.anIntArray285 = local8.anIntArray602;
		this.anInt5105 = local8.anInt9558;
		this.anInt5117 = local8.anInt9561;
		if (this.anInt5105 != this.anInt5102 || this.anInt5117 != this.anInt5101) {
			this.anInt5102 = this.anInt5105;
			this.anInt5101 = this.anInt5117;
			this.anIntArray286 = new int[this.anInt5102 * this.anInt5101];
		}
		this.method4128();
	}

	@OriginalMember(owner = "client!kt", name = "D", descriptor = "()V")
	private void method4124() {
		this.anInt5097 = this.anInt5106 - this.anInt5109;
		this.anInt5098 = this.anInt5094 - this.anInt5109;
		this.anInt5108 = this.anInt5096 - this.anInt5112;
		this.anInt5115 = this.anInt5095 - this.anInt5112;
		for (@Pc(29) int local29 = 0; local29 < this.anInt5093; local29++) {
			@Pc(36) Class220 local36 = this.aClass215Array1[local29].aClass220_1;
			local36.anInt5825 = this.anInt5109 - this.anInt5106;
			local36.anInt5820 = this.anInt5112 - this.anInt5096;
			local36.anInt5821 = this.anInt5094 - this.anInt5106;
			local36.anInt5822 = this.anInt5095 - this.anInt5096;
		}
		@Pc(78) int local78 = this.anInt5096 * this.anInt5105 + this.anInt5106;
		for (@Pc(81) int local81 = this.anInt5096; local81 < this.anInt5095; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt5093; local84++) {
				this.aClass215Array1[local84].aClass220_1.anIntArray349[local81 - this.anInt5096] = local78;
			}
			local78 += this.anInt5105;
		}
	}

	@OriginalMember(owner = "client!kt", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5105) {
			arg2 = this.anInt5105;
		}
		if (arg3 > this.anInt5117) {
			arg3 = this.anInt5117;
		}
		this.anInt5106 = arg0;
		this.anInt5094 = arg2;
		this.anInt5096 = arg1;
		this.anInt5095 = arg3;
		this.method4124();
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "()Z")
	@Override
	public boolean method6794() {
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "()Z")
	@Override
	public boolean method6792() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6795(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas7 = null;
			this.aClass1_Sub11_1 = null;
			if (this.aClass5_19 == null) {
				this.anIntArray285 = null;
				this.anInt5105 = this.anInt5117 = 1;
				this.anInt5102 = this.anInt5101 = 1;
				this.method4128();
			}
			return;
		}
		@Pc(10) Class1_Sub11 local10 = (Class1_Sub11) this.aClass91_20.method2271((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas7 = arg0;
		this.aClass1_Sub11_1 = local10;
		if (this.aClass5_19 != null) {
			return;
		}
		this.anIntArray285 = local10.anIntArray602;
		this.anInt5105 = local10.anInt9558;
		this.anInt5117 = local10.anInt9561;
		if (this.anInt5105 != this.anInt5102 || this.anInt5117 != this.anInt5101) {
			this.anInt5102 = this.anInt5105;
			this.anInt5101 = this.anInt5117;
			this.anIntArray286 = new int[this.anInt5102 * this.anInt5101];
		}
		this.method4128();
		return;
	}

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5106 || arg0 >= this.anInt5094) {
			return;
		}
		if (arg1 < this.anInt5096) {
			arg2 -= this.anInt5096 - arg1;
			arg1 = this.anInt5096;
		}
		if (arg1 + arg2 > this.anInt5095) {
			arg2 = this.anInt5095 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5105;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray285[local40 + local54 * this.anInt5105] = arg3;
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
				local111 = local40 + local103 * this.anInt5105;
				local116 = this.anIntArray285[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray285[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5105;
				local111 = this.anIntArray285[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray285[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6826(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.XA(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.XA(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt5106) {
					arg1 += local104 * (this.anInt5106 - arg0);
					arg0 = this.anInt5106;
				}
				if (arg2 >= this.anInt5094) {
					arg2 = this.anInt5094 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5096 && local150 < this.anInt5095) {
							this.anIntArray285[arg0 + local150 * this.anInt5105] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5096 && local213 < this.anInt5095) {
							local228 = arg0 + local213 * this.anInt5105;
							local233 = this.anIntArray285[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray285[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5096 && local150 < this.anInt5095) {
							local213 = arg0 + local150 * this.anInt5105;
							local228 = this.anIntArray285[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray285[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt5096) {
					arg0 += local104 * (this.anInt5096 - arg1);
					arg1 = this.anInt5096;
				}
				if (arg3 >= this.anInt5095) {
					arg3 = this.anInt5095 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5106 && local150 < this.anInt5094) {
							this.anIntArray285[local150 + arg1 * this.anInt5105] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5106 && local213 < this.anInt5094) {
							local228 = local213 + arg1 * this.anInt5105;
							local233 = this.anIntArray285[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray285[local213 + arg1 * this.anInt5105] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5106 && local150 < this.anInt5094) {
							local213 = local150 + arg1 * this.anInt5105;
							local228 = this.anIntArray285[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray285[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.m(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.m(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class215 local3 = this.method4130(Thread.currentThread());
		@Pc(6) Class220 local6 = local3.aClass220_1;
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
		local10 += local44 >> 16;
		local14 += local50 >> 16;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(78) int local78 = arg5 * local50 >> 17;
		@Pc(86) int local86 = arg5 * local50 + 1 >> 17;
		@Pc(92) int local92 = arg5 * local44 >> 17;
		@Pc(100) int local100 = arg5 * local44 + 1 >> 17;
		@Pc(105) int local105 = arg0 - local6.method4738();
		@Pc(110) int local110 = arg1 - local6.method4748();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt5824 = 0;
		this.ZA(false);
		local6.aBoolean456 = local114 < 0 || local114 > local6.anInt5821 || local118 < 0 || local118 > local6.anInt5821 || local124 < 0 || local124 > local6.anInt5821;
		local6.method4733(local134, local138, local144, local114, local118, local124, 100, 100, 100, arg4);
		local6.aBoolean456 = local114 < 0 || local114 > local6.anInt5821 || local124 < 0 || local124 > local6.anInt5821 || local130 < 0 || local130 > local6.anInt5821;
		local6.method4733(local134, local144, local150, local114, local124, local130, 100, 100, 100, arg4);
		this.ZA(true);
	}

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "()Z")
	@Override
	public boolean method6845() {
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class215 local3 = this.method4130(Thread.currentThread());
		local3.anInt5694 = arg0;
		local3.anInt5704 = arg1;
		local3.anInt5706 = arg2;
	}

	@OriginalMember(owner = "client!kt", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.J(0, 0, this.anInt5105, this.anInt5117, arg0, 0);
	}

	@OriginalMember(owner = "client!kt", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class181_Sub3 local2 = (Class181_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray547;
		@Pc(8) int[] local8 = local2.anIntArray546;
		@Pc(20) int local20;
		if (this.anInt5095 < arg3 + local5.length) {
			local20 = this.anInt5095 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5096 > arg3) {
			local33 = this.anInt5096 - arg3;
			arg3 = this.anInt5096;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt5105;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5106 > local58) {
				local62 -= this.anInt5106 - local58;
				local58 = this.anInt5106;
			}
			if (this.anInt5094 < local58 + local62) {
				local62 = this.anInt5094 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray285[local58++] = arg0;
			}
			local49 += this.anInt5105;
		}
	}

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "(I)Z")
	public boolean method4125(@OriginalArg(0) int arg0) {
		return super.anInterface9_13.method947(arg0).aBoolean25;
	}

	@OriginalMember(owner = "client!kt", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class215 local3 = this.method4130(Thread.currentThread());
		this.anInt5107 = arg0;
		this.anInt5118 = arg1;
		local3.anInt5703 = this.anInt5118 - 255;
	}

	@OriginalMember(owner = "client!kt", name = "l", descriptor = "(I)I")
	public int method4126(@OriginalArg(0) int arg0) {
		return super.anInterface9_13.method947(arg0).aShort19 & 0xFFFF;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class5 method6832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class5_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!kt", name = "m", descriptor = "(I)[I")
	private int[] method4127(@OriginalArg(0) int arg0) {
		@Pc(2) Class207 local2 = this.aClass207_26;
		@Pc(12) Class1_Sub2 local12;
		synchronized (this.aClass207_26) {
			local12 = (Class1_Sub2) this.aClass207_26.method4390((long) arg0);
			if (local12 == null) {
				if (!super.anInterface9_13.method949(arg0)) {
					return null;
				}
				@Pc(32) Class17 local32 = super.anInterface9_13.method947(arg0);
				@Pc(42) int local42 = local32.aBoolean33 || this.aBoolean390 ? 64 : 128;
				local12 = new Class1_Sub2(arg0, local42, super.anInterface9_13.method952(0.7F, local42, local42, arg0), local32.aBoolean31);
				this.aClass207_26.method4391((long) arg0, local12);
			}
		}
		local12.aBoolean3 = true;
		return local12.method77();
	}

	@OriginalMember(owner = "client!kt", name = "n", descriptor = "()V")
	@Override
	public void method6816() {
		this.aClass207_26.method4392();
		this.aClass207_27.method4392();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)I")
	@Override
	public int method6782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V")
	@Override
	public void method6799(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5091;
		for (@Pc(9) Object local9 = this.aClass207_26.method4396(); local9 != null; local9 = this.aClass207_26.method4384()) {
			@Pc(13) Class1_Sub2 local13 = (Class1_Sub2) local9;
			if (local13.aBoolean3) {
				local13.anInt78 += local4;
				@Pc(27) int local27 = local13.anInt78 / 20;
				if (local27 > 0) {
					@Pc(36) Class17 local36 = super.anInterface9_13.method947(local13.anInt76);
					local13.method75(local36.aByte18 * local4 * 50 / 1000, local36.aByte19 * local4 * 50 / 1000);
					local13.anInt78 -= local27 * 20;
				}
				local13.aBoolean3 = false;
			}
		}
		this.anInt5091 = arg0;
		this.aClass207_27.method4397(5);
		this.aClass207_26.method4397(5);
	}

	@OriginalMember(owner = "client!kt", name = "E", descriptor = "()V")
	private void method4128() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5093; local1++) {
			this.aClass215Array1[local1].method4644();
		}
		this.JA();
	}

	@OriginalMember(owner = "client!kt", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5106) {
			arg2 -= this.anInt5106 - arg0;
			arg0 = this.anInt5106;
		}
		if (arg1 < this.anInt5096) {
			arg3 -= this.anInt5096 - arg1;
			arg1 = this.anInt5096;
		}
		if (arg0 + arg2 > this.anInt5094) {
			arg2 = this.anInt5094 - arg0;
		}
		if (arg1 + arg3 > this.anInt5095) {
			arg3 = this.anInt5095 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5094 || arg1 > this.anInt5095) {
			return;
		}
		@Pc(67) int local67 = this.anInt5105 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5105;
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
						local217 = this.anIntArray285[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray285[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray285[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray285[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray285[arg2] = arg4;
					arg2++;
					this.anIntArray285[arg2] = arg4;
					arg2++;
					this.anIntArray285[arg2] = arg4;
					arg2++;
					this.anIntArray285[arg2] = arg4;
					arg2++;
					this.anIntArray285[arg2] = arg4;
					arg2++;
					this.anIntArray285[arg2] = arg4;
					arg2++;
					this.anIntArray285[arg2] = arg4;
					arg2++;
					this.anIntArray285[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray285[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!kt", name = "o", descriptor = "()V")
	@Override
	public void method6820() throws Exception_Sub1 {
		if (this.aCanvas7 == null || this.aClass1_Sub11_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas7.getGraphics();
			this.aClass1_Sub11_1.method7779(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "()Z")
	@Override
	public boolean method6828() {
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6843() {
		return this.aClass34_Sub3_1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!qga;Z)Lclient!f;")
	@Override
	public Class5 method6838(@OriginalArg(0) Class282 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray445;
		@Pc(5) byte[] local5 = arg0.aByteArray74;
		@Pc(8) int local8 = arg0.anInt7490;
		@Pc(11) int local11 = arg0.anInt7493;
		@Pc(76) Class5_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray73 == null) {
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
			local76 = new Class5_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray73;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class5_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class5_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.Q(arg0.anInt7491, arg0.anInt7492, arg0.anInt7488, arg0.anInt7489);
		return local76;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)I")
	@Override
	public int method6819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(Z)V")
	@Override
	public void method6852(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "C", descriptor = "()Z")
	@Override
	public boolean method6854() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "()Z")
	@Override
	public boolean method6840() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "()V")
	@Override
	public void method6846() {
		if (this.aCanvas7 == null) {
			this.anInt5105 = 1;
			this.anInt5117 = 1;
			this.anIntArray285 = null;
		} else {
			this.anIntArray285 = this.aClass1_Sub11_1.anIntArray602;
			this.anInt5105 = this.aClass1_Sub11_1.anInt9558;
			this.anInt5117 = this.aClass1_Sub11_1.anInt9561;
		}
		this.aClass5_19 = null;
		this.method4128();
	}

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "()Lclient!ho;")
	@Override
	public Class141 method6841() {
		return new Class141(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!kt", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5106;
		arg0[1] = this.anInt5096;
		arg0[2] = this.anInt5094;
		arg0[3] = this.anInt5095;
	}

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5096) {
			local8 = this.anInt5096;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5095) {
			local21 = this.anInt5095;
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
				if (local91 < this.anInt5106) {
					local91 = this.anInt5106;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5094) {
					local102 = this.anInt5094;
				}
				local116 = local91 + local30 * this.anInt5105;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray285[local116++] = arg3;
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
				if (local91 < this.anInt5106) {
					local91 = this.anInt5106;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5094 - 1) {
					local102 = this.anInt5094 - 1;
				}
				local116 = local91 + local30 * this.anInt5105;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray285[local116++] = arg3;
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
			if (local102 < this.anInt5106) {
				local102 = this.anInt5106;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5094) {
				local116 = this.anInt5094;
			}
			local118 = local102 + local30 * this.anInt5105;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray285[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray285[local118++] = local277 + local360;
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
			if (local102 < this.anInt5106) {
				local102 = this.anInt5106;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt5094 - 1) {
				local116 = this.anInt5094 - 1;
			}
			local118 = local102 + local30 * this.anInt5105;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray285[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray285[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[Lclient!tw;)V")
	@Override
	public void method6825(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub24[] arg1) {
	}

	@OriginalMember(owner = "client!kt", name = "k", descriptor = "()V")
	@Override
	public void method6809() {
	}

	@OriginalMember(owner = "client!kt", name = "i", descriptor = "()Z")
	@Override
	public boolean method6804() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method6836() {
		@Pc(3) Class215 local3 = this.method4130(Thread.currentThread());
		@Pc(6) Class220 local6 = local3.aClass220_1;
		local6.aBoolean461 = false;
		@Pc(14) int local14 = 5 - this.anInt5097;
		@Pc(19) int local19 = 75 - this.anInt5097;
		@Pc(24) int local24 = 15 - this.anInt5097;
		@Pc(29) int local29 = 10 - this.anInt5108;
		@Pc(34) int local34 = 50 - this.anInt5108;
		@Pc(39) int local39 = 90 - this.anInt5108;
		local6.aBoolean456 = local14 < 0 || local14 > local6.anInt5821 || local19 < 0 || local19 > local6.anInt5821 || local24 < 0 || local24 > local6.anInt5821;
		local6.aBoolean455 = true;
		local6.anInt5824 = 0;
		local6.aBoolean460 = false;
		local6.method4747(local29, local34, local39, local14, local19, local24, 0, 0, 0, -65536, -65536, -65536);
		local6.aBoolean461 = true;
		local6.aBoolean455 = false;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return 0;
	}

	@OriginalMember(owner = "client!kt", name = "F", descriptor = "()Z")
	public boolean method4129() {
		return this.aBoolean388;
	}

	@OriginalMember(owner = "client!kt", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass34_Sub3_1.aFloat165 + this.aClass34_Sub3_1.aFloat169 * (float) arg0 + this.aClass34_Sub3_1.aFloat161 * (float) arg1 + this.aClass34_Sub3_1.aFloat163 * (float) arg2;
		if (local24 < (float) this.anInt5107 || local24 > (float) this.anInt5118) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt5092 * (this.aClass34_Sub3_1.aFloat164 + this.aClass34_Sub3_1.aFloat159 * (float) arg0 + this.aClass34_Sub3_1.aFloat158 * (float) arg1 + this.aClass34_Sub3_1.aFloat168 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt5114 * (this.aClass34_Sub3_1.aFloat162 + this.aClass34_Sub3_1.aFloat167 * (float) arg0 + this.aClass34_Sub3_1.aFloat166 * (float) arg1 + this.aClass34_Sub3_1.aFloat160 * (float) arg2) / local24);
		if (local81 >= this.anInt5097 && local81 <= this.anInt5098 && local113 >= this.anInt5108 && local113 <= this.anInt5115) {
			arg3[0] = local81 - this.anInt5097;
			arg3[1] = local113 - this.anInt5108;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!kt", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5106 < arg0) {
			this.anInt5106 = arg0;
		}
		if (this.anInt5096 < arg1) {
			this.anInt5096 = arg1;
		}
		if (this.anInt5094 > arg2) {
			this.anInt5094 = arg2;
		}
		if (this.anInt5095 > arg3) {
			this.anInt5095 = arg3;
		}
		this.method4124();
	}

	@OriginalMember(owner = "client!kt", name = "B", descriptor = "()Z")
	@Override
	public boolean method6851() {
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class5 method6842(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class5_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class5_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class5_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class5_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!lw;")
	public Class215 method4130(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5093; local1++) {
			if (this.aClass215Array1[local1].aRunnable1 == arg0) {
				return this.aClass215Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt5109, this.anInt5112, this.anInt5092, this.anInt5114 };
	}

	@OriginalMember(owner = "client!kt", name = "r", descriptor = "()Lclient!q;")
	@Override
	public Class34 method6833() {
		return new Class34_Sub3();
	}

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "()Z")
	@Override
	public boolean method6802() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt5106 == 0 && this.anInt5094 == this.anInt5105 && this.anInt5096 == 0 && this.anInt5095 == this.anInt5117) {
			local19 = this.anIntArray286.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.anIntArray286[local27++] = Integer.MAX_VALUE;
				this.anIntArray286[local27++] = Integer.MAX_VALUE;
				this.anIntArray286[local27++] = Integer.MAX_VALUE;
				this.anIntArray286[local27++] = Integer.MAX_VALUE;
				this.anIntArray286[local27++] = Integer.MAX_VALUE;
				this.anIntArray286[local27++] = Integer.MAX_VALUE;
				this.anIntArray286[local27++] = Integer.MAX_VALUE;
				this.anIntArray286[local27++] = Integer.MAX_VALUE;
			}
			while (local27 < local19) {
				this.anIntArray286[local27++] = Integer.MAX_VALUE;
			}
			return;
		}
		local19 = this.anInt5094 - this.anInt5106;
		local25 = this.anInt5095 - this.anInt5096;
		local27 = this.anInt5105 - local19;
		@Pc(116) int local116 = this.anInt5106 + this.anInt5096 * this.anInt5105;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.anIntArray286[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray286[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray286[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray286[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray286[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray286[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray286[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray286[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.anIntArray286[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!kt", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class215 local3 = this.method4130(Thread.currentThread());
		local3.aBoolean440 = arg0;
	}

	@OriginalMember(owner = "client!kt", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass215Array1.length; local1++) {
			@Pc(7) Class215 local7 = this.aClass215Array1[local1];
			local7.anInt5704 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt5704 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt5704 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt5704 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt5704 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean441 = false;
			} else {
				local7.aBoolean441 = true;
			}
		}
	}

	@OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)Lclient!e;")
	@Override
	public Class1_Sub16 method6829(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass215Array1.length; local1++) {
			this.aClass215Array1[local1].anInt5704 = this.aClass215Array1[local1].anInt5702;
			this.aClass215Array1[local1].aBoolean442 = false;
		}
	}

	@OriginalMember(owner = "client!kt", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5105;
		@Pc(35) int local35 = this.anInt5105 - arg2;
		if (arg1 + arg3 > this.anInt5095) {
			arg3 -= arg1 + arg3 - this.anInt5095;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5096) {
			local59 = this.anInt5096 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5105;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5094) {
			local59 = arg0 + arg2 - this.anInt5094;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5106) {
			local59 = this.anInt5106 - arg0;
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
						this.anIntArray285[local30++] = arg4;
					} else {
						this.anIntArray285[local30++] = arg5;
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
					local245 = this.anIntArray285[local30];
					this.anIntArray285[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray285[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray285[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "(IIIIII)Lclient!wn;")
	@Override
	public Class209 method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!kt", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5096 || arg1 >= this.anInt5095) {
			return;
		}
		if (arg0 < this.anInt5106) {
			arg2 -= this.anInt5106 - arg0;
			arg0 = this.anInt5106;
		}
		if (arg0 + arg2 > this.anInt5094) {
			arg2 = this.anInt5094 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5105;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray285[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray285[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray285[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray285[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray285[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!vn;[Lclient!qga;Z)Lclient!la;")
	@Override
	public Class96 method6837(@OriginalArg(0) Class352 arg0, @OriginalArg(1) Class282[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7490;
			local7[local11] = arg1[local11].anInt7493;
			if (arg1[local11].aByteArray73 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class96_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class96_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!kt", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt5107;
	}

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "(I)V")
	@Override
	public void method6839(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5100 = (int) (arg1 * 65535.0F);
		this.anInt5116 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5099 = (int) (arg3 * 65535.0F / local26);
		this.anInt5110 = (int) (arg4 * 65535.0F / local26);
		this.anInt5113 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "([I)V")
	@Override
	public void method6822(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5105;
		arg0[1] = this.anInt5117;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method6827(@OriginalArg(0) Class5 arg0) {
		if (arg0 instanceof Class5_Sub1_Sub3) {
			@Pc(5) Class5_Sub1_Sub3 local5 = (Class5_Sub1_Sub3) arg0;
			this.anInt5105 = local5.anInt9588;
			this.anInt5117 = local5.anInt9608;
			this.anIntArray285 = local5.anIntArray605;
			this.aClass5_19 = arg0;
		} else if (arg0 instanceof Class5_Sub1_Sub1) {
			@Pc(27) Class5_Sub1_Sub1 local27 = (Class5_Sub1_Sub1) arg0;
			this.anInt5105 = local27.anInt9588;
			this.anInt5117 = local27.anInt9608;
			this.anIntArray285 = local27.anIntArray7;
			this.aClass5_19 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method4128();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class129 method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class129_Sub3(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!kt", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(2) int local2 = this.anInt5104;
		this.anInt5104 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt5105 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray285[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!kt", name = "n", descriptor = "(I)Z")
	public boolean method4131(@OriginalArg(0) int arg0) {
		return this.aBoolean390 || super.anInterface9_13.method947(arg0).aBoolean33;
	}

	@OriginalMember(owner = "client!kt", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(2) int local2 = this.anInt5103;
		this.anInt5103 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!wn;)V")
	@Override
	public void method6781(@OriginalArg(0) Class209 arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "x", descriptor = "()V")
	@Override
	public void method6844() {
	}
}
