import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public interface Interface6 {

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)I")
	int method7652();

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)I")
	int method7653();

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIZ[B)V")
	void method7654(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)J")
	long method7655();
}
