import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class4_Sub1_Sub34 extends Class4_Sub1 {

	@OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
	private int anInt4898 = 0;

	@OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
	private int anInt4901 = 2048;

	@OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
	private int anInt4902 = 0;

	@OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
	private int anInt4911 = 4096;

	@OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
	private int anInt4903 = 12288;

	@OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
	private int anInt4915 = 8192;

	@OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
	private int anInt4916 = 2048;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)Z")
	private boolean method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 + arg1) * this.anInt4903 >> 12;
		@Pc(28) int local28 = Static284.anIntArray447[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt4903;
		@Pc(42) int local42 = (local35 << 12) / this.anInt4915;
		@Pc(49) int local49 = this.anInt4911 * local42 >> 12;
		return local49 > arg0 - arg1 && -local49 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4901 = arg1.method3085();
		} else if (arg0 == 1) {
			this.anInt4902 = arg1.method3085();
		} else if (arg0 == 2) {
			this.anInt4898 = arg1.method3085();
		} else if (arg0 == 3) {
			this.anInt4916 = arg1.method3085();
		} else if (arg0 == 4) {
			this.anInt4903 = arg1.method3085();
		} else if (arg0 == 5) {
			this.anInt4911 = arg1.method3085();
		} else if (arg0 == 6) {
			this.anInt4915 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(III)Z")
	private boolean method3850(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg1 - arg0) * this.anInt4903 >> 12;
		@Pc(23) int local23 = Static284.anIntArray447[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt4903;
		@Pc(43) int local43 = (local30 << 12) / this.anInt4915;
		@Pc(50) int local50 = this.anInt4911 * local43 >> 12;
		return local50 > arg0 + arg1 && arg1 + arg0 > -local50;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		Static37.method1936();
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(28) int local28 = Static10.anIntArray7[arg0] - 2048;
			for (@Pc(30) int local30 = 0; local30 < Static68.anInt1753; local30++) {
				@Pc(39) int local39 = Static94.anIntArray163[local30] - 2048;
				@Pc(44) int local44 = this.anInt4916 + local28;
				@Pc(49) int local49 = this.anInt4902 + local28;
				@Pc(60) int local60 = local44 >= -2048 ? local44 : local44 + 4096;
				@Pc(69) int local69 = local60 > 2048 ? local60 - 4096 : local60;
				@Pc(74) int local74 = this.anInt4901 + local39;
				@Pc(79) int local79 = this.anInt4898 + local39;
				@Pc(88) int local88 = local79 < -2048 ? local79 + 4096 : local79;
				@Pc(99) int local99 = local74 >= -2048 ? local74 : local74 + 4096;
				@Pc(108) int local108 = local99 > 2048 ? local99 - 4096 : local99;
				@Pc(119) int local119 = local88 > 2048 ? local88 - 4096 : local88;
				@Pc(128) int local128 = local49 < -2048 ? local49 + 4096 : local49;
				@Pc(139) int local139 = local128 <= 2048 ? local128 : local128 - 4096;
				local17[local30] = this.method3850(local108, local139) || this.method3842(local69, local119) ? 4096 : 0;
			}
		}
		return local17;
	}
}
