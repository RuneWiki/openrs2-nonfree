import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class19_Sub2 extends Class19 {

	@OriginalMember(owner = "client!j", name = "s", descriptor = "I")
	public int anInt2837;

	@OriginalMember(owner = "client!j", name = "t", descriptor = "F")
	private float aFloat35;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "Z")
	public boolean aBoolean198;

	@OriginalMember(owner = "client!j", name = "y", descriptor = "[Lclient!wq;")
	private Class250[] aClass250Array1;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "I")
	public int anInt2841;

	@OriginalMember(owner = "client!j", name = "B", descriptor = "I")
	public int anInt2842;

	@OriginalMember(owner = "client!j", name = "C", descriptor = "I")
	public int anInt2843;

	@OriginalMember(owner = "client!j", name = "F", descriptor = "I")
	public int anInt2845;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "I")
	private int anInt2846;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "I")
	public int anInt2847;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "I")
	public int anInt2852;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "I")
	public int anInt2857;

	@OriginalMember(owner = "client!j", name = "W", descriptor = "F")
	private float aFloat36;

	@OriginalMember(owner = "client!j", name = "X", descriptor = "I")
	public int anInt2859;

	@OriginalMember(owner = "client!j", name = "Z", descriptor = "Lclient!ba;")
	public Class14_Sub1 aClass14_Sub1_2;

	@OriginalMember(owner = "client!j", name = "bb", descriptor = "I")
	public int anInt2862;

	@OriginalMember(owner = "client!j", name = "fb", descriptor = "Lclient!hu;")
	private Class98 aClass98_25;

	@OriginalMember(owner = "client!j", name = "lb", descriptor = "Lclient!aa;")
	private Class2_Sub1 lb;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	public int anInt2838 = 512;

	@OriginalMember(owner = "client!j", name = "r", descriptor = "I")
	private int anInt2836 = 3500;

	@OriginalMember(owner = "client!j", name = "A", descriptor = "Z")
	public boolean aBoolean199 = false;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "I")
	public int anInt2851 = 0;

	@OriginalMember(owner = "client!j", name = "J", descriptor = "I")
	public int anInt2849 = 75518;

	@OriginalMember(owner = "client!j", name = "D", descriptor = "I")
	public int anInt2844 = 3500;

	@OriginalMember(owner = "client!j", name = "E", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!j", name = "R", descriptor = "I")
	public int anInt2855 = 45823;

	@OriginalMember(owner = "client!j", name = "P", descriptor = "I")
	private int anInt2853 = 0;

	@OriginalMember(owner = "client!j", name = "K", descriptor = "I")
	public int anInt2850 = 0;

	@OriginalMember(owner = "client!j", name = "v", descriptor = "I")
	public int anInt2839 = 78642;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
	public int anInt2854 = 0;

	@OriginalMember(owner = "client!j", name = "x", descriptor = "I")
	public int anInt2840 = 50;

	@OriginalMember(owner = "client!j", name = "I", descriptor = "I")
	public int anInt2848 = 512;

	@OriginalMember(owner = "client!j", name = "db", descriptor = "I")
	public int anInt2863 = 0;

	@OriginalMember(owner = "client!j", name = "ab", descriptor = "I")
	private int anInt2861 = 0;

	@OriginalMember(owner = "client!j", name = "T", descriptor = "I")
	public int anInt2856 = 0;

	@OriginalMember(owner = "client!j", name = "eb", descriptor = "I")
	public int anInt2864 = this.anInt2836 - 255;

	@OriginalMember(owner = "client!j", name = "jb", descriptor = "I")
	public int anInt2867 = 0;

	@OriginalMember(owner = "client!j", name = "hb", descriptor = "I")
	public int anInt2865 = 0;

	@OriginalMember(owner = "client!j", name = "gb", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!j", name = "ib", descriptor = "I")
	private int anInt2866 = 0;

	@OriginalMember(owner = "client!j", name = "kb", descriptor = "Z")
	private boolean aBoolean202 = false;

	@OriginalMember(owner = "client!j", name = "cb", descriptor = "Lclient!hu;")
	private final Class98 aClass98_24 = new Class98(16);

	@OriginalMember(owner = "client!j", name = "N", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!j", name = "M", descriptor = "Lclient!tr;")
	private Class155 aClass155_1;

	@OriginalMember(owner = "client!j", name = "S", descriptor = "[I")
	public int[] anIntArray179;

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "I")
	public int anInt2860;

	@OriginalMember(owner = "client!j", name = "V", descriptor = "I")
	private int anInt2858;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ci;I)V", line = 894)
	public Class19_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		super(arg2, arg1);
		this.aCanvas3 = arg0;
		this.aClass155_1 = Static326.method5857(this.aCanvas3);
		this.anIntArray179 = this.aClass155_1.anIntArray385;
		this.anInt2860 = this.aClass155_1.anInt5642;
		this.anInt2858 = this.aClass155_1.anInt5646;
		this.method2917();
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V", line = 3)
	@Override
	public void method2869(@OriginalArg(0) int arg0) {
		this.method2903(0, 0, this.anInt2860, this.anInt2858, arg0, 0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IFFFFF)V", line = 7)
	@Override
	public void method2834(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt2855 = (int) (arg1 * 65535.0F);
		this.anInt2839 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt2842 = (int) (arg3 * 65535.0F / local26);
		this.anInt2837 = (int) (arg4 * 65535.0F / local26);
		this.anInt2847 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(FFF)V", line = 15)
	@Override
	public void method2875(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(I)Z", line = 18)
	public boolean method2906(@OriginalArg(0) int arg0) {
		return super.anInterface2_5.method2660(arg0).aBoolean442;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!wq;", line = 23)
	public Class250 method2907(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2843; local1++) {
			if (this.aClass250Array1[local1].aRunnable1 == arg0) {
				return this.aClass250Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!j", name = "p", descriptor = "()V", line = 35)
	@Override
	protected void method2841() {
		if (this.aBoolean202) {
			Static78.method1904(false);
			this.aBoolean202 = false;
		}
		this.aCanvas3 = null;
		this.aClass155_1 = null;
		this.aBoolean200 = true;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIII)V", line = 47)
	@Override
	public void method2847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class250 local3 = this.method2907(Thread.currentThread());
		@Pc(6) Class81 local6 = local3.aClass81_2;
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
		@Pc(93) int local93 = arg0 - local6.method2283();
		@Pc(98) int local98 = arg1 - local6.method2293();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt2261 = 0;
		local6.aBoolean169 = local102 < 0 || local102 > local6.anInt2262 || local106 < 0 || local106 > local6.anInt2262 || local112 < 0 || local112 > local6.anInt2262;
		local6.method2284(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean169 = local102 < 0 || local102 > local6.anInt2262 || local106 < 0 || local106 > local6.anInt2262 || local118 < 0 || local118 > local6.anInt2262;
		local6.method2284(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!j", name = "i", descriptor = "(I)Z", line = 116)
	public boolean method2908(@OriginalArg(0) int arg0) {
		return super.anInterface2_5.method2659(arg0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([Lclient!gn;Lclient!on;[Lclient!au;I)V", line = 120)
	@Override
	public void method2883(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class12_Sub2[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class31_Sub1[] local3 = new Class31_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class31_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class31_Sub1 local26 = Static369.method1259(this, local3);
		local26.method1249(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(II)V", line = 135)
	@Override
	public void method2874(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2840 = arg0;
		this.anInt2836 = arg1;
		this.anInt2864 = this.anInt2836 - 255;
		this.method2915();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!rc;)V", line = 141)
	@Override
	public void method2872(@OriginalArg(0) Class42 arg0) {
	}

	@OriginalMember(owner = "client!j", name = "D", descriptor = "()I", line = 145)
	@Override
	public int method2888() {
		return 0;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([I)V", line = 148)
	@Override
	public void method2853(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2865;
		arg0[1] = this.anInt2854;
		arg0[2] = this.anInt2851;
		arg0[3] = this.anInt2856;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIII)V", line = 154)
	@Override
	public void method2819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2865 < arg0) {
			this.anInt2865 = arg0;
		}
		if (this.anInt2854 < arg1) {
			this.anInt2854 = arg1;
		}
		if (this.anInt2851 > arg2) {
			this.anInt2851 = arg2;
		}
		if (this.anInt2856 > arg3) {
			this.anInt2856 = arg3;
		}
		this.method2911();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIII)V", line = 173)
	@Override
	public void method2855() {
		@Pc(3) Class250 local3 = this.method2907(Thread.currentThread());
		@Pc(6) Class81 local6 = local3.aClass81_2;
		local6.aBoolean168 = false;
		local6.aBoolean168 = false;
		local6.anInt2261 = 0;
		local6.aBoolean169 = true;
		local6.method2291(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean168 = true;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!kg;)V", line = 206)
	@Override
	public void method2848(@OriginalArg(0) Class2_Sub22 arg0) {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(FF)V", line = 209)
	@Override
	public void method2825(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat35 = arg0;
		this.aFloat36 = arg1;
		this.method2915();
	}

	@OriginalMember(owner = "client!j", name = "j", descriptor = "(I)I", line = 214)
	public int method2909(@OriginalArg(0) int arg0) {
		return super.anInterface2_5.method2660(arg0).aShort87 & 0xFFFF;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!gn;Lclient!tp;Lclient!on;Lclient!au;I)V", line = 217)
	@Override
	public void method2826(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class12_Sub2 arg3) {
		((Class31_Sub1) arg0).method1249(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I", line = 220)
	@Override
	public int method2808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 223)
	@Override
	public void method2830(@OriginalArg(0) Canvas arg0) {
		this.aCanvas3 = arg0;
		this.method2805();
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(I)Lclient!kg;", line = 233)
	@Override
	public Class2_Sub22 method2878() {
		return null;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII[BII)V", line = 237)
	@Override
	public void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt2860;
		@Pc(35) int local35 = this.anInt2860 - arg2;
		if (arg1 + arg3 > this.anInt2856) {
			arg3 -= arg1 + arg3 - this.anInt2856;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt2854) {
			local59 = this.anInt2854 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt2860;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt2851) {
			local59 = arg0 + arg2 - this.anInt2851;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt2865) {
			local59 = this.anInt2865 - arg0;
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
						this.anIntArray179[local30++] = arg4;
					} else {
						this.anIntArray179[local30++] = arg5;
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
					local245 = this.anIntArray179[local30];
					this.anIntArray179[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray179[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray179[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!j", name = "B", descriptor = "()V", line = 416)
	@Override
	public void method2884() {
		this.anInt2850 = this.anInt2866;
		this.aBoolean199 = false;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V", line = 419)
	@Override
	public void method2857(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "()F", line = 422)
	@Override
	public float method2804() {
		return this.aFloat35;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!at;III)V", line = 427)
	public void method2910(@OriginalArg(0) Class12_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt4467;
		if (local6 == -1) {
			this.method2818(arg1, arg2, local3, arg0.anInt4462);
			return;
		}
		if (this.lb == null || this.lb.aLong232 != (long) local6) {
			this.lb = (Class2_Sub1) this.aClass98_24.method2614((long) local6);
		}
		if (this.lb == null) {
			@Pc(44) int[] local44 = this.method2912(local6);
			if (local44 == null) {
				return;
			}
			this.lb = new Class2_Sub1();
			this.lb.aBoolean2 = this.method2916(local6);
			@Pc(65) int local65 = this.lb.aBoolean2 ? 64 : 128;
			this.lb.aClass13_1 = this.method2886(local44, local65, local65, local65);
			this.aClass98_24.method2626((long) local6, this.lb);
		}
		if (this.lb.aBoolean2) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.lb.aClass13_1.method6396(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt4462, 1);
	}

	@OriginalMember(owner = "client!j", name = "l", descriptor = "()V", line = 466)
	@Override
	public void method2821() {
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIII)V", line = 469)
	@Override
	public void method2811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method2858(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method2858(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt2865) {
					arg1 += local104 * (this.anInt2865 - arg0);
					arg0 = this.anInt2865;
				}
				if (arg2 >= this.anInt2851) {
					arg2 = this.anInt2851 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2854 && local150 < this.anInt2856) {
							this.anIntArray179[arg0 + local150 * this.anInt2860] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt2854 && local213 < this.anInt2856) {
							local228 = arg0 + local213 * this.anInt2860;
							local233 = this.anIntArray179[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray179[local228] = local204 + local233;
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
				if (arg1 < this.anInt2854) {
					arg0 += local104 * (this.anInt2854 - arg1);
					arg1 = this.anInt2854;
				}
				if (arg3 >= this.anInt2856) {
					arg3 = this.anInt2856 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2865 && local150 < this.anInt2851) {
							this.anIntArray179[local150 + arg1 * this.anInt2860] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt2865 && local213 < this.anInt2851) {
							local228 = local213 + arg1 * this.anInt2860;
							local233 = this.anIntArray179[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray179[local213 + arg1 * this.anInt2860] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method2891(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method2891(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "()V", line = 685)
	private void method2911() {
		this.anInt2845 = this.anInt2865 - this.anInt2852;
		this.anInt2862 = this.anInt2851 - this.anInt2852;
		this.anInt2841 = this.anInt2854 - this.anInt2857;
		this.anInt2859 = this.anInt2856 - this.anInt2857;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2843; local29++) {
			@Pc(36) Class81 local36 = this.aClass250Array1[local29].aClass81_2;
			local36.anInt2263 = this.anInt2852 - this.anInt2865;
			local36.anInt2260 = this.anInt2857 - this.anInt2854;
			local36.anInt2262 = this.anInt2851 - this.anInt2865;
			local36.anInt2264 = this.anInt2856 - this.anInt2854;
		}
		@Pc(78) int local78 = this.anInt2854 * this.anInt2860 + this.anInt2865;
		for (@Pc(81) int local81 = this.anInt2854; local81 < this.anInt2856; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt2843; local84++) {
				this.aClass250Array1[local84].aClass81_2.anIntArray144[local81 - this.anInt2854] = local78;
			}
			local78 += this.anInt2860;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!on;)V", line = 723)
	@Override
	public void method2898(@OriginalArg(0) Class14 arg0) {
		this.aClass14_Sub1_2 = (Class14_Sub1) arg0;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(IIIII)V", line = 726)
	@Override
	public void method2891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt2865 || arg0 >= this.anInt2851) {
			return;
		}
		if (arg1 < this.anInt2854) {
			arg2 -= this.anInt2854 - arg1;
			arg1 = this.anInt2854;
		}
		if (arg1 + arg2 > this.anInt2856) {
			arg2 = this.anInt2856 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2860;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray179[local40 + local54 * this.anInt2860] = arg3;
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
				local111 = local40 + local103 * this.anInt2860;
				local116 = this.anIntArray179[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray179[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt2860;
				local111 = this.anIntArray179[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray179[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!j", name = "s", descriptor = "()Z", line = 802)
	@Override
	public boolean method2849() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II[[I[[IIII)Lclient!tf;", line = 805)
	@Override
	public Class6 method2809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class6_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!j", name = "k", descriptor = "(I)[I", line = 809)
	private int[] method2912(@OriginalArg(0) int arg0) {
		@Pc(2) Class98 local2 = this.aClass98_25;
		@Pc(12) Class2_Sub14 local12;
		synchronized (this.aClass98_25) {
			local12 = (Class2_Sub14) this.aClass98_25.method2614((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_5.method2659(arg0)) {
					return null;
				}
				@Pc(32) Class229 local32 = super.anInterface2_5.method2660(arg0);
				@Pc(42) int local42 = local32.aBoolean441 || this.aBoolean201 ? 64 : 128;
				local12 = new Class2_Sub14(arg0, local42, super.anInterface2_5.method2658(0.7F, local42, local42, arg0), local32.aBoolean440);
				this.aClass98_25.method2626((long) arg0, local12);
			}
		}
		local12.aBoolean165 = true;
		return local12.method2254();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIZ)Lclient!jd;", line = 830)
	@Override
	public Class13 method2820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt2860 + arg0;
		@Pc(16) int local16 = this.anInt2860 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray179[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class13_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class13_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!j", name = "J", descriptor = "()V", line = 862)
	@Override
	public void method2900() {
		this.anInt2865 = 0;
		this.anInt2854 = 0;
		this.anInt2851 = this.anInt2860;
		this.anInt2856 = this.anInt2858;
		this.method2911();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V", line = 869)
	@Override
	public void method2844(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas3 == null || this.aClass155_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt2860 && local21.y <= this.anInt2858 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass155_1.method5152(local21.height, local21.x, local21.y, local14, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!j", name = "j", descriptor = "()Z", line = 905)
	@Override
	public boolean method2815() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V", line = 908)
	@Override
	public void method2895(@OriginalArg(0) int arg0) {
		this.aClass250Array1[arg0].method6451(Thread.currentThread());
	}

	@OriginalMember(owner = "client!j", name = "n", descriptor = "()Z", line = 912)
	@Override
	public boolean method2831() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIII)V", line = 915)
	@Override
	public void method2823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2852 = arg0;
		this.anInt2857 = arg1;
		this.anInt2848 = arg2;
		this.anInt2838 = arg3;
		this.method2911();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V", line = 922)
	@Override
	public void method2854(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!j", name = "l", descriptor = "(I)[I", line = 926)
	public int[] method2913(@OriginalArg(0) int arg0) {
		@Pc(2) Class98 local2 = this.aClass98_25;
		@Pc(12) Class2_Sub14 local12;
		synchronized (this.aClass98_25) {
			local12 = (Class2_Sub14) this.aClass98_25.method2614((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_5.method2659(arg0)) {
					return null;
				}
				@Pc(32) Class229 local32 = super.anInterface2_5.method2660(arg0);
				@Pc(42) int local42 = local32.aBoolean441 || this.aBoolean201 ? 64 : 128;
				local12 = new Class2_Sub14(arg0, local42, super.anInterface2_5.method2661(arg0, true, local42, 0.7F, local42), local32.aBoolean440);
				this.aClass98_25.method2626((long) arg0, local12);
			}
		}
		local12.aBoolean165 = true;
		return local12.method2254();
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(IIII)V", line = 946)
	@Override
	public void method2897(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2860) {
			arg2 = this.anInt2860;
		}
		if (arg3 > this.anInt2858) {
			arg3 = this.anInt2858;
		}
		this.anInt2865 = arg0;
		this.anInt2851 = arg2;
		this.anInt2854 = arg1;
		this.anInt2856 = arg3;
		this.method2911();
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)I", line = 966)
	@Override
	public int method2865(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!j", name = "v", descriptor = "()Z", line = 970)
	@Override
	public boolean method2861() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "()Z", line = 977)
	@Override
	public boolean method2807() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "r", descriptor = "()I", line = 982)
	@Override
	public int method2845() {
		@Pc(2) int local2 = this.anInt2853;
		this.anInt2853 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!j", name = "G", descriptor = "()Z", line = 987)
	@Override
	public boolean method2894() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "()Z", line = 990)
	public boolean method2914() {
		return this.aBoolean200;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(IIII)[I", line = 995)
	@Override
	public int[] method2852() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt2860;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray179[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V", line = 1020)
	@Override
	public void method2876(@OriginalArg(0) boolean arg0) {
		this.aBoolean201 = arg0;
		this.aClass98_25.method2616();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!pr;IIII)Lclient!gn;", line = 1025)
	@Override
	public Class31 method2866(@OriginalArg(0) Class185 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class31_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(F)V", line = 1036)
	@Override
	public void method2840(@OriginalArg(0) float arg0) {
		this.anInt2849 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V", line = 1039)
	@Override
	public void method2867(@OriginalArg(0) int arg0) {
		this.aClass250Array1[arg0].method6451(null);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V", line = 1042)
	@Override
	protected void method2818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt2854) {
			local8 = this.anInt2854;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt2856) {
			local21 = this.anInt2856;
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
				if (local91 < this.anInt2865) {
					local91 = this.anInt2865;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2851) {
					local102 = this.anInt2851;
				}
				local116 = local91 + local30 * this.anInt2860;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray179[local116++] = arg3;
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
				if (local91 < this.anInt2865) {
					local91 = this.anInt2865;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2851 - 1) {
					local102 = this.anInt2851 - 1;
				}
				local116 = local91 + local30 * this.anInt2860;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray179[local116++] = arg3;
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
			if (local102 < this.anInt2865) {
				local102 = this.anInt2865;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt2851) {
				local116 = this.anInt2851;
			}
			local118 = local102 + local30 * this.anInt2860;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray179[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray179[local118++] = local277 + local360;
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
			if (local102 < this.anInt2865) {
				local102 = this.anInt2865;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt2851 - 1) {
				local116 = this.anInt2851 - 1;
			}
			local118 = local102 + local30 * this.anInt2860;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray179[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray179[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(II)V", line = 1328)
	@Override
	public void method2881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2850 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt2850 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt2850 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt2850 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt2850 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean198 = false;
		} else {
			this.aBoolean198 = true;
		}
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(IIII)V", line = 1352)
	@Override
	public void method2882() {
		this.anInt2866 = this.anInt2850;
		this.anInt2863 = -1;
		this.anInt2850 = 1583160;
		this.anInt2867 = 40;
		this.aBoolean199 = true;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II[I[I)Lclient!kf;", line = 1359)
	@Override
	public Class78 method2828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class78_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!j", name = "E", descriptor = "()V", line = 1361)
	@Override
	public void method2889() {
	}

	@OriginalMember(owner = "client!j", name = "A", descriptor = "()Z", line = 1369)
	@Override
	public boolean method2880() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!vi;[Lclient!dk;Z)Lclient!ur;", line = 1373)
	@Override
	public Class130 method2859(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class48[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1529;
			local7[local11] = arg1[local11].anInt1531;
			if (arg1[local11].aByteArray20 != null) {
			}
		}
		return new Class130_Sub4(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!rc;Lclient!rc;FLclient!rc;)Lclient!rc;", line = 1406)
	@Override
	public Class42 method2829(@OriginalArg(0) Class42 arg0, @OriginalArg(1) Class42 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class42 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!j", name = "x", descriptor = "()Z", line = 1409)
	@Override
	public boolean method2871() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "C", descriptor = "()V", line = 1415)
	@Override
	public void method2885() {
		if (this.aCanvas3 == null || this.aClass155_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			this.aClass155_1.method5153(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!tp;)V", line = 1429)
	@Override
	public void method2835(@OriginalArg(0) Class224 arg0) {
		@Pc(3) Class12_Sub1 local3 = arg0.aClass191_1.aClass12_Sub1_7;
		for (@Pc(6) Class12_Sub1 local6 = local3.aClass12_Sub1_5; local6 != local3; local6 = local6.aClass12_Sub1_5) {
			@Pc(10) Class12_Sub1_Sub1 local10 = (Class12_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt4458 >> 12;
			@Pc(20) int local20 = local10.anInt4463 >> 12;
			@Pc(25) int local25 = local10.anInt4460 >> 12;
			@Pc(49) int local49 = this.aClass14_Sub1_2.anInt501 + (this.aClass14_Sub1_2.anInt504 * local15 + this.aClass14_Sub1_2.anInt502 * local20 + this.aClass14_Sub1_2.anInt503 * local25 >> 15);
			if (local49 >= this.anInt2840 && local49 <= this.anInt2836) {
				@Pc(90) int local90 = this.anInt2852 + this.anInt2848 * (this.aClass14_Sub1_2.anInt498 + (this.aClass14_Sub1_2.anInt505 * local15 + this.aClass14_Sub1_2.anInt500 * local20 + this.aClass14_Sub1_2.anInt497 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt2857 + this.anInt2838 * (this.aClass14_Sub1_2.anInt496 + (this.aClass14_Sub1_2.anInt507 * local15 + this.aClass14_Sub1_2.anInt506 * local20 + this.aClass14_Sub1_2.anInt499 * local25 >> 15)) / local49;
				if (local90 >= this.anInt2865 && local90 <= this.anInt2851 && local122 >= this.anInt2854 && local122 <= this.anInt2856) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method2910(local10, local90, local122, (local10.anInt4465 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "()V", line = 1465)
	@Override
	public void method2806() {
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "()Lclient!on;", line = 1469)
	@Override
	public Class14 method2810() {
		@Pc(3) Class250 local3 = this.method2907(Thread.currentThread());
		return local3.aClass14_Sub1_3;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "()V", line = 1475)
	private void method2915() {
		if (this.aFloat36 == 0.0F) {
			this.anInt2844 = this.anInt2836;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt2836;
		@Pc(12) float local12 = (float) this.anInt2840;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat35 / (this.aFloat36 + this.aFloat35);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat36;
		this.anInt2844 = (int) (((float) this.anInt2836 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I[Lclient!of;)V", line = 1495)
	@Override
	public void method2836(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub26[] arg1) {
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V", line = 1505)
	@Override
	public void method2856(@OriginalArg(0) int arg0) {
		if (this.anInt2843 == arg0) {
			return;
		}
		this.anInt2843 = arg0;
		this.aClass250Array1 = new Class250[this.anInt2843];
		for (@Pc(14) int local14 = 0; local14 < this.anInt2843; local14++) {
			this.aClass250Array1[local14] = new Class250(this);
		}
	}

	@OriginalMember(owner = "client!j", name = "k", descriptor = "()I", line = 1522)
	@Override
	public int method2816() {
		return this.anInt2840;
	}

	@OriginalMember(owner = "client!j", name = "F", descriptor = "()Z", line = 1525)
	@Override
	public boolean method2890() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIILclient!kf;II)V", line = 1529)
	@Override
	public void method2817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class78 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class78_Sub1 local2 = (Class78_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray139;
		@Pc(8) int[] local8 = local2.anIntArray140;
		@Pc(17) int local17 = this.anInt2854 > arg7 ? this.anInt2854 : arg7;
		@Pc(32) int local32 = this.anInt2856 < arg7 + local5.length ? this.anInt2856 : arg7 + local5.length;
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
					if (local129 >= this.anInt2865 && local129 < this.anInt2851 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray179[local129 + arg1 * this.anInt2860] = arg4;
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
					if (local133 >= this.anInt2865 && local133 < this.anInt2851 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt2860;
						local248 = this.anIntArray179[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray179[local133 + arg1 * this.anInt2860] = local201 + local584;
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
		if (arg0 < this.anInt2865) {
			arg1 += local83 * (this.anInt2865 - arg0);
			arg0 = this.anInt2865;
		}
		if (arg2 >= this.anInt2851) {
			arg2 = this.anInt2851 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray179[arg0 + local129 * this.anInt2860] = arg4;
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
					local243 = arg0 + local133 * this.anInt2860;
					local248 = this.anIntArray179[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray179[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!j", name = "q", descriptor = "()Z", line = 1767)
	@Override
	public boolean method2842() {
		return true;
	}

	@OriginalMember(owner = "client!j", name = "z", descriptor = "()I", line = 1770)
	@Override
	public int method2877() {
		return this.anInt2836;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III[I)V", line = 1774)
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass14_Sub1_2.anInt501 + (this.aClass14_Sub1_2.anInt504 * arg0 + this.aClass14_Sub1_2.anInt502 * arg1 + this.aClass14_Sub1_2.anInt503 * arg2 >> 15);
		if (local23 < this.anInt2840 || local23 > this.anInt2836) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt2848 * (this.aClass14_Sub1_2.anInt498 + (this.aClass14_Sub1_2.anInt505 * arg0 + this.aClass14_Sub1_2.anInt500 * arg1 + this.aClass14_Sub1_2.anInt497 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt2838 * (this.aClass14_Sub1_2.anInt496 + (this.aClass14_Sub1_2.anInt507 * arg0 + this.aClass14_Sub1_2.anInt506 * arg1 + this.aClass14_Sub1_2.anInt499 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt2845 && local73 <= this.anInt2862 && local102 >= this.anInt2841 && local102 <= this.anInt2859) {
			arg3[0] = local73 - this.anInt2845;
			arg3[1] = local102 - this.anInt2841;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!j", name = "K", descriptor = "()I", line = 1798)
	@Override
	public int method2901() {
		return 0;
	}

	@OriginalMember(owner = "client!j", name = "w", descriptor = "()F", line = 1801)
	@Override
	public float method2862() {
		return this.aFloat36;
	}

	@OriginalMember(owner = "client!j", name = "o", descriptor = "()V", line = 1803)
	@Override
	public void method2833() {
	}

	@OriginalMember(owner = "client!j", name = "H", descriptor = "()Z", line = 1811)
	@Override
	public boolean method2896() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "i", descriptor = "()Z", line = 1814)
	@Override
	public boolean method2814() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "()V", line = 1818)
	@Override
	public void method2805() {
		this.aClass155_1 = Static326.method5857(this.aCanvas3);
		this.anIntArray179 = this.aClass155_1.anIntArray385;
		this.anInt2860 = this.aClass155_1.anInt5642;
		this.anInt2858 = this.aClass155_1.anInt5646;
		for (@Pc(22) int local22 = 0; local22 < this.anInt2843; local22++) {
			this.aClass250Array1[local22].method6458();
		}
		this.method2900();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([Lclient!gn;Lclient!tp;Lclient!on;[Lclient!au;I)V", line = 1834)
	@Override
	public void method2832(@OriginalArg(0) Class31[] arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class12_Sub2[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class31_Sub1[] local3 = new Class31_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class31_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class31_Sub1 local26 = Static369.method1259(this, local3);
		local26.method1249(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!j", name = "m", descriptor = "()I", line = 1850)
	@Override
	public int method2822() {
		@Pc(2) int local2 = this.anInt2861;
		this.anInt2861 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(IIII)V", line = 1859)
	@Override
	public void method2868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2863 = arg0;
		this.anInt2850 = arg1;
		this.anInt2867 = arg2;
	}

	@OriginalMember(owner = "client!j", name = "u", descriptor = "()Z", line = 1875)
	@Override
	public boolean method2860() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "m", descriptor = "(I)Z", line = 1878)
	public boolean method2916(@OriginalArg(0) int arg0) {
		return this.aBoolean201 || super.anInterface2_5.method2660(arg0).aBoolean441;
	}

	@OriginalMember(owner = "client!j", name = "t", descriptor = "()Z", line = 1884)
	@Override
	public boolean method2851() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!dk;Z)Lclient!jd;", line = 1888)
	@Override
	public Class13 method2893(@OriginalArg(0) Class48 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray108;
		@Pc(5) byte[] local5 = arg0.aByteArray21;
		@Pc(8) int local8 = arg0.anInt1529;
		@Pc(11) int local11 = arg0.anInt1531;
		@Pc(76) Class13_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray20 == null) {
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
			local76 = new Class13_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray20;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class13_Sub1_Sub1(this, local20, local8, local11);
				local76 = new Class13_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class13_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.method6392(arg0.anInt1533, arg0.anInt1528, arg0.anInt1530, arg0.anInt1532);
		return local76;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 1991)
	@Override
	public void method2850(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2846;
		for (@Pc(9) Object local9 = this.aClass98_25.method2621(); local9 != null; local9 = this.aClass98_25.method2620()) {
			@Pc(13) Class2_Sub14 local13 = (Class2_Sub14) local9;
			if (local13.aBoolean165) {
				local13.anInt2230 += local4;
				@Pc(27) int local27 = local13.anInt2230 / 20;
				if (local27 > 0) {
					@Pc(36) Class229 local36 = super.anInterface2_5.method2660(local13.anInt2231);
					local13.method2253(local36.aByte68 * local4 * 50 / 1000, local36.aByte69 * local4 * 50 / 1000);
					local13.anInt2230 -= local27 * 20;
				}
				local13.aBoolean165 = false;
			}
		}
		this.anInt2846 = arg0;
		this.aClass98_24.method2617(5);
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIII)V", line = 2023)
	@Override
	public void method2858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt2854 || arg1 >= this.anInt2856) {
			return;
		}
		if (arg0 < this.anInt2865) {
			arg2 -= this.anInt2865 - arg0;
			arg0 = this.anInt2865;
		}
		if (arg0 + arg2 > this.anInt2851) {
			arg2 = this.anInt2851 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2860;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray179[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray179[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray179[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray179[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray179[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(IIII)V", line = 2097)
	@Override
	public void method2864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!j", name = "L", descriptor = "()V", line = 2101)
	@Override
	public void method2905() {
		this.aClass98_25.method2616();
	}

	@OriginalMember(owner = "client!j", name = "y", descriptor = "()Z", line = 2110)
	@Override
	public boolean method2873() {
		return false;
	}

	@OriginalMember(owner = "client!j", name = "h", descriptor = "(IIIIII)V", line = 2127)
	@Override
	public void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt2865) {
			arg2 -= this.anInt2865 - arg0;
			arg0 = this.anInt2865;
		}
		if (arg1 < this.anInt2854) {
			arg3 -= this.anInt2854 - arg1;
			arg1 = this.anInt2854;
		}
		if (arg0 + arg2 > this.anInt2851) {
			arg2 = this.anInt2851 - arg0;
		}
		if (arg1 + arg3 > this.anInt2856) {
			arg3 = this.anInt2856 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt2851 || arg1 > this.anInt2856) {
			return;
		}
		@Pc(67) int local67 = this.anInt2860 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt2860;
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
						local221 = this.anIntArray179[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray179[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray179[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray179[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray179[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!j", name = "g", descriptor = "(IIIIII)Lclient!rc;", line = 2262)
	@Override
	public Class42 method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!j", name = "I", descriptor = "()Lclient!on;", line = 2266)
	@Override
	public Class14 method2899() {
		return new Class14_Sub1();
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(IIIIII)Z", line = 2271)
	@Override
	public boolean method2843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass14_Sub1_2.anInt504 * arg0 + this.aClass14_Sub1_2.anInt502 * arg1 + this.aClass14_Sub1_2.anInt503 * arg2 >> 15) + this.aClass14_Sub1_2.anInt501;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass14_Sub1_2.anInt504 * arg3 + this.aClass14_Sub1_2.anInt502 * arg4 + this.aClass14_Sub1_2.anInt503 * arg5 >> 15) + this.aClass14_Sub1_2.anInt501;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt2840 && local52 < this.anInt2840 || !(local23 <= this.anInt2836 || local52 <= this.anInt2836)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt2848 * ((this.aClass14_Sub1_2.anInt505 * arg0 + this.aClass14_Sub1_2.anInt500 * arg1 + this.aClass14_Sub1_2.anInt497 * arg2 >> 15) + this.aClass14_Sub1_2.anInt498) / local23;
		@Pc(133) int local133 = this.anInt2848 * ((this.aClass14_Sub1_2.anInt505 * arg3 + this.aClass14_Sub1_2.anInt500 * arg4 + this.aClass14_Sub1_2.anInt497 * arg5 >> 15) + this.aClass14_Sub1_2.anInt498) / local52;
		if (local104 < this.anInt2845 && local133 < this.anInt2845 || local104 > this.anInt2862 && local133 > this.anInt2862) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt2838 * ((this.aClass14_Sub1_2.anInt507 * arg0 + this.aClass14_Sub1_2.anInt506 * arg1 + this.aClass14_Sub1_2.anInt499 * arg2 >> 15) + this.aClass14_Sub1_2.anInt496) / local23;
			@Pc(209) int local209 = this.anInt2838 * ((this.aClass14_Sub1_2.anInt507 * arg3 + this.aClass14_Sub1_2.anInt506 * arg4 + this.aClass14_Sub1_2.anInt499 * arg5 >> 15) + this.aClass14_Sub1_2.anInt496) / local52;
			return (local180 >= this.anInt2841 || local209 >= this.anInt2841) && (local180 <= this.anInt2859 || local209 <= this.anInt2859);
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!kf;II)V", line = 2301)
	@Override
	public void method2813(@OriginalArg(1) Class78 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class78_Sub1 local2 = (Class78_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray139;
		@Pc(8) int[] local8 = local2.anIntArray140;
		@Pc(20) int local20;
		if (this.anInt2856 < arg2 + local5.length) {
			local20 = this.anInt2856 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt2854 > arg2) {
			local33 = this.anInt2854 - arg2;
			arg2 = this.anInt2854;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt2860;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt2865 > local58) {
				local62 -= this.anInt2865 - local58;
				local58 = this.anInt2865;
			}
			if (this.anInt2851 < local58 + local62) {
				local62 = this.anInt2851 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray179[local58++] = -16777216;
			}
			local49 += this.anInt2860;
		}
	}

	@OriginalMember(owner = "client!j", name = "M", descriptor = "()V", line = 2361)
	private void method2917() {
		this.aClass98_25 = new Class98(20);
		this.aClass14_Sub1_2 = new Class14_Sub1();
		Static257.method4767(false);
		this.aBoolean202 = true;
		this.method2856(1);
		this.method2895(0);
		this.method2900();
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IIIIII)V", line = 2373)
	@Override
	public void method2838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method2858(arg0, arg1, arg2, arg4, arg5);
		this.method2858(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method2891(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method2891(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([IIIII)Lclient!jd;", line = 2389)
	@Override
	public Class13 method2886(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class13_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class13_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class13_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class13_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3);
	}
}
