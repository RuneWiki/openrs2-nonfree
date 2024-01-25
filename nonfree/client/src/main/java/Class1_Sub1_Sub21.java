import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
	private int anInt6093 = 0;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
	private int anInt6095 = 1;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
	private int anInt6098 = 0;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6093 = arg1.method4393();
		} else if (arg0 == 1) {
			this.anInt6098 = arg1.method4393();
		} else if (arg0 == 3) {
			this.anInt6095 = arg1.method4393();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		Static316.method4803();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(25) int local25 = Static337.anIntArray406[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static87.anInt1964; local33++) {
				@Pc(39) int local39 = Static436.anIntArray506[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(59) int local59;
				if (this.anInt6093 == 0) {
					local59 = (local39 - local25) * this.anInt6095;
				} else {
					@Pc(71) int local71 = local31 * local31 + local45 * local45 >> 12;
					local59 = (int) (Math.sqrt((double) ((float) local71 / 4096.0F)) * 4096.0D);
					local59 = (int) ((double) (local59 * this.anInt6095) * 3.141592653589793D);
				}
				local59 -= local59 & 0xFFFFF000;
				if (this.anInt6098 == 0) {
					local59 = Static279.anIntArray312[local59 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt6098 == 2) {
					local59 -= 2048;
					if (local59 < 0) {
						local59 = -local59;
					}
					local59 = 2048 - local59 << 1;
				}
				local11[local33] = local59;
			}
		}
		return local11;
	}
}
