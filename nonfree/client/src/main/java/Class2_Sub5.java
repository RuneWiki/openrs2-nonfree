import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "Lclient!dc;")
	private Class34_Sub1 aClass34_Sub1_5;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
	private int anInt3477 = -1;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
	private int anInt3484 = 0;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "Z")
	private boolean aBoolean223 = false;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
	private int anInt3479 = -32768;

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "Lclient!lb;")
	private Class46_Sub1 aClass46_Sub1_2 = null;

	@OriginalMember(owner = "client!ld", name = "C", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
	private int anInt3497 = 0;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
	private int anInt3482 = -1;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
	private int anInt3488 = 0;

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "Z")
	private boolean aBoolean226 = false;

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
	private int anInt3489;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
	private int anInt3495;

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
	private int anInt3494;

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
	private int anInt3491;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "I")
	private int anInt3485;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	private int anInt3472;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	private int anInt3492;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	private int anInt3490;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
	private int anInt3487;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "Lclient!d;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
	private int anInt3499;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(IIIIIIIZLclient!hd;)V")
	public Class2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) Class2 arg8) {
		this.anInt3489 = arg2;
		this.anInt3495 = arg0;
		this.anInt3494 = arg4;
		this.anInt3491 = arg3;
		this.anInt3485 = arg5;
		this.anInt3472 = arg1;
		if (arg8 != null) {
			this.aBoolean223 = true;
			if (arg8 instanceof Class2_Sub5) {
				@Pc(61) Class2_Sub5 local61 = (Class2_Sub5) arg8;
				if (Static294.aBoolean367) {
					local61.method2524();
				}
				this.anInt3492 = local61.anInt3492;
				this.anInt3490 = local61.anInt3490;
				this.anInt3487 = local61.anInt3487;
				this.aClass32_2 = local61.aClass32_2;
				this.anInt3499 = local61.anInt3499;
			} else if (Static294.aBoolean367) {
				@Pc(96) Class92 local96 = Static166.method2725(this.anInt3495);
				if (local96.anIntArray300 != null) {
					local96 = local96.method2323();
				}
				if (local96 != null) {
					Static295.method4529(local96, this.anInt3485, 0, this.anInt3494, this.anInt3472, this.anInt3491, this.anInt3489, 0);
				}
			}
		}
		if (this.aBoolean223) {
			this.method2528(arg6);
		}
		if (Static294.aBoolean367 && arg8 != null) {
			this.method2526(true);
		}
	}

	@OriginalMember(owner = "client!ld", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass34_Sub1_5 != null) {
			this.aClass34_Sub1_5.method862();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIIJILclient!dc;)V")
	@Override
	public void method3951(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class34_Sub1 arg10) {
		@Pc(3) Class2 local3 = this.method2527();
		if (local3 != null) {
			this.method2523(local3);
			local3.method3951(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass34_Sub1_5);
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(III)V")
	private void method2521(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		label85: while (true) {
			if (this.aClass32_2 == null) {
				if (this.aBoolean223) {
					return;
				}
				this.method2528(-1);
				if (this.aClass32_2 == null) {
					return;
				}
			}
			@Pc(36) int local36 = Static133.anInt3061 - this.anInt3492;
			if (local36 > 100 && this.aClass32_2.anInt968 > 0) {
				@Pc(55) int local55 = this.aClass32_2.anIntArray123.length - this.aClass32_2.anInt968;
				while (local55 > this.anInt3487 && this.aClass32_2.anIntArray121[this.anInt3487] < local36) {
					local36 -= this.aClass32_2.anIntArray121[this.anInt3487];
					this.anInt3487++;
				}
				if (local55 <= this.anInt3487) {
					@Pc(94) int local94 = 0;
					for (@Pc(96) int local96 = local55; local96 < this.aClass32_2.anIntArray123.length; local96++) {
						local94 += this.aClass32_2.anIntArray121[local96];
					}
					local36 %= local94;
				}
				this.anInt3490 = this.anInt3487 + 1;
				if (this.anInt3490 >= this.aClass32_2.anIntArray123.length) {
					this.anInt3490 -= this.aClass32_2.anInt968;
					if (this.anInt3490 < 0 || this.anInt3490 >= this.aClass32_2.anIntArray123.length) {
						this.anInt3490 = -1;
					}
				}
			}
			while (this.aClass32_2.anIntArray121[this.anInt3487] < local36) {
				Static154.method2507(false, arg1, arg0, this.anInt3487, this.aClass32_2);
				local36 -= this.aClass32_2.anIntArray121[this.anInt3487];
				this.anInt3487++;
				if (this.aClass32_2.anIntArray123.length <= this.anInt3487) {
					this.anInt3487 -= this.aClass32_2.anInt968;
					if (this.anInt3487 < 0 || this.aClass32_2.anIntArray123.length <= this.anInt3487) {
						this.aClass32_2 = null;
						continue label85;
					}
				}
				this.anInt3490 = this.anInt3487 + 1;
				if (this.aClass32_2.anIntArray123.length <= this.anInt3490) {
					this.anInt3490 -= this.aClass32_2.anInt968;
					if (this.anInt3490 < 0 || this.anInt3490 >= this.aClass32_2.anIntArray123.length) {
						this.anInt3490 = -1;
					}
				}
			}
			this.anInt3499 = local36;
			this.anInt3492 = Static133.anInt3061 - local36;
			return;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()I")
	@Override
	public int method3948() {
		return this.anInt3479;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(1) Class2 local1 = null;
		if (Static294.aBoolean367) {
			local1 = this.method2526(true);
		} else {
			this.method2521(arg4, arg3);
		}
		if (!this.aBoolean226) {
			if (local1 == null) {
				local1 = this.method2527();
			}
			if (local1 == null) {
				return;
			}
			this.method2523(local1);
		}
		if (this.aClass34_Sub1_5 != null) {
			this.aClass34_Sub1_5.method860(arg0, arg1, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLclient!hd;)V")
	private void method2523(@OriginalArg(1) Class2 arg0) {
		@Pc(36) Class92 local36;
		if (Static294.aBoolean367) {
			@Pc(16) Class2_Sub1_Sub1 local16 = (Class2_Sub1_Sub1) arg0;
			if ((this.aClass34_Sub1_5 == null || this.aClass34_Sub1_5.aBoolean73) && (local16.aClass135Array1 != null || local16.aClass86Array1 != null)) {
				local36 = Static166.method2725(this.anInt3495);
				if (local36.anIntArray300 != null) {
					local36 = local36.method2323();
				}
				if (local36 != null) {
					this.aClass34_Sub1_5 = new Class34_Sub1(Static133.anInt3061, local36.anInt3227, local36.anInt3182);
				}
			}
			if (this.aClass34_Sub1_5 != null) {
				this.aClass34_Sub1_5.method858(local16.aClass135Array1, local16.aClass86Array1, false, local16.anIntArray6, local16.anIntArray9, local16.anIntArray4);
			}
		} else {
			@Pc(81) Class2_Sub1_Sub2 local81 = (Class2_Sub1_Sub2) arg0;
			if ((this.aClass34_Sub1_5 == null || this.aClass34_Sub1_5.aBoolean73) && (local81.aClass135Array2 != null || local81.aClass86Array2 != null)) {
				local36 = Static166.method2725(this.anInt3495);
				if (local36.anIntArray300 != null) {
					local36 = local36.method2323();
				}
				if (local36 != null) {
					this.aClass34_Sub1_5 = new Class34_Sub1(Static133.anInt3061, local36.anInt3227, local36.anInt3182);
				}
			}
			if (this.aClass34_Sub1_5 != null) {
				this.aClass34_Sub1_5.method858(local81.aClass135Array2, local81.aClass86Array2, false, local81.anIntArray61, local81.anIntArray60, local81.anIntArray67);
			}
		}
		this.aBoolean226 = true;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
	public void method2524() {
		if (this.aClass46_Sub1_2 != null) {
			Static177.method2837(this.aClass46_Sub1_2, this.anInt3484, this.anInt3488, this.anInt3497);
			this.aClass46_Sub1_2 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)Lclient!hd;")
	private Class2 method2526(@OriginalArg(1) boolean arg0) {
		@Pc(8) boolean local8 = Static299.anIntArrayArrayArray14 != Static46.anIntArrayArrayArray1;
		@Pc(13) Class92 local13 = Static166.method2725(this.anInt3495);
		if (local13.anIntArray300 != null) {
			local13 = local13.method2323();
		}
		if (local13 == null) {
			if (Static294.aBoolean367 && !local8) {
				this.method2524();
			}
			this.anInt3477 = this.anInt3487;
			this.anInt3482 = -1;
			return null;
		}
		if (!this.aBoolean223 && local13.anInt3230 != this.anInt3482) {
			this.method2528(-1);
		}
		@Pc(62) int local62 = this.anInt3489 & 0x3;
		@Pc(71) int local71;
		@Pc(74) int local74;
		if (local62 == 1 || local62 == 3) {
			local74 = local13.anInt3227;
			local71 = local13.anInt3182;
		} else {
			local71 = local13.anInt3227;
			local74 = local13.anInt3182;
		}
		@Pc(89) int local89 = this.anInt3494 + (local71 >> 1);
		@Pc(96) int local96 = this.anInt3485 + (local74 >> 1);
		@Pc(105) int local105 = this.anInt3494 + (local71 + 1 >> 1);
		@Pc(114) int local114 = this.anInt3485 + (local74 + 1 >> 1);
		this.method2521(local96 * 128, local89 * 128);
		@Pc(169) boolean local169 = !local8 && local13.aBoolean204 && (this.anInt3482 != local13.anInt3230 || (this.anInt3477 != this.anInt3487 || this.aClass32_2 != null && (this.aClass32_2.aBoolean67 || Static150.aBoolean218) && this.anInt3490 != this.anInt3487) && Static208.anInt4490 >= 2);
		if (arg0 && !local169) {
			this.anInt3482 = local13.anInt3230;
			this.anInt3477 = this.anInt3487;
			return null;
		}
		@Pc(189) int[][] local189 = Static46.anIntArrayArrayArray1[this.anInt3491];
		@Pc(215) int local215 = local189[local105][local114] + local189[local105][local96] + local189[local89][local96] + local189[local89][local114] >> 2;
		@Pc(224) int local224 = (this.anInt3494 << 7) + (local71 << 6);
		@Pc(233) int local233 = (local74 << 6) + (this.anInt3485 << 7);
		@Pc(236) int[][] local236 = null;
		if (local8) {
			local236 = Static299.anIntArrayArrayArray14[0];
		} else if (this.anInt3491 < 3) {
			local236 = Static46.anIntArrayArrayArray1[this.anInt3491 + 1];
		}
		if (Static294.aBoolean367 && local169) {
			Static177.method2837(this.aClass46_Sub1_2, this.anInt3484, this.anInt3488, this.anInt3497);
		}
		@Pc(277) boolean local277 = this.aClass46_Sub1_2 == null;
		@Pc(309) Class128 local309;
		if (this.aClass32_2 == null) {
			local309 = local13.method2325(local277 ? Static120.aClass46_Sub1_5 : this.aClass46_Sub1_2, local189, false, local236, this.anInt3472, local169, local224, this.anInt3489, local233, local215);
		} else {
			local309 = local13.method2336(local215, local236, this.aClass32_2, this.anInt3489, local233, local224, this.anInt3487, local189, local277 ? Static120.aClass46_Sub1_5 : this.aClass46_Sub1_2, local169, this.anInt3472, this.anInt3499, this.anInt3490);
		}
		if (local309 == null) {
			this.anInt3482 = local13.anInt3230;
			this.anInt3477 = this.anInt3487;
			return null;
		}
		if (Static294.aBoolean367 && local169) {
			if (local277) {
				Static120.aClass46_Sub1_5 = local309.aClass46_Sub1_4;
			}
			@Pc(358) int local358 = 0;
			if (this.anInt3491 != 0) {
				@Pc(368) int[][] local368 = Static46.anIntArrayArrayArray1[0];
				local358 = local215 - (local368[local105][local114] + local368[local89][local114] + local368[local89][local96] + local368[local105][local96] >> 2);
			}
			@Pc(400) Class46_Sub1 local400 = local309.aClass46_Sub1_4;
			if (this.aBoolean225 && Static177.method2835(local400, local224, local358, local233)) {
				this.aBoolean225 = false;
			}
			if (!this.aBoolean225) {
				Static177.method2849(local400, local224, local358, local233);
				this.anInt3484 = local224;
				this.anInt3497 = local233;
				this.aClass46_Sub1_2 = local400;
				if (local277) {
					Static120.aClass46_Sub1_5 = null;
				}
				this.anInt3488 = local358;
			}
		}
		this.anInt3482 = local13.anInt3230;
		this.anInt3477 = this.anInt3487;
		return local309.aClass2_8;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Lclient!hd;")
	public Class2 method2527() {
		return this.method2526(false);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)V")
	private void method2528(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = arg0;
		@Pc(5) boolean local5 = false;
		if (arg0 == -1) {
			@Pc(17) Class92 local17 = Static166.method2725(this.anInt3495);
			@Pc(19) Class92 local19 = local17;
			if (local17.anIntArray300 != null) {
				local17 = local17.method2323();
			}
			if (local17 == null) {
				return;
			}
			if (local17 == local19) {
				local19 = null;
			}
			if (local17.anIntArray295 != null) {
				if (this.aClass32_2 != null && local17.method2340(this.aClass32_2.anInt974)) {
					return;
				}
				local3 = local17.method2335();
				if (local17.anInt3230 != this.anInt3482) {
					local5 = local17.aBoolean198;
				}
			} else if (local17.anInt3180 == -1) {
				if (local19 != null && local19.anIntArray295 != null) {
					if (this.aClass32_2 != null && local19.method2340(this.aClass32_2.anInt974)) {
						return;
					}
					local3 = local19.method2335();
					if (local19.anInt3230 != this.anInt3482) {
						local5 = local19.aBoolean198;
					}
				} else if (local19 != null && local19.anInt3180 != -1 && this.anInt3482 != local19.anInt3230) {
					local3 = local19.anInt3180;
					local5 = local19.aBoolean198;
				}
			} else if (this.anInt3482 != local17.anInt3230) {
				local3 = local17.anInt3180;
				local5 = local17.aBoolean198;
			}
		}
		if (local3 == -1) {
			this.aClass32_2 = null;
			return;
		}
		if (this.aClass32_2 == null || local3 != this.aClass32_2.anInt974) {
			this.aClass32_2 = Static202.method3231(local3);
		} else if (this.aClass32_2.anInt972 == 0) {
			return;
		}
		if (local5) {
			this.anInt3487 = (int) (Math.random() * (double) this.aClass32_2.anIntArray123.length);
			this.anInt3499 = (int) ((double) this.aClass32_2.anIntArray121[this.anInt3487] * Math.random()) + 1;
		} else {
			this.anInt3499 = 1;
			this.anInt3487 = 0;
		}
		this.anInt3490 = this.anInt3487 + 1;
		if (this.anInt3490 < 0 || this.aClass32_2.anIntArray123.length <= this.anInt3490) {
			this.anInt3490 = -1;
		}
		this.anInt3492 = Static133.anInt3061 - this.anInt3499;
	}
}
