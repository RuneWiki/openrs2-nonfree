import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public interface Interface3 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB[BI)V")
	void method5205(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)I")
	int method5206();

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)I")
	int method5207();

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)J")
	long method5208();
}
