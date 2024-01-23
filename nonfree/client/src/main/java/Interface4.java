import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public interface Interface4 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLjava/awt/Component;II)V")
	void method3491(@OriginalArg(0) boolean arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I")
	int method3492(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)V")
	void method3493(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
	void method3494(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[I)V")
	void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V")
	void method3496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
