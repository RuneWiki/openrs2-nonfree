import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public interface Interface7 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[I)V")
	void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)V")
	void method4098(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	void method4099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method4100(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)I")
	int method4101(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(II)V")
	void method4102(@OriginalArg(0) int arg0);
}
