import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public abstract class Class97 {

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V")
	protected Class97() {
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V")
	public abstract void method2286();

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(B[BII)V")
	public abstract void method2289(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II)Z")
	public abstract boolean method2290(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)V")
	public abstract void method2293();

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(II[BI)I")
	public abstract int method2294(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;
}
