import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public interface Interface27 {

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)I")
	int method9067();

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)J")
	long method9068();

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)I")
	int method9069();

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II[BB)V")
	void method9070(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);
}
