import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class Class43 {

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	protected Class43() {
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
	public abstract void method1043();

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
	public abstract void method1044();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II[BI)V")
	public abstract void method1047(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II[BB)I")
	public abstract int method1048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Z")
	public abstract boolean method1049(@OriginalArg(1) int arg0) throws IOException;
}
