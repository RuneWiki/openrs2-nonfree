import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class Class28 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)[B")
	public abstract byte[] method922();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I[B)V")
	public abstract void method923(@OriginalArg(1) byte[] arg0);
}
