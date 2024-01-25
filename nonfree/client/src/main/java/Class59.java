import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class Class59 {

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)[B")
	public abstract byte[] method1268();

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([BZ)V")
	public abstract void method1270(@OriginalArg(0) byte[] arg0);
}
