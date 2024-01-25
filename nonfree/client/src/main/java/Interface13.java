import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public interface Interface13 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
	void method7872(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLjava/awt/Component;IZ)V")
	void method7873(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZ)I")
	int method7874(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)V")
	void method7875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)V")
	void method7876(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I[I)V")
	void method7877(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
