import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class Class43 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BB)V")
	public abstract void method5200(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)[B")
	public abstract byte[] method5201();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IBI)[B")
	public abstract byte[] method5204(@OriginalArg(0) int arg0);
}
