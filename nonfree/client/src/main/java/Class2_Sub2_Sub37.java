import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class2_Sub2_Sub37 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
	private int anInt9478 = 0;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	private int anInt9480 = 0;

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
	private int anInt9479 = 20;

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
	private int anInt9482 = 1365;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9482 = arg0.method4294();
		} else if (arg1 == 1) {
			this.anInt9479 = arg0.method4294();
		} else if (arg1 == 2) {
			this.anInt9480 = arg0.method4294();
		} else if (arg1 == 3) {
			this.anInt9478 = arg0.method4294();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			for (@Pc(25) int local25 = 0; local25 < Static153.anInt3070; local25++) {
				@Pc(39) int local39 = this.anInt9480 + (Static260.anIntArray327[local25] << 12) / this.anInt9482;
				@Pc(51) int local51 = this.anInt9478 + (Static211.anIntArray576[arg0] << 12) / this.anInt9482;
				@Pc(57) int local57 = local39;
				@Pc(59) int local59 = local51;
				@Pc(65) int local65 = local39 * local39 >> 12;
				@Pc(71) int local71 = local51 * local51 >> 12;
				@Pc(73) int local73;
				for (local73 = 0; local65 + local71 < 16384 && this.anInt9479 > local73; local73++) {
					local59 = local51 + (local59 * local57 >> 12) * 2;
					local57 = local39 + local65 - local71;
					local71 = local59 * local59 >> 12;
					local65 = local57 * local57 >> 12;
				}
				local19[local25] = this.anInt9479 - 1 > local73 ? (local73 << 12) / this.anInt9479 : 0;
			}
		}
		return local19;
	}
}
