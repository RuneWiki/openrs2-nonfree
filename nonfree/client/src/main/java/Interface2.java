import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public interface Interface2 {

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)I")
	int method2881();

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)I")
	int method2882();

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)C")
	char method2883();

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)J")
	long method2884();

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(B)I")
	int method2885();
}
