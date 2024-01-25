import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public abstract class Class122_Sub1 extends Class122 {

	@OriginalMember(owner = "client!jba", name = "r", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas15;

	@OriginalMember(owner = "client!jba", name = "s", descriptor = "Z")
	private boolean aBoolean618;

	@OriginalMember(owner = "client!jba", name = "t", descriptor = "Lclient!ba;")
	protected Class17 aClass17_39;

	@OriginalMember(owner = "client!jba", name = "u", descriptor = "I")
	private int anInt8826;

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "Z")
	private boolean aBoolean619;

	@OriginalMember(owner = "client!jba", name = "w", descriptor = "Lclient!hca;")
	protected Class1_Sub5 aClass1_Sub5_3;

	@OriginalMember(owner = "client!jba", name = "x", descriptor = "Z")
	public boolean aBoolean620;

	@OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
	public int anInt8827;

	@OriginalMember(owner = "client!jba", name = "z", descriptor = "I")
	public int anInt8828;

	@OriginalMember(owner = "client!jba", name = "A", descriptor = "I")
	private int anInt8829;

	@OriginalMember(owner = "client!jba", name = "B", descriptor = "Z")
	private boolean aBoolean621;

	@OriginalMember(owner = "client!jba", name = "C", descriptor = "I")
	public int anInt8830;

	@OriginalMember(owner = "client!jba", name = "D", descriptor = "I")
	public int anInt8831;

	@OriginalMember(owner = "client!jba", name = "E", descriptor = "I")
	public int anInt8832;

	@OriginalMember(owner = "client!jba", name = "F", descriptor = "I")
	public int anInt8833;

	@OriginalMember(owner = "client!jba", name = "G", descriptor = "Lclient!jaa;")
	public Class118_Sub2 aClass118_Sub2_9;

	@OriginalMember(owner = "client!jba", name = "H", descriptor = "I")
	private int anInt8834;

	@OriginalMember(owner = "client!jba", name = "I", descriptor = "I")
	public int anInt8835;

	@OriginalMember(owner = "client!jba", name = "J", descriptor = "F")
	private float aFloat197;

	@OriginalMember(owner = "client!jba", name = "K", descriptor = "I")
	public int anInt8836;

	@OriginalMember(owner = "client!jba", name = "L", descriptor = "I")
	public int anInt8837;

	@OriginalMember(owner = "client!jba", name = "M", descriptor = "I")
	public int anInt8838;

	@OriginalMember(owner = "client!jba", name = "N", descriptor = "[I")
	public int[] anIntArray823;

	@OriginalMember(owner = "client!jba", name = "O", descriptor = "I")
	private int anInt8839;

	@OriginalMember(owner = "client!jba", name = "P", descriptor = "I")
	private int anInt8840;

	@OriginalMember(owner = "client!jba", name = "Q", descriptor = "I")
	public int anInt8841;

	@OriginalMember(owner = "client!jba", name = "R", descriptor = "I")
	public int anInt8842;

	@OriginalMember(owner = "client!jba", name = "S", descriptor = "Lclient!wg;")
	private final Class313 aClass313_61;

	@OriginalMember(owner = "client!jba", name = "T", descriptor = "I")
	public int anInt8843;

	@OriginalMember(owner = "client!jba", name = "U", descriptor = "I")
	public int anInt8844;

	@OriginalMember(owner = "client!jba", name = "V", descriptor = "F")
	private float aFloat198;

	@OriginalMember(owner = "client!jba", name = "W", descriptor = "I")
	public int anInt8845;

	@OriginalMember(owner = "client!jba", name = "X", descriptor = "Lclient!ha;")
	protected Class2 aClass2_48;

	@OriginalMember(owner = "client!jba", name = "Y", descriptor = "I")
	public int anInt8846;

	@OriginalMember(owner = "client!jba", name = "Z", descriptor = "I")
	public int anInt8847;

	@OriginalMember(owner = "client!jba", name = "ab", descriptor = "Z")
	public boolean aBoolean622;

	@OriginalMember(owner = "client!jba", name = "bb", descriptor = "I")
	public int anInt8848;

	@OriginalMember(owner = "client!jba", name = "cb", descriptor = "Lclient!wg;")
	private final Class313 aClass313_62;

	@OriginalMember(owner = "client!jba", name = "db", descriptor = "I")
	public int anInt8849;

	@OriginalMember(owner = "client!jba", name = "eb", descriptor = "I")
	public int anInt8850;

	@OriginalMember(owner = "client!jba", name = "fb", descriptor = "I")
	public int anInt8851;

	@OriginalMember(owner = "client!jba", name = "gb", descriptor = "I")
	public int anInt8852;

	@OriginalMember(owner = "client!jba", name = "hb", descriptor = "I")
	public int anInt8853;

	@OriginalMember(owner = "client!jba", name = "ib", descriptor = "[Lclient!iw;")
	protected Class16[] aClass16Array3;

	@OriginalMember(owner = "client!jba", name = "jb", descriptor = "I")
	public int anInt8854;

	@OriginalMember(owner = "client!jba", name = "kb", descriptor = "I")
	public int anInt8855;

	@OriginalMember(owner = "client!jba", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!jba", name = "mb", descriptor = "I")
	protected int anInt8856;

	@OriginalMember(owner = "client!jba", name = "nb", descriptor = "Lclient!ha;")
	private Class2 aClass2_49;

	@OriginalMember(owner = "client!jba", name = "ob", descriptor = "I")
	private int anInt8857;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class122_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		this(arg1);
		this.method7222(arg0);
		this.method7226(arg0);
	}

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!n;)V")
	private Class122_Sub1(@OriginalArg(0) Interface8 arg0) {
		super(arg0);
		this.aBoolean618 = false;
		this.aBoolean619 = false;
		this.aClass17_39 = new Class17(4);
		this.aBoolean621 = false;
		this.anInt8839 = 3500;
		this.anInt8842 = 0;
		this.anInt8828 = 0;
		this.anInt8829 = 0;
		this.anInt8841 = 50;
		this.anInt8837 = 512;
		this.anInt8843 = 0;
		this.anInt8840 = 0;
		this.anInt8834 = 0;
		this.anInt8848 = 75518;
		this.anInt8852 = 0;
		this.anInt8851 = 78642;
		this.anInt8845 = 0;
		this.lb = this.anInt8839 - 255;
		this.anInt8846 = 0;
		this.anInt8855 = 512;
		this.anInt8847 = 3500;
		this.anInt8827 = 0;
		this.aBoolean620 = false;
		this.anInt8853 = 45823;
		this.aClass313_62 = new Class313(16);
		this.anInt8857 = -1;
		this.aClass313_61 = new Class313(20);
		this.aClass118_Sub2_9 = new Class118_Sub2();
		this.method7239(1);
		this.method7232(0);
		Static20.method500(false, true);
		this.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method7277(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7222(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub5 local8 = (Class1_Sub5) this.aClass17_39.method738((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static19.method498(arg0);
			this.aClass17_39.method737(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!jba", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass118_Sub2_9.anInt4234 + (this.aClass118_Sub2_9.anInt4238 * arg0 + this.aClass118_Sub2_9.anInt4243 * arg1 + this.aClass118_Sub2_9.anInt4232 * arg2 >> 14);
		if (local23 < this.anInt8841 || local23 > this.anInt8839) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt8837 * (this.aClass118_Sub2_9.anInt4233 + (this.aClass118_Sub2_9.anInt4240 * arg0 + this.aClass118_Sub2_9.anInt4239 * arg1 + this.aClass118_Sub2_9.anInt4235 * arg2 >> 14)) / local23;
		@Pc(102) int local102 = this.anInt8855 * (this.aClass118_Sub2_9.anInt4242 + (this.aClass118_Sub2_9.anInt4237 * arg0 + this.aClass118_Sub2_9.anInt4236 * arg1 + this.aClass118_Sub2_9.anInt4241 * arg2 >> 14)) / local23;
		if (local73 >= this.anInt8836 && local73 <= this.anInt8844 && local102 >= this.anInt8850 && local102 <= this.anInt8833) {
			arg3[0] = local73 - this.anInt8836;
			arg3[1] = local102 - this.anInt8850;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!jba", name = "y", descriptor = "()V")
	@Override
	public final void method7269() {
		this.aClass313_61.method7398();
	}

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7244() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "(I)[I")
	private int[] method7286(@OriginalArg(0) int arg0) {
		@Pc(2) Class313 local2 = this.aClass313_61;
		@Pc(12) Class1_Sub34 local12;
		synchronized (this.aClass313_61) {
			local12 = (Class1_Sub34) this.aClass313_61.method7406((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_14.method879(arg0)) {
					return null;
				}
				@Pc(32) Class220 local32 = super.anInterface8_14.method878(arg0);
				@Pc(42) int local42 = local32.aBoolean451 || this.aBoolean621 ? 64 : 128;
				local12 = new Class1_Sub34(arg0, local42, super.anInterface8_14.method880(local42, arg0, local42, 0.7F), local32.aBoolean450);
				this.aClass313_61.method7399((long) arg0, local12);
			}
		}
		local12.aBoolean431 = true;
		return local12.method5043();
	}

	@OriginalMember(owner = "client!jba", name = "Z", descriptor = "(I)V")
	@Override
	public final void Z(@OriginalArg(0) int arg0) {
		this.f(0, 0, this.anInt8838, this.anInt8856, arg0, 0);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!rn;)V")
	@Override
	public final void method7230(@OriginalArg(0) Class45 arg0) {
	}

	@OriginalMember(owner = "client!jba", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8841 = arg0;
		this.anInt8839 = arg1;
		this.lb = this.anInt8839 - 255;
		this.method7297();
	}

	@OriginalMember(owner = "client!jba", name = "C", descriptor = "()V")
	@Override
	public final void method7281() {
	}

	@OriginalMember(owner = "client!jba", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass118_Sub2_9.anInt4238 * arg0 + this.aClass118_Sub2_9.anInt4243 * arg1 + this.aClass118_Sub2_9.anInt4232 * arg2 >> 14) + this.aClass118_Sub2_9.anInt4234;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass118_Sub2_9.anInt4238 * arg3 + this.aClass118_Sub2_9.anInt4243 * arg4 + this.aClass118_Sub2_9.anInt4232 * arg5 >> 14) + this.aClass118_Sub2_9.anInt4234;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt8841 && local52 < this.anInt8841 || !(local23 <= this.anInt8839 || local52 <= this.anInt8839)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt8837 * ((this.aClass118_Sub2_9.anInt4240 * arg0 + this.aClass118_Sub2_9.anInt4239 * arg1 + this.aClass118_Sub2_9.anInt4235 * arg2 >> 14) + this.aClass118_Sub2_9.anInt4233) / local23;
		@Pc(133) int local133 = this.anInt8837 * ((this.aClass118_Sub2_9.anInt4240 * arg3 + this.aClass118_Sub2_9.anInt4239 * arg4 + this.aClass118_Sub2_9.anInt4235 * arg5 >> 14) + this.aClass118_Sub2_9.anInt4233) / local52;
		if (local104 < this.anInt8836 && local133 < this.anInt8836 || local104 > this.anInt8844 && local133 > this.anInt8844) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt8855 * ((this.aClass118_Sub2_9.anInt4237 * arg0 + this.aClass118_Sub2_9.anInt4236 * arg1 + this.aClass118_Sub2_9.anInt4241 * arg2 >> 14) + this.aClass118_Sub2_9.anInt4242) / local23;
			@Pc(209) int local209 = this.anInt8855 * ((this.aClass118_Sub2_9.anInt4237 * arg3 + this.aClass118_Sub2_9.anInt4236 * arg4 + this.aClass118_Sub2_9.anInt4241 * arg5 >> 14) + this.aClass118_Sub2_9.anInt4242) / local52;
			return (local180 >= this.anInt8850 || local209 >= this.anInt8850) && (local180 <= this.anInt8833 || local209 <= this.anInt8833);
		}
	}

	@OriginalMember(owner = "client!jba", name = "D", descriptor = "()V")
	@Override
	public void method7284() {
	}

	@OriginalMember(owner = "client!jba", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat198 = arg0;
		this.aFloat197 = arg1;
		this.method7297();
	}

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "(I)I")
	public final int method7287(@OriginalArg(0) int arg0) {
		return super.anInterface8_14.method878(arg0).aShort100 & 0xFFFF;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method7229(@OriginalArg(0) Class1_Sub8 arg0) {
	}

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "(I)Z")
	public final boolean method7288(@OriginalArg(0) int arg0) {
		return this.aBoolean621 || super.anInterface8_14.method878(arg0).aBoolean451;
	}

	@OriginalMember(owner = "client!jba", name = "s", descriptor = "()Lclient!m;")
	@Override
	public final Class118 method7256() {
		@Pc(3) Class16 local3 = this.method7289(Thread.currentThread());
		return local3.aClass118_Sub2_8;
	}

	@OriginalMember(owner = "client!jba", name = "h", descriptor = "()V")
	@Override
	public final void method7236() throws Exception_Sub1 {
		if (this.aCanvas15 == null || this.aClass1_Sub5_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas15.getGraphics();
			this.aClass1_Sub5_3.method2909(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas15.repaint();
		}
	}

	@OriginalMember(owner = "client!jba", name = "m", descriptor = "()V")
	@Override
	protected final void method7245() {
		if (this.aBoolean619) {
			Static328.method5044(true, false);
			this.aBoolean619 = false;
		}
		this.aClass1_Sub5_3 = null;
		this.aCanvas15 = null;
		this.aClass17_39 = null;
		this.aBoolean618 = true;
	}

	@OriginalMember(owner = "client!jba", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		this.anInt8848 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "(I)V")
	@Override
	public final void method7234(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt8826;
		for (@Pc(9) Object local9 = this.aClass313_61.method7396(); local9 != null; local9 = this.aClass313_61.method7404()) {
			@Pc(13) Class1_Sub34 local13 = (Class1_Sub34) local9;
			if (local13.aBoolean431) {
				local13.anInt5952 += local4;
				@Pc(27) int local27 = local13.anInt5952 / 20;
				if (local27 > 0) {
					@Pc(36) Class220 local36 = super.anInterface8_14.method878(local13.anInt5954);
					local13.method5041(local36.aByte82 * local4 * 50 / 1000, local36.aByte85 * local4 * 50 / 1000);
					local13.anInt5952 -= local27 * 20;
				}
				local13.aBoolean431 = false;
			}
		}
		this.anInt8826 = arg0;
		this.aClass313_62.method7403(5);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method7250(@OriginalArg(0) Class118 arg0) {
		this.aClass118_Sub2_9 = (Class118_Sub2) arg0;
	}

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "()Z")
	@Override
	public final boolean method7266() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7274(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas15 == arg0) {
			this.method7226(null);
		}
		@Pc(15) Class1_Sub5 local15 = (Class1_Sub5) this.aClass17_39.method738((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7525();
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!iw;")
	public abstract Class16 method7289(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!jba", name = "k", descriptor = "(I)[I")
	public final int[] method7290(@OriginalArg(0) int arg0) {
		@Pc(2) Class313 local2 = this.aClass313_61;
		@Pc(12) Class1_Sub34 local12;
		synchronized (this.aClass313_61) {
			local12 = (Class1_Sub34) this.aClass313_61.method7406((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_14.method879(arg0)) {
					return null;
				}
				@Pc(32) Class220 local32 = super.anInterface8_14.method878(arg0);
				@Pc(42) int local42 = local32.aBoolean451 || this.aBoolean621 ? 64 : 128;
				local12 = new Class1_Sub34(arg0, local42, super.anInterface8_14.method876(arg0, true, local42, 0.7F, local42), local32.aBoolean450);
				this.aClass313_61.method7399((long) arg0, local12);
			}
		}
		local12.aBoolean431 = true;
		return local12.method5043();
	}

	@OriginalMember(owner = "client!jba", name = "w", descriptor = "()Z")
	public final boolean method7291() {
		return this.aBoolean618;
	}

	@OriginalMember(owner = "client!jba", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt8838;
		@Pc(35) int local35 = this.anInt8838 - arg2;
		if (arg1 + arg3 > this.anInt8845) {
			arg3 -= arg1 + arg3 - this.anInt8845;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt8843) {
			local59 = this.anInt8843 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt8838;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt8842) {
			local59 = arg0 + arg2 - this.anInt8842;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt8852) {
			local59 = this.anInt8852 - arg0;
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
						this.anIntArray823[local30++] = arg4;
					} else {
						this.anIntArray823[local30++] = arg5;
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
					local245 = this.anIntArray823[local30];
					this.anIntArray823[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray823[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray823[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt8852 || arg0 >= this.anInt8842) {
			return;
		}
		if (arg1 < this.anInt8843) {
			arg2 -= this.anInt8843 - arg1;
			arg1 = this.anInt8843;
		}
		if (arg1 + arg2 > this.anInt8845) {
			arg2 = this.anInt8845 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8838;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray823[local40 + local54 * this.anInt8838] = arg3;
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
				local111 = local40 + local103 * this.anInt8838;
				local116 = this.anIntArray823[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray823[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt8838;
				local111 = this.anIntArray823[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray823[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jba", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		@Pc(2) int local2 = this.anInt8829;
		this.anInt8829 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "()I")
	@Override
	public final int method7217() {
		return 0;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "()Z")
	@Override
	public final boolean method7215() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II)I")
	@Override
	public final int method7225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!jba", name = "x", descriptor = "()Z")
	public abstract boolean method7267();

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!eca;I)V")
	public abstract void method7257(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) Class72_Sub2[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!fp;IIII)Lclient!r;")
	public abstract Class145 method7280(@OriginalArg(0) Class97 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jba", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt8838) {
			arg2 = this.anInt8838;
		}
		if (arg3 > this.anInt8856) {
			arg3 = this.anInt8856;
		}
		this.anInt8852 = arg0;
		this.anInt8842 = arg2;
		this.anInt8843 = arg1;
		this.anInt8845 = arg3;
		this.method7293();
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(I)V")
	@Override
	public void method7232(@OriginalArg(0) int arg0) {
		this.aClass16Array3[arg0].method7157(Thread.currentThread());
	}

	@OriginalMember(owner = "client!jba", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt8843 || arg1 >= this.anInt8845) {
			return;
		}
		if (arg0 < this.anInt8852) {
			arg2 -= this.anInt8852 - arg0;
			arg0 = this.anInt8852;
		}
		if (arg0 + arg2 > this.anInt8842) {
			arg2 = this.anInt8842 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8838;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray823[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray823[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray823[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray823[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray823[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class2 method7268(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class2_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class2_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class2_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class2_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class2 method7261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt8838 + arg0;
		@Pc(16) int local16 = this.anInt8838 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray823[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class2_Sub2_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class2_Sub2_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!jba", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7262() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(IIIIII)Lclient!rn;")
	@Override
	public final Class45 method7227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7272(@OriginalArg(0) boolean arg0) {
		this.aBoolean621 = arg0;
		this.aClass313_61.method7398();
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7271(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt8852) {
					arg1 += local104 * (this.anInt8852 - arg0);
					arg0 = this.anInt8852;
				}
				if (arg2 >= this.anInt8842) {
					arg2 = this.anInt8842 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8843 && local150 < this.anInt8845) {
							this.anIntArray823[arg0 + local150 * this.anInt8838] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt8843 && local213 < this.anInt8845) {
							local228 = arg0 + local213 * this.anInt8838;
							local233 = this.anIntArray823[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray823[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8843 && local150 < this.anInt8845) {
							local213 = arg0 + local150 * this.anInt8838;
							local228 = this.anIntArray823[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray823[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt8843) {
					arg0 += local104 * (this.anInt8843 - arg1);
					arg1 = this.anInt8843;
				}
				if (arg3 >= this.anInt8845) {
					arg3 = this.anInt8845 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8852 && local150 < this.anInt8842) {
							this.anIntArray823[local150 + arg1 * this.anInt8838] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt8852 && local213 < this.anInt8842) {
							local228 = local213 + arg1 * this.anInt8838;
							local233 = this.anIntArray823[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray823[local213 + arg1 * this.anInt8838] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8852 && local150 < this.anInt8842) {
							local213 = local150 + arg1 * this.anInt8838;
							local228 = this.anIntArray823[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray823[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt8852) {
			arg2 -= this.anInt8852 - arg0;
			arg0 = this.anInt8852;
		}
		if (arg1 < this.anInt8843) {
			arg3 -= this.anInt8843 - arg1;
			arg1 = this.anInt8843;
		}
		if (arg0 + arg2 > this.anInt8842) {
			arg2 = this.anInt8842 - arg0;
		}
		if (arg1 + arg3 > this.anInt8845) {
			arg3 = this.anInt8845 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt8842 || arg1 > this.anInt8845) {
			return;
		}
		@Pc(67) int local67 = this.anInt8838 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt8838;
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
						local217 = this.anIntArray823[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray823[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray823[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray823[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray823[arg2] = arg4;
					arg2++;
					this.anIntArray823[arg2] = arg4;
					arg2++;
					this.anIntArray823[arg2] = arg4;
					arg2++;
					this.anIntArray823[arg2] = arg4;
					arg2++;
					this.anIntArray823[arg2] = arg4;
					arg2++;
					this.anIntArray823[arg2] = arg4;
					arg2++;
					this.anIntArray823[arg2] = arg4;
					arg2++;
					this.anIntArray823[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray823[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!kw;)V")
	@Override
	public final void method7251(@OriginalArg(0) Class175 arg0) {
		@Pc(3) Class72_Sub1 local3 = arg0.aClass193_1.aClass72_Sub1_7;
		for (@Pc(6) Class72_Sub1 local6 = local3.aClass72_Sub1_10; local6 != local3; local6 = local6.aClass72_Sub1_10) {
			@Pc(10) Class72_Sub1_Sub1 local10 = (Class72_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt2189 >> 12;
			@Pc(20) int local20 = local10.anInt2190 >> 12;
			@Pc(25) int local25 = local10.anInt2187 >> 12;
			@Pc(49) int local49 = this.aClass118_Sub2_9.anInt4234 + (this.aClass118_Sub2_9.anInt4238 * local15 + this.aClass118_Sub2_9.anInt4243 * local20 + this.aClass118_Sub2_9.anInt4232 * local25 >> 14);
			if (local49 >= this.anInt8841 && local49 <= this.lb) {
				@Pc(90) int local90 = this.anInt8830 + this.anInt8837 * (this.aClass118_Sub2_9.anInt4233 + (this.aClass118_Sub2_9.anInt4240 * local15 + this.aClass118_Sub2_9.anInt4239 * local20 + this.aClass118_Sub2_9.anInt4235 * local25 >> 14)) / local49;
				@Pc(122) int local122 = this.anInt8832 + this.anInt8855 * (this.aClass118_Sub2_9.anInt4242 + (this.aClass118_Sub2_9.anInt4237 * local15 + this.aClass118_Sub2_9.anInt4236 * local20 + this.aClass118_Sub2_9.anInt4241 * local25 >> 14)) / local49;
				if (local90 >= this.anInt8852 && local90 <= this.anInt8842 && local122 >= this.anInt8843 && local122 <= this.anInt8845) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method7294(local10, local90, local122, (local10.anInt2184 * this.anInt8837 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7218() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)V")
	public abstract void method7211(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I[Lclient!ww;)V")
	@Override
	public final void method7264(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2[] arg1) {
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([Lclient!r;Lclient!kw;Lclient!m;[Lclient!eca;I)V")
	public abstract void method7283(@OriginalArg(0) Class145[] arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7278(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7226(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(II)I")
	@Override
	public final int method7241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!jba", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8852 < arg0) {
			this.anInt8852 = arg0;
		}
		if (this.anInt8843 < arg1) {
			this.anInt8843 = arg1;
		}
		if (this.anInt8842 > arg2) {
			this.anInt8842 = arg2;
		}
		if (this.anInt8845 > arg3) {
			this.anInt8845 = arg3;
		}
		this.method7293();
	}

	@OriginalMember(owner = "client!jba", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7242() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIF)Lclient!ww;")
	@Override
	public final Class1_Sub2 method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class205 method7219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!jba", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return 0;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method7216(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas15 == null || this.aClass1_Sub5_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas15.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt8838 && local21.y <= this.anInt8856 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub5_3.method2910(local21.height, local21.x, local21.y, local14, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas15.repaint();
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!pe;[Lclient!ig;Z)Lclient!ra;")
	@Override
	public final Class67 method7270(@OriginalArg(0) Class232 arg0, @OriginalArg(1) Class136[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4055;
			local7[local11] = arg1[local11].anInt4054;
			if (arg1[local11].aByteArray53 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class67_Sub2(this, arg0, arg1, local3, local7);
		} else {
			return new Class67_Sub1(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!jba", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt8839;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!ig;Z)Lclient!ha;")
	@Override
	public final Class2 method7220(@OriginalArg(0) Class136 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray344;
		@Pc(5) byte[] local5 = arg0.aByteArray52;
		@Pc(8) int local8 = arg0.anInt4055;
		@Pc(11) int local11 = arg0.anInt4054;
		@Pc(76) Class2_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray53 == null) {
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
			local76 = new Class2_Sub2_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray53;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class2_Sub2_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class2_Sub2_Sub1(this, local20, local8, local11);
			}
		}
		local76.KA(arg0.anInt4052, arg0.anInt4053, arg0.anInt4051, arg0.anInt4050);
		return local76;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!r;Lclient!kw;Lclient!m;Lclient!eca;I)V")
	@Override
	public final void method7246(@OriginalArg(0) Class145 arg0, @OriginalArg(1) Class175 arg1, @OriginalArg(2) Class118 arg2, @OriginalArg(3) Class72_Sub2 arg3) {
		((Class145_Sub1) arg0).method4273(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "(I)Z")
	public final boolean method7292(@OriginalArg(0) int arg0) {
		return super.anInterface8_14.method879(arg0);
	}

	@OriginalMember(owner = "client!jba", name = "E", descriptor = "()V")
	protected abstract void method7293();

	@OriginalMember(owner = "client!jba", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.anInt8846 = this.anInt8834;
		this.aBoolean620 = false;
	}

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "(IIIIII)V")
	@Override
	public final void method7282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	@Override
	public final void method7210(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!is;III)V")
	public final void method7294(@OriginalArg(0) Class72_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt2188;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.A(arg1, arg2, arg3, arg0.anInt2182, 1);
			return;
		}
		if (this.anInt8857 != local2) {
			@Pc(32) Class2 local32 = (Class2) this.aClass313_62.method7406((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method7286(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method7288(local2) ? 64 : 128;
				local32 = this.method7268(local38, local48, local48, local48);
				this.aClass313_62.method7399((long) local2, local32);
			}
			this.anInt8857 = local2;
			this.aClass2_49 = local32;
		}
		local8++;
		this.aClass2_49.ra(arg1 - arg3, arg2 - arg3, local8, local8, 0, arg0.anInt2182, 1);
	}

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7240() {
		return true;
	}

	@OriginalMember(owner = "client!jba", name = "m", descriptor = "(I)Z")
	public final boolean method7295(@OriginalArg(0) int arg0) {
		return super.anInterface8_14.method878(arg0).aBoolean449;
	}

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "()Z")
	@Override
	public final boolean method7228() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "F", descriptor = "()V")
	protected final void method7296() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8854; local1++) {
			this.aClass16Array3[local1].method7158();
		}
		this.n();
	}

	@OriginalMember(owner = "client!jba", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7254() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jba", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8827 = arg0;
		this.anInt8846 = arg1;
		this.anInt8828 = arg2;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "()V")
	@Override
	public final void method7214() {
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method7231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class40 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class40_Sub3 local2 = (Class40_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray825;
		@Pc(8) int[] local8 = local2.anIntArray824;
		@Pc(17) int local17 = this.anInt8843 > arg7 ? this.anInt8843 : arg7;
		@Pc(32) int local32 = this.anInt8845 < arg7 + local5.length ? this.anInt8845 : arg7 + local5.length;
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
					if (local129 >= this.anInt8852 && local129 < this.anInt8842 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray823[local129 + arg1 * this.anInt8838] = arg4;
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
					if (local133 >= this.anInt8852 && local133 < this.anInt8842 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt8838;
						local248 = this.anIntArray823[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray823[local133 + arg1 * this.anInt8838] = local201 + local584;
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
		if (arg0 < this.anInt8852) {
			arg1 += local83 * (this.anInt8852 - arg0);
			arg0 = this.anInt8852;
		}
		if (arg2 >= this.anInt8842) {
			arg2 = this.anInt8842 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray823[arg0 + local129 * this.anInt8838] = arg4;
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
					local243 = arg0 + local133 * this.anInt8838;
					local248 = this.anIntArray823[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray823[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8830 = arg0;
		this.anInt8832 = arg1;
		this.anInt8837 = arg2;
		this.anInt8855 = arg3;
		this.method7293();
	}

	@OriginalMember(owner = "client!jba", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7248() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt8841;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class40 method7273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class40_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8852;
		arg0[1] = this.anInt8843;
		arg0[2] = this.anInt8842;
		arg0[3] = this.anInt8845;
	}

	@OriginalMember(owner = "client!jba", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public final Class1_Sub8 method7263(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7260(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "(IIII)[I")
	@Override
	public final int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt8838 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray823[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!jba", name = "G", descriptor = "()V")
	private void method7297() {
		if (this.aFloat197 == 0.0F) {
			this.anInt8847 = this.anInt8839;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt8839;
		@Pc(12) float local12 = (float) this.anInt8841;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat198 / (this.aFloat197 + this.aFloat198);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat197;
		this.anInt8847 = (int) (((float) this.anInt8839 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!jba", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8846 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt8846 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt8846 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt8846 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt8846 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean622 = false;
		} else {
			this.aBoolean622 = true;
		}
	}

	@OriginalMember(owner = "client!jba", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8834 = this.anInt8846;
		this.anInt8827 = arg0;
		this.anInt8846 = arg1;
		this.anInt8828 = arg2;
		this.aBoolean620 = true;
	}

	@OriginalMember(owner = "client!jba", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class40_Sub3 local2 = (Class40_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray825;
		@Pc(8) int[] local8 = local2.anIntArray824;
		@Pc(20) int local20;
		if (this.anInt8845 < arg3 + local5.length) {
			local20 = this.anInt8845 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt8843 > arg3) {
			local33 = this.anInt8843 - arg3;
			arg3 = this.anInt8843;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt8838;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt8852 > local58) {
				local62 -= this.anInt8852 - local58;
				local58 = this.anInt8852;
			}
			if (this.anInt8842 < local58 + local62) {
				local62 = this.anInt8842 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray823[local58++] = arg0;
			}
			local49 += this.anInt8838;
		}
	}

	@OriginalMember(owner = "client!jba", name = "A", descriptor = "()Lclient!qf;")
	@Override
	public final Class246 method7276() {
		return new Class246(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lclient!rn;Lclient!rn;FLclient!rn;)Lclient!rn;")
	@Override
	public final Class45 method7233(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class45 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class45 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!jba", name = "B", descriptor = "()Z")
	@Override
	public final boolean method7279() {
		return false;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method7253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!jba", name = "t", descriptor = "()Z")
	@Override
	public final boolean method7258() {
		return true;
	}

	@OriginalMember(owner = "client!jba", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		@Pc(2) int local2 = this.anInt8840;
		this.anInt8840 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!jba", name = "z", descriptor = "()Lclient!m;")
	@Override
	public final Class118 method7275() {
		return new Class118_Sub2();
	}

	@OriginalMember(owner = "client!jba", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7255() {
		return true;
	}

	@OriginalMember(owner = "client!jba", name = "o", descriptor = "()V")
	@Override
	public final void method7247() {
	}

	@OriginalMember(owner = "client!jba", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt8843) {
			local8 = this.anInt8843;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt8845) {
			local21 = this.anInt8845;
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
				if (local91 < this.anInt8852) {
					local91 = this.anInt8852;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8842) {
					local102 = this.anInt8842;
				}
				local116 = local91 + local30 * this.anInt8838;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray823[local116++] = arg3;
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
				if (local91 < this.anInt8852) {
					local91 = this.anInt8852;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8842 - 1) {
					local102 = this.anInt8842 - 1;
				}
				local116 = local91 + local30 * this.anInt8838;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray823[local116++] = arg3;
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
				if (local102 < this.anInt8852) {
					local102 = this.anInt8852;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt8842) {
					local116 = this.anInt8842;
				}
				local118 = local102 + local30 * this.anInt8838;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray823[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray823[local118++] = local277 + local340;
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
				if (local102 < this.anInt8852) {
					local102 = this.anInt8852;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt8842 - 1) {
					local116 = this.anInt8842 - 1;
				}
				local118 = local102 + local30 * this.anInt8838;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray823[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray823[local118++] = local277 + local340;
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
				if (local91 < this.anInt8852) {
					local91 = this.anInt8852;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8842) {
					local102 = this.anInt8842;
				}
				local116 = local91 + local30 * this.anInt8838;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray823[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray823[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt8852) {
					local91 = this.anInt8852;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8842 - 1) {
					local102 = this.anInt8842 - 1;
				}
				local116 = local91 + local30 * this.anInt8838;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray823[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray823[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "(I)V")
	public abstract void method7239(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jba", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		this.anInt8852 = 0;
		this.anInt8843 = 0;
		this.anInt8842 = this.anInt8838;
		this.anInt8845 = this.anInt8856;
		this.method7293();
	}

	@OriginalMember(owner = "client!jba", name = "i", descriptor = "()V")
	@Override
	public final void method7238() {
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIIIII)V")
	public final void method7298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface8_14.method878(arg5).aBoolean446) {
			this.A(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt8857 != arg5) {
			@Pc(26) Class2 local26 = (Class2) this.aClass313_62.method7406((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method7286(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method7288(arg5) ? 64 : 128;
				local26 = this.method7268(local32, local43, local43, local43);
				this.aClass313_62.method7399((long) arg5, local26);
			}
			this.anInt8857 = arg5;
			this.aClass2_49 = local26;
		}
		this.aClass2_49.ra(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!jba", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt8853 = (int) (arg1 * 65535.0F);
		this.anInt8851 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt8831 = (int) (arg3 * 65535.0F / local26);
		this.anInt8835 = (int) (arg4 * 65535.0F / local26);
		this.anInt8849 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7221() {
		return true;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7252();
}
