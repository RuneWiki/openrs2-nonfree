import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public abstract class Class118 {

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "()V")
	protected Class118() {
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(IB)Z")
	public abstract boolean method7795(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(II[BI)I")
	public abstract int method7796(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)V")
	public abstract void method7797();

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(I[BII)V")
	public abstract void method7798(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Z)V")
	public abstract void method7800();
}
