import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class50 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "[Z")
	private boolean[] aBooleanArray9;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	private int anInt1195;

	@OriginalMember(owner = "client!dg", name = "d", descriptor = "Lclient!c;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!dg", name = "m", descriptor = "Lclient!j;")
	private Class1_Sub3_Sub10 aClass1_Sub3_Sub10_1;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "Lclient!nm;")
	private Class171 aClass171_1;

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
	private int anInt1206;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
	private int anInt1208;

	@OriginalMember(owner = "client!dg", name = "C", descriptor = "Lclient!ce;")
	public Class13_Sub2 aClass13_Sub2_1;

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
	private int anInt1216;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
	private int anInt1209 = -1;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
	private int anInt1203 = -32768;

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
	private int anInt1215 = -1;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
	private int anInt1201;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
	public final int anInt1194;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
	private int anInt1204;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
	public final int anInt1199;

	@OriginalMember(owner = "client!dg", name = "q", descriptor = "B")
	private final byte aByte6;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "I")
	public final int anInt1202;

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "B")
	private final byte aByte7;

	@OriginalMember(owner = "client!dg", name = "f", descriptor = "Z")
	private final boolean aBoolean97;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lclient!qa;Lclient!kn;IIIIIIZI)V")
	public Class50(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class141 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt1201 = arg7;
		this.anInt1194 = arg2;
		this.anInt1204 = arg6;
		this.anInt1199 = arg3;
		this.aByte6 = (byte) arg5;
		this.aBoolean99 = arg8;
		this.anInt1202 = arg1.anInt3383;
		this.aByte7 = (byte) arg4;
		this.aBoolean97 = arg0.method3584() && arg1.aBoolean268 && !this.aBoolean99;
		if (arg9 != -1) {
			this.aBoolean98 = true;
		}
		this.method1050(arg9);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V")
	private void method1042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass171_1 == null) {
				if (this.aBoolean98) {
					return;
				}
				this.method1050(-1);
				if (this.aClass171_1 == null) {
					return;
				}
			}
			@Pc(32) int local32 = Static368.anInt6250 - this.anInt1195;
			if (local32 > 100 && this.aClass171_1.anInt4251 > 0) {
				@Pc(54) int local54 = this.aClass171_1.anIntArray235.length - this.aClass171_1.anInt4251;
				while (this.anInt1216 < local54 && this.aClass171_1.anIntArray234[this.anInt1216] < local32) {
					local32 -= this.aClass171_1.anIntArray234[this.anInt1216];
					this.anInt1216++;
				}
				if (this.anInt1216 >= local54) {
					@Pc(101) int local101 = 0;
					for (@Pc(103) int local103 = local54; local103 < this.aClass171_1.anIntArray235.length; local103++) {
						local101 += this.aClass171_1.anIntArray234[local103];
					}
					local32 %= local101;
				}
				this.anInt1206 = this.anInt1216 + 1;
				if (this.anInt1206 >= this.aClass171_1.anIntArray235.length) {
					this.anInt1206 -= this.aClass171_1.anInt4251;
					if (this.anInt1206 < 0 || this.aClass171_1.anIntArray235.length <= this.anInt1206) {
						this.anInt1206 = -1;
					}
				}
			}
			while (this.aClass171_1.anIntArray234[this.anInt1216] < local32) {
				Static7.method4909(arg1, arg0, this.aByte7, false, this.aClass171_1, this.anInt1216);
				local32 -= this.aClass171_1.anIntArray234[this.anInt1216];
				this.anInt1216++;
				if (this.aClass171_1.anIntArray235.length <= this.anInt1216) {
					this.anInt1216 -= this.aClass171_1.anInt4251;
					if (this.anInt1216 < 0 || this.anInt1216 >= this.aClass171_1.anIntArray235.length) {
						this.aClass171_1 = null;
						continue label80;
					}
				}
				this.anInt1206 = this.anInt1216 + 1;
				if (this.anInt1206 >= this.aClass171_1.anIntArray235.length) {
					this.anInt1206 -= this.aClass171_1.anInt4251;
					if (this.anInt1206 < 0 || this.anInt1206 >= this.aClass171_1.anIntArray235.length) {
						this.anInt1206 = -1;
					}
				}
			}
			this.anInt1195 = Static368.anInt6250 - local32;
			this.anInt1208 = local32;
			return;
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!qa;B)V")
	public void method1043(@OriginalArg(0) Class128 arg0) {
		this.method1049(true, arg0, 262144, this.anInt1201, true, this.anInt1204);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method1044(@OriginalArg(0) Class128 arg0) {
		if (this.aClass1_Sub3_Sub10_1 != null) {
			Static177.method2370(this.aClass1_Sub3_Sub10_1, this.aByte6, this.anInt1204, this.anInt1201, this.aBooleanArray9);
			this.aBooleanArray9 = null;
			this.aClass1_Sub3_Sub10_1 = null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass13_Sub2_1 != null) {
			this.aClass13_Sub2_1.method699();
		}
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)I")
	public int method1046() {
		return this.anInt1203;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)Z")
	public boolean method1047() {
		return this.aBoolean97;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V")
	public void method1048(@OriginalArg(1) int arg0) {
		this.aBoolean98 = true;
		this.method1050(arg0);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLclient!qa;IIZBI)Lclient!c;")
	public Class33 method1049(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class141 local11 = Static259.aClass95_3.method1821(this.anInt1202);
		if (local11.anIntArray184 != null) {
			local11 = local11.method2832(Static364.aClass259_1);
		}
		if (local11 == null) {
			this.method1044(arg1);
			this.anInt1215 = this.anInt1216;
			this.anInt1209 = -1;
			return null;
		}
		if (!this.aBoolean98 && local11.anInt3383 != this.anInt1209) {
			this.aClass33_1 = null;
			this.method1050(-1);
		}
		this.method1042(arg5, arg3);
		@Pc(71) boolean local71 = arg4 & this.aBoolean97 & Static336.aClass106_Sub1_1.method4424(Static410.anInt6680) != 0;
		@Pc(117) boolean local117 = local71 & (this.anInt1209 != local11.anInt3383 || (this.anInt1216 != this.anInt1215 || this.aClass171_1 != null && (this.aClass171_1.aBoolean332 || Static240.aBoolean304) && this.anInt1206 != this.anInt1216) && Static336.aClass106_Sub1_1.method4424(Static410.anInt6680) >= 2);
		if (arg0 && !local117) {
			this.anInt1215 = this.anInt1216;
			this.anInt1209 = local11.anInt3383;
			return null;
		}
		if (local117) {
			Static177.method2370(this.aClass1_Sub3_Sub10_1, this.aByte6, this.anInt1204, this.anInt1201, this.aBooleanArray9);
		}
		@Pc(154) Class163 local154 = Static202.aClass163Array2[this.aByte6];
		@Pc(161) Class163 local161;
		if (this.aBoolean99) {
			local161 = Static240.aClass163Array3[0];
		} else {
			local161 = this.aByte6 < 3 ? Static202.aClass163Array2[this.aByte6 + 1] : null;
		}
		@Pc(180) Class33 local180 = null;
		if (this.aClass171_1 != null) {
			if (local117) {
				arg2 |= 0x40000;
			}
			local180 = local11.method2818(local154.va(this.anInt1204, this.anInt1201), arg2, this.anInt1201, local154, this.anInt1208, this.aClass171_1, this.anInt1206, this.anInt1194 == 11 ? 10 : this.anInt1194, this.anInt1216, local161, arg1, this.anInt1204, this.anInt1194 == 11 ? this.anInt1199 + 4 : this.anInt1199);
			if (local180 == null) {
				this.anInt1203 = 0;
				this.aClass1_Sub3_Sub10_1 = null;
				this.aBooleanArray9 = null;
			} else {
				if (local117) {
					if (this.aBooleanArray9 == null) {
						this.aBooleanArray9 = new boolean[4];
					}
					this.aClass1_Sub3_Sub10_1 = local180.ua(this.aClass1_Sub3_Sub10_1);
					Static422.method5252(this.aClass1_Sub3_Sub10_1, this.aByte6, arg5, arg3, this.aBooleanArray9);
				}
				this.anInt1203 = local180.b();
			}
			this.aClass33_1 = null;
		} else if (this.aClass33_1 != null && (this.aClass33_1.n() & arg2) == arg2 && this.anInt1209 == local11.anInt3383) {
			local180 = this.aClass33_1;
		} else {
			if (this.aClass33_1 != null) {
				arg2 |= this.aClass33_1.n();
			}
			@Pc(249) Class150 local249 = local11.method2825(this.anInt1194 == 11 ? 10 : this.anInt1194, this.anInt1194 == 11 ? this.anInt1199 + 4 : this.anInt1199, this.anInt1201, local117, arg2, local154, local154.va(this.anInt1204, this.anInt1201), arg1, this.anInt1204, local161);
			if (local249 == null) {
				this.aBooleanArray9 = null;
				this.aClass1_Sub3_Sub10_1 = null;
				this.anInt1203 = 0;
				this.aClass33_1 = null;
			} else {
				local180 = local249.aClass33_5;
				this.aClass33_1 = local249.aClass33_5;
				if (local117) {
					this.aBooleanArray9 = null;
					this.aClass1_Sub3_Sub10_1 = local249.aClass1_Sub3_Sub10_5;
					Static422.method5252(this.aClass1_Sub3_Sub10_1, this.aByte6, arg5, arg3, null);
				}
				this.anInt1203 = local180.b();
			}
		}
		this.anInt1215 = this.anInt1216;
		this.anInt1204 = arg5;
		this.anInt1209 = local11.anInt3383;
		this.anInt1201 = arg3;
		return local180;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)V")
	private void method1050(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(16) boolean local16 = false;
		if (arg0 == -1) {
			@Pc(25) Class141 local25 = Static259.aClass95_3.method1821(this.anInt1202);
			@Pc(27) Class141 local27 = local25;
			if (local25.anIntArray184 != null) {
				local25 = local25.method2832(Static364.aClass259_1);
			}
			if (local25 == null) {
				return;
			}
			if (local25 == local27) {
				local27 = null;
			}
			if (local25.anIntArray185 != null) {
				if (this.aClass171_1 != null && local25.method2824(this.aClass171_1.anInt4250)) {
					return;
				}
				local7 = local25.method2834();
				if (this.anInt1209 != local25.anInt3383) {
					local16 = local25.aBoolean258;
				}
			} else if (local25.lb == -1) {
				if (local27 != null && local27.anIntArray185 != null) {
					if (this.aClass171_1 != null && local27.method2824(this.aClass171_1.anInt4250)) {
						return;
					}
					local7 = local27.method2834();
					if (local27.anInt3383 != this.anInt1209) {
						local16 = local27.aBoolean258;
					}
				} else if (local27 != null && local27.lb != -1 && this.anInt1209 != local27.anInt3383) {
					local7 = local27.lb;
					local16 = local27.aBoolean258;
				}
			} else if (this.anInt1209 != local25.anInt3383) {
				local7 = local25.lb;
				local16 = local25.aBoolean258;
			}
		}
		if (local7 == -1) {
			this.aClass171_1 = null;
			return;
		}
		this.aClass33_1 = null;
		if (this.aClass171_1 == null || local7 != this.aClass171_1.anInt4250) {
			this.aClass171_1 = Static152.aClass213_1.method4410(local7);
		} else if (this.aClass171_1.anInt4256 == 0) {
			return;
		}
		if (this.aClass171_1.anIntArray235 == null) {
			this.aClass171_1 = null;
			return;
		}
		if (local16) {
			this.anInt1216 = (int) (Math.random() * (double) this.aClass171_1.anIntArray235.length);
			this.anInt1208 = (int) ((double) this.aClass171_1.anIntArray234[this.anInt1216] * Math.random()) + 1;
		} else {
			this.anInt1216 = 0;
			this.anInt1208 = 1;
		}
		this.anInt1206 = this.anInt1216 + 1;
		if (this.anInt1206 < 0 || this.aClass171_1.anIntArray235.length <= this.anInt1206) {
			this.anInt1206 = -1;
		}
		this.anInt1195 = Static368.anInt6250 - this.anInt1208;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIILclient!c;Lclient!qa;IZ)V")
	public void method1051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class33 arg4, @OriginalArg(5) Class128 arg5, @OriginalArg(7) boolean arg6) {
		@Pc(10) Class239[] local10 = arg4.method5380();
		@Pc(13) Class15[] local13 = arg4.method5385();
		if ((this.aClass13_Sub2_1 == null || this.aClass13_Sub2_1.aBoolean61) && (local10 != null || local13 != null)) {
			@Pc(30) Class141 local30 = Static259.aClass95_3.method1821(this.anInt1202);
			if (local30.anIntArray184 != null) {
				local30 = local30.method2832(Static364.aClass259_1);
			}
			if (local30 != null) {
				this.aClass13_Sub2_1 = new Class13_Sub2(Static368.anInt6250);
			}
		}
		if (this.aClass13_Sub2_1 == null) {
			return;
		}
		if (arg6) {
			this.aClass13_Sub2_1.method700(arg5, (long) Static368.anInt6250, local10, local13);
		} else {
			this.aClass13_Sub2_1.method695((long) Static368.anInt6250);
		}
		this.aClass13_Sub2_1.method704(this.aByte7, arg0, arg3, arg2, arg1);
	}
}
