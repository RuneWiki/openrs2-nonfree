import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public interface Interface6 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)I")
	int method4765();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)J")
	long method4766();

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)I")
	int method4767();

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BIII)V")
	void method4768(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);
}
