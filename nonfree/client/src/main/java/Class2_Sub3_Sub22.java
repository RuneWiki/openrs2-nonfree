import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub3_Sub22 extends Class2_Sub3 {

	@OriginalMember(owner = "client!r", name = "lb", descriptor = "I")
	private int anInt3156;

	@OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
	private int anInt3157;

	@OriginalMember(owner = "client!r", name = "tb", descriptor = "I")
	private int anInt3161;

	@OriginalMember(owner = "client!r", name = "kb", descriptor = "I")
	private int anInt3155;

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			for (@Pc(24) int local24 = 0; local24 < Static54.anInt1423; local24++) {
				@Pc(38) int local38 = this.anInt3157 + (Static36.anIntArray74[local24] << 12) / this.anInt3161;
				@Pc(51) int local51 = (Static21.anIntArray50[arg0] << 12) / this.anInt3161 + this.anInt3155;
				@Pc(55) int local55 = local51;
				@Pc(63) int local63 = local38 * local38 >> 12;
				@Pc(65) int local65 = local38;
				@Pc(67) int local67 = 0;
				@Pc(73) int local73 = local51 * local51 >> 12;
				while (local63 + local73 < 16384 && this.anInt3156 > local67) {
					local55 = local51 + (local65 * local55 >> 12) * 2;
					local65 = local63 + local38 - local73;
					local63 = local65 * local65 >> 12;
					local73 = local55 * local55 >> 12;
					local67++;
				}
				local18[local24] = local67 < this.anInt3156 - 1 ? (local67 << 12) / this.anInt3156 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3161 = arg1.method1680();
		} else if (arg0 == 1) {
			this.anInt3156 = arg1.method1680();
		} else if (arg0 == 2) {
			this.anInt3157 = arg1.method1680();
		} else if (arg0 == 3) {
			this.anInt3155 = arg1.method1680();
		}
	}
}
