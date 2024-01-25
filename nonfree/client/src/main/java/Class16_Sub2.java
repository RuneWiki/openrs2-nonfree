import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
	private int anInt6459;

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "Z")
	private boolean aBoolean450;

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
	private int anInt6460;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas9;

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "Z")
	private boolean aBoolean451;

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "Lclient!pfa;")
	private Class253 aClass253_21;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
	private int anInt6461;

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "Lclient!qca;")
	public Class8_Sub10 aClass8_Sub10_1;

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "I")
	public int anInt6462;

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
	public int anInt6463;

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "I")
	public int anInt6464;

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
	private int anInt6465;

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
	public int anInt6466;

	@OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
	private int anInt6467;

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "[Lclient!ij;")
	private Class146[] aClass146Array1;

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
	public int anInt6468;

	@OriginalMember(owner = "client!lr", name = "K", descriptor = "Lclient!of;")
	private final Class236 aClass236_58;

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
	public int anInt6469;

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
	public int anInt6470;

	@OriginalMember(owner = "client!lr", name = "N", descriptor = "[F")
	public float[] aFloatArray58;

	@OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
	public int anInt6471;

	@OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
	public int anInt6472;

	@OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
	public int anInt6473;

	@OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
	public int anInt6474;

	@OriginalMember(owner = "client!lr", name = "S", descriptor = "I")
	public int anInt6475;

	@OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
	public int anInt6476;

	@OriginalMember(owner = "client!lr", name = "U", descriptor = "Z")
	private boolean aBoolean452;

	@OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
	public int anInt6477;

	@OriginalMember(owner = "client!lr", name = "W", descriptor = "Lclient!ov;")
	private Class245 aClass245_1;

	@OriginalMember(owner = "client!lr", name = "X", descriptor = "I")
	public int anInt6478;

	@OriginalMember(owner = "client!lr", name = "Y", descriptor = "I")
	private int anInt6479;

	@OriginalMember(owner = "client!lr", name = "Z", descriptor = "Lclient!of;")
	private final Class236 aClass236_59;

	@OriginalMember(owner = "client!lr", name = "ab", descriptor = "I")
	private int anInt6480;

	@OriginalMember(owner = "client!lr", name = "bb", descriptor = "I")
	public int anInt6481;

	@OriginalMember(owner = "client!lr", name = "cb", descriptor = "[F")
	public float[] aFloatArray59;

	@OriginalMember(owner = "client!lr", name = "db", descriptor = "I")
	private int anInt6482;

	@OriginalMember(owner = "client!lr", name = "eb", descriptor = "I")
	public int anInt6483;

	@OriginalMember(owner = "client!lr", name = "fb", descriptor = "I")
	public int anInt6484;

	@OriginalMember(owner = "client!lr", name = "gb", descriptor = "I")
	public int anInt6485;

	@OriginalMember(owner = "client!lr", name = "hb", descriptor = "I")
	public int anInt6486;

	@OriginalMember(owner = "client!lr", name = "ib", descriptor = "I")
	public int anInt6487;

	@OriginalMember(owner = "client!lr", name = "jb", descriptor = "I")
	private int anInt6488;

	@OriginalMember(owner = "client!lr", name = "kb", descriptor = "[I")
	public int[] anIntArray367;

	@OriginalMember(owner = "client!lr", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!lr", name = "mb", descriptor = "I")
	private int anInt6489;

	@OriginalMember(owner = "client!lr", name = "nb", descriptor = "Lclient!ch;")
	public Class54_Sub1 aClass54_Sub1_2;

	@OriginalMember(owner = "client!lr", name = "ob", descriptor = "I")
	public int anInt6490;

	@OriginalMember(owner = "client!lr", name = "pb", descriptor = "I")
	private int anInt6491;

	@OriginalMember(owner = "client!lr", name = "qb", descriptor = "Lclient!hu;")
	private Class21 aClass21_12;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class16_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		this.method6085(arg0, arg2, arg3);
		this.method6120(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class16_Sub2(@OriginalArg(0) Interface2 arg0) {
		super(arg0);
		this.aBoolean450 = false;
		this.aBoolean451 = false;
		this.aClass253_21 = new Class253(4);
		this.anInt6464 = 78642;
		this.aBoolean452 = false;
		this.anInt6479 = 0;
		this.anInt6476 = 0;
		this.anInt6468 = 3500;
		this.anInt6466 = 0;
		this.anInt6469 = 128;
		this.anInt6473 = 0;
		this.anInt6484 = 0;
		this.anInt6486 = 45823;
		this.anInt6478 = 512;
		this.anInt6487 = 50;
		this.anInt6482 = 0;
		this.anInt6477 = 75518;
		this.anInt6485 = 512;
		this.aClass236_58 = new Class236(16);
		this.anInt6491 = -1;
		this.aClass236_59 = new Class236(256);
		this.aClass54_Sub1_2 = new Class54_Sub1();
		this.method6099(1);
		this.method6101(0);
		Static93.method2184(true, true);
		this.aBoolean450 = true;
		this.anInt6461 = (int) Static342.method5463();
	}

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "()Lclient!oba;")
	@Override
	public Class234 method6103() {
		return new Class234(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!lr", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass54_Sub1_2.aFloat53 + this.aClass54_Sub1_2.aFloat48 * (float) arg0 + this.aClass54_Sub1_2.aFloat45 * (float) arg1 + this.aClass54_Sub1_2.aFloat54 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.anInt6485 * (this.aClass54_Sub1_2.aFloat55 + this.aClass54_Sub1_2.aFloat46 * (float) arg0 + this.aClass54_Sub1_2.aFloat52 * (float) arg1 + this.aClass54_Sub1_2.aFloat47 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt6478 * (this.aClass54_Sub1_2.aFloat56 + this.aClass54_Sub1_2.aFloat50 * (float) arg0 + this.aClass54_Sub1_2.aFloat51 * (float) arg1 + this.aClass54_Sub1_2.aFloat49 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt6474;
		arg3[1] = local105 - this.anInt6483;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method6096(@OriginalArg(0) Class8_Sub30 arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass146Array1.length; local1++) {
			@Pc(7) Class146 local7 = this.aClass146Array1[local1];
			local7.anInt5236 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt5236 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt5236 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt5236 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt5236 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean391 = false;
			} else {
				local7.aBoolean391 = true;
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "(I)Lclient!za;")
	@Override
	public Class8_Sub30 method6112(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "()Z")
	@Override
	public boolean method6079() {
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(IIIIII)V")
	private void method5316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt6473) {
			local8 = this.anInt6473;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt6476) {
			local21 = this.anInt6476;
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
				if (local91 < this.anInt6466) {
					local91 = this.anInt6466;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6484) {
					local102 = this.anInt6484;
				}
				local116 = local91 + local30 * this.anInt6490;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray58[local116]) {
						this.anIntArray367[local116] = arg4;
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
				if (local91 < this.anInt6466) {
					local91 = this.anInt6466;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6484 - 1) {
					local102 = this.anInt6484 - 1;
				}
				local116 = local91 + local30 * this.anInt6490;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray58[local116]) {
						this.anIntArray367[local116] = arg4;
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
				if (local102 < this.anInt6466) {
					local102 = this.anInt6466;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt6484) {
					local116 = this.anInt6484;
				}
				local118 = local102 + local30 * this.anInt6490;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray58[local118]) {
						local364 = this.anIntArray367[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray367[local118] = local293 + local364;
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
				if (local102 < this.anInt6466) {
					local102 = this.anInt6466;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt6484 - 1) {
					local116 = this.anInt6484 - 1;
				}
				local118 = local102 + local30 * this.anInt6490;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray58[local118]) {
						local364 = this.anIntArray367[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray367[local118] = local293 + local364;
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
				if (local91 < this.anInt6466) {
					local91 = this.anInt6466;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6484) {
					local102 = this.anInt6484;
				}
				local116 = local91 + local30 * this.anInt6490;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray58[local116]) {
						local350 = this.anIntArray367[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray367[local116] = local364 - local643 | local643 - (local643 >>> 8);
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
				if (local91 < this.anInt6466) {
					local91 = this.anInt6466;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6484 - 1) {
					local102 = this.anInt6484 - 1;
				}
				local116 = local91 + local30 * this.anInt6490;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray58[local116]) {
						local350 = this.anIntArray367[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray367[local116] = local364 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!lr", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt6466 || arg0 >= this.anInt6484) {
			return;
		}
		if (arg1 < this.anInt6473) {
			arg2 -= this.anInt6473 - arg1;
			arg1 = this.anInt6473;
		}
		if (arg1 + arg2 > this.anInt6476) {
			arg2 = this.anInt6476 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt6490;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray367[local40 + local54 * this.anInt6490] = arg3;
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
				local111 = local40 + local103 * this.anInt6490;
				local116 = this.anIntArray367[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray367[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt6490;
				local111 = this.anIntArray367[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray367[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(II)I")
	@Override
	public int method6121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method6070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIZ)Lclient!hu;")
	@Override
	public Class21 method6060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class21_Sub2_Sub1(this, arg0, arg1) : new Class21_Sub2_Sub2(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIII)Lclient!km;")
	@Override
	public Class40 method6068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "()V")
	@Override
	public void method6075() {
	}

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!lr", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt6490) {
			arg2 = this.anInt6490;
		}
		if (arg3 > this.anInt6488) {
			arg3 = this.anInt6488;
		}
		this.anInt6466 = arg0;
		this.anInt6484 = arg2;
		this.anInt6473 = arg1;
		this.anInt6476 = arg3;
		this.method5330();
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt6465 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt6465 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray58;
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

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!pca;)V")
	@Override
	public void method6100(@OriginalArg(0) Class250 arg0) {
		@Pc(3) Class146 local3 = this.method5317(Thread.currentThread());
		@Pc(7) Class15_Sub5 local7 = arg0.aClass131_1.aClass15_Sub5_7;
		for (@Pc(10) Class15_Sub5 local10 = local7.aClass15_Sub5_9; local10 != local7; local10 = local10.aClass15_Sub5_9) {
			@Pc(14) Class15_Sub5_Sub1 local14 = (Class15_Sub5_Sub1) local10;
			@Pc(19) int local19 = local14.anInt3827 >> 12;
			@Pc(24) int local24 = local14.anInt3830 >> 12;
			@Pc(29) int local29 = local14.anInt3826 >> 12;
			@Pc(54) float local54 = this.aClass54_Sub1_2.aFloat53 + this.aClass54_Sub1_2.aFloat48 * (float) local19 + this.aClass54_Sub1_2.aFloat45 * (float) local24 + this.aClass54_Sub1_2.aFloat54 * (float) local29;
			if (!(local54 < (float) this.anInt6487) && !(local54 > (float) local3.anInt5237)) {
				@Pc(102) int local102 = this.anInt6462 + (int) ((float) this.anInt6485 * (this.aClass54_Sub1_2.aFloat55 + this.aClass54_Sub1_2.aFloat46 * (float) local19 + this.aClass54_Sub1_2.aFloat52 * (float) local24 + this.aClass54_Sub1_2.aFloat47 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt6463 + (int) ((float) this.anInt6478 * (this.aClass54_Sub1_2.aFloat56 + this.aClass54_Sub1_2.aFloat50 * (float) local19 + this.aClass54_Sub1_2.aFloat51 * (float) local24 + this.aClass54_Sub1_2.aFloat49 * (float) local29) / local54);
				if (local102 >= this.anInt6466 && local102 <= this.anInt6484 && local137 >= this.anInt6473 && local137 <= this.anInt6476) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method5325(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt3822 * this.anInt6485 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt6490 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt6465 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray367;
		@Pc(24) float[] local24 = this.aFloatArray58;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static649.method5529(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static649.method5529(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static649.method5535(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static649.method5535(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!lr", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt6477 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Z)V")
	@Override
	public void method6071(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!ij;")
	public Class146 method5317(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6470; local1++) {
			if (this.aClass146Array1[local1].aRunnable2 == arg0) {
				return this.aClass146Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray606;
		@Pc(8) int[] local8 = local2.anIntArray605;
		@Pc(20) int local20;
		if (this.anInt6476 < arg3 + local5.length) {
			local20 = this.anInt6476 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt6473 > arg3) {
			local33 = this.anInt6473 - arg3;
			arg3 = this.anInt6473;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt6490;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt6466 > local58) {
				local62 -= this.anInt6466 - local58;
				local58 = this.anInt6466;
			}
			if (this.anInt6484 < local58 + local62) {
				local62 = this.anInt6484 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray367[local58++] = arg0;
			}
			local49 += this.anInt6490;
		}
	}

	@OriginalMember(owner = "client!lr", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass146Array1.length; local1++) {
			this.aClass146Array1[local1].anInt5227 = this.aClass146Array1[local1].anInt5236;
			this.aClass146Array1[local1].anInt5234 = arg0;
			this.aClass146Array1[local1].anInt5236 = arg1;
			this.aClass146Array1[local1].anInt5233 = arg2;
			this.aClass146Array1[local1].aBoolean392 = true;
		}
	}

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "()V")
	@Override
	public void method6128() {
		if (this.aCanvas9 == null) {
			this.anInt6490 = 1;
			this.anInt6488 = 1;
			this.anIntArray367 = null;
			this.anInt6465 = 1;
			this.anInt6489 = 1;
			this.aFloatArray58 = null;
		} else {
			this.anIntArray367 = this.aClass8_Sub10_1.anIntArray237;
			this.anInt6490 = this.aClass8_Sub10_1.anInt4339;
			this.anInt6488 = this.aClass8_Sub10_1.anInt4338;
			this.aFloatArray58 = this.aFloatArray59;
			this.anInt6465 = this.anInt6467;
			this.anInt6489 = this.anInt6480;
		}
		this.aClass245_1 = null;
		this.method5328();
	}

	@OriginalMember(owner = "client!lr", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt6466) {
			arg2 -= this.anInt6466 - arg0;
			arg0 = this.anInt6466;
		}
		if (arg1 < this.anInt6473) {
			arg3 -= this.anInt6473 - arg1;
			arg1 = this.anInt6473;
		}
		if (arg0 + arg2 > this.anInt6484) {
			arg2 = this.anInt6484 - arg0;
		}
		if (arg1 + arg3 > this.anInt6476) {
			arg3 = this.anInt6476 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt6484 || arg1 > this.anInt6476) {
			return;
		}
		@Pc(67) int local67 = this.anInt6490 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt6490;
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
						local217 = this.anIntArray367[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray367[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray367[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray367[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray367[arg2] = arg4;
					arg2++;
					this.anIntArray367[arg2] = arg4;
					arg2++;
					this.anIntArray367[arg2] = arg4;
					arg2++;
					this.anIntArray367[arg2] = arg4;
					arg2++;
					this.anIntArray367[arg2] = arg4;
					arg2++;
					this.anIntArray367[arg2] = arg4;
					arg2++;
					this.anIntArray367[arg2] = arg4;
					arg2++;
					this.anIntArray367[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray367[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)Z")
	public boolean method5318(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method4025(arg0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method5319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface2_12.method4027(arg6).aBoolean471) {
			this.method5316(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt6491 != arg6) {
			@Pc(26) Class21 local26 = (Class21) this.aClass236_58.method6242((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method5327(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method5331(arg6) ? 64 : this.anInt6469;
				local26 = this.method6132(local44, local32, local44, local44);
				this.aClass236_58.method6241((long) arg6, local26);
			}
			this.anInt6491 = arg6;
			this.aClass21_12 = local26;
		}
		((Class21_Sub2) this.aClass21_12).method4507(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!lr", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass54_Sub1_2.aFloat53 + this.aClass54_Sub1_2.aFloat48 * (float) arg0 + this.aClass54_Sub1_2.aFloat45 * (float) arg1 + this.aClass54_Sub1_2.aFloat54 * (float) arg2;
		if (local24 < (float) this.anInt6487 || local24 > (float) this.anInt6468) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.anInt6485 * (this.aClass54_Sub1_2.aFloat55 + this.aClass54_Sub1_2.aFloat46 * (float) arg0 + this.aClass54_Sub1_2.aFloat52 * (float) arg1 + this.aClass54_Sub1_2.aFloat47 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt6478 * (this.aClass54_Sub1_2.aFloat56 + this.aClass54_Sub1_2.aFloat50 * (float) arg0 + this.aClass54_Sub1_2.aFloat51 * (float) arg1 + this.aClass54_Sub1_2.aFloat49 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt6474 && local82 <= this.lb && local115 >= this.anInt6483 && local115 <= this.anInt6472) {
			arg4[0] = local82 - this.anInt6474;
			arg4[1] = local115 - this.anInt6483;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!km;Lclient!km;FLclient!km;)Lclient!km;")
	@Override
	public Class40 method6067(@OriginalArg(0) Class40 arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class40 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "(I)I")
	public int method5320(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method4027(arg0).anInt6842;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "()V")
	@Override
	public void method6059() {
		this.aClass236_59.method6253();
		this.aClass236_58.method6253();
	}

	@OriginalMember(owner = "client!lr", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt6466 = 0;
		this.anInt6473 = 0;
		this.anInt6484 = this.anInt6490;
		this.anInt6476 = this.anInt6488;
		this.method5330();
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
	@Override
	public void method6101(@OriginalArg(0) int arg0) {
		this.aClass146Array1[arg0].method4276(Thread.currentThread());
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	@Override
	public void method6083() {
		Static576.anInt9905 = 10000;
		Static576.anInt9907 = 10000;
		if (this.anInt6470 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method6099(this.anInt6470);
		this.method6101(0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIII)V")
	private void method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt6473 || arg1 >= this.anInt6476) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt6490;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt6466 && arg0 + local37 < this.anInt6484 && local27 < arg4) {
					this.anIntArray367[local15 + local37] = arg3;
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
			if (arg0 + local103 >= this.anInt6466 && arg0 + local103 < this.anInt6484 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray367[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray367[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt6479;
		this.anInt6479 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method6106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!uk;IIII)Lclient!ka;")
	@Override
	public Class83 method6094(@OriginalArg(0) Class344 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class83_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!lr", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt6486 = (int) (arg1 * 65535.0F);
		this.anInt6464 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt6481 = (int) (arg3 * 65535.0F / local26);
		this.anInt6475 = (int) (arg4 * 65535.0F / local26);
		this.anInt6471 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!lr", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt6473) {
			local8 = this.anInt6473;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt6476) {
			local21 = this.anInt6476;
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
				if (local91 < this.anInt6466) {
					local91 = this.anInt6466;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6484) {
					local102 = this.anInt6484;
				}
				local116 = local91 + local30 * this.anInt6490;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray367[local116++] = arg3;
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
				if (local91 < this.anInt6466) {
					local91 = this.anInt6466;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt6484 - 1) {
					local102 = this.anInt6484 - 1;
				}
				local116 = local91 + local30 * this.anInt6490;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray367[local116++] = arg3;
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
			if (local102 < this.anInt6466) {
				local102 = this.anInt6466;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt6484) {
				local116 = this.anInt6484;
			}
			local118 = local102 + local30 * this.anInt6490;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray367[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray367[local118++] = local277 + local360;
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
			if (local102 < this.anInt6466) {
				local102 = this.anInt6466;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt6484 - 1) {
				local116 = this.anInt6484 - 1;
			}
			local118 = local102 + local30 * this.anInt6490;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray367[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray367[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!kv;Lclient!iaa;)Lclient!jj;")
	@Override
	public Interface11 method6125(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) Interface8 arg1) {
		return new Class245(this, (Class21) arg0, (Class341) arg1);
	}

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "(I)Z")
	public boolean method5322(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method4027(arg0).aBoolean478 || super.anInterface2_12.method4027(arg0).aBoolean472;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([IIIIIZ)Lclient!hu;")
	@Override
	public Class21 method6054(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class21_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class21_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class21_Sub2_Sub1(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class21_Sub2_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!lr", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt6490, this.anInt6488, arg0, 0);
	}

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method6118() {
		return this.aClass54_Sub1_2;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method6057() {
		@Pc(3) Class146 local3 = this.method5317(Thread.currentThread());
		@Pc(6) Class112 local6 = local3.aClass112_1;
		local6.aBoolean296 = false;
		@Pc(14) int local14 = 5 - this.anInt6474;
		@Pc(19) int local19 = 75 - this.anInt6474;
		@Pc(24) int local24 = 15 - this.anInt6474;
		@Pc(29) int local29 = 10 - this.anInt6483;
		@Pc(34) int local34 = 50 - this.anInt6483;
		@Pc(39) int local39 = 90 - this.anInt6483;
		local6.aBoolean293 = local14 < 0 || local14 > local6.anInt4073 || local19 < 0 || local19 > local6.anInt4073 || local24 < 0 || local24 > local6.anInt4073;
		local6.anInt4074 = 0;
		local6.aBoolean294 = false;
		local6.method3321((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean296 = true;
	}

	@OriginalMember(owner = "client!lr", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt6468;
	}

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "()Z")
	@Override
	public boolean method6117() {
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt6466 == 0 && this.anInt6484 == this.anInt6490 && this.anInt6473 == 0 && this.anInt6476 == this.anInt6488) {
			local19 = this.aFloatArray58.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
				this.aFloatArray58[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray58[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt6484 - this.anInt6466;
		local25 = this.anInt6476 - this.anInt6473;
		local27 = this.anInt6490 - local19;
		@Pc(116) int local116 = this.anInt6466 + this.anInt6473 * this.anInt6490;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray58[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(IIIIIIII)V")
	private void method5323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt6466 || arg0 >= this.anInt6484) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt6490;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt6473 && arg1 + local37 < this.anInt6476 && local27 < arg4) {
					this.anIntArray367[local15 + local37 * this.anInt6490] = arg3;
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
			if (arg1 + local106 >= this.anInt6473 && arg1 + local106 < this.anInt6476 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt6490;
				@Pc(134) int local134 = this.anIntArray367[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray367[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)Lclient!iaa;")
	@Override
	public Interface8 method6064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class341(arg0, arg1);
	}

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "(I)I")
	public int method5324(@OriginalArg(0) int arg0) {
		return super.anInterface2_12.method4027(arg0).aShort73 & 0xFFFF;
	}

	@OriginalMember(owner = "client!lr", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V")
	@Override
	public void method6099(@OriginalArg(0) int arg0) {
		this.anInt6470 = arg0;
		this.aClass146Array1 = new Class146[this.anInt6470];
		for (@Pc(9) int local9 = 0; local9 < this.anInt6470; local9++) {
			this.aClass146Array1[local9] = new Class146(this);
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6129(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub10 local8 = (Class8_Sub10) this.aClass253_21.method6594((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method8640();
		local8 = Static423.method6601(arg2, arg0, arg1);
		this.aClass253_21.method6591(local8, (long) arg0.hashCode());
		if (this.aCanvas9 != arg0 || this.aClass245_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt6459 = local37.width;
		this.anInt6460 = local37.height;
		this.aClass8_Sub10_1 = local8;
		this.anIntArray367 = local8.anIntArray237;
		this.anInt6490 = local8.anInt4339;
		this.anInt6488 = local8.anInt4338;
		if (this.anInt6490 != this.anInt6465 || this.anInt6488 != this.anInt6489) {
			this.anInt6467 = this.anInt6465 = this.anInt6490;
			this.anInt6480 = this.anInt6489 = this.anInt6488;
			this.aFloatArray59 = this.aFloatArray58 = new float[this.anInt6465 * this.anInt6489];
		}
		this.method5328();
	}

	@OriginalMember(owner = "client!lr", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass54_Sub1_2.aFloat53 + this.aClass54_Sub1_2.aFloat48 * (float) arg0 + this.aClass54_Sub1_2.aFloat45 * (float) arg1 + this.aClass54_Sub1_2.aFloat54 * (float) arg2;
		if (local24 < (float) this.anInt6487 || local24 > (float) this.anInt6468) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt6485 * (this.aClass54_Sub1_2.aFloat55 + this.aClass54_Sub1_2.aFloat46 * (float) arg0 + this.aClass54_Sub1_2.aFloat52 * (float) arg1 + this.aClass54_Sub1_2.aFloat47 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt6478 * (this.aClass54_Sub1_2.aFloat56 + this.aClass54_Sub1_2.aFloat50 * (float) arg0 + this.aClass54_Sub1_2.aFloat51 * (float) arg1 + this.aClass54_Sub1_2.aFloat49 * (float) arg2) / local24);
		if (local81 >= this.anInt6474 && local81 <= this.lb && local113 >= this.anInt6483 && local113 <= this.anInt6472) {
			arg3[0] = local81 - this.anInt6474;
			arg3[1] = local113 - this.anInt6483;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "()Z")
	@Override
	public boolean method6102() {
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(II)Lclient!kv;")
	@Override
	public Interface14 method6127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method6060(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "(I)V")
	@Override
	public void method6134(@OriginalArg(0) int arg0) {
		this.aClass146Array1[arg0].method4276(null);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([I)V")
	@Override
	public void method6087(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6490;
		arg0[1] = this.anInt6488;
	}

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class146 local3 = this.method5317(Thread.currentThread());
		local3.aBoolean390 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "()I")
	@Override
	public int method6074() {
		return 0;
	}

	@OriginalMember(owner = "client!lr", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt6462, this.anInt6463, this.anInt6485, this.anInt6478 };
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	@Override
	public void method6082(@OriginalArg(0) int arg0) {
		this.anInt6469 = arg0;
		this.aClass236_59.method6253();
	}

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "()Z")
	@Override
	public boolean method6133() {
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt6482;
		this.anInt6482 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "()Z")
	@Override
	public boolean method6077() {
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!gi;IIII)V")
	private void method5325(@OriginalArg(0) Class15_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt3824;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method5316(arg1, arg2, arg3, arg4, arg0.anInt3828, 1);
			return;
		}
		if (this.anInt6491 != local2) {
			@Pc(33) Class21 local33 = (Class21) this.aClass236_58.method6242((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method5327(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method5331(local2) ? 64 : this.anInt6469;
				local33 = this.method6132(local50, local39, local50, local50);
				this.aClass236_58.method6241((long) local2, local33);
			}
			this.anInt6491 = local2;
			this.aClass21_12 = local33;
		}
		local8++;
		((Class21_Sub2) this.aClass21_12).method4507(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt3828, 1);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!ur;[Lclient!g;Z)Lclient!da;")
	@Override
	public Class27 method6088(@OriginalArg(0) Class345 arg0, @OriginalArg(1) Class111[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt4054;
			local7[local11] = arg1[local11].anInt4053;
			if (arg1[local11].aByteArray28 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class27_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class27_Sub5(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method6124() {
		@Pc(3) Class146 local3 = this.method5317(Thread.currentThread());
		return local3.aClass54_Sub1_1;
	}

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "(I)V")
	@Override
	public void method6119(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt6461;
		for (@Pc(9) Object local9 = this.aClass236_59.method6251(); local9 != null; local9 = this.aClass236_59.method6254()) {
			@Pc(13) Class8_Sub39 local13 = (Class8_Sub39) local9;
			if (local13.aBoolean550) {
				local13.anInt7584 += local4;
				@Pc(27) int local27 = local13.anInt7584 / 20;
				if (local27 > 0) {
					@Pc(36) Class218 local36 = super.anInterface2_12.method4027(local13.anInt7583);
					local13.method6259(local36.aByte67 * local4 * 50 / 1000, local36.aByte64 * local4 * 50 / 1000);
					local13.anInt7584 -= local27 * 20;
				}
				local13.aBoolean550 = false;
			}
		}
		this.anInt6461 = arg0;
		this.aClass236_58.method6243(5);
		this.aClass236_59.method6243(5);
	}

	@OriginalMember(owner = "client!lr", name = "g", descriptor = "()Z")
	public boolean method5326() {
		return this.aBoolean451;
	}

	@OriginalMember(owner = "client!lr", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt6473 || arg1 >= this.anInt6476) {
			return;
		}
		if (arg0 < this.anInt6466) {
			arg2 -= this.anInt6466 - arg0;
			arg0 = this.anInt6466;
		}
		if (arg0 + arg2 > this.anInt6484) {
			arg2 = this.anInt6484 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt6490;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray367[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray367[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray367[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray367[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray367[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()V")
	@Override
	protected void method6053() {
		if (this.aBoolean450) {
			Static266.method4631(true, false);
			this.aBoolean450 = false;
		}
		this.aClass8_Sub10_1 = null;
		this.aCanvas9 = null;
		this.anInt6459 = 0;
		this.anInt6460 = 0;
		this.aClass253_21 = null;
		this.aBoolean451 = true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class86 method6126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class86_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!lr", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt6466;
		arg0[1] = this.anInt6473;
		arg0[2] = this.anInt6484;
		arg0[3] = this.anInt6476;
	}

	@OriginalMember(owner = "client!lr", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt6490;
		@Pc(35) int local35 = this.anInt6490 - arg2;
		if (arg1 + arg3 > this.anInt6476) {
			arg3 -= arg1 + arg3 - this.anInt6476;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt6473) {
			local59 = this.anInt6473 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt6490;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt6484) {
			local59 = arg0 + arg2 - this.anInt6484;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt6466) {
			local59 = this.anInt6466 - arg0;
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
						this.anIntArray367[local30++] = arg4;
					} else {
						this.anIntArray367[local30++] = arg5;
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
					local245 = this.anIntArray367[local30];
					this.anIntArray367[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray367[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray367[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class146 local3 = this.method5317(Thread.currentThread());
		this.anInt6487 = arg0;
		this.anInt6468 = arg1;
		local3.anInt5237 = this.anInt6468 - 255;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method6085(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class8_Sub10 local8 = (Class8_Sub10) this.aClass253_21.method6594((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static423.method6601(arg2, arg0, arg1);
			this.aClass253_21.method6591(local8, (long) arg0.hashCode());
		} else if (local8.anInt4339 != arg1 || local8.anInt4338 != arg2) {
			this.method6129(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!lr", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass54_Sub1_2.aFloat48 * (float) arg0 + this.aClass54_Sub1_2.aFloat45 * (float) arg1 + this.aClass54_Sub1_2.aFloat54 * (float) arg2 + this.aClass54_Sub1_2.aFloat53;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass54_Sub1_2.aFloat48 * (float) arg3 + this.aClass54_Sub1_2.aFloat45 * (float) arg4 + this.aClass54_Sub1_2.aFloat54 * (float) arg5 + this.aClass54_Sub1_2.aFloat53;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt6487 && local57 < (float) this.anInt6487) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt6468 && local57 > (float) this.anInt6468) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.anInt6485 * (this.aClass54_Sub1_2.aFloat46 * (float) arg0 + this.aClass54_Sub1_2.aFloat52 * (float) arg1 + this.aClass54_Sub1_2.aFloat47 * (float) arg2 + this.aClass54_Sub1_2.aFloat55) / local26);
		@Pc(160) int local160 = (int) ((float) this.anInt6485 * (this.aClass54_Sub1_2.aFloat46 * (float) arg3 + this.aClass54_Sub1_2.aFloat52 * (float) arg4 + this.aClass54_Sub1_2.aFloat47 * (float) arg5 + this.aClass54_Sub1_2.aFloat55) / local57);
		if (local128 < this.anInt6474 && local160 < this.anInt6474) {
			local1 |= 0x1;
		} else if (local128 > this.lb && local160 > this.lb) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt6478 * (this.aClass54_Sub1_2.aFloat50 * (float) arg0 + this.aClass54_Sub1_2.aFloat51 * (float) arg1 + this.aClass54_Sub1_2.aFloat49 * (float) arg2 + this.aClass54_Sub1_2.aFloat56) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt6478 * (this.aClass54_Sub1_2.aFloat50 * (float) arg3 + this.aClass54_Sub1_2.aFloat51 * (float) arg4 + this.aClass54_Sub1_2.aFloat49 * (float) arg5 + this.aClass54_Sub1_2.aFloat56) / local57);
		if (local217 < this.anInt6483 && local249 < this.anInt6483) {
			local1 |= 0x4;
		} else if (local217 > this.anInt6472 && local249 > this.anInt6472) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "()Z")
	@Override
	public boolean method6056() {
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class146 local3 = this.method5317(Thread.currentThread());
		local3.anInt5234 = arg0;
		local3.anInt5236 = arg1;
		local3.anInt5233 = arg2;
	}

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "()Z")
	@Override
	public boolean method6122() {
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method6093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt6466) {
					arg1 += local104 * (this.anInt6466 - arg0);
					arg0 = this.anInt6466;
				}
				if (arg2 >= this.anInt6484) {
					arg2 = this.anInt6484 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt6473 && local150 < this.anInt6476) {
							this.anIntArray367[arg0 + local150 * this.anInt6490] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt6473 && local213 < this.anInt6476) {
							local228 = arg0 + local213 * this.anInt6490;
							local233 = this.anIntArray367[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray367[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt6473 && local150 < this.anInt6476) {
							local213 = arg0 + local150 * this.anInt6490;
							local228 = this.anIntArray367[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray367[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt6473) {
					arg0 += local104 * (this.anInt6473 - arg1);
					arg1 = this.anInt6473;
				}
				if (arg3 >= this.anInt6476) {
					arg3 = this.anInt6476 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt6466 && local150 < this.anInt6484) {
							this.anIntArray367[local150 + arg1 * this.anInt6490] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt6466 && local213 < this.anInt6484) {
							local228 = local213 + arg1 * this.anInt6490;
							local233 = this.anIntArray367[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray367[local213 + arg1 * this.anInt6490] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt6466 && local150 < this.anInt6484) {
							local213 = local150 + arg1 * this.anInt6490;
							local228 = this.anIntArray367[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray367[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "(I)[I")
	public int[] method5327(@OriginalArg(0) int arg0) {
		@Pc(2) Class236 local2 = this.aClass236_59;
		@Pc(14) Class8_Sub39 local14;
		synchronized (this.aClass236_59) {
			local14 = (Class8_Sub39) this.aClass236_59.method6242((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface2_12.method4025(arg0)) {
					return null;
				}
				@Pc(34) Class218 local34 = super.anInterface2_12.method4027(arg0);
				@Pc(45) int local45 = local34.aBoolean476 || this.aBoolean452 ? 64 : this.anInt6469;
				local14 = new Class8_Sub39(arg0, local45, super.anInterface2_12.method4028(0.7F, local45, arg0, local45), local34.anInt6842 != 1);
				this.aClass236_59.method6241((long) arg0 | Long.MIN_VALUE, local14);
			}
		}
		local14.aBoolean550 = true;
		return local14.method6260();
	}

	@OriginalMember(owner = "client!lr", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6462 = arg0;
		this.anInt6463 = arg1;
		this.anInt6485 = arg2;
		this.anInt6478 = arg3;
		this.method5330();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6090(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas9 == arg0) {
			this.method6120(null);
		}
		@Pc(15) Class8_Sub10 local15 = (Class8_Sub10) this.aClass253_21.method6594((long) arg0.hashCode());
		if (local15 != null) {
			local15.method8640();
		}
	}

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "()Z")
	@Override
	public boolean method6115() {
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "()V")
	private void method5328() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt6470; local1++) {
			this.aClass146Array1[local1].method4275();
		}
		this.la();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[Lclient!ada;)V")
	@Override
	public void method6052(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1[] arg1) {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!dfa;)V")
	@Override
	public void method6066(@OriginalArg(0) Class54 arg0) {
		this.aClass54_Sub1_2 = (Class54_Sub1) arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class146 local3 = this.method5317(Thread.currentThread());
		@Pc(6) Class112 local6 = local3.aClass112_1;
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
		@Pc(105) int local105 = arg0 - local6.method3324();
		@Pc(110) int local110 = arg1 - local6.method3316();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt4074 = 0;
		this.C(false);
		local6.aBoolean293 = local114 < 0 || local114 > local6.anInt4073 || local118 < 0 || local118 > local6.anInt4073 || local124 < 0 || local124 > local6.anInt4073;
		local6.method3314((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean293 = local114 < 0 || local114 > local6.anInt4073 || local124 < 0 || local124 > local6.anInt4073 || local130 < 0 || local130 > local6.anInt4073;
		local6.method3314((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method6120(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas9 = null;
			this.aClass8_Sub10_1 = null;
			if (this.aClass245_1 == null) {
				this.anIntArray367 = null;
				this.anInt6490 = this.anInt6488 = 1;
				this.anInt6465 = this.anInt6489 = 1;
				this.method5328();
			}
			return;
		}
		@Pc(10) Class8_Sub10 local10 = (Class8_Sub10) this.aClass253_21.method6594((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas9 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt6459 = local18.width;
		this.anInt6460 = local18.height;
		this.aClass8_Sub10_1 = local10;
		if (this.aClass245_1 != null) {
			return;
		}
		this.anIntArray367 = local10.anIntArray237;
		this.anInt6490 = local10.anInt4339;
		this.anInt6488 = local10.anInt4338;
		if (this.anInt6490 != this.anInt6465 || this.anInt6488 != this.anInt6489) {
			this.anInt6467 = this.anInt6465 = this.anInt6490;
			this.anInt6480 = this.anInt6489 = this.anInt6488;
			this.aFloatArray59 = this.aFloatArray58 = new float[this.anInt6465 * this.anInt6489];
		}
		this.method5328();
		return;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method6113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray606;
		@Pc(8) int[] local8 = local2.anIntArray605;
		@Pc(17) int local17 = this.anInt6473 > arg7 ? this.anInt6473 : arg7;
		@Pc(32) int local32 = this.anInt6476 < arg7 + local5.length ? this.anInt6476 : arg7 + local5.length;
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
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt6466 && local172 < this.anInt6484 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray367[local172 + arg1 * this.anInt6490] = arg4;
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
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt6466 && local176 < this.anInt6484 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt6490;
						local316 = this.anIntArray367[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray367[local176 + arg1 * this.anInt6490] = local263 + local707;
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
				if (arg0 >= this.anInt6466 && arg0 < this.anInt6484 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray367[arg0 + local172 * this.anInt6490] = arg4;
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
			if (arg0 >= this.anInt6466 && arg0 < this.anInt6484 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt6490;
					@Pc(321) int local321 = this.anIntArray367[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray367[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass54_Sub1_2.aFloat48 * (float) arg0 + this.aClass54_Sub1_2.aFloat45 * (float) arg1 + this.aClass54_Sub1_2.aFloat54 * (float) arg2 + this.aClass54_Sub1_2.aFloat53;
		@Pc(49) float local49 = this.aClass54_Sub1_2.aFloat48 * (float) arg3 + this.aClass54_Sub1_2.aFloat45 * (float) arg4 + this.aClass54_Sub1_2.aFloat54 * (float) arg5 + this.aClass54_Sub1_2.aFloat53;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt6487 && local49 < (float) this.anInt6487) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt6468 && local49 > (float) this.anInt6468) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.anInt6485 * (this.aClass54_Sub1_2.aFloat46 * (float) arg0 + this.aClass54_Sub1_2.aFloat52 * (float) arg1 + this.aClass54_Sub1_2.aFloat47 * (float) arg2 + this.aClass54_Sub1_2.aFloat55) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.anInt6485 * (this.aClass54_Sub1_2.aFloat46 * (float) arg3 + this.aClass54_Sub1_2.aFloat52 * (float) arg4 + this.aClass54_Sub1_2.aFloat47 * (float) arg5 + this.aClass54_Sub1_2.aFloat55) / (float) arg6);
		if (local117 < this.anInt6474 && local150 < this.anInt6474) {
			local51 |= 0x1;
		} else if (local117 > this.lb && local150 > this.lb) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt6478 * (this.aClass54_Sub1_2.aFloat50 * (float) arg0 + this.aClass54_Sub1_2.aFloat51 * (float) arg1 + this.aClass54_Sub1_2.aFloat49 * (float) arg2 + this.aClass54_Sub1_2.aFloat56) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt6478 * (this.aClass54_Sub1_2.aFloat50 * (float) arg3 + this.aClass54_Sub1_2.aFloat51 * (float) arg4 + this.aClass54_Sub1_2.aFloat49 * (float) arg5 + this.aClass54_Sub1_2.aFloat56) / (float) arg6);
		if (local208 < this.anInt6483 && local241 < this.anInt6483) {
			local51 |= 0x4;
		} else if (local208 > this.anInt6472 && local241 > this.anInt6472) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "()Z")
	@Override
	public boolean method6138() {
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass146Array1.length; local1++) {
			this.aClass146Array1[local1].anInt5236 = this.aClass146Array1[local1].anInt5227;
			this.aClass146Array1[local1].aBoolean392 = false;
		}
	}

	@OriginalMember(owner = "client!lr", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6466 < arg0) {
			this.anInt6466 = arg0;
		}
		if (this.anInt6473 < arg1) {
			this.anInt6473 = arg1;
		}
		if (this.anInt6484 > arg2) {
			this.anInt6484 = arg2;
		}
		if (this.anInt6476 > arg3) {
			this.anInt6476 = arg3;
		}
		this.method5330();
	}

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "(I)[I")
	public int[] method5329(@OriginalArg(0) int arg0) {
		@Pc(2) Class236 local2 = this.aClass236_59;
		@Pc(12) Class8_Sub39 local12;
		synchronized (this.aClass236_59) {
			local12 = (Class8_Sub39) this.aClass236_59.method6242((long) arg0);
			if (local12 == null) {
				if (!super.anInterface2_12.method4025(arg0)) {
					return null;
				}
				@Pc(32) Class218 local32 = super.anInterface2_12.method4027(arg0);
				@Pc(43) int local43 = local32.aBoolean476 || this.aBoolean452 ? 64 : this.anInt6469;
				local12 = new Class8_Sub39(arg0, local43, super.anInterface2_12.method4026(true, local43, arg0, 0.7F, local43), local32.anInt6842 != 1);
				this.aClass236_59.method6241((long) arg0, local12);
			}
		}
		local12.aBoolean550 = true;
		return local12.method6260();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIF)Lclient!ada;")
	@Override
	public Class8_Sub1 method6084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!pca;I)V")
	@Override
	public void method6108(@OriginalArg(0) Class250 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class146 local3 = this.method5317(Thread.currentThread());
		@Pc(7) Class15_Sub5 local7 = arg0.aClass131_1.aClass15_Sub5_7;
		for (@Pc(10) Class15_Sub5 local10 = local7.aClass15_Sub5_9; local10 != local7; local10 = local10.aClass15_Sub5_9) {
			@Pc(14) Class15_Sub5_Sub1 local14 = (Class15_Sub5_Sub1) local10;
			@Pc(19) int local19 = local14.anInt3827 >> 12;
			@Pc(24) int local24 = local14.anInt3830 >> 12;
			@Pc(29) int local29 = local14.anInt3826 >> 12;
			@Pc(54) float local54 = this.aClass54_Sub1_2.aFloat53 + this.aClass54_Sub1_2.aFloat48 * (float) local19 + this.aClass54_Sub1_2.aFloat45 * (float) local24 + this.aClass54_Sub1_2.aFloat54 * (float) local29;
			if (!(local54 < (float) this.anInt6487) && !(local54 > (float) local3.anInt5237)) {
				@Pc(103) int local103 = this.anInt6462 + (int) ((float) this.anInt6485 * (this.aClass54_Sub1_2.aFloat55 + this.aClass54_Sub1_2.aFloat46 * (float) local19 + this.aClass54_Sub1_2.aFloat52 * (float) local24 + this.aClass54_Sub1_2.aFloat47 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt6463 + (int) ((float) this.anInt6478 * (this.aClass54_Sub1_2.aFloat56 + this.aClass54_Sub1_2.aFloat50 * (float) local19 + this.aClass54_Sub1_2.aFloat51 * (float) local24 + this.aClass54_Sub1_2.aFloat49 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt6466 && local103 <= this.anInt6484 && local139 >= this.anInt6473 && local139 <= this.anInt6476) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method5325(local14, local103, local139, (int) local54, (local14.anInt3822 * this.anInt6485 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "()V")
	@Override
	public void method6081() {
	}

	@OriginalMember(owner = "client!lr", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt6490 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray367[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(FFF)V")
	@Override
	public void method6107(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(II)V")
	@Override
	public void method6131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas9 == null || this.aClass8_Sub10_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas9.getGraphics();
			this.aClass8_Sub10_1.method3523(local14, arg1, this.anInt6459, 0, this.anInt6460, 0, arg0);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas9.repaint();
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V")
	@Override
	public void method6111(@OriginalArg(0) boolean arg0) {
		this.aBoolean452 = arg0;
		this.aClass236_59.method6253();
	}

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "()Z")
	@Override
	public boolean method6123() {
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "()V")
	private void method5330() {
		this.anInt6474 = this.anInt6466 - this.anInt6462;
		this.lb = this.anInt6484 - this.anInt6462;
		this.anInt6483 = this.anInt6473 - this.anInt6463;
		this.anInt6472 = this.anInt6476 - this.anInt6463;
		for (@Pc(29) int local29 = 0; local29 < this.anInt6470; local29++) {
			@Pc(36) Class112 local36 = this.aClass146Array1[local29].aClass112_1;
			local36.anInt4072 = this.anInt6462 - this.anInt6466;
			local36.anInt4077 = this.anInt6463 - this.anInt6473;
			local36.anInt4073 = this.anInt6484 - this.anInt6466;
			local36.anInt4076 = this.anInt6476 - this.anInt6473;
		}
		@Pc(78) int local78 = this.anInt6473 * this.anInt6490 + this.anInt6466;
		for (@Pc(81) int local81 = this.anInt6473; local81 < this.anInt6476; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt6470; local84++) {
				this.aClass146Array1[local84].aClass112_1.anIntArray218[local81 - this.anInt6473] = local78;
			}
			local78 += this.anInt6490;
		}
	}

	@OriginalMember(owner = "client!lr", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt6487;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method6110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method5321(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method5321(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
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
						if (arg0 >= this.anInt6466 && arg0 < this.anInt6484 && local267 >= this.anInt6473 && local267 < this.anInt6476 && arg7 < local143) {
							this.anIntArray367[arg0 + local267 * this.anInt6490] = arg4;
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
						if (arg0 >= this.anInt6466 && arg0 < this.anInt6484 && local349 >= this.anInt6473 && local349 < this.anInt6476 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt6490;
							local380 = this.anIntArray367[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray367[local375] = local340 + local380;
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
						if (arg1 >= this.anInt6473 && arg1 < this.anInt6476 && local267 >= this.anInt6466 && local267 < this.anInt6484 && arg7 < local143) {
							this.anIntArray367[local267 + arg1 * this.anInt6490] = arg4;
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
						if (arg1 >= this.anInt6473 && arg1 < this.anInt6476 && local349 >= this.anInt6466 && local349 < this.anInt6484 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt6490;
							local380 = this.anIntArray367[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray367[local349 + arg1 * this.anInt6490] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method5323(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method5323(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "()Lclient!dfa;")
	@Override
	public Class54 method6076() {
		return new Class54_Sub1();
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "()Z")
	@Override
	public boolean method6055() {
		return true;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!km;)V")
	@Override
	public void method6072(@OriginalArg(0) Class40 arg0) {
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)I")
	@Override
	public int method6109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!jj;)V")
	@Override
	public void method6078(@OriginalArg(0) Interface11 arg0) {
		@Pc(2) Class245 local2 = (Class245) arg0;
		this.anInt6490 = local2.anInt7815;
		this.anInt6488 = local2.anInt7810;
		this.anIntArray367 = local2.anIntArray419;
		this.aClass245_1 = local2;
		this.anInt6465 = local2.anInt7815;
		this.anInt6489 = local2.anInt7810;
		this.aFloatArray58 = local2.aFloatArray70;
		this.method5328();
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "()V")
	@Override
	public void method6061() {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIZ)Lclient!hu;")
	@Override
	public Class21 method6104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt6490 + arg0;
		@Pc(16) int local16 = this.anInt6490 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray367[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class21_Sub2_Sub1(this, local4, arg2, arg3);
		} else {
			return new Class21_Sub2_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "(I)Z")
	public boolean method5331(@OriginalArg(0) int arg0) {
		return this.aBoolean452 || super.anInterface2_12.method4027(arg0).aBoolean476;
	}

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "()V")
	@Override
	public void method6095() {
	}

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "()Z")
	@Override
	public boolean method6091() {
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method6069(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas9 == null || this.aClass8_Sub10_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas9.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt6490 && local21.y + arg3 <= this.anInt6488 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass8_Sub10_1.method3523(local14, local21.y + arg3, local21.width, local21.x, local21.height, local21.y, local21.x + arg2);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas9.repaint();
		}
	}

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "()Z")
	@Override
	public boolean method6080() {
		return false;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!g;Z)Lclient!hu;")
	@Override
	public Class21 method6135(@OriginalArg(0) Class111 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray216;
		@Pc(5) byte[] local5 = arg0.aByteArray27;
		@Pc(8) int local8 = arg0.anInt4054;
		@Pc(11) int local11 = arg0.anInt4053;
		@Pc(76) Class21_Sub2 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray28 == null) {
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
			local76 = new Class21_Sub2_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray28;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class21_Sub2_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class21_Sub2_Sub1(this, local20, local8, local11);
			}
		}
		local76.method5778(arg0.anInt4055, arg0.anInt4050, arg0.anInt4051, arg0.anInt4052);
		return local76;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method6058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub3 local2 = (Class1_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray606;
		@Pc(8) int[] local8 = local2.anIntArray605;
		@Pc(17) int local17 = this.anInt6473 > arg7 ? this.anInt6473 : arg7;
		@Pc(32) int local32 = this.anInt6476 < arg7 + local5.length ? this.anInt6476 : arg7 + local5.length;
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
					if (local129 >= this.anInt6466 && local129 < this.anInt6484 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray367[local129 + arg1 * this.anInt6490] = arg4;
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
					if (local133 >= this.anInt6466 && local133 < this.anInt6484 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt6490;
						local248 = this.anIntArray367[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray367[local133 + arg1 * this.anInt6490] = local201 + local584;
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
		if (arg0 < this.anInt6466) {
			arg1 += local83 * (this.anInt6466 - arg0);
			arg0 = this.anInt6466;
		}
		if (arg2 >= this.anInt6484) {
			arg2 = this.anInt6484 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray367[arg0 + local129 * this.anInt6490] = arg4;
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
					local243 = arg0 + local133 * this.anInt6490;
					local248 = this.anIntArray367[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray367[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}
}
