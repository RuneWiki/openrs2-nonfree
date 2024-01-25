import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class Class207 {

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V")
	protected Class207() {
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B[BII)V")
	public abstract void method5434(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V")
	public abstract void method5435();

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
	public abstract void method5436();

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I[BII)I")
	public abstract int method5438(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)Z")
	public abstract boolean method5439(@OriginalArg(0) int arg0) throws IOException;
}
