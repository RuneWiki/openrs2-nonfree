import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uha")
public final class Class3_Sub2_Sub36 extends Class3_Sub2 {

	@OriginalMember(owner = "client!uha", name = "y", descriptor = "I")
	private int anInt9503 = 0;

	@OriginalMember(owner = "client!uha", name = "z", descriptor = "I")
	private int anInt9504 = 16;

	@OriginalMember(owner = "client!uha", name = "H", descriptor = "I")
	private int anInt9510 = 4096;

	@OriginalMember(owner = "client!uha", name = "I", descriptor = "I")
	private int anInt9511 = 2000;

	@OriginalMember(owner = "client!uha", name = "A", descriptor = "I")
	private int anInt9505 = 0;

	@OriginalMember(owner = "client!uha", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(I)V")
	@Override
	public void method8712() {
		Static272.method4337();
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			@Pc(28) int local28 = this.anInt9510 >> 1;
			@Pc(33) int[][] local33 = super.aClass340_41.method7838();
			@Pc(40) Random local40 = new Random((long) this.anInt9503);
			for (@Pc(42) int local42 = 0; local42 < this.anInt9511; local42++) {
				@Pc(67) int local67 = this.anInt9510 <= 0 ? this.anInt9505 : this.anInt9505 + Static610.method8052(this.anInt9510, local40) - local28;
				@Pc(73) int local73 = local67 >> 4 & 0xFF;
				@Pc(80) int local80 = Static610.method8052(Static30.anInt908, local40);
				@Pc(87) int local87 = Static610.method8052(Static157.anInt2964, local40);
				@Pc(99) int local99 = local80 + (this.anInt9504 * Static540.anIntArray454[local73] >> 12);
				@Pc(111) int local111 = local87 + (this.anInt9504 * Static10.anIntArray5[local73] >> 12);
				@Pc(116) int local116 = local111 - local87;
				@Pc(120) int local120 = local99 - local80;
				if (local120 != 0 || local116 != 0) {
					if (local120 < 0) {
						local120 = -local120;
					}
					if (local116 < 0) {
						local116 = -local116;
					}
					@Pc(148) boolean local148 = local120 < local116;
					@Pc(152) int local152;
					@Pc(154) int local154;
					if (local148) {
						local152 = local80;
						local154 = local99;
						local80 = local87;
						local99 = local111;
						local87 = local152;
						local111 = local154;
					}
					if (local99 < local80) {
						local152 = local80;
						local80 = local99;
						local154 = local87;
						local87 = local111;
						local99 = local152;
						local111 = local154;
					}
					local152 = local87;
					local154 = local99 - local80;
					@Pc(193) int local193 = local111 - local87;
					@Pc(198) int local198 = -local154 / 2;
					@Pc(202) int local202 = 2048 / local154;
					@Pc(212) int local212 = 1024 - (Static610.method8052(4096, local40) >> 2);
					@Pc(219) int local219 = local111 <= local87 ? -1 : 1;
					if (local193 < 0) {
						local193 = -local193;
					}
					for (@Pc(226) int local226 = local80; local226 < local99; local226++) {
						@Pc(239) int local239 = local202 * (local226 - local80) + local212 + 1024;
						@Pc(243) int local243 = Static241.anInt4556 & local226;
						@Pc(247) int local247 = Static622.anInt9680 & local152;
						local198 += local193;
						if (local148) {
							local33[local247][local243] = local239;
						} else {
							local33[local243][local247] = local239;
						}
						if (local198 > 0) {
							local152 -= -local219;
							local198 += -local154;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!uha", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9503 = arg0.method4888();
		} else if (arg1 == 1) {
			this.anInt9511 = arg0.method4858();
		} else if (arg1 == 2) {
			this.anInt9504 = arg0.method4888();
		} else if (arg1 == 3) {
			this.anInt9505 = arg0.method4858();
		} else if (arg1 == 4) {
			this.anInt9510 = arg0.method4858();
		}
	}
}
