import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class Class121 {

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
	protected Class121() {
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	public abstract void method2933();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z")
	public abstract boolean method2934(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Z)V")
	public abstract void method2936();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[BI)V")
	public abstract void method2937(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[B)I")
	public abstract int method2938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;
}
