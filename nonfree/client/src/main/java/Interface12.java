import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public interface Interface12 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method5759(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[I)V")
	void method5760(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)I")
	int method5761(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
	void method5762(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V")
	void method5763(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)V")
	void method5764(@OriginalArg(0) int arg0);
}
