import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class Class174 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)[B")
	public abstract byte[] method4353();

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IBI)[B")
	public abstract byte[] method4355(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([BI)V")
	public abstract void method4357(@OriginalArg(0) byte[] arg0);
}
