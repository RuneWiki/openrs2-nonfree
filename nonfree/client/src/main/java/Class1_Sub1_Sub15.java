import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ifa", name = "F", descriptor = "I")
	private int anInt4022 = 20;

	@OriginalMember(owner = "client!ifa", name = "H", descriptor = "I")
	private int anInt4024 = 0;

	@OriginalMember(owner = "client!ifa", name = "G", descriptor = "I")
	private int anInt4023 = 1365;

	@OriginalMember(owner = "client!ifa", name = "C", descriptor = "I")
	private int anInt4021 = 0;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			for (@Pc(23) int local23 = 0; local23 < Static501.anInt8748; local23++) {
				@Pc(37) int local37 = (Static95.anIntArray77[local23] << 12) / this.anInt4023 + this.anInt4021;
				@Pc(49) int local49 = (Static583.anIntArray614[arg0] << 12) / this.anInt4023 + this.anInt4024;
				@Pc(55) int local55 = local37;
				@Pc(57) int local57 = local49;
				@Pc(63) int local63 = local37 * local37 >> 12;
				@Pc(69) int local69 = local49 * local49 >> 12;
				@Pc(71) int local71 = 0;
				while (local69 + local63 < 16384 && local71 < this.anInt4022) {
					local57 = (local55 * local57 >> 12) * 2 + local49;
					local55 = local37 + local63 - local69;
					local71++;
					local63 = local55 * local55 >> 12;
					local69 = local57 * local57 >> 12;
				}
				local17[local23] = local71 >= this.anInt4022 - 1 ? 0 : (local71 << 12) / this.anInt4022;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4023 = arg1.method7945();
		} else if (arg0 == 1) {
			this.anInt4022 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt4021 = arg1.method7945();
		} else if (arg0 == 3) {
			this.anInt4024 = arg1.method7945();
		}
	}
}
