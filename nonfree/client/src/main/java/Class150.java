import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public abstract class Class150 {

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IBI)[B")
	public abstract byte[] method9040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)[B")
	public abstract byte[] method9041();

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "([BI)V")
	public abstract void method9042(@OriginalArg(0) byte[] arg0);
}
