import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public abstract class Class99 {

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	protected Class99() {
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[BII)I")
	public abstract int method4959(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
	public abstract void method4960();

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Z")
	public abstract boolean method4961(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
	public abstract void method4963();

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III[B)V")
	public abstract void method4964(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;
}
