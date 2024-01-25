import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public interface Interface27 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)V")
	void method8222(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[I)V")
	void method8223(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
	void method8224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)I")
	int method8225(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)V")
	void method8226(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/awt/Component;IZI)V")
	void method8227(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) throws Exception;
}
