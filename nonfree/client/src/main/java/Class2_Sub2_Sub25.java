import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class2_Sub2_Sub25 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
	private int anInt2490;

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
	private int anInt2497;

	@OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
	private int anInt2503;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	@Override
	public void method2574() {
		Static100.method1657();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			@Pc(19) int local19 = Static86.anIntArray218[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static149.anInt3233; local27++) {
				@Pc(33) int local33 = Static154.anIntArray354[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(53) int local53;
				if (this.anInt2497 == 0) {
					local53 = (local33 - local19) * this.anInt2490;
				} else {
					@Pc(65) int local65 = local25 * local25 + local39 * local39 >> 12;
					local53 = (int) (Math.sqrt((double) (local65 / 4096)) * 4096.0D);
					local53 = (int) ((double) (this.anInt2490 * local53) * 3.141592653589793D);
				}
				local53 -= local53 & 0xFFFFF000;
				if (this.anInt2503 == 0) {
					local53 = Static20.anIntArray37[local53 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2503 == 2) {
					local53 -= 2048;
					if (local53 < 0) {
						local53 = -local53;
					}
					local53 = 2048 - local53 << 1;
				}
				local11[local27] = local53;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2497 = arg1.method1461();
		} else if (arg0 == 1) {
			this.anInt2503 = arg1.method1461();
		} else if (arg0 == 3) {
			this.anInt2490 = arg1.method1461();
		}
	}
}
