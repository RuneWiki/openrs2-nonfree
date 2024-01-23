import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class Class42 {

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)[B")
	public abstract byte[] method1280();

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z[B)V")
	public abstract void method1283(@OriginalArg(1) byte[] arg0);
}
