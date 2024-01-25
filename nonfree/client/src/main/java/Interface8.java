import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public interface Interface8 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V")
	void method7100(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
	void method7101(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[I)V")
	void method7102(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V")
	void method7103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BI)V")
	void method7104(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)I")
	int method7105(@OriginalArg(1) int arg0);
}
