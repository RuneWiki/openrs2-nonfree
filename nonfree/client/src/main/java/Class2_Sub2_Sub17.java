import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	private int anInt2843 = 6;

	static {
		new Class134("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
		new Class134("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub17() {
		super(2, false);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(21) int[] local21 = this.method5472(arg0, 0);
			@Pc(27) int[] local27 = this.method5472(arg0, 1);
			@Pc(30) int local30 = this.anInt2843;
			if (local30 == 1) {
				for (local30 = 0; local30 < Static217.anInt3574; local30++) {
					local11[local30] = local21[local30] + local27[local30];
				}
			} else if (local30 == 2) {
				for (local30 = 0; local30 < Static217.anInt3574; local30++) {
					local11[local30] = local21[local30] - local27[local30];
				}
			} else if (local30 == 3) {
				for (local30 = 0; local30 < Static217.anInt3574; local30++) {
					local11[local30] = local21[local30] * local27[local30] >> 12;
				}
			} else {
				@Pc(167) int local167;
				if (local30 == 4) {
					for (local30 = 0; local30 < Static217.anInt3574; local30++) {
						local167 = local27[local30];
						local11[local30] = local167 == 0 ? 4096 : (local21[local30] << 12) / local167;
					}
				} else if (local30 == 5) {
					for (local30 = 0; local30 < Static217.anInt3574; local30++) {
						local11[local30] = 4096 - ((4096 - local27[local30]) * (-local21[local30] + 4096) >> 12);
					}
				} else if (local30 == 6) {
					for (local30 = 0; local30 < Static217.anInt3574; local30++) {
						local167 = local27[local30];
						local11[local30] = local167 < 2048 ? local21[local30] * local167 >> 11 : 4096 - ((4096 - local21[local30]) * (-local167 + 4096) >> 11);
					}
				} else {
					@Pc(281) int local281;
					if (local30 == 7) {
						for (local30 = 0; local30 < Static217.anInt3574; local30++) {
							local281 = local21[local30];
							local11[local30] = local281 == 4096 ? 4096 : (local27[local30] << 12) / (4096 - local281);
						}
					} else if (local30 == 8) {
						for (local30 = 0; local30 < Static217.anInt3574; local30++) {
							local281 = local21[local30];
							local11[local30] = local281 == 0 ? 0 : 4096 - (4096 - local27[local30] << 12) / local281;
						}
					} else if (local30 == 9) {
						for (local30 = 0; local30 < Static217.anInt3574; local30++) {
							local167 = local27[local30];
							local281 = local21[local30];
							local11[local30] = local281 < local167 ? local281 : local167;
						}
					} else if (local30 == 10) {
						for (local30 = 0; local30 < Static217.anInt3574; local30++) {
							local167 = local27[local30];
							local281 = local21[local30];
							local11[local30] = local167 >= local281 ? local167 : local281;
						}
					} else if (local30 == 11) {
						for (local30 = 0; local30 < Static217.anInt3574; local30++) {
							local281 = local21[local30];
							local167 = local27[local30];
							local11[local30] = local281 > local167 ? local281 - local167 : local167 - local281;
						}
					} else if (local30 == 12) {
						for (local30 = 0; local30 < Static217.anInt3574; local30++) {
							local281 = local21[local30];
							local167 = local27[local30];
							local11[local30] = local167 + local281 - (local167 * local281 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5471(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass207_41.method4467(arg0);
		if (super.aClass207_41.aBoolean419) {
			@Pc(26) int[][] local26 = this.method5474(0, arg0);
			@Pc(34) int[][] local34 = this.method5474(1, arg0);
			@Pc(38) int[] local38 = local11[0];
			@Pc(42) int[] local42 = local11[1];
			@Pc(46) int[] local46 = local11[2];
			@Pc(50) int[] local50 = local26[0];
			@Pc(54) int[] local54 = local26[1];
			@Pc(58) int[] local58 = local26[2];
			@Pc(62) int[] local62 = local34[0];
			@Pc(66) int[] local66 = local34[1];
			@Pc(70) int[] local70 = local34[2];
			@Pc(73) int local73 = this.anInt2843;
			if (local73 == 1) {
				for (local73 = 0; local73 < Static217.anInt3574; local73++) {
					local38[local73] = local50[local73] + local62[local73];
					local42[local73] = local66[local73] + local54[local73];
					local46[local73] = local58[local73] + local70[local73];
				}
			} else if (local73 == 2) {
				for (local73 = 0; local73 < Static217.anInt3574; local73++) {
					local38[local73] = local50[local73] - local62[local73];
					local42[local73] = local54[local73] - local66[local73];
					local46[local73] = local58[local73] - local70[local73];
				}
			} else if (local73 == 3) {
				for (local73 = 0; local73 < Static217.anInt3574; local73++) {
					local38[local73] = local50[local73] * local62[local73] >> 12;
					local42[local73] = local54[local73] * local66[local73] >> 12;
					local46[local73] = local58[local73] * local70[local73] >> 12;
				}
			} else {
				@Pc(282) int local282;
				@Pc(278) int local278;
				@Pc(274) int local274;
				if (local73 == 4) {
					for (local73 = 0; local73 < Static217.anInt3574; local73++) {
						local274 = local70[local73];
						local278 = local66[local73];
						local282 = local62[local73];
						local38[local73] = local282 == 0 ? 4096 : (local50[local73] << 12) / local282;
						local42[local73] = local278 == 0 ? 4096 : (local54[local73] << 12) / local278;
						local46[local73] = local274 == 0 ? 4096 : (local58[local73] << 12) / local274;
					}
				} else if (local73 == 5) {
					for (local73 = 0; local73 < Static217.anInt3574; local73++) {
						local38[local73] = 4096 - ((4096 - local50[local73]) * (4096 - local62[local73]) >> 12);
						local42[local73] = 4096 - ((4096 - local66[local73]) * (-local54[local73] + 4096) >> 12);
						local46[local73] = 4096 - ((4096 - local58[local73]) * (-local70[local73] + 4096) >> 12);
					}
				} else if (local73 == 6) {
					for (local73 = 0; local73 < Static217.anInt3574; local73++) {
						local274 = local70[local73];
						local278 = local66[local73];
						local282 = local62[local73];
						local38[local73] = local282 < 2048 ? local50[local73] * local282 >> 11 : 4096 - ((4096 - local282) * (4096 - local50[local73]) >> 11);
						local42[local73] = local278 >= 2048 ? 4096 - ((4096 - local54[local73]) * (-local278 + 4096) >> 11) : local54[local73] * local278 >> 11;
						local46[local73] = local274 < 2048 ? local58[local73] * local274 >> 11 : 4096 - ((4096 - local274) * (-local58[local73] + 4096) >> 11);
					}
				} else {
					@Pc(546) int local546;
					@Pc(542) int local542;
					@Pc(550) int local550;
					if (local73 == 7) {
						for (local73 = 0; local73 < Static217.anInt3574; local73++) {
							local542 = local54[local73];
							local546 = local50[local73];
							local550 = local58[local73];
							local38[local73] = local546 == 4096 ? 4096 : (local62[local73] << 12) / (4096 - local546);
							local42[local73] = local542 == 4096 ? 4096 : (local66[local73] << 12) / (4096 - local542);
							local46[local73] = local550 == 4096 ? 4096 : (local70[local73] << 12) / (4096 - local550);
						}
					} else if (local73 == 8) {
						for (local73 = 0; local73 < Static217.anInt3574; local73++) {
							local550 = local58[local73];
							local546 = local50[local73];
							local542 = local54[local73];
							local38[local73] = local546 == 0 ? 0 : 4096 - (4096 - local62[local73] << 12) / local546;
							local42[local73] = local542 == 0 ? 0 : 4096 - (4096 - local66[local73] << 12) / local542;
							local46[local73] = local550 == 0 ? 0 : 4096 - (4096 - local70[local73] << 12) / local550;
						}
					} else if (local73 == 9) {
						for (local73 = 0; local73 < Static217.anInt3574; local73++) {
							local546 = local50[local73];
							local274 = local70[local73];
							local550 = local58[local73];
							local278 = local66[local73];
							local282 = local62[local73];
							local542 = local54[local73];
							local38[local73] = local546 >= local282 ? local282 : local546;
							local42[local73] = local278 > local542 ? local542 : local278;
							local46[local73] = local274 > local550 ? local550 : local274;
						}
					} else if (local73 == 10) {
						for (local73 = 0; local73 < Static217.anInt3574; local73++) {
							local278 = local66[local73];
							local546 = local50[local73];
							local274 = local70[local73];
							local542 = local54[local73];
							local550 = local58[local73];
							local282 = local62[local73];
							local38[local73] = local546 > local282 ? local546 : local282;
							local42[local73] = local542 <= local278 ? local278 : local542;
							local46[local73] = local550 <= local274 ? local274 : local550;
						}
					} else if (local73 == 11) {
						for (local73 = 0; local73 < Static217.anInt3574; local73++) {
							local274 = local70[local73];
							local282 = local62[local73];
							local550 = local58[local73];
							local542 = local54[local73];
							local546 = local50[local73];
							local278 = local66[local73];
							local38[local73] = local282 >= local546 ? local282 - local546 : local546 - local282;
							local42[local73] = local278 < local542 ? local542 - local278 : -local542 + local278;
							local46[local73] = local550 <= local274 ? local274 - local550 : -local274 + local550;
						}
					} else if (local73 == 12) {
						for (local73 = 0; local73 < Static217.anInt3574; local73++) {
							local282 = local62[local73];
							local550 = local58[local73];
							local274 = local70[local73];
							local278 = local66[local73];
							local542 = local54[local73];
							local546 = local50[local73];
							local38[local73] = local282 + local546 - (local282 * local546 >> 11);
							local42[local73] = local278 + local542 - (local542 * local278 >> 11);
							local46[local73] = local550 + local274 - (local550 * local274 >> 11);
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2843 = arg0.method3580();
		} else if (arg1 == 1) {
			super.aBoolean509 = arg0.method3580() == 1;
		}
	}
}
