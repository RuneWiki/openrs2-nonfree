import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public interface Interface3 extends Interface12 {

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IF)F")
	float method7449(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)I")
	int method7450();

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)I")
	int method7451();

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IIZI[IIII)V")
	void method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(IILclient!kl;III[BII)V")
	void method7453(@OriginalArg(1) int arg0, @OriginalArg(2) Class174 arg1, @OriginalArg(4) int arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(8) int arg4);

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZZI)V")
	void method7454(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)Z")
	boolean method7455();

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZF)F")
	float method7456(@OriginalArg(1) float arg0);
}
