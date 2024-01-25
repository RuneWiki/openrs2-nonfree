import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class4_Sub1_Sub14 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
	private int anInt4506 = 0;

	@OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
	private int anInt4507 = 20;

	@OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
	private int anInt4505 = 0;

	@OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
	private int anInt4508 = 1365;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			for (@Pc(25) int local25 = 0; local25 < Static376.anInt7260; local25++) {
				@Pc(39) int local39 = this.anInt4506 + (Static292.anIntArray394[local25] << 12) / this.anInt4508;
				@Pc(51) int local51 = this.anInt4505 + (Static442.anIntArray449[arg0] << 12) / this.anInt4508;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73 = 0;
				while (local65 + local71 < 16384 && this.anInt4507 > local73) {
					local59 = (local57 * local59 >> 12) * 2 + local51;
					local57 = local65 + local39 - local71;
					local65 = local57 * local57 >> 12;
					local73++;
					local71 = local59 * local59 >> 12;
				}
				local11[local25] = local73 >= this.anInt4507 - 1 ? 0 : (local73 << 12) / this.anInt4507;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4508 = arg1.method4936();
		} else if (arg0 == 1) {
			this.anInt4507 = arg1.method4936();
		} else if (arg0 == 2) {
			this.anInt4506 = arg1.method4936();
		} else if (arg0 == 3) {
			this.anInt4505 = arg1.method4936();
		}
	}
}
