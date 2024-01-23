import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class4_Sub6_Sub33 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
	private int anInt5055;

	@OriginalMember(owner = "client!ui", name = "K", descriptor = "[I")
	private int[] anIntArray450;

	@OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
	private int anInt5060;

	@OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
	private int anInt5063 = -1;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub33() {
		super(0, false);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!p;II)V")
	@Override
	public void method4381(@OriginalArg(0) Class4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5063 = arg0.method1837();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4379(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = this.aClass84_41.method2153(arg0);
		if (this.aClass84_41.aBoolean183 && this.method4035()) {
			@Pc(35) int local35 = this.anInt5055 * (Static16.anInt308 == this.anInt5060 ? arg0 : arg0 * this.anInt5060 / Static16.anInt308);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[2];
			@Pc(47) int[] local47 = local11[1];
			@Pc(53) int local53;
			@Pc(62) int local62;
			if (Static2.anInt19 == this.anInt5055) {
				for (local53 = 0; local53 < Static2.anInt19; local53++) {
					local62 = this.anIntArray450[local35++];
					local43[local53] = (local62 & 0xFF) << 4;
					local47[local53] = local62 >> 4 & 0xFF0;
					local39[local53] = local62 >> 12 & 0xFF0;
				}
			} else {
				for (local53 = 0; local53 < Static2.anInt19; local53++) {
					local62 = this.anInt5055 * local53 / Static2.anInt19;
					@Pc(110) int local110 = this.anIntArray450[local35 + local62];
					local43[local53] = (local110 & 0xFF) << 4;
					local47[local53] = local110 >> 4 & 0xFF0;
					local39[local53] = local110 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)I")
	@Override
	public int method4378() {
		return this.anInt5063;
	}

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)Z")
	private boolean method4035() {
		if (this.anIntArray450 != null) {
			return true;
		} else if (this.anInt5063 < 0) {
			return false;
		} else {
			@Pc(15) int local15 = Static2.anInt19;
			@Pc(17) int local17 = Static16.anInt308;
			@Pc(28) int local28 = Static224.anInterface5_1.method1962(this.anInt5063).aBoolean326 ? 64 : 128;
			this.anIntArray450 = Static224.anInterface5_1.method1961(local28, local28, 1.0F, this.anInt5063);
			this.anInt5055 = local28;
			this.anInt5060 = local28;
			Static147.method2365(local17, local15);
			return this.anIntArray450 != null;
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	@Override
	public void method4373() {
		super.method4373();
		this.anIntArray450 = null;
	}
}
