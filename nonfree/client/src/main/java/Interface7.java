import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public interface Interface7 {

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)I")
	int method6740();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[BI)V")
	void method6741(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)J")
	long method6742();

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I")
	int method6743();
}
