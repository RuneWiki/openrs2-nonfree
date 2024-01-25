import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class164_Sub2 extends Class164 {

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "Lclient!k;")
	public Class127_Sub1 aClass127_Sub1_3;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "F")
	private float aFloat79;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	public int anInt6167;

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	public int anInt6168;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "[Lclient!te;")
	private Class221[] aClass221Array1;

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
	public int anInt6176;

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
	public int anInt6177;

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
	private int anInt6178;

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
	public int anInt6181;

	@OriginalMember(owner = "client!wb", name = "Q", descriptor = "Z")
	public boolean aBoolean571;

	@OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
	public int anInt6185;

	@OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
	public int anInt6187;

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "Lclient!tl;")
	private Class227 aClass227_50;

	@OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
	public int anInt6188;

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
	public int anInt6190;

	@OriginalMember(owner = "client!wb", name = "db", descriptor = "F")
	private float aFloat80;

	@OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
	public int anInt6193;

	@OriginalMember(owner = "client!wb", name = "jb", descriptor = "Lclient!ok;")
	private Class1_Sub35 aClass1_Sub35_1;

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
	public int anInt6174 = 0;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "Z")
	private boolean aBoolean569 = false;

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
	public int anInt6171 = 78642;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
	private int anInt6172 = 0;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	public int anInt6164 = 512;

	@OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
	public int anInt6180 = 3500;

	@OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
	public int anInt6182 = 50;

	@OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
	public int anInt6184 = 0;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
	public int anInt6173 = 0;

	@OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
	public int anInt6186 = 512;

	@OriginalMember(owner = "client!wb", name = "V", descriptor = "Z")
	public boolean aBoolean572 = false;

	@OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
	public int anInt6183 = 0;

	@OriginalMember(owner = "client!wb", name = "Y", descriptor = "Z")
	private boolean aBoolean573 = false;

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
	private int anInt6175 = 0;

	@OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
	public int anInt6192 = 75518;

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	public int anInt6169 = 0;

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
	public int anInt6189 = 0;

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "Z")
	private boolean aBoolean570 = false;

	@OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
	private int anInt6191 = 0;

	@OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
	private int anInt6194 = 3500;

	@OriginalMember(owner = "client!wb", name = "ib", descriptor = "I")
	public int anInt6195 = 0;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	public int anInt6179 = 45823;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	public int anInt6166 = this.anInt6194 - 255;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "Lclient!tl;")
	private final Class227 aClass227_49 = new Class227(16);

	@OriginalMember(owner = "client!wb", name = "X", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "Lclient!tn;")
	private Class193 aClass193_1;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "[I")
	public int[] anIntArray729;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
	public int anInt6170;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
	private int anInt6165;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!cp;I)V")
	public Class164_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		super(arg2, arg1);
		this.aCanvas7 = arg0;
		this.aClass193_1 = Static96.method1397(this.aCanvas7);
		this.anIntArray729 = this.aClass193_1.anIntArray645;
		this.anInt6170 = this.aClass193_1.anInt5586;
		this.anInt6165 = this.aClass193_1.anInt5585;
		this.method5411();
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method5382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method5363(arg0, arg1, arg2, arg4, arg5);
		this.method5363(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method5392(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method5392(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)I")
	@Override
	public int method5391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	@Override
	public void method5366(@OriginalArg(0) int arg0) {
		if (this.anInt6185 == arg0) {
			return;
		}
		this.anInt6185 = arg0;
		this.aClass221Array1 = new Class221[this.anInt6185];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6185; local14++) {
			this.aClass221Array1[local14] = new Class221(this);
		}
	}

	@OriginalMember(owner = "client!wb", name = "F", descriptor = "()V")
	@Override
	public void method5386() {
	}

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "()Z")
	@Override
	public boolean method5327() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5344() {
		@Pc(3) Class221 local3 = this.method5409(Thread.currentThread());
		@Pc(6) Class46 local6 = local3.aClass46_2;
		local6.aBoolean101 = false;
		local6.aBoolean101 = false;
		local6.anInt1126 = 0;
		local6.aBoolean99 = true;
		local6.method874(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean101 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([Lclient!ns;Lclient!im;Lclient!mu;[Lclient!ro;I)V")
	@Override
	public void method5316(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class41_Sub5[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class22_Sub1[] local3 = new Class22_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class22_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class22_Sub1 local26 = Static23.method362(this, local3);
		local26.method353(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([IIIII)Lclient!dp;")
	@Override
	public Class51 method5349(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class51_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class51_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class51_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class51_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "()Lclient!mu;")
	@Override
	public Class127 method5393() {
		return new Class127_Sub1();
	}

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "()I")
	@Override
	public int method5337() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!is;[Lclient!ff;Z)Lclient!tr;")
	@Override
	public Class137 method5352(@OriginalArg(0) Class110 arg0, @OriginalArg(1) Class80[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1753;
			local7[local11] = arg1[local11].anInt1751;
			if (arg1[local11].aByteArray34 != null) {
			}
		}
		return new Class137_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "()V")
	@Override
	public void method5305() {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!im;)V")
	@Override
	public void method5315(@OriginalArg(0) Class108 arg0) {
		@Pc(3) Class41_Sub2 local3 = arg0.aClass95_1.aClass41_Sub2_5;
		for (@Pc(6) Class41_Sub2 local6 = local3.aClass41_Sub2_7; local6 != local3; local6 = local6.aClass41_Sub2_7) {
			@Pc(10) Class41_Sub2_Sub1 local10 = (Class41_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt6311 >> 12;
			@Pc(20) int local20 = local10.anInt6307 >> 12;
			@Pc(25) int local25 = local10.anInt6308 >> 12;
			@Pc(49) int local49 = this.aClass127_Sub1_3.anInt3251 + (this.aClass127_Sub1_3.anInt3249 * local15 + this.aClass127_Sub1_3.anInt3245 * local20 + this.aClass127_Sub1_3.anInt3244 * local25 >> 15);
			if (local49 >= this.anInt6182 && local49 <= this.anInt6194) {
				@Pc(90) int local90 = this.anInt6181 + this.anInt6164 * (this.aClass127_Sub1_3.anInt3243 + (this.aClass127_Sub1_3.anInt3248 * local15 + this.aClass127_Sub1_3.anInt3252 * local20 + this.aClass127_Sub1_3.anInt3247 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt6187 + this.anInt6186 * (this.aClass127_Sub1_3.anInt3254 + (this.aClass127_Sub1_3.anInt3246 * local15 + this.aClass127_Sub1_3.anInt3253 * local20 + this.aClass127_Sub1_3.anInt3250 * local25 >> 15)) / local49;
				if (local90 >= this.anInt6174 && local90 <= this.anInt6195 && local122 >= this.anInt6169 && local122 <= this.anInt6183) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method5408(local10, local90, local122, (local10.anInt6312 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	@Override
	public void method5345(@OriginalArg(0) int arg0) {
		this.aClass221Array1[arg0].method4815(null);
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(IIII)[I")
	@Override
	public int[] method5373() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt6170;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray729[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[I)V")
	@Override
	public void method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass127_Sub1_3.anInt3251 + (this.aClass127_Sub1_3.anInt3249 * arg0 + this.aClass127_Sub1_3.anInt3245 * arg1 + this.aClass127_Sub1_3.anInt3244 * arg2 >> 15);
		if (local23 < this.anInt6182 || local23 > this.anInt6194) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt6164 * (this.aClass127_Sub1_3.anInt3243 + (this.aClass127_Sub1_3.anInt3248 * arg0 + this.aClass127_Sub1_3.anInt3252 * arg1 + this.aClass127_Sub1_3.anInt3247 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt6186 * (this.aClass127_Sub1_3.anInt3254 + (this.aClass127_Sub1_3.anInt3246 * arg0 + this.aClass127_Sub1_3.anInt3253 * arg1 + this.aClass127_Sub1_3.anInt3250 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt6193 && local73 <= this.anInt6176 && local102 >= this.anInt6167 && local102 <= this.anInt6190) {
			arg3[0] = local73 - this.anInt6193;
			arg3[1] = local102 - this.anInt6167;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!wb", name = "J", descriptor = "()V")
	@Override
	public void method5400() {
		this.aClass227_50.method4871();
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method5363(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method5363(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt6174) {
					arg1 += local104 * (this.anInt6174 - arg0);
					arg0 = this.anInt6174;
				}
				if (arg2 >= this.anInt6195) {
					arg2 = this.anInt6195 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt6169 && local150 < this.anInt6183) {
							this.anIntArray729[arg0 + local150 * this.anInt6170] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt6169 && local213 < this.anInt6183) {
							local228 = arg0 + local213 * this.anInt6170;
							local233 = this.anIntArray729[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray729[local228] = local204 + local233;
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
				if (arg1 < this.anInt6169) {
					arg0 += local104 * (this.anInt6169 - arg1);
					arg1 = this.anInt6169;
				}
				if (arg3 >= this.anInt6183) {
					arg3 = this.anInt6183 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt6174 && local150 < this.anInt6195) {
							this.anIntArray729[local150 + arg1 * this.anInt6170] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt6174 && local213 < this.anInt6195) {
							local228 = local213 + arg1 * this.anInt6170;
							local233 = this.anIntArray729[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray729[local213 + arg1 * this.anInt6170] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method5392(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method5392(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5350(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas7 == null || this.aClass193_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas7.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt6170 && local21.y <= this.anInt6165 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass193_1.method4805(local14, local21.width, local21.y, local21.height, local21.x);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "()V")
	@Override
	public void method5306() {
		this.anInt6174 = 0;
		this.anInt6169 = 0;
		this.anInt6195 = this.anInt6170;
		this.anInt6183 = this.anInt6165;
		this.method5407();
	}

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "()Z")
	@Override
	public boolean method5369() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "()V")
	@Override
	protected void method5346() {
		if (this.aBoolean573) {
			Static70.method1141(false);
			this.aBoolean573 = false;
		}
		this.aCanvas7 = null;
		this.aClass193_1 = null;
		this.aBoolean569 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method5388(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt6179 = (int) (arg1 * 65535.0F);
		this.anInt6171 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt6168 = (int) (arg3 * 65535.0F / local26);
		this.anInt6177 = (int) (arg4 * 65535.0F / local26);
		this.anInt6188 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(IIII)V")
	@Override
	public void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6174 < arg0) {
			this.anInt6174 = arg0;
		}
		if (this.anInt6169 < arg1) {
			this.anInt6169 = arg1;
		}
		if (this.anInt6195 > arg2) {
			this.anInt6195 = arg2;
		}
		if (this.anInt6183 > arg3) {
			this.anInt6183 = arg3;
		}
		this.method5407();
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "()Z")
	@Override
	public boolean method5309() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)Z")
	public boolean method5406(@OriginalArg(0) int arg0) {
		return super.anInterface2_7.method4741(arg0).aBoolean200;
	}

	@OriginalMember(owner = "client!wb", name = "I", descriptor = "()Z")
	@Override
	public boolean method5394() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!as;)V")
	@Override
	public void method5311(@OriginalArg(0) Class16 arg0) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	private void method5407() {
		this.anInt6193 = this.anInt6174 - this.anInt6181;
		this.anInt6176 = this.anInt6195 - this.anInt6181;
		this.anInt6167 = this.anInt6169 - this.anInt6187;
		this.anInt6190 = this.anInt6183 - this.anInt6187;
		for (@Pc(29) int local29 = 0; local29 < this.anInt6185; local29++) {
			@Pc(36) Class46 local36 = this.aClass221Array1[local29].aClass46_2;
			local36.anInt1127 = this.anInt6181 - this.anInt6174;
			local36.anInt1125 = this.anInt6187 - this.anInt6169;
			local36.anInt1124 = this.anInt6195 - this.anInt6174;
			local36.anInt1122 = this.anInt6183 - this.anInt6169;
		}
		@Pc(78) int local78 = this.anInt6169 * this.anInt6170 + this.anInt6174;
		for (@Pc(81) int local81 = this.anInt6169; local81 < this.anInt6183; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt6185; local84++) {
				this.aClass221Array1[local84].aClass46_2.anIntArray143[local81 - this.anInt6169] = local78;
			}
			local78 += this.anInt6170;
		}
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "()Z")
	@Override
	public boolean method5308() {
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIILclient!us;II)V")
	@Override
	public void method5339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class34 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class34_Sub1 local2 = (Class34_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray114;
		@Pc(8) int[] local8 = local2.anIntArray113;
		@Pc(17) int local17 = this.anInt6169 > arg7 ? this.anInt6169 : arg7;
		@Pc(32) int local32 = this.anInt6183 < arg7 + local5.length ? this.anInt6183 : arg7 + local5.length;
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
					if (local129 >= this.anInt6174 && local129 < this.anInt6195 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray729[local129 + arg1 * this.anInt6170] = arg4;
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
					if (local133 >= this.anInt6174 && local133 < this.anInt6195 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt6170;
						local248 = this.anIntArray729[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray729[local133 + arg1 * this.anInt6170] = local201 + local584;
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
		if (arg0 < this.anInt6174) {
			arg1 += local83 * (this.anInt6174 - arg0);
			arg0 = this.anInt6174;
		}
		if (arg2 >= this.anInt6195) {
			arg2 = this.anInt6195 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray729[arg0 + local129 * this.anInt6170] = arg4;
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
					local243 = arg0 + local133 * this.anInt6170;
					local248 = this.anIntArray729[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray729[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "()V")
	@Override
	public void method5376() {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ft;III)V")
	public void method5408(@OriginalArg(0) Class41_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt6309;
		if (local6 == -1) {
			this.method5332(arg1, arg2, local3, arg0.anInt6314);
			return;
		}
		if (this.aClass1_Sub35_1 == null || this.aClass1_Sub35_1.aLong207 != (long) local6) {
			this.aClass1_Sub35_1 = (Class1_Sub35) this.aClass227_49.method4863((long) local6);
		}
		if (this.aClass1_Sub35_1 == null) {
			@Pc(44) int[] local44 = this.method5416(local6);
			if (local44 == null) {
				return;
			}
			this.aClass1_Sub35_1 = new Class1_Sub35();
			this.aClass1_Sub35_1.aBoolean437 = this.method5412(local6);
			@Pc(65) int local65 = this.aClass1_Sub35_1.aBoolean437 ? 64 : 128;
			this.aClass1_Sub35_1.aClass51_12 = this.method5349(local44, local65, local65, local65);
			this.aClass227_49.method4865(this.aClass1_Sub35_1, (long) local6);
		}
		if (this.aClass1_Sub35_1.aBoolean437) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.aClass1_Sub35_1.aClass51_12.method4677(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt6314, 1);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class221 local3 = this.method5409(Thread.currentThread());
		@Pc(6) Class46 local6 = local3.aClass46_2;
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
		@Pc(93) int local93 = arg0 - local6.method884();
		@Pc(98) int local98 = arg1 - local6.method879();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt1126 = 0;
		local6.aBoolean99 = local102 < 0 || local102 > local6.anInt1124 || local106 < 0 || local106 > local6.anInt1124 || local112 < 0 || local112 > local6.anInt1124;
		local6.method881(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean99 = local102 < 0 || local102 > local6.anInt1124 || local106 < 0 || local106 > local6.anInt1124 || local118 < 0 || local118 > local6.anInt1124;
		local6.method881(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5399(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(IIII)V")
	@Override
	public void method5383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6173 = arg0;
		this.anInt6184 = arg1;
		this.anInt6189 = arg2;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
	@Override
	public void method5367(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt6178;
		for (@Pc(9) Object local9 = this.aClass227_50.method4862(); local9 != null; local9 = this.aClass227_50.method4869()) {
			@Pc(13) Class1_Sub28 local13 = (Class1_Sub28) local9;
			if (local13.aBoolean366) {
				local13.anInt3766 += local4;
				@Pc(27) int local27 = local13.anInt3766 / 20;
				if (local27 > 0) {
					@Pc(36) Class98 local36 = super.anInterface2_7.method4741(local13.anInt3764);
					local13.method3070(local36.aByte29 * local4 * 50 / 1000, local36.aByte27 * local4 * 50 / 1000);
					local13.anInt3766 -= local27 * 20;
				}
				local13.aBoolean366 = false;
			}
		}
		this.anInt6178 = arg0;
		this.aClass227_49.method4859(5);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!te;")
	public Class221 method5409(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6185; local1++) {
			if (this.aClass221Array1[local1].aRunnable1 == arg0) {
				return this.aClass221Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)[I")
	public int[] method5410(@OriginalArg(0) int arg0) {
		@Pc(2) Class227 local2 = this.aClass227_50;
		@Pc(12) Class1_Sub28 local12;
		synchronized (this.aClass227_50) {
			local12 = (Class1_Sub28) this.aClass227_50.method4863((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_7.method4740(arg0)) {
					return null;
				}
				@Pc(32) Class98 local32 = super.anInterface2_7.method4741(arg0);
				@Pc(42) int local42 = local32.aBoolean193 || this.aBoolean570 ? 64 : 128;
				local12 = new Class1_Sub28(arg0, local42, super.anInterface2_7.method4742(local42, arg0, local42, 0.7F, true), local32.aBoolean201);
				this.aClass227_50.method4865(local12, (long) arg0);
			}
		}
		local12.aBoolean366 = true;
		return local12.method3071();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Lclient!ku;")
	@Override
	public Class1_Sub23 method5318() {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(FF)V")
	@Override
	public void method5314(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat80 = arg0;
		this.aFloat79 = arg1;
		this.method5413();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[Lclient!ma;)V")
	@Override
	public void method5355(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub27[] arg1) {
	}

	@OriginalMember(owner = "client!wb", name = "G", descriptor = "()Z")
	@Override
	public boolean method5389() {
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ff;Z)Lclient!dp;")
	@Override
	public Class51 method5360(@OriginalArg(0) Class80 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray225;
		@Pc(5) byte[] local5 = arg0.aByteArray33;
		@Pc(8) int local8 = arg0.anInt1753;
		@Pc(11) int local11 = arg0.anInt1751;
		@Pc(76) Class51_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray34 == null) {
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
			local76 = new Class51_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray34;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class51_Sub1_Sub2(this, local20, local8, local11);
				local76 = new Class51_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class51_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.method4672(arg0.anInt1752, arg0.anInt1748, arg0.anInt1749, arg0.anInt1750);
		return local76;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5322(@OriginalArg(0) Canvas arg0) {
		this.aCanvas7 = arg0;
		this.method5359();
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
	@Override
	public void method5402(@OriginalArg(0) int arg0) {
		this.method5321(0, 0, this.anInt6170, this.anInt6165, arg0, 0);
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()V")
	@Override
	public void method5303() {
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)I")
	@Override
	public int method5396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(IIII)V")
	@Override
	public void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([Lclient!ns;Lclient!mu;[Lclient!ro;I)V")
	@Override
	public void method5370(@OriginalArg(0) Class22[] arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) Class41_Sub5[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class22_Sub1[] local3 = new Class22_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class22_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class22_Sub1 local26 = Static23.method362(this, local3);
		local26.method353(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "()Z")
	@Override
	public boolean method5341() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
	@Override
	public void method5377(@OriginalArg(0) int arg0) {
		this.aClass221Array1[arg0].method4815(Thread.currentThread());
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()V")
	private void method5411() {
		this.aClass227_50 = new Class227(20);
		this.aClass127_Sub1_3 = new Class127_Sub1();
		Static133.method1962(false);
		this.aBoolean573 = true;
		this.method5366(1);
		this.method5377(0);
		this.method5306();
	}

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "()Z")
	@Override
	public boolean method5379() {
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[I[I)Lclient!us;")
	@Override
	public Class34 method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class34_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ns;Lclient!im;Lclient!mu;Lclient!ro;I)V")
	@Override
	public void method5365(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) Class127 arg2, @OriginalArg(3) Class41_Sub5 arg3) {
		((Class22_Sub1) arg0).method353(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)V")
	@Override
	protected void method5332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt6169) {
			local8 = this.anInt6169;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt6183) {
			local21 = this.anInt6183;
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
				if (local91 < this.anInt6174) {
					local91 = this.anInt6174;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6195) {
					local102 = this.anInt6195;
				}
				local116 = local91 + local30 * this.anInt6170;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray729[local116++] = arg3;
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
				if (local91 < this.anInt6174) {
					local91 = this.anInt6174;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6195 - 1) {
					local102 = this.anInt6195 - 1;
				}
				local116 = local91 + local30 * this.anInt6170;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray729[local116++] = arg3;
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
			if (local102 < this.anInt6174) {
				local102 = this.anInt6174;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt6195) {
				local116 = this.anInt6195;
			}
			local118 = local102 + local30 * this.anInt6170;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray729[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray729[local118++] = local277 + local360;
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
			if (local102 < this.anInt6174) {
				local102 = this.anInt6174;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt6195 - 1) {
				local116 = this.anInt6195 - 1;
			}
			local118 = local102 + local30 * this.anInt6170;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray729[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray729[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method5363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt6169 || arg1 >= this.anInt6183) {
			return;
		}
		if (arg0 < this.anInt6174) {
			arg2 -= this.anInt6174 - arg0;
			arg0 = this.anInt6174;
		}
		if (arg0 + arg2 > this.anInt6195) {
			arg2 = this.anInt6195 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt6170;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray729[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray729[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray729[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray729[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray729[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "()Z")
	@Override
	public boolean method5336() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "()Z")
	@Override
	public boolean method5317() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)Z")
	public boolean method5412(@OriginalArg(0) int arg0) {
		return this.aBoolean570 || super.anInterface2_7.method4741(arg0).aBoolean193;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "([I)V")
	@Override
	public void method5353(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6174;
		arg0[1] = this.anInt6169;
		arg0[2] = this.anInt6195;
		arg0[3] = this.anInt6183;
	}

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "()F")
	@Override
	public float method5333() {
		return this.aFloat79;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()V")
	private void method5413() {
		if (this.aFloat79 == 0.0F) {
			this.anInt6180 = this.anInt6194;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt6194;
		@Pc(12) float local12 = (float) this.anInt6182;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat80 / (this.aFloat79 + this.aFloat80);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat79;
		this.anInt6180 = (int) (((float) this.anInt6194 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(IIIIII)Z")
	@Override
	public boolean method5380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass127_Sub1_3.anInt3249 * arg0 + this.aClass127_Sub1_3.anInt3245 * arg1 + this.aClass127_Sub1_3.anInt3244 * arg2 >> 15) + this.aClass127_Sub1_3.anInt3251;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass127_Sub1_3.anInt3249 * arg3 + this.aClass127_Sub1_3.anInt3245 * arg4 + this.aClass127_Sub1_3.anInt3244 * arg5 >> 15) + this.aClass127_Sub1_3.anInt3251;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt6182 && local52 < this.anInt6182 || !(local23 <= this.anInt6194 || local52 <= this.anInt6194)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt6164 * ((this.aClass127_Sub1_3.anInt3248 * arg0 + this.aClass127_Sub1_3.anInt3252 * arg1 + this.aClass127_Sub1_3.anInt3247 * arg2 >> 15) + this.aClass127_Sub1_3.anInt3243) / local23;
		@Pc(133) int local133 = this.anInt6164 * ((this.aClass127_Sub1_3.anInt3248 * arg3 + this.aClass127_Sub1_3.anInt3252 * arg4 + this.aClass127_Sub1_3.anInt3247 * arg5 >> 15) + this.aClass127_Sub1_3.anInt3243) / local52;
		if (local104 < this.anInt6193 && local133 < this.anInt6193 || local104 > this.anInt6176 && local133 > this.anInt6176) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt6186 * ((this.aClass127_Sub1_3.anInt3246 * arg0 + this.aClass127_Sub1_3.anInt3253 * arg1 + this.aClass127_Sub1_3.anInt3250 * arg2 >> 15) + this.aClass127_Sub1_3.anInt3254) / local23;
			@Pc(209) int local209 = this.anInt6186 * ((this.aClass127_Sub1_3.anInt3246 * arg3 + this.aClass127_Sub1_3.anInt3253 * arg4 + this.aClass127_Sub1_3.anInt3250 * arg5 >> 15) + this.aClass127_Sub1_3.anInt3254) / local52;
			return (local180 >= this.anInt6167 || local209 >= this.anInt6167) && (local180 <= this.anInt6190 || local209 <= this.anInt6190);
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V")
	@Override
	public void method5340(@OriginalArg(0) boolean arg0) {
		this.aBoolean570 = arg0;
		this.aClass227_50.method4871();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!as;Lclient!as;FLclient!as;)Lclient!as;")
	@Override
	public Class16 method5342(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class16 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!vn;IIII)Lclient!ns;")
	@Override
	public Class22 method5368(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class22_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "()V")
	@Override
	public void method5359() {
		this.aClass193_1 = Static96.method1397(this.aCanvas7);
		this.anIntArray729 = this.aClass193_1.anIntArray645;
		this.anInt6170 = this.aClass193_1.anInt5586;
		this.anInt6165 = this.aClass193_1.anInt5585;
		for (@Pc(22) int local22 = 0; local22 < this.anInt6185; local22++) {
			this.aClass221Array1[local22].method4817();
		}
		this.method5306();
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6181 = arg0;
		this.anInt6187 = arg1;
		this.anInt6164 = arg2;
		this.anInt6186 = arg3;
		this.method5407();
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(IIII)V")
	@Override
	public void method5330() {
		this.anInt6175 = this.anInt6184;
		this.anInt6173 = -1;
		this.anInt6184 = 1583160;
		this.anInt6189 = 40;
		this.aBoolean572 = true;
	}

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "()I")
	@Override
	public int method5372() {
		@Pc(2) int local2 = this.anInt6191;
		this.anInt6191 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!wb", name = "K", descriptor = "()V")
	@Override
	public void method5404() {
		if (this.aCanvas7 == null || this.aClass193_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas7.getGraphics();
			this.aClass193_1.method4808(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
	@Override
	public void method5326(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "()I")
	@Override
	public int method5348() {
		return this.anInt6194;
	}

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "()I")
	@Override
	public int method5375() {
		@Pc(2) int local2 = this.anInt6172;
		this.anInt6172 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "()Z")
	@Override
	public boolean method5381() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIIIII)Lclient!as;")
	@Override
	public Class16 method5325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(IIIII)V")
	@Override
	public void method5392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt6174 || arg0 >= this.anInt6195) {
			return;
		}
		if (arg1 < this.anInt6169) {
			arg2 -= this.anInt6169 - arg1;
			arg1 = this.anInt6169;
		}
		if (arg1 + arg2 > this.anInt6183) {
			arg2 = this.anInt6183 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt6170;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray729[local40 + local54 * this.anInt6170] = arg3;
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
				local111 = local40 + local103 * this.anInt6170;
				local116 = this.anIntArray729[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray729[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt6170;
				local111 = this.anIntArray729[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray729[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIZ)Lclient!dp;")
	@Override
	public Class51 method5387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt6170 + arg0;
		@Pc(16) int local16 = this.anInt6170 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray729[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class51_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class51_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	@Override
	public void method5390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6182 = arg0;
		this.anInt6194 = arg1;
		this.anInt6166 = this.anInt6194 - 255;
		this.method5413();
	}

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "()Z")
	public boolean method5414() {
		return this.aBoolean569;
	}

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "()Z")
	@Override
	public boolean method5328() {
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "()V")
	@Override
	public void method5324() {
		this.anInt6184 = this.anInt6175;
		this.aBoolean572 = false;
	}

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "()Z")
	@Override
	public boolean method5384() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ku;)V")
	@Override
	public void method5374(@OriginalArg(0) Class1_Sub23 arg0) {
	}

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "()I")
	@Override
	public int method5347() {
		return this.anInt6182;
	}

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "(I)I")
	public int method5415(@OriginalArg(0) int arg0) {
		return super.anInterface2_7.method4741(arg0).aShort49 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	@Override
	public void method5307(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt6170) {
			arg2 = this.anInt6170;
		}
		if (arg3 > this.anInt6165) {
			arg3 = this.anInt6165;
		}
		this.anInt6174 = arg0;
		this.anInt6195 = arg2;
		this.anInt6169 = arg1;
		this.anInt6183 = arg3;
		this.method5407();
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "()Z")
	@Override
	public boolean method5304() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "(I)[I")
	private int[] method5416(@OriginalArg(0) int arg0) {
		@Pc(2) Class227 local2 = this.aClass227_50;
		@Pc(12) Class1_Sub28 local12;
		synchronized (this.aClass227_50) {
			local12 = (Class1_Sub28) this.aClass227_50.method4863((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_7.method4740(arg0)) {
					return null;
				}
				@Pc(32) Class98 local32 = super.anInterface2_7.method4741(arg0);
				@Pc(42) int local42 = local32.aBoolean193 || this.aBoolean570 ? 64 : 128;
				local12 = new Class1_Sub28(arg0, local42, super.anInterface2_7.method4743(0.7F, local42, local42, arg0), local32.aBoolean201);
				this.aClass227_50.method4865(local12, (long) arg0);
			}
		}
		local12.aBoolean366 = true;
		return local12.method3071();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!us;II)V")
	@Override
	public void method5312(@OriginalArg(1) Class34 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class34_Sub1 local2 = (Class34_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray114;
		@Pc(8) int[] local8 = local2.anIntArray113;
		@Pc(20) int local20;
		if (this.anInt6183 < arg2 + local5.length) {
			local20 = this.anInt6183 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt6169 > arg2) {
			local33 = this.anInt6169 - arg2;
			arg2 = this.anInt6169;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt6170;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt6174 > local58) {
				local62 -= this.anInt6174 - local58;
				local58 = this.anInt6174;
			}
			if (this.anInt6195 < local58 + local62) {
				local62 = this.anInt6195 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray729[local58++] = -16777216;
			}
			local49 += this.anInt6170;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt6170;
		@Pc(35) int local35 = this.anInt6170 - arg2;
		if (arg1 + arg3 > this.anInt6183) {
			arg3 -= arg1 + arg3 - this.anInt6183;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt6169) {
			local59 = this.anInt6169 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt6170;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt6195) {
			local59 = arg0 + arg2 - this.anInt6195;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt6174) {
			local59 = this.anInt6174 - arg0;
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
						this.anIntArray729[local30++] = arg4;
					} else {
						this.anIntArray729[local30++] = arg5;
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
					local245 = this.anIntArray729[local30];
					this.anIntArray729[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray729[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray729[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!mu;)V")
	@Override
	public void method5357(@OriginalArg(0) Class127 arg0) {
		this.aClass127_Sub1_3 = (Class127_Sub1) arg0;
	}

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "()Lclient!mu;")
	@Override
	public Class127 method5378() {
		@Pc(3) Class221 local3 = this.method5409(Thread.currentThread());
		return local3.aClass127_Sub1_2;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt6174) {
			arg2 -= this.anInt6174 - arg0;
			arg0 = this.anInt6174;
		}
		if (arg1 < this.anInt6169) {
			arg3 -= this.anInt6169 - arg1;
			arg1 = this.anInt6169;
		}
		if (arg0 + arg2 > this.anInt6195) {
			arg2 = this.anInt6195 - arg0;
		}
		if (arg1 + arg3 > this.anInt6183) {
			arg3 = this.anInt6183 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt6195 || arg1 > this.anInt6183) {
			return;
		}
		@Pc(67) int local67 = this.anInt6170 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt6170;
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
						local221 = this.anIntArray729[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray729[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray729[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray729[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray729[arg2] = arg4;
					arg2++;
					this.anIntArray729[arg2] = arg4;
					arg2++;
					this.anIntArray729[arg2] = arg4;
					arg2++;
					this.anIntArray729[arg2] = arg4;
					arg2++;
					this.anIntArray729[arg2] = arg4;
					arg2++;
					this.anIntArray729[arg2] = arg4;
					arg2++;
					this.anIntArray729[arg2] = arg4;
					arg2++;
					this.anIntArray729[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray729[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "()F")
	@Override
	public float method5338() {
		return this.aFloat80;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(F)V")
	@Override
	public void method5398(@OriginalArg(0) float arg0) {
		this.anInt6192 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[[I[[IIII)Lclient!cl;")
	@Override
	public Class42 method5403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class42_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	@Override
	public void method5361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6184 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt6184 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt6184 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt6184 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt6184 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean571 = false;
		} else {
			this.aBoolean571 = true;
		}
	}

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "()I")
	@Override
	public int method5323() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "()Z")
	@Override
	public boolean method5405() {
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "(I)Z")
	public boolean method5417(@OriginalArg(0) int arg0) {
		return super.anInterface2_7.method4740(arg0);
	}
}
