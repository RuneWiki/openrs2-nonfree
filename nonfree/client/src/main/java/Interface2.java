import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public interface Interface2 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V")
	void method1143(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(BI)V")
	void method1144(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
	void method1145(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZII)V")
	void method1146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[I)V")
	void method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(BI)I")
	int method1148(@OriginalArg(1) int arg0);
}
