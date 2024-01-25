import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public interface Interface7 {

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!tf;)V")
	void method5585(@OriginalArg(0) Class190 arg0);

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(Lclient!tf;)V")
	void method5586(@OriginalArg(0) Class190 arg0);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(I[BI)V")
	void method5587(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!na", name = "c", descriptor = "(Lclient!tf;)V")
	void method5588(@OriginalArg(0) Class190 arg0);

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(Lclient!tf;)V")
	void method5589(@OriginalArg(0) Class190 arg0);

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()I")
	int method5582();
}
