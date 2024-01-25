import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "Z")
	private boolean aBoolean51;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
	private int anInt1043;

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "Lclient!gu;")
	private Class96 aClass96_13;

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "Lclient!va;")
	private Class1_Sub6 aClass1_Sub6_1;

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "Z")
	private boolean aBoolean52;

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
	private int anInt1044;

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "Z")
	private boolean aBoolean53;

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "Z")
	public boolean aBoolean54;

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
	public int anInt1045;

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
	private int anInt1046;

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "Z")
	public boolean aBoolean55;

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
	public int anInt1047;

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
	public int anInt1048;

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
	public int anInt1049;

	@OriginalMember(owner = "client!cj", name = "G", descriptor = "I")
	public int anInt1050;

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "I")
	public int anInt1051;

	@OriginalMember(owner = "client!cj", name = "I", descriptor = "F")
	private float aFloat9;

	@OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
	public int anInt1052;

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
	public int anInt1053;

	@OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
	public int anInt1054;

	@OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
	private int anInt1055;

	@OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
	private int anInt1056;

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
	public int anInt1057;

	@OriginalMember(owner = "client!cj", name = "P", descriptor = "Lclient!kh;")
	private final Class134 aClass134_7;

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
	public int anInt1058;

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	public int anInt1059;

	@OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
	public int anInt1060;

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
	public int anInt1061;

	@OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
	public int anInt1062;

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
	public int anInt1063;

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "I")
	public int anInt1064;

	@OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
	public int anInt1065;

	@OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
	public int anInt1066;

	@OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
	private int anInt1067;

	@OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
	public int anInt1068;

	@OriginalMember(owner = "client!cj", name = "cb", descriptor = "Lclient!gj;")
	public Class33_Sub1 aClass33_Sub1_1;

	@OriginalMember(owner = "client!cj", name = "db", descriptor = "I")
	public int anInt1069;

	@OriginalMember(owner = "client!cj", name = "eb", descriptor = "I")
	public int anInt1070;

	@OriginalMember(owner = "client!cj", name = "fb", descriptor = "Lclient!kh;")
	private final Class134 aClass134_8;

	@OriginalMember(owner = "client!cj", name = "gb", descriptor = "I")
	public int anInt1071;

	@OriginalMember(owner = "client!cj", name = "hb", descriptor = "I")
	public int anInt1072;

	@OriginalMember(owner = "client!cj", name = "ib", descriptor = "[Lclient!ps;")
	private Class196[] aClass196Array1;

	@OriginalMember(owner = "client!cj", name = "jb", descriptor = "I")
	public int anInt1073;

	@OriginalMember(owner = "client!cj", name = "kb", descriptor = "Lclient!l;")
	private Class143 aClass143_4;

	@OriginalMember(owner = "client!cj", name = "lb", descriptor = "F")
	private float lb;

	@OriginalMember(owner = "client!cj", name = "mb", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!cj", name = "nb", descriptor = "I")
	public int anInt1074;

	@OriginalMember(owner = "client!cj", name = "ob", descriptor = "Lclient!l;")
	private Class143 aClass143_5;

	@OriginalMember(owner = "client!cj", name = "pb", descriptor = "I")
	private int anInt1075;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;)V")
	public Class39_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2) {
		this(arg0, arg2);
		this.method4519(arg1);
		this.method4496(arg1);
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(ILclient!ga;)V")
	private Class39_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
		this.aBoolean51 = false;
		this.aBoolean52 = false;
		this.aClass96_13 = new Class96(4);
		this.anInt1049 = 0;
		this.anInt1047 = 512;
		this.anInt1055 = 0;
		this.anInt1056 = 3500;
		this.anInt1044 = 0;
		this.anInt1046 = 0;
		this.anInt1052 = 75518;
		this.anInt1057 = 0;
		this.anInt1062 = 45823;
		this.aBoolean54 = false;
		this.anInt1064 = 78642;
		this.anInt1058 = 0;
		this.anInt1051 = 3500;
		this.anInt1070 = 512;
		this.aBoolean53 = false;
		this.anInt1048 = 0;
		this.anInt1072 = 0;
		this.anInt1063 = 0;
		this.anInt1066 = 0;
		this.anInt1069 = this.anInt1056 - 255;
		this.anInt1071 = 50;
		this.aClass134_7 = new Class134(16);
		this.anInt1075 = -1;
		this.aClass134_8 = new Class134(20);
		this.aClass33_Sub1_1 = new Class33_Sub1();
		this.method4543(1);
		this.method4531(0);
		Static214.method4408(true, false);
		this.aBoolean51 = true;
	}

	@OriginalMember(owner = "client!cj", name = "OA", descriptor = "(IIII)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1073) {
			arg2 = this.anInt1073;
		}
		if (arg3 > this.anInt1067) {
			arg3 = this.anInt1067;
		}
		this.anInt1066 = arg0;
		this.anInt1072 = arg2;
		this.anInt1058 = arg1;
		this.anInt1049 = arg3;
		this.method1080();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!pc;Lclient!pc;FLclient!pc;)Lclient!pc;")
	@Override
	public Class16 method4545(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class16 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "()Z")
	@Override
	public boolean method4515() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "(I)I")
	public int method1074(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method2450(arg0).aShort75 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cj", name = "DA", descriptor = "(IIIIII[BII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1073;
		@Pc(35) int local35 = this.anInt1073 - arg2;
		if (arg1 + arg3 > this.anInt1049) {
			arg3 -= arg1 + arg3 - this.anInt1049;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1058) {
			local59 = this.anInt1058 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1073;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt1072) {
			local59 = arg0 + arg2 - this.anInt1072;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1066) {
			local59 = this.anInt1066 - arg0;
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
						this.anIntArray73[local30++] = arg4;
					} else {
						this.anIntArray73[local30++] = arg5;
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
					local245 = this.anIntArray73[local30];
					this.anIntArray73[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray73[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray73[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)I")
	@Override
	public int method4528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method4503(@OriginalArg(0) Class1_Sub41 arg0) {
	}

	@OriginalMember(owner = "client!cj", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1046 = this.anInt1057;
		this.anInt1048 = arg0;
		this.anInt1057 = arg1;
		this.anInt1063 = arg2;
		this.aBoolean54 = true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method4494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class133 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class133_Sub1 local2 = (Class133_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray321;
		@Pc(8) int[] local8 = local2.anIntArray320;
		@Pc(17) int local17 = this.anInt1058 > arg7 ? this.anInt1058 : arg7;
		@Pc(32) int local32 = this.anInt1049 < arg7 + local5.length ? this.anInt1049 : arg7 + local5.length;
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
					if (local129 >= this.anInt1066 && local129 < this.anInt1072 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray73[local129 + arg1 * this.anInt1073] = arg4;
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
					if (local133 >= this.anInt1066 && local133 < this.anInt1072 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1073;
						local248 = this.anIntArray73[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray73[local133 + arg1 * this.anInt1073] = local201 + local584;
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
		if (arg0 < this.anInt1066) {
			arg1 += local83 * (this.anInt1066 - arg0);
			arg0 = this.anInt1066;
		}
		if (arg2 >= this.anInt1072) {
			arg2 = this.anInt1072 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray73[arg0 + local129 * this.anInt1073] = arg4;
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
					local243 = arg0 + local133 * this.anInt1073;
					local248 = this.anIntArray73[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray73[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[Lclient!qp;)V")
	@Override
	public void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub31[] arg1) {
	}

	@OriginalMember(owner = "client!cj", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4496(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas2 = null;
			this.aClass1_Sub6_1 = null;
			if (this.aClass143_4 == null) {
				this.anIntArray73 = null;
				this.anInt1073 = this.anInt1067 = 1;
				this.method1083();
			}
			return;
		}
		@Pc(10) Class1_Sub6 local10 = (Class1_Sub6) this.aClass96_13.method2335((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas2 = arg0;
		this.aClass1_Sub6_1 = local10;
		if (this.aClass143_4 != null) {
			return;
		}
		this.anIntArray73 = local10.anIntArray169;
		this.anInt1073 = local10.anInt2079;
		this.anInt1067 = local10.anInt2078;
		this.method1083();
		return;
	}

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "(F)V")
	@Override
	public void B(@OriginalArg(0) float arg0) {
		this.anInt1052 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "(I)[I")
	private int[] method1075(@OriginalArg(0) int arg0) {
		@Pc(2) Class134 local2 = this.aClass134_8;
		@Pc(12) Class1_Sub36 local12;
		synchronized (this.aClass134_8) {
			local12 = (Class1_Sub36) this.aClass134_8.method3266((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_12.method2454(arg0)) {
					return null;
				}
				@Pc(32) Class183 local32 = super.anInterface4_12.method2450(arg0);
				@Pc(42) int local42 = local32.aBoolean331 || this.aBoolean53 ? 64 : 128;
				local12 = new Class1_Sub36(arg0, local42, super.anInterface4_12.method2452(arg0, local42, local42, 0.7F), local32.aBoolean336);
				this.aClass134_8.method3263((long) arg0, local12);
			}
		}
		local12.aBoolean394 = true;
		return local12.method4586();
	}

	@OriginalMember(owner = "client!cj", name = "ia", descriptor = "(II)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1071 = arg0;
		this.anInt1056 = arg1;
		this.anInt1069 = this.anInt1056 - 255;
		this.method1079();
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
	@Override
	public void method4521(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1043;
		for (@Pc(9) Object local9 = this.aClass134_8.method3269(); local9 != null; local9 = this.aClass134_8.method3273()) {
			@Pc(13) Class1_Sub36 local13 = (Class1_Sub36) local9;
			if (local13.aBoolean394) {
				local13.anInt5484 += local4;
				@Pc(27) int local27 = local13.anInt5484 / 20;
				if (local27 > 0) {
					@Pc(36) Class183 local36 = super.anInterface4_12.method2450(local13.anInt5485);
					local13.method4587(local36.aByte78 * local4 * 50 / 1000, local36.aByte81 * local4 * 50 / 1000);
					local13.anInt5484 -= local27 * 20;
				}
				local13.aBoolean394 = false;
			}
		}
		this.anInt1043 = arg0;
		this.aClass134_7.method3270(5);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIF)Lclient!qp;")
	@Override
	public Class1_Sub31 method4534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "()Z")
	@Override
	public boolean method4538() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return 0;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(IIIIII)Lclient!pc;")
	@Override
	public Class16 method4518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!pc;)V")
	@Override
	public void method4567(@OriginalArg(0) Class16 arg0) {
	}

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)Lclient!u;")
	@Override
	public Class1_Sub41 method4544(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class143 method4495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1073 + arg0;
		@Pc(16) int local16 = this.anInt1073 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray73[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class143_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class143_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "()V")
	@Override
	public void e() {
		this.anInt1066 = 0;
		this.anInt1058 = 0;
		this.anInt1072 = this.anInt1073;
		this.anInt1049 = this.anInt1067;
		this.method1080();
	}

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "(I)V")
	@Override
	public void method4543(@OriginalArg(0) int arg0) {
		if (this.anInt1074 == arg0) {
			return;
		}
		this.anInt1074 = arg0;
		this.aClass196Array1 = new Class196[this.anInt1074];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1074; local14++) {
			this.aClass196Array1[local14] = new Class196(this);
		}
	}

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "()V")
	@Override
	public void method4548() {
	}

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "(I)V")
	@Override
	public void p(@OriginalArg(0) int arg0) {
		this.O(0, 0, this.anInt1073, this.anInt1067, arg0, 0);
	}

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "()Z")
	@Override
	public boolean method4535() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "()Z")
	@Override
	public boolean method4568() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "JA", descriptor = "(IIIIII)Z")
	@Override
	public boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass33_Sub1_1.anInt2575 * arg0 + this.aClass33_Sub1_1.anInt2574 * arg1 + this.aClass33_Sub1_1.anInt2584 * arg2 >> 15) + this.aClass33_Sub1_1.anInt2583;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass33_Sub1_1.anInt2575 * arg3 + this.aClass33_Sub1_1.anInt2574 * arg4 + this.aClass33_Sub1_1.anInt2584 * arg5 >> 15) + this.aClass33_Sub1_1.anInt2583;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt1071 && local52 < this.anInt1071 || !(local23 <= this.anInt1056 || local52 <= this.anInt1056)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt1047 * ((this.aClass33_Sub1_1.anInt2577 * arg0 + this.aClass33_Sub1_1.anInt2582 * arg1 + this.aClass33_Sub1_1.anInt2576 * arg2 >> 15) + this.aClass33_Sub1_1.anInt2581) / local23;
		@Pc(133) int local133 = this.anInt1047 * ((this.aClass33_Sub1_1.anInt2577 * arg3 + this.aClass33_Sub1_1.anInt2582 * arg4 + this.aClass33_Sub1_1.anInt2576 * arg5 >> 15) + this.aClass33_Sub1_1.anInt2581) / local52;
		if (local104 < this.anInt1059 && local133 < this.anInt1059 || local104 > this.anInt1045 && local133 > this.anInt1045) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt1070 * ((this.aClass33_Sub1_1.anInt2580 * arg0 + this.aClass33_Sub1_1.anInt2573 * arg1 + this.aClass33_Sub1_1.anInt2579 * arg2 >> 15) + this.aClass33_Sub1_1.anInt2578) / local23;
			@Pc(209) int local209 = this.anInt1070 * ((this.aClass33_Sub1_1.anInt2580 * arg3 + this.aClass33_Sub1_1.anInt2573 * arg4 + this.aClass33_Sub1_1.anInt2579 * arg5 >> 15) + this.aClass33_Sub1_1.anInt2578) / local52;
			return (local180 >= this.anInt1068 || local209 >= this.anInt1068) && (local180 <= this.anInt1054 || local209 <= this.anInt1054);
		}
	}

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "()Lclient!c;")
	@Override
	public Class33 method4516() {
		@Pc(3) Class196 local3 = this.method1077(Thread.currentThread());
		return local3.aClass33_Sub1_3;
	}

	@OriginalMember(owner = "client!cj", name = "X", descriptor = "(III[I)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass33_Sub1_1.anInt2583 + (this.aClass33_Sub1_1.anInt2575 * arg0 + this.aClass33_Sub1_1.anInt2574 * arg1 + this.aClass33_Sub1_1.anInt2584 * arg2 >> 15);
		if (local23 < this.anInt1071 || local23 > this.anInt1056) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt1047 * (this.aClass33_Sub1_1.anInt2581 + (this.aClass33_Sub1_1.anInt2577 * arg0 + this.aClass33_Sub1_1.anInt2582 * arg1 + this.aClass33_Sub1_1.anInt2576 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt1070 * (this.aClass33_Sub1_1.anInt2578 + (this.aClass33_Sub1_1.anInt2580 * arg0 + this.aClass33_Sub1_1.anInt2573 * arg1 + this.aClass33_Sub1_1.anInt2579 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt1059 && local73 <= this.anInt1045 && local102 >= this.anInt1068 && local102 <= this.anInt1054) {
			arg3[0] = local73 - this.anInt1059;
			arg3[1] = local102 - this.anInt1068;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!cj", name = "TA", descriptor = "(IIIII)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1066 || arg0 >= this.anInt1072) {
			return;
		}
		if (arg1 < this.anInt1058) {
			arg2 -= this.anInt1058 - arg1;
			arg1 = this.anInt1058;
		}
		if (arg1 + arg2 > this.anInt1049) {
			arg2 = this.anInt1049 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1073;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray73[local40 + local54 * this.anInt1073] = arg3;
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
				local111 = local40 + local103 * this.anInt1073;
				local116 = this.anIntArray73[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray73[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1073;
				local111 = this.anIntArray73[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray73[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "()I")
	@Override
	public int w() {
		@Pc(2) int local2 = this.anInt1044;
		this.anInt1044 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "(FF)V")
	@Override
	public void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.lb = arg0;
		this.aFloat9 = arg1;
		this.method1079();
	}

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "()V")
	@Override
	public void method4565() {
	}

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "()Z")
	@Override
	public boolean method4551() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "()Z")
	@Override
	public boolean method4542() {
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)I")
	@Override
	public int method4530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	@Override
	public void method4511(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt1071;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4498(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub6 local8 = (Class1_Sub6) this.aClass96_13.method2335((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method6020();
		local8 = Static5.method137(arg0);
		this.aClass96_13.method2341((long) arg0.hashCode(), local8);
		if (this.aCanvas2 != arg0 || this.aClass143_4 != null) {
			return;
		}
		this.aClass1_Sub6_1 = local8;
		this.anIntArray73 = local8.anIntArray169;
		this.anInt1073 = local8.anInt2079;
		this.anInt1067 = local8.anInt2078;
		this.method1083();
	}

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "()V")
	@Override
	public void l() {
		this.anInt1057 = this.anInt1046;
		this.aBoolean54 = false;
	}

	@OriginalMember(owner = "client!cj", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		@Pc(2) int local2 = this.anInt1055;
		this.anInt1055 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cj", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1048 = arg0;
		this.anInt1057 = arg1;
		this.anInt1063 = arg2;
	}

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "()V")
	@Override
	public void method4524() {
	}

	@OriginalMember(owner = "client!cj", name = "A", descriptor = "()Z")
	@Override
	public boolean method4559() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "(I)[I")
	public int[] method1076(@OriginalArg(0) int arg0) {
		@Pc(2) Class134 local2 = this.aClass134_8;
		@Pc(12) Class1_Sub36 local12;
		synchronized (this.aClass134_8) {
			local12 = (Class1_Sub36) this.aClass134_8.method3266((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_12.method2454(arg0)) {
					return null;
				}
				@Pc(32) Class183 local32 = super.anInterface4_12.method2450(arg0);
				@Pc(42) int local42 = local32.aBoolean331 || this.aBoolean53 ? 64 : 128;
				local12 = new Class1_Sub36(arg0, local42, super.anInterface4_12.method2451(local42, local42, arg0, 0.7F, true), local32.aBoolean336);
				this.aClass134_8.method3263((long) arg0, local12);
			}
		}
		local12.aBoolean394 = true;
		return local12.method4586();
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4519(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub6 local8 = (Class1_Sub6) this.aClass96_13.method2335((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static5.method137(arg0);
			this.aClass96_13.method2341((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!ju;I)V")
	@Override
	public void method4497(@OriginalArg(0) Class105[] arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(2) Class4_Sub5[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class105_Sub1[] local3 = new Class105_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class105_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class105_Sub1 local26 = Static151.method2486(this, local3);
		local26.method2504(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([Lclient!t;Lclient!kp;Lclient!c;[Lclient!ju;I)V")
	@Override
	public void method4502(@OriginalArg(0) Class105[] arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class4_Sub5[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class105_Sub1[] local3 = new Class105_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class105_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class105_Sub1 local26 = Static151.method2486(this, local3);
		local26.method2504(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!ps;")
	public Class196 method1077(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1074; local1++) {
			if (this.aClass196Array1[local1].aRunnable2 == arg0) {
				return this.aClass196Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "()Z")
	@Override
	public boolean method4537() {
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(Z)V")
	@Override
	public void method4510(@OriginalArg(0) boolean arg0) {
		this.aBoolean53 = arg0;
		this.aClass134_8.method3272();
	}

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "(I)Z")
	public boolean method1078(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method2454(arg0);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!t;Lclient!kp;Lclient!c;Lclient!ju;I)V")
	@Override
	public void method4526(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class140 arg1, @OriginalArg(2) Class33 arg2, @OriginalArg(3) Class4_Sub5 arg3) {
		((Class105_Sub1) arg0).method2504(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4492(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas2 == null || this.aClass1_Sub6_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas2.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt1073 && local21.y <= this.anInt1067 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub6_1.method1795(local21.height, local21.x, local14, local21.y, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "()Z")
	@Override
	public boolean method4557() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "()I")
	@Override
	public int method4520() {
		return 0;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "()Lclient!c;")
	@Override
	public Class33 method4512() {
		return new Class33_Sub1();
	}

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "()V")
	private void method1079() {
		if (this.aFloat9 == 0.0F) {
			this.anInt1051 = this.anInt1056;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt1056;
		@Pc(12) float local12 = (float) this.anInt1071;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.lb / (this.aFloat9 + this.lb);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat9;
		this.anInt1051 = (int) (((float) this.anInt1056 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4514(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			this.method4496(null);
		}
		@Pc(15) Class1_Sub6 local15 = (Class1_Sub6) this.aClass96_13.method2335((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6020();
		}
	}

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "()V")
	@Override
	public void method4533() {
		this.aClass134_8.method3272();
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(Z)V")
	@Override
	public void method4539(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	@Override
	public void method4493(@OriginalArg(0) int arg0) {
		this.aClass196Array1[arg0].method4458(null);
	}

	@OriginalMember(owner = "client!cj", name = "x", descriptor = "()Z")
	@Override
	public boolean method4556() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "UA", descriptor = "(III)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1057 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt1057 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt1057 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt1057 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt1057 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean55 = false;
		} else {
			this.aBoolean55 = true;
		}
	}

	@OriginalMember(owner = "client!cj", name = "E", descriptor = "()V")
	private void method1080() {
		this.anInt1059 = this.anInt1066 - this.anInt1050;
		this.anInt1045 = this.anInt1072 - this.anInt1050;
		this.anInt1068 = this.anInt1058 - this.anInt1053;
		this.anInt1054 = this.anInt1049 - this.anInt1053;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1074; local29++) {
			@Pc(36) Class182 local36 = this.aClass196Array1[local29].aClass182_2;
			local36.anInt4974 = this.anInt1050 - this.anInt1066;
			local36.anInt4979 = this.anInt1053 - this.anInt1058;
			local36.anInt4978 = this.anInt1072 - this.anInt1066;
			local36.anInt4976 = this.anInt1049 - this.anInt1058;
		}
		@Pc(78) int local78 = this.anInt1058 * this.anInt1073 + this.anInt1066;
		for (@Pc(81) int local81 = this.anInt1058; local81 < this.anInt1049; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1074; local84++) {
				this.aClass196Array1[local84].aClass182_2.anIntArray432[local81 - this.anInt1058] = local78;
			}
			local78 += this.anInt1073;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class196 local3 = this.method1077(Thread.currentThread());
		@Pc(6) Class182 local6 = local3.aClass182_2;
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
		@Pc(93) int local93 = arg0 - local6.method4128();
		@Pc(98) int local98 = arg1 - local6.method4131();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt4977 = 0;
		local6.aBoolean326 = local102 < 0 || local102 > local6.anInt4978 || local106 < 0 || local106 > local6.anInt4978 || local112 < 0 || local112 > local6.anInt4978;
		local6.method4129(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean326 = local102 < 0 || local102 > local6.anInt4978 || local106 < 0 || local106 > local6.anInt4978 || local118 < 0 || local118 > local6.anInt4978;
		local6.method4129(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4506() {
		@Pc(3) Class196 local3 = this.method1077(Thread.currentThread());
		@Pc(6) Class182 local6 = local3.aClass182_2;
		local6.aBoolean328 = false;
		local6.aBoolean328 = false;
		local6.anInt4977 = 0;
		local6.aBoolean326 = true;
		local6.method4133(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean328 = true;
	}

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "(I)Z")
	public boolean method1081(@OriginalArg(0) int arg0) {
		return this.aBoolean53 || super.anInterface4_12.method2450(arg0).aBoolean331;
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(I)V")
	@Override
	public void method4531(@OriginalArg(0) int arg0) {
		this.aClass196Array1[arg0].method4458(Thread.currentThread());
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1058 || arg1 >= this.anInt1049) {
			return;
		}
		if (arg0 < this.anInt1066) {
			arg2 -= this.anInt1066 - arg0;
			arg0 = this.anInt1066;
		}
		if (arg0 + arg2 > this.anInt1072) {
			arg2 = this.anInt1072 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1073;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray73[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray73[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray73[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray73[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray73[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "()V")
	@Override
	public void method4558() {
		if (this.aCanvas2 == null || this.aClass1_Sub6_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas2.getGraphics();
			this.aClass1_Sub6_1.method1800(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!kp;)V")
	@Override
	public void method4566(@OriginalArg(0) Class140 arg0) {
		@Pc(3) Class4_Sub2 local3 = arg0.aClass232_1.aClass4_Sub2_7;
		for (@Pc(6) Class4_Sub2 local6 = local3.aClass4_Sub2_9; local6 != local3; local6 = local6.aClass4_Sub2_9) {
			@Pc(10) Class4_Sub2_Sub1 local10 = (Class4_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt6945 >> 12;
			@Pc(20) int local20 = local10.anInt6947 >> 12;
			@Pc(25) int local25 = local10.anInt6951 >> 12;
			@Pc(49) int local49 = this.aClass33_Sub1_1.anInt2583 + (this.aClass33_Sub1_1.anInt2575 * local15 + this.aClass33_Sub1_1.anInt2574 * local20 + this.aClass33_Sub1_1.anInt2584 * local25 >> 15);
			if (local49 >= this.anInt1071 && local49 <= this.anInt1069) {
				@Pc(90) int local90 = this.anInt1050 + this.anInt1047 * (this.aClass33_Sub1_1.anInt2581 + (this.aClass33_Sub1_1.anInt2577 * local15 + this.aClass33_Sub1_1.anInt2582 * local20 + this.aClass33_Sub1_1.anInt2576 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt1053 + this.anInt1070 * (this.aClass33_Sub1_1.anInt2578 + (this.aClass33_Sub1_1.anInt2580 * local15 + this.aClass33_Sub1_1.anInt2573 * local20 + this.aClass33_Sub1_1.anInt2579 * local25 >> 15)) / local49;
				if (local90 >= this.anInt1066 && local90 <= this.anInt1072 && local122 >= this.anInt1058 && local122 <= this.anInt1049) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method1085(local10, local90, local122, (local10.anInt6946 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "()Z")
	@Override
	public boolean method4505() {
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "()Z")
	public boolean method1082() {
		return this.aBoolean52;
	}

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "()V")
	@Override
	public void method4517() {
	}

	@OriginalMember(owner = "client!cj", name = "G", descriptor = "()V")
	private void method1083() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1074; local1++) {
			this.aClass196Array1[local1].method4461();
		}
		this.e();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class149 method4561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class149_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!cj", name = "da", descriptor = "([I)V")
	@Override
	public void da(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1066;
		arg0[1] = this.anInt1058;
		arg0[2] = this.anInt1072;
		arg0[3] = this.anInt1049;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4546(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!cj", name = "xa", descriptor = "()F")
	@Override
	public float xa() {
		return this.aFloat9;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class143 method4554(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class143_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class143_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class143_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class143_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "()Z")
	@Override
	public boolean method4547() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "H", descriptor = "(IIII)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1050 = arg0;
		this.anInt1053 = arg1;
		this.anInt1047 = arg2;
		this.anInt1070 = arg3;
		this.method1080();
	}

	@OriginalMember(owner = "client!cj", name = "ea", descriptor = "(Lclient!c;)V")
	@Override
	public void ea(@OriginalArg(0) Class33 arg0) {
		this.aClass33_Sub1_1 = (Class33_Sub1) arg0;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.b(arg0, arg1, arg2, arg4, arg5);
		this.b(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.TA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.TA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!cj", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1066 < arg0) {
			this.anInt1066 = arg0;
		}
		if (this.anInt1058 < arg1) {
			this.anInt1058 = arg1;
		}
		if (this.anInt1072 > arg2) {
			this.anInt1072 = arg2;
		}
		if (this.anInt1049 > arg3) {
			this.anInt1049 = arg3;
		}
		this.method1080();
	}

	@OriginalMember(owner = "client!cj", name = "v", descriptor = "()V")
	@Override
	protected void method4553() {
		if (this.aBoolean51) {
			Static236.method3583(false, true);
			this.aBoolean51 = false;
		}
		this.aClass1_Sub6_1 = null;
		this.aCanvas2 = null;
		this.aClass96_13 = null;
		this.aBoolean52 = true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface4_12.method2450(arg5).aBoolean332) {
			this.NA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt1075 != arg5) {
			@Pc(26) Class143 local26 = (Class143) this.aClass134_7.method3266((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method1075(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method1081(arg5) ? 64 : 128;
				local26 = this.method4554(local32, local43, local43, local43);
				this.aClass134_7.method3263((long) arg5, local26);
			}
			this.anInt1075 = arg5;
			this.aClass143_5 = local26;
		}
		this.aClass143_5.s(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class133 method4536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class133_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ck;III)V")
	public void method1085(@OriginalArg(0) Class4_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt6950;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.NA(arg1, arg2, local6, arg0.anInt6952, 1);
			return;
		}
		if (this.anInt1075 != local2) {
			@Pc(30) Class143 local30 = (Class143) this.aClass134_7.method3266((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method1075(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method1081(local2) ? 64 : 128;
				local30 = this.method4554(local36, local46, local46, local46);
				this.aClass134_7.method3263((long) local2, local30);
			}
			this.anInt1075 = local2;
			this.aClass143_5 = local30;
		}
		if (this.aClass143_5.j() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass143_5.s(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt6952, 1);
	}

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "(IFFFFF)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1062 = (int) (arg1 * 65535.0F);
		this.anInt1064 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1065 = (int) (arg3 * 65535.0F / local26);
		this.anInt1061 = (int) (arg4 * 65535.0F / local26);
		this.anInt1060 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!lm;[Lclient!di;Z)Lclient!la;")
	@Override
	public Class71 method4564(@OriginalArg(0) Class151 arg0, @OriginalArg(1) Class51[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1635;
			local7[local11] = arg1[local11].anInt1638;
			if (arg1[local11].aByteArray41 != null) {
			}
		}
		return new Class71_Sub1(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
	@Override
	public void method4504(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "()Z")
	@Override
	public boolean method4550() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "()F")
	@Override
	public float W() {
		return this.lb;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!di;Z)Lclient!l;")
	@Override
	public Class143 method4549(@OriginalArg(0) Class51 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray123;
		@Pc(5) byte[] local5 = arg0.aByteArray42;
		@Pc(8) int local8 = arg0.anInt1635;
		@Pc(11) int local11 = arg0.anInt1638;
		@Pc(76) Class143_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray41 == null) {
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
			local76 = new Class143_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray41;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class143_Sub1_Sub2(this, local20, local8, local11);
				local76 = new Class143_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class143_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.MA(arg0.anInt1636, arg0.anInt1639, arg0.anInt1637, arg0.anInt1640);
		return local76;
	}

	@OriginalMember(owner = "client!cj", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt1056;
	}

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "()Z")
	@Override
	public boolean method4525() {
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "(I)Z")
	public boolean method1086(@OriginalArg(0) int arg0) {
		return super.anInterface4_12.method2450(arg0).aBoolean337;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!tp;IIII)Lclient!t;")
	@Override
	public Class105 method4540(@OriginalArg(0) Class236 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class105_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cj", name = "NA", descriptor = "(IIIII)V")
	@Override
	protected void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1058) {
			local8 = this.anInt1058;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1049) {
			local21 = this.anInt1049;
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
				if (local91 < this.anInt1066) {
					local91 = this.anInt1066;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1072) {
					local102 = this.anInt1072;
				}
				local116 = local91 + local30 * this.anInt1073;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray73[local116++] = arg3;
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
				if (local91 < this.anInt1066) {
					local91 = this.anInt1066;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1072 - 1) {
					local102 = this.anInt1072 - 1;
				}
				local116 = local91 + local30 * this.anInt1073;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray73[local116++] = arg3;
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
				if (local102 < this.anInt1066) {
					local102 = this.anInt1066;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1072) {
					local116 = this.anInt1072;
				}
				local118 = local102 + local30 * this.anInt1073;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray73[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray73[local118++] = local277 + local340;
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
				if (local102 < this.anInt1066) {
					local102 = this.anInt1066;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1072 - 1) {
					local116 = this.anInt1072 - 1;
				}
				local118 = local102 + local30 * this.anInt1073;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray73[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray73[local118++] = local277 + local340;
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
				if (local91 < this.anInt1066) {
					local91 = this.anInt1066;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1072) {
					local102 = this.anInt1072;
				}
				local116 = local91 + local30 * this.anInt1073;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray73[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray73[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt1066) {
					local91 = this.anInt1066;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1072 - 1) {
					local102 = this.anInt1072 - 1;
				}
				local116 = local91 + local30 * this.anInt1073;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray73[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray73[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(IIIIII)V")
	@Override
	public void method4555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt1066) {
					arg1 += local104 * (this.anInt1066 - arg0);
					arg0 = this.anInt1066;
				}
				if (arg2 >= this.anInt1072) {
					arg2 = this.anInt1072 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1058 && local150 < this.anInt1049) {
							this.anIntArray73[arg0 + local150 * this.anInt1073] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1058 && local213 < this.anInt1049) {
							local228 = arg0 + local213 * this.anInt1073;
							local233 = this.anIntArray73[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray73[local228] = local204 + local233;
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
				if (arg1 < this.anInt1058) {
					arg0 += local104 * (this.anInt1058 - arg1);
					arg1 = this.anInt1058;
				}
				if (arg3 >= this.anInt1049) {
					arg3 = this.anInt1049 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1066 && local150 < this.anInt1072) {
							this.anIntArray73[local150 + arg1 * this.anInt1073] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1066 && local213 < this.anInt1072) {
							local228 = local213 + arg1 * this.anInt1073;
							local233 = this.anIntArray73[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray73[local213 + arg1 * this.anInt1073] = local204 + local516;
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

	@OriginalMember(owner = "client!cj", name = "F", descriptor = "(IIII)[I")
	@Override
	public int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt1073 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray73[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "()Z")
	@Override
	public boolean method4552() {
		return false;
	}

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "(IIIIII)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1066) {
			arg2 -= this.anInt1066 - arg0;
			arg0 = this.anInt1066;
		}
		if (arg1 < this.anInt1058) {
			arg3 -= this.anInt1058 - arg1;
			arg1 = this.anInt1058;
		}
		if (arg0 + arg2 > this.anInt1072) {
			arg2 = this.anInt1072 - arg0;
		}
		if (arg1 + arg3 > this.anInt1049) {
			arg3 = this.anInt1049 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1072 || arg1 > this.anInt1049) {
			return;
		}
		@Pc(67) int local67 = this.anInt1073 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1073;
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
						local221 = this.anIntArray73[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray73[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray73[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray73[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray73[arg2] = arg4;
					arg2++;
					this.anIntArray73[arg2] = arg4;
					arg2++;
					this.anIntArray73[arg2] = arg4;
					arg2++;
					this.anIntArray73[arg2] = arg4;
					arg2++;
					this.anIntArray73[arg2] = arg4;
					arg2++;
					this.anIntArray73[arg2] = arg4;
					arg2++;
					this.anIntArray73[arg2] = arg4;
					arg2++;
					this.anIntArray73[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray73[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!cj", name = "ca", descriptor = "(ILclient!ma;II)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class133 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class133_Sub1 local2 = (Class133_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray321;
		@Pc(8) int[] local8 = local2.anIntArray320;
		@Pc(20) int local20;
		if (this.anInt1049 < arg3 + local5.length) {
			local20 = this.anInt1049 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1058 > arg3) {
			local33 = this.anInt1058 - arg3;
			arg3 = this.anInt1058;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt1073;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1066 > local58) {
				local62 -= this.anInt1066 - local58;
				local58 = this.anInt1066;
			}
			if (this.anInt1072 < local58 + local62) {
				local62 = this.anInt1072 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray73[local58++] = arg0;
			}
			local49 += this.anInt1073;
		}
	}
}
