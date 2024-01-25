import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public abstract class Class278 {

	@OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "()V")
	protected Class278() {
	}

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "(I)V")
	public abstract void method6648();

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(III[B)V")
	public abstract void method6649(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I[BIB)I")
	public abstract int method6650(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
	public abstract void method6651();

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(II)Z")
	public abstract boolean method6653(@OriginalArg(0) int arg0) throws IOException;
}
