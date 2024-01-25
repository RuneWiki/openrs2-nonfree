import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!pg", name = "Q", descriptor = "I")
	private int anInt5109 = 32768;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5109 = arg1.method4485() << 4;
		} else if (arg0 == 1) {
			super.aBoolean612 = arg1.method4463() == 1;
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(21) int[] local21 = this.method5620(arg0, 1);
			@Pc(27) int[] local27 = this.method5620(arg0, 2);
			for (@Pc(29) int local29 = 0; local29 < Static434.anInt4326; local29++) {
				@Pc(39) int local39 = local21[local29] >> 4 & 0xFF;
				@Pc(48) int local48 = this.anInt5109 * local27[local29] >> 12;
				@Pc(56) int local56 = Static366.anIntArray375[local39] * local48 >> 12;
				@Pc(64) int local64 = local48 * Static54.anIntArray46[local39] >> 12;
				@Pc(72) int local72 = (local56 >> 12) + local29 & Static429.anInt7144;
				@Pc(80) int local80 = Static249.anInt4068 & arg0 + (local64 >> 12);
				@Pc(86) int[] local86 = this.method5620(local80, 0);
				local11[local29] = local86[local72];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5626(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass117_41.method2345(arg0);
		if (super.aClass117_41.aBoolean221) {
			@Pc(27) int[] local27 = this.method5620(arg0, 1);
			@Pc(33) int[] local33 = this.method5620(arg0, 2);
			@Pc(37) int[] local37 = local11[0];
			@Pc(41) int[] local41 = local11[1];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static434.anInt4326; local47++) {
				@Pc(59) int local59 = local27[local47] * 255 >> 12 & 0xFF;
				@Pc(68) int local68 = local33[local47] * this.anInt5109 >> 12;
				@Pc(76) int local76 = Static366.anIntArray375[local59] * local68 >> 12;
				@Pc(84) int local84 = local68 * Static54.anIntArray46[local59] >> 12;
				@Pc(93) int local93 = Static429.anInt7144 & local47 + (local76 >> 12);
				@Pc(102) int local102 = Static249.anInt4068 & arg0 + (local84 >> 12);
				@Pc(108) int[][] local108 = this.method5624(0, local102);
				local37[local47] = local108[0][local93];
				local41[local47] = local108[1][local93];
				local45[local47] = local108[2][local93];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		Static103.method1475();
	}
}
