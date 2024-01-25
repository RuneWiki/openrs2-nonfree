import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public abstract class Class77 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2181();

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "([BB)V")
	public abstract void method2183(@OriginalArg(0) byte[] arg0);
}
