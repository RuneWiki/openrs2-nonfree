import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class2_Sub3_Sub7 extends Class2_Sub3 {

	@OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
	private int anInt2974 = 0;

	@OriginalMember(owner = "client!dn", name = "L", descriptor = "I")
	private int anInt2976 = 1;

	@OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
	private int anInt2978 = 0;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!cea;II)V")
	@Override
	public void method9157(@OriginalArg(0) Class2_Sub11 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2974 = arg0.method8383();
		} else if (arg1 == 1) {
			this.anInt2978 = arg0.method8383();
		} else if (arg1 == 3) {
			this.anInt2976 = arg0.method8383();
		}
	}

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V")
	@Override
	public void method9152() {
		Static508.method7815();
	}

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass281_41.method7189(arg0);
		if (super.aClass281_41.aBoolean607) {
			@Pc(25) int local25 = Static547.anIntArray641[arg0];
			@Pc(31) int local31 = local25 - 2048 >> 1;
			for (@Pc(33) int local33 = 0; local33 < Static222.anInt4971; local33++) {
				@Pc(39) int local39 = Static464.anIntArray556[local33];
				@Pc(45) int local45 = local39 - 2048 >> 1;
				@Pc(59) int local59;
				if (this.anInt2974 == 0) {
					local59 = this.anInt2976 * (local39 - local25);
				} else {
					@Pc(71) int local71 = local45 * local45 + local31 * local31 >> 12;
					local59 = (int) (Math.sqrt((double) ((float) local71 / 4096.0F)) * 4096.0D);
					local59 = (int) ((double) (this.anInt2976 * local59) * 3.141592653589793D);
				}
				local59 -= local59 & 0xFFFFF000;
				if (this.anInt2978 == 0) {
					local59 = Static56.anIntArray79[local59 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2978 == 2) {
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
