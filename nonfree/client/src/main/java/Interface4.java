import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public interface Interface4 extends Interface9 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)I")
	int method6852();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIZ)V")
	void method6853(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I[BILclient!pm;IIIIB)V")
	void method6854(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class295 arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIII[III)V")
	void method6855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(FI)F")
	float method6856(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IF)F")
	float method6857(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(B)I")
	int method6858();

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II[IIIII)V")
	void method6859(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(5) int arg2);

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)Z")
	boolean method6860();
}
