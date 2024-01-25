import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public interface Interface5 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "([BIII)V")
	void method1489(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)I")
	int method1490();

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)J")
	long method1491();

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I")
	int method1492();
}
