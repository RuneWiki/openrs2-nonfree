import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public interface Interface22 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZI)V")
	void method4720(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
	void method4721(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method4722(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BI)V")
	void method4723(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
	int method4724(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[I)V")
	void method4725(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
