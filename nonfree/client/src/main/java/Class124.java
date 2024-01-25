import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public abstract class Class124 {

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	protected Class124() {
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI[BI)I")
	public abstract int method2250(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)Z")
	public abstract boolean method2253(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public abstract void method2255();

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
	public abstract void method2256();

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZII[B)V")
	public abstract void method2257(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;
}
