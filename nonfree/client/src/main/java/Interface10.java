import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public interface Interface10 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIII)V")
	void method5605(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	int method5606();

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)J")
	long method5607();

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)I")
	int method5608();
}
