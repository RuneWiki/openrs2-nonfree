import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public abstract class Class69 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B[B)V")
	public abstract void method2240(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(I)[B")
	public abstract byte[] method2241();
}
