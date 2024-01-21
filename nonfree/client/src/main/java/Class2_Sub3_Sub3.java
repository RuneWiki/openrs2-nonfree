import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "I")
	protected int anInt445;

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
	protected int anInt447;

	@OriginalMember(owner = "client!mb", name = "ob", descriptor = "[I")
	protected int[] anIntArray28;

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
	private int anInt446;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24 && this.method292()) {
			@Pc(23) int[] local23 = local7[1];
			@Pc(39) int local39 = this.anInt447 * (this.anInt445 == Static12.anInt558 ? arg0 : arg0 * this.anInt445 / Static12.anInt558);
			@Pc(43) int[] local43 = local7[0];
			@Pc(47) int[] local47 = local7[2];
			@Pc(57) int local57;
			@Pc(65) int local65;
			if (this.anInt447 == Static54.anInt1423) {
				for (local57 = 0; local57 < Static54.anInt1423; local57++) {
					local65 = this.anIntArray28[local39++];
					local47[local57] = (local65 & 0xFF) << 4;
					local23[local57] = local65 >> 4 & 0xFF0;
					local43[local57] = local65 >> 12 & 0xFF0;
				}
			} else {
				for (local57 = 0; local57 < Static54.anInt1423; local57++) {
					local65 = local57 * this.anInt447 / Static54.anInt1423;
					@Pc(117) int local117 = this.anIntArray28[local65 + local39];
					local47[local57] = (local117 & 0xFF) << 4;
					local23[local57] = local117 >> 4 & 0xFF0;
					local43[local57] = local117 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Z")
	protected final boolean method292() {
		if (this.anIntArray28 != null) {
			return true;
		} else if (this.anInt446 >= 0) {
			@Pc(25) Class2_Sub4_Sub3_Sub4 local25 = Static152.method2360(Static115.aClass40_30, this.anInt446);
			local25.method2835();
			this.anIntArray28 = local25.anIntArray366;
			this.anInt445 = local25.anInt3985;
			this.anInt447 = local25.anInt3981;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I")
	@Override
	public final int method2893() {
		return this.anInt446;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public final void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt446 = arg1.method1680();
		}
	}
}
