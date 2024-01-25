import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public abstract class Class160 {

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V")
	protected Class160() {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public abstract void method3505();

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	public abstract void method3506();

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[BI)V")
	public abstract void method3508(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZI)Z")
	public abstract boolean method3510(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB[BI)I")
	public abstract int method3511(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;
}
