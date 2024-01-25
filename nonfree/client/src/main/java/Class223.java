import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public abstract class Class223 {

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "()V")
	protected Class223() {
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	public abstract void method5105();

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I[BII)I")
	public abstract int method5106(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "([BIII)V")
	public abstract void method5109(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)Z")
	public abstract boolean method5110(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
	public abstract void method5111();
}
