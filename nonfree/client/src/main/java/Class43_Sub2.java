import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!dda", name = "t", descriptor = "Z")
	private boolean aBoolean178;

	@OriginalMember(owner = "client!dda", name = "u", descriptor = "Lclient!sl;")
	private Class310 aClass310_6;

	@OriginalMember(owner = "client!dda", name = "v", descriptor = "I")
	private int anInt2130;

	@OriginalMember(owner = "client!dda", name = "w", descriptor = "Lclient!uf;")
	private Class3_Sub19 aClass3_Sub19_1;

	@OriginalMember(owner = "client!dda", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!dda", name = "y", descriptor = "Z")
	private boolean aBoolean179;

	@OriginalMember(owner = "client!dda", name = "z", descriptor = "I")
	public int anInt2131;

	@OriginalMember(owner = "client!dda", name = "A", descriptor = "[Lclient!ej;")
	private Class78[] aClass78Array1;

	@OriginalMember(owner = "client!dda", name = "B", descriptor = "Lclient!f;")
	private Class46 aClass46_5;

	@OriginalMember(owner = "client!dda", name = "C", descriptor = "I")
	public int anInt2132;

	@OriginalMember(owner = "client!dda", name = "D", descriptor = "[I")
	public int[] anIntArray137;

	@OriginalMember(owner = "client!dda", name = "E", descriptor = "Lclient!aj;")
	private final Class10 aClass10_5;

	@OriginalMember(owner = "client!dda", name = "F", descriptor = "I")
	public int anInt2133;

	@OriginalMember(owner = "client!dda", name = "G", descriptor = "I")
	private int anInt2134;

	@OriginalMember(owner = "client!dda", name = "H", descriptor = "I")
	public int anInt2135;

	@OriginalMember(owner = "client!dda", name = "J", descriptor = "I")
	public int anInt2136;

	@OriginalMember(owner = "client!dda", name = "K", descriptor = "Z")
	private boolean aBoolean180;

	@OriginalMember(owner = "client!dda", name = "L", descriptor = "I")
	public int anInt2137;

	@OriginalMember(owner = "client!dda", name = "M", descriptor = "I")
	private int anInt2138;

	@OriginalMember(owner = "client!dda", name = "N", descriptor = "I")
	public int anInt2139;

	@OriginalMember(owner = "client!dda", name = "O", descriptor = "I")
	public int anInt2140;

	@OriginalMember(owner = "client!dda", name = "P", descriptor = "I")
	private int anInt2141;

	@OriginalMember(owner = "client!dda", name = "Q", descriptor = "I")
	public int anInt2142;

	@OriginalMember(owner = "client!dda", name = "R", descriptor = "I")
	public int anInt2143;

	@OriginalMember(owner = "client!dda", name = "S", descriptor = "I")
	public int anInt2144;

	@OriginalMember(owner = "client!dda", name = "U", descriptor = "I")
	public int anInt2145;

	@OriginalMember(owner = "client!dda", name = "V", descriptor = "I")
	public int anInt2146;

	@OriginalMember(owner = "client!dda", name = "W", descriptor = "I")
	private int anInt2147;

	@OriginalMember(owner = "client!dda", name = "X", descriptor = "I")
	public int anInt2148;

	@OriginalMember(owner = "client!dda", name = "Y", descriptor = "I")
	public int anInt2149;

	@OriginalMember(owner = "client!dda", name = "Z", descriptor = "Lclient!g;")
	public Class109_Sub1 aClass109_Sub1_1;

	@OriginalMember(owner = "client!dda", name = "ab", descriptor = "I")
	public int anInt2150;

	@OriginalMember(owner = "client!dda", name = "bb", descriptor = "I")
	public int anInt2151;

	@OriginalMember(owner = "client!dda", name = "cb", descriptor = "I")
	public int anInt2152;

	@OriginalMember(owner = "client!dda", name = "db", descriptor = "I")
	public int anInt2153;

	@OriginalMember(owner = "client!dda", name = "eb", descriptor = "I")
	public int anInt2154;

	@OriginalMember(owner = "client!dda", name = "fb", descriptor = "I")
	public int anInt2155;

	@OriginalMember(owner = "client!dda", name = "gb", descriptor = "I")
	public int anInt2156;

	@OriginalMember(owner = "client!dda", name = "hb", descriptor = "[I")
	public int[] anIntArray138;

	@OriginalMember(owner = "client!dda", name = "ib", descriptor = "I")
	private int anInt2157;

	@OriginalMember(owner = "client!dda", name = "jb", descriptor = "Lclient!aj;")
	private final Class10 aClass10_6;

	@OriginalMember(owner = "client!dda", name = "kb", descriptor = "Lclient!f;")
	private Class46 aClass46_6;

	@OriginalMember(owner = "client!dda", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public Class43_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		this(arg1);
		this.method7199(arg0);
		this.method7163(arg0);
	}

	@OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lclient!fa;)V")
	private Class43_Sub2(@OriginalArg(0) Interface8 arg0) {
		super(arg0);
		this.aBoolean178 = false;
		this.aBoolean179 = false;
		this.aClass310_6 = new Class310(4);
		this.aBoolean180 = false;
		this.anInt2133 = 0;
		this.anInt2144 = 75518;
		this.anInt2131 = 0;
		this.anInt2136 = 78642;
		this.anInt2143 = 512;
		this.anInt2132 = 0;
		this.anInt2151 = 50;
		this.anInt2145 = 0;
		this.anInt2141 = 0;
		this.anInt2150 = 512;
		this.anInt2153 = 45823;
		this.anInt2155 = 3500;
		this.anInt2157 = 0;
		this.aClass10_5 = new Class10(16);
		this.lb = -1;
		this.aClass10_6 = new Class10(256);
		this.aClass109_Sub1_1 = new Class109_Sub1();
		this.method7157(1);
		this.method7141(0);
		Static497.method6706(true, false);
		this.aBoolean178 = true;
		this.anInt2130 = (int) Static587.method7753();
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(I)[I")
	private int[] method1931(@OriginalArg(0) int arg0) {
		@Pc(2) Class10 local2 = this.aClass10_6;
		@Pc(12) Class3_Sub23 local12;
		synchronized (this.aClass10_6) {
			local12 = (Class3_Sub23) this.aClass10_6.method250((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_12.method6559(arg0)) {
					return null;
				}
				@Pc(32) Class224 local32 = super.anInterface8_12.method6560(arg0);
				@Pc(42) int local42 = local32.aBoolean490 || this.aBoolean180 ? 64 : 128;
				local12 = new Class3_Sub23(arg0, local42, super.anInterface8_12.method6556(arg0, local42, 0.7F, local42), local32.aBoolean496);
				this.aClass10_6.method254(local12, (long) arg0);
			}
		}
		local12.aBoolean270 = true;
		return local12.method2925();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)I")
	@Override
	public int method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!dda", name = "s", descriptor = "()V")
	@Override
	public void method7177() {
	}

	@OriginalMember(owner = "client!dda", name = "A", descriptor = "()Z")
	@Override
	public boolean method7211() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method7156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class146 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class146_Sub1 local2 = (Class146_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray345;
		@Pc(8) int[] local8 = local2.anIntArray344;
		@Pc(17) int local17 = this.anInt2133 > arg7 ? this.anInt2133 : arg7;
		@Pc(32) int local32 = this.anInt2131 < arg7 + local5.length ? this.anInt2131 : arg7 + local5.length;
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
					if (local129 >= this.anInt2132 && local129 < this.anInt2145 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray137[local129 + arg1 * this.anInt2139] = arg4;
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
					if (local133 >= this.anInt2132 && local133 < this.anInt2145 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt2139;
						local248 = this.anIntArray137[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray137[local133 + arg1 * this.anInt2139] = local201 + local584;
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
		if (arg0 < this.anInt2132) {
			arg1 += local83 * (this.anInt2132 - arg0);
			arg0 = this.anInt2132;
		}
		if (arg2 >= this.anInt2145) {
			arg2 = this.anInt2145 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray137[arg0 + local129 * this.anInt2139] = arg4;
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
					local243 = arg0 + local133 * this.anInt2139;
					local248 = this.anIntArray137[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray137[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!dda", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt2132 = 0;
		this.anInt2133 = 0;
		this.anInt2145 = this.anInt2139;
		this.anInt2131 = this.anInt2138;
		this.method1935();
	}

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "()I")
	@Override
	public int method7159() {
		return 0;
	}

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "(IIIIII)V")
	private void method1932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(12) int local12 = arg1 - arg3;
		if (local12 < this.anInt2133) {
			local12 = this.anInt2133;
		}
		@Pc(25) int local25 = arg1 + arg3 + 1;
		if (local25 > this.anInt2131) {
			local25 = this.anInt2131;
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
				if (local95 < this.anInt2132) {
					local95 = this.anInt2132;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt2145) {
					local106 = this.anInt2145;
				}
				local120 = local95 + local34 * this.anInt2139;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray138[local120]) {
						this.anIntArray137[local120] = arg4;
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
				if (local95 < this.anInt2132) {
					local95 = this.anInt2132;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt2145 - 1) {
					local106 = this.anInt2145 - 1;
				}
				local120 = local95 + local34 * this.anInt2139;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray138[local120]) {
						this.anIntArray137[local120] = arg4;
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
				if (local106 < this.anInt2132) {
					local106 = this.anInt2132;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt2145) {
					local120 = this.anInt2145;
				}
				local122 = local106 + local34 * this.anInt2139;
				for (local350 = local106; local350 < local120; local350++) {
					if (local8 < this.anIntArray138[local122]) {
						local362 = this.anIntArray137[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray137[local122] = local293 + local362;
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
				if (local106 < this.anInt2132) {
					local106 = this.anInt2132;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt2145 - 1) {
					local120 = this.anInt2145 - 1;
				}
				local122 = local106 + local34 * this.anInt2139;
				for (local350 = local106; local350 <= local120; local350++) {
					if (local8 < this.anIntArray138[local122]) {
						local362 = this.anIntArray137[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray137[local122] = local293 + local362;
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
				if (local95 < this.anInt2132) {
					local95 = this.anInt2132;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt2145) {
					local106 = this.anInt2145;
				}
				local120 = local95 + local34 * this.anInt2139;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray138[local120]) {
						local350 = this.anIntArray137[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(637) int local637 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray137[local120] = local362 - local637 | local637 - (local637 >>> 8);
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
				if (local95 < this.anInt2132) {
					local95 = this.anInt2132;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt2145 - 1) {
					local106 = this.anInt2145 - 1;
				}
				local120 = local95 + local34 * this.anInt2139;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray138[local120]) {
						local350 = this.anIntArray137[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray137[local120] = local362 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "()Z")
	@Override
	public boolean method7147() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V")
	@Override
	public void method7157(@OriginalArg(0) int arg0) {
		this.anInt2156 = arg0;
		this.aClass78Array1 = new Class78[this.anInt2156];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2156; local9++) {
			this.aClass78Array1[local9] = new Class78(this);
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V")
	@Override
	public void method7206(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
	@Override
	public void method7141(@OriginalArg(0) int arg0) {
		this.aClass78Array1[arg0].method2475(Thread.currentThread());
	}

	@OriginalMember(owner = "client!dda", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt2151;
	}

	@OriginalMember(owner = "client!dda", name = "q", descriptor = "()Z")
	@Override
	public boolean method7172() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt2154, this.anInt2137, this.anInt2150, this.anInt2143 };
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class46 method7143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class46_Sub1_Sub1(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!dda", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt2155;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method7201(@OriginalArg(0) Class3_Sub16 arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "(I)Z")
	public boolean method1933(@OriginalArg(0) int arg0) {
		return super.anInterface8_12.method6560(arg0).aBoolean494;
	}

	@OriginalMember(owner = "client!dda", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass78Array1.length; local1++) {
			this.aClass78Array1[local1].anInt2700 = this.aClass78Array1[local1].anInt2702;
			this.aClass78Array1[local1].anInt2704 = arg0;
			this.aClass78Array1[local1].anInt2702 = arg1;
			this.aClass78Array1[local1].anInt2708 = arg2;
			this.aClass78Array1[local1].aBoolean226 = true;
		}
	}

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7160() {
		return new Class109_Sub1();
	}

	@OriginalMember(owner = "client!dda", name = "j", descriptor = "(I)I")
	public int method1934(@OriginalArg(0) int arg0) {
		return super.anInterface8_12.method6560(arg0).aShort76 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dda", name = "D", descriptor = "()V")
	private void method1935() {
		this.anInt2152 = this.anInt2132 - this.anInt2154;
		this.anInt2146 = this.anInt2145 - this.anInt2154;
		this.anInt2149 = this.anInt2133 - this.anInt2137;
		this.anInt2142 = this.anInt2131 - this.anInt2137;
		for (@Pc(29) int local29 = 0; local29 < this.anInt2156; local29++) {
			@Pc(36) Class199 local36 = this.aClass78Array1[local29].aClass199_2;
			local36.anInt5337 = this.anInt2154 - this.anInt2132;
			local36.anInt5338 = this.anInt2137 - this.anInt2133;
			local36.anInt5336 = this.anInt2145 - this.anInt2132;
			local36.anInt5341 = this.anInt2131 - this.anInt2133;
		}
		@Pc(78) int local78 = this.anInt2133 * this.anInt2139 + this.anInt2132;
		for (@Pc(81) int local81 = this.anInt2133; local81 < this.anInt2131; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt2156; local84++) {
				this.aClass78Array1[local84].aClass199_2.anIntArray406[local81 - this.anInt2133] = local78;
			}
			local78 += this.anInt2139;
		}
	}

	@OriginalMember(owner = "client!dda", name = "k", descriptor = "(I)Z")
	public boolean method1936(@OriginalArg(0) int arg0) {
		return super.anInterface8_12.method6559(arg0);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7190(@OriginalArg(0) Class46 arg0) {
		if (arg0 instanceof Class46_Sub1_Sub2) {
			@Pc(5) Class46_Sub1_Sub2 local5 = (Class46_Sub1_Sub2) arg0;
			this.anInt2139 = local5.anInt4155;
			this.anInt2138 = local5.anInt4159;
			this.anIntArray137 = local5.anIntArray288;
			this.aClass46_5 = arg0;
		} else if (arg0 instanceof Class46_Sub1_Sub1) {
			@Pc(27) Class46_Sub1_Sub1 local27 = (Class46_Sub1_Sub1) arg0;
			this.anInt2139 = local27.anInt4155;
			this.anInt2138 = local27.anInt4159;
			this.anIntArray137 = local27.anIntArray113;
			this.aClass46_5 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method1937();
	}

	@OriginalMember(owner = "client!dda", name = "x", descriptor = "()V")
	@Override
	public void method7197() throws Exception_Sub1 {
		if (this.aCanvas3 == null || this.aClass3_Sub19_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			this.aClass3_Sub19_1.method6858(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!daa;[Lclient!vw;Z)Lclient!la;")
	@Override
	public Class117 method7139(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class355[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt9165;
			local7[local11] = arg1[local11].anInt9162;
			if (arg1[local11].aByteArray105 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class117_Sub5(this, arg0, arg1, local3, local7);
		} else {
			return new Class117_Sub3(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!dda", name = "E", descriptor = "()V")
	private void method1937() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2156; local1++) {
			this.aClass78Array1[local1].method2469();
		}
		this.JA();
	}

	@OriginalMember(owner = "client!dda", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2132 < arg0) {
			this.anInt2132 = arg0;
		}
		if (this.anInt2133 < arg1) {
			this.anInt2133 = arg1;
		}
		if (this.anInt2145 > arg2) {
			this.anInt2145 = arg2;
		}
		if (this.anInt2131 > arg3) {
			this.anInt2131 = arg3;
		}
		this.method1935();
	}

	@OriginalMember(owner = "client!dda", name = "w", descriptor = "()Z")
	@Override
	public boolean method7192() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass109_Sub1_1.aFloat54 + this.aClass109_Sub1_1.aFloat51 * (float) arg0 + this.aClass109_Sub1_1.aFloat61 * (float) arg1 + this.aClass109_Sub1_1.aFloat50 * (float) arg2;
		if (local24 < (float) this.anInt2151 || local24 > (float) this.anInt2155) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt2150 * (this.aClass109_Sub1_1.aFloat55 + this.aClass109_Sub1_1.aFloat59 * (float) arg0 + this.aClass109_Sub1_1.aFloat56 * (float) arg1 + this.aClass109_Sub1_1.aFloat57 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt2143 * (this.aClass109_Sub1_1.aFloat58 + this.aClass109_Sub1_1.aFloat53 * (float) arg0 + this.aClass109_Sub1_1.aFloat60 * (float) arg1 + this.aClass109_Sub1_1.aFloat52 * (float) arg2) / local24);
		if (local81 >= this.anInt2152 && local81 <= this.anInt2146 && local113 >= this.anInt2149 && local113 <= this.anInt2142) {
			arg3[0] = local81 - this.anInt2152;
			arg3[1] = local113 - this.anInt2149;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7199(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub19 local8 = (Class3_Sub19) this.aClass310_6.method6601((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static458.method6374(arg0);
			this.aClass310_6.method6603(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "()Z")
	@Override
	public boolean method7162() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt2132) {
			arg2 -= this.anInt2132 - arg0;
			arg0 = this.anInt2132;
		}
		if (arg1 < this.anInt2133) {
			arg3 -= this.anInt2133 - arg1;
			arg1 = this.anInt2133;
		}
		if (arg0 + arg2 > this.anInt2145) {
			arg2 = this.anInt2145 - arg0;
		}
		if (arg1 + arg3 > this.anInt2131) {
			arg3 = this.anInt2131 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt2145 || arg1 > this.anInt2131) {
			return;
		}
		@Pc(67) int local67 = this.anInt2139 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt2139;
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
						local217 = this.anIntArray137[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray137[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray137[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray137[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray137[arg2] = arg4;
					arg2++;
					this.anIntArray137[arg2] = arg4;
					arg2++;
					this.anIntArray137[arg2] = arg4;
					arg2++;
					this.anIntArray137[arg2] = arg4;
					arg2++;
					this.anIntArray137[arg2] = arg4;
					arg2++;
					this.anIntArray137[arg2] = arg4;
					arg2++;
					this.anIntArray137[arg2] = arg4;
					arg2++;
					this.anIntArray137[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray137[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!dda", name = "B", descriptor = "()Z")
	@Override
	public boolean method7216() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "(IIIIII)Lclient!js;")
	@Override
	public Class55 method7208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!dda", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class78 local3 = this.method1940(Thread.currentThread());
		this.anInt2151 = arg0;
		this.anInt2155 = arg1;
		local3.anInt2703 = this.anInt2155 - 255;
	}

	@OriginalMember(owner = "client!dda", name = "t", descriptor = "()Z")
	@Override
	public boolean method7180() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt2133) {
			local8 = this.anInt2133;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt2131) {
			local21 = this.anInt2131;
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
				if (local91 < this.anInt2132) {
					local91 = this.anInt2132;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2145) {
					local102 = this.anInt2145;
				}
				local116 = local91 + local30 * this.anInt2139;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray137[local116++] = arg3;
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
				if (local91 < this.anInt2132) {
					local91 = this.anInt2132;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt2145 - 1) {
					local102 = this.anInt2145 - 1;
				}
				local116 = local91 + local30 * this.anInt2139;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray137[local116++] = arg3;
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
			if (local102 < this.anInt2132) {
				local102 = this.anInt2132;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt2145) {
				local116 = this.anInt2145;
			}
			local118 = local102 + local30 * this.anInt2139;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray137[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray137[local118++] = local277 + local360;
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
			if (local102 < this.anInt2132) {
				local102 = this.anInt2132;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt2145 - 1) {
				local116 = this.anInt2145 - 1;
			}
			local118 = local102 + local30 * this.anInt2139;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray137[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray137[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)V")
	@Override
	public void method7182(@OriginalArg(0) int arg0) {
		this.aClass78Array1[arg0].method2475(null);
	}

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "()V")
	@Override
	public void method7152() {
		if (this.aCanvas3 == null) {
			this.anInt2139 = 1;
			this.anInt2138 = 1;
			this.anIntArray137 = null;
		} else {
			this.anIntArray137 = this.aClass3_Sub19_1.anIntArray623;
			this.anInt2139 = this.aClass3_Sub19_1.anInt8143;
			this.anInt2138 = this.aClass3_Sub19_1.anInt8145;
		}
		this.aClass46_5 = null;
		this.method1937();
	}

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt2132 || arg0 >= this.anInt2145) {
			return;
		}
		if (arg1 < this.anInt2133) {
			arg2 -= this.anInt2133 - arg1;
			arg1 = this.anInt2133;
		}
		if (arg1 + arg2 > this.anInt2131) {
			arg2 = this.anInt2131 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2139;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray137[local40 + local54 * this.anInt2139] = arg3;
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
				local111 = local40 + local103 * this.anInt2139;
				local116 = this.anIntArray137[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray137[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt2139;
				local111 = this.anIntArray137[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray137[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!js;)V")
	@Override
	public void method7148(@OriginalArg(0) Class55 arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!vh;IIII)V")
	private void method1938(@OriginalArg(0) Class9_Sub8_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt6182;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method1932(arg1, arg2, arg3, arg4, arg0.anInt6178, 1);
			return;
		}
		if (this.lb != local2) {
			@Pc(33) Class46 local33 = (Class46) this.aClass10_5.method250((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method1931(local2);
				if (local39 == null) {
					return;
				}
				@Pc(49) int local49 = this.method1941(local2) ? 64 : 128;
				local33 = this.method7198(local39, local49, local49, local49);
				this.aClass10_5.method254(local33, (long) local2);
			}
			this.lb = local2;
			this.aClass46_6 = local33;
		}
		local8++;
		((Class46_Sub1) this.aClass46_6).method3687(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt6178, 1);
	}

	@OriginalMember(owner = "client!dda", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt2132 == 0 && this.anInt2145 == this.anInt2139 && this.anInt2133 == 0 && this.anInt2131 == this.anInt2138) {
			local19 = this.anIntArray138.length;
			local25 = local19 - local19 & 0x7;
			local27 = 0;
			while (local27 < local25) {
				this.anIntArray138[local27++] = Integer.MAX_VALUE;
				this.anIntArray138[local27++] = Integer.MAX_VALUE;
				this.anIntArray138[local27++] = Integer.MAX_VALUE;
				this.anIntArray138[local27++] = Integer.MAX_VALUE;
				this.anIntArray138[local27++] = Integer.MAX_VALUE;
				this.anIntArray138[local27++] = Integer.MAX_VALUE;
				this.anIntArray138[local27++] = Integer.MAX_VALUE;
				this.anIntArray138[local27++] = Integer.MAX_VALUE;
			}
			while (local27 < local19) {
				this.anIntArray138[local27++] = Integer.MAX_VALUE;
			}
			return;
		}
		local19 = this.anInt2145 - this.anInt2132;
		local25 = this.anInt2131 - this.anInt2133;
		local27 = this.anInt2139 - local19;
		@Pc(116) int local116 = this.anInt2132 + this.anInt2133 * this.anInt2139;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.anIntArray138[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray138[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray138[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray138[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray138[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray138[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray138[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray138[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.anIntArray138[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)V")
	@Override
	public void method7195(@OriginalArg(0) boolean arg0) {
		this.aBoolean180 = arg0;
		this.aClass10_6.method263();
	}

	@OriginalMember(owner = "client!dda", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class78 local3 = this.method1940(Thread.currentThread());
		local3.anInt2704 = arg0;
		local3.anInt2702 = arg1;
		local3.anInt2708 = arg2;
	}

	@OriginalMember(owner = "client!dda", name = "i", descriptor = "()V")
	@Override
	public void method7154() {
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7142() {
		@Pc(3) Class78 local3 = this.method1940(Thread.currentThread());
		return local3.aClass109_Sub1_3;
	}

	@OriginalMember(owner = "client!dda", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2132;
		arg0[1] = this.anInt2133;
		arg0[2] = this.anInt2145;
		arg0[3] = this.anInt2131;
	}

	@OriginalMember(owner = "client!dda", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2154 = arg0;
		this.anInt2137 = arg1;
		this.anInt2150 = arg2;
		this.anInt2143 = arg3;
		this.method1935();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!fi;I)V")
	@Override
	public void method7176(@OriginalArg(0) Class96 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class78 local3 = this.method1940(Thread.currentThread());
		@Pc(7) Class9_Sub8 local7 = arg0.aClass269_1.aClass9_Sub8_9;
		for (@Pc(10) Class9_Sub8 local10 = local7.aClass9_Sub8_8; local10 != local7; local10 = local10.aClass9_Sub8_8) {
			@Pc(14) Class9_Sub8_Sub2 local14 = (Class9_Sub8_Sub2) local10;
			@Pc(19) int local19 = local14.anInt6176 >> 12;
			@Pc(24) int local24 = local14.anInt6177 >> 12;
			@Pc(29) int local29 = local14.anInt6180 >> 12;
			@Pc(54) float local54 = this.aClass109_Sub1_1.aFloat54 + this.aClass109_Sub1_1.aFloat51 * (float) local19 + this.aClass109_Sub1_1.aFloat61 * (float) local24 + this.aClass109_Sub1_1.aFloat50 * (float) local29;
			if (!(local54 < (float) this.anInt2151) && !(local54 > (float) local3.anInt2703)) {
				@Pc(103) int local103 = this.anInt2154 + (int) ((float) this.anInt2150 * (this.aClass109_Sub1_1.aFloat55 + this.aClass109_Sub1_1.aFloat59 * (float) local19 + this.aClass109_Sub1_1.aFloat56 * (float) local24 + this.aClass109_Sub1_1.aFloat57 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt2137 + (int) ((float) this.anInt2143 * (this.aClass109_Sub1_1.aFloat58 + this.aClass109_Sub1_1.aFloat53 * (float) local19 + this.aClass109_Sub1_1.aFloat60 * (float) local24 + this.aClass109_Sub1_1.aFloat52 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt2132 && local103 <= this.anInt2145 && local139 >= this.anInt2133 && local139 <= this.anInt2131) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method1938(local14, local103, local139, (int) local54, (local14.anInt6181 * this.anInt2150 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "y", descriptor = "()V")
	@Override
	public void method7202() {
		this.aClass10_6.method263();
		this.aClass10_5.method263();
	}

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "(I)V")
	@Override
	public void method7215(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt2130;
		for (@Pc(9) Object local9 = this.aClass10_6.method256(); local9 != null; local9 = this.aClass10_6.method257()) {
			@Pc(13) Class3_Sub23 local13 = (Class3_Sub23) local9;
			if (local13.aBoolean270) {
				local13.anInt3302 += local4;
				@Pc(27) int local27 = local13.anInt3302 / 20;
				if (local27 > 0) {
					@Pc(36) Class224 local36 = super.anInterface8_12.method6560(local13.anInt3301);
					local13.method2927(local36.aByte75 * local4 * 50 / 1000, local36.aByte70 * local4 * 50 / 1000);
					local13.anInt3302 -= local27 * 20;
				}
				local13.aBoolean270 = false;
			}
		}
		this.anInt2130 = arg0;
		this.aClass10_5.method258(5);
		this.aClass10_6.method258(5);
	}

	@OriginalMember(owner = "client!dda", name = "r", descriptor = "()Z")
	@Override
	public boolean method7173() {
		return true;
	}

	@OriginalMember(owner = "client!dda", name = "u", descriptor = "()Lclient!mp;")
	@Override
	public Class216 method7186() {
		return new Class216(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7163(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas3 = null;
			this.aClass3_Sub19_1 = null;
			if (this.aClass46_5 == null) {
				this.anIntArray137 = null;
				this.anInt2139 = this.anInt2138 = 1;
				this.anInt2134 = this.anInt2147 = 1;
				this.method1937();
			}
			return;
		}
		@Pc(10) Class3_Sub19 local10 = (Class3_Sub19) this.aClass310_6.method6601((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas3 = arg0;
		this.aClass3_Sub19_1 = local10;
		if (this.aClass46_5 != null) {
			return;
		}
		this.anIntArray137 = local10.anIntArray623;
		this.anInt2139 = local10.anInt8143;
		this.anInt2138 = local10.anInt8145;
		if (this.anInt2139 != this.anInt2134 || this.anInt2138 != this.anInt2147) {
			this.anInt2134 = this.anInt2139;
			this.anInt2147 = this.anInt2138;
			this.anIntArray138 = new int[this.anInt2134 * this.anInt2147];
		}
		this.method1937();
		return;
	}

	@OriginalMember(owner = "client!dda", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7144(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class139 method7210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class139_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!js;Lclient!js;FLclient!js;)Lclient!js;")
	@Override
	public Class55 method7167(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class55 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class146 method7168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class146_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!dda", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass109_Sub1_1.aFloat51 * (float) arg0 + this.aClass109_Sub1_1.aFloat61 * (float) arg1 + this.aClass109_Sub1_1.aFloat50 * (float) arg2 + this.aClass109_Sub1_1.aFloat54;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass109_Sub1_1.aFloat51 * (float) arg3 + this.aClass109_Sub1_1.aFloat61 * (float) arg4 + this.aClass109_Sub1_1.aFloat50 * (float) arg5 + this.aClass109_Sub1_1.aFloat54;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt2151 && local55 < (float) this.anInt2151 || !(!(local24 > (float) this.anInt2155) || !(local55 > (float) this.anInt2155))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt2150 * (this.aClass109_Sub1_1.aFloat59 * (float) arg0 + this.aClass109_Sub1_1.aFloat56 * (float) arg1 + this.aClass109_Sub1_1.aFloat57 * (float) arg2 + this.aClass109_Sub1_1.aFloat55) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt2150 * (this.aClass109_Sub1_1.aFloat59 * (float) arg3 + this.aClass109_Sub1_1.aFloat56 * (float) arg4 + this.aClass109_Sub1_1.aFloat57 * (float) arg5 + this.aClass109_Sub1_1.aFloat55) / local55);
		if (local119 < this.anInt2152 && local151 < this.anInt2152 || local119 > this.anInt2146 && local151 > this.anInt2146) {
			return false;
		} else {
			@Pc(201) int local201 = (int) ((float) this.anInt2143 * (this.aClass109_Sub1_1.aFloat53 * (float) arg0 + this.aClass109_Sub1_1.aFloat60 * (float) arg1 + this.aClass109_Sub1_1.aFloat52 * (float) arg2 + this.aClass109_Sub1_1.aFloat58) / local24);
			@Pc(233) int local233 = (int) ((float) this.anInt2143 * (this.aClass109_Sub1_1.aFloat53 * (float) arg3 + this.aClass109_Sub1_1.aFloat60 * (float) arg4 + this.aClass109_Sub1_1.aFloat52 * (float) arg5 + this.aClass109_Sub1_1.aFloat58) / local55);
			return (local201 >= this.anInt2149 || local233 >= this.anInt2149) && (local201 <= this.anInt2142 || local233 <= this.anInt2142);
		}
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method1939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface8_12.method6560(arg6).aBoolean493) {
			this.method1932(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.lb != arg6) {
			@Pc(26) Class46 local26 = (Class46) this.aClass10_5.method250((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method1931(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method1941(arg6) ? 64 : 128;
				local26 = this.method7198(local32, local43, local43, local43);
				this.aClass10_5.method254(local26, (long) arg6);
			}
			this.lb = arg6;
			this.aClass46_6 = local26;
		}
		((Class46_Sub1) this.aClass46_6).method3687(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!dda", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class78 local3 = this.method1940(Thread.currentThread());
		local3.aBoolean227 = arg0;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(II)I")
	@Override
	public int method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!dda", name = "z", descriptor = "()V")
	@Override
	public void method7204() {
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7187(@OriginalArg(0) Class109 arg0) {
		this.aClass109_Sub1_1 = (Class109_Sub1) arg0;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class78 local3 = this.method1940(Thread.currentThread());
		@Pc(6) Class199 local6 = local3.aClass199_2;
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
		@Pc(105) int local105 = arg0 - local6.method4667();
		@Pc(110) int local110 = arg1 - local6.method4663();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt5339 = 0;
		this.ZA(false);
		local6.aBoolean425 = local114 < 0 || local114 > local6.anInt5336 || local118 < 0 || local118 > local6.anInt5336 || local124 < 0 || local124 > local6.anInt5336;
		local6.method4671(local134, local138, local144, local114, local118, local124, 100, 100, 100, arg4);
		local6.aBoolean425 = local114 < 0 || local114 > local6.anInt5336 || local124 < 0 || local124 > local6.anInt5336 || local130 < 0 || local130 > local6.anInt5336;
		local6.method4671(local134, local144, local150, local114, local124, local130, 100, 100, 100, arg4);
		this.ZA(true);
	}

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "()Z")
	@Override
	public boolean method7161() {
		return true;
	}

	@OriginalMember(owner = "client!dda", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt2139) {
			arg2 = this.anInt2139;
		}
		if (arg3 > this.anInt2138) {
			arg3 = this.anInt2138;
		}
		this.anInt2132 = arg0;
		this.anInt2145 = arg2;
		this.anInt2133 = arg1;
		this.anInt2131 = arg3;
		this.method1935();
	}

	@OriginalMember(owner = "client!dda", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(2) int local2 = this.anInt2157;
		this.anInt2157 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!vw;Z)Lclient!f;")
	@Override
	public Class46 method7205(@OriginalArg(0) Class355 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray677;
		@Pc(5) byte[] local5 = arg0.aByteArray104;
		@Pc(8) int local8 = arg0.anInt9165;
		@Pc(11) int local11 = arg0.anInt9162;
		@Pc(76) Class46_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray105 == null) {
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
			local76 = new Class46_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray105;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class46_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class46_Sub1_Sub1(this, local20, local8, local11);
			}
		}
		local76.Q(arg0.anInt9161, arg0.anInt9163, arg0.anInt9164, arg0.anInt9166);
		return local76;
	}

	@OriginalMember(owner = "client!dda", name = "n", descriptor = "()V")
	@Override
	protected void method7165() {
		if (this.aBoolean178) {
			Static216.method3777(false, true);
			this.aBoolean178 = false;
		}
		this.aClass3_Sub19_1 = null;
		this.aCanvas3 = null;
		this.aClass310_6 = null;
		this.aBoolean179 = true;
	}

	@OriginalMember(owner = "client!dda", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass109_Sub1_1.aFloat54 + this.aClass109_Sub1_1.aFloat51 * (float) arg0 + this.aClass109_Sub1_1.aFloat61 * (float) arg1 + this.aClass109_Sub1_1.aFloat50 * (float) arg2;
		if (local24 < (float) this.anInt2151 || local24 > (float) this.anInt2155) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt2150 * (this.aClass109_Sub1_1.aFloat55 + this.aClass109_Sub1_1.aFloat59 * (float) arg0 + this.aClass109_Sub1_1.aFloat56 * (float) arg1 + this.aClass109_Sub1_1.aFloat57 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt2143 * (this.aClass109_Sub1_1.aFloat58 + this.aClass109_Sub1_1.aFloat53 * (float) arg0 + this.aClass109_Sub1_1.aFloat60 * (float) arg1 + this.aClass109_Sub1_1.aFloat52 * (float) arg2) / local24);
		arg3[0] = local81 - this.anInt2152;
		arg3[1] = local113 - this.anInt2149;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7183(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			this.method7163(null);
		}
		@Pc(15) Class3_Sub19 local15 = (Class3_Sub19) this.aClass310_6.method6601((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7812();
		}
	}

	@OriginalMember(owner = "client!dda", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt2133 || arg1 >= this.anInt2131) {
			return;
		}
		if (arg0 < this.anInt2132) {
			arg2 -= this.anInt2132 - arg0;
			arg0 = this.anInt2132;
		}
		if (arg0 + arg2 > this.anInt2145) {
			arg2 = this.anInt2145 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt2139;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray137[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray137[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray137[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray137[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray137[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7207(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas3 == null || this.aClass3_Sub19_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt2139 && local21.y <= this.anInt2138 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass3_Sub19_1.method6860(local21.y, local21.height, local21.width, local14, local21.x);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7194() {
		@Pc(3) Class78 local3 = this.method1940(Thread.currentThread());
		@Pc(6) Class199 local6 = local3.aClass199_2;
		local6.aBoolean424 = false;
		@Pc(14) int local14 = 5 - this.anInt2152;
		@Pc(19) int local19 = 75 - this.anInt2152;
		@Pc(24) int local24 = 15 - this.anInt2152;
		@Pc(29) int local29 = 10 - this.anInt2149;
		@Pc(34) int local34 = 50 - this.anInt2149;
		@Pc(39) int local39 = 90 - this.anInt2149;
		local6.aBoolean425 = local14 < 0 || local14 > local6.anInt5336 || local19 < 0 || local19 > local6.anInt5336 || local24 < 0 || local24 > local6.anInt5336;
		local6.aBoolean429 = true;
		local6.anInt5339 = 0;
		local6.aBoolean426 = false;
		local6.method4676(local29, local34, local39, local14, local19, local24, 0, 0, 0, -65536, -65536, -65536);
		local6.aBoolean424 = true;
		local6.aBoolean429 = false;
	}

	@OriginalMember(owner = "client!dda", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt2139;
		@Pc(35) int local35 = this.anInt2139 - arg2;
		if (arg1 + arg3 > this.anInt2131) {
			arg3 -= arg1 + arg3 - this.anInt2131;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt2133) {
			local59 = this.anInt2133 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt2139;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt2145) {
			local59 = arg0 + arg2 - this.anInt2145;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt2132) {
			local59 = this.anInt2132 - arg0;
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
						this.anIntArray137[local30++] = arg4;
					} else {
						this.anIntArray137[local30++] = arg5;
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
					local245 = this.anIntArray137[local30];
					this.anIntArray137[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray137[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray137[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "()Z")
	@Override
	public boolean method7153() {
		return true;
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7209(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub19 local8 = (Class3_Sub19) this.aClass310_6.method6601((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method7812();
		local8 = Static458.method6374(arg0);
		this.aClass310_6.method6603(local8, (long) arg0.hashCode());
		if (this.aCanvas3 != arg0 || this.aClass46_5 != null) {
			return;
		}
		this.aClass3_Sub19_1 = local8;
		this.anIntArray137 = local8.anIntArray623;
		this.anInt2139 = local8.anInt8143;
		this.anInt2138 = local8.anInt8145;
		if (this.anInt2139 != this.anInt2134 || this.anInt2138 != this.anInt2147) {
			this.anInt2134 = this.anInt2139;
			this.anInt2147 = this.anInt2138;
			this.anIntArray138 = new int[this.anInt2134 * this.anInt2147];
		}
		this.method1937();
	}

	@OriginalMember(owner = "client!dda", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass78Array1.length; local1++) {
			@Pc(7) Class78 local7 = this.aClass78Array1[local1];
			local7.anInt2702 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt2702 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt2702 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt2702 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt2702 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean228 = false;
			} else {
				local7.aBoolean228 = true;
			}
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!ej;")
	public Class78 method1940(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2156; local1++) {
			if (this.aClass78Array1[local1].aRunnable1 == arg0) {
				return this.aClass78Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dda", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.J(0, 0, this.anInt2139, this.anInt2138, arg0, 0);
	}

	@OriginalMember(owner = "client!dda", name = "C", descriptor = "()Z")
	@Override
	public boolean method7217() {
		return true;
	}

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt2139 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray137[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "(I)Z")
	public boolean method1941(@OriginalArg(0) int arg0) {
		return this.aBoolean180 || super.anInterface8_12.method6560(arg0).aBoolean490;
	}

	@OriginalMember(owner = "client!dda", name = "m", descriptor = "(I)[I")
	public int[] method1942(@OriginalArg(0) int arg0) {
		@Pc(2) Class10 local2 = this.aClass10_6;
		@Pc(12) Class3_Sub23 local12;
		synchronized (this.aClass10_6) {
			local12 = (Class3_Sub23) this.aClass10_6.method250((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_12.method6559(arg0)) {
					return null;
				}
				@Pc(32) Class224 local32 = super.anInterface8_12.method6560(arg0);
				@Pc(42) int local42 = local32.aBoolean490 || this.aBoolean180 ? 64 : 128;
				local12 = new Class3_Sub23(arg0, local42, super.anInterface8_12.method6555(arg0, true, 0.7F, local42, local42), local32.aBoolean496);
				this.aClass10_6.method254(local12, (long) arg0);
			}
		}
		local12.aBoolean270 = true;
		return local12.method2925();
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class46 method7198(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class46_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class46_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class46_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3) : new Class46_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class46 method7184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt2139 + arg0;
		@Pc(16) int local16 = this.anInt2139 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray137[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class46_Sub1_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class46_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!dda", name = "F", descriptor = "()Z")
	public boolean method1943() {
		return this.aBoolean179;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "([I)V")
	@Override
	public void method7158(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt2139;
		arg0[1] = this.anInt2138;
	}

	@OriginalMember(owner = "client!dda", name = "d", descriptor = "()Z")
	@Override
	public boolean method7146() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt2132) {
					arg1 += local104 * (this.anInt2132 - arg0);
					arg0 = this.anInt2132;
				}
				if (arg2 >= this.anInt2145) {
					arg2 = this.anInt2145 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2133 && local150 < this.anInt2131) {
							this.anIntArray137[arg0 + local150 * this.anInt2139] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt2133 && local213 < this.anInt2131) {
							local228 = arg0 + local213 * this.anInt2139;
							local233 = this.anIntArray137[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray137[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt2133 && local150 < this.anInt2131) {
							local213 = arg0 + local150 * this.anInt2139;
							local228 = this.anIntArray137[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray137[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt2133) {
					arg0 += local104 * (this.anInt2133 - arg1);
					arg1 = this.anInt2133;
				}
				if (arg3 >= this.anInt2131) {
					arg3 = this.anInt2131 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2132 && local150 < this.anInt2145) {
							this.anIntArray137[local150 + arg1 * this.anInt2139] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt2132 && local213 < this.anInt2145) {
							local228 = local213 + arg1 * this.anInt2139;
							local233 = this.anIntArray137[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray137[local213 + arg1 * this.anInt2139] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt2132 && local150 < this.anInt2145) {
							local213 = local150 + arg1 * this.anInt2139;
							local228 = this.anIntArray137[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray137[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!dda", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class146_Sub1 local2 = (Class146_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray345;
		@Pc(8) int[] local8 = local2.anIntArray344;
		@Pc(20) int local20;
		if (this.anInt2131 < arg3 + local5.length) {
			local20 = this.anInt2131 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt2133 > arg3) {
			local33 = this.anInt2133 - arg3;
			arg3 = this.anInt2133;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt2139;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt2132 > local58) {
				local62 -= this.anInt2132 - local58;
				local58 = this.anInt2132;
			}
			if (this.anInt2145 < local58 + local62) {
				local62 = this.anInt2145 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray137[local58++] = arg0;
			}
			local49 += this.anInt2139;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIIF)Lclient!ff;")
	@Override
	public Class3_Sub22 method7164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!dda", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt2153 = (int) (arg1 * 65535.0F);
		this.anInt2136 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt2148 = (int) (arg3 * 65535.0F / local26);
		this.anInt2140 = (int) (arg4 * 65535.0F / local26);
		this.anInt2135 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!dda", name = "p", descriptor = "()V")
	@Override
	public void method7171() {
	}

	@OriginalMember(owner = "client!dda", name = "e", descriptor = "(I)V")
	@Override
	public void method7191(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!nda;IIII)Lclient!da;")
	@Override
	public Class57 method7178(@OriginalArg(0) Class226 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class57_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!dda", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass78Array1.length; local1++) {
			this.aClass78Array1[local1].anInt2702 = this.aClass78Array1[local1].anInt2700;
			this.aClass78Array1[local1].aBoolean226 = false;
		}
	}

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "()Z")
	@Override
	public boolean method7150() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		this.anInt2144 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I[Lclient!ff;)V")
	@Override
	public void method7149(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22[] arg1) {
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "()Lclient!q;")
	@Override
	public Class109 method7140() {
		return this.aClass109_Sub1_1;
	}

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return 0;
	}

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)Lclient!e;")
	@Override
	public Class3_Sub16 method7193(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!dda", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(2) int local2 = this.anInt2141;
		this.anInt2141 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!dda", name = "o", descriptor = "()Z")
	@Override
	public boolean method7166() {
		return false;
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!fi;)V")
	@Override
	public void method7189(@OriginalArg(0) Class96 arg0) {
		@Pc(3) Class78 local3 = this.method1940(Thread.currentThread());
		@Pc(7) Class9_Sub8 local7 = arg0.aClass269_1.aClass9_Sub8_9;
		for (@Pc(10) Class9_Sub8 local10 = local7.aClass9_Sub8_8; local10 != local7; local10 = local10.aClass9_Sub8_8) {
			@Pc(14) Class9_Sub8_Sub2 local14 = (Class9_Sub8_Sub2) local10;
			@Pc(19) int local19 = local14.anInt6176 >> 12;
			@Pc(24) int local24 = local14.anInt6177 >> 12;
			@Pc(29) int local29 = local14.anInt6180 >> 12;
			@Pc(54) float local54 = this.aClass109_Sub1_1.aFloat54 + this.aClass109_Sub1_1.aFloat51 * (float) local19 + this.aClass109_Sub1_1.aFloat61 * (float) local24 + this.aClass109_Sub1_1.aFloat50 * (float) local29;
			if (!(local54 < (float) this.anInt2151) && !(local54 > (float) local3.anInt2703)) {
				@Pc(102) int local102 = this.anInt2154 + (int) ((float) this.anInt2150 * (this.aClass109_Sub1_1.aFloat55 + this.aClass109_Sub1_1.aFloat59 * (float) local19 + this.aClass109_Sub1_1.aFloat56 * (float) local24 + this.aClass109_Sub1_1.aFloat57 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt2137 + (int) ((float) this.anInt2143 * (this.aClass109_Sub1_1.aFloat58 + this.aClass109_Sub1_1.aFloat53 * (float) local19 + this.aClass109_Sub1_1.aFloat60 * (float) local24 + this.aClass109_Sub1_1.aFloat52 * (float) local29) / local54);
				if (local102 >= this.anInt2132 && local102 <= this.anInt2145 && local137 >= this.anInt2133 && local137 <= this.anInt2131) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method1938(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt6181 * this.anInt2150 >> 12) / local54));
				}
			}
		}
	}
}
