import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class Class240 {

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "()V")
	protected Class240() {
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public abstract void method6372();

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([BIII)I")
	public abstract int method6374(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)V")
	public abstract void method6377();

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "([BIII)V")
	public abstract void method6378(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(II)Z")
	public abstract boolean method6379(@OriginalArg(0) int arg0) throws IOException;
}
