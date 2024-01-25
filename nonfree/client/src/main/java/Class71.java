import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class Class71 {

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	protected Class71() {
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "([BIII)I")
	public abstract int method5963(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)Z")
	public abstract boolean method5964(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
	public abstract void method5965();

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "([BIII)V")
	public abstract void method5968(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public abstract void method5970();
}
