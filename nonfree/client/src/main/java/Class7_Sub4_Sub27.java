import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class7_Sub4_Sub27 extends Class7_Sub4 {

	@OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
	private int anInt4801 = 0;

	@OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
	private int anInt4796 = 1;

	@OriginalMember(owner = "client!pj", name = "J", descriptor = "I")
	private int anInt4799 = 0;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "(B)V")
	@Override
	public void method5635() {
		Static14.method201();
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass219_41.method5708(arg0);
		if (super.aClass219_41.aBoolean495) {
			@Pc(27) int local27 = Static314.anIntArray756[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static201.anInt4174; local35++) {
				@Pc(41) int local41 = Static129.anIntArray375[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(74) int local74;
				if (this.anInt4801 == 0) {
					local74 = (local41 - local27) * this.anInt4796;
				} else {
					@Pc(64) int local64 = local47 * local47 + local33 * local33 >> 12;
					local74 = (int) (Math.sqrt((double) ((float) local64 / 4096.0F)) * 4096.0D);
					local74 = (int) ((double) (local74 * this.anInt4796) * 3.141592653589793D);
				}
				local74 -= local74 & 0xFFFFF000;
				if (this.anInt4799 == 0) {
					local74 = Static268.anIntArray680[local74 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4799 == 2) {
					local74 -= 2048;
					if (local74 < 0) {
						local74 = -local74;
					}
					local74 = 2048 - local74 << 1;
				}
				local19[local35] = local74;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!ap;BI)V")
	@Override
	public void method5636(@OriginalArg(0) Class7_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4801 = arg0.method2772();
		} else if (arg1 == 1) {
			this.anInt4799 = arg0.method2772();
		} else if (arg1 == 3) {
			this.anInt4796 = arg0.method2772();
		}
	}
}
