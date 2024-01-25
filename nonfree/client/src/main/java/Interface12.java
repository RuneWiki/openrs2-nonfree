import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public interface Interface12 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)J")
	long method5233();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)I")
	int method5234();

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "([BIII)V")
	void method5235(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)I")
	int method5236();
}
