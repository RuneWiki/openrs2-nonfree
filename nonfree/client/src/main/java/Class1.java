import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class Class1 {

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	protected Class1() {
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public abstract void method47();

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)Z")
	public abstract boolean method49(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public abstract void method50();

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB[B)I")
	public abstract int method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([BZII)V")
	public abstract void method53(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException;
}
