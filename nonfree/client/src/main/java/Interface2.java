import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public interface Interface2 {

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)J")
	long method7525();

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)I")
	int method7526();

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "([BIII)V")
	void method7527(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I")
	int method7528();
}
