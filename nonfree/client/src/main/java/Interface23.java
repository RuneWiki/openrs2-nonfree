import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public interface Interface23 {

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
	int method5436();

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(I)J")
	long method5437();

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "([BIII)V")
	void method5438(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "(I)I")
	int method5439();
}
