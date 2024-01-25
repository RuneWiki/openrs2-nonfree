import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
	private int anInt8038;

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "Lclient!ub;")
	public Class14_Sub6 aClass14_Sub6_1;

	@OriginalMember(owner = "client!pm", name = "D", descriptor = "I")
	private int anInt8040;

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!pm", name = "G", descriptor = "[F")
	public float[] aFloatArray61;

	@OriginalMember(owner = "client!pm", name = "I", descriptor = "[I")
	public int[] anIntArray612;

	@OriginalMember(owner = "client!pm", name = "J", descriptor = "I")
	private int anInt8042;

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "I")
	public int anInt8043;

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
	private int anInt8045;

	@OriginalMember(owner = "client!pm", name = "O", descriptor = "I")
	public int anInt8046;

	@OriginalMember(owner = "client!pm", name = "Q", descriptor = "Lclient!jf;")
	private Class177 aClass177_1;

	@OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
	public int anInt8049;

	@OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
	private int anInt8050;

	@OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
	private int anInt8051;

	@OriginalMember(owner = "client!pm", name = "V", descriptor = "I")
	public int anInt8052;

	@OriginalMember(owner = "client!pm", name = "W", descriptor = "I")
	public int anInt8053;

	@OriginalMember(owner = "client!pm", name = "Y", descriptor = "I")
	public int anInt8054;

	@OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
	public int anInt8055;

	@OriginalMember(owner = "client!pm", name = "bb", descriptor = "I")
	public int anInt8057;

	@OriginalMember(owner = "client!pm", name = "cb", descriptor = "[F")
	public float[] aFloatArray62;

	@OriginalMember(owner = "client!pm", name = "db", descriptor = "I")
	public int anInt8058;

	@OriginalMember(owner = "client!pm", name = "fb", descriptor = "[Lclient!dv;")
	private Class78[] aClass78Array1;

	@OriginalMember(owner = "client!pm", name = "kb", descriptor = "I")
	private int anInt8064;

	@OriginalMember(owner = "client!pm", name = "pb", descriptor = "I")
	public int anInt8068;

	@OriginalMember(owner = "client!pm", name = "rb", descriptor = "I")
	public int anInt8070;

	@OriginalMember(owner = "client!pm", name = "tb", descriptor = "Lclient!jd;")
	private Class20 aClass20_30;

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "Z")
	private boolean aBoolean561;

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "Z")
	private boolean aBoolean560;

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "Lclient!jo;")
	private Class187 aClass187_56;

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "I")
	private int anInt8041;

	@OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
	public int anInt8048;

	@OriginalMember(owner = "client!pm", name = "P", descriptor = "I")
	public int anInt8047;

	@OriginalMember(owner = "client!pm", name = "ab", descriptor = "I")
	public int anInt8056;

	@OriginalMember(owner = "client!pm", name = "gb", descriptor = "I")
	private int anInt8060;

	@OriginalMember(owner = "client!pm", name = "ib", descriptor = "I")
	public int anInt8062;

	@OriginalMember(owner = "client!pm", name = "jb", descriptor = "I")
	public int anInt8063;

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "Z")
	private boolean aBoolean562;

	@OriginalMember(owner = "client!pm", name = "hb", descriptor = "I")
	public int anInt8061;

	@OriginalMember(owner = "client!pm", name = "eb", descriptor = "I")
	public int anInt8059;

	@OriginalMember(owner = "client!pm", name = "L", descriptor = "I")
	public int anInt8044;

	@OriginalMember(owner = "client!pm", name = "mb", descriptor = "I")
	public int anInt8065;

	@OriginalMember(owner = "client!pm", name = "nb", descriptor = "I")
	public int anInt8066;

	@OriginalMember(owner = "client!pm", name = "ob", descriptor = "I")
	public int anInt8067;

	@OriginalMember(owner = "client!pm", name = "qb", descriptor = "I")
	public int anInt8069;

	@OriginalMember(owner = "client!pm", name = "lb", descriptor = "Lclient!oo;")
	private final Class264 lb;

	@OriginalMember(owner = "client!pm", name = "sb", descriptor = "I")
	private int anInt8071;

	@OriginalMember(owner = "client!pm", name = "N", descriptor = "Lclient!oo;")
	private final Class264 aClass264_52;

	@OriginalMember(owner = "client!pm", name = "X", descriptor = "Lclient!hda;")
	public Class26_Sub2 aClass26_Sub2_3;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
	private int anInt8039;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class137_Sub2(@OriginalArg(0) Interface3 arg0) {
		super(arg0);
		this.aBoolean561 = false;
		this.aBoolean560 = false;
		this.aClass187_56 = new Class187(4);
		this.anInt8041 = 0;
		this.anInt8048 = 45823;
		this.anInt8047 = 0;
		this.anInt8056 = 3500;
		this.anInt8060 = 0;
		this.anInt8062 = 512;
		this.anInt8063 = 128;
		this.aBoolean562 = false;
		this.anInt8061 = 78642;
		this.anInt8059 = 512;
		this.anInt8044 = 0;
		this.anInt8065 = 50;
		this.anInt8066 = 0;
		this.anInt8067 = 0;
		this.anInt8069 = 75518;
		this.lb = new Class264(16);
		this.anInt8071 = -1;
		try {
			this.aClass264_52 = new Class264(256);
			this.aClass26_Sub2_3 = new Class26_Sub2();
			this.method7913(1);
			this.method7926(0);
			Static479.method7114(true, true);
			this.aBoolean561 = true;
			this.anInt8039 = (int) Static521.method7499();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method7935();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class137_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method7920(arg0, arg2, arg3);
			this.method7939(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method7935();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)V")
	@Override
	public void method7913(@OriginalArg(0) int arg0) {
		this.anInt8068 = arg0;
		this.aClass78Array1 = new Class78[this.anInt8068];
		for (@Pc(9) int local9 = 0; local9 < this.anInt8068; local9++) {
			this.aClass78Array1[local9] = new Class78(this);
		}
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "()Z")
	public boolean method6715() {
		return this.aBoolean560;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method7940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray500;
		@Pc(8) int[] local8 = local2.anIntArray499;
		@Pc(17) int local17 = this.anInt8047 > arg7 ? this.anInt8047 : arg7;
		@Pc(32) int local32 = this.anInt8044 < arg7 + local5.length ? this.anInt8044 : arg7 + local5.length;
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
					if (local129 >= this.anInt8067 && local129 < this.anInt8066 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray612[local129 + arg1 * this.anInt8058] = arg4;
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
					if (local133 >= this.anInt8067 && local133 < this.anInt8066 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt8058;
						local248 = this.anIntArray612[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray612[local133 + arg1 * this.anInt8058] = local201 + local584;
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
		if (arg0 < this.anInt8067) {
			arg1 += local83 * (this.anInt8067 - arg0);
			arg0 = this.anInt8067;
		}
		if (arg2 >= this.anInt8066) {
			arg2 = this.anInt8066 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray612[arg0 + local129 * this.anInt8058] = arg4;
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
					local243 = arg0 + local133 * this.anInt8058;
					local248 = this.anIntArray612[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray612[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Z")
	public boolean method6716(@OriginalArg(0) int arg0) {
		return super.anInterface3_11.method6177(arg0).aBoolean454 || super.anInterface3_11.method6177(arg0).aBoolean451;
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "()Z")
	@Override
	public boolean method7880() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!qaa;Lclient!qaa;FLclient!qaa;)Lclient!qaa;")
	@Override
	public Class144 method7894(@OriginalArg(0) Class144 arg0, @OriginalArg(1) Class144 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class144 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "()Lclient!cq;")
	@Override
	public Class64 method7953() {
		return new Class64(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!on;IIII)V")
	private void method6717(@OriginalArg(0) Class12_Sub7_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt10253;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method6722(arg1, arg2, arg3, arg4, arg0.anInt10254, 1);
			return;
		}
		if (this.anInt8071 != local2) {
			@Pc(33) Class20 local33 = (Class20) this.lb.method6367((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method6726(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method6729(local2) ? 64 : this.anInt8063;
				local33 = this.method7885(local50, local50, local39, local50);
				this.lb.method6364((long) local2, local33);
			}
			this.anInt8071 = local2;
			this.aClass20_30 = local33;
		}
		local8++;
		((Class20_Sub1) this.aClass20_30).method6539(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt10254, 1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
	@Override
	public void method7897(@OriginalArg(0) boolean arg0) {
		this.aBoolean562 = arg0;
		this.aClass264_52.method6360();
	}

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "(I)Z")
	public boolean method6718(@OriginalArg(0) int arg0) {
		return super.anInterface3_11.method6181(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "()V")
	@Override
	public void method7948() {
	}

	@OriginalMember(owner = "client!pm", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt8047) {
			local8 = this.anInt8047;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt8044) {
			local21 = this.anInt8044;
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
				if (local91 < this.anInt8067) {
					local91 = this.anInt8067;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8066) {
					local102 = this.anInt8066;
				}
				local116 = local91 + local30 * this.anInt8058;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray612[local116++] = arg3;
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
				if (local91 < this.anInt8067) {
					local91 = this.anInt8067;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8066 - 1) {
					local102 = this.anInt8066 - 1;
				}
				local116 = local91 + local30 * this.anInt8058;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray612[local116++] = arg3;
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
			if (local102 < this.anInt8067) {
				local102 = this.anInt8067;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt8066) {
				local116 = this.anInt8066;
			}
			local118 = local102 + local30 * this.anInt8058;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray612[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray612[local118++] = local277 + local360;
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
			if (local102 < this.anInt8067) {
				local102 = this.anInt8067;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt8066 - 1) {
				local116 = this.anInt8066 - 1;
			}
			local118 = local102 + local30 * this.anInt8058;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray612[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray612[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!pm", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass26_Sub2_3.aFloat89 + this.aClass26_Sub2_3.aFloat85 * (float) arg0 + this.aClass26_Sub2_3.aFloat82 * (float) arg1 + this.aClass26_Sub2_3.aFloat83 * (float) arg2;
		if (local24 < (float) this.anInt8065 || local24 > (float) this.anInt8056) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt8059 * (this.aClass26_Sub2_3.aFloat93 + this.aClass26_Sub2_3.aFloat91 * (float) arg0 + this.aClass26_Sub2_3.aFloat90 * (float) arg1 + this.aClass26_Sub2_3.aFloat84 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt8062 * (this.aClass26_Sub2_3.aFloat86 + this.aClass26_Sub2_3.aFloat87 * (float) arg0 + this.aClass26_Sub2_3.aFloat92 * (float) arg1 + this.aClass26_Sub2_3.aFloat88 * (float) arg2) / local24);
		if (local81 >= this.anInt8053 && local81 <= this.anInt8070 && local113 >= this.anInt8049 && local113 <= this.anInt8043) {
			arg3[0] = local81 - this.anInt8053;
			arg3[1] = local113 - this.anInt8049;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pm", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt8058 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt8051 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray612;
		@Pc(24) float[] local24 = this.aFloatArray62;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static681.method2482(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static681.method2482(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static681.method2477(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static681.method2477(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "()V")
	@Override
	public void method7878() {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!kd;I)V")
	@Override
	public void method7942(@OriginalArg(0) Class196 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class78 local3 = this.method6720(Thread.currentThread());
		@Pc(7) Class12_Sub7 local7 = arg0.aClass243_1.aClass12_Sub7_5;
		for (@Pc(10) Class12_Sub7 local10 = local7.aClass12_Sub7_9; local10 != local7; local10 = local10.aClass12_Sub7_9) {
			@Pc(14) Class12_Sub7_Sub2 local14 = (Class12_Sub7_Sub2) local10;
			@Pc(19) int local19 = local14.anInt10249 >> 12;
			@Pc(24) int local24 = local14.anInt10247 >> 12;
			@Pc(29) int local29 = local14.anInt10252 >> 12;
			@Pc(54) float local54 = this.aClass26_Sub2_3.aFloat89 + this.aClass26_Sub2_3.aFloat85 * (float) local19 + this.aClass26_Sub2_3.aFloat82 * (float) local24 + this.aClass26_Sub2_3.aFloat83 * (float) local29;
			if (!(local54 < (float) this.anInt8065) && !(local54 > (float) local3.anInt2314)) {
				@Pc(103) int local103 = this.anInt8052 + (int) ((float) this.anInt8059 * (this.aClass26_Sub2_3.aFloat93 + this.aClass26_Sub2_3.aFloat91 * (float) local19 + this.aClass26_Sub2_3.aFloat90 * (float) local24 + this.aClass26_Sub2_3.aFloat84 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt8046 + (int) ((float) this.anInt8062 * (this.aClass26_Sub2_3.aFloat86 + this.aClass26_Sub2_3.aFloat87 * (float) local19 + this.aClass26_Sub2_3.aFloat92 * (float) local24 + this.aClass26_Sub2_3.aFloat88 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt8067 && local103 <= this.anInt8066 && local139 >= this.anInt8047 && local139 <= this.anInt8044) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method6717(local14, local103, local139, (int) local54, (local14.anInt10251 * this.anInt8059 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!qja;)V")
	@Override
	public void method7950(@OriginalArg(0) Class26 arg0) {
		this.aClass26_Sub2_3 = (Class26_Sub2) arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method7914(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas9 == null || this.aClass14_Sub6_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas9.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt8058 && local21.y + arg3 <= this.anInt8042 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass14_Sub6_1.method1597(local21.height, local21.y + arg3, local21.width, local21.x, local14, local21.x + arg2, local21.y);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas9.repaint();
		}
	}

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "()Z")
	@Override
	public boolean method7924() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt8069 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!pm", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt8056;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7939(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas9 = null;
			this.aClass14_Sub6_1 = null;
			if (this.aClass177_1 == null) {
				this.anIntArray612 = null;
				this.anInt8058 = this.anInt8042 = 1;
				this.anInt8051 = this.anInt8045 = 1;
				this.method6725();
			}
			return;
		}
		@Pc(10) Class14_Sub6 local10 = (Class14_Sub6) this.aClass187_56.method4078((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas9 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt8040 = local18.width;
		this.anInt8038 = local18.height;
		this.aClass14_Sub6_1 = local10;
		if (this.aClass177_1 != null) {
			return;
		}
		this.anIntArray612 = local10.anIntArray136;
		this.anInt8058 = local10.anInt1867;
		this.anInt8042 = local10.anInt1869;
		if (this.anInt8058 != this.anInt8051 || this.anInt8042 != this.anInt8045) {
			this.anInt8064 = this.anInt8051 = this.anInt8058;
			this.anInt8050 = this.anInt8045 = this.anInt8042;
			this.aFloatArray61 = this.aFloatArray62 = new float[this.anInt8051 * this.anInt8045];
		}
		this.method6725();
		return;
	}

	@OriginalMember(owner = "client!pm", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt8060;
		this.anInt8060 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!pm", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class78 local3 = this.method6720(Thread.currentThread());
		local3.anInt2318 = arg0;
		local3.anInt2312 = arg1;
		local3.anInt2313 = arg2;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Z)V")
	@Override
	public void method7954(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pm", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method7929() {
		@Pc(3) Class78 local3 = this.method6720(Thread.currentThread());
		@Pc(6) Class323 local6 = local3.aClass323_1;
		local6.aBoolean655 = false;
		@Pc(14) int local14 = 5 - this.anInt8053;
		@Pc(19) int local19 = 75 - this.anInt8053;
		@Pc(24) int local24 = 15 - this.anInt8053;
		@Pc(29) int local29 = 10 - this.anInt8049;
		@Pc(34) int local34 = 50 - this.anInt8049;
		@Pc(39) int local39 = 90 - this.anInt8049;
		local6.aBoolean657 = local14 < 0 || local14 > local6.anInt9340 || local19 < 0 || local19 > local6.anInt9340 || local24 < 0 || local24 > local6.anInt9340;
		local6.anInt9336 = 0;
		local6.aBoolean656 = false;
		local6.method7728((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean655 = true;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "()Z")
	@Override
	public boolean method7868() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method7916(@OriginalArg(0) Class14_Sub7 arg0) {
	}

	@OriginalMember(owner = "client!pm", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt8058, this.anInt8042, arg0, 0);
	}

	@OriginalMember(owner = "client!pm", name = "y", descriptor = "()V")
	@Override
	public void method7946() {
	}

	@OriginalMember(owner = "client!pm", name = "j", descriptor = "()Z")
	@Override
	public boolean method7883() {
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "(I)I")
	public int method6719(@OriginalArg(0) int arg0) {
		return super.anInterface3_11.method6177(arg0).anInt6492;
	}

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "()Z")
	@Override
	public boolean method7904() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)Lclient!kfa;")
	@Override
	public Interface14 method7902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method7925(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!pm", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass78Array1.length; local1++) {
			this.aClass78Array1[local1].anInt2312 = this.aClass78Array1[local1].anInt2311;
			this.aClass78Array1[local1].aBoolean190 = false;
		}
	}

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "()V")
	@Override
	public void method7919() {
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(IIIIII)Lclient!qaa;")
	@Override
	public Class144 method7928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "x", descriptor = "()I")
	@Override
	public int method7937() {
		return 0;
	}

	@OriginalMember(owner = "client!pm", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt8058;
		@Pc(35) int local35 = this.anInt8058 - arg2;
		if (arg1 + arg3 > this.anInt8044) {
			arg3 -= arg1 + arg3 - this.anInt8044;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt8047) {
			local59 = this.anInt8047 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt8058;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt8066) {
			local59 = arg0 + arg2 - this.anInt8066;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt8067) {
			local59 = this.anInt8067 - arg0;
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
						this.anIntArray612[local30++] = arg4;
					} else {
						this.anIntArray612[local30++] = arg5;
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
					local245 = this.anIntArray612[local30];
					this.anIntArray612[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray612[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray612[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!pm", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt8047 || arg1 >= this.anInt8044) {
			return;
		}
		if (arg0 < this.anInt8067) {
			arg2 -= this.anInt8067 - arg0;
			arg0 = this.anInt8067;
		}
		if (arg0 + arg2 > this.anInt8066) {
			arg2 = this.anInt8066 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8058;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray612[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray612[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray612[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray612[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray612[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "()Z")
	@Override
	public boolean method7899() {
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt8052, this.anInt8046, this.anInt8059, this.anInt8062 };
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[Lclient!qm;)V")
	@Override
	public void method7887(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub37[] arg1) {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!dv;")
	public Class78 method6720(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8068; local1++) {
			if (this.aClass78Array1[local1].aRunnable2 == arg0) {
				return this.aClass78Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIII)V")
	private void method6721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt8047 || arg1 >= this.anInt8044) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt8058;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt8067 && arg0 + local37 < this.anInt8066 && local27 < arg4) {
					this.anIntArray612[local15 + local37] = arg3;
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
			if (arg0 + local103 >= this.anInt8067 && arg0 + local103 < this.anInt8066 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray612[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray612[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!kfa;Lclient!ts;)Lclient!pt;")
	@Override
	public Interface23 method7874(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Interface26 arg1) {
		return new Class177(this, (Class20) arg0, (Class251) arg1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7915(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!dba;IIII)Lclient!ka;")
	@Override
	public Class80 method7901(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class80_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(II)I")
	@Override
	public int method7943(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ie;[Lclient!us;Z)Lclient!da;")
	@Override
	public Class38 method7870(@OriginalArg(0) Class158 arg0, @OriginalArg(1) Class356[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt10341;
			local7[local11] = arg1[local11].anInt10343;
			if (arg1[local11].aByteArray126 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class38_Sub3(this, arg0, arg1, local3, local7);
		} else {
			return new Class38_Sub2(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "(I)V")
	@Override
	public void method7931(@OriginalArg(0) int arg0) {
		this.anInt8063 = arg0;
		this.aClass264_52.method6360();
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(II)Lclient!ts;")
	@Override
	public Interface26 method7934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class251(arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(IIIIII)V")
	private void method6722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt8047) {
			local8 = this.anInt8047;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt8044) {
			local21 = this.anInt8044;
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
				if (local91 < this.anInt8067) {
					local91 = this.anInt8067;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8066) {
					local102 = this.anInt8066;
				}
				local116 = local91 + local30 * this.anInt8058;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray62[local116]) {
						this.anIntArray612[local116] = arg4;
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
				if (local91 < this.anInt8067) {
					local91 = this.anInt8067;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8066 - 1) {
					local102 = this.anInt8066 - 1;
				}
				local116 = local91 + local30 * this.anInt8058;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray62[local116]) {
						this.anIntArray612[local116] = arg4;
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
				if (local102 < this.anInt8067) {
					local102 = this.anInt8067;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt8066) {
					local116 = this.anInt8066;
				}
				local118 = local102 + local30 * this.anInt8058;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray62[local118]) {
						local364 = this.anIntArray612[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray612[local118] = local293 + local364;
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
				if (local102 < this.anInt8067) {
					local102 = this.anInt8067;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt8066 - 1) {
					local116 = this.anInt8066 - 1;
				}
				local118 = local102 + local30 * this.anInt8058;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray62[local118]) {
						local364 = this.anIntArray612[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray612[local118] = local293 + local364;
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
				if (local91 < this.anInt8067) {
					local91 = this.anInt8067;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8066) {
					local102 = this.anInt8066;
				}
				local116 = local91 + local30 * this.anInt8058;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray62[local116]) {
						local350 = this.anIntArray612[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray612[local116] = local364 - local643 | local643 - (local643 >>> 8);
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
				if (local91 < this.anInt8067) {
					local91 = this.anInt8067;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8066 - 1) {
					local102 = this.anInt8066 - 1;
				}
				local116 = local91 + local30 * this.anInt8058;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray62[local116]) {
						local350 = this.anIntArray612[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray612[local116] = local364 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "()Z")
	@Override
	public boolean method7888() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "u", descriptor = "()Lclient!qja;")
	@Override
	public Class26 method7923() {
		@Pc(3) Class78 local3 = this.method6720(Thread.currentThread());
		return local3.aClass26_Sub2_1;
	}

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "()Z")
	@Override
	public boolean method7936() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "()Z")
	@Override
	public boolean method7881() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)V")
	@Override
	public void method7926(@OriginalArg(0) int arg0) {
		this.aClass78Array1[arg0].method1961(Thread.currentThread());
	}

	@OriginalMember(owner = "client!pm", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass26_Sub2_3.aFloat89 + this.aClass26_Sub2_3.aFloat85 * (float) arg0 + this.aClass26_Sub2_3.aFloat82 * (float) arg1 + this.aClass26_Sub2_3.aFloat83 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt8059 * (this.aClass26_Sub2_3.aFloat93 + this.aClass26_Sub2_3.aFloat91 * (float) arg0 + this.aClass26_Sub2_3.aFloat90 * (float) arg1 + this.aClass26_Sub2_3.aFloat84 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt8062 * (this.aClass26_Sub2_3.aFloat86 + this.aClass26_Sub2_3.aFloat87 * (float) arg0 + this.aClass26_Sub2_3.aFloat92 * (float) arg1 + this.aClass26_Sub2_3.aFloat88 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt8053;
		arg3[1] = local105 - this.anInt8049;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!pm", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt8058) {
			arg2 = this.anInt8058;
		}
		if (arg3 > this.anInt8042) {
			arg3 = this.anInt8042;
		}
		this.anInt8067 = arg0;
		this.anInt8066 = arg2;
		this.anInt8047 = arg1;
		this.anInt8044 = arg3;
		this.method6728();
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7920(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class14_Sub6 local8 = (Class14_Sub6) this.aClass187_56.method4078((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static410.method6059(arg2, arg0, arg1);
			this.aClass187_56.method4077((long) arg0.hashCode(), local8);
		} else if (local8.anInt1867 != arg1 || local8.anInt1869 != arg2) {
			this.method7898(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIZ)Lclient!jd;")
	@Override
	public Class20 method7900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt8058 + arg0;
		@Pc(16) int local16 = this.anInt8058 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray612[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class20_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class20_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!pm", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass26_Sub2_3.aFloat89 + this.aClass26_Sub2_3.aFloat85 * (float) arg0 + this.aClass26_Sub2_3.aFloat82 * (float) arg1 + this.aClass26_Sub2_3.aFloat83 * (float) arg2;
		if (local24 < (float) this.anInt8065 || local24 > (float) this.anInt8056) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt8059 * (this.aClass26_Sub2_3.aFloat93 + this.aClass26_Sub2_3.aFloat91 * (float) arg0 + this.aClass26_Sub2_3.aFloat90 * (float) arg1 + this.aClass26_Sub2_3.aFloat84 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt8062 * (this.aClass26_Sub2_3.aFloat86 + this.aClass26_Sub2_3.aFloat87 * (float) arg0 + this.aClass26_Sub2_3.aFloat92 * (float) arg1 + this.aClass26_Sub2_3.aFloat88 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt8053 && local82 <= this.anInt8070 && local115 >= this.anInt8049 && local115 <= this.anInt8043) {
			arg4[0] = local82 - this.anInt8053;
			arg4[1] = local115 - this.anInt8049;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([IIIIIZ)Lclient!jd;")
	@Override
	public Class20 method7938(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class20_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class20_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class20_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class20_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method6723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface3_11.method6177(arg6).aBoolean453) {
			this.method6722(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt8071 != arg6) {
			@Pc(26) Class20 local26 = (Class20) this.lb.method6367((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method6726(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method6729(arg6) ? 64 : this.anInt8063;
				local26 = this.method7885(local44, local44, local32, local44);
				this.lb.method6364((long) arg6, local26);
			}
			this.anInt8071 = arg6;
			this.aClass20_30 = local26;
		}
		((Class20_Sub1) this.aClass20_30).method6539(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!pm", name = "s", descriptor = "()Lclient!qja;")
	@Override
	public Class26 method7918() {
		return new Class26_Sub2();
	}

	@OriginalMember(owner = "client!pm", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8052 = arg0;
		this.anInt8046 = arg1;
		this.anInt8059 = arg2;
		this.anInt8062 = arg3;
		this.method6728();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!us;Z)Lclient!jd;")
	@Override
	public Class20 method7951(@OriginalArg(0) Class356 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray755;
		@Pc(5) byte[] local5 = arg0.aByteArray127;
		@Pc(8) int local8 = arg0.anInt10341;
		@Pc(11) int local11 = arg0.anInt10343;
		@Pc(76) Class20_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray126 == null) {
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
			local76 = new Class20_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray126;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class20_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class20_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.method7409(arg0.anInt10340, arg0.anInt10342, arg0.anInt10344, arg0.anInt10345);
		return local76;
	}

	@OriginalMember(owner = "client!pm", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass26_Sub2_3.aFloat85 * (float) arg0 + this.aClass26_Sub2_3.aFloat82 * (float) arg1 + this.aClass26_Sub2_3.aFloat83 * (float) arg2 + this.aClass26_Sub2_3.aFloat89;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass26_Sub2_3.aFloat85 * (float) arg3 + this.aClass26_Sub2_3.aFloat82 * (float) arg4 + this.aClass26_Sub2_3.aFloat83 * (float) arg5 + this.aClass26_Sub2_3.aFloat89;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt8065 && local57 < (float) this.anInt8065) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt8056 && local57 > (float) this.anInt8056) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt8059 * (this.aClass26_Sub2_3.aFloat91 * (float) arg0 + this.aClass26_Sub2_3.aFloat90 * (float) arg1 + this.aClass26_Sub2_3.aFloat84 * (float) arg2 + this.aClass26_Sub2_3.aFloat93) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt8059 * (this.aClass26_Sub2_3.aFloat91 * (float) arg3 + this.aClass26_Sub2_3.aFloat90 * (float) arg4 + this.aClass26_Sub2_3.aFloat84 * (float) arg5 + this.aClass26_Sub2_3.aFloat93) / local57);
		if (local128 < this.anInt8053 && local160 < this.anInt8053) {
			local1 |= 0x1;
		} else if (local128 > this.anInt8070 && local160 > this.anInt8070) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt8062 * (this.aClass26_Sub2_3.aFloat87 * (float) arg0 + this.aClass26_Sub2_3.aFloat92 * (float) arg1 + this.aClass26_Sub2_3.aFloat88 * (float) arg2 + this.aClass26_Sub2_3.aFloat86) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt8062 * (this.aClass26_Sub2_3.aFloat87 * (float) arg3 + this.aClass26_Sub2_3.aFloat92 * (float) arg4 + this.aClass26_Sub2_3.aFloat88 * (float) arg5 + this.aClass26_Sub2_3.aFloat86) / local57);
		if (local217 < this.anInt8049 && local249 < this.anInt8049) {
			local1 |= 0x4;
		} else if (local217 > this.anInt8043 && local249 > this.anInt8043) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method7917(@OriginalArg(0) Class196 arg0) {
		@Pc(3) Class78 local3 = this.method6720(Thread.currentThread());
		@Pc(7) Class12_Sub7 local7 = arg0.aClass243_1.aClass12_Sub7_5;
		for (@Pc(10) Class12_Sub7 local10 = local7.aClass12_Sub7_9; local10 != local7; local10 = local10.aClass12_Sub7_9) {
			@Pc(14) Class12_Sub7_Sub2 local14 = (Class12_Sub7_Sub2) local10;
			@Pc(19) int local19 = local14.anInt10249 >> 12;
			@Pc(24) int local24 = local14.anInt10247 >> 12;
			@Pc(29) int local29 = local14.anInt10252 >> 12;
			@Pc(54) float local54 = this.aClass26_Sub2_3.aFloat89 + this.aClass26_Sub2_3.aFloat85 * (float) local19 + this.aClass26_Sub2_3.aFloat82 * (float) local24 + this.aClass26_Sub2_3.aFloat83 * (float) local29;
			if (!(local54 < (float) this.anInt8065) && !(local54 > (float) local3.anInt2314)) {
				@Pc(102) int local102 = this.anInt8052 + (int) ((float) this.anInt8059 * (this.aClass26_Sub2_3.aFloat93 + this.aClass26_Sub2_3.aFloat91 * (float) local19 + this.aClass26_Sub2_3.aFloat90 * (float) local24 + this.aClass26_Sub2_3.aFloat84 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt8046 + (int) ((float) this.anInt8062 * (this.aClass26_Sub2_3.aFloat86 + this.aClass26_Sub2_3.aFloat87 * (float) local19 + this.aClass26_Sub2_3.aFloat92 * (float) local24 + this.aClass26_Sub2_3.aFloat88 * (float) local29) / local54);
				if (local102 >= this.anInt8067 && local102 <= this.anInt8066 && local137 >= this.anInt8047 && local137 <= this.anInt8044) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method6717(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt10251 * this.anInt8059 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78 local3 = this.method6720(Thread.currentThread());
		local3.aBoolean189 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass78Array1.length; local1++) {
			@Pc(7) Class78 local7 = this.aClass78Array1[local1];
			local7.anInt2312 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt2312 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt2312 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt2312 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt2312 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean188 = false;
			} else {
				local7.aBoolean188 = true;
			}
		}
	}

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "()V")
	@Override
	protected void method7905() {
		if (this.aBoolean561) {
			Static349.method5327(false, true);
			this.aBoolean561 = false;
		}
		this.aClass14_Sub6_1 = null;
		this.aCanvas9 = null;
		this.anInt8040 = 0;
		this.anInt8038 = 0;
		this.aClass187_56 = null;
		this.aBoolean560 = true;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
	@Override
	public void method7882(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt8039;
		for (@Pc(9) Object local9 = this.aClass264_52.method6365(); local9 != null; local9 = this.aClass264_52.method6363()) {
			@Pc(13) Class14_Sub12 local13 = (Class14_Sub12) local9;
			if (local13.aBoolean173) {
				local13.anInt2109 += local4;
				@Pc(27) int local27 = local13.anInt2109 / 20;
				if (local27 > 0) {
					@Pc(36) Class224 local36 = super.anInterface3_11.method6177(local13.anInt2110);
					local13.method1782(local36.aByte98 * local4 * 50 / 1000, local36.aByte97 * local4 * 50 / 1000);
					local13.anInt2109 -= local27 * 20;
				}
				local13.aBoolean173 = false;
			}
		}
		this.anInt8039 = arg0;
		this.lb.method6366(5);
		this.aClass264_52.method6366(5);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method7898(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class14_Sub6 local8 = (Class14_Sub6) this.aClass187_56.method4078((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method9315();
		local8 = Static410.method6059(arg2, arg0, arg1);
		this.aClass187_56.method4077((long) arg0.hashCode(), local8);
		if (this.aCanvas9 != arg0 || this.aClass177_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt8040 = local37.width;
		this.anInt8038 = local37.height;
		this.aClass14_Sub6_1 = local8;
		this.anIntArray612 = local8.anIntArray136;
		this.anInt8058 = local8.anInt1867;
		this.anInt8042 = local8.anInt1869;
		if (this.anInt8058 != this.anInt8051 || this.anInt8042 != this.anInt8045) {
			this.anInt8064 = this.anInt8051 = this.anInt8058;
			this.anInt8050 = this.anInt8045 = this.anInt8042;
			this.aFloatArray61 = this.aFloatArray62 = new float[this.anInt8051 * this.anInt8045];
		}
		this.method6725();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method7952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([I)V")
	@Override
	public void method7949(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8058;
		arg0[1] = this.anInt8042;
	}

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt8065;
	}

	@OriginalMember(owner = "client!pm", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass78Array1.length; local1++) {
			this.aClass78Array1[local1].anInt2311 = this.aClass78Array1[local1].anInt2312;
			this.aClass78Array1[local1].anInt2318 = arg0;
			this.aClass78Array1[local1].anInt2312 = arg1;
			this.aClass78Array1[local1].anInt2313 = arg2;
			this.aClass78Array1[local1].aBoolean190 = true;
		}
	}

	@OriginalMember(owner = "client!pm", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt8067 || arg0 >= this.anInt8066) {
			return;
		}
		if (arg1 < this.anInt8047) {
			arg2 -= this.anInt8047 - arg1;
			arg1 = this.anInt8047;
		}
		if (arg1 + arg2 > this.anInt8044) {
			arg2 = this.anInt8044 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8058;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray612[local40 + local54 * this.anInt8058] = arg3;
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
				local111 = local40 + local103 * this.anInt8058;
				local116 = this.anIntArray612[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray612[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt8058;
				local111 = this.anIntArray612[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray612[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!pt;)V")
	@Override
	public void method7933(@OriginalArg(0) Interface23 arg0) {
		@Pc(2) Class177 local2 = (Class177) arg0;
		this.anInt8058 = local2.anInt4723;
		this.anInt8042 = local2.anInt4722;
		this.anIntArray612 = local2.anIntArray378;
		this.aClass177_1 = local2;
		this.anInt8051 = local2.anInt4723;
		this.anInt8045 = local2.anInt4722;
		this.aFloatArray62 = local2.aFloatArray30;
		this.method6725();
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt8067) {
					arg1 += local104 * (this.anInt8067 - arg0);
					arg0 = this.anInt8067;
				}
				if (arg2 >= this.anInt8066) {
					arg2 = this.anInt8066 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8047 && local150 < this.anInt8044) {
							this.anIntArray612[arg0 + local150 * this.anInt8058] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt8047 && local213 < this.anInt8044) {
							local228 = arg0 + local213 * this.anInt8058;
							local233 = this.anIntArray612[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray612[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8047 && local150 < this.anInt8044) {
							local213 = arg0 + local150 * this.anInt8058;
							local228 = this.anIntArray612[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray612[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt8047) {
					arg0 += local104 * (this.anInt8047 - arg1);
					arg1 = this.anInt8047;
				}
				if (arg3 >= this.anInt8044) {
					arg3 = this.anInt8044 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8067 && local150 < this.anInt8066) {
							this.anIntArray612[local150 + arg1 * this.anInt8058] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt8067 && local213 < this.anInt8066) {
							local228 = local213 + arg1 * this.anInt8058;
							local233 = this.anIntArray612[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray612[local213 + arg1 * this.anInt8058] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8067 && local150 < this.anInt8066) {
							local213 = local150 + arg1 * this.anInt8058;
							local228 = this.anIntArray612[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray612[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "()Z")
	@Override
	public boolean method7873() {
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "(I)I")
	public int method6724(@OriginalArg(0) int arg0) {
		return super.anInterface3_11.method6177(arg0).aShort74 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pm", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt8058 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray612[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!pm", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt8067 == 0 && this.anInt8066 == this.anInt8058 && this.anInt8047 == 0 && this.anInt8044 == this.anInt8042) {
			local19 = this.aFloatArray62.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray62[local27++] = 2.14748365E9F;
				this.aFloatArray62[local27++] = 2.14748365E9F;
				this.aFloatArray62[local27++] = 2.14748365E9F;
				this.aFloatArray62[local27++] = 2.14748365E9F;
				this.aFloatArray62[local27++] = 2.14748365E9F;
				this.aFloatArray62[local27++] = 2.14748365E9F;
				this.aFloatArray62[local27++] = 2.14748365E9F;
				this.aFloatArray62[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray62[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt8066 - this.anInt8067;
		local25 = this.anInt8044 - this.anInt8047;
		local27 = this.anInt8058 - local19;
		@Pc(116) int local116 = this.anInt8067 + this.anInt8047 * this.anInt8058;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray62[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray62[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray62[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray62[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray62[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray62[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray62[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray62[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray62[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "()V")
	private void method6725() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8068; local1++) {
			this.aClass78Array1[local1].method1960();
		}
		this.la();
	}

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass26_Sub2_3.aFloat85 * (float) arg0 + this.aClass26_Sub2_3.aFloat82 * (float) arg1 + this.aClass26_Sub2_3.aFloat83 * (float) arg2 + this.aClass26_Sub2_3.aFloat89;
		@Pc(49) float local49 = this.aClass26_Sub2_3.aFloat85 * (float) arg3 + this.aClass26_Sub2_3.aFloat82 * (float) arg4 + this.aClass26_Sub2_3.aFloat83 * (float) arg5 + this.aClass26_Sub2_3.aFloat89;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt8065 && local49 < (float) this.anInt8065) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt8056 && local49 > (float) this.anInt8056) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt8059 * (this.aClass26_Sub2_3.aFloat91 * (float) arg0 + this.aClass26_Sub2_3.aFloat90 * (float) arg1 + this.aClass26_Sub2_3.aFloat84 * (float) arg2 + this.aClass26_Sub2_3.aFloat93) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt8059 * (this.aClass26_Sub2_3.aFloat91 * (float) arg3 + this.aClass26_Sub2_3.aFloat90 * (float) arg4 + this.aClass26_Sub2_3.aFloat84 * (float) arg5 + this.aClass26_Sub2_3.aFloat93) / (float) arg6);
		if (local117 < this.anInt8053 && local150 < this.anInt8053) {
			local51 |= 0x1;
		} else if (local117 > this.anInt8070 && local150 > this.anInt8070) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt8062 * (this.aClass26_Sub2_3.aFloat87 * (float) arg0 + this.aClass26_Sub2_3.aFloat92 * (float) arg1 + this.aClass26_Sub2_3.aFloat88 * (float) arg2 + this.aClass26_Sub2_3.aFloat86) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt8062 * (this.aClass26_Sub2_3.aFloat87 * (float) arg3 + this.aClass26_Sub2_3.aFloat92 * (float) arg4 + this.aClass26_Sub2_3.aFloat88 * (float) arg5 + this.aClass26_Sub2_3.aFloat86) / (float) arg6);
		if (local208 < this.anInt8049 && local241 < this.anInt8049) {
			local51 |= 0x4;
		} else if (local208 > this.anInt8043 && local241 > this.anInt8043) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class78 local3 = this.method6720(Thread.currentThread());
		@Pc(6) Class323 local6 = local3.aClass323_1;
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
		@Pc(105) int local105 = arg0 - local6.method7727();
		@Pc(110) int local110 = arg1 - local6.method7714();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt9336 = 0;
		this.C(false);
		local6.aBoolean657 = local114 < 0 || local114 > local6.anInt9340 || local118 < 0 || local118 > local6.anInt9340 || local124 < 0 || local124 > local6.anInt9340;
		local6.method7720((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean657 = local114 < 0 || local114 > local6.anInt9340 || local124 < 0 || local124 > local6.anInt9340 || local130 < 0 || local130 > local6.anInt9340;
		local6.method7720((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "(I)[I")
	public int[] method6726(@OriginalArg(0) int arg0) {
		@Pc(2) Class264 local2 = this.aClass264_52;
		@Pc(14) Class14_Sub12 local14;
		synchronized (this.aClass264_52) {
			local14 = (Class14_Sub12) this.aClass264_52.method6367((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface3_11.method6181(arg0)) {
					return null;
				}
				@Pc(34) Class224 local34 = super.anInterface3_11.method6177(arg0);
				@Pc(45) int local45 = local34.aBoolean455 || this.aBoolean562 ? 64 : this.anInt8063;
				local14 = new Class14_Sub12(arg0, local45, super.anInterface3_11.method6176(arg0, local45, local45, 0.7F), local34.anInt6492 != 1);
				this.aClass264_52.method6364((long) arg0 | Long.MIN_VALUE, local14);
			}
		}
		local14.aBoolean173 = true;
		return local14.method1781();
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(I)V")
	@Override
	public void method7895(@OriginalArg(0) int arg0) {
		this.aClass78Array1[arg0].method1961((Runnable) null);
	}

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "()V")
	@Override
	public void method7906() {
		this.aClass264_52.method6360();
		this.lb.method6360();
	}

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "()V")
	@Override
	public void method7893() {
		if (this.aCanvas9 == null) {
			this.anInt8058 = 1;
			this.anInt8042 = 1;
			this.anIntArray612 = null;
			this.anInt8051 = 1;
			this.anInt8045 = 1;
			this.aFloatArray62 = null;
		} else {
			this.anIntArray612 = this.aClass14_Sub6_1.anIntArray136;
			this.anInt8058 = this.aClass14_Sub6_1.anInt1867;
			this.anInt8042 = this.aClass14_Sub6_1.anInt1869;
			this.aFloatArray62 = this.aFloatArray61;
			this.anInt8051 = this.anInt8064;
			this.anInt8045 = this.anInt8050;
		}
		this.aClass177_1 = null;
		this.method6725();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIZ)Lclient!jd;")
	@Override
	public Class20 method7925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class20_Sub1_Sub1(this, arg0, arg1) : new Class20_Sub1_Sub2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class51 method7908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class51_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class78 local3 = this.method6720(Thread.currentThread());
		this.anInt8065 = arg0;
		this.anInt8056 = arg1;
		local3.anInt2314 = this.anInt8056 - 255;
	}

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "(I)[I")
	public int[] method6727(@OriginalArg(0) int arg0) {
		@Pc(2) Class264 local2 = this.aClass264_52;
		@Pc(12) Class14_Sub12 local12;
		synchronized (this.aClass264_52) {
			local12 = (Class14_Sub12) this.aClass264_52.method6367((long) arg0);
			if (local12 == null) {
				if (!super.anInterface3_11.method6181(arg0)) {
					return null;
				}
				@Pc(32) Class224 local32 = super.anInterface3_11.method6177(arg0);
				@Pc(43) int local43 = local32.aBoolean455 || this.aBoolean562 ? 64 : this.anInt8063;
				local12 = new Class14_Sub12(arg0, local43, super.anInterface3_11.method6180(local43, local43, true, arg0, 0.7F), local32.anInt6492 != 1);
				this.aClass264_52.method6364((long) arg0, local12);
			}
		}
		local12.aBoolean173 = true;
		return local12.method1781();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method7886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray500;
		@Pc(8) int[] local8 = local2.anIntArray499;
		@Pc(17) int local17 = this.anInt8047 > arg7 ? this.anInt8047 : arg7;
		@Pc(32) int local32 = this.anInt8044 < arg7 + local5.length ? this.anInt8044 : arg7 + local5.length;
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
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt8067 && local172 < this.anInt8066 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray612[local172 + arg1 * this.anInt8058] = arg4;
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
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt8067 && local176 < this.anInt8066 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt8058;
						local316 = this.anIntArray612[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray612[local176 + arg1 * this.anInt8058] = local263 + local707;
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
				if (arg0 >= this.anInt8067 && arg0 < this.anInt8066 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray612[arg0 + local172 * this.anInt8058] = arg4;
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
			if (arg0 >= this.anInt8067 && arg0 < this.anInt8066 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt8058;
					@Pc(321) int local321 = this.anIntArray612[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray612[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Lclient!za;")
	@Override
	public Class14_Sub7 method7875(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "()Z")
	@Override
	public boolean method7909() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "()V")
	private void method6728() {
		this.anInt8053 = this.anInt8067 - this.anInt8052;
		this.anInt8070 = this.anInt8066 - this.anInt8052;
		this.anInt8049 = this.anInt8047 - this.anInt8046;
		this.anInt8043 = this.anInt8044 - this.anInt8046;
		for (@Pc(29) int local29 = 0; local29 < this.anInt8068; local29++) {
			@Pc(36) Class323 local36 = this.aClass78Array1[local29].aClass323_1;
			local36.anInt9337 = this.anInt8052 - this.anInt8067;
			local36.anInt9338 = this.anInt8046 - this.anInt8047;
			local36.anInt9340 = this.anInt8066 - this.anInt8067;
			local36.anInt9339 = this.anInt8044 - this.anInt8047;
		}
		@Pc(78) int local78 = this.anInt8047 * this.anInt8058 + this.anInt8067;
		for (@Pc(81) int local81 = this.anInt8047; local81 < this.anInt8044; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt8068; local84++) {
				this.aClass78Array1[local84].aClass323_1.anIntArray683[local81 - this.anInt8047] = local78;
			}
			local78 += this.anInt8058;
		}
	}

	@OriginalMember(owner = "client!pm", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt8041;
		this.anInt8041 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!pm", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8067 < arg0) {
			this.anInt8067 = arg0;
		}
		if (this.anInt8047 < arg1) {
			this.anInt8047 = arg1;
		}
		if (this.anInt8066 > arg2) {
			this.anInt8066 = arg2;
		}
		if (this.anInt8044 > arg3) {
			this.anInt8044 = arg3;
		}
		this.method6728();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method7932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method6721(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method6721(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
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
						if (arg0 >= this.anInt8067 && arg0 < this.anInt8066 && local267 >= this.anInt8047 && local267 < this.anInt8044 && arg7 < local143) {
							this.anIntArray612[arg0 + local267 * this.anInt8058] = arg4;
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
						if (arg0 >= this.anInt8067 && arg0 < this.anInt8066 && local349 >= this.anInt8047 && local349 < this.anInt8044 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt8058;
							local380 = this.anIntArray612[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray612[local375] = local340 + local380;
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
						if (arg1 >= this.anInt8047 && arg1 < this.anInt8044 && local267 >= this.anInt8067 && local267 < this.anInt8066 && arg7 < local143) {
							this.anIntArray612[local267 + arg1 * this.anInt8058] = arg4;
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
						if (arg1 >= this.anInt8047 && arg1 < this.anInt8044 && local349 >= this.anInt8067 && local349 < this.anInt8066 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt8058;
							local380 = this.anIntArray612[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray612[local349 + arg1 * this.anInt8058] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method6730(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method6730(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!qaa;)V")
	@Override
	public void method7890(@OriginalArg(0) Class144 arg0) {
	}

	@OriginalMember(owner = "client!pm", name = "p", descriptor = "(I)Z")
	public boolean method6729(@OriginalArg(0) int arg0) {
		return this.aBoolean562 || super.anInterface3_11.method6177(arg0).aBoolean455;
	}

	@OriginalMember(owner = "client!pm", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray500;
		@Pc(8) int[] local8 = local2.anIntArray499;
		@Pc(20) int local20;
		if (this.anInt8044 < arg3 + local5.length) {
			local20 = this.anInt8044 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt8047 > arg3) {
			local33 = this.anInt8047 - arg3;
			arg3 = this.anInt8047;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt8058;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt8067 > local58) {
				local62 -= this.anInt8067 - local58;
				local58 = this.anInt8067;
			}
			if (this.anInt8066 < local58 + local62) {
				local62 = this.anInt8066 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray612[local58++] = arg0;
			}
			local49 += this.anInt8058;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIIIF)Lclient!qm;")
	@Override
	public Class14_Sub37 method7871(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "()Z")
	@Override
	public boolean method7911() {
		return true;
	}

	@OriginalMember(owner = "client!pm", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt8067) {
			arg2 -= this.anInt8067 - arg0;
			arg0 = this.anInt8067;
		}
		if (arg1 < this.anInt8047) {
			arg3 -= this.anInt8047 - arg1;
			arg1 = this.anInt8047;
		}
		if (arg0 + arg2 > this.anInt8066) {
			arg2 = this.anInt8066 - arg0;
		}
		if (arg1 + arg3 > this.anInt8044) {
			arg3 = this.anInt8044 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt8066 || arg1 > this.anInt8044) {
			return;
		}
		@Pc(67) int local67 = this.anInt8058 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt8058;
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
						local217 = this.anIntArray612[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray612[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray612[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray612[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray612[arg2] = arg4;
					arg2++;
					this.anIntArray612[arg2] = arg4;
					arg2++;
					this.anIntArray612[arg2] = arg4;
					arg2++;
					this.anIntArray612[arg2] = arg4;
					arg2++;
					this.anIntArray612[arg2] = arg4;
					arg2++;
					this.anIntArray612[arg2] = arg4;
					arg2++;
					this.anIntArray612[arg2] = arg4;
					arg2++;
					this.anIntArray612[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray612[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!pm", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8067;
		arg0[1] = this.anInt8047;
		arg0[2] = this.anInt8066;
		arg0[3] = this.anInt8044;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt8051 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt8051 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray62;
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

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	@Override
	public void method7889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas9 == null || this.aClass14_Sub6_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas9.getGraphics();
			this.aClass14_Sub6_1.method1597(this.anInt8038, arg1, this.anInt8040, 0, local14, arg0, 0);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas9.repaint();
		}
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIIIIII)V")
	private void method6730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt8067 || arg0 >= this.anInt8066) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt8058;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt8047 && arg1 + local37 < this.anInt8044 && local27 < arg4) {
					this.anIntArray612[local15 + local37 * this.anInt8058] = arg3;
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
			if (arg1 + local106 >= this.anInt8047 && arg1 + local106 < this.anInt8044 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt8058;
				@Pc(134) int local134 = this.anIntArray612[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray612[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!pm", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt8067 = 0;
		this.anInt8047 = 0;
		this.anInt8066 = this.anInt8058;
		this.anInt8044 = this.anInt8042;
		this.method6728();
	}

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "(I)V")
	@Override
	public void method7930() {
		Static435.anInt7787 = 10000;
		Static435.anInt7778 = 10000;
		if (this.anInt8068 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method7913(this.anInt8068);
		this.method7926(0);
	}

	@OriginalMember(owner = "client!pm", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!pm", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt8048 = (int) (arg1 * 65535.0F);
		this.anInt8061 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt8055 = (int) (arg3 * 65535.0F / local26);
		this.anInt8054 = (int) (arg4 * 65535.0F / local26);
		this.anInt8057 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "()Z")
	@Override
	public boolean method7867() {
		return false;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "(II)I")
	@Override
	public int method7922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "()Lclient!qja;")
	@Override
	public Class26 method7872() {
		return this.aClass26_Sub2_3;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7910(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas9 == arg0) {
			this.method7939((Canvas) null);
		}
		@Pc(15) Class14_Sub6 local15 = (Class14_Sub6) this.aClass187_56.method4078((long) arg0.hashCode());
		if (local15 != null) {
			local15.method9315();
		}
	}
}
