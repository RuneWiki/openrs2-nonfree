import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public interface Interface24 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)J")
	long method5681();

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I")
	int method5682();

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BI)V")
	void method5683(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
	int method5684();
}
