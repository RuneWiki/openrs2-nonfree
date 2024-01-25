import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class3_Sub8_Sub2 extends Class3_Sub8 {

	@OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
	private int anInt1197 = 0;

	@OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
	private int anInt1198 = 0;

	@OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
	private int anInt1201 = 20;

	@OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
	private int anInt1204 = 1365;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt1204 = arg1.method7951();
		} else if (arg0 == 1) {
			this.anInt1201 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anInt1197 = arg1.method7951();
		} else if (arg0 == 3) {
			this.anInt1198 = arg1.method7951();
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			for (@Pc(22) int local22 = 0; local22 < Static91.anInt1849; local22++) {
				@Pc(36) int local36 = this.anInt1197 + (Static13.anIntArray11[local22] << 12) / this.anInt1204;
				@Pc(48) int local48 = (Static510.anIntArray172[arg0] << 12) / this.anInt1204 + this.anInt1198;
				@Pc(54) int local54 = local36;
				@Pc(56) int local56 = local48;
				@Pc(62) int local62 = local36 * local36 >> 12;
				@Pc(68) int local68 = local48 * local48 >> 12;
				@Pc(70) int local70;
				for (local70 = 0; local68 + local62 < 16384 && local70 < this.anInt1201; local70++) {
					local56 = local48 + (local54 * local56 >> 12) * 2;
					local54 = local36 + local62 - local68;
					local62 = local54 * local54 >> 12;
					local68 = local56 * local56 >> 12;
				}
				local11[local22] = local70 >= this.anInt1201 - 1 ? 0 : (local70 << 12) / this.anInt1201;
			}
		}
		return local11;
	}
}
