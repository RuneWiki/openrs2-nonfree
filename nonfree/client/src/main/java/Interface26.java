import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public interface Interface26 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)J")
	long method5672();

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I")
	int method5673();

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)I")
	int method5674();

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([BIII)V")
	void method5675(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1);
}
