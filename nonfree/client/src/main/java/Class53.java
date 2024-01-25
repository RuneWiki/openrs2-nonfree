import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class Class53 {

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)[B")
	public abstract byte[] method3193();

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[B)V")
	public abstract void method3197(@OriginalArg(1) byte[] arg0);
}
