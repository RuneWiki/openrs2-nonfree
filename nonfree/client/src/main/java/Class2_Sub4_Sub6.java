import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class2_Sub4_Sub6 extends Class2_Sub4 {

	@OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
	private int anInt893 = 4096;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub6() {
		super(1, true);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			@Pc(29) int[] local29 = this.method3129(0, Static167.anInt3559 & arg0 - 1);
			@Pc(37) int[] local37 = this.method3129(0, arg0);
			@Pc(47) int[] local47 = this.method3129(0, Static167.anInt3559 & arg0 + 1);
			for (@Pc(49) int local49 = 0; local49 < Static118.anInt2608; local49++) {
				@Pc(63) int local63 = this.anInt893 * (local47[local49] - local29[local49]);
				@Pc(82) int local82 = this.anInt893 * (local37[Static82.anInt1734 & local49 + 1] - local37[local49 - 1 & Static82.anInt1734]);
				@Pc(86) int local86 = local82 >> 12;
				@Pc(90) int local90 = local63 >> 12;
				@Pc(96) int local96 = local86 * local86 >> 12;
				@Pc(102) int local102 = local90 * local90 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((float) (local96 + local102 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local13[local49] = 4096 - local128;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt893 = arg1.method1557();
		}
	}
}
