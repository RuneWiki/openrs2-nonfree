import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!sb", name = "w", descriptor = "[I")
	public static int[] anIntArray582 = new int[32];

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Ljava/lang/String;")
	public String aString162;

	static {
		@Pc(31) int local31 = 2;
		for (@Pc(33) int local33 = 0; local33 < 32; local33++) {
			anIntArray582[local33] = local31 - 1;
			local31 += local31;
		}
	}

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub27(@OriginalArg(0) String arg0) {
		this.aString162 = arg0;
	}
}
