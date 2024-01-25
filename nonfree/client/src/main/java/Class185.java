import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class185 {

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	private int anInt5356;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "I")
	private int anInt5361;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
	private int anInt5362;

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
	private int anInt5367;

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "Lclient!c;")
	private Class7 aClass7_6;

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "[Z")
	private boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "Lclient!j;")
	private Class4_Sub1_Sub7 aClass4_Sub1_Sub7_6;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "Lclient!tq;")
	private Class233 aClass233_3;

	@OriginalMember(owner = "client!pd", name = "M", descriptor = "Lclient!li;")
	public Class41_Sub1 aClass41_Sub1_6;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	private int anInt5355 = -1;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "Z")
	private boolean aBoolean367 = false;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
	private int anInt5370 = -32768;

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
	private int anInt5372 = -1;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "Z")
	private boolean aBoolean368 = false;

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
	public final int anInt5364;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
	private int anInt5357;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
	public final int anInt5366;

	@OriginalMember(owner = "client!pd", name = "o", descriptor = "B")
	private final byte aByte78;

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "B")
	private final byte aByte79;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	private int anInt5352;

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	public final int anInt5358;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Z")
	private final boolean aBoolean366;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!qa;Lclient!eu;IIIIIIZI)V")
	public Class185(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt5364 = arg1.anInt2158;
		this.anInt5357 = arg7;
		this.anInt5366 = arg2;
		this.aByte78 = (byte) arg4;
		this.aByte79 = (byte) arg5;
		this.anInt5352 = arg6;
		this.anInt5358 = arg3;
		this.aBoolean367 = arg8;
		this.aBoolean366 = arg0.method4679() && arg1.aBoolean168 && !this.aBoolean367;
		if (arg9 != -1) {
			this.aBoolean368 = true;
		}
		this.method4123(arg9);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZIILclient!qa;ZLclient!c;)V")
	public void method4120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class30 arg5, @OriginalArg(7) Class7 arg6) {
		@Pc(10) Class56[] local10 = arg6.method4092();
		@Pc(13) Class120[] local13 = arg6.method4088();
		if ((this.aClass41_Sub1_6 == null || this.aClass41_Sub1_6.aBoolean308) && (local10 != null || local13 != null)) {
			@Pc(30) Class71 local30 = Static2.aClass74_13.method1683(this.anInt5364);
			if (local30.anIntArray138 != null) {
				local30 = local30.method1626(Static155.aClass149_1);
			}
			if (local30 != null) {
				this.aClass41_Sub1_6 = new Class41_Sub1(Static175.anInt3261);
			}
		}
		if (this.aClass41_Sub1_6 == null) {
			return;
		}
		if (arg2) {
			this.aClass41_Sub1_6.method3165(arg5, (long) Static175.anInt3261, local10, local13);
		} else {
			this.aClass41_Sub1_6.method3170((long) Static175.anInt3261);
		}
		this.aClass41_Sub1_6.method3158(this.aByte78, arg3, arg1, arg0, arg4);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZILclient!qa;ZIII)Lclient!c;")
	public Class7 method4121(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Class71 local11 = Static2.aClass74_13.method1683(this.anInt5364);
		if (local11.anIntArray138 != null) {
			local11 = local11.method1626(Static155.aClass149_1);
		}
		if (local11 == null) {
			this.method4130(arg1);
			this.anInt5355 = this.anInt5356;
			this.anInt5372 = -1;
			return null;
		}
		if (!this.aBoolean368 && this.anInt5372 != local11.anInt2158) {
			this.aClass7_6 = null;
			this.method4123(-1);
		}
		this.method4128(arg3, arg5);
		@Pc(74) boolean local74 = arg0 & this.aBoolean366 & Static126.aClass67_Sub1_1.method4523(Static286.anInt5207) != 0;
		@Pc(122) boolean local122 = local74 & (local11.anInt2158 != this.anInt5372 || (this.anInt5355 != this.anInt5356 || this.aClass233_3 != null && (this.aClass233_3.aBoolean451 || Static218.aBoolean291) && this.anInt5356 != this.anInt5367) && Static126.aClass67_Sub1_1.method4523(Static286.anInt5207) >= 2);
		if (arg2 && !local122) {
			this.anInt5372 = local11.anInt2158;
			this.anInt5355 = this.anInt5356;
			return null;
		}
		if (local122) {
			Static13.method320(this.aClass4_Sub1_Sub7_6, this.aByte79, this.anInt5352, this.anInt5357, this.aBooleanArray22);
		}
		@Pc(159) Class146 local159 = Static346.aClass146Array2[this.aByte79];
		@Pc(177) Class146 local177;
		if (this.aBoolean367) {
			local177 = Static422.aClass146Array3[0];
		} else {
			local177 = this.aByte79 >= 3 ? null : Static346.aClass146Array2[this.aByte79 + 1];
		}
		@Pc(185) Class7 local185 = null;
		if (this.aClass233_3 != null) {
			if (local122) {
				arg4 |= 0x40000;
			}
			local185 = local11.method1620(this.anInt5356, this.anInt5367, this.aClass233_3, this.anInt5366 == 11 ? 10 : this.anInt5366, arg4, this.anInt5357, this.anInt5366 == 11 ? this.anInt5358 + 4 : this.anInt5358, this.anInt5352, local159.va(this.anInt5352, this.anInt5357), arg1, this.anInt5362, local159, local177);
			if (local185 == null) {
				this.aClass4_Sub1_Sub7_6 = null;
				this.aBooleanArray22 = null;
				this.anInt5370 = 0;
			} else {
				if (local122) {
					if (this.aBooleanArray22 == null) {
						this.aBooleanArray22 = new boolean[4];
					}
					this.aClass4_Sub1_Sub7_6 = local185.ua(this.aClass4_Sub1_Sub7_6);
					Static1.method33(this.aClass4_Sub1_Sub7_6, this.aByte79, arg5, arg3, this.aBooleanArray22);
				}
				this.anInt5370 = local185.b();
			}
			this.aClass7_6 = null;
		} else if (this.aClass7_6 != null && (arg4 & this.aClass7_6.n()) == arg4 && this.anInt5372 == local11.anInt2158) {
			local185 = this.aClass7_6;
		} else {
			if (this.aClass7_6 != null) {
				arg4 |= this.aClass7_6.n();
			}
			@Pc(260) Class82 local260 = local11.method1625(arg4, this.anInt5366 == 11 ? 10 : this.anInt5366, this.anInt5352, this.anInt5357, this.anInt5366 == 11 ? this.anInt5358 + 4 : this.anInt5358, local159, local177, local122, arg1, local159.va(this.anInt5352, this.anInt5357));
			if (local260 == null) {
				this.anInt5370 = 0;
				this.aBooleanArray22 = null;
				this.aClass7_6 = null;
				this.aClass4_Sub1_Sub7_6 = null;
			} else {
				local185 = local260.aClass7_3;
				this.aClass7_6 = local260.aClass7_3;
				if (local122) {
					this.aBooleanArray22 = null;
					this.aClass4_Sub1_Sub7_6 = local260.aClass4_Sub1_Sub7_3;
					Static1.method33(this.aClass4_Sub1_Sub7_6, this.aByte79, arg5, arg3, null);
				}
				this.anInt5370 = local185.b();
			}
		}
		this.anInt5355 = this.anInt5356;
		this.anInt5372 = local11.anInt2158;
		this.anInt5352 = arg5;
		this.anInt5357 = arg3;
		return local185;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	private void method4123(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(24) Class71 local24 = Static2.aClass74_13.method1683(this.anInt5364);
			@Pc(26) Class71 local26 = local24;
			if (local24.anIntArray138 != null) {
				local24 = local24.method1626(Static155.aClass149_1);
			}
			if (local24 == null) {
				return;
			}
			if (local26 == local24) {
				local26 = null;
			}
			if (local24.anIntArray140 != null) {
				if (this.aClass233_3 != null && local24.method1618(this.aClass233_3.anInt6755)) {
					return;
				}
				local7 = local24.method1623();
				if (local24.anInt2158 != this.anInt5372) {
					local9 = local24.aBoolean163;
				}
			} else if (local24.anInt2173 == -1) {
				if (local26 != null && local26.anIntArray140 != null) {
					if (this.aClass233_3 != null && local26.method1618(this.aClass233_3.anInt6755)) {
						return;
					}
					local7 = local26.method1623();
					if (local26.anInt2158 != this.anInt5372) {
						local9 = local26.aBoolean163;
					}
				} else if (local26 != null && local26.anInt2173 != -1 && local26.anInt2158 != this.anInt5372) {
					local7 = local26.anInt2173;
					local9 = local26.aBoolean163;
				}
			} else if (local24.anInt2158 != this.anInt5372) {
				local9 = local24.aBoolean163;
				local7 = local24.anInt2173;
			}
		}
		if (local7 == -1) {
			this.aClass233_3 = null;
			return;
		}
		this.aClass7_6 = null;
		if (this.aClass233_3 == null || this.aClass233_3.anInt6755 != local7) {
			this.aClass233_3 = Static269.aClass10_1.method286(local7);
		} else if (this.aClass233_3.anInt6742 == 0) {
			return;
		}
		if (this.aClass233_3.anIntArray593 == null) {
			this.aClass233_3 = null;
			return;
		}
		if (local9) {
			this.anInt5356 = (int) ((double) this.aClass233_3.anIntArray593.length * Math.random());
			this.anInt5362 = (int) ((double) this.aClass233_3.anIntArray591[this.anInt5356] * Math.random()) + 1;
		} else {
			this.anInt5362 = 1;
			this.anInt5356 = 0;
		}
		this.anInt5367 = this.anInt5356 + 1;
		if (this.anInt5367 < 0 || this.anInt5367 >= this.aClass233_3.anIntArray593.length) {
			this.anInt5367 = -1;
		}
		this.anInt5361 = Static175.anInt3261 - this.anInt5362;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Z")
	public boolean method4124() {
		return this.aBoolean366;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
	public void method4127(@OriginalArg(0) int arg0) {
		this.aBoolean368 = true;
		this.method4123(arg0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)V")
	private void method4128(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		label80: while (true) {
			if (this.aClass233_3 == null) {
				if (this.aBoolean368) {
					return;
				}
				this.method4123(-1);
				if (this.aClass233_3 == null) {
					return;
				}
			}
			@Pc(30) int local30 = Static175.anInt3261 - this.anInt5361;
			if (local30 > 100 && this.aClass233_3.anInt6743 > 0) {
				@Pc(47) int local47 = this.aClass233_3.anIntArray593.length - this.aClass233_3.anInt6743;
				while (this.anInt5356 < local47 && this.aClass233_3.anIntArray591[this.anInt5356] < local30) {
					local30 -= this.aClass233_3.anIntArray591[this.anInt5356];
					this.anInt5356++;
				}
				if (local47 <= this.anInt5356) {
					@Pc(94) int local94 = 0;
					for (@Pc(96) int local96 = local47; local96 < this.aClass233_3.anIntArray593.length; local96++) {
						local94 += this.aClass233_3.anIntArray591[local96];
					}
					local30 %= local94;
				}
				this.anInt5367 = this.anInt5356 + 1;
				if (this.aClass233_3.anIntArray593.length <= this.anInt5367) {
					this.anInt5367 -= this.aClass233_3.anInt6743;
					if (this.anInt5367 < 0 || this.anInt5367 >= this.aClass233_3.anIntArray593.length) {
						this.anInt5367 = -1;
					}
				}
			}
			while (local30 > this.aClass233_3.anIntArray591[this.anInt5356]) {
				Static374.method5106(false, this.anInt5356, this.aByte78, this.aClass233_3, arg1, arg0);
				local30 -= this.aClass233_3.anIntArray591[this.anInt5356];
				this.anInt5356++;
				if (this.anInt5356 >= this.aClass233_3.anIntArray593.length) {
					this.anInt5356 -= this.aClass233_3.anInt6743;
					if (this.anInt5356 < 0 || this.anInt5356 >= this.aClass233_3.anIntArray593.length) {
						this.aClass233_3 = null;
						continue label80;
					}
				}
				this.anInt5367 = this.anInt5356 + 1;
				if (this.anInt5367 >= this.aClass233_3.anIntArray593.length) {
					this.anInt5367 -= this.aClass233_3.anInt6743;
					if (this.anInt5367 < 0 || this.anInt5367 >= this.aClass233_3.anIntArray593.length) {
						this.anInt5367 = -1;
					}
				}
			}
			this.anInt5361 = Static175.anInt3261 - local30;
			this.anInt5362 = local30;
			return;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!qa;)V")
	public void method4129(@OriginalArg(1) Class30 arg0) {
		this.method4121(true, arg0, true, this.anInt5357, 262144, this.anInt5352);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLclient!qa;)V")
	public void method4130(@OriginalArg(1) Class30 arg0) {
		if (this.aClass4_Sub1_Sub7_6 != null) {
			Static13.method320(this.aClass4_Sub1_Sub7_6, this.aByte79, this.anInt5352, this.anInt5357, this.aBooleanArray22);
			this.aBooleanArray22 = null;
			this.aClass4_Sub1_Sub7_6 = null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)I")
	public int method4132() {
		return this.anInt5370;
	}

	@OriginalMember(owner = "client!pd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass41_Sub1_6 != null) {
			this.aClass41_Sub1_6.method3168();
		}
	}
}
