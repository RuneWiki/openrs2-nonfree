import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public abstract class Class34 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)[B")
	public abstract byte[] method938();

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(I[B)V")
	public abstract void method940(@OriginalArg(1) byte[] arg0);
}
