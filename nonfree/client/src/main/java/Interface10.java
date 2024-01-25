import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface Interface10 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)I")
	int method4281();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)J")
	long method4282();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([BIII)V")
	void method4283(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
	int method4284();
}
