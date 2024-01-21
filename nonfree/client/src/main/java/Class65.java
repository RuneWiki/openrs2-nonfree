import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public abstract class Class65 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B[B)V")
	public abstract void method1676(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)[B")
	public abstract byte[] method1679();
}
