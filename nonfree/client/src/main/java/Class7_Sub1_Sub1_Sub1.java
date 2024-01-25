import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class7_Sub1_Sub1_Sub1 extends Class7_Sub1_Sub1 {

	@OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
	private int anInt501;

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "Lclient!th;")
	private Class7_Sub8 aClass7_Sub8_1;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!bl", name = "D", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!bl", name = "G", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!bl", name = "K", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
	private int anInt502;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lclient!th;IIIIIIIIIIIZ)V")
	public Class7_Sub1_Sub1_Sub1(@OriginalArg(0) Class7_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass7_Sub8_1 = arg0;
		super.anInt496 = arg1 << Static260.anInt4978;
		super.anInt494 = arg2 << Static260.anInt4978;
		super.anInt495 = arg3 << Static260.anInt4978;
		super.anInt500 = arg9;
		this.aShort9 = this.aShort7 = (short) arg8;
		super.anInt497 = arg10;
		super.anInt493 = arg11;
		this.aShort6 = (short) arg4;
		this.aShort8 = (short) arg5;
		this.aShort10 = (short) arg6;
		this.anInt502 = arg7;
		super.aByte10 = this.aClass7_Sub8_1.aClass218_1.aByte67;
		this.method383();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!th;IIIIIIIIIIIZ)V")
	public void method380(@OriginalArg(0) Class7_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean arg12) {
		this.aClass7_Sub8_1 = arg0;
		super.anInt496 = arg1 << Static260.anInt4978;
		super.anInt494 = arg2 << Static260.anInt4978;
		super.anInt495 = arg3 << Static260.anInt4978;
		super.anInt500 = arg9;
		this.aShort9 = this.aShort7 = (short) arg8;
		super.anInt497 = arg10;
		super.anInt493 = arg11;
		this.aShort6 = (short) arg4;
		this.aShort8 = (short) arg5;
		this.aShort10 = (short) arg6;
		this.anInt502 = arg7;
		super.aByte10 = this.aClass7_Sub8_1.aClass218_1.aByte67;
		this.method383();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(J)V")
	public void method381(@OriginalArg(0) long arg0) {
		@Pc(4) int local4 = super.anInt496 >> 19;
		@Pc(9) int local9 = super.anInt495 >> 19;
		@Pc(14) int local14 = super.anInt494 >> Static260.anInt4978;
		if (local14 > 0 || local14 < -65535 || local4 < 0 || local4 >= Static176.anInt3742 || local9 < 0 || local9 >= Static285.anInt5263) {
			this.method382();
			return;
		}
		@Pc(36) Class7_Sub3 local36 = this.aClass7_Sub8_1.aClass7_Sub3_6;
		@Pc(40) Class55 local40 = this.aClass7_Sub8_1.aClass55_1;
		@Pc(42) Class149[] local42 = Static128.aClass149Array1;
		@Pc(50) int local50 = local42[local36.anInt651].method5837(local4, local9);
		@Pc(66) int local66;
		if (local36.anInt651 < Static73.anInt1624 - 1) {
			local66 = local42[local36.anInt651 + 1].method5837(local4, local9);
		} else {
			local66 = local50 - 1024;
		}
		if (local40.aBoolean123) {
			if (local40.anInt1564 == -1 && local14 > local50) {
				this.method382();
				return;
			}
			if (local40.anInt1564 >= 0 && local14 > local42[local40.anInt1564].method5837(local4, local9)) {
				this.method382();
				return;
			}
			if (local40.anInt1585 == -1 && local14 < local66) {
				this.method382();
				return;
			}
			if (local40.anInt1585 >= 0 && local14 < local42[local40.anInt1585 + 1].method5837(local4, local9)) {
				this.method382();
				return;
			}
		}
		if (local4 >= local36.anInt648 && local4 <= local36.anInt647 && local9 >= local36.anInt649 && local9 <= local36.anInt652 && local14 <= local50 && local14 >= local66) {
			local36.aClass34_1.aClass180_1.method4498(this);
			return;
		}
		@Pc(152) int local152;
		for (local152 = Static73.anInt1624 - 1; local152 > 0 && local14 > local42[local152].method5837(local4, local9); local152--) {
		}
		if (local152 == Static73.anInt1624 - 1 && local42[local152].method5837(local4, local9) - local14 > 1024) {
			this.method382();
			return;
		}
		@Pc(190) Class188 local190 = Static45.aClass188ArrayArrayArray5[local152][local4][local9];
		if (local190 == null) {
			@Pc(205) boolean local205 = Static45.aClass188ArrayArrayArray5[0][local4][local9].aClass188_1 != null;
			if (local152 == 3 && local205) {
				this.method382();
				return;
			}
			for (@Pc(215) int local215 = 1; local215 <= local152; local215++) {
				if (Static45.aClass188ArrayArrayArray5[local215][local4][local9] == null) {
					local190 = Static45.aClass188ArrayArrayArray5[local215][local4][local9] = new Class188(local215, local4, local9);
					if (local205) {
						local190.aByte43++;
					}
				}
			}
		}
		if (local190.aClass34_2 == null) {
			local190.aClass34_2 = new Class34();
			local190.aByte46 = (byte) (arg0 & 0xFFL);
		} else if (local190.aByte46 != (byte) (arg0 & 0xFFL)) {
			local190.aClass34_2 = new Class34();
			local190.aByte46 = (byte) (arg0 & 0xFFL);
		}
		local190.aClass34_2.aClass180_1.method4498(this);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
	private void method382() {
		this.aClass7_Sub8_1.aClass7_Sub3_6.aClass7_Sub1_Sub1_Sub1Array1[this.aShort11] = null;
		Static222.aClass7_Sub1_Sub1_Sub1Array2[Static131.anInt2860] = this;
		Static131.anInt2860 = Static131.anInt2860 + 1 & 0x3FF;
		this.method5398();
		this.method373();
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()V")
	private void method383() {
		@Pc(4) int local4 = this.aClass7_Sub8_1.aClass7_Sub3_6.anInt645;
		if (this.aClass7_Sub8_1.aClass7_Sub3_6.aClass7_Sub1_Sub1_Sub1Array1[local4] != null) {
			this.aClass7_Sub8_1.aClass7_Sub3_6.aClass7_Sub1_Sub1_Sub1Array1[local4].method382();
		}
		this.aClass7_Sub8_1.aClass7_Sub3_6.aClass7_Sub1_Sub1_Sub1Array1[local4] = this;
		this.aShort11 = (short) this.aClass7_Sub8_1.aClass7_Sub3_6.anInt645;
		this.aClass7_Sub8_1.aClass7_Sub3_6.anInt645 = local4 + 1 & 0x1FFF;
		this.aClass7_Sub8_1.aClass199_5.method4898(this);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(JI)V")
	public void method384(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		this.aShort7 = (short) (this.aShort7 - arg1);
		if (this.aShort7 <= 0) {
			this.method382();
			return;
		}
		@Pc(17) int local17 = super.anInt496 >> Static260.anInt4978;
		@Pc(22) int local22 = super.anInt494 >> Static260.anInt4978;
		@Pc(27) int local27 = super.anInt495 >> Static260.anInt4978;
		@Pc(31) Class7_Sub3 local31 = this.aClass7_Sub8_1.aClass7_Sub3_6;
		@Pc(35) Class55 local35 = this.aClass7_Sub8_1.aClass55_1;
		@Pc(65) int local65;
		@Pc(82) int local82;
		@Pc(99) int local99;
		if (local35.anInt1584 != 0) {
			if (this.aShort9 - this.aShort7 <= local35.anInt1567) {
				local65 = (super.anInt500 >> 8 & 0xFF00) + (this.anInt501 >> 16 & 0xFF) + local35.anInt1572 * arg1;
				local82 = (super.anInt500 & 0xFF00) + (this.anInt501 >> 8 & 0xFF) + local35.anInt1577 * arg1;
				local99 = ((super.anInt500 & 0xFF) << 8) + (this.anInt501 & 0xFF) + local35.anInt1600 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				if (local82 < 0) {
					local82 = 0;
				} else if (local82 > 65535) {
					local82 = 65535;
				}
				if (local99 < 0) {
					local99 = 0;
				} else if (local99 > 65535) {
					local99 = 65535;
				}
				super.anInt500 &= 0xFF000000;
				super.anInt500 |= ((local65 & 0xFF00) << 8) + (local82 & 0xFF00) + (local99 >> 8 & 0xFF);
				this.anInt501 &= 0xFF000000;
				this.anInt501 |= ((local65 & 0xFF) << 16) + ((local82 & 0xFF) << 8) + (local99 & 0xFF);
			}
			if (this.aShort9 - this.aShort7 <= local35.anInt1589) {
				local65 = (super.anInt500 >> 16 & 0xFF00) + (this.anInt501 >> 24 & 0xFF) + local35.anInt1569 * arg1;
				if (local65 < 0) {
					local65 = 0;
				} else if (local65 > 65535) {
					local65 = 65535;
				}
				super.anInt500 &= 0xFFFFFF;
				super.anInt500 |= (local65 & 0xFF00) << 16;
				this.anInt501 &= 0xFFFFFF;
				this.anInt501 |= (local65 & 0xFF) << 24;
			}
		}
		if (local35.anInt1581 != -1 && this.aShort9 - this.aShort7 <= local35.anInt1565) {
			this.anInt502 += local35.anInt1578 * arg1;
		}
		if (local35.anInt1604 != -1 && this.aShort9 - this.aShort7 <= local35.anInt1563) {
			super.anInt497 += local35.anInt1591 * arg1;
		}
		local65 = this.aShort6;
		local82 = this.aShort8;
		local99 = this.aShort10;
		@Pc(303) boolean local303 = false;
		@Pc(313) int local313;
		@Pc(319) int local319;
		@Pc(325) int local325;
		@Pc(340) int local340;
		@Pc(348) long local348;
		if (local35.anInt1612 == 1) {
			local313 = local17 - this.aClass7_Sub8_1.anInt6200;
			local319 = local22 - this.aClass7_Sub8_1.anInt6202;
			local325 = local27 - this.aClass7_Sub8_1.anInt6182;
			local340 = (int) Math.sqrt((double) (local313 * local313 + local319 * local319 + local325 * local325));
			local348 = local35.anInt1603 * local340 * arg1;
			this.anInt502 = (int) ((long) this.anInt502 - ((long) this.anInt502 * local348 >> 18));
		} else if (local35.anInt1612 == 2) {
			local313 = local17 - this.aClass7_Sub8_1.anInt6200;
			local319 = local22 - this.aClass7_Sub8_1.anInt6202;
			local325 = local27 - this.aClass7_Sub8_1.anInt6182;
			local340 = local313 * local313 + local319 * local319 + local325 * local325;
			local348 = local35.anInt1603 * local340 * arg1;
			this.anInt502 = (int) ((long) this.anInt502 - ((long) this.anInt502 * local348 >> 28));
		}
		@Pc(444) int local444;
		@Pc(478) int local478;
		@Pc(491) long local491;
		@Pc(501) int local501;
		@Pc(537) int local537;
		if (local35.anIntArray119 != null) {
			@Pc(426) Class2 local426 = local31.aClass238_4.aClass2_225;
			for (@Pc(429) Class2 local429 = local426.aClass2_244; local429 != local426; local429 = local429.aClass2_244) {
				@Pc(433) Class2_Sub7_Sub6 local433 = (Class2_Sub7_Sub6) local429;
				@Pc(436) Class31 local436 = local433.aClass31_1;
				if (local436.anInt662 != 1) {
					@Pc(442) boolean local442 = false;
					for (local444 = 0; local444 < local35.anIntArray119.length; local444++) {
						if (local35.anIntArray119[local444] == local436.anInt669) {
							local442 = true;
							break;
						}
					}
					if (local442) {
						@Pc(468) int local468 = local17 - local433.anInt2746;
						@Pc(473) int local473 = local22 - local433.anInt2743;
						local478 = local27 - local433.anInt2742;
						local491 = local468 * local468 + local473 * local473 + local478 * local478;
						if (local491 <= local436.aLong17) {
							local501 = (int) Math.sqrt((double) local491);
							if (local501 == 0) {
								local501 = 1;
							}
							@Pc(529) long local529 = (long) (local468 * local433.anInt2747 + local473 * local436.anInt679 + local478 * local433.anInt2745) * 65535L / (long) (local436.anInt664 * local501);
							if (local529 >= (long) local436.anInt665) {
								local537 = 0;
								if (local436.anInt677 == 1) {
									local537 = (local501 >> 4) * local436.anInt666;
								} else if (local436.anInt677 == 2) {
									local537 = (local501 >> 4) * (local501 >> 4) * local436.anInt666;
								}
								if (local436.anInt673 != 0) {
									@Pc(643) int local643 = (local468 << 15) / local501 * local436.anInt664;
									@Pc(652) int local652 = (local473 << 15) / local501 * local436.anInt664;
									@Pc(661) int local661 = (local478 << 15) / local501 * local436.anInt664;
									if (local436.anInt667 == 0) {
										local65 += local643 * arg1 >> 15;
										local82 += local652 * arg1 >> 15;
										local99 += local661 * arg1 >> 15;
										local303 = true;
									} else {
										super.anInt496 += local643 * arg1 >> 15;
										super.anInt494 += local652 * arg1 >> 15;
										super.anInt495 += local661 * arg1 >> 15;
									}
								} else if (local436.anInt667 == 0) {
									local65 += (local433.anInt2747 - local537) * arg1;
									local82 += (local436.anInt679 - local537) * arg1;
									local99 += (local433.anInt2745 - local537) * arg1;
									local303 = true;
								} else {
									super.anInt496 += (local433.anInt2747 - local537) * arg1;
									super.anInt494 += (local436.anInt679 - local537) * arg1;
									super.anInt495 += (local433.anInt2745 - local537) * arg1;
								}
							}
						}
					}
				}
			}
		}
		if (local35.anIntArray116 != null) {
			for (local313 = 0; local313 < local35.anIntArray116.length; local313++) {
				@Pc(743) Class2_Sub7_Sub6 local743 = (Class2_Sub7_Sub6) Static180.aClass12_1.method107((long) local35.anIntArray116[local313]);
				while (local743 != null) {
					@Pc(747) Class31 local747 = local743.aClass31_1;
					local340 = local17 - local743.anInt2746;
					@Pc(757) int local757 = local22 - local743.anInt2743;
					local444 = local27 - local743.anInt2742;
					@Pc(775) long local775 = (long) (local340 * local340 + local757 * local757 + local444 * local444);
					if (local775 > local747.aLong17) {
						local743 = (Class2_Sub7_Sub6) Static180.aClass12_1.method102();
					} else {
						local478 = (int) Math.sqrt((double) local775);
						if (local478 == 0) {
							local478 = 1;
						}
						local491 = (long) (local340 * local743.anInt2747 + local757 * local747.anInt679 + local444 * local743.anInt2745) * 65535L / (long) (local747.anInt664 * local478);
						if (local491 < (long) local747.anInt665) {
							local743 = (Class2_Sub7_Sub6) Static180.aClass12_1.method102();
						} else {
							local501 = 0;
							if (local747.anInt677 == 1) {
								local501 = (local478 >> 4) * local747.anInt666;
							} else if (local747.anInt677 == 2) {
								local501 = (local478 >> 4) * (local478 >> 4) * local747.anInt666;
							}
							if (local747.anInt673 != 0) {
								@Pc(939) int local939 = (local340 << 15) / local478 * local747.anInt664;
								@Pc(948) int local948 = (local757 << 15) / local478 * local747.anInt664;
								local537 = (local444 << 15) / local478 * local747.anInt664;
								if (local747.anInt667 == 0) {
									local65 += local939 * arg1 >> 15;
									local82 += local948 * arg1 >> 15;
									local99 += local537 * arg1 >> 15;
									local303 = true;
								} else {
									super.anInt496 += local939 * arg1 >> 15;
									super.anInt494 += local948 * arg1 >> 15;
									super.anInt495 += local537 * arg1 >> 15;
								}
							} else if (local747.anInt667 == 0) {
								local65 += (local743.anInt2747 - local501) * arg1;
								local82 += (local747.anInt679 - local501) * arg1;
								local99 += (local743.anInt2745 - local501) * arg1;
								local303 = true;
							} else {
								super.anInt496 += (local743.anInt2747 - local501) * arg1;
								super.anInt494 += (local747.anInt679 - local501) * arg1;
								super.anInt495 += (local743.anInt2745 - local501) * arg1;
							}
							local743 = (Class2_Sub7_Sub6) Static180.aClass12_1.method102();
						}
					}
				}
			}
		}
		if (local35.anIntArray117 != null) {
			if (local35.anIntArray120 == null) {
				local35.anIntArray120 = new int[local35.anIntArray117.length];
				for (local313 = 0; local313 < local35.anIntArray117.length; local313++) {
					Static329.method5294(local35.anIntArray117[local313]);
					local35.anIntArray120[local313] = ((Class2_Sub16) Static337.aClass243_30.method5967((long) local35.anIntArray117[local313])).anInt2601;
				}
			}
			for (local313 = 0; local313 < local35.anIntArray120.length; local313++) {
				@Pc(1082) Class31 local1082 = Static197.aClass31Array1[local35.anIntArray120[local313]];
				if (local1082.anInt667 == 0) {
					local65 += local1082.anInt680 * arg1;
					local82 += local1082.anInt679 * arg1;
					local99 += local1082.anInt678 * arg1;
					local303 = true;
				} else {
					super.anInt496 += local1082.anInt680 * arg1;
					super.anInt494 += local1082.anInt679 * arg1;
					super.anInt495 += local1082.anInt678 * arg1;
				}
			}
		}
		if (local303) {
			while (true) {
				if (local65 <= 32767 && local82 <= 32767 && local99 <= 32767 && local65 >= -32767 && local82 >= -32767 && local99 >= -32767) {
					this.aShort6 = (short) local65;
					this.aShort8 = (short) local82;
					this.aShort10 = (short) local99;
					break;
				}
				local65 >>= 0x1;
				local82 >>= 0x1;
				local99 >>= 0x1;
				this.anInt502 <<= 0x1;
			}
		}
		super.anInt496 = (int) ((long) super.anInt496 + ((long) this.aShort6 * (long) this.anInt502 >> 23) * (long) arg1);
		super.anInt494 = (int) ((long) super.anInt494 + ((long) this.aShort8 * (long) this.anInt502 >> 23) * (long) arg1);
		super.anInt495 = (int) ((long) super.anInt495 + ((long) this.aShort10 * (long) this.anInt502 >> 23) * (long) arg1);
	}
}
