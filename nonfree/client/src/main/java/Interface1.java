import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public interface Interface1 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(III)V")
	void method454(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
	int method455(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(II)V")
	void method456(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method457(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(II)V")
	void method458(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I[I)V")
	void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
