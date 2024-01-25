import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public abstract class Class244 {

	static {
		new Class394("", 76);
	}

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "()V")
	protected Class244() {
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IB)Z")
	public abstract boolean method5750(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)V")
	public abstract void method5751();

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "([BIII)V")
	public abstract void method5752(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException;

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)V")
	public abstract void method5753();

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IB[BI)I")
	public abstract int method5754(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;
}
