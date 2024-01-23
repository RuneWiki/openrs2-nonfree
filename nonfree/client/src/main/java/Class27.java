import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class Class27 {

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B[B)V")
	public abstract void method606(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method609();
}
