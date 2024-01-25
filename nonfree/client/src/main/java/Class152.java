import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public abstract class Class152 {

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "()V")
	protected Class152() {
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	public abstract void method3908();

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "([BBII)I")
	public abstract int method3909(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Z")
	public abstract boolean method3910(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II[BB)V")
	public abstract void method3911(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
	public abstract void method3913();
}
