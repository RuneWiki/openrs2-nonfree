import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oc", name = "db", descriptor = "I")
	private int anInt3371;

	@OriginalMember(owner = "client!oc", name = "mb", descriptor = "[I")
	private int[] anIntArray294;

	@OriginalMember(owner = "client!oc", name = "pb", descriptor = "I")
	private int anInt3378;

	@OriginalMember(owner = "client!oc", name = "fb", descriptor = "I")
	private int anInt3373 = -1;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(0, false);
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)I")
	@Override
	public int method3714() {
		return this.anInt3373;
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
	@Override
	public void method3709() {
		super.method3709();
		this.anIntArray294 = null;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3704(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass71_41.method2050(arg0);
		if (super.aClass71_41.aBoolean221 && this.method2506()) {
			@Pc(43) int local43 = this.anInt3371 * (Static116.anInt2571 == this.anInt3378 ? arg0 : this.anInt3378 * arg0 / Static116.anInt2571);
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local19[2];
			@Pc(55) int[] local55 = local19[1];
			@Pc(65) int local65;
			@Pc(74) int local74;
			if (Static11.anInt294 == this.anInt3371) {
				for (local65 = 0; local65 < Static11.anInt294; local65++) {
					local74 = this.anIntArray294[local43++];
					local51[local65] = (local74 & 0xFF) << 4;
					local55[local65] = local74 >> 4 & 0xFF0;
					local47[local65] = local74 >> 12 & 0xFF0;
				}
			} else {
				for (local65 = 0; local65 < Static11.anInt294; local65++) {
					local74 = local65 * this.anInt3371 / Static11.anInt294;
					@Pc(81) int local81 = this.anIntArray294[local74 + local43];
					local51[local65] = (local81 & 0xFF) << 4;
					local55[local65] = local81 >> 4 & 0xFF0;
					local47[local65] = local81 >> 12 & 0xFF0;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)Z")
	private boolean method2506() {
		if (this.anIntArray294 != null) {
			return true;
		} else if (this.anInt3373 >= 0) {
			@Pc(13) int local13 = Static11.anInt294;
			@Pc(15) int local15 = Static116.anInt2571;
			@Pc(25) int local25 = Static150.anInterface4_2.method1638(this.anInt3373) ? 64 : 128;
			this.anIntArray294 = Static150.anInterface4_2.method1637(this.anInt3373);
			this.anInt3371 = local25;
			this.anInt3378 = local25;
			Static13.method328(local13, local15);
			return this.anIntArray294 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3373 = arg0.method2964();
		}
	}
}
