import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public interface Interface8 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)J")
	long method5607();

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)I")
	int method5608();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "([BIII)V")
	void method5609(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)I")
	int method5610();
}
