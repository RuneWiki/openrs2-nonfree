import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class25_Sub1_Sub1 extends Class25_Sub1 {

	@OriginalMember(owner = "client!c", name = "yc", descriptor = "Ljava/lang/String;")
	public String aString26;

	@OriginalMember(owner = "client!c", name = "zc", descriptor = "Lclient!sh;")
	public Class147 aClass147_2;

	@OriginalMember(owner = "client!c", name = "mc", descriptor = "I")
	public int anInt712 = 0;

	@OriginalMember(owner = "client!c", name = "pc", descriptor = "I")
	public int anInt715 = 0;

	@OriginalMember(owner = "client!c", name = "uc", descriptor = "I")
	public int anInt719 = -1;

	@OriginalMember(owner = "client!c", name = "qc", descriptor = "I")
	public int anInt716 = -1;

	@OriginalMember(owner = "client!c", name = "nc", descriptor = "I")
	public int anInt713 = 0;

	@OriginalMember(owner = "client!c", name = "lc", descriptor = "I")
	public int anInt711 = -1;

	@OriginalMember(owner = "client!c", name = "Bc", descriptor = "I")
	public int anInt724 = -1;

	@OriginalMember(owner = "client!c", name = "Gc", descriptor = "I")
	public int anInt729 = -1;

	@OriginalMember(owner = "client!c", name = "xc", descriptor = "I")
	public int anInt722 = 0;

	@OriginalMember(owner = "client!c", name = "Kc", descriptor = "Z")
	public boolean aBoolean40 = false;

	@OriginalMember(owner = "client!c", name = "Mc", descriptor = "I")
	public int anInt734 = -1;

	@OriginalMember(owner = "client!c", name = "Cc", descriptor = "I")
	public int anInt725 = 255;

	@OriginalMember(owner = "client!c", name = "Oc", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!c", name = "Jc", descriptor = "I")
	public int anInt732 = -1;

	@OriginalMember(owner = "client!c", name = "Tc", descriptor = "I")
	public int anInt739 = 0;

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(I)I")
	@Override
	public int method1243() {
		return this.aClass147_2 == null || this.aClass147_2.anInt5302 == -1 ? super.method1243() : Static38.method880(this.aClass147_2.anInt5302).anInt5188;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIZ)V")
	public void method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		super.method1235(arg2, this.method1243(), arg1, arg0);
	}

	@OriginalMember(owner = "client!c", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIBIILclient!ll;IIIIIILclient!lf;II)V")
	private void method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class95_Sub1 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class25_Sub2 arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(12) int local12 = arg11 * arg11 + arg4 * arg4;
		if (local12 < 16 || arg2 < local12) {
			return;
		}
		@Pc(37) int local37 = (int) (Math.atan2((double) arg11, (double) arg4) * 325.949D) & 0x7FF;
		@Pc(49) Class25_Sub2 local49 = Static240.method4147(arg12, this.anInt1635, arg10, local37, this.anInt1604, this.anInt1603);
		if (local49 == null) {
			return;
		}
		if (!Static296.aBoolean335) {
			local49.method4768(0, arg3, arg0, arg1, arg6, arg14, arg13, arg8, -1L, arg9, arg5);
			return;
		}
		@Pc(71) float local71 = Static296.method4829();
		@Pc(73) float local73 = Static296.method4831();
		Static296.method4808();
		Static296.method4830(local71, local73 - 150.0F);
		local49.method4768(0, arg3, arg0, arg1, arg6, arg14, arg13, arg8, -1L, arg9, arg5);
		Static296.method4813();
		Static296.method4830(local71, local73);
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method1244() {
		return this.aClass147_2 != null;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!im;I)V")
	public void method496(@OriginalArg(0) Class1_Sub16 arg0) {
		arg0.anInt3328 = 0;
		@Pc(12) int local12 = arg0.method2655();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(20) int local20 = super.method1243();
		this.method1239((local12 >> 3 & 0x7) + 1);
		@Pc(32) int local32 = -1;
		@Pc(43) boolean local43 = (local12 & 0x4) != 0;
		this.aByte2 = (byte) (local12 >> 6 & 0x3);
		this.anInt1635 += (this.method1243() - local20) * 64;
		this.anInt1604 += (this.method1243() - local20) * 64;
		this.anInt732 = arg0.method2633();
		this.anInt711 = arg0.method2633();
		@Pc(90) int[] local90 = new int[12];
		this.anInt713 = 0;
		@Pc(112) int local112;
		@Pc(125) int local125;
		@Pc(131) int local131;
		@Pc(173) int local173;
		for (@Pc(103) int local103 = 0; local103 < 12; local103++) {
			local112 = arg0.method2655();
			if (local112 == 0) {
				local90[local103] = 0;
			} else {
				local125 = arg0.method2655();
				local131 = (local112 << 8) + local125;
				if (local103 == 0 && local131 == 65535) {
					local32 = arg0.method2652();
					this.anInt713 = arg0.method2655();
					break;
				}
				if (local131 >= 32768) {
					local131 = Static265.anIntArray572[local131 - 32768];
					local90[local103] = local131 | 0x40000000;
					local173 = Static238.method4099(local131).anInt5063;
					if (local173 != 0) {
						this.anInt713 = local173;
					}
				} else {
					local90[local103] = Integer.MIN_VALUE | local131 - 256;
				}
			}
		}
		@Pc(194) int[] local194 = new int[5];
		for (local112 = 0; local112 < 5; local112++) {
			local125 = arg0.method2655();
			if (local125 < 0 || Static202.aShortArrayArray8[local112].length <= local125) {
				local125 = 0;
			}
			local194[local112] = local125;
		}
		this.anInt1642 = arg0.method2652();
		@Pc(237) long local237 = arg0.method2602();
		this.aString26 = Static173.method3185(local237);
		this.anInt715 = arg0.method2655();
		if (local43) {
			this.anInt739 = arg0.method2652();
			this.anInt722 = this.anInt715;
			this.anInt716 = -1;
		} else {
			this.anInt739 = 0;
			this.anInt722 = arg0.method2655();
			this.anInt716 = arg0.method2655();
			if (this.anInt716 == 255) {
				this.anInt716 = -1;
			}
		}
		local131 = this.anInt712;
		this.anInt712 = arg0.method2655();
		if (this.anInt712 == 0) {
			Static253.method4313(this);
		} else {
			local173 = this.anInt734;
			@Pc(301) int local301 = this.anInt719;
			@Pc(304) int local304 = this.anInt724;
			@Pc(307) int local307 = this.anInt729;
			@Pc(310) int local310 = this.anInt725;
			this.anInt734 = arg0.method2652();
			this.anInt724 = arg0.method2652();
			this.anInt719 = arg0.method2652();
			this.anInt729 = arg0.method2652();
			this.anInt725 = arg0.method2655();
			if (this.anInt712 != local131 || local173 != this.anInt734 || this.anInt724 != local304 || local301 != this.anInt719 || this.anInt729 != local307 || local310 != this.anInt725) {
				Static9.method218(this);
			}
		}
		if (this.aClass147_2 == null) {
			this.aClass147_2 = new Class147();
		}
		local173 = this.aClass147_2.anInt5302;
		this.aClass147_2.method4167(local32, local90, local194, this.anInt1642, local16 == 1);
		if (local173 != local32) {
			this.anInt1635 = this.anIntArray172[0] * 128 + this.method1243() * 64;
			this.anInt1604 = this.anIntArray173[0] * 128 + this.method1243() * 64;
		}
		if (this.aClass95_Sub1_3 != null) {
			this.aClass95_Sub1_3.method2873();
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!c", name = "f", descriptor = "(B)Ljava/lang/String;")
	public String method498() {
		@Pc(6) String local6 = this.aString26;
		if (Static113.aStringArray10 != null) {
			local6 = Static113.aStringArray10[this.aByte2] + local6;
		}
		if (Static247.aStringArray31 != null) {
			local6 = local6 + Static247.aStringArray31[this.aByte2];
		}
		return local6;
	}

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(B)I")
	@Override
	protected int method1231() {
		return this.anInt1642;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIJILclient!ll;)V")
	@Override
	public void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class95_Sub1 arg10) {
		if (this.aClass147_2 == null) {
			return;
		}
		@Pc(27) Class163 local27 = this.anInt1625 != -1 && this.anInt1653 == 0 ? Static115.method1895(this.anInt1625) : null;
		@Pc(56) Class163 local56 = this.anInt1646 == -1 || this.aBoolean40 || this.anInt1646 == this.method1232().anInt4578 && local27 != null ? null : Static115.method1895(this.anInt1646);
		@Pc(78) Class25_Sub2 local78 = this.aClass147_2.method4166(this.anInt1677, this.aClass86Array3, local27, this.anInt1619, this.anInt1614, this.anInt1608, this.anInt1648, this.anInt1640, local56);
		@Pc(81) int local81 = Static251.method4275();
		if (Static296.aBoolean335 && Static98.anInt2197 < 96 && local81 > 50) {
			Static193.method3434();
		}
		@Pc(103) int local103;
		if (Static277.anInt5947 != 0 && local81 < 50) {
			local103 = 50 - local81;
			while (Static271.anInt5848 < local103) {
				Static87.aByteArrayArray42[Static271.anInt5848] = new byte[102400];
				Static271.anInt5848++;
			}
			while (Static271.anInt5848 > local103) {
				Static271.anInt5848--;
				Static87.aByteArrayArray42[Static271.anInt5848] = null;
			}
		}
		if (local78 == null) {
			return;
		}
		this.anInt1649 = local78.method4773();
		@Pc(187) Class25_Sub2 local187;
		if (Static263.aBoolean302 && (this.aClass147_2.anInt5302 == -1 || Static38.method880(this.aClass147_2.anInt5302).aBoolean280)) {
			local187 = Static218.method3882(local56 == null ? this.anInt1608 : this.anInt1640, arg0, 0, this.anInt1603, this.anInt1635, local78, this.anInt1604, 0, 160, this.aBoolean86, 240, 1, local56 == null ? local27 : local56);
			if (Static296.aBoolean335) {
				@Pc(191) float local191 = Static296.method4829();
				@Pc(193) float local193 = Static296.method4831();
				Static296.method4808();
				Static296.method4830(local191, local193 - 150.0F);
				local187.method4768(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
				Static296.method4813();
				Static296.method4830(local191, local193);
			} else {
				local187.method4768(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, null);
			}
		}
		if (Static239.aClass25_Sub1_Sub1_2 == this) {
			for (local103 = Static129.aClass81Array1.length - 1; local103 >= 0; local103--) {
				@Pc(248) Class81 local248 = Static129.aClass81Array1[local103];
				if (local248 != null && local248.anInt3017 != -1) {
					@Pc(287) int local287;
					@Pc(298) int local298;
					if (local248.anInt3022 == 1 && local248.anInt3010 >= 0 && local248.anInt3010 < Static27.aClass25_Sub1_Sub2Array1.length) {
						@Pc(273) Class25_Sub1_Sub2 local273 = Static27.aClass25_Sub1_Sub2Array1[local248.anInt3010];
						if (local273 != null) {
							local287 = local273.anInt1635 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
							local298 = local273.anInt1604 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
							this.method495(arg2, arg3, 360000, arg1, local298, null, arg4, arg0, arg7, arg9, local248.anInt3017, local287, local78, arg6, arg5);
						}
					}
					if (local248.anInt3022 == 2) {
						local287 = (-Static266.anInt5790 + local248.anInt3012) * 4 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
						local298 = local248.anInt3009 * 4;
						local298 *= local298;
						@Pc(365) int local365 = (-Static82.anInt1972 + local248.anInt3020) * 4 + 2 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
						this.method495(arg2, arg3, local298, arg1, local287, null, arg4, arg0, arg7, arg9, local248.anInt3017, local365, local78, arg6, arg5);
					}
					if (local248.anInt3022 == 10 && local248.anInt3010 >= 0 && local248.anInt3010 < Static271.aClass25_Sub1_Sub1Array1.length) {
						@Pc(401) Class25_Sub1_Sub1 local401 = Static271.aClass25_Sub1_Sub1Array1[local248.anInt3010];
						if (local401 != null) {
							local287 = local401.anInt1635 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1635 / 32;
							local298 = local401.anInt1604 / 32 - Static239.aClass25_Sub1_Sub1_2.anInt1604 / 32;
							this.method495(arg2, arg3, 360000, arg1, local298, null, arg4, arg0, arg7, arg9, local248.anInt3017, local287, local78, arg6, arg5);
						}
					}
				}
			}
		}
		this.method1241(local78);
		this.method1238(local78, arg0);
		local187 = null;
		if (!this.aBoolean40 && this.anInt1669 != -1 && this.anInt1616 != -1) {
			@Pc(480) Class139 local480 = Static43.method942(this.anInt1669);
			local187 = local480.method4030(this.anInt1645, this.anInt1671, this.anInt1616);
			if (local187 != null) {
				local187.method3474(0, -this.anInt1660, 0);
				if (local480.aBoolean276) {
					if (Static199.anInt4490 != 0) {
						local187.method3471(Static199.anInt4490);
					}
					if (Static242.anInt5299 != 0) {
						local187.method3464(Static242.anInt5299);
					}
					if (Static8.anInt4425 != 0) {
						local187.method3474(0, Static8.anInt4425, 0);
					}
				}
			}
		}
		@Pc(533) Class25_Sub2 local533 = null;
		if (!this.aBoolean40 && this.anObject5 != null) {
			if (this.anInt1651 <= Static32.anInt809) {
				this.anObject5 = null;
			}
			if (Static32.anInt809 >= this.anInt1637 && Static32.anInt809 < this.anInt1651) {
				if (this.anObject5 instanceof Class25_Sub4) {
					local533 = (Class25_Sub2) ((Class25_Sub4) this.anObject5).method3245();
				} else {
					local533 = (Class25_Sub2) this.anObject5;
				}
				local533.method3474(this.anInt1661 - this.anInt1635, -this.anInt1603 + this.anInt1674, this.anInt1673 - this.anInt1604);
				if (this.anInt1628 == 512) {
					local533.method3483();
				} else if (this.anInt1628 == 1024) {
					local533.method3490();
				} else if (this.anInt1628 == 1536) {
					local533.method3467();
				}
			}
		}
		if (Static296.aBoolean335) {
			local78.aBoolean232 = true;
			local78.method4768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass95_Sub1_3);
			if (local187 != null) {
				local187.aBoolean232 = true;
				local187.method4768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass95_Sub1_3);
			}
		} else {
			if (local187 != null) {
				local78 = ((Class25_Sub2_Sub2) local78).method3499(local187);
			}
			if (local533 != null) {
				local78 = ((Class25_Sub2_Sub2) local78).method3499(local533);
			}
			local78.aBoolean232 = true;
			local78.method4768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass95_Sub1_3);
		}
		if (local533 == null) {
			return;
		}
		if (this.anInt1628 == 512) {
			local533.method3467();
		} else if (this.anInt1628 == 1024) {
			local533.method3490();
		} else if (this.anInt1628 == 1536) {
			local533.method3483();
		}
		local533.method3474(this.anInt1635 - this.anInt1661, this.anInt1603 - this.anInt1674, this.anInt1604 - this.anInt1673);
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "()I")
	@Override
	public int method4773() {
		return this.anInt1649;
	}
}
