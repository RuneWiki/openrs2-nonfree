import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class1_Sub3_Sub10 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
	private int anInt1681 = 16;

	@OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
	private int anInt1684 = 2000;

	@OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
	private int anInt1678 = 0;

	@OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
	private int anInt1685 = 4096;

	@OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
	private int anInt1686 = 0;

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(26) int local26 = this.anInt1685 >> 1;
			@Pc(31) int[][] local31 = super.aClass8_41.method107();
			@Pc(38) Random local38 = new Random((long) this.anInt1678);
			for (@Pc(40) int local40 = 0; local40 < this.anInt1684; local40++) {
				@Pc(60) int local60 = this.anInt1685 <= 0 ? this.anInt1686 : this.anInt1686 + Static205.method3438(this.anInt1685, local38) - local26;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static205.method3438(Static110.anInt2934, local38);
				@Pc(76) int local76 = Static205.method3438(Static166.anInt3882, local38);
				@Pc(87) int local87 = (Static120.anIntArray224[local66] * this.anInt1681 >> 12) + local71;
				@Pc(98) int local98 = (this.anInt1681 * Static157.anIntArray276[local66] >> 12) + local76;
				@Pc(103) int local103 = local98 - local76;
				@Pc(108) int local108 = local87 - local71;
				if (local108 != 0 || local103 != 0) {
					if (local103 < 0) {
						local103 = -local103;
					}
					if (local108 < 0) {
						local108 = -local108;
					}
					@Pc(135) boolean local135 = local108 < local103;
					@Pc(139) int local139;
					@Pc(145) int local145;
					if (local135) {
						local139 = local71;
						local71 = local76;
						local76 = local139;
						local145 = local87;
						local87 = local98;
						local98 = local145;
					}
					if (local71 > local87) {
						local139 = local71;
						local71 = local87;
						local145 = local76;
						local76 = local98;
						local87 = local139;
						local98 = local145;
					}
					local139 = local76;
					local145 = local87 - local71;
					@Pc(179) int local179 = local98 - local76;
					if (local179 < 0) {
						local179 = -local179;
					}
					@Pc(192) int local192 = -local145 / 2;
					@Pc(203) int local203 = local98 <= local76 ? -1 : 1;
					@Pc(207) int local207 = 2048 / local145;
					@Pc(216) int local216 = 1024 - (Static205.method3438(4096, local38) >> 2);
					for (@Pc(218) int local218 = local71; local218 < local87; local218++) {
						local192 += local179;
						@Pc(228) int local228 = local218 & Static2.anInt38;
						@Pc(240) int local240 = local216 + local207 * (local218 - local71) + 1024;
						@Pc(244) int local244 = Static42.anInt1193 & local139;
						if (local192 > 0) {
							local139 += local203;
							local192 += -local145;
						}
						if (local135) {
							local31[local244][local228] = local240;
						} else {
							local31[local228][local244] = local240;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1678 = arg0.method1772();
		} else if (arg1 == 1) {
			this.anInt1684 = arg0.method1764();
		} else if (arg1 == 2) {
			this.anInt1681 = arg0.method1772();
		} else if (arg1 == 3) {
			this.anInt1686 = arg0.method1764();
		} else if (arg1 == 4) {
			this.anInt1685 = arg0.method1764();
		}
	}

	@OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		Static35.method621();
	}
}
