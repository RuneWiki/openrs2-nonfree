import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class2_Sub12 extends Class2 {

	@OriginalMember(owner = "client!la", name = "o", descriptor = "[I")
	public static final int[] anIntArray331 = new int[4096];

	@OriginalMember(owner = "client!la", name = "q", descriptor = "I")
	public final int anInt2882;

	static {
		for (@Pc(18) int local18 = 0; local18 < 4096; local18++) {
			anIntArray331[local18] = Static107.method2403(local18);
		}
	}

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
	public Class2_Sub12(@OriginalArg(0) int arg0) {
		this.anInt2882 = arg0;
	}
}
