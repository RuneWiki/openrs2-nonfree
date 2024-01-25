import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class Class30 {

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V")
	protected Class30() {
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Z")
	public abstract boolean method669(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public abstract void method671();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[BII)V")
	public abstract void method672(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
	public abstract void method676();

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([BIII)I")
	public abstract int method677(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException;
}
