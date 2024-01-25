import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public interface Interface5 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(III[B)V")
	void method5172(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)I")
	int method5173();

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)J")
	long method5174();

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)I")
	int method5175();
}
