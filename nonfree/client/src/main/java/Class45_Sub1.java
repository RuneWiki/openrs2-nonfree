import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "Lclient!sca;")
	private Class3_Sub28 aClass3_Sub28_1;

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas1;

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
	public int anInt1221;

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "[Lclient!nw;")
	private Class230[] aClass230Array1;

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
	private int anInt1222;

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
	public int anInt1223;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "I")
	public int anInt1226;

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	private int anInt1229;

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
	public int anInt1231;

	@OriginalMember(owner = "client!cc", name = "M", descriptor = "I")
	public int anInt1234;

	@OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
	public int anInt1236;

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "I")
	private int anInt1237;

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "I")
	public int anInt1239;

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "[I")
	public int[] anIntArray54;

	@OriginalMember(owner = "client!cc", name = "W", descriptor = "[I")
	public int[] anIntArray55;

	@OriginalMember(owner = "client!cc", name = "X", descriptor = "I")
	public int anInt1241;

	@OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
	public int anInt1242;

	@OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
	public int anInt1244;

	@OriginalMember(owner = "client!cc", name = "eb", descriptor = "Lclient!f;")
	private Class14 aClass14_2;

	@OriginalMember(owner = "client!cc", name = "fb", descriptor = "I")
	public int anInt1246;

	@OriginalMember(owner = "client!cc", name = "gb", descriptor = "Lclient!f;")
	private Class14 aClass14_3;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "Z")
	private boolean aBoolean105;

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "Z")
	private boolean aBoolean106;

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "Lclient!wa;")
	private Class354 aClass354_8;

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
	public int anInt1225;

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
	public int anInt1230;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
	public int anInt1227;

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
	public int anInt1220;

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "I")
	private int anInt1235;

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
	public int anInt1224;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	public int anInt1228;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
	public int anInt1232;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
	public int anInt1233;

	@OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
	public int anInt1238;

	@OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
	public int anInt1243;

	@OriginalMember(owner = "client!cc", name = "db", descriptor = "I")
	private int anInt1245;

	@OriginalMember(owner = "client!cc", name = "V", descriptor = "I")
	public int anInt1240;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "Z")
	private boolean aBoolean107;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "Lclient!ad;")
	private final Class6 aClass6_6;

	@OriginalMember(owner = "client!cc", name = "hb", descriptor = "I")
	private int anInt1247;

	@OriginalMember(owner = "client!cc", name = "Z", descriptor = "Lclient!ad;")
	private final Class6 aClass6_7;

	@OriginalMember(owner = "client!cc", name = "bb", descriptor = "Lclient!uv;")
	public Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	private int anInt1219;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!fa;)V")
	private Class45_Sub1(@OriginalArg(0) Interface3 arg0) {
		super(arg0);
		this.aBoolean105 = false;
		this.aBoolean106 = false;
		this.aClass354_8 = new Class354(4);
		this.anInt1225 = 512;
		this.anInt1230 = 0;
		this.anInt1227 = 0;
		this.anInt1220 = 78642;
		this.anInt1235 = 0;
		this.anInt1224 = 3500;
		this.anInt1228 = 0;
		this.anInt1232 = 75518;
		this.anInt1233 = 512;
		this.anInt1238 = 50;
		this.anInt1243 = 45823;
		this.anInt1245 = 0;
		this.anInt1240 = 0;
		this.aBoolean107 = false;
		this.aClass6_6 = new Class6(16);
		this.anInt1247 = -1;
		this.aClass6_7 = new Class6(256);
		this.aClass11_Sub3_1 = new Class11_Sub3();
		this.method7411(1);
		this.method7416(0);
		Static218.method3484(false, true);
		this.aBoolean105 = true;
		this.anInt1219 = (int) Static158.method2936();
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!fa;)V")
	public Class45_Sub1(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface3 arg1) {
		this(arg1);
		this.method7414(arg0);
		this.method7409(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "(I)Z")
	public boolean method1171(@OriginalArg(0) int arg0) {
		return this.aBoolean107 || super.anInterface3_12.method4776(arg0).aBoolean141;
	}

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "(I)[I")
	public int[] method1172(@OriginalArg(0) int arg0) {
		@Pc(2) Class6 local2 = this.aClass6_7;
		@Pc(12) Class3_Sub22 local12;
		synchronized (this.aClass6_7) {
			local12 = (Class3_Sub22) this.aClass6_7.method92((long) arg0);
			if (local12 == null) {
				if (!super.anInterface3_12.method4774(arg0)) {
					return null;
				}
				@Pc(32) Class55 local32 = super.anInterface3_12.method4776(arg0);
				@Pc(42) int local42 = local32.aBoolean141 || this.aBoolean107 ? 64 : 128;
				local12 = new Class3_Sub22(arg0, local42, super.anInterface3_12.method4779(local42, true, 0.7F, local42, arg0), local32.aBoolean147);
				this.aClass6_7.method106((long) arg0, local12);
			}
		}
		local12.aBoolean270 = true;
		return local12.method3101();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public void method7367(@OriginalArg(0) Class11 arg0) {
		this.aClass11_Sub3_1 = (Class11_Sub3) arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!e;)V")
	@Override
	public void method7418(@OriginalArg(0) Class3_Sub15 arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method7378() {
		@Pc(3) Class230 local3 = this.method1177(Thread.currentThread());
		@Pc(6) Class323 local6 = local3.aClass323_1;
		local6.aBoolean629 = false;
		@Pc(14) int local14 = 5 - this.anInt1241;
		@Pc(19) int local19 = 75 - this.anInt1241;
		@Pc(24) int local24 = 15 - this.anInt1241;
		@Pc(29) int local29 = 10 - this.anInt1239;
		@Pc(34) int local34 = 50 - this.anInt1239;
		@Pc(39) int local39 = 90 - this.anInt1239;
		local6.aBoolean633 = local14 < 0 || local14 > local6.anInt8244 || local19 < 0 || local19 > local6.anInt8244 || local24 < 0 || local24 > local6.anInt8244;
		local6.aBoolean631 = true;
		local6.anInt8240 = 0;
		local6.aBoolean630 = false;
		local6.method6834(local29, local34, local39, local14, local19, local24, 0, 0, 0, -65536, -65536, -65536);
		local6.aBoolean629 = true;
		local6.aBoolean631 = false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ed;IIII)V")
	private void method1173(@OriginalArg(0) Class41_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg0.anInt6764;
		@Pc(8) int local8 = arg4 << 1;
		if (local2 == -1) {
			this.method1183(arg1, arg2, arg3, arg4, arg0.anInt6763, 1);
			return;
		}
		if (this.anInt1247 != local2) {
			@Pc(33) Class14 local33 = (Class14) this.aClass6_6.method92((long) local2);
			if (local33 == null) {
				@Pc(39) int[] local39 = this.method1179(local2);
				if (local39 == null) {
					return;
				}
				@Pc(49) int local49 = this.method1171(local2) ? 64 : 128;
				local33 = this.method7395(local39, local49, local49, local49);
				this.aClass6_6.method106((long) local2, local33);
			}
			this.anInt1247 = local2;
			this.aClass14_3 = local33;
		}
		local8++;
		((Class14_Sub3) this.aClass14_3).method6631(arg1 - arg4, arg2 - arg4, arg3, local8, local8, 0, arg0.anInt6763, 1);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!f;Z)V")
	@Override
	protected void method7400(@OriginalArg(0) Class14 arg0) {
		if (arg0 instanceof Class14_Sub3_Sub2) {
			@Pc(5) Class14_Sub3_Sub2 local5 = (Class14_Sub3_Sub2) arg0;
			this.anInt1221 = local5.anInt7975;
			this.anInt1237 = local5.anInt7982;
			this.anIntArray54 = local5.anIntArray421;
			this.aClass14_2 = arg0;
		} else if (arg0 instanceof Class14_Sub3_Sub3) {
			@Pc(27) Class14_Sub3_Sub3 local27 = (Class14_Sub3_Sub3) arg0;
			this.anInt1221 = local27.anInt7975;
			this.anInt1237 = local27.anInt7982;
			this.anIntArray54 = local27.anIntArray508;
			this.aClass14_2 = arg0;
		} else {
			throw new RuntimeException();
		}
		this.method1182();
	}

	@OriginalMember(owner = "client!cc", name = "IA", descriptor = "(IIIIII[BII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1221;
		@Pc(35) int local35 = this.anInt1221 - arg2;
		if (arg1 + arg3 > this.anInt1240) {
			arg3 -= arg1 + arg3 - this.anInt1240;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1228) {
			local59 = this.anInt1228 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1221;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt1230) {
			local59 = arg0 + arg2 - this.anInt1230;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1227) {
			local59 = this.anInt1227 - arg0;
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
						this.anIntArray54[local30++] = arg4;
					} else {
						this.anIntArray54[local30++] = arg5;
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
					local245 = this.anIntArray54[local30];
					this.anIntArray54[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray54[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray54[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(IIIIIIIIII)V")
	public void method1174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg6 == 65535 || super.anInterface3_12.method4776(arg6).aBoolean144) {
			this.method1183(arg0, arg1, arg2, arg3, arg7, arg9);
			return;
		}
		if (this.anInt1247 != arg6) {
			@Pc(26) Class14 local26 = (Class14) this.aClass6_6.method92((long) arg6);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method1179(arg6);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method1171(arg6) ? 64 : 128;
				local26 = this.method7395(local32, local43, local43, local43);
				this.aClass6_6.method106((long) arg6, local26);
			}
			this.anInt1247 = arg6;
			this.aClass14_3 = local26;
		}
		((Class14_Sub3) this.aClass14_3).method6631(arg0 - arg3, arg1 - arg4, arg2, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
	}

	@OriginalMember(owner = "client!cc", name = "y", descriptor = "()Z")
	@Override
	public boolean method7429() {
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "ya", descriptor = "()V")
	@Override
	public void ya() {
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(27) int local27;
		if (this.anInt1227 == 0 && this.anInt1230 == this.anInt1221 && this.anInt1228 == 0 && this.anInt1240 == this.anInt1237) {
			local19 = this.anIntArray55.length;
			local25 = local19 - local19 & 0x7;
			local27 = 0;
			while (local27 < local25) {
				this.anIntArray55[local27++] = Integer.MAX_VALUE;
				this.anIntArray55[local27++] = Integer.MAX_VALUE;
				this.anIntArray55[local27++] = Integer.MAX_VALUE;
				this.anIntArray55[local27++] = Integer.MAX_VALUE;
				this.anIntArray55[local27++] = Integer.MAX_VALUE;
				this.anIntArray55[local27++] = Integer.MAX_VALUE;
				this.anIntArray55[local27++] = Integer.MAX_VALUE;
				this.anIntArray55[local27++] = Integer.MAX_VALUE;
			}
			while (local27 < local19) {
				this.anIntArray55[local27++] = Integer.MAX_VALUE;
			}
			return;
		}
		local19 = this.anInt1230 - this.anInt1227;
		local25 = this.anInt1240 - this.anInt1228;
		local27 = this.anInt1221 - local19;
		@Pc(116) int local116 = this.anInt1227 + this.anInt1228 * this.anInt1221;
		@Pc(120) int local120 = local19 >> 3;
		@Pc(124) int local124 = local19 & 0x7;
		local19 = local116 - 1;
		for (@Pc(131) int local131 = -local25; local131 < 0; local131++) {
			@Pc(136) int local136;
			if (local120 > 0) {
				local136 = local120;
				do {
					local19++;
					this.anIntArray55[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray55[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray55[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray55[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray55[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray55[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray55[local19] = Integer.MAX_VALUE;
					local19++;
					this.anIntArray55[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			if (local124 > 0) {
				local136 = local124;
				do {
					local19++;
					this.anIntArray55[local19] = Integer.MAX_VALUE;
					local136--;
				} while (local136 > 0);
			}
			local19 += local27;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([I)V")
	@Override
	public void method7407(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1221;
		arg0[1] = this.anInt1237;
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "()V")
	@Override
	public void method7368() {
		if (this.aCanvas1 == null) {
			this.anInt1221 = 1;
			this.anInt1237 = 1;
			this.anIntArray54 = null;
		} else {
			this.anIntArray54 = this.aClass3_Sub28_1.anIntArray531;
			this.anInt1221 = this.aClass3_Sub28_1.anInt8304;
			this.anInt1237 = this.aClass3_Sub28_1.anInt8302;
		}
		this.aClass14_2 = null;
		this.method1182();
	}

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "()V")
	private void method1175() {
		this.anInt1241 = this.anInt1227 - this.anInt1226;
		this.anInt1231 = this.anInt1230 - this.anInt1226;
		this.anInt1239 = this.anInt1228 - this.anInt1234;
		this.anInt1242 = this.anInt1240 - this.anInt1234;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1223; local29++) {
			@Pc(36) Class323 local36 = this.aClass230Array1[local29].aClass323_1;
			local36.anInt8239 = this.anInt1226 - this.anInt1227;
			local36.anInt8243 = this.anInt1234 - this.anInt1228;
			local36.anInt8244 = this.anInt1230 - this.anInt1227;
			local36.anInt8241 = this.anInt1240 - this.anInt1228;
		}
		@Pc(78) int local78 = this.anInt1228 * this.anInt1221 + this.anInt1227;
		for (@Pc(81) int local81 = this.anInt1228; local81 < this.anInt1240; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1223; local84++) {
				this.aClass230Array1[local84].aClass323_1.anIntArray525[local81 - this.anInt1228] = local78;
			}
			local78 += this.anInt1221;
		}
	}

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "(I)Z")
	public boolean method1176(@OriginalArg(0) int arg0) {
		return super.anInterface3_12.method4774(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!qw;I)V")
	@Override
	public void method7358(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class230 local3 = this.method1177(Thread.currentThread());
		@Pc(7) Class41_Sub3 local7 = arg0.aClass206_1.aClass41_Sub3_5;
		for (@Pc(10) Class41_Sub3 local10 = local7.aClass41_Sub3_10; local10 != local7; local10 = local10.aClass41_Sub3_10) {
			@Pc(14) Class41_Sub3_Sub1 local14 = (Class41_Sub3_Sub1) local10;
			@Pc(19) int local19 = local14.anInt6767 >> 12;
			@Pc(24) int local24 = local14.anInt6761 >> 12;
			@Pc(29) int local29 = local14.anInt6766 >> 12;
			@Pc(54) float local54 = this.aClass11_Sub3_1.aFloat171 + this.aClass11_Sub3_1.aFloat163 * (float) local19 + this.aClass11_Sub3_1.aFloat164 * (float) local24 + this.aClass11_Sub3_1.aFloat160 * (float) local29;
			if (!(local54 < (float) this.anInt1238) && !(local54 > (float) local3.anInt6361)) {
				@Pc(103) int local103 = this.anInt1226 + (int) ((float) this.anInt1225 * (this.aClass11_Sub3_1.aFloat162 + this.aClass11_Sub3_1.aFloat167 * (float) local19 + this.aClass11_Sub3_1.aFloat169 * (float) local24 + this.aClass11_Sub3_1.aFloat165 * (float) local29) / (float) arg1);
				@Pc(139) int local139 = this.anInt1234 + (int) ((float) this.anInt1233 * (this.aClass11_Sub3_1.aFloat168 + this.aClass11_Sub3_1.aFloat170 * (float) local19 + this.aClass11_Sub3_1.aFloat161 * (float) local24 + this.aClass11_Sub3_1.aFloat166 * (float) local29) / (float) arg1);
				if (local103 >= this.anInt1227 && local103 <= this.anInt1230 && local139 >= this.anInt1228 && local139 <= this.anInt1240) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method1173(local14, local103, local139, (int) local54, (local14.anInt6765 * this.anInt1225 >> 12) / arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt1227) {
					arg1 += local104 * (this.anInt1227 - arg0);
					arg0 = this.anInt1227;
				}
				if (arg2 >= this.anInt1230) {
					arg2 = this.anInt1230 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1228 && local150 < this.anInt1240) {
							this.anIntArray54[arg0 + local150 * this.anInt1221] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1228 && local213 < this.anInt1240) {
							local228 = arg0 + local213 * this.anInt1221;
							local233 = this.anIntArray54[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray54[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1228 && local150 < this.anInt1240) {
							local213 = arg0 + local150 * this.anInt1221;
							local228 = this.anIntArray54[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray54[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt1228) {
					arg0 += local104 * (this.anInt1228 - arg1);
					arg1 = this.anInt1228;
				}
				if (arg3 >= this.anInt1240) {
					arg3 = this.anInt1240 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1227 && local150 < this.anInt1230) {
							this.anIntArray54[local150 + arg1 * this.anInt1221] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1227 && local213 < this.anInt1230) {
							local228 = local213 + arg1 * this.anInt1221;
							local233 = this.anIntArray54[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray54[local213 + arg1 * this.anInt1221] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1227 && local150 < this.anInt1230) {
							local213 = local150 + arg1 * this.anInt1221;
							local228 = this.anIntArray54[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray54[local213] = local233 - local587 | local587 - (local587 >>> 8);
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

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!qw;)V")
	@Override
	public void method7396(@OriginalArg(0) Class283 arg0) {
		@Pc(3) Class230 local3 = this.method1177(Thread.currentThread());
		@Pc(7) Class41_Sub3 local7 = arg0.aClass206_1.aClass41_Sub3_5;
		for (@Pc(10) Class41_Sub3 local10 = local7.aClass41_Sub3_10; local10 != local7; local10 = local10.aClass41_Sub3_10) {
			@Pc(14) Class41_Sub3_Sub1 local14 = (Class41_Sub3_Sub1) local10;
			@Pc(19) int local19 = local14.anInt6767 >> 12;
			@Pc(24) int local24 = local14.anInt6761 >> 12;
			@Pc(29) int local29 = local14.anInt6766 >> 12;
			@Pc(54) float local54 = this.aClass11_Sub3_1.aFloat171 + this.aClass11_Sub3_1.aFloat163 * (float) local19 + this.aClass11_Sub3_1.aFloat164 * (float) local24 + this.aClass11_Sub3_1.aFloat160 * (float) local29;
			if (!(local54 < (float) this.anInt1238) && !(local54 > (float) local3.anInt6361)) {
				@Pc(102) int local102 = this.anInt1226 + (int) ((float) this.anInt1225 * (this.aClass11_Sub3_1.aFloat162 + this.aClass11_Sub3_1.aFloat167 * (float) local19 + this.aClass11_Sub3_1.aFloat169 * (float) local24 + this.aClass11_Sub3_1.aFloat165 * (float) local29) / local54);
				@Pc(137) int local137 = this.anInt1234 + (int) ((float) this.anInt1233 * (this.aClass11_Sub3_1.aFloat168 + this.aClass11_Sub3_1.aFloat170 * (float) local19 + this.aClass11_Sub3_1.aFloat161 * (float) local24 + this.aClass11_Sub3_1.aFloat166 * (float) local29) / local54);
				if (local102 >= this.anInt1227 && local102 <= this.anInt1230 && local137 >= this.anInt1228 && local137 <= this.anInt1240) {
					if (local54 == 0.0F) {
						local54 = 1.0F;
					}
					this.method1173(local14, local102, local137, (int) local54, (int) ((float) (local14.anInt6765 * this.anInt1225 >> 12) / local54));
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "T", descriptor = "()I")
	@Override
	public int T() {
		@Pc(2) int local2 = this.anInt1245;
		this.anInt1245 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
	@Override
	public void method7372(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!nw;")
	public Class230 method1177(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1223; local1++) {
			if (this.aClass230Array1[local1].aRunnable1 == arg0) {
				return this.aClass230Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "w", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7422() {
		return new Class11_Sub3();
	}

	@OriginalMember(owner = "client!cc", name = "VA", descriptor = "(IFFFFF)V")
	@Override
	public void VA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1243 = (int) (arg1 * 65535.0F);
		this.anInt1220 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1244 = (int) (arg3 * 65535.0F / local26);
		this.anInt1236 = (int) (arg4 * 65535.0F / local26);
		this.anInt1246 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7434(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas1 == arg0) {
			this.method7409(null);
		}
		@Pc(15) Class3_Sub28 local15 = (Class3_Sub28) this.aClass354_8.method7689((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7825();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lj;Lclient!lj;FLclient!lj;)Lclient!lj;")
	@Override
	public Class12 method7381(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class12 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[[I[[IIII)Lclient!i;")
	@Override
	public Class34 method7371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class34_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 512);
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
	@Override
	public void method7411(@OriginalArg(0) int arg0) {
		this.anInt1223 = arg0;
		this.aClass230Array1 = new Class230[this.anInt1223];
		for (@Pc(9) int local9 = 0; local9 < this.anInt1223; local9++) {
			this.aClass230Array1[local9] = new Class230(this);
		}
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(IIIII)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1228) {
			local8 = this.anInt1228;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1240) {
			local21 = this.anInt1240;
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
				if (local91 < this.anInt1227) {
					local91 = this.anInt1227;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1230) {
					local102 = this.anInt1230;
				}
				local116 = local91 + local30 * this.anInt1221;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray54[local116++] = arg3;
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
				if (local91 < this.anInt1227) {
					local91 = this.anInt1227;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1230 - 1) {
					local102 = this.anInt1230 - 1;
				}
				local116 = local91 + local30 * this.anInt1221;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray54[local116++] = arg3;
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
			if (local102 < this.anInt1227) {
				local102 = this.anInt1227;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt1230) {
				local116 = this.anInt1230;
			}
			local118 = local102 + local30 * this.anInt1221;
			for (local334 = local102; local334 < local116; local334++) {
				local340 = this.anIntArray54[local118];
				@Pc(360) int local360 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray54[local118++] = local277 + local360;
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
			if (local102 < this.anInt1227) {
				local102 = this.anInt1227;
			}
			local116 = arg0 + local36;
			if (local116 > this.anInt1230 - 1) {
				local116 = this.anInt1230 - 1;
			}
			local118 = local102 + local30 * this.anInt1221;
			for (local334 = local102; local334 <= local116; local334++) {
				local340 = this.anIntArray54[local118];
				local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
				this.anIntArray54[local118++] = local277 + local340;
			}
			local30++;
			local48 += local40 + local40;
			local44 += local40++ + local40;
		}
	}

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "()Z")
	public boolean method1178() {
		return this.aBoolean106;
	}

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "()Z")
	@Override
	public boolean method7435() {
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "()Z")
	@Override
	public boolean method7365() {
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "ZA", descriptor = "(Z)V")
	@Override
	public void ZA(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class230 local3 = this.method1177(Thread.currentThread());
		local3.aBoolean462 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(FFF)V")
	@Override
	public void method7405(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7409(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas1 = null;
			this.aClass3_Sub28_1 = null;
			if (this.aClass14_2 == null) {
				this.anIntArray54 = null;
				this.anInt1221 = this.anInt1237 = 1;
				this.anInt1229 = this.anInt1222 = 1;
				this.method1182();
			}
			return;
		}
		@Pc(10) Class3_Sub28 local10 = (Class3_Sub28) this.aClass354_8.method7689((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas1 = arg0;
		this.aClass3_Sub28_1 = local10;
		if (this.aClass14_2 != null) {
			return;
		}
		this.anIntArray54 = local10.anIntArray531;
		this.anInt1221 = local10.anInt8304;
		this.anInt1237 = local10.anInt8302;
		if (this.anInt1221 != this.anInt1229 || this.anInt1237 != this.anInt1222) {
			this.anInt1229 = this.anInt1221;
			this.anInt1222 = this.anInt1237;
			this.anIntArray55 = new int[this.anInt1229 * this.anInt1222];
		}
		this.method1182();
		return;
	}

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "()Lclient!aj;")
	@Override
	public Class15 method7401() {
		return new Class15(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "(I)[I")
	private int[] method1179(@OriginalArg(0) int arg0) {
		@Pc(2) Class6 local2 = this.aClass6_7;
		@Pc(12) Class3_Sub22 local12;
		synchronized (this.aClass6_7) {
			local12 = (Class3_Sub22) this.aClass6_7.method92((long) arg0);
			if (local12 == null) {
				if (!super.anInterface3_12.method4774(arg0)) {
					return null;
				}
				@Pc(32) Class55 local32 = super.anInterface3_12.method4776(arg0);
				@Pc(42) int local42 = local32.aBoolean141 || this.aBoolean107 ? 64 : 128;
				local12 = new Class3_Sub22(arg0, local42, super.anInterface3_12.method4777(arg0, local42, 0.7F, local42), local32.aBoolean147);
				this.aClass6_7.method106((long) arg0, local12);
			}
		}
		local12.aBoolean270 = true;
		return local12.method3101();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!qo;Z)Lclient!f;")
	@Override
	public Class14 method7398(@OriginalArg(0) Class279 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(2) int[] local2 = arg0.anIntArray456;
		@Pc(5) byte[] local5 = arg0.aByteArray80;
		@Pc(8) int local8 = arg0.anInt7341;
		@Pc(11) int local11 = arg0.anInt7340;
		@Pc(76) Class14_Sub3 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg1 && arg0.aByteArray79 == null) {
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
			local76 = new Class14_Sub3_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray79;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class14_Sub3_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class14_Sub3_Sub3(this, local20, local8, local11);
			}
		}
		local76.Q(arg0.anInt7339, arg0.anInt7338, arg0.anInt7343, arg0.anInt7342);
		return local76;
	}

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "(I)I")
	public int method1180(@OriginalArg(0) int arg0) {
		return super.anInterface3_12.method4776(arg0).aShort21 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7403(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub28 local8 = (Class3_Sub28) this.aClass354_8.method7689((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method7825();
		local8 = Static168.method3022(arg0);
		this.aClass354_8.method7691(local8, (long) arg0.hashCode());
		if (this.aCanvas1 != arg0 || this.aClass14_2 != null) {
			return;
		}
		this.aClass3_Sub28_1 = local8;
		this.anIntArray54 = local8.anIntArray531;
		this.anInt1221 = local8.anInt8304;
		this.anInt1237 = local8.anInt8302;
		if (this.anInt1221 != this.anInt1229 || this.anInt1237 != this.anInt1222) {
			this.anInt1229 = this.anInt1221;
			this.anInt1222 = this.anInt1237;
			this.anIntArray55 = new int[this.anInt1229 * this.anInt1222];
		}
		this.method1182();
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "(I)V")
	@Override
	public void method7428(@OriginalArg(0) int arg0) {
		this.aClass230Array1[arg0].method5401(null);
	}

	@OriginalMember(owner = "client!cc", name = "u", descriptor = "()V")
	@Override
	public void method7420() {
	}

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "()Z")
	@Override
	public boolean method7406() {
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(IIIIII)V")
	@Override
	public void method7402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.XA(arg0, arg1, arg2, arg4, arg5);
		this.XA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.m(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.m(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!cc", name = "la", descriptor = "(IIII)V")
	@Override
	public void la(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1226 = arg0;
		this.anInt1234 = arg1;
		this.anInt1225 = arg2;
		this.anInt1233 = arg3;
		this.method1175();
	}

	@OriginalMember(owner = "client!cc", name = "x", descriptor = "()V")
	@Override
	public void method7426() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIF)Lclient!eq;")
	@Override
	public Class3_Sub10 method7357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
	@Override
	public void method7361() {
	}

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "(I)Z")
	public boolean method1181(@OriginalArg(0) int arg0) {
		return super.anInterface3_12.method4776(arg0).aBoolean139;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	@Override
	public void method7410(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1219;
		for (@Pc(9) Object local9 = this.aClass6_7.method100(); local9 != null; local9 = this.aClass6_7.method104()) {
			@Pc(13) Class3_Sub22 local13 = (Class3_Sub22) local9;
			if (local13.aBoolean270) {
				local13.anInt3465 += local4;
				@Pc(27) int local27 = local13.anInt3465 / 20;
				if (local27 > 0) {
					@Pc(36) Class55 local36 = super.anInterface3_12.method4776(local13.anInt3464);
					local13.method3103(local36.aByte18 * local4 * 50 / 1000, local36.aByte21 * local4 * 50 / 1000);
					local13.anInt3465 -= local27 * 20;
				}
				local13.aBoolean270 = false;
			}
		}
		this.anInt1219 = arg0;
		this.aClass6_6.method97(5);
		this.aClass6_7.method97(5);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIILclient!ua;II)V")
	@Override
	public void method7382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class81_Sub3 local2 = (Class81_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray529;
		@Pc(8) int[] local8 = local2.anIntArray530;
		@Pc(17) int local17 = this.anInt1228 > arg7 ? this.anInt1228 : arg7;
		@Pc(32) int local32 = this.anInt1240 < arg7 + local5.length ? this.anInt1240 : arg7 + local5.length;
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
					if (local129 >= this.anInt1227 && local129 < this.anInt1230 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray54[local129 + arg1 * this.anInt1221] = arg4;
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
					if (local133 >= this.anInt1227 && local133 < this.anInt1230 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1221;
						local248 = this.anIntArray54[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray54[local133 + arg1 * this.anInt1221] = local201 + local584;
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
		if (arg0 < this.anInt1227) {
			arg1 += local83 * (this.anInt1227 - arg0);
			arg0 = this.anInt1227;
		}
		if (arg2 >= this.anInt1230) {
			arg2 = this.anInt1230 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray54[arg0 + local129 * this.anInt1221] = arg4;
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
					local243 = arg0 + local133 * this.anInt1221;
					local248 = this.anIntArray54[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray54[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!cc", name = "da", descriptor = "(IIII)V")
	@Override
	public void da(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1221) {
			arg2 = this.anInt1221;
		}
		if (arg3 > this.anInt1237) {
			arg3 = this.anInt1237;
		}
		this.anInt1227 = arg0;
		this.anInt1230 = arg2;
		this.anInt1228 = arg1;
		this.anInt1240 = arg3;
		this.method1175();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[Lclient!eq;)V")
	@Override
	public void method7413(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub10[] arg1) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	@Override
	public void method7385(@OriginalArg(0) boolean arg0) {
		this.aBoolean107 = arg0;
		this.aClass6_7.method102();
	}

	@OriginalMember(owner = "client!cc", name = "BA", descriptor = "()I")
	@Override
	public int BA() {
		return this.anInt1238;
	}

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "()I")
	@Override
	public int method7374() {
		return 0;
	}

	@OriginalMember(owner = "client!cc", name = "oa", descriptor = "([I)V")
	@Override
	public void oa(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1227;
		arg0[1] = this.anInt1228;
		arg0[2] = this.anInt1230;
		arg0[3] = this.anInt1240;
	}

	@OriginalMember(owner = "client!cc", name = "YA", descriptor = "(IIII)V")
	@Override
	public void YA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class230 local3 = this.method1177(Thread.currentThread());
		local3.anInt6366 = arg0;
		local3.anInt6363 = arg1;
		local3.anInt6359 = arg2;
	}

	@OriginalMember(owner = "client!cc", name = "ra", descriptor = "(F)V")
	@Override
	public void ra(@OriginalArg(0) float arg0) {
		this.anInt1232 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "(IIIIII)V")
	@Override
	public void J(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1227) {
			arg2 -= this.anInt1227 - arg0;
			arg0 = this.anInt1227;
		}
		if (arg1 < this.anInt1228) {
			arg3 -= this.anInt1228 - arg1;
			arg1 = this.anInt1228;
		}
		if (arg0 + arg2 > this.anInt1230) {
			arg2 = this.anInt1230 - arg0;
		}
		if (arg1 + arg3 > this.anInt1240) {
			arg3 = this.anInt1240 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1230 || arg1 > this.anInt1240) {
			return;
		}
		@Pc(67) int local67 = this.anInt1221 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1221;
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
						local217 = this.anIntArray54[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray54[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray54[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray54[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray54[arg2] = arg4;
					arg2++;
					this.anIntArray54[arg2] = arg4;
					arg2++;
					this.anIntArray54[arg2] = arg4;
					arg2++;
					this.anIntArray54[arg2] = arg4;
					arg2++;
					this.anIntArray54[arg2] = arg4;
					arg2++;
					this.anIntArray54[arg2] = arg4;
					arg2++;
					this.anIntArray54[arg2] = arg4;
					arg2++;
					this.anIntArray54[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray54[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7408() {
		return this.aClass11_Sub3_1;
	}

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "()Z")
	@Override
	public boolean method7404() {
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()I")
	@Override
	public int b() {
		return 0;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)I")
	@Override
	public int method7393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "()V")
	@Override
	public void method7432() {
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Z)V")
	@Override
	public void method7421(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!cc", name = "t", descriptor = "()Z")
	@Override
	public boolean method7417() {
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ef;IIII)Lclient!da;")
	@Override
	public Class60 method7419(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class60_Sub3(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cc", name = "CA", descriptor = "(IIII)V")
	@Override
	public void CA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass230Array1.length; local1++) {
			this.aClass230Array1[local1].anInt6360 = this.aClass230Array1[local1].anInt6363;
			this.aClass230Array1[local1].anInt6366 = arg0;
			this.aClass230Array1[local1].anInt6363 = arg1;
			this.aClass230Array1[local1].anInt6359 = arg2;
			this.aClass230Array1[local1].aBoolean465 = true;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method7399(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas1 == null || this.aClass3_Sub28_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt1221 && local21.y <= this.anInt1237 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass3_Sub28_1.method6900(local21.y, local21.x, local14, local21.height, local21.width);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "(I)Lclient!e;")
	@Override
	public Class3_Sub15 method7423(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "DA", descriptor = "()I")
	@Override
	public int DA() {
		@Pc(2) int local2 = this.anInt1235;
		this.anInt1235 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method7414(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub28 local8 = (Class3_Sub28) this.aClass354_8.method7689((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static168.method3022(arg0);
			this.aClass354_8.method7691(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	@Override
	protected void method7359() {
		if (this.aBoolean105) {
			Static133.method2618(false, true);
			this.aBoolean105 = false;
		}
		this.aClass3_Sub28_1 = null;
		this.aCanvas1 = null;
		this.aClass354_8 = null;
		this.aBoolean106 = true;
	}

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "()V")
	@Override
	public void L() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass230Array1.length; local1++) {
			this.aClass230Array1[local1].anInt6363 = this.aClass230Array1[local1].anInt6360;
			this.aClass230Array1[local1].aBoolean465 = false;
		}
	}

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "()Lclient!q;")
	@Override
	public Class11 method7397() {
		@Pc(3) Class230 local3 = this.method1177(Thread.currentThread());
		return local3.aClass11_Sub3_2;
	}

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "()Z")
	@Override
	public boolean method7384() {
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class230 local3 = this.method1177(Thread.currentThread());
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
		@Pc(105) int local105 = arg0 - local6.method6843();
		@Pc(110) int local110 = arg1 - local6.method6840();
		@Pc(114) int local114 = local105 + local78;
		@Pc(118) int local118 = local105 - local86;
		@Pc(124) int local124 = local105 + local10 - local86;
		@Pc(130) int local130 = local105 + local10 + local78;
		@Pc(134) int local134 = local110 + local92;
		@Pc(138) int local138 = local110 - local100;
		@Pc(144) int local144 = local110 + local14 - local100;
		@Pc(150) int local150 = local110 + local14 + local92;
		local6.anInt8240 = 0;
		this.ZA(false);
		local6.aBoolean633 = local114 < 0 || local114 > local6.anInt8244 || local118 < 0 || local118 > local6.anInt8244 || local124 < 0 || local124 > local6.anInt8244;
		local6.method6839(local134, local138, local144, local114, local118, local124, 100, 100, 100, arg4);
		local6.aBoolean633 = local114 < 0 || local114 > local6.anInt8244 || local124 < 0 || local124 > local6.anInt8244 || local130 < 0 || local130 > local6.anInt8244;
		local6.method6839(local134, local144, local150, local114, local124, local130, 100, 100, 100, arg4);
		this.ZA(true);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([IIIII)Lclient!f;")
	@Override
	public Class14 method7395(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class14_Sub3_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class14_Sub3_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class14_Sub3_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class14_Sub3_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lj;)V")
	@Override
	public void method7415(@OriginalArg(0) Class12 arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
	@Override
	public int method7392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "()V")
	private void method1182() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1223; local1++) {
			this.aClass230Array1[local1].method5402();
		}
		this.JA();
	}

	@OriginalMember(owner = "client!cc", name = "JA", descriptor = "()V")
	@Override
	public void JA() {
		this.anInt1227 = 0;
		this.anInt1228 = 0;
		this.anInt1230 = this.anInt1221;
		this.anInt1240 = this.anInt1237;
		this.method1175();
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "()Z")
	@Override
	public boolean method7363() {
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZ)Lclient!f;")
	@Override
	public Class14 method7390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class14_Sub3_Sub3(this, arg0, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "z", descriptor = "()Z")
	@Override
	public boolean method7430() {
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "()Z")
	@Override
	public boolean method7391() {
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "()V")
	@Override
	public void method7386() throws Exception_Sub1 {
		if (this.aCanvas1 == null || this.aClass3_Sub28_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas1.getGraphics();
			this.aClass3_Sub28_1.method6898(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!cc", name = "MA", descriptor = "(III[I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass11_Sub3_1.aFloat171 + this.aClass11_Sub3_1.aFloat163 * (float) arg0 + this.aClass11_Sub3_1.aFloat164 * (float) arg1 + this.aClass11_Sub3_1.aFloat160 * (float) arg2;
		if (local24 < (float) this.anInt1238 || local24 > (float) this.anInt1224) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt1225 * (this.aClass11_Sub3_1.aFloat162 + this.aClass11_Sub3_1.aFloat167 * (float) arg0 + this.aClass11_Sub3_1.aFloat169 * (float) arg1 + this.aClass11_Sub3_1.aFloat165 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt1233 * (this.aClass11_Sub3_1.aFloat168 + this.aClass11_Sub3_1.aFloat170 * (float) arg0 + this.aClass11_Sub3_1.aFloat161 * (float) arg1 + this.aClass11_Sub3_1.aFloat166 * (float) arg2) / local24);
		arg3[0] = local81 - this.anInt1241;
		arg3[1] = local113 - this.anInt1239;
		arg3[2] = (int) local24;
	}

	@OriginalMember(owner = "client!cc", name = "AA", descriptor = "(III[I)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(24) float local24 = this.aClass11_Sub3_1.aFloat171 + this.aClass11_Sub3_1.aFloat163 * (float) arg0 + this.aClass11_Sub3_1.aFloat164 * (float) arg1 + this.aClass11_Sub3_1.aFloat160 * (float) arg2;
		if (local24 < (float) this.anInt1238 || local24 > (float) this.anInt1224) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(81) int local81 = (int) ((float) this.anInt1225 * (this.aClass11_Sub3_1.aFloat162 + this.aClass11_Sub3_1.aFloat167 * (float) arg0 + this.aClass11_Sub3_1.aFloat169 * (float) arg1 + this.aClass11_Sub3_1.aFloat165 * (float) arg2) / local24);
		@Pc(113) int local113 = (int) ((float) this.anInt1233 * (this.aClass11_Sub3_1.aFloat168 + this.aClass11_Sub3_1.aFloat170 * (float) arg0 + this.aClass11_Sub3_1.aFloat161 * (float) arg1 + this.aClass11_Sub3_1.aFloat166 * (float) arg2) / local24);
		if (local81 >= this.anInt1241 && local81 <= this.anInt1231 && local113 >= this.anInt1239 && local113 <= this.anInt1242) {
			arg3[0] = local81 - this.anInt1241;
			arg3[1] = local113 - this.anInt1239;
			arg3[2] = (int) local24;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "()Z")
	@Override
	public boolean method7360() {
		return true;
	}

	@OriginalMember(owner = "client!cc", name = "B", descriptor = "()Z")
	@Override
	public boolean method7433() {
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "FA", descriptor = "(ILclient!ua;II)V")
	@Override
	public void FA(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class81_Sub3 local2 = (Class81_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray529;
		@Pc(8) int[] local8 = local2.anIntArray530;
		@Pc(20) int local20;
		if (this.anInt1240 < arg3 + local5.length) {
			local20 = this.anInt1240 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1228 > arg3) {
			local33 = this.anInt1228 - arg3;
			arg3 = this.anInt1228;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt1221;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1227 > local58) {
				local62 -= this.anInt1227 - local58;
				local58 = this.anInt1227;
			}
			if (this.anInt1230 < local58 + local62) {
				local62 = this.anInt1230 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray54[local58++] = arg0;
			}
			local49 += this.anInt1221;
		}
	}

	@OriginalMember(owner = "client!cc", name = "v", descriptor = "()[I")
	@Override
	public int[] v() {
		return new int[] { this.anInt1226, this.anInt1234, this.anInt1225, this.anInt1233 };
	}

	@OriginalMember(owner = "client!cc", name = "O", descriptor = "(IIIIII)Z")
	@Override
	public boolean O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(24) float local24 = this.aClass11_Sub3_1.aFloat163 * (float) arg0 + this.aClass11_Sub3_1.aFloat164 * (float) arg1 + this.aClass11_Sub3_1.aFloat160 * (float) arg2 + this.aClass11_Sub3_1.aFloat171;
		if (local24 < 1.0F) {
			local24 = 1.0F;
		}
		@Pc(55) float local55 = this.aClass11_Sub3_1.aFloat163 * (float) arg3 + this.aClass11_Sub3_1.aFloat164 * (float) arg4 + this.aClass11_Sub3_1.aFloat160 * (float) arg5 + this.aClass11_Sub3_1.aFloat171;
		if (local55 < 1.0F) {
			local55 = 1.0F;
		}
		if (local24 < (float) this.anInt1238 && local55 < (float) this.anInt1238 || !(!(local24 > (float) this.anInt1224) || !(local55 > (float) this.anInt1224))) {
			return false;
		}
		@Pc(119) int local119 = (int) ((float) this.anInt1225 * (this.aClass11_Sub3_1.aFloat167 * (float) arg0 + this.aClass11_Sub3_1.aFloat169 * (float) arg1 + this.aClass11_Sub3_1.aFloat165 * (float) arg2 + this.aClass11_Sub3_1.aFloat162) / local24);
		@Pc(151) int local151 = (int) ((float) this.anInt1225 * (this.aClass11_Sub3_1.aFloat167 * (float) arg3 + this.aClass11_Sub3_1.aFloat169 * (float) arg4 + this.aClass11_Sub3_1.aFloat165 * (float) arg5 + this.aClass11_Sub3_1.aFloat162) / local55);
		if (local119 < this.anInt1241 && local151 < this.anInt1241 || local119 > this.anInt1231 && local151 > this.anInt1231) {
			return false;
		} else {
			@Pc(201) int local201 = (int) ((float) this.anInt1233 * (this.aClass11_Sub3_1.aFloat170 * (float) arg0 + this.aClass11_Sub3_1.aFloat161 * (float) arg1 + this.aClass11_Sub3_1.aFloat166 * (float) arg2 + this.aClass11_Sub3_1.aFloat168) / local24);
			@Pc(233) int local233 = (int) ((float) this.anInt1233 * (this.aClass11_Sub3_1.aFloat170 * (float) arg3 + this.aClass11_Sub3_1.aFloat161 * (float) arg4 + this.aClass11_Sub3_1.aFloat166 * (float) arg5 + this.aClass11_Sub3_1.aFloat168) / local55);
			return (local201 >= this.anInt1239 || local233 >= this.anInt1239) && (local201 <= this.anInt1242 || local233 <= this.anInt1242);
		}
	}

	@OriginalMember(owner = "client!cc", name = "XA", descriptor = "(IIIII)V")
	@Override
	public void XA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1228 || arg1 >= this.anInt1240) {
			return;
		}
		if (arg0 < this.anInt1227) {
			arg2 -= this.anInt1227 - arg0;
			arg0 = this.anInt1227;
		}
		if (arg0 + arg2 > this.anInt1230) {
			arg2 = this.anInt1230 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1221;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray54[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray54[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray54[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray54[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray54[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "GA", descriptor = "(II)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class230 local3 = this.method1177(Thread.currentThread());
		this.anInt1238 = arg0;
		this.anInt1224 = arg1;
		local3.anInt6361 = this.anInt1224 - 255;
	}

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "()Z")
	@Override
	public boolean method7389() {
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "ja", descriptor = "(I)V")
	@Override
	public void ja(@OriginalArg(0) int arg0) {
		this.J(0, 0, this.anInt1221, this.anInt1237, arg0, 0);
	}

	@OriginalMember(owner = "client!cc", name = "V", descriptor = "(IIII)V")
	@Override
	public void V(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1227 < arg0) {
			this.anInt1227 = arg0;
		}
		if (this.anInt1228 < arg1) {
			this.anInt1228 = arg1;
		}
		if (this.anInt1230 > arg2) {
			this.anInt1230 = arg2;
		}
		if (this.anInt1240 > arg3) {
			this.anInt1240 = arg3;
		}
		this.method1175();
	}

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "()I")
	@Override
	public int U() {
		return this.anInt1224;
	}

	@OriginalMember(owner = "client!cc", name = "va", descriptor = "(I)V")
	@Override
	public void va(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "(IIII)[I")
	@Override
	public int[] h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt1221 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray54[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(IIIIII)V")
	private void method1183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 < 0) {
			arg3 = -arg3;
		}
		@Pc(8) int local8 = arg2 << 8;
		@Pc(12) int local12 = arg1 - arg3;
		if (local12 < this.anInt1228) {
			local12 = this.anInt1228;
		}
		@Pc(25) int local25 = arg1 + arg3 + 1;
		if (local25 > this.anInt1240) {
			local25 = this.anInt1240;
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
				if (local95 < this.anInt1227) {
					local95 = this.anInt1227;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt1230) {
					local106 = this.anInt1230;
				}
				local120 = local95 + local34 * this.anInt1221;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray55[local120]) {
						this.anIntArray54[local120] = arg4;
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
				if (local95 < this.anInt1227) {
					local95 = this.anInt1227;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt1230 - 1) {
					local106 = this.anInt1230 - 1;
				}
				local120 = local95 + local34 * this.anInt1221;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray55[local120]) {
						this.anIntArray54[local120] = arg4;
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
				if (local106 < this.anInt1227) {
					local106 = this.anInt1227;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt1230) {
					local120 = this.anInt1230;
				}
				local122 = local106 + local34 * this.anInt1221;
				for (local350 = local106; local350 < local120; local350++) {
					if (local8 < this.anIntArray55[local122]) {
						local362 = this.anIntArray54[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray54[local122] = local293 + local362;
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
				if (local106 < this.anInt1227) {
					local106 = this.anInt1227;
				}
				local120 = arg0 + local40;
				if (local120 > this.anInt1230 - 1) {
					local120 = this.anInt1230 - 1;
				}
				local122 = local106 + local34 * this.anInt1221;
				for (local350 = local106; local350 <= local120; local350++) {
					if (local8 < this.anIntArray55[local122]) {
						local362 = this.anIntArray54[local122];
						local362 = ((local362 & 0xFF00FF) * local95 >> 8 & 0xFF00FF) + ((local362 & 0xFF00) * local95 >> 8 & 0xFF00);
						this.anIntArray54[local122] = local293 + local362;
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
				if (local95 < this.anInt1227) {
					local95 = this.anInt1227;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt1230) {
					local106 = this.anInt1230;
				}
				local120 = local95 + local34 * this.anInt1221;
				for (local122 = local95; local122 < local106; local122++) {
					if (local8 < this.anIntArray55[local120]) {
						local350 = this.anIntArray54[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						@Pc(637) int local637 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray54[local120] = local362 - local637 | local637 - (local637 >>> 8);
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
				if (local95 < this.anInt1227) {
					local95 = this.anInt1227;
				}
				local106 = arg0 + local40;
				if (local106 > this.anInt1230 - 1) {
					local106 = this.anInt1230 - 1;
				}
				local120 = local95 + local34 * this.anInt1221;
				for (local122 = local95; local122 <= local106; local122++) {
					if (local8 < this.anIntArray55[local120]) {
						local350 = this.anIntArray54[local120];
						local362 = arg4 + local350;
						local627 = (arg4 & 0xFF00FF) + (local350 & 0xFF00FF);
						local350 = (local627 & 0x1000100) + (local362 - local627 & 0x10000);
						this.anIntArray54[local120] = local362 - local350 | local350 - (local350 >>> 8);
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

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)V")
	@Override
	public void method7416(@OriginalArg(0) int arg0) {
		this.aClass230Array1[arg0].method5401(Thread.currentThread());
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIZ)Lclient!f;")
	@Override
	public Class14 method7362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1221 + arg0;
		@Pc(16) int local16 = this.anInt1221 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray54[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class14_Sub3_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class14_Sub3_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ho;[Lclient!qo;Z)Lclient!la;")
	@Override
	public Class54 method7394(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Class279[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7341;
			local7[local11] = arg1[local11].anInt7340;
			if (arg1[local11].aByteArray79 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class54_Sub1(this, arg0, arg1, local3, local7);
		} else {
			return new Class54_Sub5(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "(IIIII)V")
	@Override
	public void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1227 || arg0 >= this.anInt1230) {
			return;
		}
		if (arg1 < this.anInt1228) {
			arg2 -= this.anInt1228 - arg1;
			arg1 = this.anInt1228;
		}
		if (arg1 + arg2 > this.anInt1240) {
			arg2 = this.anInt1240 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1221;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray54[local40 + local54 * this.anInt1221] = arg3;
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
				local111 = local40 + local103 * this.anInt1221;
				local116 = this.anIntArray54[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray54[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1221;
				local111 = this.anIntArray54[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray54[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[I[I)Lclient!ua;")
	@Override
	public Class81 method7424(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class81_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(IIIIII)Lclient!lj;")
	@Override
	public Class12 method7431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cc", name = "pa", descriptor = "(III)V")
	@Override
	public void pa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.aClass230Array1.length; local1++) {
			@Pc(7) Class230 local7 = this.aClass230Array1[local1];
			local7.anInt6363 = arg0 & 0xFFFFFF;
			@Pc(19) int local19 = local7.anInt6363 >>> 16 & 0xFF;
			if (local19 < 2) {
				local19 = 2;
			}
			@Pc(31) int local31 = local7.anInt6363 >> 8 & 0xFF;
			if (local31 < 2) {
				local31 = 2;
			}
			@Pc(41) int local41 = local7.anInt6363 & 0xFF;
			if (local41 < 2) {
				local41 = 2;
			}
			local7.anInt6363 = local19 << 16 | local31 << 8 | local41;
			if (arg1 < 0) {
				local7.aBoolean464 = false;
			} else {
				local7.aBoolean464 = true;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "()V")
	@Override
	public void method7370() {
		this.aClass6_7.method102();
		this.aClass6_6.method102();
	}

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "()Z")
	@Override
	public boolean method7380() {
		return false;
	}
}
