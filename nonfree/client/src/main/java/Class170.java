import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public abstract class Class170 {

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V")
	protected Class170() {
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(III[B)V")
	public abstract void method8116(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
	public abstract void method8117();

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(I)V")
	public abstract void method8119();

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IB)Z")
	public abstract boolean method8122(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IBI[B)I")
	public abstract int method8123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;
}
