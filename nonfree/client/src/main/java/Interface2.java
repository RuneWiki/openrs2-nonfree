import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public interface Interface2 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method1376(@OriginalArg(0) Component arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[I)V")
	void method1377(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)V")
	void method1378(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)I")
	int method1379(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(IB)V")
	void method1380(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	void method1381(@OriginalArg(1) int arg0);
}
