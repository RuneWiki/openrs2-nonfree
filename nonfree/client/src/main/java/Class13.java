import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class Class13 {

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	protected Class13() {
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public abstract void method172();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public abstract void method173();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III[B)V")
	public abstract void method177(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)Z")
	public abstract boolean method179(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([BIII)I")
	public abstract int method180(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException;
}
