import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public interface Interface1 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)V")
	void method438(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	void method439(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	void method440(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	void method441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[I)V")
	void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(BI)I")
	int method443(@OriginalArg(1) int arg0);
}
