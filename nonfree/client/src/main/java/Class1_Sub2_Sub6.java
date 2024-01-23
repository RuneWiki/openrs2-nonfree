import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fj", name = "F", descriptor = "I")
	private int anInt1974;

	@OriginalMember(owner = "client!fj", name = "I", descriptor = "[I")
	private int[] anIntArray147;

	@OriginalMember(owner = "client!fj", name = "J", descriptor = "F")
	private float aFloat17;

	@OriginalMember(owner = "client!fj", name = "G", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!fj", name = "C", descriptor = "Lclient!bl;")
	public Class1_Sub2_Sub3 aClass1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!fj", name = "B", descriptor = "Z")
	private boolean aBoolean116;

	@OriginalMember(owner = "client!fj", name = "D", descriptor = "Z")
	private boolean aBoolean117;

	@OriginalMember(owner = "client!fj", name = "E", descriptor = "I")
	private int anInt1973;

	@OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
	private int anInt1975;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class1_Sub2_Sub6(@OriginalArg(0) Class1_Sub13 arg0) {
		this.aClass1_Sub2_Sub3_1 = new Class1_Sub2_Sub3(arg0);
		this.aBoolean116 = arg0.method1772() == 1;
		this.aBoolean117 = arg0.method1772() == 1;
		arg0.method1772();
		arg0.method1772();
		@Pc(44) int local44 = arg0.method1772() & 0x3;
		this.anInt1973 = arg0.method1756();
		this.anInt1975 = arg0.method1756();
		arg0.method1772();
		arg0.method1772();
		arg0.method1772();
	}

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)V")
	public void method1441(@OriginalArg(0) int arg0) {
		if (this.anIntArray147 == null || this.anInt1975 == 0 && this.anInt1973 == 0) {
			return;
		}
		if (Static72.anIntArray148 == null || Static72.anIntArray148.length < this.anIntArray147.length) {
			Static72.anIntArray148 = new int[this.anIntArray147.length];
		}
		@Pc(26) int local26 = this.anIntArray147.length;
		@Pc(31) int local31 = arg0 * this.anInt1973;
		@Pc(36) int local36 = this.anInt1974 - 1;
		@Pc(44) int local44 = this.anInt1974 * arg0 * this.anInt1975;
		@Pc(48) int local48 = local26 - 1;
		for (@Pc(50) int local50 = 0; local50 < local26; local50 += this.anInt1974) {
			@Pc(57) int local57 = local50 + local44 & local48;
			for (@Pc(59) int local59 = 0; local59 < this.anInt1974; local59++) {
				@Pc(64) int local64 = local50 + local59;
				@Pc(72) int local72 = local57 + (local59 + local31 & local36);
				Static72.anIntArray148[local64] = this.anIntArray147[local72];
			}
		}
		@Pc(95) int[] local95 = this.anIntArray147;
		this.anIntArray147 = Static72.anIntArray148;
		Static72.anIntArray148 = local95;
	}

	@OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!v;Lclient!hc;FZ)[I")
	public int[] method1442(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) boolean arg3) {
		if (this.anIntArray147 == null || this.aFloat17 != arg2) {
			if (!this.aClass1_Sub2_Sub3_1.method501(arg1, arg0)) {
				return null;
			}
			this.anInt1974 = arg3 ? 64 : 128;
			this.anIntArray147 = this.aClass1_Sub2_Sub3_1.method503(arg1, this.aBoolean117, arg0, this.anInt1974, this.anInt1974, true, (double) arg2);
			this.aFloat17 = arg2;
			if (this.aBoolean116) {
				@Pc(50) int[] local50 = new int[this.anInt1974];
				@Pc(54) int[] local54 = new int[this.anInt1974];
				@Pc(58) int[] local58 = new int[this.anInt1974];
				@Pc(65) int[] local65 = new int[this.anInt1974 * this.anInt1974];
				@Pc(68) int local68 = this.anInt1974;
				@Pc(71) int local71 = this.anInt1974;
				@Pc(75) int local75 = local68 - 1;
				@Pc(79) int local79 = local71 - 1;
				@Pc(83) int local83 = local68 * local71;
				@Pc(86) int local86 = local68;
				@Pc(87) int local87 = local68;
				@Pc(92) int local92;
				for (@Pc(89) int local89 = 2; local89 >= 0; local89--) {
					for (local92 = local75; local92 >= 0; local92--) {
						local86--;
						@Pc(99) int local99 = this.anIntArray147[local86];
						local50[local92] += local99 >> 16 & 0xFF;
						local54[local92] += local99 >> 8 & 0xFF;
						local58[local92] += local99 & 0xFF;
					}
					if (local86 == 0) {
						local86 = local83;
					}
				}
				@Pc(142) int local142 = local83;
				for (@Pc(144) int local144 = local79; local144 >= 0; local144--) {
					@Pc(147) int local147 = 1;
					@Pc(149) int local149 = 1;
					@Pc(152) int local152 = 0;
					@Pc(154) int local154 = 0;
					@Pc(155) int local155 = 0;
					for (local92 = 2; local92 >= 0; local92--) {
						local149--;
						local155 += local50[local149];
						local152 += local54[local149];
						local154 += local58[local149];
						if (local149 == 0) {
							local149 = local68;
						}
					}
					for (local92 = local75; local92 >= 0; local92--) {
						local149--;
						local147--;
						@Pc(193) int local193 = local155 / 9;
						@Pc(197) int local197 = local152 / 9;
						@Pc(201) int local201 = local154 / 9;
						local142--;
						local65[local142] = local193 << 16 | local197 << 8 | local201;
						local155 += local50[local149] - local50[local147];
						local154 += local58[local149] - local58[local147];
						local152 += local54[local149] - local54[local147];
						if (local149 == 0) {
							local149 = local68;
						}
						if (local147 == 0) {
							local147 = local68;
						}
					}
					for (local92 = local75; local92 >= 0; local92--) {
						local86--;
						@Pc(264) int local264 = this.anIntArray147[local86];
						local87--;
						@Pc(270) int local270 = this.anIntArray147[local87];
						local50[local92] += (local264 >> 16 & 0xFF) - (local270 >> 16 & 0xFF);
						local54[local92] += (local264 >> 8 & 0xFF) - (local270 >> 8 & 0xFF);
						local58[local92] += (local264 & 0xFF) - (local270 & 0xFF);
					}
					if (local86 == 0) {
						local86 = local83;
					}
					if (local87 == 0) {
						local87 = local83;
					}
				}
				this.anIntArray147 = local65;
			}
		}
		return this.anIntArray147;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!v;Lclient!hc;)Z")
	public boolean method1443(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class51 arg1) {
		return this.aClass1_Sub2_Sub3_1.method501(arg1, arg0);
	}
}
