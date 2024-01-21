import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class Class20 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z[B)V")
	public abstract void method710(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)[B")
	public abstract byte[] method711();
}
