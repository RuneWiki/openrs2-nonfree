import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public interface Interface11 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)J")
	long method5915();

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)I")
	int method5916();

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)I")
	int method5917();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I[BBI)V")
	void method5918(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2);
}
