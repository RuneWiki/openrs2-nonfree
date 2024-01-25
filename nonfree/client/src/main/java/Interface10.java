import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public interface Interface10 {

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(I)I")
	int method8854();

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([BBII)V")
	void method8855(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)I")
	int method8856();

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(B)J")
	long method8857();
}
