import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class Class36 {

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	protected Class36() {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "([BIIB)V")
	public abstract void method1991(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	public abstract void method1992();

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V")
	public abstract void method1993();

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)Z")
	public abstract boolean method1994(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III[B)I")
	public abstract int method1995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;
}
