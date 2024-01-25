import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "Lclient!kd;")
	private Class4_Sub22 aClass4_Sub22_1;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	public int anInt401;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "[Lclient!cv;")
	private Class45[] aClass45Array1;

	@OriginalMember(owner = "client!bc", name = "J", descriptor = "I")
	public int anInt408;

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "F")
	private float aFloat12;

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
	public int anInt412;

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
	public int anInt415;

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
	private int anInt418;

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
	public int anInt419;

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
	public int anInt420;

	@OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
	public int anInt422;

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
	public int anInt423;

	@OriginalMember(owner = "client!bc", name = "bb", descriptor = "F")
	private float aFloat13;

	@OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
	public int anInt424;

	@OriginalMember(owner = "client!bc", name = "db", descriptor = "Z")
	public boolean aBoolean44;

	@OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
	public int anInt428;

	@OriginalMember(owner = "client!bc", name = "jb", descriptor = "Lclient!l;")
	private Class57 aClass57_5;

	@OriginalMember(owner = "client!bc", name = "nb", descriptor = "I")
	public int anInt430;

	@OriginalMember(owner = "client!bc", name = "ob", descriptor = "Lclient!l;")
	private Class57 aClass57_6;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Z")
	private boolean aBoolean41;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "Z")
	private boolean aBoolean42;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "Lclient!ib;")
	private Class102 aClass102_3;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
	public int anInt403;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "Z")
	public boolean aBoolean43;

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "I")
	public int anInt410;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
	public int anInt417;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
	private int anInt405;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	public int anInt402;

	@OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
	public int anInt425;

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
	public int anInt416;

	@OriginalMember(owner = "client!bc", name = "K", descriptor = "I")
	public int anInt409;

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
	public int anInt421;

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
	public int anInt427;

	@OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
	private int anInt414;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "I")
	public int anInt413;

	@OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
	public int anInt426;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
	public int anInt411;

	@OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
	private int anInt429;

	@OriginalMember(owner = "client!bc", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!bc", name = "gb", descriptor = "Z")
	private boolean aBoolean45;

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "Lclient!fa;")
	private final Class68 aClass68_1;

	@OriginalMember(owner = "client!bc", name = "pb", descriptor = "I")
	private int anInt431;

	@OriginalMember(owner = "client!bc", name = "kb", descriptor = "Lclient!fa;")
	private final Class68 aClass68_2;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "Lclient!wp;")
	public Class31_Sub2 aClass31_Sub2_1;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(ILclient!ga;)V")
	private Class19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg0, arg1);
		this.aBoolean41 = false;
		this.aBoolean42 = false;
		this.aClass102_3 = new Class102(4);
		this.anInt403 = 3500;
		this.anInt406 = 50;
		this.anInt404 = 75518;
		this.aBoolean43 = false;
		this.anInt410 = 0;
		this.anInt417 = 512;
		this.anInt405 = 3500;
		this.anInt402 = 0;
		this.anInt425 = 0;
		this.anInt416 = 512;
		this.anInt409 = 0;
		this.anInt421 = 0;
		this.anInt407 = 0;
		this.anInt427 = 45823;
		this.anInt414 = 0;
		this.anInt413 = 78642;
		this.anInt426 = 0;
		this.anInt411 = this.anInt405 - 255;
		this.anInt429 = 0;
		this.lb = 0;
		this.aBoolean45 = false;
		this.aClass68_1 = new Class68(16);
		this.anInt431 = -1;
		this.aClass68_2 = new Class68(20);
		this.aClass31_Sub2_1 = new Class31_Sub2();
		this.method4283(1);
		this.method4273(0);
		Static347.method4678(true, false);
		this.aBoolean42 = true;
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;)V")
	public Class19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2) {
		this(arg0, arg2);
		this.method4249(arg1);
		this.method4250(arg1);
	}

	@OriginalMember(owner = "client!bc", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt405;
	}

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "()Z")
	@Override
	public boolean method4301() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "()Z")
	@Override
	public boolean method4291() {
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "(IIII)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt424 = arg0;
		this.anInt422 = arg1;
		this.anInt416 = arg2;
		this.anInt417 = arg3;
		this.method483();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class145 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray554;
		@Pc(8) int[] local8 = local2.anIntArray553;
		@Pc(17) int local17 = this.anInt425 > arg7 ? this.anInt425 : arg7;
		@Pc(32) int local32 = this.anInt421 < arg7 + local5.length ? this.anInt421 : arg7 + local5.length;
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
					if (local129 >= this.lb && local129 < this.anInt402 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray26[local129 + arg1 * this.anInt430] = arg4;
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
					if (local133 >= this.lb && local133 < this.anInt402 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt430;
						local248 = this.anIntArray26[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray26[local133 + arg1 * this.anInt430] = local201 + local584;
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
		if (arg0 < this.lb) {
			arg1 += local83 * (this.lb - arg0);
			arg0 = this.lb;
		}
		if (arg2 >= this.anInt402) {
			arg2 = this.anInt402 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray26[arg0 + local129 * this.anInt430] = arg4;
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
					local243 = arg0 + local133 * this.anInt430;
					local248 = this.anIntArray26[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray26[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "()V")
	private void method483() {
		this.anInt423 = this.lb - this.anInt424;
		this.anInt428 = this.anInt402 - this.anInt424;
		this.anInt415 = this.anInt425 - this.anInt422;
		this.anInt408 = this.anInt421 - this.anInt422;
		for (@Pc(29) int local29 = 0; local29 < this.anInt420; local29++) {
			@Pc(36) Class201 local36 = this.aClass45Array1[local29].aClass201_1;
			local36.anInt5773 = this.anInt424 - this.lb;
			local36.anInt5777 = this.anInt422 - this.anInt425;
			local36.anInt5772 = this.anInt402 - this.lb;
			local36.anInt5775 = this.anInt421 - this.anInt425;
		}
		@Pc(78) int local78 = this.anInt425 * this.anInt430 + this.lb;
		for (@Pc(81) int local81 = this.anInt425; local81 < this.anInt421; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt420; local84++) {
				this.aClass45Array1[local84].aClass201_1.anIntArray403[local81 - this.anInt425] = local78;
			}
			local78 += this.anInt430;
		}
	}

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "(I)I")
	public int method484(@OriginalArg(0) int arg0) {
		return super.anInterface7_6.method2396(arg0).aShort99 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bc", name = "ca", descriptor = "(ILclient!ma;II)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class145 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class145_Sub2 local2 = (Class145_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray554;
		@Pc(8) int[] local8 = local2.anIntArray553;
		@Pc(20) int local20;
		if (this.anInt421 < arg3 + local5.length) {
			local20 = this.anInt421 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt425 > arg3) {
			local33 = this.anInt425 - arg3;
			arg3 = this.anInt425;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt430;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.lb > local58) {
				local62 -= this.lb - local58;
				local58 = this.lb;
			}
			if (this.anInt402 < local58 + local62) {
				local62 = this.anInt402 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray26[local58++] = arg0;
			}
			local49 += this.anInt430;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	@Override
	public int method4269(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!bc", name = "NA", descriptor = "(IIIII)V")
	@Override
	protected void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt425) {
			local8 = this.anInt425;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt421) {
			local21 = this.anInt421;
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
				if (local91 < this.lb) {
					local91 = this.lb;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt402) {
					local102 = this.anInt402;
				}
				local116 = local91 + local30 * this.anInt430;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray26[local116++] = arg3;
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
				if (local91 < this.lb) {
					local91 = this.lb;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt402 - 1) {
					local102 = this.anInt402 - 1;
				}
				local116 = local91 + local30 * this.anInt430;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray26[local116++] = arg3;
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
				if (local102 < this.lb) {
					local102 = this.lb;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt402) {
					local116 = this.anInt402;
				}
				local118 = local102 + local30 * this.anInt430;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray26[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray26[local118++] = local277 + local340;
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
				if (local102 < this.lb) {
					local102 = this.lb;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt402 - 1) {
					local116 = this.anInt402 - 1;
				}
				local118 = local102 + local30 * this.anInt430;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray26[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray26[local118++] = local277 + local340;
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
				if (local91 < this.lb) {
					local91 = this.lb;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt402) {
					local102 = this.anInt402;
				}
				local116 = local91 + local30 * this.anInt430;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray26[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray26[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.lb) {
					local91 = this.lb;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt402 - 1) {
					local102 = this.anInt402 - 1;
				}
				local116 = local91 + local30 * this.anInt430;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray26[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray26[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "()V")
	@Override
	public void method4281() {
	}

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "()V")
	private void method485() {
		if (this.aFloat13 == 0.0F) {
			this.anInt403 = this.anInt405;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt405;
		@Pc(12) float local12 = (float) this.anInt406;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat12 / (this.aFloat13 + this.aFloat12);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat13;
		this.anInt403 = (int) (((float) this.anInt405 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "()I")
	@Override
	public int method4260() {
		return 0;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	@Override
	public void method4273(@OriginalArg(0) int arg0) {
		this.aClass45Array1[arg0].method996(Thread.currentThread());
	}

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "(IIIIII)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.lb) {
			arg2 -= this.lb - arg0;
			arg0 = this.lb;
		}
		if (arg1 < this.anInt425) {
			arg3 -= this.anInt425 - arg1;
			arg1 = this.anInt425;
		}
		if (arg0 + arg2 > this.anInt402) {
			arg2 = this.anInt402 - arg0;
		}
		if (arg1 + arg3 > this.anInt421) {
			arg3 = this.anInt421 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt402 || arg1 > this.anInt421) {
			return;
		}
		@Pc(67) int local67 = this.anInt430 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt430;
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
						local221 = this.anIntArray26[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray26[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray26[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray26[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray26[arg2] = arg4;
					arg2++;
					this.anIntArray26[arg2] = arg4;
					arg2++;
					this.anIntArray26[arg2] = arg4;
					arg2++;
					this.anIntArray26[arg2] = arg4;
					arg2++;
					this.anIntArray26[arg2] = arg4;
					arg2++;
					this.anIntArray26[arg2] = arg4;
					arg2++;
					this.anIntArray26[arg2] = arg4;
					arg2++;
					this.anIntArray26[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray26[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "(I)V")
	@Override
	public void p(@OriginalArg(0) int arg0) {
		this.O(0, 0, this.anInt430, this.anInt418, arg0, 0);
	}

	@OriginalMember(owner = "client!bc", name = "xa", descriptor = "()F")
	@Override
	public float xa() {
		return this.aFloat13;
	}

	@OriginalMember(owner = "client!bc", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!tb;)V")
	@Override
	public void method4288(@OriginalArg(0) Class99 arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIF)Lclient!vp;")
	@Override
	public Class4_Sub21 method4310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "(I)Z")
	public boolean method486(@OriginalArg(0) int arg0) {
		return super.anInterface7_6.method2392(arg0);
	}

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "()V")
	@Override
	public void method4266() {
	}

	@OriginalMember(owner = "client!bc", name = "DA", descriptor = "(IIIIII[BII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt430;
		@Pc(35) int local35 = this.anInt430 - arg2;
		if (arg1 + arg3 > this.anInt421) {
			arg3 -= arg1 + arg3 - this.anInt421;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt425) {
			local59 = this.anInt425 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt430;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt402) {
			local59 = arg0 + arg2 - this.anInt402;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.lb) {
			local59 = this.lb - arg0;
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
						this.anIntArray26[local30++] = arg4;
					} else {
						this.anIntArray26[local30++] = arg5;
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
					local245 = this.anIntArray26[local30];
					this.anIntArray26[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray26[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray26[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "(I)[I")
	private int[] method487(@OriginalArg(0) int arg0) {
		@Pc(2) Class68 local2 = this.aClass68_2;
		@Pc(12) Class4_Sub40 local12;
		synchronized (this.aClass68_2) {
			local12 = (Class4_Sub40) this.aClass68_2.method1787((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_6.method2392(arg0)) {
					return null;
				}
				@Pc(32) Class251 local32 = super.anInterface7_6.method2396(arg0);
				@Pc(42) int local42 = local32.aBoolean637 || this.aBoolean45 ? 64 : 128;
				local12 = new Class4_Sub40(arg0, local42, super.anInterface7_6.method2395(arg0, 0.7F, local42, local42), local32.aBoolean641);
				this.aClass68_2.method1779((long) arg0, local12);
			}
		}
		local12.aBoolean572 = true;
		return local12.method4878();
	}

	@OriginalMember(owner = "client!bc", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.lb < arg0) {
			this.lb = arg0;
		}
		if (this.anInt425 < arg1) {
			this.anInt425 = arg1;
		}
		if (this.anInt402 > arg2) {
			this.anInt402 = arg2;
		}
		if (this.anInt421 > arg3) {
			this.anInt421 = arg3;
		}
		this.method483();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!cv;")
	public Class45 method488(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt420; local1++) {
			if (this.aClass45Array1[local1].aRunnable1 == arg0) {
				return this.aClass45Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()V")
	@Override
	public void method4236() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class57 method4265(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class57_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class57_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class57_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class57_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	@Override
	public void method4246(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt400;
		for (@Pc(9) Object local9 = this.aClass68_2.method1789(); local9 != null; local9 = this.aClass68_2.method1782()) {
			@Pc(13) Class4_Sub40 local13 = (Class4_Sub40) local9;
			if (local13.aBoolean572) {
				local13.anInt6274 += local4;
				@Pc(27) int local27 = local13.anInt6274 / 20;
				if (local27 > 0) {
					@Pc(36) Class251 local36 = super.anInterface7_6.method2396(local13.anInt6273);
					local13.method4876(local36.aByte91 * local4 * 50 / 1000, local36.aByte93 * local4 * 50 / 1000);
					local13.anInt6274 -= local27 * 20;
				}
				local13.aBoolean572 = false;
			}
		}
		this.anInt400 = arg0;
		this.aClass68_1.method1788(5);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class145 method4285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class145_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
	@Override
	public void method4255(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method4244(@OriginalArg(0) Class4_Sub2 arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!mi;I)V")
	@Override
	public void method4307(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) Class3_Sub5[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class110_Sub2[] local3 = new Class110_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class110_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class110_Sub2 local26 = Static364.method4912(this, local3);
		local26.method4900(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "()Z")
	public boolean method489() {
		return this.aBoolean41;
	}

	@OriginalMember(owner = "client!bc", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		@Pc(2) int local2 = this.anInt414;
		this.anInt414 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "(F)V")
	@Override
	public void B(@OriginalArg(0) float arg0) {
		this.anInt404 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "()Z")
	@Override
	public boolean method4264() {
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "()Z")
	@Override
	public boolean method4251() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!mc;)V")
	@Override
	public void method4277(@OriginalArg(0) Class146 arg0) {
		@Pc(3) Class3_Sub1 local3 = arg0.aClass232_1.aClass3_Sub1_7;
		for (@Pc(6) Class3_Sub1 local6 = local3.aClass3_Sub1_6; local6 != local3; local6 = local6.aClass3_Sub1_6) {
			@Pc(10) Class3_Sub1_Sub1 local10 = (Class3_Sub1_Sub1) local6;
			@Pc(15) int local15 = local10.anInt4068 >> 12;
			@Pc(20) int local20 = local10.anInt4076 >> 12;
			@Pc(25) int local25 = local10.anInt4073 >> 12;
			@Pc(49) int local49 = this.aClass31_Sub2_1.anInt7333 + (this.aClass31_Sub2_1.anInt7323 * local15 + this.aClass31_Sub2_1.anInt7330 * local20 + this.aClass31_Sub2_1.anInt7325 * local25 >> 15);
			if (local49 >= this.anInt406 && local49 <= this.anInt411) {
				@Pc(90) int local90 = this.anInt424 + this.anInt416 * (this.aClass31_Sub2_1.anInt7329 + (this.aClass31_Sub2_1.anInt7334 * local15 + this.aClass31_Sub2_1.anInt7328 * local20 + this.aClass31_Sub2_1.anInt7332 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt422 + this.anInt417 * (this.aClass31_Sub2_1.anInt7324 + (this.aClass31_Sub2_1.anInt7331 * local15 + this.aClass31_Sub2_1.anInt7326 * local20 + this.aClass31_Sub2_1.anInt7327 * local25 >> 15)) / local49;
				if (local90 >= this.lb && local90 <= this.anInt402 && local122 >= this.anInt425 && local122 <= this.anInt421) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method491(local10, local90, local122, (local10.anInt4069 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4257(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.b(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.b(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.lb) {
					arg1 += local104 * (this.lb - arg0);
					arg0 = this.lb;
				}
				if (arg2 >= this.anInt402) {
					arg2 = this.anInt402 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt425 && local150 < this.anInt421) {
							this.anIntArray26[arg0 + local150 * this.anInt430] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt425 && local213 < this.anInt421) {
							local228 = arg0 + local213 * this.anInt430;
							local233 = this.anIntArray26[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray26[local228] = local204 + local233;
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
				if (arg1 < this.anInt425) {
					arg0 += local104 * (this.anInt425 - arg1);
					arg1 = this.anInt425;
				}
				if (arg3 >= this.anInt421) {
					arg3 = this.anInt421 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.lb && local150 < this.anInt402) {
							this.anIntArray26[local150 + arg1 * this.anInt430] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.lb && local213 < this.anInt402) {
							local228 = local213 + arg1 * this.anInt430;
							local233 = this.anIntArray26[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray26[local213 + arg1 * this.anInt430] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.TA(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.TA(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIII)Lclient!tb;")
	@Override
	public Class99 method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "()V")
	@Override
	public void e() {
		this.lb = 0;
		this.anInt425 = 0;
		this.anInt402 = this.anInt430;
		this.anInt421 = this.anInt418;
		this.method483();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4249(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub22 local8 = (Class4_Sub22) this.aClass102_3.method2700((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static164.method3584(arg0);
			this.aClass102_3.method2703((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "()Z")
	@Override
	public boolean method4245() {
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
	@Override
	protected void method4239() {
		if (this.aBoolean42) {
			Static218.method3281(true, false);
			this.aBoolean42 = false;
		}
		this.aClass4_Sub22_1 = null;
		this.aCanvas1 = null;
		this.aClass102_3 = null;
		this.aBoolean41 = true;
	}

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "(I)Z")
	public boolean method490(@OriginalArg(0) int arg0) {
		return super.anInterface7_6.method2396(arg0).aBoolean640;
	}

	@OriginalMember(owner = "client!bc", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt429 = this.anInt409;
		this.anInt410 = arg0;
		this.anInt409 = arg1;
		this.anInt426 = arg2;
		this.aBoolean43 = true;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!wv;III)V")
	public void method491(@OriginalArg(0) Class3_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt4077;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.NA(arg1, arg2, local6, arg0.anInt4072, 1);
			return;
		}
		if (this.anInt431 != local2) {
			@Pc(30) Class57 local30 = (Class57) this.aClass68_1.method1787((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method487(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method493(local2) ? 64 : 128;
				local30 = this.method4265(local36, local46, local46, local46);
				this.aClass68_1.method1779((long) local2, local30);
			}
			this.anInt431 = local2;
			this.aClass57_6 = local30;
		}
		if (this.aClass57_6.j() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass57_6.s(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt4072, 1);
	}

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "()Z")
	@Override
	public boolean method4258() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "ea", descriptor = "(Lclient!c;)V")
	@Override
	public void ea(@OriginalArg(0) Class31 arg0) {
		this.aClass31_Sub2_1 = (Class31_Sub2) arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!tb;Lclient!tb;FLclient!tb;)Lclient!tb;")
	@Override
	public Class99 method4298(@OriginalArg(0) Class99 arg0, @OriginalArg(1) Class99 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class99 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!t;Lclient!mc;Lclient!c;Lclient!mi;I)V")
	@Override
	public void method4262(@OriginalArg(0) Class110 arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class3_Sub5 arg3) {
		((Class110_Sub2) arg0).method4900(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "()Z")
	@Override
	public boolean method4243() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "()V")
	private void method492() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt420; local1++) {
			this.aClass45Array1[local1].method998();
		}
		this.e();
	}

	@OriginalMember(owner = "client!bc", name = "ia", descriptor = "(II)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt406 = arg0;
		this.anInt405 = arg1;
		this.anInt411 = this.anInt405 - 255;
		this.method485();
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(II)I")
	@Override
	public int method4282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "()Lclient!c;")
	@Override
	public Class31 method4289() {
		@Pc(3) Class45 local3 = this.method488(Thread.currentThread());
		return local3.aClass31_Sub2_2;
	}

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "(III[I)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass31_Sub2_1.anInt7333 + (this.aClass31_Sub2_1.anInt7323 * arg0 + this.aClass31_Sub2_1.anInt7330 * arg1 + this.aClass31_Sub2_1.anInt7325 * arg2 >> 15);
		if (local23 < this.anInt406 || local23 > this.anInt405) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt416 * (this.aClass31_Sub2_1.anInt7329 + (this.aClass31_Sub2_1.anInt7334 * arg0 + this.aClass31_Sub2_1.anInt7328 * arg1 + this.aClass31_Sub2_1.anInt7332 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt417 * (this.aClass31_Sub2_1.anInt7324 + (this.aClass31_Sub2_1.anInt7331 * arg0 + this.aClass31_Sub2_1.anInt7326 * arg1 + this.aClass31_Sub2_1.anInt7327 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt423 && local73 <= this.anInt428 && local102 >= this.anInt415 && local102 <= this.anInt408) {
			arg3[0] = local73 - this.anInt423;
			arg3[1] = local102 - this.anInt415;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(FF)V")
	@Override
	public void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat12 = arg0;
		this.aFloat13 = arg1;
		this.method485();
	}

	@OriginalMember(owner = "client!bc", name = "da", descriptor = "([I)V")
	@Override
	public void da(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.lb;
		arg0[1] = this.anInt425;
		arg0[2] = this.anInt402;
		arg0[3] = this.anInt421;
	}

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "(IFFFFF)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt427 = (int) (arg1 * 65535.0F);
		this.anInt413 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt401 = (int) (arg3 * 65535.0F / local26);
		this.anInt412 = (int) (arg4 * 65535.0F / local26);
		this.anInt419 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!bb;Z)Lclient!l;")
	@Override
	public Class57 method4308(@OriginalArg(0) Class18 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray25;
		@Pc(5) byte[] local5 = arg0.aByteArray4;
		@Pc(8) int local8 = arg0.anInt367;
		@Pc(11) int local11 = arg0.anInt366;
		@Pc(76) Class57_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray5 == null) {
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
			local76 = new Class57_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray5;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class57_Sub1_Sub2(this, local20, local8, local11);
				local76 = new Class57_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class57_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.MA(arg0.anInt368, arg0.anInt370, arg0.anInt369, arg0.anInt371);
		return local76;
	}

	@OriginalMember(owner = "client!bc", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt410 = arg0;
		this.anInt409 = arg1;
		this.anInt426 = arg2;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class57 method4280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt430 + arg0;
		@Pc(16) int local16 = this.anInt430 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray26[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class57_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class57_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!bc", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return 0;
	}

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "(I)Z")
	public boolean method493(@OriginalArg(0) int arg0) {
		return this.aBoolean45 || super.anInterface7_6.method2396(arg0).aBoolean637;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIII)V")
	public void method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface7_6.method2396(arg5).aBoolean639) {
			this.NA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt431 != arg5) {
			@Pc(26) Class57 local26 = (Class57) this.aClass68_1.method1787((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method487(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method493(arg5) ? 64 : 128;
				local26 = this.method4265(local32, local43, local43, local43);
				this.aClass68_1.method1779((long) arg5, local26);
			}
			this.anInt431 = arg5;
			this.aClass57_6 = local26;
		}
		this.aClass57_6.s(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "()V")
	@Override
	public void l() {
		this.anInt409 = this.anInt429;
		this.aBoolean43 = false;
	}

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "()F")
	@Override
	public float W() {
		return this.aFloat12;
	}

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "()Z")
	@Override
	public boolean method4248() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4272(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class4_Sub22 local8 = (Class4_Sub22) this.aClass102_3.method2700((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method5684();
		local8 = Static164.method3584(arg0);
		this.aClass102_3.method2703((long) arg0.hashCode(), local8);
		if (this.aCanvas1 != arg0 || this.aClass57_5 != null) {
			return;
		}
		this.aClass4_Sub22_1 = local8;
		this.anIntArray26 = local8.anIntArray409;
		this.anInt430 = local8.anInt5857;
		this.anInt418 = local8.anInt5856;
		this.method492();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[Lclient!vp;)V")
	@Override
	public void method4238(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub21[] arg1) {
	}

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "()V")
	@Override
	public void method4247() {
		if (this.aCanvas1 == null || this.aClass4_Sub22_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			this.aClass4_Sub22_1.method4608(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "(IIII)[I")
	@Override
	public int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt430 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray26[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!jq;IIII)Lclient!t;")
	@Override
	public Class110 method4254(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class110_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "()Z")
	@Override
	public boolean method4252() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4276() {
		@Pc(3) Class45 local3 = this.method488(Thread.currentThread());
		@Pc(6) Class201 local6 = local3.aClass201_1;
		local6.aBoolean518 = false;
		local6.aBoolean518 = false;
		local6.anInt5774 = 0;
		local6.aBoolean519 = true;
		local6.method4548(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean518 = true;
	}

	@OriginalMember(owner = "client!bc", name = "TA", descriptor = "(IIIII)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.lb || arg0 >= this.anInt402) {
			return;
		}
		if (arg1 < this.anInt425) {
			arg2 -= this.anInt425 - arg1;
			arg1 = this.anInt425;
		}
		if (arg1 + arg2 > this.anInt421) {
			arg2 = this.anInt421 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt430;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray26[local40 + local54 * this.anInt430] = arg3;
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
				local111 = local40 + local103 * this.anInt430;
				local116 = this.anIntArray26[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray26[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt430;
				local111 = this.anIntArray26[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray26[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
	@Override
	public void method4283(@OriginalArg(0) int arg0) {
		if (this.anInt420 == arg0) {
			return;
		}
		this.anInt420 = arg0;
		this.aClass45Array1 = new Class45[this.anInt420];
		for (@Pc(14) int local14 = 0; local14 < this.anInt420; local14++) {
			this.aClass45Array1[local14] = new Class45(this);
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4263(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas1 == arg0) {
			this.method4250(null);
		}
		@Pc(15) Class4_Sub22 local15 = (Class4_Sub22) this.aClass102_3.method2700((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5684();
		}
	}

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "()V")
	@Override
	public void method4311() {
		this.aClass68_2.method1777();
	}

	@OriginalMember(owner = "client!bc", name = "OA", descriptor = "(IIII)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt430) {
			arg2 = this.anInt430;
		}
		if (arg3 > this.anInt418) {
			arg3 = this.anInt418;
		}
		this.lb = arg0;
		this.anInt402 = arg2;
		this.anInt425 = arg1;
		this.anInt421 = arg3;
		this.method483();
	}

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0) {
		this.aClass45Array1[arg0].method996(null);
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(Z)V")
	@Override
	public void method4309(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(IIIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt425 || arg1 >= this.anInt421) {
			return;
		}
		if (arg0 < this.lb) {
			arg2 -= this.lb - arg0;
			arg0 = this.lb;
		}
		if (arg0 + arg2 > this.anInt402) {
			arg2 = this.anInt402 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt430;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray26[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray26[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray26[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray26[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray26[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "()Z")
	@Override
	public boolean method4242() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "()Z")
	@Override
	public boolean method4279() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.b(arg0, arg1, arg2, arg4, arg5);
		this.b(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.TA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.TA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt406;
	}

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "()Z")
	@Override
	public boolean method4300() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class45 local3 = this.method488(Thread.currentThread());
		@Pc(6) Class201 local6 = local3.aClass201_1;
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
		@Pc(93) int local93 = arg0 - local6.method4551();
		@Pc(98) int local98 = arg1 - local6.method4549();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt5774 = 0;
		local6.aBoolean519 = local102 < 0 || local102 > local6.anInt5772 || local106 < 0 || local106 > local6.anInt5772 || local112 < 0 || local112 > local6.anInt5772;
		local6.method4552(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean519 = local102 < 0 || local102 > local6.anInt5772 || local106 < 0 || local106 > local6.anInt5772 || local118 < 0 || local118 > local6.anInt5772;
		local6.method4552(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "()V")
	@Override
	public void method4278() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	@Override
	public void method4237(@OriginalArg(0) boolean arg0) {
		this.aBoolean45 = arg0;
		this.aClass68_2.method1777();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class65 method4297(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class65_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!gt;[Lclient!bb;Z)Lclient!la;")
	@Override
	public Class46 method4275(@OriginalArg(0) Class89 arg0, @OriginalArg(1) Class18[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt367;
			local7[local11] = arg1[local11].anInt366;
			if (arg1[local11].aByteArray5 != null) {
			}
		}
		return new Class46_Sub4(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "()Lclient!c;")
	@Override
	public Class31 method4274() {
		return new Class31_Sub2();
	}

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "(I)V")
	@Override
	public void method4306(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "()Z")
	@Override
	public boolean method4259() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "(I)[I")
	public int[] method495(@OriginalArg(0) int arg0) {
		@Pc(2) Class68 local2 = this.aClass68_2;
		@Pc(12) Class4_Sub40 local12;
		synchronized (this.aClass68_2) {
			local12 = (Class4_Sub40) this.aClass68_2.method1787((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_6.method2392(arg0)) {
					return null;
				}
				@Pc(32) Class251 local32 = super.anInterface7_6.method2396(arg0);
				@Pc(42) int local42 = local32.aBoolean637 || this.aBoolean45 ? 64 : 128;
				local12 = new Class4_Sub40(arg0, local42, super.anInterface7_6.method2393(true, arg0, 0.7F, local42, local42), local32.aBoolean641);
				this.aClass68_2.method1779((long) arg0, local12);
			}
		}
		local12.aBoolean572 = true;
		return local12.method4878();
	}

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "()Z")
	@Override
	public boolean method4261() {
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "()Z")
	@Override
	public boolean method4286() {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "()I")
	@Override
	public int w() {
		@Pc(2) int local2 = this.anInt407;
		this.anInt407 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!bc", name = "UA", descriptor = "(III)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt409 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt409 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt409 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt409 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt409 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean44 = false;
		} else {
			this.aBoolean44 = true;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4290(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas1 == null || this.aClass4_Sub22_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt430 && local21.y <= this.anInt418 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass4_Sub22_1.method4601(local21.y, local21.width, local21.x, local14, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!bc", name = "JA", descriptor = "(IIIIII)Z")
	@Override
	public boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass31_Sub2_1.anInt7323 * arg0 + this.aClass31_Sub2_1.anInt7330 * arg1 + this.aClass31_Sub2_1.anInt7325 * arg2 >> 15) + this.aClass31_Sub2_1.anInt7333;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass31_Sub2_1.anInt7323 * arg3 + this.aClass31_Sub2_1.anInt7330 * arg4 + this.aClass31_Sub2_1.anInt7325 * arg5 >> 15) + this.aClass31_Sub2_1.anInt7333;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt406 && local52 < this.anInt406 || !(local23 <= this.anInt405 || local52 <= this.anInt405)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt416 * ((this.aClass31_Sub2_1.anInt7334 * arg0 + this.aClass31_Sub2_1.anInt7328 * arg1 + this.aClass31_Sub2_1.anInt7332 * arg2 >> 15) + this.aClass31_Sub2_1.anInt7329) / local23;
		@Pc(133) int local133 = this.anInt416 * ((this.aClass31_Sub2_1.anInt7334 * arg3 + this.aClass31_Sub2_1.anInt7328 * arg4 + this.aClass31_Sub2_1.anInt7332 * arg5 >> 15) + this.aClass31_Sub2_1.anInt7329) / local52;
		if (local104 < this.anInt423 && local133 < this.anInt423 || local104 > this.anInt428 && local133 > this.anInt428) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt417 * ((this.aClass31_Sub2_1.anInt7331 * arg0 + this.aClass31_Sub2_1.anInt7326 * arg1 + this.aClass31_Sub2_1.anInt7327 * arg2 >> 15) + this.aClass31_Sub2_1.anInt7324) / local23;
			@Pc(209) int local209 = this.anInt417 * ((this.aClass31_Sub2_1.anInt7331 * arg3 + this.aClass31_Sub2_1.anInt7326 * arg4 + this.aClass31_Sub2_1.anInt7327 * arg5 >> 15) + this.aClass31_Sub2_1.anInt7324) / local52;
			return (local180 >= this.anInt415 || local209 >= this.anInt415) && (local180 <= this.anInt408 || local209 <= this.anInt408);
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4250(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas1 = null;
			this.aClass4_Sub22_1 = null;
			if (this.aClass57_5 == null) {
				this.anIntArray26 = null;
				this.anInt430 = this.anInt418 = 1;
				this.method492();
			}
			return;
		}
		@Pc(10) Class4_Sub22 local10 = (Class4_Sub22) this.aClass102_3.method2700((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas1 = arg0;
		this.aClass4_Sub22_1 = local10;
		if (this.aClass57_5 != null) {
			return;
		}
		this.anIntArray26 = local10.anIntArray409;
		this.anInt430 = local10.anInt5857;
		this.anInt418 = local10.anInt5856;
		this.method492();
		return;
	}

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)Lclient!u;")
	@Override
	public Class4_Sub2 method4284(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([Lclient!t;Lclient!mc;Lclient!c;[Lclient!mi;I)V")
	@Override
	public void method4299(@OriginalArg(0) Class110[] arg0, @OriginalArg(1) Class146 arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) Class3_Sub5[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class110_Sub2[] local3 = new Class110_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class110_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class110_Sub2 local26 = Static364.method4912(this, local3);
		local26.method4900(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}
}
