import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class Class324 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B[B)V")
	public abstract void method8088(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZ)[B")
	public abstract byte[] method8089(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method8090();
}
