import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public abstract class Class173 {

	@OriginalMember(owner = "client!lda", name = "<init>", descriptor = "()V")
	protected Class173() {
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "([BIII)V")
	public abstract void method7257(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
	public abstract void method7258();

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)Z")
	public abstract boolean method7260(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "(B)V")
	public abstract void method7261();

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(I[BII)I")
	public abstract int method7262(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException;
}
