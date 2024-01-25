import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public interface Interface16 {

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([BIII)V")
	void method6365(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)I")
	int method6366();

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)I")
	int method6367();

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)J")
	long method6368();
}
