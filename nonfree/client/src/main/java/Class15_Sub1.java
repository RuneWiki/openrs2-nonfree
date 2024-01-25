import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public abstract class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas8;

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "Lclient!fr;")
	protected Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
	private int anInt5014;

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "I")
	public int anInt5015;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
	public int anInt5017;

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "[I")
	public int[] anIntArray309;

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
	public int anInt5019;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "[Lclient!tv;")
	protected Class91[] aClass91Array3;

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "I")
	public int anInt5020;

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "Lclient!xa;")
	protected Class37 aClass37_26;

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
	public int anInt5025;

	@OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
	public int anInt5028;

	@OriginalMember(owner = "client!ql", name = "S", descriptor = "F")
	private float aFloat86;

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!ql", name = "W", descriptor = "I")
	public int anInt5033;

	@OriginalMember(owner = "client!ql", name = "ab", descriptor = "I")
	public int anInt5037;

	@OriginalMember(owner = "client!ql", name = "bb", descriptor = "I")
	public int anInt5038;

	@OriginalMember(owner = "client!ql", name = "cb", descriptor = "I")
	protected int anInt5039;

	@OriginalMember(owner = "client!ql", name = "db", descriptor = "F")
	private float aFloat87;

	@OriginalMember(owner = "client!ql", name = "gb", descriptor = "I")
	public int anInt5042;

	@OriginalMember(owner = "client!ql", name = "jb", descriptor = "I")
	public int anInt5045;

	@OriginalMember(owner = "client!ql", name = "lb", descriptor = "Lclient!xa;")
	protected Class37 lb;

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "Z")
	private boolean aBoolean425;

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "Z")
	private boolean aBoolean426;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Lclient!bc;")
	protected Class25 aClass25_20;

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
	public int anInt5016;

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
	public int anInt5018;

	@OriginalMember(owner = "client!ql", name = "O", descriptor = "I")
	public int anInt5029;

	@OriginalMember(owner = "client!ql", name = "P", descriptor = "Z")
	public boolean aBoolean427;

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "I")
	public int anInt5022;

	@OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
	private int anInt5026;

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
	public int anInt5023;

	@OriginalMember(owner = "client!ql", name = "X", descriptor = "I")
	private int anInt5034;

	@OriginalMember(owner = "client!ql", name = "T", descriptor = "Z")
	private boolean aBoolean428;

	@OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
	private int anInt5024;

	@OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
	public int anInt5031;

	@OriginalMember(owner = "client!ql", name = "Z", descriptor = "I")
	public int anInt5036;

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "I")
	public int anInt5030;

	@OriginalMember(owner = "client!ql", name = "V", descriptor = "I")
	public int anInt5032;

	@OriginalMember(owner = "client!ql", name = "eb", descriptor = "I")
	public int anInt5040;

	@OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
	public int anInt5021;

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
	public int anInt5027;

	@OriginalMember(owner = "client!ql", name = "fb", descriptor = "I")
	public int anInt5041;

	@OriginalMember(owner = "client!ql", name = "Y", descriptor = "I")
	public int anInt5035;

	@OriginalMember(owner = "client!ql", name = "ib", descriptor = "I")
	public int anInt5044;

	@OriginalMember(owner = "client!ql", name = "hb", descriptor = "I")
	private int anInt5043;

	@OriginalMember(owner = "client!ql", name = "N", descriptor = "Lclient!me;")
	protected final Class211 aClass211_38;

	@OriginalMember(owner = "client!ql", name = "kb", descriptor = "I")
	protected int anInt5046;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "Lclient!me;")
	private final Class211 aClass211_37;

	@OriginalMember(owner = "client!ql", name = "K", descriptor = "Lclient!su;")
	public Class255_Sub2 aClass255_Sub2_7;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!e;)V")
	private Class15_Sub1(@OriginalArg(0) Interface4 arg0) {
		super(arg0);
		this.aBoolean425 = false;
		this.aBoolean426 = false;
		this.aClass25_20 = new Class25(4);
		this.anInt5016 = 0;
		this.anInt5018 = 0;
		this.anInt5029 = 0;
		this.aBoolean427 = false;
		this.anInt5022 = 45823;
		this.anInt5026 = 0;
		this.anInt5023 = 78642;
		this.anInt5034 = 3500;
		this.aBoolean428 = false;
		this.anInt5024 = 0;
		this.anInt5031 = 75518;
		this.anInt5036 = 0;
		this.anInt5030 = 0;
		this.anInt5032 = 512;
		this.anInt5040 = 512;
		this.anInt5021 = 0;
		this.anInt5027 = this.anInt5034 - 255;
		this.anInt5041 = 3500;
		this.anInt5035 = 50;
		this.anInt5044 = 0;
		this.anInt5043 = 0;
		this.aClass211_38 = new Class211(16);
		this.anInt5046 = -1;
		this.aClass211_37 = new Class211(256);
		this.aClass255_Sub2_7 = new Class255_Sub2();
		this.method5304(1);
		this.method5317(0);
		Static67.method8226(false, true);
		this.aBoolean426 = true;
	}

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class15_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		this(arg1);
		this.method5286(arg0);
		this.method5319(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "y", descriptor = "()Z")
	@Override
	public final boolean method5333() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!tv;")
	public abstract Class91 method4266(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!ql", name = "D", descriptor = "()V")
	@Override
	public final void method5350() {
	}

	@OriginalMember(owner = "client!ql", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass255_Sub2_7.anInt9116 * arg0 + this.aClass255_Sub2_7.anInt9118 * arg1 + this.aClass255_Sub2_7.anInt9120 * arg2 >> 14) + this.aClass255_Sub2_7.anInt9126;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass255_Sub2_7.anInt9116 * arg3 + this.aClass255_Sub2_7.anInt9118 * arg4 + this.aClass255_Sub2_7.anInt9120 * arg5 >> 14) + this.aClass255_Sub2_7.anInt9126;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt5035 && local52 < this.anInt5035 || !(local23 <= this.anInt5034 || local52 <= this.anInt5034)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt5032 * ((this.aClass255_Sub2_7.anInt9117 * arg0 + this.aClass255_Sub2_7.anInt9121 * arg1 + this.aClass255_Sub2_7.anInt9123 * arg2 >> 14) + this.aClass255_Sub2_7.anInt9124) / local23;
		@Pc(133) int local133 = this.anInt5032 * ((this.aClass255_Sub2_7.anInt9117 * arg3 + this.aClass255_Sub2_7.anInt9121 * arg4 + this.aClass255_Sub2_7.anInt9123 * arg5 >> 14) + this.aClass255_Sub2_7.anInt9124) / local52;
		if (local104 < this.anInt5017 && local133 < this.anInt5017 || local104 > this.anInt5015 && local133 > this.anInt5015) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt5040 * ((this.aClass255_Sub2_7.anInt9125 * arg0 + this.aClass255_Sub2_7.anInt9127 * arg1 + this.aClass255_Sub2_7.anInt9119 * arg2 >> 14) + this.aClass255_Sub2_7.anInt9122) / local23;
			@Pc(209) int local209 = this.anInt5040 * ((this.aClass255_Sub2_7.anInt9125 * arg3 + this.aClass255_Sub2_7.anInt9127 * arg4 + this.aClass255_Sub2_7.anInt9119 * arg5 >> 14) + this.aClass255_Sub2_7.anInt9122) / local52;
			return (local180 >= this.anInt5042 || local209 >= this.anInt5042) && (local180 <= this.anInt5033 || local209 <= this.anInt5033);
		}
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "()V")
	@Override
	public final void method5285() {
	}

	@OriginalMember(owner = "client!ql", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt5037;
		@Pc(35) int local35 = this.anInt5037 - arg2;
		if (arg1 + arg3 > this.anInt5018) {
			arg3 -= arg1 + arg3 - this.anInt5018;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt5016) {
			local59 = this.anInt5016 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt5037;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt5030) {
			local59 = arg0 + arg2 - this.anInt5030;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt5021) {
			local59 = this.anInt5021 - arg0;
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
						this.anIntArray309[local30++] = arg4;
					} else {
						this.anIntArray309[local30++] = arg5;
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
					local245 = this.anIntArray309[local30];
					this.anIntArray309[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray309[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray309[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!ql", name = "q", descriptor = "()Z")
	@Override
	public final boolean method5322() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "()Lclient!q;")
	@Override
	public final Class255 method5294() {
		return new Class255_Sub2();
	}

	@OriginalMember(owner = "client!ql", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		this.anInt5031 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "()V")
	@Override
	public final void method5349() {
		this.aClass211_37.method5535();
		this.aClass211_38.method5535();
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)Z")
	public final boolean method4267(@OriginalArg(0) int arg0) {
		return this.aBoolean428 || super.anInterface4_11.method3088(arg0).aBoolean486;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method5299();

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(Z)V")
	@Override
	public final void method5345(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt5034;
	}

	@OriginalMember(owner = "client!ql", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat87 = arg0;
		this.aFloat86 = arg1;
		this.method4276();
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(I)Z")
	public final boolean method4268(@OriginalArg(0) int arg0) {
		return super.anInterface4_11.method3090(arg0);
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5348(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas8 == arg0) {
			this.method5319(null);
		}
		@Pc(15) Class3_Sub2 local15 = (Class3_Sub2) this.aClass25_20.method946((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8412();
		}
	}

	@OriginalMember(owner = "client!ql", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5043 = this.anInt5044;
		this.anInt5029 = arg0;
		this.anInt5044 = arg1;
		this.anInt5036 = arg2;
		this.aBoolean427 = true;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5319(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[Lclient!pn;)V")
	@Override
	public final void method5353(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub28[] arg1) {
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method5311(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class37 method5324(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class37_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class37_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class37_Sub2_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class37_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method5293(@OriginalArg(0) Class3_Sub19 arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "(I)V")
	public abstract void method5340(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "()V")
	@Override
	public void method5342() {
	}

	@OriginalMember(owner = "client!ql", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass255_Sub2_7.anInt9126 + (this.aClass255_Sub2_7.anInt9116 * arg0 + this.aClass255_Sub2_7.anInt9118 * arg1 + this.aClass255_Sub2_7.anInt9120 * arg2 >> 14);
		if (local23 < this.anInt5035 || local23 > this.anInt5034) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt5032 * (this.aClass255_Sub2_7.anInt9124 + (this.aClass255_Sub2_7.anInt9117 * arg0 + this.aClass255_Sub2_7.anInt9121 * arg1 + this.aClass255_Sub2_7.anInt9123 * arg2 >> 14)) / local23;
		@Pc(102) int local102 = this.anInt5040 * (this.aClass255_Sub2_7.anInt9122 + (this.aClass255_Sub2_7.anInt9125 * arg0 + this.aClass255_Sub2_7.anInt9127 * arg1 + this.aClass255_Sub2_7.anInt9119 * arg2 >> 14)) / local23;
		if (local73 >= this.anInt5017 && local73 <= this.anInt5015 && local102 >= this.anInt5042 && local102 <= this.anInt5033) {
			arg3[0] = local73 - this.anInt5017;
			arg3[1] = local102 - this.anInt5042;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ql", name = "KA", descriptor = "(IIII)[I")
	@Override
	public final int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt5037 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray309[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt5016 || arg1 >= this.anInt5018) {
			return;
		}
		if (arg0 < this.anInt5021) {
			arg2 -= this.anInt5021 - arg0;
			arg0 = this.anInt5021;
		}
		if (arg0 + arg2 > this.anInt5030) {
			arg2 = this.anInt5030 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5037;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray309[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray309[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray309[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray309[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray309[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "()Z")
	@Override
	public final boolean method5284() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.anInt5044 = this.anInt5043;
		this.aBoolean427 = false;
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "()Z")
	@Override
	public final boolean method5279() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt5021;
		arg0[1] = this.anInt5016;
		arg0[2] = this.anInt5030;
		arg0[3] = this.anInt5018;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)Lclient!i;")
	@Override
	public final Class3_Sub19 method5313(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIZ)Lclient!xa;")
	@Override
	public final Class37 method5308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class37_Sub2_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "()Z")
	@Override
	public final boolean method5332() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "t", descriptor = "()Z")
	@Override
	public final boolean method5325() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method5351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class93 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class93_Sub2 local2 = (Class93_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray452;
		@Pc(8) int[] local8 = local2.anIntArray453;
		@Pc(17) int local17 = this.anInt5016 > arg7 ? this.anInt5016 : arg7;
		@Pc(32) int local32 = this.anInt5018 < arg7 + local5.length ? this.anInt5018 : arg7 + local5.length;
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
					if (local129 >= this.anInt5021 && local129 < this.anInt5030 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray309[local129 + arg1 * this.anInt5037] = arg4;
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
					if (local133 >= this.anInt5021 && local133 < this.anInt5030 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt5037;
						local248 = this.anIntArray309[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray309[local133 + arg1 * this.anInt5037] = local201 + local584;
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
		if (arg0 < this.anInt5021) {
			arg1 += local83 * (this.anInt5021 - arg0);
			arg0 = this.anInt5021;
		}
		if (arg2 >= this.anInt5030) {
			arg2 = this.anInt5030 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray309[arg0 + local129 * this.anInt5037] = arg4;
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
					local243 = arg0 + local133 * this.anInt5037;
					local248 = this.anIntArray309[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray309[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!ql", name = "s", descriptor = "()V")
	protected final void method4269() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5019; local1++) {
			this.aClass91Array3[local1].method3266();
		}
		this.F();
	}

	@OriginalMember(owner = "client!ql", name = "G", descriptor = "()V")
	protected abstract void method4270();

	@OriginalMember(owner = "client!ql", name = "E", descriptor = "()V")
	@Override
	public final void method5355() throws Exception_Sub1 {
		if (this.aCanvas8 == null || this.aClass3_Sub2_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas8.getGraphics();
			this.aClass3_Sub2_3.method8074(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas8.repaint();
		}
	}

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "(I)[I")
	protected final int[] method4271(@OriginalArg(0) int arg0) {
		@Pc(2) Class211 local2 = this.aClass211_37;
		@Pc(12) Class3_Sub24 local12;
		synchronized (this.aClass211_37) {
			local12 = (Class3_Sub24) this.aClass211_37.method5534((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_11.method3090(arg0)) {
					return null;
				}
				@Pc(32) Class178 local32 = super.anInterface4_11.method3088(arg0);
				@Pc(42) int local42 = local32.aBoolean486 || this.aBoolean428 ? 64 : 128;
				local12 = new Class3_Sub24(arg0, local42, super.anInterface4_11.method3089(local42, arg0, local42, 0.7F), local32.aBoolean490);
				this.aClass211_37.method5529((long) arg0, local12);
			}
		}
		local12.aBoolean349 = true;
		return local12.method3861();
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(IIIIII)V")
	@Override
	public final void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([Lclient!ba;Lclient!qu;Lclient!q;[Lclient!ht;I)V")
	public abstract void method5297(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ql", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5021 < arg0) {
			this.anInt5021 = arg0;
		}
		if (this.anInt5016 < arg1) {
			this.anInt5016 = arg1;
		}
		if (this.anInt5030 > arg2) {
			this.anInt5030 = arg2;
		}
		if (this.anInt5018 > arg3) {
			this.anInt5018 = arg3;
		}
		this.method4270();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method5326(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "()Z")
	@Override
	public final boolean method5280() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method5338(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas8 == null || this.aClass3_Sub2_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas8.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt5037 && local21.y <= this.anInt5039 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass3_Sub2_3.method8076(local21.height, local21.width, local21.y, local14, local21.x);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas8.repaint();
		}
	}

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "()Z")
	@Override
	public final boolean method5288() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt5021 || arg0 >= this.anInt5030) {
			return;
		}
		if (arg1 < this.anInt5016) {
			arg2 -= this.anInt5016 - arg1;
			arg1 = this.anInt5016;
		}
		if (arg1 + arg2 > this.anInt5018) {
			arg2 = this.anInt5018 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt5037;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray309[local40 + local54 * this.anInt5037] = arg3;
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
				local111 = local40 + local103 * this.anInt5037;
				local116 = this.anIntArray309[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray309[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt5037;
				local111 = this.anIntArray309[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray309[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "()Lclient!q;")
	@Override
	public final Class255 method5343() {
		@Pc(3) Class91 local3 = this.method4266(Thread.currentThread());
		return local3.aClass255_Sub2_6;
	}

	@OriginalMember(owner = "client!ql", name = "H", descriptor = "()Z")
	public final boolean method4272() {
		return this.aBoolean425;
	}

	@OriginalMember(owner = "client!ql", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class37 method5290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt5037 + arg0;
		@Pc(16) int local16 = this.anInt5037 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray309[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class37_Sub2_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class37_Sub2_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class4 method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!sga;[Lclient!aw;Z)Lclient!ta;")
	@Override
	public final Class111 method5346(@OriginalArg(0) Class297 arg0, @OriginalArg(1) Class20[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt707;
			local7[local11] = arg1[local11].anInt706;
			if (arg1[local11].aByteArray6 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class111_Sub3(this, arg0, arg1, local3, local7);
		} else {
			return new Class111_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!ql", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5029 = arg0;
		this.anInt5044 = arg1;
		this.anInt5036 = arg2;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!qu;)V")
	@Override
	public final void method5277(@OriginalArg(0) Class274 arg0) {
		@Pc(3) Class55_Sub2 local3 = arg0.aClass22_1.aClass55_Sub2_1;
		for (@Pc(6) Class55_Sub2 local6 = local3.aClass55_Sub2_10; local6 != local3; local6 = local6.aClass55_Sub2_10) {
			@Pc(10) Class55_Sub2_Sub1 local10 = (Class55_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt2862 >> 12;
			@Pc(20) int local20 = local10.anInt2858 >> 12;
			@Pc(25) int local25 = local10.anInt2859 >> 12;
			@Pc(49) int local49 = this.aClass255_Sub2_7.anInt9126 + (this.aClass255_Sub2_7.anInt9116 * local15 + this.aClass255_Sub2_7.anInt9118 * local20 + this.aClass255_Sub2_7.anInt9120 * local25 >> 14);
			if (local49 >= this.anInt5035 && local49 <= this.anInt5027) {
				@Pc(90) int local90 = this.anInt5025 + this.anInt5032 * (this.aClass255_Sub2_7.anInt9124 + (this.aClass255_Sub2_7.anInt9117 * local15 + this.aClass255_Sub2_7.anInt9121 * local20 + this.aClass255_Sub2_7.anInt9123 * local25 >> 14)) / local49;
				@Pc(122) int local122 = this.anInt5020 + this.anInt5040 * (this.aClass255_Sub2_7.anInt9122 + (this.aClass255_Sub2_7.anInt9125 * local15 + this.aClass255_Sub2_7.anInt9127 * local20 + this.aClass255_Sub2_7.anInt9119 * local25 >> 14)) / local49;
				if (local90 >= this.anInt5021 && local90 <= this.anInt5030 && local122 >= this.anInt5016 && local122 <= this.anInt5018) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method4275(local10, local90, local122, local49, (local10.anInt2865 * this.anInt5032 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "(IIIIII)Lclient!kn;")
	@Override
	public final Class108 method5328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method5286(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub2 local8 = (Class3_Sub2) this.aClass25_20.method946((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static165.method3093(arg0);
			this.aClass25_20.method945(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!ql", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		@Pc(2) int local2 = this.anInt5026;
		this.anInt5026 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ql", name = "i", descriptor = "()Z")
	@Override
	public final boolean method5292() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5035 = arg0;
		this.anInt5034 = arg1;
		this.anInt5027 = this.anInt5034 - 255;
		this.method4276();
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)V")
	@Override
	public void method5317(@OriginalArg(0) int arg0) {
		this.aClass91Array3[arg0].method3265(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ql", name = "SA", descriptor = "()I")
	@Override
	public final int SA() {
		@Pc(2) int local2 = this.anInt5024;
		this.anInt5024 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!ba;Lclient!qu;Lclient!q;Lclient!ht;I)V")
	@Override
	public final void method5309(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class274 arg1, @OriginalArg(2) Class255 arg2, @OriginalArg(3) Class55_Sub3 arg3, @OriginalArg(4) int arg4) {
		((Class21_Sub1) arg0).method7171(arg2, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!xa;Z)V")
	protected abstract void method5302(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "()Lclient!og;")
	@Override
	public final Class242 method5278() {
		return new Class242(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method5330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ql", name = "z", descriptor = "()Z")
	@Override
	public final boolean method5335() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
	@Override
	public final void method5282(@OriginalArg(0) boolean arg0) {
		this.aBoolean428 = arg0;
		this.aClass211_37.method5535();
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(IIIIIIIIII)V")
	public abstract void method4273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9);

	@OriginalMember(owner = "client!ql", name = "j", descriptor = "(I)[I")
	public final int[] method4274(@OriginalArg(0) int arg0) {
		@Pc(2) Class211 local2 = this.aClass211_37;
		@Pc(12) Class3_Sub24 local12;
		synchronized (this.aClass211_37) {
			local12 = (Class3_Sub24) this.aClass211_37.method5534((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_11.method3090(arg0)) {
					return null;
				}
				@Pc(32) Class178 local32 = super.anInterface4_11.method3088(arg0);
				@Pc(42) int local42 = local32.aBoolean486 || this.aBoolean428 ? 64 : 128;
				local12 = new Class3_Sub24(arg0, local42, super.anInterface4_11.method3086(local42, true, 0.7F, local42, arg0), local32.aBoolean490);
				this.aClass211_37.method5529((long) arg0, local12);
			}
		}
		local12.aBoolean349 = true;
		return local12.method3861();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!fu;IIII)V")
	public abstract void method4275(@OriginalArg(0) Class55_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method5347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.e(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.e(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt5021) {
					arg1 += local104 * (this.anInt5021 - arg0);
					arg0 = this.anInt5021;
				}
				if (arg2 >= this.anInt5030) {
					arg2 = this.anInt5030 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5016 && local150 < this.anInt5018) {
							this.anIntArray309[arg0 + local150 * this.anInt5037] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt5016 && local213 < this.anInt5018) {
							local228 = arg0 + local213 * this.anInt5037;
							local233 = this.anIntArray309[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray309[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt5016 && local150 < this.anInt5018) {
							local213 = arg0 + local150 * this.anInt5037;
							local228 = this.anIntArray309[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray309[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt5016) {
					arg0 += local104 * (this.anInt5016 - arg1);
					arg1 = this.anInt5016;
				}
				if (arg3 >= this.anInt5018) {
					arg3 = this.anInt5018 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5021 && local150 < this.anInt5030) {
							this.anIntArray309[local150 + arg1 * this.anInt5037] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt5021 && local213 < this.anInt5030) {
							local228 = local213 + arg1 * this.anInt5037;
							local233 = this.anIntArray309[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray309[local213 + arg1 * this.anInt5037] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt5021 && local150 < this.anInt5030) {
							local213 = local150 + arg1 * this.anInt5037;
							local228 = this.anIntArray309[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray309[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.ya(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.ya(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ql", name = "I", descriptor = "()V")
	private void method4276() {
		if (this.aFloat86 == 0.0F) {
			this.anInt5041 = this.anInt5034;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt5034;
		@Pc(12) float local12 = (float) this.anInt5035;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat87 / (this.aFloat86 + this.aFloat87);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat86;
		this.anInt5041 = (int) (((float) this.anInt5034 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "()Z")
	@Override
	public final boolean method5314() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(II)I")
	@Override
	public final int method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ql", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt5035;
	}

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "()V")
	@Override
	public final void method5295() {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!kn;)V")
	@Override
	public final void method5344(@OriginalArg(0) Class108 arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt5016) {
			local8 = this.anInt5016;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt5018) {
			local21 = this.anInt5018;
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
				if (local91 < this.anInt5021) {
					local91 = this.anInt5021;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5030) {
					local102 = this.anInt5030;
				}
				local116 = local91 + local30 * this.anInt5037;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray309[local116++] = arg3;
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
				if (local91 < this.anInt5021) {
					local91 = this.anInt5021;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5030 - 1) {
					local102 = this.anInt5030 - 1;
				}
				local116 = local91 + local30 * this.anInt5037;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray309[local116++] = arg3;
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
				if (local102 < this.anInt5021) {
					local102 = this.anInt5021;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5030) {
					local116 = this.anInt5030;
				}
				local118 = local102 + local30 * this.anInt5037;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray309[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray309[local118++] = local277 + local340;
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
				if (local102 < this.anInt5021) {
					local102 = this.anInt5021;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt5030 - 1) {
					local116 = this.anInt5030 - 1;
				}
				local118 = local102 + local30 * this.anInt5037;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray309[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray309[local118++] = local277 + local340;
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
				if (local91 < this.anInt5021) {
					local91 = this.anInt5021;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5030) {
					local102 = this.anInt5030;
				}
				local116 = local91 + local30 * this.anInt5037;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray309[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray309[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt5021) {
					local91 = this.anInt5021;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt5030 - 1) {
					local102 = this.anInt5030 - 1;
				}
				local116 = local91 + local30 * this.anInt5037;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray309[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray309[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5025 = arg0;
		this.anInt5020 = arg1;
		this.anInt5032 = arg2;
		this.anInt5040 = arg3;
		this.method4270();
	}

	@OriginalMember(owner = "client!ql", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt5037) {
			arg2 = this.anInt5037;
		}
		if (arg3 > this.anInt5039) {
			arg3 = this.anInt5039;
		}
		this.anInt5021 = arg0;
		this.anInt5030 = arg2;
		this.anInt5016 = arg1;
		this.anInt5018 = arg3;
		this.method4270();
	}

	@OriginalMember(owner = "client!ql", name = "r", descriptor = "()Z")
	@Override
	public final boolean method5323() {
		return true;
	}

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "()Z")
	@Override
	public final boolean method5327() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "k", descriptor = "(I)Z")
	public final boolean method4277(@OriginalArg(0) int arg0) {
		return super.anInterface4_11.method3088(arg0).aBoolean489;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V")
	@Override
	public void method5336(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public abstract void method5304(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "()Z")
	@Override
	public final boolean method5301() {
		return false;
	}

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "()I")
	@Override
	public final int method5329() {
		return 0;
	}

	@OriginalMember(owner = "client!ql", name = "l", descriptor = "(I)I")
	public final int method4278(@OriginalArg(0) int arg0) {
		return super.anInterface4_11.method3088(arg0).aShort56 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ql", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt5021 = 0;
		this.anInt5016 = 0;
		this.anInt5030 = this.anInt5037;
		this.anInt5018 = this.anInt5039;
		this.method4270();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method5291(@OriginalArg(0) Class255 arg0) {
		this.aClass255_Sub2_7 = (Class255_Sub2) arg0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)I")
	@Override
	public final int method5315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ql", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class93_Sub2 local2 = (Class93_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray452;
		@Pc(8) int[] local8 = local2.anIntArray453;
		@Pc(20) int local20;
		if (this.anInt5018 < arg3 + local5.length) {
			local20 = this.anInt5018 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt5016 > arg3) {
			local33 = this.anInt5016 - arg3;
			arg3 = this.anInt5016;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt5037;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt5021 > local58) {
				local62 -= this.anInt5021 - local58;
				local58 = this.anInt5021;
			}
			if (this.anInt5030 < local58 + local62) {
				local62 = this.anInt5030 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray309[local58++] = arg0;
			}
			local49 += this.anInt5037;
		}
	}

	@OriginalMember(owner = "client!ql", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt5022 = (int) (arg1 * 65535.0F);
		this.anInt5023 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt5038 = (int) (arg3 * 65535.0F / local26);
		this.anInt5045 = (int) (arg4 * 65535.0F / local26);
		this.anInt5028 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return 0;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "()V")
	@Override
	public final void method5276() {
	}

	@OriginalMember(owner = "client!ql", name = "h", descriptor = "()Z")
	public abstract boolean method5289();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIF)Lclient!pn;")
	@Override
	public final Class3_Sub28 method5331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ql", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5044 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt5044 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt5044 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt5044 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt5044 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean429 = false;
		} else {
			this.aBoolean429 = true;
		}
	}

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "()V")
	@Override
	protected final void method5305() {
		if (this.aBoolean426) {
			Static455.method7048(true, false);
			this.aBoolean426 = false;
		}
		this.aClass3_Sub2_3 = null;
		this.aCanvas8 = null;
		this.aClass25_20 = null;
		this.aBoolean425 = true;
	}

	@OriginalMember(owner = "client!ql", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt5021) {
			arg2 -= this.anInt5021 - arg0;
			arg0 = this.anInt5021;
		}
		if (arg1 < this.anInt5016) {
			arg3 -= this.anInt5016 - arg1;
			arg1 = this.anInt5016;
		}
		if (arg0 + arg2 > this.anInt5030) {
			arg2 = this.anInt5030 - arg0;
		}
		if (arg1 + arg3 > this.anInt5018) {
			arg3 = this.anInt5018 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt5030 || arg1 > this.anInt5018) {
			return;
		}
		@Pc(67) int local67 = this.anInt5037 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt5037;
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
						local217 = this.anIntArray309[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray309[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray309[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray309[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray309[arg2] = arg4;
					arg2++;
					this.anIntArray309[arg2] = arg4;
					arg2++;
					this.anIntArray309[arg2] = arg4;
					arg2++;
					this.anIntArray309[arg2] = arg4;
					arg2++;
					this.anIntArray309[arg2] = arg4;
					arg2++;
					this.anIntArray309[arg2] = arg4;
					arg2++;
					this.anIntArray309[arg2] = arg4;
					arg2++;
					this.anIntArray309[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray309[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!fca;IIII)Lclient!ba;")
	public abstract Class21 method5352(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "()V")
	public abstract void method5303();

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)V")
	@Override
	public final void method5318(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt5014;
		for (@Pc(9) Object local9 = this.aClass211_37.method5533(); local9 != null; local9 = this.aClass211_37.method5541()) {
			@Pc(13) Class3_Sub24 local13 = (Class3_Sub24) local9;
			if (local13.aBoolean349) {
				local13.anInt4576 += local4;
				@Pc(27) int local27 = local13.anInt4576 / 20;
				if (local27 > 0) {
					@Pc(36) Class178 local36 = super.anInterface4_11.method3088(local13.anInt4575);
					local13.method3859(local36.aByte56 * local4 * 50 / 1000, local36.aByte55 * local4 * 50 / 1000);
					local13.anInt4576 -= local27 * 20;
				}
				local13.aBoolean349 = false;
			}
		}
		this.anInt5014 = arg0;
		this.aClass211_38.method5538(5);
		this.aClass211_37.method5538(5);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	@Override
	public final void method5296(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!ht;I)V")
	public abstract void method5310(@OriginalArg(0) Class21[] arg0, @OriginalArg(1) Class255 arg1, @OriginalArg(2) Class55_Sub3[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!aw;Z)Lclient!xa;")
	@Override
	public final Class37 method5275(@OriginalArg(0) Class20 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray22;
		@Pc(5) byte[] local5 = arg0.aByteArray5;
		@Pc(8) int local8 = arg0.anInt707;
		@Pc(11) int local11 = arg0.anInt706;
		@Pc(76) Class37_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray6 == null) {
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
			local76 = new Class37_Sub2_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray6;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class37_Sub2_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class37_Sub2_Sub3(this, local20, local8, local11);
			}
		}
		local76.EA(arg0.anInt705, arg0.anInt708, arg0.anInt704, arg0.anInt709);
		return local76;
	}

	@OriginalMember(owner = "client!ql", name = "D", descriptor = "(I)V")
	@Override
	public final void D(@OriginalArg(0) int arg0) {
		this.C(0, 0, this.anInt5037, this.anInt5039, arg0, 0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!kn;Lclient!kn;FLclient!kn;)Lclient!kn;")
	@Override
	public final Class108 method5298(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Class108 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class108 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class93 method5307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class93_Sub2(arg0, arg1, arg2, arg3);
	}
}
