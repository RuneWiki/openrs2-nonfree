import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class4_Sub2_Sub12 extends Class4_Sub2 {

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "I")
	private int anInt2867 = 0;

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
	private int anInt2866 = 0;

	@OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
	private int anInt2871 = 1;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(25) int local25 = Static293.anIntArray461[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static350.anInt6330; local33++) {
				@Pc(39) int local39 = Static197.anIntArray566[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(68) int local68;
				if (this.anInt2867 == 0) {
					local68 = (local39 - local25) * this.anInt2871;
				} else {
					@Pc(58) int local58 = local45 * local45 + local31 * local31 >> 12;
					local68 = (int) (Math.sqrt((double) ((float) local58 / 4096.0F)) * 4096.0D);
					local68 = (int) ((double) (this.anInt2871 * local68) * 3.141592653589793D);
				}
				local68 -= local68 & 0xFFFFF000;
				if (this.anInt2866 == 0) {
					local68 = Static249.anIntArray375[local68 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2866 == 2) {
					local68 -= 2048;
					if (local68 < 0) {
						local68 = -local68;
					}
					local68 = 2048 - local68 << 1;
				}
				local11[local33] = local68;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		Static47.method995();
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt2867 = arg1.method4864();
		} else if (arg0 == 1) {
			this.anInt2866 = arg1.method4864();
		} else if (arg0 == 3) {
			this.anInt2871 = arg1.method4864();
		}
	}
}
