import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class Class56 {

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	protected Class56() {
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public abstract void method1311();

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)V")
	public abstract void method1312();

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Z")
	public abstract boolean method1313(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB[B)V")
	public abstract void method1315(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[B)I")
	public abstract int method1316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;
}
