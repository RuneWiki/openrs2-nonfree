import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class Class154 {

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
	protected Class154() {
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
	public abstract void method4017();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZI)Z")
	public abstract boolean method4019(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public abstract void method4020();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB[BI)I")
	public abstract int method4022(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[B)V")
	public abstract void method4023(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;
}
