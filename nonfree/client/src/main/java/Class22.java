import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public abstract class Class22 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2318();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BI)V")
	public abstract void method2320(@OriginalArg(0) byte[] arg0);
}
