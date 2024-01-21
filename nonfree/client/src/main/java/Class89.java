import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class Class89 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[B)V")
	public abstract void method2877(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)[B")
	public abstract byte[] method2881();
}
