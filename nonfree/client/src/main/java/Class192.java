import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class Class192 {

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(III)[B")
	public abstract byte[] method7231(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)[B")
	public abstract byte[] method7232();

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "([BI)V")
	public abstract void method7233(@OriginalArg(0) byte[] arg0);
}
