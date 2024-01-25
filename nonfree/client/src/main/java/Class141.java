import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class Class141 {

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
	protected Class141() {
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([BIII)V")
	public abstract void method7609(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(III[B)I")
	public abstract int method7610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public abstract void method7611();

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Z")
	public abstract boolean method7613(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
	public abstract void method7615();
}
