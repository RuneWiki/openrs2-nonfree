import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
	private int anInt1953;

	@OriginalMember(owner = "client!fk", name = "M", descriptor = "I")
	private int anInt1955;

	@OriginalMember(owner = "client!fk", name = "P", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
	private int anInt1958 = -1;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub12() {
		super(0, false);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4586(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = this.aClass25_41.method652(arg0);
		if (this.aClass25_41.aBoolean53 && this.method1508()) {
			@Pc(43) int local43 = (this.anInt1955 == Static64.anInt1560 ? arg0 : this.anInt1955 * arg0 / Static64.anInt1560) * this.anInt1953;
			@Pc(47) int[] local47 = local19[1];
			@Pc(51) int[] local51 = local19[2];
			@Pc(55) int[] local55 = local19[0];
			@Pc(61) int local61;
			@Pc(71) int local71;
			if (Static281.anInt5558 == this.anInt1953) {
				for (local61 = 0; local61 < Static281.anInt5558; local61++) {
					local71 = this.anIntArray172[local43++];
					local51[local61] = (local71 & 0xFF) << 4;
					local47[local61] = local71 >> 4 & 0xFF0;
					local55[local61] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local61 = 0; local61 < Static281.anInt5558; local61++) {
					local71 = this.anInt1953 * local61 / Static281.anInt5558;
					@Pc(78) int local78 = this.anIntArray172[local43 + local71];
					local51[local61] = (local78 & 0xFF) << 4;
					local47[local61] = local78 >> 4 & 0xFF0;
					local55[local61] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1958 = arg0.method2130();
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)Z")
	private boolean method1508() {
		if (this.anIntArray172 != null) {
			return true;
		} else if (this.anInt1958 >= 0) {
			@Pc(25) int local25 = Static64.anInt1560;
			@Pc(27) int local27 = Static281.anInt5558;
			@Pc(38) int local38 = Static136.anInterface1_1.method4105(this.anInt1958).aBoolean221 ? 64 : 128;
			this.anIntArray172 = Static136.anInterface1_1.method4107(1.0F, local38, local38, this.anInt1958);
			this.anInt1955 = local38;
			this.anInt1953 = local38;
			Static140.method2491(local25, local27);
			return this.anIntArray172 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)I")
	@Override
	public int method4593() {
		return this.anInt1958;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
	@Override
	public void method4591() {
		super.method4591();
		this.anIntArray172 = null;
	}
}
