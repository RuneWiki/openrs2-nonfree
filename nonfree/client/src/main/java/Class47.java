import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class Class47 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method2571();

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([BI)V")
	public abstract void method2572(@OriginalArg(0) byte[] arg0);
}
