import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class Class40 {

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)[B")
	public abstract byte[] method1292();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[B)V")
	public abstract void method1294(@OriginalArg(1) byte[] arg0);
}
