import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public abstract class Class184 {

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([BZ)V")
	public abstract void method6458(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IBI)[B")
	public abstract byte[] method6462(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)[B")
	public abstract byte[] method6463();
}
