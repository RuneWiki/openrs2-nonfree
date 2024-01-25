import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class10_Sub42 extends Class10 {

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
	private int anInt6887;

	@OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
	private int anInt6893;

	@OriginalMember(owner = "client!uj", name = "x", descriptor = "Lclient!wv;")
	private final Class154_Sub2 aClass154_Sub2_3;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "Lclient!bk;")
	private final Class10_Sub4 aClass10_Sub4_2;

	@OriginalMember(owner = "client!uj", name = "B", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_38;

	@OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
	private final int anInt6897;

	@OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
	private final int anInt6889;

	@OriginalMember(owner = "client!uj", name = "G", descriptor = "I")
	private final int anInt6896;

	@OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
	private final int anInt6892;

	@OriginalMember(owner = "client!uj", name = "w", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!uj", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!uj", name = "o", descriptor = "Lclient!er;")
	private final Class71 aClass71_11;

	@OriginalMember(owner = "client!uj", name = "z", descriptor = "Lclient!af;")
	private final Interface1 anInterface1_5;

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "Lclient!er;")
	private final Class71 aClass71_12;

	@OriginalMember(owner = "client!uj", name = "v", descriptor = "Lclient!gg;")
	private final Interface4 anInterface4_6;

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "Lclient!nn;")
	private Class10_Sub8 aClass10_Sub8_13;

	@OriginalMember(owner = "client!uj", name = "H", descriptor = "Lclient!cb;")
	private Class10_Sub8_Sub1 aClass10_Sub8_Sub1_3;

	@OriginalMember(owner = "client!uj", name = "r", descriptor = "Lclient!mn;")
	private Class167 aClass167_31;

	static {
		new Class182("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lclient!da;Lclient!wv;Lclient!bk;[I)V")
	public Class10_Sub42(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(1) Class154_Sub2 arg1, @OriginalArg(2) Class10_Sub4 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass154_Sub2_3 = arg1;
		this.aClass10_Sub4_2 = arg2;
		this.aClass50_Sub1_38 = arg0;
		@Pc(22) int local22 = this.aClass10_Sub4_2.method5355() - (arg1.anInt7615 >> 1);
		this.anInt6897 = this.aClass10_Sub4_2.method5354() - local22 >> arg1.anInt7617;
		this.anInt6889 = this.aClass10_Sub4_2.method5354() + local22 >> arg1.anInt7617;
		this.anInt6896 = this.aClass10_Sub4_2.method5362() - local22 >> arg1.anInt7617;
		this.anInt6892 = this.aClass10_Sub4_2.method5362() + local22 >> arg1.anInt7617;
		@Pc(76) int local76 = this.anInt6889 + 1 - this.anInt6897;
		@Pc(85) int local85 = this.anInt6892 + 1 - this.anInt6896;
		this.aFloatArrayArray5 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray4 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local76 + 1][local85 + 1];
		@Pc(121) int local121;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(170) int local170;
		@Pc(185) int local185;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			local121 = this.anInt6896 + local114;
			if (local121 > 0 && this.aClass154_Sub2_3.anInt7616 - 1 > local121) {
				for (local136 = 0; local136 <= local76; local136++) {
					local143 = local136 + this.anInt6897;
					if (local143 > 0 && local143 < this.aClass154_Sub2_3.anInt7614 - 1) {
						local170 = arg1.ua(local143 + 1, local121) - arg1.ua(local143 - 1, local121);
						local185 = arg1.ua(local143, local121 + 1) - arg1.ua(local143, local121 - 1);
						@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local170 * local170 + local185 * local185 + 65536)));
						this.aFloatArrayArray5[local136][local114] = (float) local170 * local201;
						this.aFloatArrayArray4[local136][local114] = -256.0F * local201;
						this.aFloatArrayArray3[local136][local114] = (float) local185 * local201;
					}
				}
			}
		}
		local121 = 0;
		local136 = 0;
		for (local143 = this.anInt6896; local143 <= this.anInt6892; local143++) {
			if (local143 >= 0 && arg1.anInt7616 > local143) {
				for (local170 = this.anInt6897; local170 <= this.anInt6889; local170++) {
					if (local170 >= 0 && local170 < arg1.anInt7614) {
						local185 = arg3[local136];
						@Pc(287) int[] local287 = arg1.anIntArrayArrayArray10[local170][local143];
						if (local287 != null && local185 != 0) {
							if (local185 == 1) {
								local121 += local287.length;
							} else {
								local121 += 3;
							}
						}
					}
					local136++;
				}
			} else {
				local136 += this.anInt6889 - this.anInt6897;
			}
		}
		if (local121 <= 0) {
			this.aClass71_11 = null;
			this.anInterface1_5 = null;
			this.aClass71_12 = null;
			this.anInterface4_6 = null;
		} else {
			this.aClass10_Sub8_13 = new Class10_Sub8(local121 * 2);
			this.aClass10_Sub8_Sub1_3 = new Class10_Sub8_Sub1(local121 * 16);
			this.aClass167_31 = new Class167(Static186.method3002(local121));
			local170 = 0;
			local136 = 0;
			for (local185 = this.anInt6896; local185 <= this.anInt6892; local185++) {
				if (local185 >= 0 && local185 < arg1.anInt7616) {
					@Pc(409) int local409 = 0;
					for (@Pc(412) int local412 = this.anInt6897; local412 <= this.anInt6889; local412++) {
						if (local412 >= 0 && local412 < arg1.anInt7614) {
							@Pc(431) int local431 = arg3[local136];
							@Pc(438) int[] local438 = arg1.anIntArrayArrayArray10[local412][local185];
							@Pc(445) int[] local445 = arg1.anIntArrayArrayArray13[local412][local185];
							if (local438 != null && local431 != 0) {
								if (local431 == 1) {
									for (@Pc(456) int local456 = 0; local456 < local438.length; local456++) {
										this.method5416(local409, local185, local412, local170, local445[local456], local438[local456]);
									}
								} else if (local431 == 3) {
									this.method5416(local409, local185, local412, local170, 0, 0);
									this.method5416(local409, local185, local412, local170, 0, arg1.anInt7615);
									this.method5416(local409, local185, local412, local170, arg1.anInt7615, 0);
								} else if (local431 == 2) {
									this.method5416(local409, local185, local412, local170, 0, arg1.anInt7615);
									this.method5416(local409, local185, local412, local170, arg1.anInt7615, arg1.anInt7615);
									this.method5416(local409, local185, local412, local170, 0, 0);
								} else if (local431 == 5) {
									this.method5416(local409, local185, local412, local170, arg1.anInt7615, arg1.anInt7615);
									this.method5416(local409, local185, local412, local170, arg1.anInt7615, 0);
									this.method5416(local409, local185, local412, local170, 0, arg1.anInt7615);
								} else if (local431 == 4) {
									this.method5416(local409, local185, local412, local170, arg1.anInt7615, 0);
									this.method5416(local409, local185, local412, local170, 0, 0);
									this.method5416(local409, local185, local412, local170, arg1.anInt7615, arg1.anInt7615);
								}
							}
						}
						local136++;
						local409++;
					}
				} else {
					local136 += this.anInt6889 - this.anInt6897;
				}
				local170++;
			}
			this.anInterface1_5 = this.aClass50_Sub1_38.method1305(this.aClass10_Sub8_13.anInt2989, false, this.aClass10_Sub8_13.aByteArray44);
			this.anInterface4_6 = this.aClass50_Sub1_38.method1253(this.aClass10_Sub8_Sub1_3.anInt2989, 16, this.aClass10_Sub8_Sub1_3.aByteArray44, false);
			this.aClass71_11 = new Class71(this.anInterface4_6, 5126, 3, 0);
			this.aClass71_12 = new Class71(this.anInterface4_6, 5121, 4, 12);
		}
		this.aClass10_Sub8_Sub1_3 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray4 = this.aFloatArrayArray3 = null;
		this.aClass167_31 = null;
		this.aClass10_Sub8_13 = null;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III[[ZZ)V")
	public void method5415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface1_5 == null || (arg2 + arg1 < this.anInt6897 || (this.anInt6889 < arg1 - arg2 || (this.anInt6896 > arg0 + arg2 || arg0 - arg2 > this.anInt6892)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt6896; local54 <= this.anInt6892; local54++) {
			for (@Pc(59) int local59 = this.anInt6897; local59 <= this.anInt6889; local59++) {
				@Pc(66) int local66 = local59 - arg1;
				@Pc(71) int local71 = local54 - arg0;
				if (local66 > -arg2 && arg2 > local66 && -arg2 < local71 && local71 < arg2 && arg3[arg2 + local66][local71 + arg2]) {
					this.aClass50_Sub1_38.method1278((int) (this.aClass10_Sub4_2.method5359() * 255.0F) << 24);
					this.aClass50_Sub1_38.method1283(this.aClass71_11, null, null, this.aClass71_12);
					this.aClass50_Sub1_38.method1290(this.anInt6893, 0, this.anInterface1_5);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIII)V")
	private void method5416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg5 + (arg2 << this.aClass154_Sub2_3.anInt7617);
		@Pc(25) int local25 = arg4 + (arg1 << this.aClass154_Sub2_3.anInt7617);
		@Pc(31) int local31 = this.aClass154_Sub2_3.ca(local16, local25);
		if ((arg5 & 0x7F) == 0 || (arg4 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | 0xFFFFL << 16 & (long) local25 << 16;
			@Pc(59) Class10 local59 = this.aClass167_31.method3709(local7);
			if (local59 != null) {
				this.method5417(((Class10_Sub24) local59).aShort62);
				return;
			}
		}
		@Pc(77) short local77 = (short) this.anInt6887++;
		if (local7 != -1L) {
			this.aClass167_31.method3705(new Class10_Sub24(local77), local7);
		}
		@Pc(150) float local150;
		@Pc(159) float local159;
		@Pc(141) float local141;
		@Pc(169) float local169;
		@Pc(177) float local177;
		@Pc(184) float local184;
		@Pc(191) float local191;
		@Pc(198) float local198;
		@Pc(207) float local207;
		@Pc(216) float local216;
		@Pc(257) float local257;
		if (arg5 == 0 && arg4 == 0) {
			local141 = this.aFloatArrayArray3[arg0][arg3];
			local150 = this.aFloatArrayArray5[arg0][arg3];
			local159 = this.aFloatArrayArray4[arg0][arg3];
		} else if (arg5 == this.aClass154_Sub2_3.anInt7615 && arg4 == 0) {
			local150 = this.aFloatArrayArray5[arg0 + 1][arg3];
			local141 = this.aFloatArrayArray3[arg0 + 1][arg3];
			local159 = this.aFloatArrayArray4[arg0 + 1][arg3];
		} else if (this.aClass154_Sub2_3.anInt7615 == arg5 && this.aClass154_Sub2_3.anInt7615 == arg4) {
			local141 = this.aFloatArrayArray3[arg0 + 1][arg3 + 1];
			local159 = this.aFloatArrayArray4[arg0 + 1][arg3 + 1];
			local150 = this.aFloatArrayArray5[arg0 + 1][arg3 + 1];
		} else if (arg5 == 0 && arg4 == this.aClass154_Sub2_3.anInt7615) {
			local141 = this.aFloatArrayArray3[arg0][arg3 + 1];
			local150 = this.aFloatArrayArray5[arg0][arg3 + 1];
			local159 = this.aFloatArrayArray4[arg0][arg3 + 1];
		} else {
			local169 = (float) arg5 / (float) this.aClass154_Sub2_3.anInt7615;
			local177 = (float) arg4 / (float) this.aClass154_Sub2_3.anInt7615;
			local184 = this.aFloatArrayArray5[arg0][arg3];
			local191 = this.aFloatArrayArray4[arg0][arg3];
			local198 = this.aFloatArrayArray3[arg0][arg3];
			local207 = this.aFloatArrayArray5[arg0 + 1][arg3];
			local216 = this.aFloatArrayArray4[arg0 + 1][arg3];
			@Pc(233) float local233 = local207 + (this.aFloatArrayArray5[arg0 + 1][arg3 + 1] - local207) * local169;
			@Pc(248) float local248 = local184 + (this.aFloatArrayArray5[arg0][arg3 + 1] - local184) * local169;
			local257 = this.aFloatArrayArray3[arg0 + 1][arg3];
			@Pc(273) float local273 = local191 + local169 * (this.aFloatArrayArray4[arg0][arg3 + 1] - local191);
			@Pc(290) float local290 = local216 + local169 * (this.aFloatArrayArray4[arg0 + 1][arg3 + 1] - local216);
			@Pc(306) float local306 = local198 + local169 * (this.aFloatArrayArray3[arg0][arg3 + 1] - local198);
			local159 = (local290 - local273) * local177 + local273;
			@Pc(331) float local331 = local257 + (this.aFloatArrayArray3[arg0 + 1][arg3 + 1] - local257) * local169;
			local150 = (local233 - local248) * local177 + local248;
			local141 = (local331 - local306) * local177 + local306;
		}
		local169 = this.aClass10_Sub4_2.method5354() - local16;
		local177 = this.aClass10_Sub4_2.method5365() - local31;
		local184 = this.aClass10_Sub4_2.method5362() - local25;
		local191 = (float) Math.sqrt((double) (local177 * local177 + local169 * local169 + local184 * local184));
		local198 = 1.0F / local191;
		local169 *= local198;
		local177 *= local198;
		local184 *= local198;
		local207 = local191 / (float) this.aClass10_Sub4_2.method5355();
		local216 = 1.0F - local207 * local207;
		if (local216 < 0.0F) {
			local216 = 0.0F;
		}
		local257 = local141 * local184 + local159 * local177 + local169 * local150;
		if (local257 < 0.0F) {
			local257 = 0.0F;
		}
		@Pc(540) float local540 = local216 * 2.0F * local257;
		if (local540 > 1.0F) {
			local540 = 1.0F;
		}
		@Pc(551) int local551 = this.aClass10_Sub4_2.method5361();
		@Pc(561) int local561 = (int) (local540 * (float) (local551 >> 16 & 0xFF));
		if (local561 > 255) {
			local561 = 255;
		}
		@Pc(576) int local576 = (int) ((float) (local551 >> 8 & 0xFF) * local540);
		if (local576 > 255) {
			local576 = 255;
		}
		@Pc(591) int local591 = (int) ((float) (local551 & 0xFF) * local540);
		if (local591 > 255) {
			local591 = 255;
		}
		if (this.aClass50_Sub1_38.aBoolean99) {
			this.aClass10_Sub8_Sub1_3.method835((float) local16);
			this.aClass10_Sub8_Sub1_3.method835((float) local31);
			this.aClass10_Sub8_Sub1_3.method835((float) local25);
		} else {
			this.aClass10_Sub8_Sub1_3.method833((float) local16);
			this.aClass10_Sub8_Sub1_3.method833((float) local31);
			this.aClass10_Sub8_Sub1_3.method833((float) local25);
		}
		this.aClass10_Sub8_Sub1_3.method2458(local561);
		this.aClass10_Sub8_Sub1_3.method2458(local576);
		this.aClass10_Sub8_Sub1_3.method2458(local591);
		this.aClass10_Sub8_Sub1_3.method2458(255);
		this.method5417(local77);
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(SI)V")
	private void method5417(@OriginalArg(0) short arg0) {
		if (this.aClass50_Sub1_38.aBoolean99) {
			this.aClass10_Sub8_13.method2509(arg0);
		} else {
			this.aClass10_Sub8_13.method2496(arg0);
		}
		this.anInt6893++;
	}
}
