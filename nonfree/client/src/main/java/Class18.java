import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public abstract class Class18 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "([BI)V")
	public abstract void method265(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)[B")
	public abstract byte[] method270(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)[B")
	public abstract byte[] method271();
}
