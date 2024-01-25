import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public interface Interface1 {

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)J")
	long method5469();

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([BBII)V")
	void method5470(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
	int method5471();

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)I")
	int method5472();
}
