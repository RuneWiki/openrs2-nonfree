import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public interface Interface6 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!fm;)V")
	void method3365(@OriginalArg(0) Class72 arg0);

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lclient!fm;)V")
	void method3366(@OriginalArg(0) Class72 arg0);

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Lclient!fm;)V")
	void method3367(@OriginalArg(0) Class72 arg0);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[BI)V")
	void method3368(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(Lclient!fm;)V")
	void method3369(@OriginalArg(0) Class72 arg0);

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()I")
	int method3588();
}
