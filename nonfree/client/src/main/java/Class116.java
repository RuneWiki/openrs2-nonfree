import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class Class116 {

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
	protected Class116() {
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	public abstract void method3740();

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB[B)I")
	public abstract int method3741(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
	public abstract void method3742();

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Z")
	public abstract boolean method3745(@OriginalArg(0) int arg0) throws IOException;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III[B)V")
	public abstract void method3746(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;
}
