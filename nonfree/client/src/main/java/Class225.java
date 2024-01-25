import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public abstract class Class225 {

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)[B")
	public abstract byte[] method8139(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)[B")
	public abstract byte[] method8143();

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B[B)V")
	public abstract void method8144(@OriginalArg(1) byte[] arg0);
}
