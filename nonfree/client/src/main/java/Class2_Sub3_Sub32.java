import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class2_Sub3_Sub32 extends Class2_Sub3 {

	@OriginalMember(owner = "client!uf", name = "mb", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!uf", name = "qb", descriptor = "I")
	private int anInt3749;

	@OriginalMember(owner = "client!uf", name = "vb", descriptor = "I")
	private int anInt3754;

	@OriginalMember(owner = "client!uf", name = "tb", descriptor = "I")
	private int anInt3752;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)Z")
	private boolean method2618() {
		if (this.anIntArray350 != null) {
			return true;
		} else if (this.anInt3752 >= 0) {
			@Pc(21) int local21 = Static29.anInterface2_2.method2664(this.anInt3752) ? 64 : 128;
			this.anIntArray350 = Static29.anInterface2_2.method2665(this.anInt3752);
			this.anInt3749 = local21;
			this.anInt3754 = local21;
			return this.anIntArray350 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)I")
	@Override
	public int method2903() {
		return this.anInt3752;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24 && this.method2618()) {
			@Pc(43) int local43 = (Static12.anInt558 == this.anInt3749 ? arg0 : arg0 * this.anInt3749 / Static12.anInt558) * this.anInt3754;
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local19[1];
			@Pc(55) int[] local55 = local19[2];
			@Pc(65) int local65;
			@Pc(73) int local73;
			if (this.anInt3754 == Static54.anInt1423) {
				for (local65 = 0; local65 < Static54.anInt1423; local65++) {
					local73 = this.anIntArray350[local43++];
					local55[local65] = (local73 & 0xFF) << 4;
					local51[local65] = local73 >> 4 & 0xFF0;
					local47[local65] = local73 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static54.anInt1423; local65++) {
					local73 = this.anInt3754 * local65 / Static54.anInt1423;
					@Pc(126) int local126 = this.anIntArray350[local43 + local73];
					local55[local65] = (local126 & 0xFF) << 4;
					local51[local65] = local126 >> 4 & 0xFF0;
					local47[local65] = local126 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3752 = arg1.method1680();
		}
	}
}
