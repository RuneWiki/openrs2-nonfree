import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class26_Sub2 extends Class26 {

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
	private int anInt2877;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "Lclient!ci;")
	private Class2_Sub11 aClass2_Sub11_1;

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas5;

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
	public int anInt2878;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
	public int anInt2879;

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
	public int anInt2887;

	@OriginalMember(owner = "client!hh", name = "L", descriptor = "[Lclient!lf;")
	private Class146[] aClass146Array1;

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
	private int anInt2888;

	@OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
	public int anInt2889;

	@OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
	public int anInt2893;

	@OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
	public int anInt2895;

	@OriginalMember(owner = "client!hh", name = "V", descriptor = "Lclient!f;")
	private Class76 aClass76_9;

	@OriginalMember(owner = "client!hh", name = "W", descriptor = "F")
	private float aFloat92;

	@OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
	public int anInt2897;

	@OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
	public int anInt2898;

	@OriginalMember(owner = "client!hh", name = "db", descriptor = "[I")
	public int[] anIntArray203;

	@OriginalMember(owner = "client!hh", name = "eb", descriptor = "F")
	private float aFloat93;

	@OriginalMember(owner = "client!hh", name = "jb", descriptor = "I")
	public int anInt2904;

	@OriginalMember(owner = "client!hh", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!hh", name = "nb", descriptor = "I")
	public int anInt2907;

	@OriginalMember(owner = "client!hh", name = "ob", descriptor = "Z")
	public boolean aBoolean261;

	@OriginalMember(owner = "client!hh", name = "pb", descriptor = "Lclient!f;")
	private Class76 aClass76_10;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "Z")
	private boolean aBoolean258;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "Z")
	private boolean aBoolean257;

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "Lclient!ub;")
	private Class240 aClass240_11;

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
	public int anInt2880;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	public int anInt2885;

	@OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
	public int anInt2884;

	@OriginalMember(owner = "client!hh", name = "F", descriptor = "Z")
	private boolean aBoolean259;

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
	public int anInt2886;

	@OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
	private int anInt2883;

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
	private int anInt2890;

	@OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
	private int anInt2892;

	@OriginalMember(owner = "client!hh", name = "U", descriptor = "I")
	public int anInt2896;

	@OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
	public int anInt2894;

	@OriginalMember(owner = "client!hh", name = "X", descriptor = "Z")
	public boolean aBoolean260;

	@OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
	public int anInt2899;

	@OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
	public int anInt2900;

	@OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
	public int anInt2902;

	@OriginalMember(owner = "client!hh", name = "fb", descriptor = "I")
	public int anInt2901;

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
	public int anInt2882;

	@OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
	public int anInt2891;

	@OriginalMember(owner = "client!hh", name = "hb", descriptor = "I")
	public int anInt2903;

	@OriginalMember(owner = "client!hh", name = "kb", descriptor = "I")
	public int anInt2905;

	@OriginalMember(owner = "client!hh", name = "mb", descriptor = "I")
	private int anInt2906;

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
	public int anInt2881;

	@OriginalMember(owner = "client!hh", name = "Y", descriptor = "Lclient!jp;")
	private final Class129 aClass129_23;

	@OriginalMember(owner = "client!hh", name = "qb", descriptor = "I")
	private int anInt2908;

	@OriginalMember(owner = "client!hh", name = "ib", descriptor = "Lclient!jp;")
	private final Class129 aClass129_24;

	@OriginalMember(owner = "client!hh", name = "G", descriptor = "Lclient!gu;")
	public Class102_Sub1 aClass102_Sub1_2;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(ILclient!m;)V")
	private Class26_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
		super(arg0, arg1);
		this.aBoolean258 = false;
		this.aBoolean257 = false;
		this.aClass240_11 = new Class240(4);
		this.anInt2880 = 512;
		this.anInt2885 = 0;
		this.anInt2884 = 0;
		this.aBoolean259 = false;
		this.anInt2886 = 3500;
		this.anInt2883 = 0;
		this.anInt2890 = 0;
		this.anInt2892 = 0;
		this.anInt2896 = 50;
		this.anInt2894 = 0;
		this.aBoolean260 = false;
		this.anInt2899 = 0;
		this.anInt2900 = 45823;
		this.anInt2902 = 78642;
		this.anInt2901 = 512;
		this.anInt2882 = 75518;
		this.anInt2891 = 0;
		this.anInt2903 = 0;
		this.anInt2905 = 0;
		this.anInt2906 = 3500;
		this.anInt2881 = this.anInt2906 - 255;
		this.aClass129_23 = new Class129(16);
		this.anInt2908 = -1;
		this.aClass129_24 = new Class129(20);
		this.aClass102_Sub1_2 = new Class102_Sub1();
		this.method2234(1);
		this.method2256(0);
		Static36.method660(false);
		this.aBoolean257 = true;
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!m;)V")
	public Class26_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface8 arg2) {
		this(arg0, arg2);
		this.method2221(arg1);
		this.method2229(arg1);
	}

	@OriginalMember(owner = "client!hh", name = "FA", descriptor = "()I")
	@Override
	public int FA() {
		return 0;
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "()Z")
	@Override
	public boolean method2225() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "()Z")
	@Override
	public boolean method2246() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2890 = this.anInt2891;
		this.anInt2885 = arg0;
		this.anInt2891 = arg1;
		this.anInt2894 = arg2;
		this.aBoolean260 = true;
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(IIIIII)Lclient!to;")
	@Override
	public Class21 method2289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "()I")
	@Override
	public int g() {
		@Pc(2) int local2 = this.anInt2883;
		this.anInt2883 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hh", name = "la", descriptor = "()F")
	@Override
	public float la() {
		return this.aFloat93;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
	@Override
	public void method2253(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "ia", descriptor = "(III[I)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass102_Sub1_2.anInt2740 + (this.aClass102_Sub1_2.anInt2735 * arg0 + this.aClass102_Sub1_2.anInt2732 * arg1 + this.aClass102_Sub1_2.anInt2741 * arg2 >> 15);
		if (local23 < this.anInt2896 || local23 > this.anInt2906) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt2880 * (this.aClass102_Sub1_2.anInt2733 + (this.aClass102_Sub1_2.anInt2736 * arg0 + this.aClass102_Sub1_2.anInt2743 * arg1 + this.aClass102_Sub1_2.anInt2742 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt2901 * (this.aClass102_Sub1_2.anInt2739 + (this.aClass102_Sub1_2.anInt2734 * arg0 + this.aClass102_Sub1_2.anInt2737 * arg1 + this.aClass102_Sub1_2.anInt2738 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt2879 && local73 <= this.anInt2878 && local102 >= this.anInt2897 && local102 <= this.lb) {
			arg3[0] = local73 - this.anInt2879;
			arg3[1] = local102 - this.anInt2897;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!to;)V")
	@Override
	public void method2283(@OriginalArg(0) Class21 arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "()V")
	private void method2293() {
		if (this.aFloat92 == 0.0F) {
			this.anInt2886 = this.anInt2906;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt2906;
		@Pc(12) float local12 = (float) this.anInt2896;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat93 / (this.aFloat92 + this.aFloat93);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat92;
		this.anInt2886 = (int) (((float) this.anInt2906 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "()V")
	@Override
	public void method2220() {
		if (this.aCanvas5 == null || this.aClass2_Sub11_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			this.aClass2_Sub11_1.method5826(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!hh", name = "aa", descriptor = "(IIIIII[BII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt2887;
		@Pc(35) int local35 = this.anInt2887 - arg2;
		if (arg1 + arg3 > this.anInt2899) {
			arg3 -= arg1 + arg3 - this.anInt2899;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt2905) {
			local59 = this.anInt2905 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt2887;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt2884) {
			local59 = arg0 + arg2 - this.anInt2884;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt2903) {
			local59 = this.anInt2903 - arg0;
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
						this.anIntArray203[local30++] = arg4;
					} else {
						this.anIntArray203[local30++] = arg5;
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
					local245 = this.anIntArray203[local30];
					this.anIntArray203[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray203[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray203[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!wp;IIII)Lclient!c;")
	@Override
	public Class32 method2227(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class32_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
	@Override
	public void method2248(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Lclient!l;")
	@Override
	public Class2_Sub3 method2242() {
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!c;Lclient!pm;Lclient!ia;Lclient!fo;I)V")
	@Override
	public void method2218(@OriginalArg(0) Class32 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) Class38_Sub4 arg3) {
		((Class32_Sub1) arg0).method2170(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	@Override
	public void method2234(@OriginalArg(0) int arg0) {
		if (this.anInt2889 == arg0) {
			return;
		}
		this.anInt2889 = arg0;
		this.aClass146Array1 = new Class146[this.anInt2889];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2889; local14++) {
			this.aClass146Array1[local14] = new Class146(this);
		}
	}

	@OriginalMember(owner = "client!hh", name = "S", descriptor = "()V")
	@Override
	public void S() {
		this.anInt2891 = this.anInt2890;
		this.aBoolean260 = false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([Lclient!c;Lclient!ia;[Lclient!fo;I)V")
	@Override
	public void method2291(@OriginalArg(0) Class32[] arg0, @OriginalArg(1) Class102 arg1, @OriginalArg(2) Class38_Sub4[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class32_Sub1[] local3 = new Class32_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class32_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class32_Sub1 local26 = Static146.method2163(this, local3);
		local26.method2170(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "()Lclient!ia;")
	@Override
	public Class102 method2286() {
		return new Class102_Sub1();
	}

	@OriginalMember(owner = "client!hh", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt2903 = 0;
		this.anInt2905 = 0;
		this.anInt2884 = this.anInt2887;
		this.anInt2899 = this.anInt2888;
		this.method2295();
	}

	@OriginalMember(owner = "client!hh", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2885 = arg0;
		this.anInt2891 = arg1;
		this.anInt2894 = arg2;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ep;III)V")
	public void method2294(@OriginalArg(0) Class38_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt1736;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.O(arg1, arg2, local6, arg0.anInt1735, 1);
			return;
		}
		if (this.anInt2908 != local2) {
			@Pc(30) Class76 local30 = (Class76) this.aClass129_23.method3023((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method2296(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method2299(local2) ? 64 : 128;
				local30 = this.method2257(local36, local46, local46, local46);
				this.aClass129_23.method3029(local30, (long) local2);
			}
			this.anInt2908 = local2;
			this.aClass76_10 = local30;
		}
		if (this.aClass76_10.ja() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass76_10.M(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt1735, 1);
	}

	@OriginalMember(owner = "client!hh", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt2905 || arg1 >= this.anInt2899) {
			return;
		}
		if (arg0 < this.anInt2903) {
			arg2 -= this.anInt2903 - arg0;
			arg0 = this.anInt2903;
		}
		if (arg0 + arg2 > this.anInt2884) {
			arg2 = this.anInt2884 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2887;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray203[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray203[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray203[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray203[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray203[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "()Z")
	@Override
	public boolean method2238() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "()V")
	private void method2295() {
		this.anInt2879 = this.anInt2903 - this.anInt2904;
		this.anInt2878 = this.anInt2884 - this.anInt2904;
		this.anInt2897 = this.anInt2905 - this.anInt2907;
		this.lb = this.anInt2899 - this.anInt2907;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2889; local29++) {
			@Pc(36) Class3 local36 = this.aClass146Array1[local29].aClass3_2;
			local36.anInt81 = this.anInt2904 - this.anInt2903;
			local36.anInt82 = this.anInt2907 - this.anInt2905;
			local36.anInt79 = this.anInt2884 - this.anInt2903;
			local36.anInt83 = this.anInt2899 - this.anInt2905;
		}
		@Pc(78) int local78 = this.anInt2905 * this.anInt2887 + this.anInt2903;
		for (@Pc(81) int local81 = this.anInt2905; local81 < this.anInt2899; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt2889; local84++) {
				this.aClass146Array1[local84].aClass3_2.anIntArray3[local81 - this.anInt2905] = local78;
			}
			local78 += this.anInt2887;
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([Lclient!c;Lclient!pm;Lclient!ia;[Lclient!fo;I)V")
	@Override
	public void method2241(@OriginalArg(0) Class32[] arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) Class102 arg2, @OriginalArg(3) Class38_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class32_Sub1[] local3 = new Class32_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class32_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class32_Sub1 local26 = Static146.method2163(this, local3);
		local26.method2170(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "(I)[I")
	private int[] method2296(@OriginalArg(0) int arg0) {
		@Pc(2) Class129 local2 = this.aClass129_24;
		@Pc(12) Class2_Sub19 local12;
		synchronized (this.aClass129_24) {
			local12 = (Class2_Sub19) this.aClass129_24.method3023((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_5.method3835(arg0)) {
					return null;
				}
				@Pc(32) Class178 local32 = super.anInterface8_5.method3836(arg0);
				@Pc(42) int local42 = local32.aBoolean432 || this.aBoolean259 ? 64 : 128;
				local12 = new Class2_Sub19(arg0, local42, super.anInterface8_5.method3834(0.7F, local42, local42, arg0), local32.aBoolean440);
				this.aClass129_24.method3029(local12, (long) arg0);
			}
		}
		local12.aBoolean238 = true;
		return local12.method2006();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2221(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub11 local8 = (Class2_Sub11) this.aClass240_11.method5439((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static333.method4740(arg0);
			this.aClass240_11.method5430((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface8_5.method3836(arg5).aBoolean436) {
			this.O(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt2908 != arg5) {
			@Pc(26) Class76 local26 = (Class76) this.aClass129_23.method3023((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method2296(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method2299(arg5) ? 64 : 128;
				local26 = this.method2257(local32, local43, local43, local43);
				this.aClass129_23.method3029(local26, (long) arg5);
			}
			this.anInt2908 = arg5;
			this.aClass76_10 = local26;
		}
		this.aClass76_10.M(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "(I)Z")
	public boolean method2298(@OriginalArg(0) int arg0) {
		return super.anInterface8_5.method3836(arg0).aBoolean435;
	}

	@OriginalMember(owner = "client!hh", name = "M", descriptor = "(I)V")
	@Override
	public void M(@OriginalArg(0) int arg0) {
		this.NA(0, 0, this.anInt2887, this.anInt2888, arg0, 0);
	}

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "(I)Z")
	public boolean method2299(@OriginalArg(0) int arg0) {
		return this.aBoolean259 || super.anInterface8_5.method3836(arg0).aBoolean432;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method2262() {
		@Pc(3) Class146 local3 = this.method2302(Thread.currentThread());
		@Pc(6) Class3 local6 = local3.aClass3_2;
		local6.aBoolean9 = false;
		local6.aBoolean9 = false;
		local6.anInt80 = 0;
		local6.aBoolean7 = true;
		local6.method67(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean9 = true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIILclient!ea;II)V")
	@Override
	public void method2222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class14 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class14_Sub1 local2 = (Class14_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray23;
		@Pc(8) int[] local8 = local2.anIntArray24;
		@Pc(17) int local17 = this.anInt2905 > arg7 ? this.anInt2905 : arg7;
		@Pc(32) int local32 = this.anInt2899 < arg7 + local5.length ? this.anInt2899 : arg7 + local5.length;
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
					if (local129 >= this.anInt2903 && local129 < this.anInt2884 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray203[local129 + arg1 * this.anInt2887] = arg4;
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
					if (local133 >= this.anInt2903 && local133 < this.anInt2884 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt2887;
						local248 = this.anIntArray203[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray203[local133 + arg1 * this.anInt2887] = local201 + local584;
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
		if (arg0 < this.anInt2903) {
			arg1 += local83 * (this.anInt2903 - arg0);
			arg0 = this.anInt2903;
		}
		if (arg2 >= this.anInt2884) {
			arg2 = this.anInt2884 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray203[arg0 + local129 * this.anInt2887] = arg4;
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
					local243 = arg0 + local133 * this.anInt2887;
					local248 = this.anIntArray203[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray203[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "()Z")
	@Override
	public boolean method2276() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "v", descriptor = "()Z")
	@Override
	public boolean method2279() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II[[I[[IIII)Lclient!na;")
	@Override
	public Class106 method2280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class106_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "()Z")
	@Override
	public boolean method2273() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "()Z")
	@Override
	public boolean method2224() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "ua", descriptor = "(F)V")
	@Override
	public void ua(@OriginalArg(0) float arg0) {
		this.anInt2882 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "()I")
	@Override
	public int d() {
		return this.anInt2896;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(FFF)V")
	@Override
	public void method2219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hh", name = "IA", descriptor = "(IIII)[I")
	@Override
	public int[] IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt2887 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray203[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method2260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.U(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.U(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt2903) {
					arg1 += local104 * (this.anInt2903 - arg0);
					arg0 = this.anInt2903;
				}
				if (arg2 >= this.anInt2884) {
					arg2 = this.anInt2884 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2905 && local150 < this.anInt2899) {
							this.anIntArray203[arg0 + local150 * this.anInt2887] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt2905 && local213 < this.anInt2899) {
							local228 = arg0 + local213 * this.anInt2887;
							local233 = this.anIntArray203[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray203[local228] = local204 + local233;
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
				if (arg1 < this.anInt2905) {
					arg0 += local104 * (this.anInt2905 - arg1);
					arg1 = this.anInt2905;
				}
				if (arg3 >= this.anInt2899) {
					arg3 = this.anInt2899 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2903 && local150 < this.anInt2884) {
							this.anIntArray203[local150 + arg1 * this.anInt2887] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt2903 && local213 < this.anInt2884) {
							local228 = local213 + arg1 * this.anInt2887;
							local233 = this.anIntArray203[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray203[local213 + arg1 * this.anInt2887] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.da(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.da(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
	@Override
	public int method2259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)I")
	@Override
	public int method2285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!to;Lclient!to;FLclient!to;)Lclient!to;")
	@Override
	public Class21 method2251(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class21 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class21 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "()Z")
	@Override
	public boolean method2290() {
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "(FF)V")
	@Override
	public void o(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat93 = arg0;
		this.aFloat92 = arg1;
		this.method2293();
	}

	@OriginalMember(owner = "client!hh", name = "s", descriptor = "()Z")
	@Override
	public boolean method2272() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "()Z")
	@Override
	public boolean method2263() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "()V")
	@Override
	protected void method2269() {
		if (this.aBoolean257) {
			Static6.method149(false);
			this.aBoolean257 = false;
		}
		this.aClass2_Sub11_1 = null;
		this.aCanvas5 = null;
		this.aClass240_11 = null;
		this.aBoolean258 = true;
	}

	@OriginalMember(owner = "client!hh", name = "pa", descriptor = "(IIII)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2887) {
			arg2 = this.anInt2887;
		}
		if (arg3 > this.anInt2888) {
			arg3 = this.anInt2888;
		}
		this.anInt2903 = arg0;
		this.anInt2884 = arg2;
		this.anInt2905 = arg1;
		this.anInt2899 = arg3;
		this.method2295();
	}

	@OriginalMember(owner = "client!hh", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2904 = arg0;
		this.anInt2907 = arg1;
		this.anInt2880 = arg2;
		this.anInt2901 = arg3;
		this.method2295();
	}

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "()V")
	@Override
	public void method2271() {
		this.aClass129_24.method3025();
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
	@Override
	public void method2250(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2877;
		for (@Pc(9) Object local9 = this.aClass129_24.method3030(); local9 != null; local9 = this.aClass129_24.method3027()) {
			@Pc(13) Class2_Sub19 local13 = (Class2_Sub19) local9;
			if (local13.aBoolean238) {
				local13.anInt2691 += local4;
				@Pc(27) int local27 = local13.anInt2691 / 20;
				if (local27 > 0) {
					@Pc(36) Class178 local36 = super.anInterface8_5.method3836(local13.anInt2690);
					local13.method2007(local36.aByte56 * local4 * 50 / 1000, local36.aByte55 * local4 * 50 / 1000);
					local13.anInt2691 -= local27 * 20;
				}
				local13.aBoolean238 = false;
			}
		}
		this.anInt2877 = arg0;
		this.aClass129_23.method3028(5);
	}

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "(ILclient!ea;II)V")
	@Override
	public void j(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class14_Sub1 local2 = (Class14_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray23;
		@Pc(8) int[] local8 = local2.anIntArray24;
		@Pc(20) int local20;
		if (this.anInt2899 < arg3 + local5.length) {
			local20 = this.anInt2899 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt2905 > arg3) {
			local33 = this.anInt2905 - arg3;
			arg3 = this.anInt2905;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt2887;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt2903 > local58) {
				local62 -= this.anInt2903 - local58;
				local58 = this.anInt2903;
			}
			if (this.anInt2884 < local58 + local62) {
				local62 = this.anInt2884 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray203[local58++] = arg0;
			}
			local49 += this.anInt2887;
		}
	}

	@OriginalMember(owner = "client!hh", name = "JA", descriptor = "(II)V")
	@Override
	public void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2896 = arg0;
		this.anInt2906 = arg1;
		this.anInt2881 = this.anInt2906 - 255;
		this.method2293();
	}

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "()Z")
	@Override
	public boolean method2240() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "()V")
	@Override
	public void method2268() {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method2217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class146 local3 = this.method2302(Thread.currentThread());
		@Pc(6) Class3 local6 = local3.aClass3_2;
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
		@Pc(93) int local93 = arg0 - local6.method66();
		@Pc(98) int local98 = arg1 - local6.method57();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt80 = 0;
		local6.aBoolean7 = local102 < 0 || local102 > local6.anInt79 || local106 < 0 || local106 > local6.anInt79 || local112 < 0 || local112 > local6.anInt79;
		local6.method58(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean7 = local102 < 0 || local102 > local6.anInt79 || local106 < 0 || local106 > local6.anInt79 || local118 < 0 || local118 > local6.anInt79;
		local6.method58(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "()Z")
	@Override
	public boolean method2267() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!pm;)V")
	@Override
	public void method2252(@OriginalArg(0) Class192 arg0) {
		@Pc(3) Class38_Sub2 local3 = arg0.aClass114_1.aClass38_Sub2_7;
		for (@Pc(6) Class38_Sub2 local6 = local3.aClass38_Sub2_5; local6 != local3; local6 = local6.aClass38_Sub2_5) {
			@Pc(10) Class38_Sub2_Sub1 local10 = (Class38_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt1739 >> 12;
			@Pc(20) int local20 = local10.anInt1737 >> 12;
			@Pc(25) int local25 = local10.anInt1734 >> 12;
			@Pc(49) int local49 = this.aClass102_Sub1_2.anInt2740 + (this.aClass102_Sub1_2.anInt2735 * local15 + this.aClass102_Sub1_2.anInt2732 * local20 + this.aClass102_Sub1_2.anInt2741 * local25 >> 15);
			if (local49 >= this.anInt2896 && local49 <= this.anInt2881) {
				@Pc(90) int local90 = this.anInt2904 + this.anInt2880 * (this.aClass102_Sub1_2.anInt2733 + (this.aClass102_Sub1_2.anInt2736 * local15 + this.aClass102_Sub1_2.anInt2743 * local20 + this.aClass102_Sub1_2.anInt2742 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt2907 + this.anInt2901 * (this.aClass102_Sub1_2.anInt2739 + (this.aClass102_Sub1_2.anInt2734 * local15 + this.aClass102_Sub1_2.anInt2737 * local20 + this.aClass102_Sub1_2.anInt2738 * local25 >> 15)) / local49;
				if (local90 >= this.anInt2903 && local90 <= this.anInt2884 && local122 >= this.anInt2905 && local122 <= this.anInt2899) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method2294(local10, local90, local122, (local10.anInt1738 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "E", descriptor = "()V")
	private void method2300() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2889; local1++) {
			this.aClass146Array1[local1].method3421();
		}
		this.va();
	}

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "()F")
	@Override
	public float w() {
		return this.aFloat92;
	}

	@OriginalMember(owner = "client!hh", name = "NA", descriptor = "(IIIIII)V")
	@Override
	public void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt2903) {
			arg2 -= this.anInt2903 - arg0;
			arg0 = this.anInt2903;
		}
		if (arg1 < this.anInt2905) {
			arg3 -= this.anInt2905 - arg1;
			arg1 = this.anInt2905;
		}
		if (arg0 + arg2 > this.anInt2884) {
			arg2 = this.anInt2884 - arg0;
		}
		if (arg1 + arg3 > this.anInt2899) {
			arg3 = this.anInt2899 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt2884 || arg1 > this.anInt2899) {
			return;
		}
		@Pc(67) int local67 = this.anInt2887 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt2887;
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
						local221 = this.anIntArray203[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray203[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray203[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray203[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray203[arg2] = arg4;
					arg2++;
					this.anIntArray203[arg2] = arg4;
					arg2++;
					this.anIntArray203[arg2] = arg4;
					arg2++;
					this.anIntArray203[arg2] = arg4;
					arg2++;
					this.anIntArray203[arg2] = arg4;
					arg2++;
					this.anIntArray203[arg2] = arg4;
					arg2++;
					this.anIntArray203[arg2] = arg4;
					arg2++;
					this.anIntArray203[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray203[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "(I)[I")
	public int[] method2301(@OriginalArg(0) int arg0) {
		@Pc(2) Class129 local2 = this.aClass129_24;
		@Pc(12) Class2_Sub19 local12;
		synchronized (this.aClass129_24) {
			local12 = (Class2_Sub19) this.aClass129_24.method3023((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_5.method3835(arg0)) {
					return null;
				}
				@Pc(32) Class178 local32 = super.anInterface8_5.method3836(arg0);
				@Pc(42) int local42 = local32.aBoolean432 || this.aBoolean259 ? 64 : 128;
				local12 = new Class2_Sub19(arg0, local42, super.anInterface8_5.method3832(0.7F, arg0, true, local42, local42), local32.aBoolean440);
				this.aClass129_24.method3029(local12, (long) arg0);
			}
		}
		local12.aBoolean238 = true;
		return local12.method2006();
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "()Z")
	@Override
	public boolean method2228() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIF)Lclient!or;")
	@Override
	public Class2_Sub7 method2275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!re;[Lclient!fq;Z)Lclient!oa;")
	@Override
	public Class56 method2231(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class89[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2413;
			local7[local11] = arg1[local11].anInt2412;
			if (arg1[local11].aByteArray65 != null) {
			}
		}
		return new Class56_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!hh", name = "Z", descriptor = "(IIII)V")
	@Override
	public void Z(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2903 < arg0) {
			this.anInt2903 = arg0;
		}
		if (this.anInt2905 < arg1) {
			this.anInt2905 = arg1;
		}
		if (this.anInt2884 > arg2) {
			this.anInt2884 = arg2;
		}
		if (this.anInt2899 > arg3) {
			this.anInt2899 = arg3;
		}
		this.method2295();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!lf;")
	public Class146 method2302(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2889; local1++) {
			if (this.aClass146Array1[local1].aRunnable1 == arg0) {
				return this.aClass146Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hh", name = "XA", descriptor = "(IFFFFF)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt2900 = (int) (arg1 * 65535.0F);
		this.anInt2902 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt2893 = (int) (arg3 * 65535.0F / local26);
		this.anInt2895 = (int) (arg4 * 65535.0F / local26);
		this.anInt2898 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V")
	@Override
	public void method2270(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2287(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas5 == arg0) {
			this.method2229(null);
		}
		@Pc(15) Class2_Sub11 local15 = (Class2_Sub11) this.aClass240_11.method5439((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6072();
		}
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2264(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub11 local8 = (Class2_Sub11) this.aClass240_11.method5439((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method6072();
		local8 = Static333.method4740(arg0);
		this.aClass240_11.method5430((long) arg0.hashCode(), local8);
		if (this.aCanvas5 != arg0 || this.aClass76_9 != null) {
			return;
		}
		this.aClass2_Sub11_1 = local8;
		this.anIntArray203 = local8.anIntArray501;
		this.anInt2887 = local8.anInt7514;
		this.anInt2888 = local8.anInt7512;
		this.method2300();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!fq;Z)Lclient!f;")
	@Override
	public Class76 method2230(@OriginalArg(0) Class89 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray139;
		@Pc(5) byte[] local5 = arg0.aByteArray66;
		@Pc(8) int local8 = arg0.anInt2413;
		@Pc(11) int local11 = arg0.anInt2412;
		@Pc(76) Class76_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray65 == null) {
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
			local76 = new Class76_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray65;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class76_Sub1_Sub2(this, local20, local8, local11);
				local76 = new Class76_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class76_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.ka(arg0.anInt2409, arg0.anInt2410, arg0.anInt2411, arg0.anInt2408);
		return local76;
	}

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "()I")
	@Override
	public int method2281() {
		return 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class76 method2257(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class76_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class76_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class76_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class76_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "(I)I")
	public int method2303(@OriginalArg(0) int arg0) {
		return super.anInterface8_5.method3836(arg0).aShort60 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "()V")
	@Override
	public void method2284() {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method2233(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas5 == null || this.aClass2_Sub11_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas5.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt2887 && local21.y <= this.anInt2888 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass2_Sub11_1.method5825(local14, local21.y, local21.x, local21.height, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas5.repaint();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
	@Override
	public void method2249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "(Lclient!ia;)V")
	@Override
	public void m(@OriginalArg(0) Class102 arg0) {
		this.aClass102_Sub1_2 = (Class102_Sub1) arg0;
	}

	@OriginalMember(owner = "client!hh", name = "k", descriptor = "()Z")
	@Override
	public boolean method2243() {
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "(I)Z")
	public boolean method2304(@OriginalArg(0) int arg0) {
		return super.anInterface8_5.method3835(arg0);
	}

	@OriginalMember(owner = "client!hh", name = "V", descriptor = "(III)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2891 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt2891 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt2891 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt2891 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt2891 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean261 = false;
		} else {
			this.aBoolean261 = true;
		}
	}

	@OriginalMember(owner = "client!hh", name = "W", descriptor = "()I")
	@Override
	public int W() {
		return this.anInt2906;
	}

	@OriginalMember(owner = "client!hh", name = "F", descriptor = "()Z")
	public boolean method2305() {
		return this.aBoolean258;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[Lclient!or;)V")
	@Override
	public void method2265(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7[] arg1) {
	}

	@OriginalMember(owner = "client!hh", name = "SA", descriptor = "(IIIIII)Z")
	@Override
	public boolean SA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass102_Sub1_2.anInt2735 * arg0 + this.aClass102_Sub1_2.anInt2732 * arg1 + this.aClass102_Sub1_2.anInt2741 * arg2 >> 15) + this.aClass102_Sub1_2.anInt2740;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass102_Sub1_2.anInt2735 * arg3 + this.aClass102_Sub1_2.anInt2732 * arg4 + this.aClass102_Sub1_2.anInt2741 * arg5 >> 15) + this.aClass102_Sub1_2.anInt2740;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt2896 && local52 < this.anInt2896 || !(local23 <= this.anInt2906 || local52 <= this.anInt2906)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt2880 * ((this.aClass102_Sub1_2.anInt2736 * arg0 + this.aClass102_Sub1_2.anInt2743 * arg1 + this.aClass102_Sub1_2.anInt2742 * arg2 >> 15) + this.aClass102_Sub1_2.anInt2733) / local23;
		@Pc(133) int local133 = this.anInt2880 * ((this.aClass102_Sub1_2.anInt2736 * arg3 + this.aClass102_Sub1_2.anInt2743 * arg4 + this.aClass102_Sub1_2.anInt2742 * arg5 >> 15) + this.aClass102_Sub1_2.anInt2733) / local52;
		if (local104 < this.anInt2879 && local133 < this.anInt2879 || local104 > this.anInt2878 && local133 > this.anInt2878) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt2901 * ((this.aClass102_Sub1_2.anInt2734 * arg0 + this.aClass102_Sub1_2.anInt2737 * arg1 + this.aClass102_Sub1_2.anInt2738 * arg2 >> 15) + this.aClass102_Sub1_2.anInt2739) / local23;
			@Pc(209) int local209 = this.anInt2901 * ((this.aClass102_Sub1_2.anInt2734 * arg3 + this.aClass102_Sub1_2.anInt2737 * arg4 + this.aClass102_Sub1_2.anInt2738 * arg5 >> 15) + this.aClass102_Sub1_2.anInt2739) / local52;
			return (local180 >= this.anInt2897 || local209 >= this.anInt2897) && (local180 <= this.lb || local209 <= this.lb);
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "()Lclient!ia;")
	@Override
	public Class102 method2223() {
		@Pc(3) Class146 local3 = this.method2302(Thread.currentThread());
		return local3.aClass102_Sub1_3;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II[I[I)Lclient!ea;")
	@Override
	public Class14 method2232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class14_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "([I)V")
	@Override
	public void u(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2903;
		arg0[1] = this.anInt2905;
		arg0[2] = this.anInt2884;
		arg0[3] = this.anInt2899;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method2247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.da(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.da(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "()V")
	@Override
	public void method2239() {
	}

	@OriginalMember(owner = "client!hh", name = "da", descriptor = "(IIIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt2903 || arg0 >= this.anInt2884) {
			return;
		}
		if (arg1 < this.anInt2905) {
			arg2 -= this.anInt2905 - arg1;
			arg1 = this.anInt2905;
		}
		if (arg1 + arg2 > this.anInt2899) {
			arg2 = this.anInt2899 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2887;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray203[local40 + local54 * this.anInt2887] = arg3;
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
				local111 = local40 + local103 * this.anInt2887;
				local116 = this.anIntArray203[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray203[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt2887;
				local111 = this.anIntArray203[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray203[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!l;)V")
	@Override
	public void method2226(@OriginalArg(0) Class2_Sub3 arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class76 method2244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt2887 + arg0;
		@Pc(16) int local16 = this.anInt2887 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray203[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class76_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class76_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!hh", name = "xa", descriptor = "()I")
	@Override
	public int xa() {
		@Pc(2) int local2 = this.anInt2892;
		this.anInt2892 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
	@Override
	public void method2235(@OriginalArg(0) int arg0) {
		this.aClass146Array1[arg0].method3416(null);
	}

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "()V")
	@Override
	public void method2292() {
	}

	@OriginalMember(owner = "client!hh", name = "O", descriptor = "(IIIII)V")
	@Override
	protected void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt2905) {
			local8 = this.anInt2905;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt2899) {
			local21 = this.anInt2899;
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
				if (local91 < this.anInt2903) {
					local91 = this.anInt2903;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2884) {
					local102 = this.anInt2884;
				}
				local116 = local91 + local30 * this.anInt2887;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray203[local116++] = arg3;
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
				if (local91 < this.anInt2903) {
					local91 = this.anInt2903;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2884 - 1) {
					local102 = this.anInt2884 - 1;
				}
				local116 = local91 + local30 * this.anInt2887;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray203[local116++] = arg3;
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
				if (local102 < this.anInt2903) {
					local102 = this.anInt2903;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt2884) {
					local116 = this.anInt2884;
				}
				local118 = local102 + local30 * this.anInt2887;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray203[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray203[local118++] = local277 + local340;
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
				if (local102 < this.anInt2903) {
					local102 = this.anInt2903;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt2884 - 1) {
					local116 = this.anInt2884 - 1;
				}
				local118 = local102 + local30 * this.anInt2887;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray203[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray203[local118++] = local277 + local340;
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
				if (local91 < this.anInt2903) {
					local91 = this.anInt2903;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2884) {
					local102 = this.anInt2884;
				}
				local116 = local91 + local30 * this.anInt2887;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray203[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray203[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt2903) {
					local91 = this.anInt2903;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2884 - 1) {
					local102 = this.anInt2884 - 1;
				}
				local116 = local91 + local30 * this.anInt2887;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray203[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray203[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method2229(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas5 = null;
			this.aClass2_Sub11_1 = null;
			if (this.aClass76_9 == null) {
				this.anIntArray203 = null;
				this.anInt2887 = this.anInt2888 = 1;
				this.method2300();
			}
			return;
		}
		@Pc(10) Class2_Sub11 local10 = (Class2_Sub11) this.aClass240_11.method5439((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas5 = arg0;
		this.aClass2_Sub11_1 = local10;
		if (this.aClass76_9 != null) {
			return;
		}
		this.anIntArray203 = local10.anIntArray501;
		this.anInt2887 = local10.anInt7514;
		this.anInt2888 = local10.anInt7512;
		this.method2300();
		return;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)V")
	@Override
	public void method2255(@OriginalArg(0) boolean arg0) {
		this.aBoolean259 = arg0;
		this.aClass129_24.method3025();
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
	@Override
	public void method2256(@OriginalArg(0) int arg0) {
		this.aClass146Array1[arg0].method3416(Thread.currentThread());
	}

	@OriginalMember(owner = "client!hh", name = "na", descriptor = "(I)V")
	@Override
	public void na(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hh", name = "m", descriptor = "()Z")
	@Override
	public boolean method2261() {
		return false;
	}
}
