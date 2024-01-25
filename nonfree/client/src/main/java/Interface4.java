import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public interface Interface4 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "([BIII)V")
	void method5476(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)I")
	int method5477();

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)I")
	int method5478();

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)J")
	long method5479();
}
