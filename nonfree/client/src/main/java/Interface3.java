import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public interface Interface3 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
	void method1236(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BZILjava/awt/Component;)V")
	void method1237(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)I")
	int method1238(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBI)V")
	void method1239(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[I)V")
	void method1240(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)V")
	void method1241(@OriginalArg(0) int arg0);
}
