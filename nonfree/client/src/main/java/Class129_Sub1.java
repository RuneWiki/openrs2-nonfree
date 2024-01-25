import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
	public int anInt3795;

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
	public int anInt3799;

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "Z")
	public boolean aBoolean241;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "F")
	private float aFloat29;

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
	public int anInt3803;

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "Lclient!ei;")
	public Class61_Sub1 aClass61_Sub1_2;

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "I")
	public int anInt3808;

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "I")
	public int anInt3809;

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "F")
	private float aFloat30;

	@OriginalMember(owner = "client!ma", name = "U", descriptor = "Lclient!bj;")
	private Class26 aClass26_35;

	@OriginalMember(owner = "client!ma", name = "X", descriptor = "I")
	public int anInt3815;

	@OriginalMember(owner = "client!ma", name = "Z", descriptor = "I")
	public int anInt3817;

	@OriginalMember(owner = "client!ma", name = "bb", descriptor = "I")
	public int anInt3818;

	@OriginalMember(owner = "client!ma", name = "cb", descriptor = "[Lclient!sp;")
	private Class184[] aClass184Array1;

	@OriginalMember(owner = "client!ma", name = "fb", descriptor = "I")
	public int anInt3821;

	@OriginalMember(owner = "client!ma", name = "gb", descriptor = "I")
	private int anInt3822;

	@OriginalMember(owner = "client!ma", name = "ib", descriptor = "I")
	public int anInt3824;

	@OriginalMember(owner = "client!ma", name = "lb", descriptor = "Lclient!lm;")
	private Class11_Sub26 lb;

	@OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
	public int anInt3804 = 50;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "Z")
	private boolean aBoolean240 = false;

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
	public int anInt3801 = 0;

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "I")
	private int anInt3806 = 0;

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
	public int anInt3798 = 0;

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
	public int anInt3807 = 0;

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
	public int anInt3802 = 3500;

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
	public int anInt3805 = 45823;

	@OriginalMember(owner = "client!ma", name = "P", descriptor = "Z")
	public boolean aBoolean244 = false;

	@OriginalMember(owner = "client!ma", name = "W", descriptor = "I")
	private int anInt3814 = 0;

	@OriginalMember(owner = "client!ma", name = "R", descriptor = "I")
	public int anInt3811 = 512;

	@OriginalMember(owner = "client!ma", name = "O", descriptor = "Z")
	private boolean aBoolean243 = false;

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
	public int anInt3797 = 0;

	@OriginalMember(owner = "client!ma", name = "db", descriptor = "I")
	private int anInt3819 = 3500;

	@OriginalMember(owner = "client!ma", name = "S", descriptor = "I")
	public int anInt3812 = 512;

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "Z")
	private boolean aBoolean242 = false;

	@OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
	public int anInt3816 = this.anInt3819 - 255;

	@OriginalMember(owner = "client!ma", name = "eb", descriptor = "I")
	private int anInt3820 = 0;

	@OriginalMember(owner = "client!ma", name = "hb", descriptor = "I")
	public int anInt3823 = 78642;

	@OriginalMember(owner = "client!ma", name = "jb", descriptor = "I")
	public int anInt3825 = 0;

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "I")
	public int anInt3813 = 0;

	@OriginalMember(owner = "client!ma", name = "kb", descriptor = "I")
	public int anInt3826 = 75518;

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
	public int anInt3796 = 0;

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "Lclient!bj;")
	private final Class26 aClass26_34 = new Class26(16);

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas4;

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "Lclient!ja;")
	public Interface2 anInterface2_4;

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "Lclient!nr;")
	private Class65 aClass65_1;

	@OriginalMember(owner = "client!ma", name = "ab", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
	public int anInt3800;

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
	private int anInt3810;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!ja;I)V")
	public Class129_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2) {
		this.aCanvas4 = arg0;
		this.anInterface2_4 = arg1;
		super.anInt5876 = arg2;
		this.aClass65_1 = Static230.method4090(this.aCanvas4);
		this.anIntArray295 = this.aClass65_1.anIntArray199;
		this.anInt3800 = this.aClass65_1.anInt2990;
		this.anInt3810 = this.aClass65_1.anInt2988;
		this.method3442();
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(IIIII)V")
	@Override
	public void method4990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt3825 || arg1 >= this.anInt3796) {
			return;
		}
		if (arg0 < this.anInt3801) {
			arg2 -= this.anInt3801 - arg0;
			arg0 = this.anInt3801;
		}
		if (arg0 + arg2 > this.anInt3798) {
			arg2 = this.anInt3798 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3800;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray295[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray295[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray295[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray295[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray295[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "()V")
	@Override
	public void method4950() {
		this.anInt3797 = this.anInt3814;
		this.aBoolean244 = false;
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "(I)Z")
	public boolean method3437(@OriginalArg(0) int arg0) {
		return this.anInterface2_4.method2246(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "(I)[I")
	private int[] method3438(@OriginalArg(0) int arg0) {
		@Pc(2) Class26 local2 = this.aClass26_35;
		@Pc(12) Class11_Sub19 local12;
		synchronized (this.aClass26_35) {
			local12 = (Class11_Sub19) this.aClass26_35.method332((long) arg0);
			if (local12 == null) {
				if (!this.anInterface2_4.method2246(arg0)) {
					return null;
				}
				@Pc(32) Class134 local32 = this.anInterface2_4.method2244(arg0);
				@Pc(42) int local42 = local32.aBoolean259 || this.aBoolean243 ? 64 : 128;
				local12 = new Class11_Sub19(arg0, local42, this.anInterface2_4.method2247(local42, 0.7F, local42, arg0), local32.aBoolean254);
				this.aClass26_35.method330((long) arg0, local12);
			}
		}
		local12.aBoolean148 = true;
		return local12.method1916();
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(II)V")
	@Override
	public void method5012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3804 = arg0;
		this.anInt3819 = arg1;
		this.anInt3816 = this.anInt3819 - 255;
		this.method3441();
	}

	@OriginalMember(owner = "client!ma", name = "E", descriptor = "()I")
	@Override
	public int method5000() {
		return 0;
	}

	@OriginalMember(owner = "client!ma", name = "w", descriptor = "()I")
	@Override
	public int method4976() {
		return this.anInt3804;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(IIIIII)Lclient!qe;")
	@Override
	public Class132 method5006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "()Z")
	@Override
	public boolean method4927() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "()Z")
	@Override
	public boolean method4959() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIII)V")
	@Override
	public void method4984(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3801 < arg0) {
			this.anInt3801 = arg0;
		}
		if (this.anInt3825 < arg1) {
			this.anInt3825 = arg1;
		}
		if (this.anInt3798 > arg2) {
			this.anInt3798 = arg2;
		}
		if (this.anInt3796 > arg3) {
			this.anInt3796 = arg3;
		}
		this.method3445();
	}

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "(I)Z")
	public boolean method3439(@OriginalArg(0) int arg0) {
		return this.anInterface2_4.method2244(arg0).aBoolean258;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	@Override
	public void method4919(@OriginalArg(0) boolean arg0) {
		this.aBoolean243 = arg0;
		this.aClass26_35.method333();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt3801) {
			arg2 -= this.anInt3801 - arg0;
			arg0 = this.anInt3801;
		}
		if (arg1 < this.anInt3825) {
			arg3 -= this.anInt3825 - arg1;
			arg1 = this.anInt3825;
		}
		if (arg0 + arg2 > this.anInt3798) {
			arg2 = this.anInt3798 - arg0;
		}
		if (arg1 + arg3 > this.anInt3796) {
			arg3 = this.anInt3796 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt3798 || arg1 > this.anInt3796) {
			return;
		}
		@Pc(67) int local67 = this.anInt3800 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt3800;
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
						local221 = this.anIntArray295[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray295[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray295[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray295[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray295[arg2] = arg4;
					arg2++;
					this.anIntArray295[arg2] = arg4;
					arg2++;
					this.anIntArray295[arg2] = arg4;
					arg2++;
					this.anIntArray295[arg2] = arg4;
					arg2++;
					this.anIntArray295[arg2] = arg4;
					arg2++;
					this.anIntArray295[arg2] = arg4;
					arg2++;
					this.anIntArray295[arg2] = arg4;
					arg2++;
					this.anIntArray295[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray295[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
	@Override
	public void method4964(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3807 = arg0;
		this.anInt3797 = arg1;
		this.anInt3813 = arg2;
	}

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "(I)I")
	public int method3440(@OriginalArg(0) int arg0) {
		return this.anInterface2_4.method2244(arg0).aShort63 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(IIIIII)V")
	@Override
	public void method5015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.method4990(arg0, arg1, arg2, arg4, arg5);
		this.method4990(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.method4947(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.method4947(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "()V")
	@Override
	public void method4968() {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[I[I)Lclient!ep;")
	@Override
	public Class66 method4957(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class66_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!br;IIII)Lclient!mj;")
	@Override
	public Class126 method4929(@OriginalArg(0) Class31 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class126_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(IIII)V")
	@Override
	public void method4996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3799 = arg0;
		this.anInt3821 = arg1;
		this.anInt3811 = arg2;
		this.anInt3812 = arg3;
		this.method3445();
	}

	@OriginalMember(owner = "client!ma", name = "D", descriptor = "()I")
	@Override
	public int method4999() {
		@Pc(2) int local2 = this.anInt3806;
		this.anInt3806 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)Lclient!ip;")
	@Override
	public Class11_Sub22 method4962() {
		return null;
	}

	@OriginalMember(owner = "client!ma", name = "K", descriptor = "()Z")
	@Override
	public boolean method5021() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IFFFFF)V")
	@Override
	public void method4925(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt3805 = (int) (arg1 * 65535.0F);
		this.anInt3823 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt3815 = (int) (arg3 * 65535.0F / local26);
		this.anInt3809 = (int) (arg4 * 65535.0F / local26);
		this.anInt3817 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "()V")
	private void method3441() {
		if (this.aFloat30 == 0.0F) {
			this.anInt3802 = this.anInt3819;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt3819;
		@Pc(12) float local12 = (float) this.anInt3804;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat29 / (this.aFloat30 + this.aFloat29);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat30;
		this.anInt3802 = (int) (((float) this.anInt3819 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "()Z")
	@Override
	public boolean method4921() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "()V")
	@Override
	public void method4943() {
		this.aClass26_35.method333();
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "()V")
	private void method3442() {
		this.aClass26_35 = new Class26(20);
		this.aClass61_Sub1_2 = new Class61_Sub1();
		Static171.method2792(false);
		this.aBoolean242 = true;
		this.method4961(1);
		this.method4953(0);
		this.method4966();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!mj;Lclient!mr;Lclient!ic;Lclient!vf;I)V")
	@Override
	public void method4977(@OriginalArg(0) Class126 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class10_Sub8 arg3) {
		((Class126_Sub1) arg0).method3019(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!ma", name = "l", descriptor = "(I)[I")
	public int[] method3443(@OriginalArg(0) int arg0) {
		@Pc(2) Class26 local2 = this.aClass26_35;
		@Pc(12) Class11_Sub19 local12;
		synchronized (this.aClass26_35) {
			local12 = (Class11_Sub19) this.aClass26_35.method332((long) arg0);
			if (local12 == null) {
				if (!this.anInterface2_4.method2246(arg0)) {
					return null;
				}
				@Pc(32) Class134 local32 = this.anInterface2_4.method2244(arg0);
				@Pc(42) int local42 = local32.aBoolean259 || this.aBoolean243 ? 64 : 128;
				local12 = new Class11_Sub19(arg0, local42, this.anInterface2_4.method2243(local42, 0.7F, true, arg0, local42), local32.aBoolean254);
				this.aClass26_35.method330((long) arg0, local12);
			}
		}
		local12.aBoolean148 = true;
		return local12.method1916();
	}

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "(I)Z")
	public boolean method3444(@OriginalArg(0) int arg0) {
		return this.aBoolean243 || this.anInterface2_4.method2244(arg0).aBoolean259;
	}

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "()V")
	@Override
	public void method5003() {
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!k;[Lclient!lg;Z)Lclient!ai;")
	@Override
	public Class9 method4933(@OriginalArg(0) Class114 arg0, @OriginalArg(1) Class125[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3499;
			local7[local11] = arg1[local11].anInt3501;
			if (arg1[local11].aByteArray50 != null) {
			}
		}
		return new Class9_Sub2(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ip;)V")
	@Override
	public void method4982(@OriginalArg(0) Class11_Sub22 arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "p", descriptor = "()Z")
	@Override
	public boolean method4956() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([Lclient!mj;Lclient!ic;[Lclient!vf;I)V")
	@Override
	public void method4994(@OriginalArg(0) Class126[] arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) Class10_Sub8[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class126_Sub1[] local3 = new Class126_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class126_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class126_Sub1 local26 = Static179.method3014(this, local3);
		local26.method3019(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(FF)V")
	@Override
	public void method4986(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat29 = arg0;
		this.aFloat30 = arg1;
		this.method3441();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4936(@OriginalArg(0) Canvas arg0) {
		this.aCanvas4 = arg0;
		this.method4974();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!qe;Lclient!qe;FLclient!qe;)Lclient!qe;")
	@Override
	public Class132 method4965(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class132 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!mr;)V")
	@Override
	public void method5008(@OriginalArg(0) Class136 arg0) {
		@Pc(3) Class10_Sub3 local3 = arg0.aClass104_1.aClass10_Sub3_7;
		for (@Pc(6) Class10_Sub3 local6 = local3.aClass10_Sub3_6; local6 != local3; local6 = local6.aClass10_Sub3_6) {
			@Pc(10) Class10_Sub3_Sub1 local10 = (Class10_Sub3_Sub1) local6;
			@Pc(15) int local15 = local10.anInt2111 >> 12;
			@Pc(20) int local20 = local10.anInt2110 >> 12;
			@Pc(25) int local25 = local10.anInt2119 >> 12;
			@Pc(49) int local49 = this.aClass61_Sub1_2.anInt1361 + (this.aClass61_Sub1_2.anInt1368 * local15 + this.aClass61_Sub1_2.anInt1363 * local20 + this.aClass61_Sub1_2.anInt1362 * local25 >> 15);
			if (local49 >= this.anInt3804 && local49 <= this.anInt3819) {
				@Pc(90) int local90 = this.anInt3799 + this.anInt3811 * (this.aClass61_Sub1_2.anInt1370 + (this.aClass61_Sub1_2.anInt1369 * local15 + this.aClass61_Sub1_2.anInt1365 * local20 + this.aClass61_Sub1_2.anInt1371 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt3821 + this.anInt3812 * (this.aClass61_Sub1_2.anInt1366 + (this.aClass61_Sub1_2.anInt1360 * local15 + this.aClass61_Sub1_2.anInt1367 * local20 + this.aClass61_Sub1_2.anInt1364 * local25 >> 15)) / local49;
				if (local90 >= this.anInt3801 && local90 <= this.anInt3798 && local122 >= this.anInt3825 && local122 <= this.anInt3796) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method3448(local10, local90, local122, (local10.anInt2117 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "()Lclient!ic;")
	@Override
	public Class61 method4979() {
		@Pc(3) Class184 local3 = this.method3446(Thread.currentThread());
		return local3.aClass61_Sub1_3;
	}

	@OriginalMember(owner = "client!ma", name = "H", descriptor = "()I")
	@Override
	public int method5016() {
		return this.anInt3819;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILclient!ep;II)V")
	@Override
	public void method4970(@OriginalArg(1) Class66 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(2) Class66_Sub1 local2 = (Class66_Sub1) arg0;
		@Pc(5) int[] local5 = local2.anIntArray305;
		@Pc(8) int[] local8 = local2.anIntArray303;
		@Pc(20) int local20;
		if (this.anInt3796 < arg2 + local5.length) {
			local20 = this.anInt3796 - arg2;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt3825 > arg2) {
			local33 = this.anInt3825 - arg2;
			arg2 = this.anInt3825;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg2 * this.anInt3800;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg1 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt3801 > local58) {
				local62 -= this.anInt3801 - local58;
				local58 = this.anInt3801;
			}
			if (this.anInt3798 < local58 + local62) {
				local62 = this.anInt3798 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray295[local58++] = -16777216;
			}
			local49 += this.anInt3800;
		}
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(IIIIII)Z")
	@Override
	public boolean method5014(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass61_Sub1_2.anInt1368 * arg0 + this.aClass61_Sub1_2.anInt1363 * arg1 + this.aClass61_Sub1_2.anInt1362 * arg2 >> 15) + this.aClass61_Sub1_2.anInt1361;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass61_Sub1_2.anInt1368 * arg3 + this.aClass61_Sub1_2.anInt1363 * arg4 + this.aClass61_Sub1_2.anInt1362 * arg5 >> 15) + this.aClass61_Sub1_2.anInt1361;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt3804 && local52 < this.anInt3804 || !(local23 <= this.anInt3819 || local52 <= this.anInt3819)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt3811 * ((this.aClass61_Sub1_2.anInt1369 * arg0 + this.aClass61_Sub1_2.anInt1365 * arg1 + this.aClass61_Sub1_2.anInt1371 * arg2 >> 15) + this.aClass61_Sub1_2.anInt1370) / local23;
		@Pc(133) int local133 = this.anInt3811 * ((this.aClass61_Sub1_2.anInt1369 * arg3 + this.aClass61_Sub1_2.anInt1365 * arg4 + this.aClass61_Sub1_2.anInt1371 * arg5 >> 15) + this.aClass61_Sub1_2.anInt1370) / local52;
		if (local104 < this.anInt3808 && local133 < this.anInt3808 || local104 > this.anInt3818 && local133 > this.anInt3818) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt3812 * ((this.aClass61_Sub1_2.anInt1360 * arg0 + this.aClass61_Sub1_2.anInt1367 * arg1 + this.aClass61_Sub1_2.anInt1364 * arg2 >> 15) + this.aClass61_Sub1_2.anInt1366) / local23;
			@Pc(209) int local209 = this.anInt3812 * ((this.aClass61_Sub1_2.anInt1360 * arg3 + this.aClass61_Sub1_2.anInt1367 * arg4 + this.aClass61_Sub1_2.anInt1364 * arg5 >> 15) + this.aClass61_Sub1_2.anInt1366) / local52;
			return (local180 >= this.anInt3795 || local209 >= this.anInt3795) && (local180 <= this.anInt3824 || local209 <= this.anInt3824);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[[I[[IIII)Lclient!ij;")
	@Override
	public Class77 method4948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class77_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "()V")
	private void method3445() {
		this.anInt3808 = this.anInt3801 - this.anInt3799;
		this.anInt3818 = this.anInt3798 - this.anInt3799;
		this.anInt3795 = this.anInt3825 - this.anInt3821;
		this.anInt3824 = this.anInt3796 - this.anInt3821;
		for (@Pc(29) int local29 = 0; local29 < this.anInt3803; local29++) {
			@Pc(36) Class148 local36 = this.aClass184Array1[local29].aClass148_2;
			local36.anInt4559 = this.anInt3799 - this.anInt3801;
			local36.anInt4558 = this.anInt3821 - this.anInt3825;
			local36.anInt4556 = this.anInt3798 - this.anInt3801;
			local36.anInt4555 = this.anInt3796 - this.anInt3825;
		}
		@Pc(78) int local78 = this.anInt3825 * this.anInt3800 + this.anInt3801;
		for (@Pc(81) int local81 = this.anInt3825; local81 < this.anInt3796; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt3803; local84++) {
				this.aClass184Array1[local84].aClass148_2.anIntArray347[local81 - this.anInt3825] = local78;
			}
			local78 += this.anInt3800;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(F)V")
	@Override
	public void method4937(@OriginalArg(0) float arg0) {
		this.anInt3826 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "()Z")
	@Override
	public boolean method5022() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4997(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas4 == null || this.aClass65_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas4.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt3800 && local21.y <= this.anInt3810 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass65_1.method2526(local21.height, local21.x, local21.width, local14, local21.y);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "()Z")
	@Override
	public boolean method4932() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	@Override
	public void method4961(@OriginalArg(0) int arg0) {
		if (this.anInt3803 == arg0) {
			return;
		}
		this.anInt3803 = arg0;
		this.aClass184Array1 = new Class184[this.anInt3803];
		for (@Pc(14) int local14 = 0; local14 < this.anInt3803; local14++) {
			this.aClass184Array1[local14] = new Class184(this);
		}
	}

	@OriginalMember(owner = "client!ma", name = "s", descriptor = "()V")
	@Override
	public void method4967() {
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
	@Override
	public void method4995(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "()F")
	@Override
	public float method4922() {
		return this.aFloat30;
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(I)V")
	@Override
	public void method4969(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt3822;
		for (@Pc(9) Object local9 = this.aClass26_35.method327(); local9 != null; local9 = this.aClass26_35.method336()) {
			@Pc(13) Class11_Sub19 local13 = (Class11_Sub19) local9;
			if (local13.aBoolean148) {
				local13.anInt2304 += local4;
				@Pc(27) int local27 = local13.anInt2304 / 20;
				if (local27 > 0) {
					@Pc(36) Class134 local36 = this.anInterface2_4.method2244(local13.anInt2305);
					local13.method1915(local36.aByte46 * local4 * 50 / 1000, local36.aByte45 * local4 * 50 / 1000);
					local13.anInt2304 -= local27 * 20;
				}
				local13.aBoolean148 = false;
			}
		}
		this.anInt3822 = arg0;
		this.aClass26_34.method329(5);
	}

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "()Z")
	@Override
	public boolean method4954() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "h", descriptor = "()V")
	@Override
	protected void method4928() {
		if (this.aBoolean242) {
			Static13.method184(false);
			this.aBoolean242 = false;
		}
		this.aCanvas4 = null;
		this.anInterface2_4 = null;
		this.aClass65_1 = null;
		this.aBoolean240 = true;
	}

	@OriginalMember(owner = "client!ma", name = "A", descriptor = "()Lclient!ic;")
	@Override
	public Class61 method4983() {
		return new Class61_Sub1();
	}

	@OriginalMember(owner = "client!ma", name = "C", descriptor = "()Z")
	@Override
	public boolean method4992() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
	@Override
	public void method4924(@OriginalArg(0) int arg0) {
		this.aClass184Array1[arg0].method4882(null);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!sp;")
	public Class184 method3446(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3803; local1++) {
			if (this.aClass184Array1[local1].aRunnable1 == arg0) {
				return this.aClass184Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!lg;Z)Lclient!sg;")
	@Override
	public Class97 method5018(@OriginalArg(0) Class125 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray226;
		@Pc(5) byte[] local5 = arg0.aByteArray49;
		@Pc(8) int local8 = arg0.anInt3499;
		@Pc(11) int local11 = arg0.anInt3501;
		@Pc(76) Class97_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray50 == null) {
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
			local76 = new Class97_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray50;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class97_Sub1_Sub2(this, local20, local8, local11);
				local76 = new Class97_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class97_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.method5549(arg0.anInt3496, arg0.anInt3498, arg0.anInt3500, arg0.anInt3497);
		return local76;
	}

	@OriginalMember(owner = "client!ma", name = "z", descriptor = "()F")
	@Override
	public float method4981() {
		return this.aFloat29;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([I)V")
	@Override
	public void method4920(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3801;
		arg0[1] = this.anInt3825;
		arg0[2] = this.anInt3798;
		arg0[3] = this.anInt3796;
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)I")
	@Override
	public int method4989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!ma", name = "v", descriptor = "()Z")
	@Override
	public boolean method4975() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)V")
	@Override
	public void method4953(@OriginalArg(0) int arg0) {
		this.aClass184Array1[arg0].method4882(Thread.currentThread());
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(III)V")
	@Override
	public void method5019() {
		this.anInt3814 = this.anInt3797;
		this.anInt3807 = -1;
		this.anInt3797 = 1583160;
		this.anInt3813 = 40;
		this.aBoolean244 = true;
	}

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "()Z")
	public boolean method3447() {
		return this.aBoolean240;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[Lclient!bh;)V")
	@Override
	public void method4963(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub5[] arg1) {
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
	@Override
	public void method4930(@OriginalArg(0) int arg0) {
		this.method4945(0, 0, this.anInt3800, this.anInt3810, arg0, 0);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(III[I)V")
	@Override
	public void method4972(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass61_Sub1_2.anInt1361 + (this.aClass61_Sub1_2.anInt1368 * arg0 + this.aClass61_Sub1_2.anInt1363 * arg1 + this.aClass61_Sub1_2.anInt1362 * arg2 >> 15);
		if (local23 < this.anInt3804 || local23 > this.anInt3819) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt3811 * (this.aClass61_Sub1_2.anInt1370 + (this.aClass61_Sub1_2.anInt1369 * arg0 + this.aClass61_Sub1_2.anInt1365 * arg1 + this.aClass61_Sub1_2.anInt1371 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt3812 * (this.aClass61_Sub1_2.anInt1366 + (this.aClass61_Sub1_2.anInt1360 * arg0 + this.aClass61_Sub1_2.anInt1367 * arg1 + this.aClass61_Sub1_2.anInt1364 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt3808 && local73 <= this.anInt3818 && local102 >= this.anInt3795 && local102 <= this.anInt3824) {
			arg3[0] = local73 - this.anInt3808;
			arg3[1] = local102 - this.anInt3795;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII[BII)V")
	@Override
	public void method4988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt3800;
		@Pc(35) int local35 = this.anInt3800 - arg2;
		if (arg1 + arg3 > this.anInt3796) {
			arg3 -= arg1 + arg3 - this.anInt3796;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt3825) {
			local59 = this.anInt3825 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt3800;
			local8 = local23 * local59;
		}
		if (arg0 + arg2 > this.anInt3798) {
			local59 = arg0 + arg2 - this.anInt3798;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt3801) {
			local59 = this.anInt3801 - arg0;
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
						this.anIntArray295[local30++] = arg4;
					} else {
						this.anIntArray295[local30++] = arg5;
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
					local245 = this.anIntArray295[local30];
					this.anIntArray295[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray295[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray295[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIZ)Lclient!sg;")
	@Override
	public Class97 method4960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt3800 + arg0;
		@Pc(16) int local16 = this.anInt3800 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray295[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class97_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class97_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!ma", name = "G", descriptor = "()V")
	@Override
	public void method5009() {
		if (this.aCanvas4 == null || this.aClass65_1 == null) {
			throw new IllegalStateException("Can't flip an offscreen toolkit");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas4.getGraphics();
			this.aClass65_1.method2523(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas4.repaint();
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method4951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method4990(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.method4990(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt3801) {
					arg1 += local104 * (this.anInt3801 - arg0);
					arg0 = this.anInt3801;
				}
				if (arg2 >= this.anInt3798) {
					arg2 = this.anInt3798 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt3825 && local150 < this.anInt3796) {
							this.anIntArray295[arg0 + local150 * this.anInt3800] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt3825 && local213 < this.anInt3796) {
							local228 = arg0 + local213 * this.anInt3800;
							local233 = this.anIntArray295[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray295[local228] = local204 + local233;
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
				if (arg1 < this.anInt3825) {
					arg0 += local104 * (this.anInt3825 - arg1);
					arg1 = this.anInt3825;
				}
				if (arg3 >= this.anInt3796) {
					arg3 = this.anInt3796 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt3801 && local150 < this.anInt3798) {
							this.anIntArray295[local150 + arg1 * this.anInt3800] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt3801 && local213 < this.anInt3798) {
							local228 = local213 + arg1 * this.anInt3800;
							local233 = this.anIntArray295[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray295[local213 + arg1 * this.anInt3800] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.method4947(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.method4947(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)V")
	@Override
	public void method4955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3797 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt3797 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt3797 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt3797 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt3797 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean241 = false;
		} else {
			this.aBoolean241 = true;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5011() {
		@Pc(3) Class184 local3 = this.method3446(Thread.currentThread());
		@Pc(6) Class148 local6 = local3.aClass148_2;
		local6.aBoolean303 = false;
		local6.aBoolean303 = false;
		local6.anInt4560 = 0;
		local6.aBoolean301 = true;
		local6.method4006(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean303 = true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ua;III)V")
	public void method3448(@OriginalArg(0) Class10_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg3 >> 1;
		@Pc(6) int local6 = arg0.anInt2115;
		if (local6 == -1) {
			this.method4942(arg1, arg2, local3, arg0.anInt2113);
			return;
		}
		if (this.lb == null || this.lb.aLong215 != (long) local6) {
			this.lb = (Class11_Sub26) this.aClass26_34.method332((long) local6);
		}
		if (this.lb == null) {
			@Pc(44) int[] local44 = this.method3438(local6);
			if (local44 == null) {
				return;
			}
			this.lb = new Class11_Sub26();
			this.lb.aBoolean231 = this.method3444(local6);
			@Pc(65) int local65 = this.lb.aBoolean231 ? 64 : 128;
			this.lb.aClass97_13 = this.method4958(local44, local65, local65, local65);
			this.aClass26_34.method330((long) local6, this.lb);
		}
		if (this.lb.aBoolean231) {
			local3 <<= 0x1;
			arg3 <<= 0x1;
		}
		this.lb.aClass97_13.method5550(arg1 - local3, arg2 - local3, arg3, arg3, 1, arg0.anInt2113, 1);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([Lclient!mj;Lclient!mr;Lclient!ic;[Lclient!vf;I)V")
	@Override
	public void method5004(@OriginalArg(0) Class126[] arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class10_Sub8[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class126_Sub1[] local3 = new Class126_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class126_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class126_Sub1 local26 = Static179.method3014(this, local3);
		local26.method3019(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "k", descriptor = "()Z")
	@Override
	public boolean method4939() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "j", descriptor = "()Z")
	@Override
	public boolean method4935() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ic;)V")
	@Override
	public void method4971(@OriginalArg(0) Class61 arg0) {
		this.aClass61_Sub1_2 = (Class61_Sub1) arg0;
	}

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "()Z")
	@Override
	public boolean method4987() {
		return true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "([IIIII)Lclient!sg;")
	@Override
	public Class97 method4958(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class97_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class97_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class97_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class97_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ma", name = "u", descriptor = "()V")
	@Override
	public void method4974() {
		this.aClass65_1 = Static230.method4090(this.aCanvas4);
		this.anIntArray295 = this.aClass65_1.anIntArray199;
		this.anInt3800 = this.aClass65_1.anInt2990;
		this.anInt3810 = this.aClass65_1.anInt2988;
		for (@Pc(22) int local22 = 0; local22 < this.anInt3803; local22++) {
			this.aClass184Array1[local22].method4883();
		}
		this.method4966();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!qe;)V")
	@Override
	public void method4973(@OriginalArg(0) Class132 arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "()I")
	@Override
	public int method4980() {
		@Pc(2) int local2 = this.anInt3820;
		this.anInt3820 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIILclient!ep;II)V")
	@Override
	public void method4931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class66 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class66_Sub1 local2 = (Class66_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray305;
		@Pc(8) int[] local8 = local2.anIntArray303;
		@Pc(17) int local17 = this.anInt3825 > arg7 ? this.anInt3825 : arg7;
		@Pc(32) int local32 = this.anInt3796 < arg7 + local5.length ? this.anInt3796 : arg7 + local5.length;
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
					if (local129 >= this.anInt3801 && local129 < this.anInt3798 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray295[local129 + arg1 * this.anInt3800] = arg4;
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
					if (local133 >= this.anInt3801 && local133 < this.anInt3798 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt3800;
						local248 = this.anIntArray295[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray295[local133 + arg1 * this.anInt3800] = local201 + local584;
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
		if (arg0 < this.anInt3801) {
			arg1 += local83 * (this.anInt3801 - arg0);
			arg0 = this.anInt3801;
		}
		if (arg2 >= this.anInt3798) {
			arg2 = this.anInt3798 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray295[arg0 + local129 * this.anInt3800] = arg4;
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
					local243 = arg0 + local133 * this.anInt3800;
					local248 = this.anIntArray295[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray295[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIIII)V")
	@Override
	protected void method4942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt3825) {
			local8 = this.anInt3825;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt3796) {
			local21 = this.anInt3796;
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
				if (local91 < this.anInt3801) {
					local91 = this.anInt3801;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3798) {
					local102 = this.anInt3798;
				}
				local116 = local91 + local30 * this.anInt3800;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray295[local116++] = arg3;
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
				if (local91 < this.anInt3801) {
					local91 = this.anInt3801;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3798 - 1) {
					local102 = this.anInt3798 - 1;
				}
				local116 = local91 + local30 * this.anInt3800;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray295[local116++] = arg3;
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
			if (local102 < this.anInt3801) {
				local102 = this.anInt3801;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt3798) {
				local116 = this.anInt3798;
			}
			local118 = local102 + local30 * this.anInt3800;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray295[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray295[local118++] = local277 + local360;
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
			if (local102 < this.anInt3801) {
				local102 = this.anInt3801;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt3798 - 1) {
				local116 = this.anInt3798 - 1;
			}
			local118 = local102 + local30 * this.anInt3800;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray295[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray295[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class184 local3 = this.method3446(Thread.currentThread());
		@Pc(6) Class148 local6 = local3.aClass148_2;
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
		@Pc(93) int local93 = arg0 - local6.method4005();
		@Pc(98) int local98 = arg1 - local6.method4017();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt4560 = 0;
		local6.aBoolean301 = local102 < 0 || local102 > local6.anInt4556 || local106 < 0 || local106 > local6.anInt4556 || local112 < 0 || local112 > local6.anInt4556;
		local6.method4008(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean301 = local102 < 0 || local102 > local6.anInt4556 || local106 < 0 || local106 > local6.anInt4556 || local118 < 0 || local118 > local6.anInt4556;
		local6.method4008(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!ma", name = "m", descriptor = "()V")
	@Override
	public void method4944() {
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt3800) {
			arg2 = this.anInt3800;
		}
		if (arg3 > this.anInt3810) {
			arg3 = this.anInt3810;
		}
		this.anInt3801 = arg0;
		this.anInt3798 = arg2;
		this.anInt3825 = arg1;
		this.anInt3796 = arg3;
		this.method3445();
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(Z)V")
	@Override
	public void method5002(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(IIIII)V")
	@Override
	public void method4947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt3801 || arg0 >= this.anInt3798) {
			return;
		}
		if (arg1 < this.anInt3825) {
			arg2 -= this.anInt3825 - arg1;
			arg1 = this.anInt3825;
		}
		if (arg1 + arg2 > this.anInt3796) {
			arg2 = this.anInt3796 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3800;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray295[local40 + local54 * this.anInt3800] = arg3;
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
				local111 = local40 + local103 * this.anInt3800;
				local116 = this.anIntArray295[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray295[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt3800;
				local111 = this.anIntArray295[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray295[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)I")
	@Override
	public int method4938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x10400;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!ma", name = "I", descriptor = "()Z")
	@Override
	public boolean method5017() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "J", descriptor = "()Z")
	@Override
	public boolean method5020() {
		return false;
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(IIII)[I")
	@Override
	public int[] method5001() {
		@Pc(4) int[] local4 = new int[1152];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			@Pc(18) int local18 = local8 * this.anInt3800;
			for (@Pc(20) int local20 = 0; local20 < 36; local20++) {
				local4[local6++] = this.anIntArray295[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!ma", name = "r", descriptor = "()V")
	@Override
	public void method4966() {
		this.anInt3801 = 0;
		this.anInt3825 = 0;
		this.anInt3798 = this.anInt3800;
		this.anInt3796 = this.anInt3810;
		this.method3445();
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5005(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "()I")
	@Override
	public int method4923() {
		return 0;
	}
}
