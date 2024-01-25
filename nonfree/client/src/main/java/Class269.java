import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public abstract class Class269 {

	@OriginalMember(owner = "client!sea", name = "<init>", descriptor = "()V")
	protected Class269() {
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
	public abstract void method6697();

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(III[B)V")
	public abstract void method6698(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)Z")
	public abstract boolean method6699(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
	public abstract void method6700();

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II[BI)I")
	public abstract int method6702(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;
}
