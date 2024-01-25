import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class1_Sub3_Sub15 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ie", name = "L", descriptor = "[B")
	public static final byte[] aByteArray50;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
	private int anInt2803 = 6;

	static {
		new Class34("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
		@Pc(7) int local7 = 0;
		aByteArray50 = new byte[32896];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray50[local7++] = (byte) (255.0D / Math.sqrt((double) ((float) (local12 * local12 + local15 * local15 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub15() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5538(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass144_41.method3947(arg0);
		if (super.aClass144_41.aBoolean415) {
			@Pc(28) int[][] local28 = this.method5528(arg0, 0);
			@Pc(34) int[][] local34 = this.method5528(arg0, 1);
			@Pc(38) int[] local38 = local13[0];
			@Pc(42) int[] local42 = local13[1];
			@Pc(46) int[] local46 = local13[2];
			@Pc(50) int[] local50 = local28[0];
			@Pc(54) int[] local54 = local28[1];
			@Pc(58) int[] local58 = local28[2];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt2803;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static153.anInt3378; local73++) {
					local38[local73] = local50[local73] + local62[local73];
					local42[local73] = local54[local73] + local66[local73];
					local46[local73] = local70[local73] + local58[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static153.anInt3378; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local54[local73] - local66[local73];
					local46[local73] = local58[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static153.anInt3378; local73++) {
					local38[local73] = local50[local73] * local62[local73] >> 12;
					local42[local73] = local66[local73] * local54[local73] >> 12;
					local46[local73] = local58[local73] * local70[local73] >> 12;
				}
			} else {
				@Pc(270) int local270;
				@Pc(266) int local266;
				@Pc(274) int local274;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static153.anInt3378; local73++) {
						local266 = local66[local73];
						local270 = local62[local73];
						local274 = local70[local73];
						local38[local73] = local270 == 0 ? 4096 : (local50[local73] << 12) / local270;
						local42[local73] = local266 == 0 ? 4096 : (local54[local73] << 12) / local266;
						local46[local73] = local274 == 0 ? 4096 : (local58[local73] << 12) / local274;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static153.anInt3378; local73++) {
						local38[local73] = 4096 - ((4096 - local50[local73]) * (-local62[local73] + 4096) >> 12);
						local42[local73] = 4096 - ((4096 - local54[local73]) * (-local66[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local58[local73]) * (4096 - local70[local73]) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static153.anInt3378; local73++) {
						local270 = local62[local73];
						local274 = local70[local73];
						local266 = local66[local73];
						local38[local73] = local270 < 2048 ? local270 * local50[local73] >> 11 : 4096 - ((4096 - local270) * (-local50[local73] + 4096) >> 11);
						local42[local73] = local266 >= 2048 ? 4096 - ((4096 - local266) * (4096 - local54[local73]) >> 11) : local266 * local54[local73] >> 11;
						local46[local73] = local274 >= 2048 ? 4096 - ((4096 - local58[local73]) * (-local274 + 4096) >> 11) : local274 * local58[local73] >> 11;
					}
				} else {
					@Pc(523) int local523;
					@Pc(519) int local519;
					@Pc(527) int local527;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static153.anInt3378; local73++) {
							local519 = local54[local73];
							local523 = local50[local73];
							local527 = local58[local73];
							local38[local73] = local523 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local523);
							local42[local73] = local519 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local519);
							local46[local73] = local527 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local527);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static153.anInt3378; local73++) {
							local519 = local54[local73];
							local523 = local50[local73];
							local527 = local58[local73];
							local38[local73] = local523 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local523;
							local42[local73] = local519 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local519;
							local46[local73] = local527 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local527;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static153.anInt3378; local73++) {
							local274 = local70[local73];
							local523 = local50[local73];
							local519 = local54[local73];
							local266 = local66[local73];
							local527 = local58[local73];
							local270 = local62[local73];
							local38[local73] = local523 < local270 ? local523 : local270;
							local42[local73] = local266 > local519 ? local519 : local266;
							local46[local73] = local274 > local527 ? local527 : local274;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static153.anInt3378; local73++) {
							local519 = local54[local73];
							local527 = local58[local73];
							local274 = local70[local73];
							local270 = local62[local73];
							local266 = local66[local73];
							local523 = local50[local73];
							local38[local73] = local523 > local270 ? local523 : local270;
							local42[local73] = local519 <= local266 ? local266 : local519;
							local46[local73] = local274 >= local527 ? local274 : local527;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static153.anInt3378; local73++) {
							local270 = local62[local73];
							local527 = local58[local73];
							local266 = local66[local73];
							local523 = local50[local73];
							local519 = local54[local73];
							local274 = local70[local73];
							local38[local73] = local523 <= local270 ? local270 - local523 : -local270 + local523;
							local42[local73] = local519 > local266 ? local519 - local266 : -local519 + local266;
							local46[local73] = local527 > local274 ? local527 - local274 : -local527 + local274;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static153.anInt3378; local73++) {
							local274 = local70[local73];
							local266 = local66[local73];
							local519 = local54[local73];
							local523 = local50[local73];
							local270 = local62[local73];
							local527 = local58[local73];
							local38[local73] = local523 + local270 - (local523 * local270 >> 11);
							local42[local73] = local266 + local519 - (local519 * local266 >> 11);
							local46[local73] = local274 + local527 - (local274 * local527 >> 11);
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILclient!bg;)V")
	@Override
	public void method5526(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt2803 = arg1.method4532();
		} else if (arg0 == 1) {
			super.aBoolean647 = arg1.method4532() == 1;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass122_41.method3385(arg0);
		if (super.aClass122_41.aBoolean342) {
			@Pc(29) int[] local29 = this.method5532(0, arg0);
			@Pc(35) int[] local35 = this.method5532(1, arg0);
			@Pc(38) int local38 = this.anInt2803;
			if (local38 == 1) {
				for (local38 = 0; local38 < Static153.anInt3378; local38++) {
					local11[local38] = local35[local38] + local29[local38];
				}
			} else if (local38 == 2) {
				for (local38 = 0; local38 < Static153.anInt3378; local38++) {
					local11[local38] = local29[local38] - local35[local38];
				}
			} else if (local38 == 3) {
				for (local38 = 0; local38 < Static153.anInt3378; local38++) {
					local11[local38] = local35[local38] * local29[local38] >> 12;
				}
			} else {
				@Pc(168) int local168;
				if (local38 == 4) {
					for (local38 = 0; local38 < Static153.anInt3378; local38++) {
						local168 = local35[local38];
						local11[local38] = local168 == 0 ? 4096 : (local29[local38] << 12) / local168;
					}
				} else if (local38 == 5) {
					for (local38 = 0; local38 < Static153.anInt3378; local38++) {
						local11[local38] = 4096 - ((4096 - local35[local38]) * (-local29[local38] + 4096) >> 12);
					}
				} else if (local38 == 6) {
					for (local38 = 0; local38 < Static153.anInt3378; local38++) {
						local168 = local35[local38];
						local11[local38] = local168 < 2048 ? local29[local38] * local168 >> 11 : 4096 - ((4096 - local168) * (-local29[local38] + 4096) >> 11);
					}
				} else {
					@Pc(281) int local281;
					if (local38 == 7) {
						for (local38 = 0; local38 < Static153.anInt3378; local38++) {
							local281 = local29[local38];
							local11[local38] = local281 == 4096 ? 4096 : (local35[local38] << 12) / (4096 - local281);
						}
					} else if (local38 == 8) {
						for (local38 = 0; local38 < Static153.anInt3378; local38++) {
							local281 = local29[local38];
							local11[local38] = local281 == 0 ? 0 : 4096 - (4096 - local35[local38] << 12) / local281;
						}
					} else if (local38 == 9) {
						for (local38 = 0; local38 < Static153.anInt3378; local38++) {
							local168 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local281 >= local168 ? local168 : local281;
						}
					} else if (local38 == 10) {
						for (local38 = 0; local38 < Static153.anInt3378; local38++) {
							local281 = local29[local38];
							local168 = local35[local38];
							local11[local38] = local281 <= local168 ? local168 : local281;
						}
					} else if (local38 == 11) {
						for (local38 = 0; local38 < Static153.anInt3378; local38++) {
							local168 = local35[local38];
							local281 = local29[local38];
							local11[local38] = local281 <= local168 ? local168 - local281 : local281 + -local168;
						}
					} else if (local38 == 12) {
						for (local38 = 0; local38 < Static153.anInt3378; local38++) {
							local281 = local29[local38];
							local168 = local35[local38];
							local11[local38] = local168 + local281 - (local281 * local168 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}
}
