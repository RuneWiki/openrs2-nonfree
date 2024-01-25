import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
	private int anInt8760;

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
	private int anInt8761;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "Lclient!mj;")
	public Class3_Sub12 aClass3_Sub12_1;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas14;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
	public int anInt8763;

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
	public int anInt8765;

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
	public int anInt8766;

	@OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
	private int anInt8770;

	@OriginalMember(owner = "client!sa", name = "H", descriptor = "[F")
	public float[] aFloatArray73;

	@OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
	private int anInt8771;

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
	public int anInt8774;

	@OriginalMember(owner = "client!sa", name = "N", descriptor = "Lclient!pv;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "[I")
	public int[] anIntArray539;

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
	public int anInt8776;

	@OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
	public int anInt8777;

	@OriginalMember(owner = "client!sa", name = "S", descriptor = "[Lclient!lfa;")
	private Class203[] aClass203Array1;

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
	public int anInt8778;

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
	private int anInt8780;

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
	public int anInt8781;

	@OriginalMember(owner = "client!sa", name = "Z", descriptor = "[F")
	public float[] aFloatArray74;

	@OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
	public int anInt8783;

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
	private int anInt8784;

	@OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
	private int anInt8785;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
	public int anInt8787;

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
	public int anInt8789;

	@OriginalMember(owner = "client!sa", name = "mb", descriptor = "Lclient!td;")
	private Class24 aClass24_30;

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "Z")
	private boolean aBoolean624;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Z")
	private boolean aBoolean625;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "Lclient!qp;")
	private Class280 aClass280_41;

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
	private int anInt8767;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
	public int anInt8764;

	@OriginalMember(owner = "client!sa", name = "F", descriptor = "I")
	public int anInt8769;

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
	public int anInt8782;

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
	public int anInt8779;

	@OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
	public int anInt8772;

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
	public int anInt8773;

	@OriginalMember(owner = "client!sa", name = "V", descriptor = "Z")
	private boolean aBoolean626;

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
	public int anInt8768;

	@OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
	public int anInt8786;

	@OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
	public int anInt8788;

	@OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
	public int anInt8775;

	@OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
	public int anInt8790;

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "I")
	private int anInt8791;

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lclient!fba;")
	private final Class102 aClass102_55;

	@OriginalMember(owner = "client!sa", name = "nb", descriptor = "I")
	private int anInt8792;

	@OriginalMember(owner = "client!sa", name = "bb", descriptor = "Lclient!fba;")
	private final Class102 aClass102_54;

	@OriginalMember(owner = "client!sa", name = "L", descriptor = "Lclient!rda;")
	public Class39_Sub3 aClass39_Sub3_3;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
	private int anInt8762;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class5_Sub3(@OriginalArg(0) Interface7 arg0) {
		super(arg0);
		this.aBoolean624 = false;
		this.aBoolean625 = false;
		this.aClass280_41 = new Class280(4);
		this.anInt8767 = 0;
		this.anInt8764 = 512;
		this.anInt8769 = 0;
		this.anInt8782 = 0;
		this.anInt8779 = 75518;
		this.anInt8772 = 78642;
		this.anInt8773 = 512;
		this.aBoolean626 = false;
		this.anInt8768 = 45823;
		this.anInt8786 = 0;
		this.anInt8788 = 0;
		this.anInt8775 = 50;
		this.anInt8790 = 128;
		this.anInt8791 = 0;
		this.lb = 3500;
		this.aClass102_55 = new Class102(16);
		this.anInt8792 = -1;
		this.aClass102_54 = new Class102(256);
		this.aClass39_Sub3_3 = new Class39_Sub3();
		this.method7510(1);
		this.method7502(0);
		Static335.method5470(true, true);
		this.aBoolean625 = true;
		this.anInt8762 = (int) Static374.method6036();
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class5_Sub3(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		this.method7520(arg0, arg2, arg3);
		this.method7539(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8782 < arg0) {
			this.anInt8782 = arg0;
		}
		if (this.anInt8786 < arg1) {
			this.anInt8786 = arg1;
		}
		if (this.anInt8788 > arg2) {
			this.anInt8788 = arg2;
		}
		if (this.anInt8769 > arg3) {
			this.anInt8769 = arg3;
		}
		this.method7579();
	}

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "(I)V")
	@Override
	public void method7561(@OriginalArg(0) int arg0) {
		this.anInt8790 = arg0;
		this.aClass102_54.method2681();
	}

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "()Z")
	@Override
	public boolean method7559() {
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7554(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub12 local8 = (Class3_Sub12) this.aClass280_41.method7107((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8769();
		local8 = Static604.method8437(arg2, arg1, arg0);
		this.aClass280_41.method7109(local8, (long) arg0.hashCode());
		if (this.aCanvas14 != arg0 || this.aClass267_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt8761 = local37.width;
		this.anInt8760 = local37.height;
		this.aClass3_Sub12_1 = local8;
		this.anIntArray539 = local8.anIntArray406;
		this.anInt8789 = local8.anInt6770;
		this.anInt8785 = local8.anInt6771;
		if (this.anInt8789 != this.anInt8771 || this.anInt8785 != this.anInt8784) {
			this.anInt8780 = this.anInt8771 = this.anInt8789;
			this.anInt8770 = this.anInt8784 = this.anInt8785;
			this.aFloatArray74 = this.aFloatArray73 = new float[this.anInt8771 * this.anInt8784];
		}
		this.method7577();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!nb;IIII)V")
	private void method7570(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt7718;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method7572(arg1, arg2, arg3, arg4, arg0.anInt7717, 1);
			return;
		}
		if (this.anInt8792 != local2) {
			@Pc(33) Class24 local33 = (Class24) this.aClass102_55.method2677((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method7581(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method7573(local2) ? 64 : this.anInt8790;
				local33 = this.method7536(local39, local50, local50, local50);
				this.aClass102_55.method2674((long) local2, local33);
			}
			this.anInt8792 = local2;
			this.aClass24_30 = local33;
		}
		local8++;
		((Class24_Sub1) this.aClass24_30).method8583(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt7717, 1);
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "()Z")
	public boolean method7571() {
		return this.aBoolean624;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!up;Lclient!rga;)Lclient!dv;")
	@Override
	public Interface8 method7512(@OriginalArg(0) Interface25 arg0, @OriginalArg(1) Interface18 arg1) {
		return new Class267(this, (Class24) arg0, (Class276) arg1);
	}

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray345;
		@Pc(8) int[] local8 = local2.anIntArray343;
		@Pc(20) int local20;
		if (this.anInt8769 < arg3 + local5.length) {
			local20 = this.anInt8769 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt8786 > arg3) {
			local33 = this.anInt8786 - arg3;
			arg3 = this.anInt8786;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt8789;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt8782 > local58) {
				local62 -= this.anInt8782 - local58;
				local58 = this.anInt8782;
			}
			if (this.anInt8788 < local58 + local62) {
				local62 = this.anInt8788 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray539[local58++] = arg0;
			}
			local49 += this.anInt8789;
		}
	}

	@OriginalMember(owner = "client!sa", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass203Array1.length; local1++) {
			this.aClass203Array1[local1].anInt5963 = this.aClass203Array1[local1].anInt5969;
			this.aClass203Array1[local1].anInt5962 = arg0;
			this.aClass203Array1[local1].anInt5969 = arg1;
			this.aClass203Array1[local1].anInt5966 = arg2;
			this.aClass203Array1[local1].aBoolean424 = true;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray345;
		@Pc(8) int[] local8 = local2.anIntArray343;
		@Pc(17) int local17 = this.anInt8786 > arg7 ? this.anInt8786 : arg7;
		@Pc(32) int local32 = this.anInt8769 < arg7 + local5.length ? this.anInt8769 : arg7 + local5.length;
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
					if (local129 >= this.anInt8782 && local129 < this.anInt8788 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray539[local129 + arg1 * this.anInt8789] = arg4;
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
					if (local133 >= this.anInt8782 && local133 < this.anInt8788 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt8789;
						local248 = this.anIntArray539[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray539[local133 + arg1 * this.anInt8789] = local201 + local584;
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
		if (arg0 < this.anInt8782) {
			arg1 += local83 * (this.anInt8782 - arg0);
			arg0 = this.anInt8782;
		}
		if (arg2 >= this.anInt8788) {
			arg2 = this.anInt8788 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray539[arg0 + local129 * this.anInt8789] = arg4;
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
					local243 = arg0 + local133 * this.anInt8789;
					local248 = this.anIntArray539[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray539[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!sa", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt8786 || arg1 >= this.anInt8769) {
			return;
		}
		if (arg0 < this.anInt8782) {
			arg2 -= this.anInt8782 - arg0;
			arg0 = this.anInt8782;
		}
		if (arg0 + arg2 > this.anInt8788) {
			arg2 = this.anInt8788 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8789;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray539[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray539[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray539[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray539[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray539[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7533() {
		@Pc(3) Class203 local3 = this.method7578(Thread.currentThread());
		@Pc(6) Class341 local6 = local3.aClass341_1;
		local6.aBoolean683 = false;
		@Pc(14) int local14 = 5 - this.anInt8766;
		@Pc(19) int local19 = 75 - this.anInt8766;
		@Pc(24) int local24 = 15 - this.anInt8766;
		@Pc(29) int local29 = 10 - this.anInt8778;
		@Pc(34) int local34 = 50 - this.anInt8778;
		@Pc(39) int local39 = 90 - this.anInt8778;
		local6.aBoolean680 = local14 < 0 || local14 > local6.anInt9531 || local19 < 0 || local19 > local6.anInt9531 || local24 < 0 || local24 > local6.anInt9531;
		local6.anInt9536 = 0;
		local6.aBoolean684 = false;
		local6.method8219((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean683 = true;
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(IIIIII)V")
	private void method7572(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt8786) {
			local8 = this.anInt8786;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt8769) {
			local21 = this.anInt8769;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg3 * arg3;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg4 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (arg5 == 0 || arg5 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt8782) {
					local91 = this.anInt8782;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8788) {
					local102 = this.anInt8788;
				}
				local116 = local91 + local30 * this.anInt8789;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray73[local116]) {
						this.anIntArray539[local116] = arg4;
					}
					local116++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt8782) {
					local91 = this.anInt8782;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8788 - 1) {
					local102 = this.anInt8788 - 1;
				}
				local116 = local91 + local30 * this.anInt8789;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray73[local116]) {
						this.anIntArray539[local116] = arg4;
					}
					local116++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(350) int local350;
		@Pc(364) int local364;
		if (arg5 == 1) {
			@Pc(293) int local293 = ((arg4 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt8782) {
					local102 = this.anInt8782;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt8788) {
					local116 = this.anInt8788;
				}
				local118 = local102 + local30 * this.anInt8789;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray73[local118]) {
						local364 = this.anIntArray539[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray539[local118] = local293 + local364;
					}
					local118++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local102 = arg0 - local36;
				if (local102 < this.anInt8782) {
					local102 = this.anInt8782;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt8788 - 1) {
					local116 = this.anInt8788 - 1;
				}
				local118 = local102 + local30 * this.anInt8789;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray73[local118]) {
						local364 = this.anIntArray539[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray539[local118] = local293 + local364;
					}
					local118++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg5 == 2) {
			@Pc(633) int local633;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt8782) {
					local91 = this.anInt8782;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8788) {
					local102 = this.anInt8788;
				}
				local116 = local91 + local30 * this.anInt8789;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray73[local116]) {
						local350 = this.anIntArray539[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray539[local116] = local364 - local643 | local643 - (local643 >>> 8);
					}
					local116++;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg3;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg3;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt8782) {
					local91 = this.anInt8782;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8788 - 1) {
					local102 = this.anInt8788 - 1;
				}
				local116 = local91 + local30 * this.anInt8789;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray73[local116]) {
						local350 = this.anIntArray539[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray539[local116] = local364 - local350 | local350 - (local350 >>> 8);
					}
					local116++;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sa", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt8789 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt8771 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray539;
		@Pc(24) float[] local24 = this.aFloatArray73;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static653.method6859(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static653.method6859(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static653.method6854(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static653.method6854(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "()Z")
	@Override
	public boolean method7529() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt8782 || arg0 >= this.anInt8788) {
			return;
		}
		if (arg1 < this.anInt8786) {
			arg2 -= this.anInt8786 - arg1;
			arg1 = this.anInt8786;
		}
		if (arg1 + arg2 > this.anInt8769) {
			arg2 = this.anInt8769 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8789;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray539[local40 + local54 * this.anInt8789] = arg3;
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
				local111 = local40 + local103 * this.anInt8789;
				local116 = this.anIntArray539[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray539[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt8789;
				local111 = this.anIntArray539[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray539[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ffa;Z)Lclient!td;")
	@Override
	public Class24 method7525(@OriginalArg(0) Class107 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray143;
		@Pc(5) byte[] local5 = arg0.aByteArray28;
		@Pc(8) int local8 = arg0.anInt3006;
		@Pc(11) int local11 = arg0.anInt3008;
		@Pc(76) Class24_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray29 == null) {
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
			local76 = new Class24_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray29;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class24_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class24_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.method8569(arg0.anInt3005, arg0.anInt3003, arg0.anInt3007, arg0.anInt3004);
		return local76;
	}

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "()Z")
	@Override
	public boolean method7568() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method7504(@OriginalArg(0) Class39 arg0) {
		this.aClass39_Sub3_3 = (Class39_Sub3) arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7539(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas14 = null;
			this.aClass3_Sub12_1 = null;
			if (this.aClass267_1 == null) {
				this.anIntArray539 = null;
				this.anInt8789 = this.anInt8785 = 1;
				this.anInt8771 = this.anInt8784 = 1;
				this.method7577();
			}
			return;
		}
		@Pc(10) Class3_Sub12 local10 = (Class3_Sub12) this.aClass280_41.method7107((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas14 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt8761 = local18.width;
		this.anInt8760 = local18.height;
		this.aClass3_Sub12_1 = local10;
		if (this.aClass267_1 != null) {
			return;
		}
		this.anIntArray539 = local10.anIntArray406;
		this.anInt8789 = local10.anInt6770;
		this.anInt8785 = local10.anInt6771;
		if (this.anInt8789 != this.anInt8771 || this.anInt8785 != this.anInt8784) {
			this.anInt8780 = this.anInt8771 = this.anInt8789;
			this.anInt8770 = this.anInt8784 = this.anInt8785;
			this.aFloatArray74 = this.aFloatArray73 = new float[this.anInt8771 * this.anInt8784];
		}
		this.method7577();
		return;
	}

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "()Z")
	@Override
	public boolean method7549() {
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub1 local2 = (Class1_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray345;
		@Pc(8) int[] local8 = local2.anIntArray343;
		@Pc(17) int local17 = this.anInt8786 > arg7 ? this.anInt8786 : arg7;
		@Pc(32) int local32 = this.anInt8769 < arg7 + local5.length ? this.anInt8769 : arg7 + local5.length;
		@Pc(36) int local36 = arg10 << 8;
		@Pc(40) int local40 = arg8 << 8;
		@Pc(44) int local44 = arg9 << 8;
		@Pc(48) int local48 = local40 + local44;
		arg10 = local36 % local48;
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (arg2 + arg3 < 0) {
			local77 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
			local81 = local77 % local48;
			local36 = local48 + local40 - arg10 - local81;
			arg10 = local36 % local48;
			if (arg10 < 0) {
				arg10 += local48;
			}
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(159) int local159;
		@Pc(172) int local172;
		@Pc(176) int local176;
		@Pc(199) int local199;
		@Pc(299) int local299;
		@Pc(316) int local316;
		@Pc(142) int local142;
		@Pc(128) int local128;
		@Pc(263) int local263;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			local142 = arg2 << 16;
			local77 = (int) Math.floor((double) local142 / (double) arg3 + 0.5D);
			local81 = (int) Math.sqrt((double) ((local77 >> 8) * (local77 >> 8) + 65536));
			local128 = arg3 + arg1;
			local159 = arg4 >>> 24;
			if (local159 == 255) {
				while (arg1 <= local128) {
					local172 = arg0 >> 16;
					local176 = arg1 - arg7;
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt8782 && local172 < this.anInt8788 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray539[local172 + arg1 * this.anInt8789] = arg4;
					}
					arg0 += local77;
					arg1++;
					local36 = arg10 + local81;
					arg10 = local36 % local48;
				}
			} else {
				local263 = ((arg4 & 0xFF00FF) * local159 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local159 >> 8 & 0xFF00) + (local159 << 24);
				local172 = 256 - local159;
				while (arg1 <= local128) {
					local176 = arg0 >> 16;
					local199 = arg1 - arg7;
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt8782 && local176 < this.anInt8788 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt8789;
						local316 = this.anIntArray539[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray539[local176 + arg1 * this.anInt8789] = local263 + local707;
					}
					arg0 += local77;
					arg1++;
					local36 = arg10 + local81;
					arg10 = local36 % local48;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		local128 = arg3 << 16;
		local77 = (int) Math.floor((double) local128 / (double) arg2 + 0.5D);
		local142 = arg2 + arg0;
		local81 = arg4 >>> 24;
		local159 = (int) Math.sqrt((double) ((local77 >> 8) * (local77 >> 8) + 65536));
		if (local81 == 255) {
			while (arg0 <= local142) {
				local172 = arg1 >> 16;
				local176 = local172 - arg7;
				if (arg0 >= this.anInt8782 && arg0 < this.anInt8788 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray539[arg0 + local172 * this.anInt8789] = arg4;
					}
				}
				arg1 += local77;
				arg0++;
				local36 = arg10 + local159;
				arg10 = local36 % local48;
			}
			return;
		}
		local263 = ((arg4 & 0xFF00FF) * local81 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local81 >> 8 & 0xFF00) + (local81 << 24);
		local172 = 256 - local81;
		while (arg0 <= local142) {
			local176 = arg1 >> 16;
			local199 = local176 - arg7;
			if (arg0 >= this.anInt8782 && arg0 < this.anInt8788 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt8789;
					@Pc(321) int local321 = this.anIntArray539[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray539[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!sa", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt8782 = 0;
		this.anInt8786 = 0;
		this.anInt8788 = this.anInt8789;
		this.anInt8769 = this.anInt8785;
		this.method7579();
	}

	@OriginalMember(owner = "client!sa", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass39_Sub3_3.aFloat188 + this.aClass39_Sub3_3.aFloat192 * (float) arg0 + this.aClass39_Sub3_3.aFloat193 * (float) arg1 + this.aClass39_Sub3_3.aFloat189 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt8764 * (this.aClass39_Sub3_3.aFloat194 + this.aClass39_Sub3_3.aFloat196 * (float) arg0 + this.aClass39_Sub3_3.aFloat195 * (float) arg1 + this.aClass39_Sub3_3.aFloat191 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt8773 * (this.aClass39_Sub3_3.aFloat187 + this.aClass39_Sub3_3.aFloat198 * (float) arg0 + this.aClass39_Sub3_3.aFloat190 * (float) arg1 + this.aClass39_Sub3_3.aFloat197 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt8766;
		arg3[1] = local105 - this.anInt8778;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!sa", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt8791;
		this.anInt8791 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ss;Lclient!ss;FLclient!ss;)Lclient!ss;")
	@Override
	public Class205 method7564(@OriginalArg(0) Class205 arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class205 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt8779 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt8767;
		this.anInt8767 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!sa", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt8789 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray539[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7523(@OriginalArg(0) Class3_Sub5 arg0) {
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)Z")
	public boolean method7573(@OriginalArg(0) int arg0) {
		return this.aBoolean626 || super.anInterface7_15.method8118(arg0).aBoolean364;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "()Z")
	@Override
	public boolean method7497() {
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method7537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
			@Pc(309) int local309;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt8782) {
					arg1 += local104 * (this.anInt8782 - arg0);
					arg0 = this.anInt8782;
				}
				if (arg2 >= this.anInt8788) {
					arg2 = this.anInt8788 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8786 && local150 < this.anInt8769) {
							this.anIntArray539[arg0 + local150 * this.anInt8789] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt8786 && local213 < this.anInt8769) {
							local228 = arg0 + local213 * this.anInt8789;
							local233 = this.anIntArray539[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray539[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8786 && local150 < this.anInt8769) {
							local213 = arg0 + local150 * this.anInt8789;
							local228 = this.anIntArray539[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray539[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt8786) {
					arg0 += local104 * (this.anInt8786 - arg1);
					arg1 = this.anInt8786;
				}
				if (arg3 >= this.anInt8769) {
					arg3 = this.anInt8769 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8782 && local150 < this.anInt8788) {
							this.anIntArray539[local150 + arg1 * this.anInt8789] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt8782 && local213 < this.anInt8788) {
							local228 = local213 + arg1 * this.anInt8789;
							local233 = this.anIntArray539[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray539[local213 + arg1 * this.anInt8789] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8782 && local150 < this.anInt8788) {
							local213 = local150 + arg1 * this.anInt8789;
							local228 = this.anIntArray539[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray539[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.P(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.P(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass39_Sub3_3.aFloat192 * (float) arg0 + this.aClass39_Sub3_3.aFloat193 * (float) arg1 + this.aClass39_Sub3_3.aFloat189 * (float) arg2 + this.aClass39_Sub3_3.aFloat188;
		@Pc(49) float local49 = this.aClass39_Sub3_3.aFloat192 * (float) arg3 + this.aClass39_Sub3_3.aFloat193 * (float) arg4 + this.aClass39_Sub3_3.aFloat189 * (float) arg5 + this.aClass39_Sub3_3.aFloat188;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt8775 && local49 < (float) this.anInt8775) {
			local51 |= 0x10;
		} else if (local24 > (float) this.lb && local49 > (float) this.lb) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt8764 * (this.aClass39_Sub3_3.aFloat196 * (float) arg0 + this.aClass39_Sub3_3.aFloat195 * (float) arg1 + this.aClass39_Sub3_3.aFloat191 * (float) arg2 + this.aClass39_Sub3_3.aFloat194) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt8764 * (this.aClass39_Sub3_3.aFloat196 * (float) arg3 + this.aClass39_Sub3_3.aFloat195 * (float) arg4 + this.aClass39_Sub3_3.aFloat191 * (float) arg5 + this.aClass39_Sub3_3.aFloat194) / (float) arg6);
		if (local117 < this.anInt8766 && local150 < this.anInt8766) {
			local51 |= 0x1;
		} else if (local117 > this.anInt8781 && local150 > this.anInt8781) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt8773 * (this.aClass39_Sub3_3.aFloat198 * (float) arg0 + this.aClass39_Sub3_3.aFloat190 * (float) arg1 + this.aClass39_Sub3_3.aFloat197 * (float) arg2 + this.aClass39_Sub3_3.aFloat187) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt8773 * (this.aClass39_Sub3_3.aFloat198 * (float) arg3 + this.aClass39_Sub3_3.aFloat190 * (float) arg4 + this.aClass39_Sub3_3.aFloat197 * (float) arg5 + this.aClass39_Sub3_3.aFloat187) / (float) arg6);
		if (local208 < this.anInt8778 && local241 < this.anInt8778) {
			local51 |= 0x4;
		} else if (local208 > this.anInt8783 && local241 > this.anInt8783) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZ)Lclient!td;")
	@Override
	public Class24 method7524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class24_Sub1_Sub1(this, arg0, arg1) : new Class24_Sub1_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "()V")
	@Override
	public void method7507() {
		this.aClass102_54.method2681();
		this.aClass102_55.method2681();
	}

	@OriginalMember(owner = "client!sa", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt8789, this.anInt8785, arg0, 0);
	}

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "(I)I")
	public int method7574(@OriginalArg(0) int arg0) {
		return super.anInterface7_15.method8118(arg0).aShort79 & 0xFFFF;
	}

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "(I)V")
	@Override
	public void method7556(@OriginalArg(0) int arg0) {
		this.aClass203Array1[arg0].method5196(null);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method7584(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method7584(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
			}
		} else if (arg2 != 0) {
			local32 = arg7 << 8;
			@Pc(143) int local143 = arg5 << 8;
			@Pc(147) int local147 = arg6 << 8;
			local28 = local143 + local147;
			arg7 = local32 % local28;
			@Pc(172) int local172;
			@Pc(176) int local176;
			if (arg2 + arg3 < 0) {
				local172 = (int) (Math.sqrt((double) (arg2 * arg2 + arg3 * arg3)) * 256.0D);
				local176 = local172 % local28;
				local32 = local28 + local143 - arg7 - local176;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(254) int local254;
			@Pc(267) int local267;
			@Pc(349) int local349;
			@Pc(375) int local375;
			@Pc(380) int local380;
			@Pc(237) int local237;
			@Pc(223) int local223;
			@Pc(340) int local340;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				local223 = arg3 << 16;
				local172 = (int) Math.floor((double) local223 / (double) arg2 + 0.5D);
				local237 = arg2 + arg0;
				local176 = arg4 >>> 24;
				local254 = (int) Math.sqrt((double) ((local172 >> 8) * (local172 >> 8) + 65536));
				if (local176 == 255) {
					while (arg0 <= local237) {
						local267 = arg1 >> 16;
						if (arg0 >= this.anInt8782 && arg0 < this.anInt8788 && local267 >= this.anInt8786 && local267 < this.anInt8769 && arg7 < local143) {
							this.anIntArray539[arg0 + local267 * this.anInt8789] = arg4;
						}
						arg1 += local172;
						arg0++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				} else {
					local340 = ((arg4 & 0xFF00FF) * local176 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local176 >> 8 & 0xFF00) + (local176 << 24);
					local267 = 256 - local176;
					while (arg0 <= local237) {
						local349 = arg1 >> 16;
						if (arg0 >= this.anInt8782 && arg0 < this.anInt8788 && local349 >= this.anInt8786 && local349 < this.anInt8769 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt8789;
							local380 = this.anIntArray539[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray539[local375] = local340 + local380;
						}
						arg1 += local172;
						arg0++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				local237 = arg2 << 16;
				local172 = (int) Math.floor((double) local237 / (double) arg3 + 0.5D);
				local223 = arg3 + arg1;
				local176 = arg4 >>> 24;
				local254 = (int) Math.sqrt((double) ((local172 >> 8) * (local172 >> 8) + 65536));
				if (local176 == 255) {
					while (arg1 <= local223) {
						local267 = arg0 >> 16;
						if (arg1 >= this.anInt8786 && arg1 < this.anInt8769 && local267 >= this.anInt8782 && local267 < this.anInt8788 && arg7 < local143) {
							this.anIntArray539[local267 + arg1 * this.anInt8789] = arg4;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				} else {
					local340 = ((arg4 & 0xFF00FF) * local176 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local176 >> 8 & 0xFF00) + (local176 << 24);
					local267 = 256 - local176;
					while (arg1 <= local223) {
						local349 = arg0 >> 16;
						if (arg1 >= this.anInt8786 && arg1 < this.anInt8769 && local349 >= this.anInt8782 && local349 < this.anInt8788 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt8789;
							local380 = this.anIntArray539[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray539[local349 + arg1 * this.anInt8789] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method7580(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method7580(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "()V")
	@Override
	public void method7560() {
	}

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "()Z")
	@Override
	public boolean method7532() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "()Z")
	@Override
	public boolean method7518() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "(I)Z")
	public boolean method7575(@OriginalArg(0) int arg0) {
		return super.anInterface7_15.method8115(arg0);
	}

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "(I)Z")
	public boolean method7576(@OriginalArg(0) int arg0) {
		return super.anInterface7_15.method8118(arg0).aBoolean366 || super.anInterface7_15.method8118(arg0).aBoolean363;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(II)V")
	@Override
	public void method7514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas14 == null || this.aClass3_Sub12_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas14.getGraphics();
			this.aClass3_Sub12_1.method5830(local14, this.anInt8761, 0, arg0, 0, this.anInt8760, arg1);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas14.repaint();
		}
	}

	@OriginalMember(owner = "client!sa", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass203Array1.length; local1++) {
			this.aClass203Array1[local1].anInt5969 = this.aClass203Array1[local1].anInt5963;
			this.aClass203Array1[local1].aBoolean424 = false;
		}
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class203 local3 = this.method7578(Thread.currentThread());
		this.anInt8775 = arg0;
		this.lb = arg1;
		local3.anInt5958 = this.lb - 255;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!qt;[Lclient!ffa;Z)Lclient!da;")
	@Override
	public Class62 method7515(@OriginalArg(0) Class282 arg0, @OriginalArg(1) Class107[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt3006;
			local7[local11] = arg1[local11].anInt3008;
			if (arg1[local11].aByteArray29 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class62_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class62_Sub2(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt8771 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt8771 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray73;
		@Pc(16) int local16 = 0;
		while (local16 < arg3) {
			@Pc(19) int local19 = 0;
			while (local19 < arg2) {
				@Pc(24) float local24 = local14[local11];
				if (local24 != 2.14748365E9F) {
					local14[local11] = (float) ((double) local24 + arg4);
				}
				local19++;
				local11++;
			}
			local16++;
			local11 += local4;
		}
	}

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "()V")
	@Override
	public void method7555() {
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
	@Override
	public void method7510(@OriginalArg(0) int arg0) {
		this.anInt8763 = arg0;
		this.aClass203Array1 = new Class203[this.anInt8763];
		for (@Pc(9) int local9 = 0; local9 < this.anInt8763; local9++) {
			this.aClass203Array1[local9] = new Class203(this);
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "()Z")
	@Override
	public boolean method7494() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7565(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas14 == null || this.aClass3_Sub12_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas14.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt8789 && local21.y + arg3 <= this.anInt8785 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass3_Sub12_1.method5830(local14, local21.width, local21.y, local21.x + arg2, local21.x, local21.height, local21.y + arg3);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas14.repaint();
		}
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7547(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas14 == arg0) {
			this.method7539(null);
		}
		@Pc(15) Class3_Sub12 local15 = (Class3_Sub12) this.aClass280_41.method7107((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8769();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7491(@OriginalArg(0) boolean arg0) {
		this.aBoolean626 = arg0;
		this.aClass102_54.method2681();
	}

	@OriginalMember(owner = "client!sa", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt8768 = (int) (arg1 * 65535.0F);
		this.anInt8772 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt8776 = (int) (arg3 * 65535.0F / local26);
		this.anInt8777 = (int) (arg4 * 65535.0F / local26);
		this.anInt8787 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!sa", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7520(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class3_Sub12 local8 = (Class3_Sub12) this.aClass280_41.method7107((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static604.method8437(arg2, arg1, arg0);
			this.aClass280_41.method7109(local8, (long) arg0.hashCode());
		} else if (local8.anInt6770 != arg1 || local8.anInt6771 != arg2) {
			this.method7554(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!sa", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt8789) {
			arg2 = this.anInt8789;
		}
		if (arg3 > this.anInt8785) {
			arg3 = this.anInt8785;
		}
		this.anInt8782 = arg0;
		this.anInt8788 = arg2;
		this.anInt8786 = arg1;
		this.anInt8769 = arg3;
		this.method7579();
	}

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class203 local3 = this.method7578(Thread.currentThread());
		local3.aBoolean422 = arg0;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([I)V")
	@Override
	public void method7530(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8789;
		arg0[1] = this.anInt8785;
	}

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "()V")
	private void method7577() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8763; local1++) {
			this.aClass203Array1[local1].method5194();
		}
		this.la();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!eea;I)V")
	@Override
	public void method7551(@OriginalArg(0) Class85 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class203 local3 = this.method7578(Thread.currentThread());
		@Pc(7) Class4_Sub2 local7 = arg0.aClass34_1.aClass4_Sub2_3;
		for (@Pc(10) Class4_Sub2 local10 = local7.aClass4_Sub2_10; local10 != local7; local10 = local10.aClass4_Sub2_10) {
			@Pc(14) Class4_Sub2_Sub2 local14 = (Class4_Sub2_Sub2) local10;
			@Pc(19) int local19 = local14.anInt7719 >> 12;
			@Pc(24) int local24 = local14.anInt7716 >> 12;
			@Pc(29) int local29 = local14.anInt7720 >> 12;
			@Pc(54) float local54 = this.aClass39_Sub3_3.aFloat188 + this.aClass39_Sub3_3.aFloat192 * (float) local19 + this.aClass39_Sub3_3.aFloat193 * (float) local24 + this.aClass39_Sub3_3.aFloat189 * (float) local29;
			if (!(local54 < (float) this.anInt8775) && !(local54 > (float) local3.anInt5958)) {
				@Pc(103) int local103 = this.anInt8765 + (int) ((float) this.anInt8764 * (this.aClass39_Sub3_3.aFloat194 + this.aClass39_Sub3_3.aFloat196 * (float) local19 + this.aClass39_Sub3_3.aFloat195 * (float) local24 + this.aClass39_Sub3_3.aFloat191 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt8774 + (int) ((float) this.anInt8773 * (this.aClass39_Sub3_3.aFloat187 + this.aClass39_Sub3_3.aFloat198 * (float) local19 + this.aClass39_Sub3_3.aFloat190 * (float) local24 + this.aClass39_Sub3_3.aFloat197 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt8782 && local103 <= this.anInt8788 && local139 >= this.anInt8786 && local139 <= this.anInt8769) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method7570(local14, local103, local139, (int) local54, (local14.anInt7721 * this.anInt8764 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "q", descriptor = "()Z")
	@Override
	public boolean method7542() {
		return true;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!lfa;")
	public Class203 method7578(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8763; local1++) {
			if (this.aClass203Array1[local1].aRunnable2 == arg0) {
				return this.aClass203Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(I)V")
	@Override
	public void method7502(@OriginalArg(0) int arg0) {
		this.aClass203Array1[arg0].method5196(Thread.currentThread());
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "()V")
	private void method7579() {
		this.anInt8766 = this.anInt8782 - this.anInt8765;
		this.anInt8781 = this.anInt8788 - this.anInt8765;
		this.anInt8778 = this.anInt8786 - this.anInt8774;
		this.anInt8783 = this.anInt8769 - this.anInt8774;
		for (@Pc(29) int local29 = 0; local29 < this.anInt8763; local29++) {
			@Pc(36) Class341 local36 = this.aClass203Array1[local29].aClass341_1;
			local36.anInt9532 = this.anInt8765 - this.anInt8782;
			local36.anInt9533 = this.anInt8774 - this.anInt8786;
			local36.anInt9531 = this.anInt8788 - this.anInt8782;
			local36.anInt9535 = this.anInt8769 - this.anInt8786;
		}
		@Pc(78) int local78 = this.anInt8786 * this.anInt8789 + this.anInt8782;
		for (@Pc(81) int local81 = this.anInt8786; local81 < this.anInt8769; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt8763; local84++) {
				this.aClass203Array1[local84].aClass341_1.anIntArray607[local81 - this.anInt8786] = local78;
			}
			local78 += this.anInt8789;
		}
	}

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "()I")
	@Override
	public int method7517() {
		return 0;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
	@Override
	protected void method7493() {
		if (this.aBoolean625) {
			Static556.method8016(true, false);
			this.aBoolean625 = false;
		}
		this.aClass3_Sub12_1 = null;
		this.aCanvas14 = null;
		this.anInt8761 = 0;
		this.anInt8760 = 0;
		this.aClass280_41 = null;
		this.aBoolean624 = true;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIIIIZ)Lclient!td;")
	@Override
	public Class24 method7563(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class24_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class24_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class24_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class24_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt8765, this.anInt8774, this.anInt8764, this.anInt8773 };
	}

	@OriginalMember(owner = "client!sa", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass39_Sub3_3.aFloat188 + this.aClass39_Sub3_3.aFloat192 * (float) arg0 + this.aClass39_Sub3_3.aFloat193 * (float) arg1 + this.aClass39_Sub3_3.aFloat189 * (float) arg2;
		if (local24 < (float) this.anInt8775 || local24 > (float) this.lb) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt8764 * (this.aClass39_Sub3_3.aFloat194 + this.aClass39_Sub3_3.aFloat196 * (float) arg0 + this.aClass39_Sub3_3.aFloat195 * (float) arg1 + this.aClass39_Sub3_3.aFloat191 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt8773 * (this.aClass39_Sub3_3.aFloat187 + this.aClass39_Sub3_3.aFloat198 * (float) arg0 + this.aClass39_Sub3_3.aFloat190 * (float) arg1 + this.aClass39_Sub3_3.aFloat197 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt8766 && local82 <= this.anInt8781 && local115 >= this.anInt8778 && local115 <= this.anInt8783) {
			arg4[0] = local82 - this.anInt8766;
			arg4[1] = local115 - this.anInt8778;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V")
	@Override
	public void method7509(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt8762;
		for (@Pc(9) Object local9 = this.aClass102_54.method2671(); local9 != null; local9 = this.aClass102_54.method2672()) {
			@Pc(13) Class3_Sub47 local13 = (Class3_Sub47) local9;
			if (local13.aBoolean658) {
				local13.anInt9167 += local4;
				@Pc(27) int local27 = local13.anInt9167 / 20;
				if (local27 > 0) {
					@Pc(36) Class195 local36 = super.anInterface7_15.method8118(local13.anInt9168);
					local13.method7894(local36.aByte80 * local4 * 50 / 1000, local36.aByte81 * local4 * 50 / 1000);
					local13.anInt9167 -= local27 * 20;
				}
				local13.aBoolean658 = false;
			}
		}
		this.anInt8762 = arg0;
		this.aClass102_55.method2668(5);
		this.aClass102_54.method2668(5);
	}

	@OriginalMember(owner = "client!sa", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass203Array1.length; local1++) {
			@Pc(7) Class203 local7 = this.aClass203Array1[local1];
			local7.anInt5969 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt5969 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt5969 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt5969 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt5969 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean423 = false;
			} else {
				local7.aBoolean423 = true;
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "()Z")
	@Override
	public boolean method7543() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class203 local3 = this.method7578(Thread.currentThread());
		@Pc(6) Class341 local6 = local3.aClass341_1;
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
		@Pc(105) int local105 = arg0 - local6.method8210();
		@Pc(110) int local110 = arg1 - local6.method8212();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt9536 = 0;
		this.C(false);
		local6.aBoolean680 = local114 < 0 || local114 > local6.anInt9531 || local118 < 0 || local118 > local6.anInt9531 || local124 < 0 || local124 > local6.anInt9531;
		local6.method8216((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean680 = local114 < 0 || local114 > local6.anInt9531 || local124 < 0 || local124 > local6.anInt9531 || local130 < 0 || local130 > local6.anInt9531;
		local6.method8216((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7544(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!sa", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt8786) {
			local8 = this.anInt8786;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt8769) {
			local21 = this.anInt8769;
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
				if (local91 < this.anInt8782) {
					local91 = this.anInt8782;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8788) {
					local102 = this.anInt8788;
				}
				local116 = local91 + local30 * this.anInt8789;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray539[local116++] = arg3;
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
				if (local91 < this.anInt8782) {
					local91 = this.anInt8782;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8788 - 1) {
					local102 = this.anInt8788 - 1;
				}
				local116 = local91 + local30 * this.anInt8789;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray539[local116++] = arg3;
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
			if (local102 < this.anInt8782) {
				local102 = this.anInt8782;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt8788) {
				local116 = this.anInt8788;
			}
			local118 = local102 + local30 * this.anInt8789;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray539[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray539[local118++] = local277 + local360;
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
			if (local102 < this.anInt8782) {
				local102 = this.anInt8782;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt8788 - 1) {
				local116 = this.anInt8788 - 1;
			}
			local118 = local102 + local30 * this.anInt8789;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray539[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray539[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class51 method7505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class51_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt8775;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIII)Lclient!ss;")
	@Override
	public Class205 method7486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass39_Sub3_3.aFloat188 + this.aClass39_Sub3_3.aFloat192 * (float) arg0 + this.aClass39_Sub3_3.aFloat193 * (float) arg1 + this.aClass39_Sub3_3.aFloat189 * (float) arg2;
		if (local24 < (float) this.anInt8775 || local24 > (float) this.lb) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt8764 * (this.aClass39_Sub3_3.aFloat194 + this.aClass39_Sub3_3.aFloat196 * (float) arg0 + this.aClass39_Sub3_3.aFloat195 * (float) arg1 + this.aClass39_Sub3_3.aFloat191 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt8773 * (this.aClass39_Sub3_3.aFloat187 + this.aClass39_Sub3_3.aFloat198 * (float) arg0 + this.aClass39_Sub3_3.aFloat190 * (float) arg1 + this.aClass39_Sub3_3.aFloat197 * (float) arg2) / local24);
		if (local81 >= this.anInt8766 && local81 <= this.anInt8781 && local113 >= this.anInt8778 && local113 <= this.anInt8783) {
			arg3[0] = local81 - this.anInt8766;
			arg3[1] = local113 - this.anInt8778;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!sa", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class203 local3 = this.method7578(Thread.currentThread());
		local3.anInt5962 = arg0;
		local3.anInt5969 = arg1;
		local3.anInt5966 = arg2;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public Class3_Sub5 method7495(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
	private void method7580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt8782 || arg0 >= this.anInt8788) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt8789;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt8786 && arg1 + local37 < this.anInt8769 && local27 < arg4) {
					this.anIntArray539[local15 + local37 * this.anInt8789] = arg3;
				}
				local37++;
				local27++;
				local27 %= local23;
			}
			return;
		}
		@Pc(100) int local100 = ((arg3 & 0xFF00FF) * local19 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local19 >> 8 & 0xFF00) + (local19 << 24);
		local37 = 256 - local19;
		@Pc(106) int local106 = 0;
		while (local106 < arg2) {
			if (arg1 + local106 >= this.anInt8786 && arg1 + local106 < this.anInt8769 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt8789;
				@Pc(134) int local134 = this.anIntArray539[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray539[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lclient!rga;")
	@Override
	public Interface18 method7488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class276(arg0, arg1);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIZ)Lclient!td;")
	@Override
	public Class24 method7545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt8789 + arg0;
		@Pc(16) int local16 = this.anInt8789 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray539[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class24_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class24_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "(I)[I")
	public int[] method7581(@OriginalArg(0) int arg0) {
		@Pc(2) Class102 local2 = this.aClass102_54;
		@Pc(14) Class3_Sub47 local14;
		synchronized (this.aClass102_54) {
			local14 = (Class3_Sub47) this.aClass102_54.method2677((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface7_15.method8115(arg0)) {
					return null;
				}
				@Pc(34) Class195 local34 = super.anInterface7_15.method8118(arg0);
				@Pc(45) int local45 = local34.aBoolean364 || this.aBoolean626 ? 64 : this.anInt8790;
				local14 = new Class3_Sub47(arg0, local45, super.anInterface7_15.method8117(local45, 0.7F, local45, arg0), local34.anInt5424 != 1);
				this.aClass102_54.method2674((long) arg0 | Long.MIN_VALUE, local14);
			}
		}
		local14.aBoolean658 = true;
		return local14.method7896();
	}

	@OriginalMember(owner = "client!sa", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt8782 == 0 && this.anInt8788 == this.anInt8789 && this.anInt8786 == 0 && this.anInt8769 == this.anInt8785) {
			local19 = this.aFloatArray73.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray73[local27++] = 2.14748365E9F;
				this.aFloatArray73[local27++] = 2.14748365E9F;
				this.aFloatArray73[local27++] = 2.14748365E9F;
				this.aFloatArray73[local27++] = 2.14748365E9F;
				this.aFloatArray73[local27++] = 2.14748365E9F;
				this.aFloatArray73[local27++] = 2.14748365E9F;
				this.aFloatArray73[local27++] = 2.14748365E9F;
				this.aFloatArray73[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray73[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt8788 - this.anInt8782;
		local25 = this.anInt8769 - this.anInt8786;
		local27 = this.anInt8789 - local19;
		@Pc(116) int local116 = this.anInt8782 + this.anInt8786 * this.anInt8789;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray73[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray73[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray73[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray73[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray73[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray73[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray73[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray73[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray73[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "(I)[I")
	public int[] method7582(@OriginalArg(0) int arg0) {
		@Pc(2) Class102 local2 = this.aClass102_54;
		@Pc(12) Class3_Sub47 local12;
		synchronized (this.aClass102_54) {
			local12 = (Class3_Sub47) this.aClass102_54.method2677((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_15.method8115(arg0)) {
					return null;
				}
				@Pc(32) Class195 local32 = super.anInterface7_15.method8118(arg0);
				@Pc(43) int local43 = local32.aBoolean364 || this.aBoolean626 ? 64 : this.anInt8790;
				local12 = new Class3_Sub47(arg0, local43, super.anInterface7_15.method8116(true, local43, arg0, local43, 0.7F), local32.anInt5424 != 1);
				this.aClass102_54.method2674((long) arg0, local12);
			}
		}
		local12.aBoolean658 = true;
		return local12.method7896();
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "()Z")
	@Override
	public boolean method7499() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!eea;)V")
	@Override
	public void method7538(@OriginalArg(0) Class85 arg0) {
		@Pc(3) Class203 local3 = this.method7578(Thread.currentThread());
		@Pc(7) Class4_Sub2 local7 = arg0.aClass34_1.aClass4_Sub2_3;
		for (@Pc(10) Class4_Sub2 local10 = local7.aClass4_Sub2_10; local10 != local7; local10 = local10.aClass4_Sub2_10) {
			@Pc(14) Class4_Sub2_Sub2 local14 = (Class4_Sub2_Sub2) local10;
			@Pc(19) int local19 = local14.anInt7719 >> 12;
			@Pc(24) int local24 = local14.anInt7716 >> 12;
			@Pc(29) int local29 = local14.anInt7720 >> 12;
			@Pc(54) float local54 = this.aClass39_Sub3_3.aFloat188 + this.aClass39_Sub3_3.aFloat192 * (float) local19 + this.aClass39_Sub3_3.aFloat193 * (float) local24 + this.aClass39_Sub3_3.aFloat189 * (float) local29;
			if (!(local54 < (float) this.anInt8775) && !(local54 > (float) local3.anInt5958)) {
				@Pc(102) int local102 = this.anInt8765 + (int) ((float) this.anInt8764 * (this.aClass39_Sub3_3.aFloat194 + this.aClass39_Sub3_3.aFloat196 * (float) local19 + this.aClass39_Sub3_3.aFloat195 * (float) local24 + this.aClass39_Sub3_3.aFloat191 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt8774 + (int) ((float) this.anInt8773 * (this.aClass39_Sub3_3.aFloat187 + this.aClass39_Sub3_3.aFloat198 * (float) local19 + this.aClass39_Sub3_3.aFloat190 * (float) local24 + this.aClass39_Sub3_3.aFloat197 * (float) local29) / local54);
				if (local102 >= this.anInt8782 && local102 <= this.anInt8788 && local137 >= this.anInt8786 && local137 <= this.anInt8769) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method7570(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt7721 * this.anInt8764 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "()Lclient!sk;")
	@Override
	public Class39 method7503() {
		return this.aClass39_Sub3_3;
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(II)Lclient!up;")
	@Override
	public Interface25 method7511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method7524(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(II)I")
	@Override
	public int method7501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
	@Override
	public void method7489() {
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method7583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface7_15.method8118(arg6).aBoolean365) {
			this.method7572(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt8792 != arg6) {
			@Pc(26) Class24 local26 = (Class24) this.aClass102_55.method2677((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method7581(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method7573(arg6) ? 64 : this.anInt8790;
				local26 = this.method7536(local32, local44, local44, local44);
				this.aClass102_55.method2674((long) arg6, local26);
			}
			this.anInt8792 = arg6;
			this.aClass24_30 = local26;
		}
		((Class24_Sub1) this.aClass24_30).method8583(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "()V")
	@Override
	public void method7535() {
		if (this.aCanvas14 == null) {
			this.anInt8789 = 1;
			this.anInt8785 = 1;
			this.anIntArray539 = null;
			this.anInt8771 = 1;
			this.anInt8784 = 1;
			this.aFloatArray73 = null;
		} else {
			this.anIntArray539 = this.aClass3_Sub12_1.anIntArray406;
			this.anInt8789 = this.aClass3_Sub12_1.anInt6770;
			this.anInt8785 = this.aClass3_Sub12_1.anInt6771;
			this.aFloatArray73 = this.aFloatArray74;
			this.anInt8771 = this.anInt8780;
			this.anInt8784 = this.anInt8770;
		}
		this.aClass267_1 = null;
		this.method7577();
	}

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8782;
		arg0[1] = this.anInt8786;
		arg0[2] = this.anInt8788;
		arg0[3] = this.anInt8769;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "()V")
	@Override
	public void method7567() {
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIIIIIII)V")
	private void method7584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt8786 || arg1 >= this.anInt8769) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt8789;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt8782 && arg0 + local37 < this.anInt8788 && local27 < arg4) {
					this.anIntArray539[local15 + local37] = arg3;
				}
				local37++;
				local27++;
				local27 %= local23;
			}
			return;
		}
		@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local19 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local19 >> 8 & 0xFF00) + (local19 << 24);
		local37 = 256 - local19;
		@Pc(103) int local103 = 0;
		while (local103 < arg2) {
			if (arg0 + local103 >= this.anInt8782 && arg0 + local103 < this.anInt8788 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray539[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray539[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIF)Lclient!wh;")
	@Override
	public Class3_Sub16 method7550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!sa", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.lb;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I[Lclient!wh;)V")
	@Override
	public void method7521(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub16[] arg1) {
	}

	@OriginalMember(owner = "client!sa", name = "u", descriptor = "()Lclient!sk;")
	@Override
	public Class39 method7552() {
		return new Class39_Sub3();
	}

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "(I)I")
	public int method7585(@OriginalArg(0) int arg0) {
		return super.anInterface7_15.method8118(arg0).anInt5424;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!fu;IIII)Lclient!ka;")
	@Override
	public Class17 method7490(@OriginalArg(0) Class118 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class17_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
	@Override
	public void method7526() {
		Static328.anInt6142 = 10000;
		Static328.anInt6141 = 10000;
		if (this.anInt8763 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method7510(this.anInt8763);
		this.method7502(0);
	}

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "()Lclient!fc;")
	@Override
	public Class103 method7569() {
		return new Class103(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!sa", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt8789;
		@Pc(35) int local35 = this.anInt8789 - arg2;
		if (arg1 + arg3 > this.anInt8769) {
			arg3 -= arg1 + arg3 - this.anInt8769;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt8786) {
			local59 = this.anInt8786 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt8789;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt8788) {
			local59 = arg0 + arg2 - this.anInt8788;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt8782) {
			local59 = this.anInt8782 - arg0;
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
						this.anIntArray539[local30++] = arg4;
					} else {
						this.anIntArray539[local30++] = arg5;
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
					local245 = this.anIntArray539[local30];
					this.anIntArray539[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray539[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray539[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!sa", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8765 = arg0;
		this.anInt8774 = arg1;
		this.anInt8764 = arg2;
		this.anInt8773 = arg3;
		this.method7579();
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7492(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(II)I")
	@Override
	public int method7541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "()Z")
	@Override
	public boolean method7516() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "()Lclient!sk;")
	@Override
	public Class39 method7546() {
		@Pc(3) Class203 local3 = this.method7578(Thread.currentThread());
		return local3.aClass39_Sub3_1;
	}

	@OriginalMember(owner = "client!sa", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt8782) {
			arg2 -= this.anInt8782 - arg0;
			arg0 = this.anInt8782;
		}
		if (arg1 < this.anInt8786) {
			arg3 -= this.anInt8786 - arg1;
			arg1 = this.anInt8786;
		}
		if (arg0 + arg2 > this.anInt8788) {
			arg2 = this.anInt8788 - arg0;
		}
		if (arg1 + arg3 > this.anInt8769) {
			arg3 = this.anInt8769 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt8788 || arg1 > this.anInt8769) {
			return;
		}
		@Pc(67) int local67 = this.anInt8789 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt8789;
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
						local217 = this.anIntArray539[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray539[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray539[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray539[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray539[arg2] = arg4;
					arg2++;
					this.anIntArray539[arg2] = arg4;
					arg2++;
					this.anIntArray539[arg2] = arg4;
					arg2++;
					this.anIntArray539[arg2] = arg4;
					arg2++;
					this.anIntArray539[arg2] = arg4;
					arg2++;
					this.anIntArray539[arg2] = arg4;
					arg2++;
					this.anIntArray539[arg2] = arg4;
					arg2++;
					this.anIntArray539[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray539[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!dv;)V")
	@Override
	public void method7527(@OriginalArg(0) Interface8 arg0) {
		@Pc(2) Class267 local2 = (Class267) arg0;
		this.anInt8789 = local2.anInt7949;
		this.anInt8785 = local2.anInt7951;
		this.anIntArray539 = local2.anIntArray492;
		this.aClass267_1 = local2;
		this.anInt8771 = local2.anInt7949;
		this.anInt8784 = local2.anInt7951;
		this.aFloatArray73 = local2.aFloatArray68;
		this.method7577();
	}

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "()Z")
	@Override
	public boolean method7534() {
		return false;
	}

	@OriginalMember(owner = "client!sa", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass39_Sub3_3.aFloat192 * (float) arg0 + this.aClass39_Sub3_3.aFloat193 * (float) arg1 + this.aClass39_Sub3_3.aFloat189 * (float) arg2 + this.aClass39_Sub3_3.aFloat188;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass39_Sub3_3.aFloat192 * (float) arg3 + this.aClass39_Sub3_3.aFloat193 * (float) arg4 + this.aClass39_Sub3_3.aFloat189 * (float) arg5 + this.aClass39_Sub3_3.aFloat188;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt8775 && local57 < (float) this.anInt8775) {
			local1 |= 0x10;
		} else if (local26 > (float) this.lb && local57 > (float) this.lb) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt8764 * (this.aClass39_Sub3_3.aFloat196 * (float) arg0 + this.aClass39_Sub3_3.aFloat195 * (float) arg1 + this.aClass39_Sub3_3.aFloat191 * (float) arg2 + this.aClass39_Sub3_3.aFloat194) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt8764 * (this.aClass39_Sub3_3.aFloat196 * (float) arg3 + this.aClass39_Sub3_3.aFloat195 * (float) arg4 + this.aClass39_Sub3_3.aFloat191 * (float) arg5 + this.aClass39_Sub3_3.aFloat194) / local57);
		if (local128 < this.anInt8766 && local160 < this.anInt8766) {
			local1 |= 0x1;
		} else if (local128 > this.anInt8781 && local160 > this.anInt8781) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt8773 * (this.aClass39_Sub3_3.aFloat198 * (float) arg0 + this.aClass39_Sub3_3.aFloat190 * (float) arg1 + this.aClass39_Sub3_3.aFloat197 * (float) arg2 + this.aClass39_Sub3_3.aFloat187) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt8773 * (this.aClass39_Sub3_3.aFloat198 * (float) arg3 + this.aClass39_Sub3_3.aFloat190 * (float) arg4 + this.aClass39_Sub3_3.aFloat197 * (float) arg5 + this.aClass39_Sub3_3.aFloat187) / local57);
		if (local217 < this.anInt8778 && local249 < this.anInt8778) {
			local1 |= 0x4;
		} else if (local217 > this.anInt8783 && local249 > this.anInt8783) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ss;)V")
	@Override
	public void method7498(@OriginalArg(0) Class205 arg0) {
	}
}
