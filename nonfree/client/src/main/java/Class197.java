import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class Class197 {

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	protected Class197() {
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	public abstract void method5188();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB[B)V")
	public abstract void method5190(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public abstract void method5193();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIIB)I")
	public abstract int method5194(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)Z")
	public abstract boolean method5195(@OriginalArg(1) int arg0) throws IOException;
}
