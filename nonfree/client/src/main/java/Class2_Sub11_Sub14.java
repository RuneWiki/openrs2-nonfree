import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class2_Sub11_Sub14 extends Class2_Sub11 {

	@OriginalMember(owner = "client!ls", name = "F", descriptor = "[I")
	public static final int[] anIntArray416 = new int[120];

	static {
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < 120; local21++) {
			@Pc(26) int local26 = local21 + 1;
			@Pc(39) int local39 = (int) (Math.pow(2.0D, (double) local26 / 7.0D) * 300.0D + (double) local26);
			local19 += local39;
			anIntArray416[local21] = local19 / 4;
		}
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			Static728.method275(local11, 0, Static301.anInt10214, Static137.anIntArray170[arg0]);
		}
		return local11;
	}
}
