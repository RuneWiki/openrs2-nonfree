import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public interface Interface1 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	void method491(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)V")
	void method492(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
	void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	void method494(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)I")
	int method495(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[I)V")
	void method496(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
