import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public interface Interface4 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method1081(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V")
	void method1082(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[I)V")
	void method1083(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIZ)V")
	void method1084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)V")
	void method1085(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(ZI)I")
	int method1086(@OriginalArg(1) int arg0);
}
