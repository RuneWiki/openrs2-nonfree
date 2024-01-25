import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class Class260 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[B)V")
	public abstract void method6257(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIB)[B")
	public abstract byte[] method6258(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)[B")
	public abstract byte[] method6262();
}
