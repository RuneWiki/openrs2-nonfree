import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bs")
public final class Class33_Sub1 extends Class33 {

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas2;

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "Lclient!nda;")
	public Class4_Sub12 aClass4_Sub12_1;

	@OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
	private int anInt1152;

	@OriginalMember(owner = "client!bs", name = "D", descriptor = "I")
	private int anInt1153;

	@OriginalMember(owner = "client!bs", name = "E", descriptor = "[F")
	public float[] aFloatArray1;

	@OriginalMember(owner = "client!bs", name = "F", descriptor = "I")
	public int anInt1154;

	@OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
	public int anInt1155;

	@OriginalMember(owner = "client!bs", name = "H", descriptor = "[Lclient!eu;")
	private Class101[] aClass101Array1;

	@OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
	private int anInt1157;

	@OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
	public int anInt1158;

	@OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
	public int anInt1159;

	@OriginalMember(owner = "client!bs", name = "N", descriptor = "I")
	public int anInt1160;

	@OriginalMember(owner = "client!bs", name = "P", descriptor = "I")
	private int anInt1161;

	@OriginalMember(owner = "client!bs", name = "T", descriptor = "I")
	private int anInt1163;

	@OriginalMember(owner = "client!bs", name = "V", descriptor = "I")
	private int anInt1165;

	@OriginalMember(owner = "client!bs", name = "W", descriptor = "I")
	public int anInt1166;

	@OriginalMember(owner = "client!bs", name = "Y", descriptor = "I")
	public int anInt1168;

	@OriginalMember(owner = "client!bs", name = "Z", descriptor = "[F")
	public float[] aFloatArray2;

	@OriginalMember(owner = "client!bs", name = "db", descriptor = "Lclient!rj;")
	private Class316 aClass316_1;

	@OriginalMember(owner = "client!bs", name = "gb", descriptor = "I")
	public int anInt1174;

	@OriginalMember(owner = "client!bs", name = "ib", descriptor = "I")
	public int anInt1175;

	@OriginalMember(owner = "client!bs", name = "jb", descriptor = "[I")
	public int[] anIntArray76;

	@OriginalMember(owner = "client!bs", name = "kb", descriptor = "I")
	public int anInt1176;

	@OriginalMember(owner = "client!bs", name = "mb", descriptor = "I")
	public int anInt1177;

	@OriginalMember(owner = "client!bs", name = "nb", descriptor = "I")
	private int anInt1178;

	@OriginalMember(owner = "client!bs", name = "sb", descriptor = "Lclient!tf;")
	private Class17 aClass17_6;

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "Z")
	private boolean aBoolean79;

	@OriginalMember(owner = "client!bs", name = "C", descriptor = "Z")
	private boolean aBoolean80;

	@OriginalMember(owner = "client!bs", name = "A", descriptor = "Lclient!dj;")
	private Class66 aClass66_7;

	@OriginalMember(owner = "client!bs", name = "U", descriptor = "I")
	public int anInt1164;

	@OriginalMember(owner = "client!bs", name = "X", descriptor = "I")
	public int anInt1167;

	@OriginalMember(owner = "client!bs", name = "cb", descriptor = "I")
	public int anInt1171;

	@OriginalMember(owner = "client!bs", name = "S", descriptor = "Z")
	private boolean aBoolean81;

	@OriginalMember(owner = "client!bs", name = "eb", descriptor = "I")
	public int anInt1172;

	@OriginalMember(owner = "client!bs", name = "bb", descriptor = "I")
	public int anInt1170;

	@OriginalMember(owner = "client!bs", name = "fb", descriptor = "I")
	public int anInt1173;

	@OriginalMember(owner = "client!bs", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!bs", name = "J", descriptor = "I")
	public int anInt1156;

	@OriginalMember(owner = "client!bs", name = "R", descriptor = "I")
	public int anInt1162;

	@OriginalMember(owner = "client!bs", name = "pb", descriptor = "I")
	private int anInt1180;

	@OriginalMember(owner = "client!bs", name = "ob", descriptor = "I")
	private int anInt1179;

	@OriginalMember(owner = "client!bs", name = "qb", descriptor = "I")
	public int anInt1181;

	@OriginalMember(owner = "client!bs", name = "rb", descriptor = "I")
	public int anInt1182;

	@OriginalMember(owner = "client!bs", name = "ab", descriptor = "I")
	public int anInt1169;

	@OriginalMember(owner = "client!bs", name = "I", descriptor = "Lclient!tja;")
	private final Class352 aClass352_7;

	@OriginalMember(owner = "client!bs", name = "tb", descriptor = "I")
	private int anInt1183;

	@OriginalMember(owner = "client!bs", name = "Q", descriptor = "Lclient!tja;")
	private final Class352 aClass352_8;

	@OriginalMember(owner = "client!bs", name = "hb", descriptor = "Lclient!il;")
	public Class92_Sub3 aClass92_Sub3_1;

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "I")
	private int anInt1151;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!d;)V")
	private Class33_Sub1(@OriginalArg(0) Interface9 arg0) {
		super(arg0);
		this.aBoolean79 = false;
		this.aBoolean80 = false;
		this.aClass66_7 = new Class66(4);
		this.anInt1164 = 50;
		this.anInt1167 = 512;
		this.anInt1171 = 0;
		this.aBoolean81 = false;
		this.anInt1172 = 0;
		this.anInt1170 = 78642;
		this.anInt1173 = 3500;
		this.lb = 512;
		this.anInt1156 = 128;
		this.anInt1162 = 45823;
		this.anInt1180 = 0;
		this.anInt1179 = 0;
		this.anInt1181 = 0;
		this.anInt1182 = 0;
		this.anInt1169 = 75518;
		this.aClass352_7 = new Class352(16);
		this.anInt1183 = -1;
		try {
			this.aClass352_8 = new Class352(256);
			this.aClass92_Sub3_1 = new Class92_Sub3();
			this.method8111(1);
			this.method8109(0);
			Static650.method8679(true, true);
			this.aBoolean79 = true;
			this.anInt1151 = (int) Static429.method5935();
		} catch (@Pc(99) Throwable local99) {
			local99.printStackTrace();
			this.method8070();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!d;II)V")
	public Class33_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this(arg1);
		try {
			this.method8144(arg0, arg2, arg3);
			this.method8132(arg0);
		} catch (@Pc(12) Throwable local12) {
			local12.printStackTrace();
			this.method8070();
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIZ)Lclient!tf;")
	@Override
	public Class17 method8151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1160 + arg0;
		@Pc(16) int local16 = this.anInt1160 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray76[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class17_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class17_Sub1_Sub3(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(II)I")
	@Override
	public int method8124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!bs", name = "da", descriptor = "(III[I)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass92_Sub3_1.aFloat103 + this.aClass92_Sub3_1.aFloat92 * (float) arg0 + this.aClass92_Sub3_1.aFloat93 * (float) arg1 + this.aClass92_Sub3_1.aFloat100 * (float) arg2;
		if (local24 < (float) this.anInt1164 || local24 > (float) this.anInt1173) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.lb * (this.aClass92_Sub3_1.aFloat91 + this.aClass92_Sub3_1.aFloat96 * (float) arg0 + this.aClass92_Sub3_1.aFloat94 * (float) arg1 + this.aClass92_Sub3_1.aFloat95 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt1167 * (this.aClass92_Sub3_1.aFloat102 + this.aClass92_Sub3_1.aFloat101 * (float) arg0 + this.aClass92_Sub3_1.aFloat97 * (float) arg1 + this.aClass92_Sub3_1.aFloat98 * (float) arg2) / local24);
		if (local81 >= this.anInt1177 && local81 <= this.anInt1155 && local113 >= this.anInt1175 && local113 <= this.anInt1159) {
			arg3[0] = local81 - this.anInt1177;
			arg3[1] = local113 - this.anInt1175;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "(II)V")
	@Override
	public void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class101 local3 = this.method1217(Thread.currentThread());
		this.anInt1164 = arg0;
		this.anInt1173 = arg1;
		local3.anInt2572 = this.anInt1173 - 255;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)Lclient!za;")
	@Override
	public Class4_Sub13 method8088(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!sea;Lclient!up;)Lclient!nm;")
	@Override
	public Interface18 method8119(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface23 arg1) {
		return new Class316(this, (Class17) arg0, (Class354) arg1);
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)Z")
	public boolean method1210(@OriginalArg(0) int arg0) {
		return super.anInterface9_12.method1557(arg0);
	}

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "()Z")
	@Override
	public boolean method8146() {
		return true;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIIIIIIII)V")
	@Override
	public void method8067() {
		@Pc(3) Class101 local3 = this.method1217(Thread.currentThread());
		@Pc(6) Class77 local6 = local3.aClass77_1;
		local6.aBoolean144 = false;
		@Pc(14) int local14 = 5 - this.anInt1177;
		@Pc(19) int local19 = 75 - this.anInt1177;
		@Pc(24) int local24 = 15 - this.anInt1177;
		@Pc(29) int local29 = 10 - this.anInt1175;
		@Pc(34) int local34 = 50 - this.anInt1175;
		@Pc(39) int local39 = 90 - this.anInt1175;
		local6.aBoolean145 = local14 < 0 || local14 > local6.anInt2160 || local19 < 0 || local19 > local6.anInt2160 || local24 < 0 || local24 > local6.anInt2160;
		local6.anInt2157 = 0;
		local6.aBoolean143 = false;
		local6.method2102((float) local29, (float) local34, (float) local39, (float) local14, (float) local19, (float) local24, (float) 100, (float) 100, (float) 100, -65536, -65536, -65536);
		local6.aBoolean144 = true;
	}

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "(IIIIII)V")
	@Override
	public void method8142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.U(arg0, arg1, arg2, arg4, arg5);
		this.U(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.P(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.P(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!nh;)V")
	@Override
	public void method8133(@OriginalArg(0) Class92 arg0) {
		this.aClass92_Sub3_1 = (Class92_Sub3) arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIF)Lclient!kp;")
	@Override
	public Class4_Sub29 method8075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!so;IIII)Lclient!ka;")
	@Override
	public Class62 method8072(@OriginalArg(0) Class334 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class62_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "()V")
	private void method1211() {
		this.anInt1177 = this.anInt1182 - this.anInt1176;
		this.anInt1155 = this.anInt1181 - this.anInt1176;
		this.anInt1175 = this.anInt1171 - this.anInt1158;
		this.anInt1159 = this.anInt1172 - this.anInt1158;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1166; local29++) {
			@Pc(36) Class77 local36 = this.aClass101Array1[local29].aClass77_1;
			local36.anInt2161 = this.anInt1176 - this.anInt1182;
			local36.anInt2158 = this.anInt1158 - this.anInt1171;
			local36.anInt2160 = this.anInt1181 - this.anInt1182;
			local36.anInt2159 = this.anInt1172 - this.anInt1171;
		}
		@Pc(78) int local78 = this.anInt1171 * this.anInt1160 + this.anInt1182;
		for (@Pc(81) int local81 = this.anInt1171; local81 < this.anInt1172; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1166; local84++) {
				this.aClass101Array1[local84].aClass77_1.anIntArray144[local81 - this.anInt1171] = local78;
			}
			local78 += this.anInt1160;
		}
	}

	@OriginalMember(owner = "client!bs", name = "H", descriptor = "(III[I)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass92_Sub3_1.aFloat103 + this.aClass92_Sub3_1.aFloat92 * (float) arg0 + this.aClass92_Sub3_1.aFloat93 * (float) arg1 + this.aClass92_Sub3_1.aFloat100 * (float) arg2;
		if (local24 == 0.0F) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = (int) ((float) this.lb * (this.aClass92_Sub3_1.aFloat91 + this.aClass92_Sub3_1.aFloat96 * (float) arg0 + this.aClass92_Sub3_1.aFloat94 * (float) arg1 + this.aClass92_Sub3_1.aFloat95 * (float) arg2) / local24);
		@Pc(105) int local105 = (int) ((float) this.anInt1167 * (this.aClass92_Sub3_1.aFloat102 + this.aClass92_Sub3_1.aFloat101 * (float) arg0 + this.aClass92_Sub3_1.aFloat97 * (float) arg1 + this.aClass92_Sub3_1.aFloat98 * (float) arg2) / local24);
		arg3[0] = local73 - this.anInt1177;
		arg3[1] = local105 - this.anInt1175;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIILclient!aa;IIIII)V")
	@Override
	public void method8125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray238;
		@Pc(8) int[] local8 = local2.anIntArray237;
		@Pc(17) int local17 = this.anInt1171 > arg7 ? this.anInt1171 : arg7;
		@Pc(32) int local32 = this.anInt1172 < arg7 + local5.length ? this.anInt1172 : arg7 + local5.length;
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
					if (arg1 >= local17 && arg1 < local32 && local172 >= this.anInt1182 && local172 < this.anInt1181 && arg10 < local40 && local172 >= arg6 + local5[local176] && local172 < arg6 + local5[local176] + local8[local176]) {
						this.anIntArray76[local172 + arg1 * this.anInt1160] = arg4;
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
					if (arg1 >= local17 && arg1 < local32 && local176 >= this.anInt1182 && local176 < this.anInt1181 && arg10 < local40 && local176 >= arg6 + local5[local199] && local176 < arg6 + local5[local199] + local8[local199]) {
						local299 = local176 + arg1 * this.anInt1160;
						local316 = this.anIntArray76[local299];
						@Pc(707) int local707 = ((local316 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local316 & 0xFF00) * local172 >> 8 & 0xFF00);
						this.anIntArray76[local176 + arg1 * this.anInt1160] = local263 + local707;
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
				if (arg0 >= this.anInt1182 && arg0 < this.anInt1181 && local172 >= local17 && local172 < local32 && arg10 < local40) {
					local199 = arg6 + local5[local176];
					if (arg0 >= local199 && arg0 < local199 + local8[local176]) {
						this.anIntArray76[arg0 + local172 * this.anInt1160] = arg4;
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
			if (arg0 >= this.anInt1182 && arg0 < this.anInt1181 && local176 >= local17 && local176 < local32 && arg10 < local40) {
				local299 = arg6 + local5[local199];
				if (arg0 >= local299 && arg0 < local299 + local8[local199]) {
					local316 = arg0 + local176 * this.anInt1160;
					@Pc(321) int local321 = this.anIntArray76[local316];
					@Pc(341) int local341 = ((local321 & 0xFF00FF) * local172 >> 8 & 0xFF00FF) + ((local321 & 0xFF00) * local172 >> 8 & 0xFF00);
					this.anIntArray76[local316] = local263 + local341;
				}
			}
			arg1 += local77;
			arg0++;
			local36 = arg10 + local159;
			arg10 = local36 % local48;
		}
	}

	@OriginalMember(owner = "client!bs", name = "B", descriptor = "()V")
	private void method1212() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1166; local1++) {
			this.aClass101Array1[local1].method2473();
		}
		this.la();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIILclient!aa;II)V")
	@Override
	public void method8123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray238;
		@Pc(8) int[] local8 = local2.anIntArray237;
		@Pc(17) int local17 = this.anInt1171 > arg7 ? this.anInt1171 : arg7;
		@Pc(32) int local32 = this.anInt1172 < arg7 + local5.length ? this.anInt1172 : arg7 + local5.length;
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
					if (local129 >= this.anInt1182 && local129 < this.anInt1181 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray76[local129 + arg1 * this.anInt1160] = arg4;
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
					if (local133 >= this.anInt1182 && local133 < this.anInt1181 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1160;
						local248 = this.anIntArray76[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray76[local133 + arg1 * this.anInt1160] = local201 + local584;
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
		if (arg0 < this.anInt1182) {
			arg1 += local83 * (this.anInt1182 - arg0);
			arg0 = this.anInt1182;
		}
		if (arg2 >= this.anInt1181) {
			arg2 = this.anInt1181 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray76[arg0 + local129 * this.anInt1160] = arg4;
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
					local243 = arg0 + local133 * this.anInt1160;
					local248 = this.anIntArray76[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray76[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!bs", name = "T", descriptor = "(IIII)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1182 < arg0) {
			this.anInt1182 = arg0;
		}
		if (this.anInt1171 < arg1) {
			this.anInt1171 = arg1;
		}
		if (this.anInt1181 > arg2) {
			this.anInt1181 = arg2;
		}
		if (this.anInt1172 > arg3) {
			this.anInt1172 = arg3;
		}
		this.method1211();
	}

	@OriginalMember(owner = "client!bs", name = "P", descriptor = "(IIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1182 || arg0 >= this.anInt1181) {
			return;
		}
		if (arg1 < this.anInt1171) {
			arg2 -= this.anInt1171 - arg1;
			arg1 = this.anInt1171;
		}
		if (arg1 + arg2 > this.anInt1172) {
			arg2 = this.anInt1172 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1160;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray76[local40 + local54 * this.anInt1160] = arg3;
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
				local111 = local40 + local103 * this.anInt1160;
				local116 = this.anIntArray76[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray76[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1160;
				local111 = this.anIntArray76[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray76[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V")
	@Override
	public void method8111(@OriginalArg(0) int arg0) {
		this.anInt1166 = arg0;
		this.aClass101Array1 = new Class101[this.anInt1166];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1166; local9++) {
			this.aClass101Array1[local9] = new Class101(this);
		}
	}

	@OriginalMember(owner = "client!bs", name = "aa", descriptor = "(IIIIII)V")
	@Override
	public void aa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1182) {
			arg2 -= this.anInt1182 - arg0;
			arg0 = this.anInt1182;
		}
		if (arg1 < this.anInt1171) {
			arg3 -= this.anInt1171 - arg1;
			arg1 = this.anInt1171;
		}
		if (arg0 + arg2 > this.anInt1181) {
			arg2 = this.anInt1181 - arg0;
		}
		if (arg1 + arg3 > this.anInt1172) {
			arg3 = this.anInt1172 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1181 || arg1 > this.anInt1172) {
			return;
		}
		@Pc(67) int local67 = this.anInt1160 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1160;
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
						local217 = this.anIntArray76[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray76[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray76[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray76[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray76[arg2] = arg4;
					arg2++;
					this.anIntArray76[arg2] = arg4;
					arg2++;
					this.anIntArray76[arg2] = arg4;
					arg2++;
					this.anIntArray76[arg2] = arg4;
					arg2++;
					this.anIntArray76[arg2] = arg4;
					arg2++;
					this.anIntArray76[arg2] = arg4;
					arg2++;
					this.anIntArray76[arg2] = arg4;
					arg2++;
					this.anIntArray76[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray76[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!bs", name = "F", descriptor = "(II)V")
	@Override
	public void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt1160 + arg0;
		@Pc(13) int local13 = arg1 * this.anInt1163 + arg0;
		if (local6 == 0 && local13 == 0) {
			return;
		}
		@Pc(21) int[] local21 = this.anIntArray76;
		@Pc(24) float[] local24 = this.aFloatArray2;
		@Pc(31) int local31;
		if (local6 < 0) {
			local31 = local21.length + local6;
			Static685.method6466(local21, -local6, local21, 0, local31);
		} else if (local6 > 0) {
			local31 = local21.length - local6;
			Static685.method6466(local21, 0, local21, local6, local31);
		}
		if (local13 < 0) {
			local31 = local24.length + local13;
			Static685.method6463(local24, -local13, local24, 0, local31);
		} else if (local13 > 0) {
			local31 = local24.length - local13;
			Static685.method6463(local24, 0, local24, local13, local31);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Lclient!sea;")
	@Override
	public Interface21 method8084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method8145(arg0, arg1, false);
	}

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "()Z")
	@Override
	public boolean method8127() {
		return true;
	}

	@OriginalMember(owner = "client!bs", name = "C", descriptor = "()Z")
	public boolean method1213() {
		return this.aBoolean80;
	}

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method8076() {
		return this.aClass92_Sub3_1;
	}

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "()Z")
	@Override
	public boolean method8107() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([IIIIIZ)Lclient!tf;")
	@Override
	public Class17 method8156(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class17_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class17_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4);
				}
			}
		}
		return local1 ? new Class17_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3, arg4) : new Class17_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8110(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas2 == arg0) {
			this.method8132((Canvas) null);
		}
		@Pc(15) Class4_Sub12 local15 = (Class4_Sub12) this.aClass66_7.method1994((long) arg0.hashCode());
		if (local15 != null) {
			local15.method9000();
		}
	}

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "()Z")
	@Override
	public boolean method8135() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "I", descriptor = "()I")
	@Override
	public int I() {
		@Pc(2) int local2 = this.anInt1180;
		this.anInt1180 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "()Z")
	@Override
	public boolean method8108() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "M", descriptor = "()I")
	@Override
	public int M() {
		@Pc(2) int local2 = this.anInt1179;
		this.anInt1179 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "()V")
	@Override
	public void method8134() {
		if (this.aCanvas2 == null) {
			this.anInt1160 = 1;
			this.anInt1165 = 1;
			this.anIntArray76 = null;
			this.anInt1163 = 1;
			this.anInt1178 = 1;
			this.aFloatArray2 = null;
		} else {
			this.anIntArray76 = this.aClass4_Sub12_1.anIntArray710;
			this.anInt1160 = this.aClass4_Sub12_1.anInt10264;
			this.anInt1165 = this.aClass4_Sub12_1.anInt10265;
			this.aFloatArray2 = this.aFloatArray1;
			this.anInt1163 = this.anInt1161;
			this.anInt1178 = this.anInt1157;
		}
		this.aClass316_1 = null;
		this.method1212();
	}

	@OriginalMember(owner = "client!bs", name = "DA", descriptor = "(IIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1176 = arg0;
		this.anInt1158 = arg1;
		this.lb = arg2;
		this.anInt1167 = arg3;
		this.method1211();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method8116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		arg2 -= arg0;
		arg3 -= arg1;
		@Pc(28) int local28;
		@Pc(32) int local32;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.method1215(arg0, arg1, arg2 + 1, arg4, arg5, arg6, arg7);
			} else {
				local28 = arg5 + arg6;
				local32 = arg7 % local28;
				local32 = local28 + arg5 - local32 - (-arg2 + 1) % local28;
				arg7 = local32 % local28;
				if (arg7 < 0) {
					arg7 += local28;
				}
				this.method1215(arg0 + arg2, arg1, 1 - arg2, arg4, arg5, arg6, arg7);
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
						if (arg0 >= this.anInt1182 && arg0 < this.anInt1181 && local267 >= this.anInt1171 && local267 < this.anInt1172 && arg7 < local143) {
							this.anIntArray76[arg0 + local267 * this.anInt1160] = arg4;
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
						if (arg0 >= this.anInt1182 && arg0 < this.anInt1181 && local349 >= this.anInt1171 && local349 < this.anInt1172 && arg7 < local143) {
							local375 = arg0 + local349 * this.anInt1160;
							local380 = this.anIntArray76[local375];
							local380 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray76[local375] = local340 + local380;
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
						if (arg1 >= this.anInt1171 && arg1 < this.anInt1172 && local267 >= this.anInt1182 && local267 < this.anInt1181 && arg7 < local143) {
							this.anIntArray76[local267 + arg1 * this.anInt1160] = arg4;
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
						if (arg1 >= this.anInt1171 && arg1 < this.anInt1172 && local349 >= this.anInt1182 && local349 < this.anInt1181 && arg7 < local143) {
							local375 = local349 + arg1 * this.anInt1160;
							local380 = this.anIntArray76[local375];
							@Pc(708) int local708 = ((local380 & 0xFF00FF) * local267 >> 8 & 0xFF00FF) + ((local380 & 0xFF00) * local267 >> 8 & 0xFF00);
							this.anIntArray76[local349 + arg1 * this.anInt1160] = local340 + local708;
						}
						arg0 += local172;
						arg1++;
						local32 = arg7 + local254;
						arg7 = local32 % local28;
					}
				}
			}
		} else if (arg3 >= 0) {
			this.method1220(arg0, arg1, arg3 + 1, arg4, arg5, arg6, arg7);
		} else {
			local28 = arg5 + arg6;
			local32 = arg7 % local28;
			local32 = local28 + arg5 - local32 - (-arg3 + 1) % local28;
			arg7 = local32 % local28;
			if (arg7 < 0) {
				arg7 += local28;
			}
			this.method1220(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5, arg6, arg7);
		}
	}

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "(IIIIII)V")
	private void method1214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg1 - arg3;
		if (local8 < this.anInt1171) {
			local8 = this.anInt1171;
		}
		@Pc(21) int local21 = arg1 + arg3 + 1;
		if (local21 > this.anInt1172) {
			local21 = this.anInt1172;
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
				if (local91 < this.anInt1182) {
					local91 = this.anInt1182;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1181) {
					local102 = this.anInt1181;
				}
				local116 = local91 + local30 * this.anInt1160;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						this.anIntArray76[local116] = arg4;
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
				if (local91 < this.anInt1182) {
					local91 = this.anInt1182;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1181 - 1) {
					local102 = this.anInt1181 - 1;
				}
				local116 = local91 + local30 * this.anInt1160;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						this.anIntArray76[local116] = arg4;
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
				if (local102 < this.anInt1182) {
					local102 = this.anInt1182;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1181) {
					local116 = this.anInt1181;
				}
				local118 = local102 + local30 * this.anInt1160;
				for (local350 = local102; local350 < local116; local350++) {
					if ((float) arg2 < this.aFloatArray2[local118]) {
						local364 = this.anIntArray76[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray76[local118] = local293 + local364;
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
				if (local102 < this.anInt1182) {
					local102 = this.anInt1182;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1181 - 1) {
					local116 = this.anInt1181 - 1;
				}
				local118 = local102 + local30 * this.anInt1160;
				for (local350 = local102; local350 <= local116; local350++) {
					if ((float) arg2 < this.aFloatArray2[local118]) {
						local364 = this.anIntArray76[local118];
						local364 = ((local364 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local364 & 0xFF00) * local91 >> 8 & 0xFF00);
						this.anIntArray76[local118] = local293 + local364;
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
				if (local91 < this.anInt1182) {
					local91 = this.anInt1182;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1181) {
					local102 = this.anInt1181;
				}
				local116 = local91 + local30 * this.anInt1160;
				for (local118 = local91; local118 < local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						local350 = this.anIntArray76[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(643) int local643 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray76[local116] = local364 - local643 | local643 - (local643 >>> 8);
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
				if (local91 < this.anInt1182) {
					local91 = this.anInt1182;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1181 - 1) {
					local102 = this.anInt1181 - 1;
				}
				local116 = local91 + local30 * this.anInt1160;
				for (local118 = local91; local118 <= local102; local118++) {
					if ((float) arg2 < this.aFloatArray2[local116]) {
						local350 = this.anIntArray76[local116];
						local364 = arg4 + local350;
						local633 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local633 & 0x1000100) + (local364 - local633 & 0x10000);
						this.anIntArray76[local116] = local364 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[[I[[IIII)Lclient!s;")
	@Override
	public Class42 method8068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class42_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method8132(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas2 = null;
			this.aClass4_Sub12_1 = null;
			if (this.aClass316_1 == null) {
				this.anIntArray76 = null;
				this.anInt1160 = this.anInt1165 = 1;
				this.anInt1163 = this.anInt1178 = 1;
				this.method1212();
			}
			return;
		}
		@Pc(10) Class4_Sub12 local10 = (Class4_Sub12) this.aClass66_7.method1994((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas2 = arg0;
		@Pc(18) Dimension local18 = arg0.getSize();
		this.anInt1152 = local18.width;
		this.anInt1153 = local18.height;
		this.aClass4_Sub12_1 = local10;
		if (this.aClass316_1 != null) {
			return;
		}
		this.anIntArray76 = local10.anIntArray710;
		this.anInt1160 = local10.anInt10264;
		this.anInt1165 = local10.anInt10265;
		if (this.anInt1160 != this.anInt1163 || this.anInt1165 != this.anInt1178) {
			this.anInt1161 = this.anInt1163 = this.anInt1160;
			this.anInt1157 = this.anInt1178 = this.anInt1165;
			this.aFloatArray1 = this.aFloatArray2 = new float[this.anInt1163 * this.anInt1178];
		}
		this.method1212();
		return;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I[Lclient!kp;)V")
	@Override
	public void method8090(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub29[] arg1) {
	}

	@OriginalMember(owner = "client!bs", name = "K", descriptor = "([I)V")
	@Override
	public void K(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1182;
		arg0[1] = this.anInt1171;
		arg0[2] = this.anInt1181;
		arg0[3] = this.anInt1172;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIII)V")
	private void method1215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < this.anInt1171 || arg1 >= this.anInt1172) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt1160;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg0 + local37 >= this.anInt1182 && arg0 + local37 < this.anInt1181 && local27 < arg4) {
					this.anIntArray76[local15 + local37] = arg3;
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
			if (arg0 + local103 >= this.anInt1182 && arg0 + local103 < this.anInt1181 && local27 < arg4) {
				@Pc(126) int local126 = this.anIntArray76[local15 + local103];
				@Pc(146) int local146 = ((local126 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local126 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray76[local15 + local103] = local97 + local146;
			}
			local103++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "()V")
	@Override
	public void method8153() {
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(IIIIII)Lclient!jia;")
	@Override
	public Class68 method8112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "()Z")
	@Override
	public boolean method8136() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method8118() {
		return new Class92_Sub3();
	}

	@OriginalMember(owner = "client!bs", name = "EA", descriptor = "(IIII)V")
	@Override
	public void EA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class101 local3 = this.method1217(Thread.currentThread());
		local3.anInt2573 = arg0;
		local3.anInt2575 = arg1;
		local3.anInt2578 = arg2;
	}

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "(I)[I")
	public int[] method1216(@OriginalArg(0) int arg0) {
		@Pc(2) Class352 local2 = this.aClass352_8;
		@Pc(14) Class4_Sub38 local14;
		synchronized (this.aClass352_8) {
			local14 = (Class4_Sub38) this.aClass352_8.method7653((long) arg0 | Long.MIN_VALUE);
			if (local14 == null) {
				if (!super.anInterface9_12.method1557(arg0)) {
					return null;
				}
				@Pc(34) Class130 local34 = super.anInterface9_12.method1558(arg0);
				@Pc(45) int local45 = local34.aBoolean236 || this.aBoolean81 ? 64 : this.anInt1156;
				local14 = new Class4_Sub38(arg0, local45, super.anInterface9_12.method1559(arg0, local45, local45, 0.7F), local34.anInt3119 != 1);
				this.aClass352_8.method7655((long) arg0 | Long.MIN_VALUE, local14);
			}
		}
		local14.aBoolean533 = true;
		return local14.method6061();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!eu;")
	public Class101 method1217(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1166; local1++) {
			if (this.aClass101Array1[local1].aRunnable2 == arg0) {
				return this.aClass101Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(FFF)V")
	@Override
	public void method8106(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!bs", name = "HA", descriptor = "(IIII[I)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		@Pc(24) float local24 = this.aClass92_Sub3_1.aFloat103 + this.aClass92_Sub3_1.aFloat92 * (float) arg0 + this.aClass92_Sub3_1.aFloat93 * (float) arg1 + this.aClass92_Sub3_1.aFloat100 * (float) arg2;
		if (local24 < (float) this.anInt1164 || local24 > (float) this.anInt1173) {
			arg4[0] = arg4[1] = arg4[2] = -1;
			return;
		}
		@Pc(82) int local82 = (int) ((float) this.lb * (this.aClass92_Sub3_1.aFloat91 + this.aClass92_Sub3_1.aFloat96 * (float) arg0 + this.aClass92_Sub3_1.aFloat94 * (float) arg1 + this.aClass92_Sub3_1.aFloat95 * (float) arg2) / (float) arg3);
		@Pc(115) int local115 = (int) ((float) this.anInt1167 * (this.aClass92_Sub3_1.aFloat102 + this.aClass92_Sub3_1.aFloat101 * (float) arg0 + this.aClass92_Sub3_1.aFloat97 * (float) arg1 + this.aClass92_Sub3_1.aFloat98 * (float) arg2) / (float) arg3);
		if (local82 >= this.anInt1177 && local82 <= this.anInt1155 && local115 >= this.anInt1175 && local115 <= this.anInt1159) {
			arg4[0] = local82 - this.anInt1177;
			arg4[1] = local115 - this.anInt1175;
			arg4[2] = (int) local24;
		} else {
			arg4[0] = arg4[1] = arg4[2] = -1;
		}
	}

	@OriginalMember(owner = "client!bs", name = "za", descriptor = "(IIIII)V")
	@Override
	protected void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1171) {
			local8 = this.anInt1171;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1172) {
			local21 = this.anInt1172;
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
				if (local91 < this.anInt1182) {
					local91 = this.anInt1182;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1181) {
					local102 = this.anInt1181;
				}
				local116 = local91 + local30 * this.anInt1160;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray76[local116++] = arg3;
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
				if (local91 < this.anInt1182) {
					local91 = this.anInt1182;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1181 - 1) {
					local102 = this.anInt1181 - 1;
				}
				local116 = local91 + local30 * this.anInt1160;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray76[local116++] = arg3;
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
			if (local102 < this.anInt1182) {
				local102 = this.anInt1182;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt1181) {
				local116 = this.anInt1181;
			}
			local118 = local102 + local30 * this.anInt1160;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray76[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray76[local118++] = local277 + local360;
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
			if (local102 < this.anInt1182) {
				local102 = this.anInt1182;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt1181 - 1) {
				local116 = this.anInt1181 - 1;
			}
			local118 = local102 + local30 * this.anInt1160;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray76[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray76[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(II)V")
	@Override
	public void method8120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas2 == null || this.aClass4_Sub12_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas2.getGraphics();
			this.aClass4_Sub12_1.method8687(arg0, this.anInt1152, this.anInt1153, local14, 0, arg1, 0);
		} catch (@Pc(29) Exception local29) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIZ)Lclient!tf;")
	@Override
	public Class17 method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		return arg2 ? new Class17_Sub1_Sub2(this, arg0, arg1) : new Class17_Sub1_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!cr;Z)Lclient!tf;")
	@Override
	public Class17 method8147(@OriginalArg(0) Class51 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray107;
		@Pc(5) byte[] local5 = arg0.aByteArray23;
		@Pc(8) int local8 = arg0.anInt1661;
		@Pc(11) int local11 = arg0.anInt1657;
		@Pc(76) Class17_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray22 == null) {
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
			local76 = new Class17_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray22;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class17_Sub1_Sub3(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class17_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.method5250(arg0.anInt1659, arg0.anInt1662, arg0.anInt1660, arg0.anInt1658);
		return local76;
	}

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "(I)I")
	public int method1218(@OriginalArg(0) int arg0) {
		return super.anInterface9_12.method1558(arg0).anInt3119;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!af;)V")
	@Override
	public void method8085(@OriginalArg(0) Class9 arg0) {
		@Pc(3) Class101 local3 = this.method1217(Thread.currentThread());
		@Pc(7) Class3_Sub3 local7 = arg0.aClass87_1.aClass3_Sub3_7;
		for (@Pc(10) Class3_Sub3 local10 = local7.aClass3_Sub3_9; local10 != local7; local10 = local10.aClass3_Sub3_9) {
			@Pc(14) Class3_Sub3_Sub1 local14 = (Class3_Sub3_Sub1) local10;
			@Pc(19) int local19 = local14.anInt1692 >> 12;
			@Pc(24) int local24 = local14.anInt1696 >> 12;
			@Pc(29) int local29 = local14.anInt1699 >> 12;
			@Pc(54) float local54 = this.aClass92_Sub3_1.aFloat103 + this.aClass92_Sub3_1.aFloat92 * (float) local19 + this.aClass92_Sub3_1.aFloat93 * (float) local24 + this.aClass92_Sub3_1.aFloat100 * (float) local29;
			if (!(local54 < (float) this.anInt1164) && !(local54 > (float) local3.anInt2572)) {
				@Pc(102) int local102 = this.anInt1176 + (int) ((float) this.lb * (this.aClass92_Sub3_1.aFloat91 + this.aClass92_Sub3_1.aFloat96 * (float) local19 + this.aClass92_Sub3_1.aFloat94 * (float) local24 + this.aClass92_Sub3_1.aFloat95 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt1158 + (int) ((float) this.anInt1167 * (this.aClass92_Sub3_1.aFloat102 + this.aClass92_Sub3_1.aFloat101 * (float) local19 + this.aClass92_Sub3_1.aFloat97 * (float) local24 + this.aClass92_Sub3_1.aFloat98 * (float) local29) / local54);
				if (local102 >= this.anInt1182 && local102 <= this.anInt1181 && local137 >= this.anInt1171 && local137 <= this.anInt1172) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method1224(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt1698 * this.lb >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "()Z")
	@Override
	public boolean method8152() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "()Lclient!nh;")
	@Override
	public Class92 method8078() {
		@Pc(3) Class101 local3 = this.method1217(Thread.currentThread());
		return local3.aClass92_Sub3_2;
	}

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "()I")
	@Override
	public int i() {
		return this.anInt1164;
	}

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "(I)I")
	public int method1219(@OriginalArg(0) int arg0) {
		return super.anInterface9_12.method1558(arg0).aShort49 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bs", name = "na", descriptor = "(IIII)[I")
	@Override
	public int[] na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt1160 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray76[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II[I[I)Lclient!aa;")
	@Override
	public Class1 method8150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class1_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)V")
	@Override
	public void method8092(@OriginalArg(0) int arg0) {
		this.anInt1156 = arg0;
		this.aClass352_8.method7659();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class101 local3 = this.method1217(Thread.currentThread());
		@Pc(6) Class77 local6 = local3.aClass77_1;
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
		@Pc(105) int local105 = arg0 - local6.method2107();
		@Pc(110) int local110 = arg1 - local6.method2097();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt2157 = 0;
		this.C(false);
		local6.aBoolean145 = local114 < 0 || local114 > local6.anInt2160 || local118 < 0 || local118 > local6.anInt2160 || local124 < 0 || local124 > local6.anInt2160;
		local6.method2101((float) local134, (float) local138, (float) local144, (float) local114, (float) local118, (float) local124, 100.0F, 100.0F, 100.0F, arg4);
		local6.aBoolean145 = local114 < 0 || local114 > local6.anInt2160 || local124 < 0 || local124 > local6.anInt2160 || local130 < 0 || local130 > local6.anInt2160;
		local6.method2101((float) local134, (float) local144, (float) local150, (float) local114, (float) local124, (float) local130, 100.0F, 100.0F, 100.0F, arg4);
		this.C(true);
	}

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "(IIIIIII)I")
	@Override
	public int r(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(24) float local24 = this.aClass92_Sub3_1.aFloat92 * (float) arg0 + this.aClass92_Sub3_1.aFloat93 * (float) arg1 + this.aClass92_Sub3_1.aFloat100 * (float) arg2 + this.aClass92_Sub3_1.aFloat103;
		@Pc(49) float local49 = this.aClass92_Sub3_1.aFloat92 * (float) arg3 + this.aClass92_Sub3_1.aFloat93 * (float) arg4 + this.aClass92_Sub3_1.aFloat100 * (float) arg5 + this.aClass92_Sub3_1.aFloat103;
		@Pc(51) int local51 = 0;
		if (local24 < (float) this.anInt1164 && local49 < (float) this.anInt1164) {
			local51 |= 0x10;
		} else if (local24 > (float) this.anInt1173 && local49 > (float) this.anInt1173) {
			local51 |= 0x20;
		}
		@Pc(117) int local117 = (int) ((float) this.lb * (this.aClass92_Sub3_1.aFloat96 * (float) arg0 + this.aClass92_Sub3_1.aFloat94 * (float) arg1 + this.aClass92_Sub3_1.aFloat95 * (float) arg2 + this.aClass92_Sub3_1.aFloat91) / (float) arg6);
		@Pc(150) int local150 = (int) ((float) this.lb * (this.aClass92_Sub3_1.aFloat96 * (float) arg3 + this.aClass92_Sub3_1.aFloat94 * (float) arg4 + this.aClass92_Sub3_1.aFloat95 * (float) arg5 + this.aClass92_Sub3_1.aFloat91) / (float) arg6);
		if (local117 < this.anInt1177 && local150 < this.anInt1177) {
			local51 |= 0x1;
		} else if (local117 > this.anInt1155 && local150 > this.anInt1155) {
			local51 |= 0x2;
		}
		@Pc(208) int local208 = (int) ((float) this.anInt1167 * (this.aClass92_Sub3_1.aFloat101 * (float) arg0 + this.aClass92_Sub3_1.aFloat97 * (float) arg1 + this.aClass92_Sub3_1.aFloat98 * (float) arg2 + this.aClass92_Sub3_1.aFloat102) / (float) arg6);
		@Pc(241) int local241 = (int) ((float) this.anInt1167 * (this.aClass92_Sub3_1.aFloat101 * (float) arg3 + this.aClass92_Sub3_1.aFloat97 * (float) arg4 + this.aClass92_Sub3_1.aFloat98 * (float) arg5 + this.aClass92_Sub3_1.aFloat102) / (float) arg6);
		if (local208 < this.anInt1175 && local241 < this.anInt1175) {
			local51 |= 0x4;
		} else if (local208 > this.anInt1159 && local241 > this.anInt1159) {
			local51 |= 0x8;
		}
		return local51;
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V")
	@Override
	public void method8109(@OriginalArg(0) int arg0) {
		this.aClass101Array1[arg0].method2476(Thread.currentThread());
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)Lclient!up;")
	@Override
	public Interface23 method8113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class354(arg0, arg1);
	}

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "()V")
	@Override
	public void method8149() {
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIIIIIII)V")
	private void method1220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < this.anInt1182 || arg0 >= this.anInt1181) {
			return;
		}
		@Pc(15) int local15 = arg0 + arg1 * this.anInt1160;
		@Pc(19) int local19 = arg3 >>> 24;
		@Pc(23) int local23 = arg4 + arg5;
		@Pc(27) int local27 = arg6 % local23;
		@Pc(37) int local37;
		if (local19 == 255) {
			local37 = 0;
			while (local37 < arg2) {
				if (arg1 + local37 >= this.anInt1171 && arg1 + local37 < this.anInt1172 && local27 < arg4) {
					this.anIntArray76[local15 + local37 * this.anInt1160] = arg3;
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
			if (arg1 + local106 >= this.anInt1171 && arg1 + local106 < this.anInt1172 && local27 < arg4) {
				@Pc(129) int local129 = local15 + local106 * this.anInt1160;
				@Pc(134) int local134 = this.anIntArray76[local129];
				@Pc(154) int local154 = ((local134 & 0xFF00FF) * local37 >> 8 & 0xFF00FF) + ((local134 & 0xFF00) * local37 >> 8 & 0xFF00);
				this.anIntArray76[local129] = local100 + local154;
			}
			local106++;
			local27++;
			local27 %= local23;
		}
	}

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "()Z")
	@Override
	public boolean method8104() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt1182 == 0 && this.anInt1181 == this.anInt1160 && this.anInt1171 == 0 && this.anInt1172 == this.anInt1165) {
			local19 = this.aFloatArray2.length;
			local25 = local19 - (local19 & 0x7);
			local27 = 0;
			while (local27 < local25) {
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
				this.aFloatArray2[local27++] = 2.14748365E9F;
			}
			while (local27 < local19) {
				this.aFloatArray2[local27++] = 2.14748365E9F;
			}
			return;
		}
		local19 = this.anInt1181 - this.anInt1182;
		local25 = this.anInt1172 - this.anInt1171;
		local27 = this.anInt1160 - local19;
		@Pc(116) int local116 = this.anInt1182 + this.anInt1171 * this.anInt1160;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.aFloatArray2[local19] = 2.14748365E9F;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!bs", name = "JA", descriptor = "(IIIIII)I")
	@Override
	public int JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) int local1 = 0;
		@Pc(26) float local26 = this.aClass92_Sub3_1.aFloat92 * (float) arg0 + this.aClass92_Sub3_1.aFloat93 * (float) arg1 + this.aClass92_Sub3_1.aFloat100 * (float) arg2 + this.aClass92_Sub3_1.aFloat103;
		if (local26 < 1.0F) {
			local26 = 1.0F;
		}
		@Pc(57) float local57 = this.aClass92_Sub3_1.aFloat92 * (float) arg3 + this.aClass92_Sub3_1.aFloat93 * (float) arg4 + this.aClass92_Sub3_1.aFloat100 * (float) arg5 + this.aClass92_Sub3_1.aFloat103;
		if (local57 < 1.0F) {
			local57 = 1.0F;
		}
		if (local26 < (float) this.anInt1164 && local57 < (float) this.anInt1164) {
			local1 |= 0x10;
		} else if (local26 > (float) this.anInt1173 && local57 > (float) this.anInt1173) {
			local1 |= 0x20;
		}
		@Pc(128) int local128 = (int) ((float) this.lb * (this.aClass92_Sub3_1.aFloat96 * (float) arg0 + this.aClass92_Sub3_1.aFloat94 * (float) arg1 + this.aClass92_Sub3_1.aFloat95 * (float) arg2 + this.aClass92_Sub3_1.aFloat91) / local26);
		@Pc(160) int local160 = (int) ((float) this.lb * (this.aClass92_Sub3_1.aFloat96 * (float) arg3 + this.aClass92_Sub3_1.aFloat94 * (float) arg4 + this.aClass92_Sub3_1.aFloat95 * (float) arg5 + this.aClass92_Sub3_1.aFloat91) / local57);
		if (local128 < this.anInt1177 && local160 < this.anInt1177) {
			local1 |= 0x1;
		} else if (local128 > this.anInt1155 && local160 > this.anInt1155) {
			local1 |= 0x2;
		}
		@Pc(217) int local217 = (int) ((float) this.anInt1167 * (this.aClass92_Sub3_1.aFloat101 * (float) arg0 + this.aClass92_Sub3_1.aFloat97 * (float) arg1 + this.aClass92_Sub3_1.aFloat98 * (float) arg2 + this.aClass92_Sub3_1.aFloat102) / local26);
		@Pc(249) int local249 = (int) ((float) this.anInt1167 * (this.aClass92_Sub3_1.aFloat101 * (float) arg3 + this.aClass92_Sub3_1.aFloat97 * (float) arg4 + this.aClass92_Sub3_1.aFloat98 * (float) arg5 + this.aClass92_Sub3_1.aFloat102) / local57);
		if (local217 < this.anInt1175 && local249 < this.anInt1175) {
			local1 |= 0x4;
		} else if (local217 > this.anInt1159 && local249 > this.anInt1159) {
			local1 |= 0x8;
		}
		return local1;
	}

	@OriginalMember(owner = "client!bs", name = "xa", descriptor = "(F)V")
	@Override
	public void xa(@OriginalArg(0) float arg0) {
		this.anInt1169 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!bs", name = "A", descriptor = "(ILclient!aa;II)V")
	@Override
	public void A(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class1_Sub2 local2 = (Class1_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray238;
		@Pc(8) int[] local8 = local2.anIntArray237;
		@Pc(20) int local20;
		if (this.anInt1172 < arg3 + local5.length) {
			local20 = this.anInt1172 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1171 > arg3) {
			local33 = this.anInt1171 - arg3;
			arg3 = this.anInt1171;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt1160;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1182 > local58) {
				local62 -= this.anInt1182 - local58;
				local58 = this.anInt1182;
			}
			if (this.anInt1181 < local58 + local62) {
				local62 = this.anInt1181 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray76[local58++] = arg0;
			}
			local49 += this.anInt1160;
		}
	}

	@OriginalMember(owner = "client!bs", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1160) {
			arg2 = this.anInt1160;
		}
		if (arg3 > this.anInt1165) {
			arg3 = this.anInt1165;
		}
		this.anInt1182 = arg0;
		this.anInt1181 = arg2;
		this.anInt1171 = arg1;
		this.anInt1172 = arg3;
		this.method1211();
	}

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "()V")
	@Override
	public void method8093() {
	}

	@OriginalMember(owner = "client!bs", name = "X", descriptor = "(I)V")
	@Override
	public void X(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!bs", name = "A", descriptor = "()V")
	@Override
	public void method8154() {
		this.aClass352_8.method7659();
		this.aClass352_7.method7659();
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIIID)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) double arg4) {
		@Pc(4) int local4 = this.anInt1163 - arg2;
		@Pc(11) int local11 = arg1 * this.anInt1163 + arg0;
		@Pc(14) float[] local14 = this.aFloatArray2;
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

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!af;I)V")
	@Override
	public void method8094(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class101 local3 = this.method1217(Thread.currentThread());
		@Pc(7) Class3_Sub3 local7 = arg0.aClass87_1.aClass3_Sub3_7;
		for (@Pc(10) Class3_Sub3 local10 = local7.aClass3_Sub3_9; local10 != local7; local10 = local10.aClass3_Sub3_9) {
			@Pc(14) Class3_Sub3_Sub1 local14 = (Class3_Sub3_Sub1) local10;
			@Pc(19) int local19 = local14.anInt1692 >> 12;
			@Pc(24) int local24 = local14.anInt1696 >> 12;
			@Pc(29) int local29 = local14.anInt1699 >> 12;
			@Pc(54) float local54 = this.aClass92_Sub3_1.aFloat103 + this.aClass92_Sub3_1.aFloat92 * (float) local19 + this.aClass92_Sub3_1.aFloat93 * (float) local24 + this.aClass92_Sub3_1.aFloat100 * (float) local29;
			if (!(local54 < (float) this.anInt1164) && !(local54 > (float) local3.anInt2572)) {
				@Pc(103) int local103 = this.anInt1176 + (int) ((float) this.lb * (this.aClass92_Sub3_1.aFloat91 + this.aClass92_Sub3_1.aFloat96 * (float) local19 + this.aClass92_Sub3_1.aFloat94 * (float) local24 + this.aClass92_Sub3_1.aFloat95 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt1158 + (int) ((float) this.anInt1167 * (this.aClass92_Sub3_1.aFloat102 + this.aClass92_Sub3_1.aFloat101 * (float) local19 + this.aClass92_Sub3_1.aFloat97 * (float) local24 + this.aClass92_Sub3_1.aFloat98 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt1182 && local103 <= this.anInt1181 && local139 >= this.anInt1171 && local139 <= this.anInt1172) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method1224(local14, local103, local139, (int) local54, (local14.anInt1698 * this.lb >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "m", descriptor = "(I)Z")
	public boolean method1221(@OriginalArg(0) int arg0) {
		return super.anInterface9_12.method1558(arg0).aBoolean235 || super.anInterface9_12.method1558(arg0).aBoolean239;
	}

	@OriginalMember(owner = "client!bs", name = "GA", descriptor = "(I)V")
	@Override
	public void GA(@OriginalArg(0) int arg0) {
		this.aa(0, 0, this.anInt1160, this.anInt1165, arg0, 0);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!bq;[Lclient!cr;Z)Lclient!da;")
	@Override
	public Class56 method8081(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class51[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1661;
			local7[local11] = arg1[local11].anInt1657;
			if (arg1[local11].aByteArray22 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class56_Sub2(this, arg0, arg1, local3, local7);
		} else {
			return new Class56_Sub4(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!jia;Lclient!jia;FLclient!jia;)Lclient!jia;")
	@Override
	public Class68 method8138(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class68 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!jia;)V")
	@Override
	public void method8069(@OriginalArg(0) Class68 arg0) {
	}

	@OriginalMember(owner = "client!bs", name = "la", descriptor = "()V")
	@Override
	public void la() {
		this.anInt1182 = 0;
		this.anInt1171 = 0;
		this.anInt1181 = this.anInt1160;
		this.anInt1172 = this.anInt1165;
		this.method1211();
	}

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "()Z")
	@Override
	public boolean method8101() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8096(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt1182) {
					arg1 += local104 * (this.anInt1182 - arg0);
					arg0 = this.anInt1182;
				}
				if (arg2 >= this.anInt1181) {
					arg2 = this.anInt1181 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1171 && local150 < this.anInt1172) {
							this.anIntArray76[arg0 + local150 * this.anInt1160] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1171 && local213 < this.anInt1172) {
							local228 = arg0 + local213 * this.anInt1160;
							local233 = this.anIntArray76[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray76[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1171 && local150 < this.anInt1172) {
							local213 = arg0 + local150 * this.anInt1160;
							local228 = this.anIntArray76[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray76[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt1171) {
					arg0 += local104 * (this.anInt1171 - arg1);
					arg1 = this.anInt1171;
				}
				if (arg3 >= this.anInt1172) {
					arg3 = this.anInt1172 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1182 && local150 < this.anInt1181) {
							this.anIntArray76[local150 + arg1 * this.anInt1160] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1182 && local213 < this.anInt1181) {
							local228 = local213 + arg1 * this.anInt1160;
							local233 = this.anIntArray76[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray76[local213 + arg1 * this.anInt1160] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1182 && local150 < this.anInt1181) {
							local213 = local150 + arg1 * this.anInt1160;
							local228 = this.anIntArray76[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray76[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "()Lclient!ub;")
	@Override
	public Class359 method8115() {
		return new Class359(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!bs", name = "pa", descriptor = "()V")
	@Override
	public void pa() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass101Array1.length; local1++) {
			this.aClass101Array1[local1].anInt2575 = this.aClass101Array1[local1].anInt2571;
			this.aClass101Array1[local1].aBoolean185 = false;
		}
	}

	@OriginalMember(owner = "client!bs", name = "Y", descriptor = "()[I")
	@Override
	public int[] Y() {
		return new int[] { this.anInt1176, this.anInt1158, this.lb, this.anInt1167 };
	}

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "(I)[I")
	public int[] method1222(@OriginalArg(0) int arg0) {
		@Pc(2) Class352 local2 = this.aClass352_8;
		@Pc(12) Class4_Sub38 local12;
		synchronized (this.aClass352_8) {
			local12 = (Class4_Sub38) this.aClass352_8.method7653((long) arg0);
			if (local12 == null) {
				if (!super.anInterface9_12.method1557(arg0)) {
					return null;
				}
				@Pc(32) Class130 local32 = super.anInterface9_12.method1558(arg0);
				@Pc(43) int local43 = local32.aBoolean236 || this.aBoolean81 ? 64 : this.anInt1156;
				local12 = new Class4_Sub38(arg0, local43, super.anInterface9_12.method1555(arg0, 0.7F, true, local43, local43), local32.anInt3119 != 1);
				this.aClass352_8.method7655((long) arg0, local12);
			}
		}
		local12.aBoolean533 = true;
		return local12.method6061();
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8144(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub12 local8 = (Class4_Sub12) this.aClass66_7.method1994((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static213.method3186(arg1, arg0, arg2);
			this.aClass66_7.method1985(local8, (long) arg0.hashCode());
		} else if (local8.anInt10264 != arg1 || local8.anInt10265 != arg2) {
			this.method8098(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!bs", name = "ZA", descriptor = "(IFFFFF)V")
	@Override
	public void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1162 = (int) (arg1 * 65535.0F);
		this.anInt1170 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1174 = (int) (arg3 * 65535.0F / local26);
		this.anInt1168 = (int) (arg4 * 65535.0F / local26);
		this.anInt1154 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "()V")
	@Override
	protected void method8126() {
		if (this.aBoolean79) {
			Static373.method4918(false, true);
			this.aBoolean79 = false;
		}
		this.aClass4_Sub12_1 = null;
		this.aCanvas2 = null;
		this.anInt1152 = 0;
		this.anInt1153 = 0;
		this.aClass66_7 = null;
		this.aBoolean80 = true;
	}

	@OriginalMember(owner = "client!bs", name = "C", descriptor = "(Z)V")
	@Override
	public void C(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class101 local3 = this.method1217(Thread.currentThread());
		local3.aBoolean186 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!za;)V")
	@Override
	public void method8083(@OriginalArg(0) Class4_Sub13 arg0) {
	}

	@OriginalMember(owner = "client!bs", name = "E", descriptor = "()I")
	@Override
	public int E() {
		return 0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V")
	@Override
	public void method8089(@OriginalArg(0) boolean arg0) {
		this.aBoolean81 = arg0;
		this.aClass352_8.method7659();
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "()V")
	@Override
	public void method8073() {
	}

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "(I)V")
	@Override
	public void method8131(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1151;
		for (@Pc(9) Object local9 = this.aClass352_8.method7661(); local9 != null; local9 = this.aClass352_8.method7651()) {
			@Pc(13) Class4_Sub38 local13 = (Class4_Sub38) local9;
			if (local13.aBoolean533) {
				local13.anInt6879 += local4;
				@Pc(27) int local27 = local13.anInt6879 / 20;
				if (local27 > 0) {
					@Pc(36) Class130 local36 = super.anInterface9_12.method1558(local13.anInt6877);
					local13.method6062(local36.aByte34 * local4 * 50 / 1000, local36.aByte36 * local4 * 50 / 1000);
					local13.anInt6879 -= local27 * 20;
				}
				local13.aBoolean533 = false;
			}
		}
		this.anInt1151 = arg0;
		this.aClass352_7.method7663(5);
		this.aClass352_8.method7663(5);
	}

	@OriginalMember(owner = "client!bs", name = "U", descriptor = "(IIIII)V")
	@Override
	public void U(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1171 || arg1 >= this.anInt1172) {
			return;
		}
		if (arg0 < this.anInt1182) {
			arg2 -= this.anInt1182 - arg0;
			arg0 = this.anInt1182;
		}
		if (arg0 + arg2 > this.anInt1181) {
			arg2 = this.anInt1181 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1160;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray76[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray76[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray76[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray76[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray76[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!bs", name = "ra", descriptor = "(IIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass101Array1.length; local1++) {
			this.aClass101Array1[local1].anInt2571 = this.aClass101Array1[local1].anInt2575;
			this.aClass101Array1[local1].anInt2573 = arg0;
			this.aClass101Array1[local1].anInt2575 = arg1;
			this.aClass101Array1[local1].anInt2578 = arg2;
			this.aClass101Array1[local1].aBoolean185 = true;
		}
	}

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "(I)V")
	@Override
	public void method8121() {
		Static276.anInt4466 = 10000;
		Static276.anInt4460 = 10000;
		if (this.anInt1166 > 1) {
			throw new IllegalStateException("No MT");
		}
		this.method8111(this.anInt1166);
		this.method8109(0);
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
	@Override
	public void method8087(@OriginalArg(0) int arg0) {
		this.aClass101Array1[arg0].method2476((Runnable) null);
	}

	@OriginalMember(owner = "client!bs", name = "XA", descriptor = "()I")
	@Override
	public int XA() {
		return this.anInt1173;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([I)V")
	@Override
	public void method8155(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1160;
		arg0[1] = this.anInt1165;
	}

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "()Z")
	@Override
	public boolean method8074() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
	@Override
	public void method8141(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) throws Exception_Sub1 {
		if (this.aCanvas2 == null || this.aClass4_Sub12_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas2.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x + arg2 <= this.anInt1160 && local21.y + arg3 <= this.anInt1165 && local21.x + arg2 + local21.width > 0 && local21.y + arg3 + local21.height > 0) {
					this.aClass4_Sub12_1.method8687(local21.x + arg2, local21.width, local21.height, local14, local21.x, local21.y + arg3, local21.y);
				}
			}
		} catch (@Pc(79) Exception local79) {
			this.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!bs", name = "L", descriptor = "(III)V")
	@Override
	public void L(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass101Array1.length; local1++) {
			@Pc(7) Class101 local7 = this.aClass101Array1[local1];
			local7.anInt2575 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt2575 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt2575 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt2575 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt2575 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean184 = false;
			} else {
				local7.aBoolean184 = true;
			}
		}
	}

	@OriginalMember(owner = "client!bs", name = "s", descriptor = "()Z")
	@Override
	public boolean method8130() {
		return true;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIIIIII)V")
	public void method1223(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface9_12.method1558(arg6).aBoolean241) {
			this.method1214(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt1183 != arg6) {
			@Pc(26) Class17 local26 = (Class17) this.aClass352_7.method7653((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method1216(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(44) int local44 = this.method1225(arg6) ? 64 : this.anInt1156;
				local26 = this.method8128(local32, local44, local44, local44);
				this.aClass352_7.method7655((long) arg6, local26);
			}
			this.anInt1183 = arg6;
			this.aClass17_6 = local26;
		}
		((Class17_Sub1) this.aClass17_6).method5271(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!bs", name = "Q", descriptor = "(IIIIII[BII)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1160;
		@Pc(35) int local35 = this.anInt1160 - arg2;
		if (arg1 + arg3 > this.anInt1172) {
			arg3 -= arg1 + arg3 - this.anInt1172;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1171) {
			local59 = this.anInt1171 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1160;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt1181) {
			local59 = arg0 + arg2 - this.anInt1181;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1182) {
			local59 = this.anInt1182 - arg0;
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
						this.anIntArray76[local30++] = arg4;
					} else {
						this.anIntArray76[local30++] = arg5;
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
					local245 = this.anIntArray76[local30];
					this.anIntArray76[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray76[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray76[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "()I")
	@Override
	public int method8086() {
		return 0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
	@Override
	public void method8098(@OriginalArg(0) Canvas arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class4_Sub12 local8 = (Class4_Sub12) this.aClass66_7.method1994((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method9000();
		local8 = Static213.method3186(arg1, arg0, arg2);
		this.aClass66_7.method1985(local8, (long) arg0.hashCode());
		if (this.aCanvas2 != arg0 || this.aClass316_1 != null) {
			return;
		}
		@Pc(37) Dimension local37 = arg0.getSize();
		this.anInt1152 = local37.width;
		this.anInt1153 = local37.height;
		this.aClass4_Sub12_1 = local8;
		this.anIntArray76 = local8.anIntArray710;
		this.anInt1160 = local8.anInt10264;
		this.anInt1165 = local8.anInt10265;
		if (this.anInt1160 != this.anInt1163 || this.anInt1165 != this.anInt1178) {
			this.anInt1161 = this.anInt1163 = this.anInt1160;
			this.anInt1157 = this.anInt1178 = this.anInt1165;
			this.aFloatArray1 = this.aFloatArray2 = new float[this.anInt1163 * this.anInt1178];
		}
		this.method1212();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!nm;)V")
	@Override
	public void method8117(@OriginalArg(0) Interface18 arg0) {
		@Pc(2) Class316 local2 = (Class316) arg0;
		this.anInt1160 = local2.anInt8072;
		this.anInt1165 = local2.anInt8070;
		this.anIntArray76 = local2.anIntArray553;
		this.aClass316_1 = local2;
		this.anInt1163 = local2.anInt8072;
		this.anInt1178 = local2.anInt8070;
		this.aFloatArray2 = local2.aFloatArray57;
		this.method1212();
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)V")
	@Override
	public void method8102(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!qg;IIII)V")
	private void method1224(@OriginalArg(0) Class3_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt1694;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method1214(arg1, arg2, arg3, arg4, arg0.anInt1695, 1);
			return;
		}
		if (this.anInt1183 != local2) {
			@Pc(33) Class17 local33 = (Class17) this.aClass352_7.method7653((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method1216(local2);
				if (local39 == null) {
					return;
				}
				@Pc(50) int local50 = this.method1225(local2) ? 64 : this.anInt1156;
				local33 = this.method8128(local39, local50, local50, local50);
				this.aClass352_7.method7655((long) local2, local33);
			}
			this.anInt1183 = local2;
			this.aClass17_6 = local33;
		}
		local8++;
		((Class17_Sub1) this.aClass17_6).method5271(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt1695, 1);
	}

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "()Z")
	@Override
	public boolean method8114() {
		return false;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "()Z")
	@Override
	public boolean method8071() {
		return true;
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "(II)I")
	@Override
	public int method8140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "(I)Z")
	public boolean method1225(@OriginalArg(0) int arg0) {
		return this.aBoolean81 || super.anInterface9_12.method1558(arg0).aBoolean236;
	}
}
