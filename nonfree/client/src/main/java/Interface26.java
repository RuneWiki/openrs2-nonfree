import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public interface Interface26 extends Interface7 {

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(FI)F")
	float method8049(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(I)Z")
	boolean method8050();

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIILclient!kca;Z[BI)V")
	void method8051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class187 arg3, @OriginalArg(7) byte[] arg4);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "([IIIBIII)V")
	void method8052(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(ZBZ)V")
	void method8053(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(Z)I")
	int method8054();

	@OriginalMember(owner = "client!wda", name = "c", descriptor = "(I)I")
	int method8055();

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IF)F")
	float method8056(@OriginalArg(1) float arg0);

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIZII[II)V")
	void method8057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5);
}
