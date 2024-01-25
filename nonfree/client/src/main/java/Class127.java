import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public abstract class Class127 {

	@OriginalMember(owner = "client!hca", name = "<init>", descriptor = "()V")
	protected Class127() {
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)V")
	public abstract void method6305();

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(BII[B)I")
	public abstract int method6307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)Z")
	public abstract boolean method6308(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I[BIB)V")
	public abstract void method6309(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)V")
	public abstract void method6312();
}
