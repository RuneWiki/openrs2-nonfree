import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public abstract class Class165 {

	@OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V")
	protected Class165() {
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(III[B)V")
	public abstract void method3975(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IB[BI)I")
	public abstract int method3976(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public abstract void method3977();

	@OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)V")
	public abstract void method3981();

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)Z")
	public abstract boolean method3982(@OriginalArg(1) int arg0) throws IOException;
}
