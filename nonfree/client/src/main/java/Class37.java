import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class Class37 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)[B")
	public abstract byte[] method765();

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(III)[B")
	public abstract byte[] method768(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([BI)V")
	public abstract void method769(@OriginalArg(0) byte[] arg0);
}
