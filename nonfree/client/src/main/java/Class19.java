import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class Class19 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[B)V")
	public abstract void method455(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)[B")
	public abstract byte[] method456();

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZI)[B")
	public abstract byte[] method457(@OriginalArg(0) int arg0);
}
