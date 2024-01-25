import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ej")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)I")
	private int method2165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 + arg1 * 57;
		@Pc(16) int local16 = local10 ^ local10 << 1;
		return 4096 - (local16 * (local16 * 15731 * local16 + 789221) + 1376312589 & Integer.MAX_VALUE) / 262144;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(24) int local24 = Static583.anIntArray614[arg0];
			for (@Pc(26) int local26 = 0; local26 < Static501.anInt8748; local26++) {
				local16[local26] = this.method2165(Static95.anIntArray77[local26], local24) % 4096;
			}
		}
		return local16;
	}
}
