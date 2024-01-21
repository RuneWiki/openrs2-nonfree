import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class Class34 {

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)[B")
	public abstract byte[] method1503();

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "([BB)V")
	public abstract void method1505(@OriginalArg(0) byte[] arg0);
}
