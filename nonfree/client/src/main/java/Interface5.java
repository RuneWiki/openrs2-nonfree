import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public interface Interface5 extends Interface8 {

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(FZ)F")
	float method7768(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZZB)V")
	void method7769(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(B)I")
	int method7770();

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "(B)I")
	int method7771();

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BIIILclient!g;III[B)V")
	void method7772(@OriginalArg(3) int arg0, @OriginalArg(4) Class110 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3, @OriginalArg(8) byte[] arg4);

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "([IIIIIIII)V")
	void method7773(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BF)F")
	float method7774(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Z")
	boolean method7775();
}
