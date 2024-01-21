import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public interface Interface1 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)V")
	void method491(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/awt/Component;IZ)V")
	void method492(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V")
	void method493(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I")
	int method494(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)V")
	void method495(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[I)V")
	void method496(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
