import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public interface Interface7 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method4240(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZI)V")
	void method4241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)V")
	void method4242(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)V")
	void method4243(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)I")
	int method4244(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[I)V")
	void method4245(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
