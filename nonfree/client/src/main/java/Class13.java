import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public abstract class Class13 {

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "([BI)V")
	public abstract void method399(@OriginalArg(0) byte[] arg0);

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)[B")
	public abstract byte[] method400();

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)[B")
	public abstract byte[] method401(@OriginalArg(1) int arg0);
}
