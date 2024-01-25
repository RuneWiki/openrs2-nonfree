import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class Class45 {

	@OriginalMember(owner = "client!tn", name = "<init>", descriptor = "()V")
	protected Class45() {
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "([BZII)V")
	public abstract void method837(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(III[B)I")
	public abstract int method838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
	public abstract void method839();

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
	public abstract void method840();

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)Z")
	public abstract boolean method841(@OriginalArg(0) int arg0) throws IOException;
}
