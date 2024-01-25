import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public abstract class Class5 {

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "[I")
	public static final int[] anIntArray31 = new int[128];

	static {
		for (@Pc(31) int local31 = 0; local31 < anIntArray31.length; local31++) {
			anIntArray31[local31] = -1;
		}
		for (@Pc(47) int local47 = 65; local47 <= 90; local47++) {
			anIntArray31[local47] = local47 - 65;
		}
		for (@Pc(62) int local62 = 97; local62 <= 122; local62++) {
			anIntArray31[local62] = local62 + 26 - 97;
		}
		for (@Pc(77) int local77 = 48; local77 <= 57; local77++) {
			anIntArray31[local77] = local77 + 52 - 48;
		}
		anIntArray31[45] = anIntArray31[47] = 63;
		anIntArray31[42] = anIntArray31[43] = 62;
	}

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V")
	protected Class5() {
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)Z")
	public abstract boolean method106(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
	public abstract void method107();

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)V")
	public abstract void method108();

	@OriginalMember(owner = "client!maa", name = "b", descriptor = "(II[BI)I")
	public abstract int method109(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(II[BI)V")
	public abstract void method111(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;
}
