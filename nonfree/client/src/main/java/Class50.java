import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public abstract class Class50 {

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
	protected Class50() {
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "([BZII)V")
	public abstract void method6167(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)V")
	public abstract void method6168();

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)Z")
	public abstract boolean method6169(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "([BIII)I")
	public abstract int method6170(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(B)V")
	public abstract void method6171();
}
