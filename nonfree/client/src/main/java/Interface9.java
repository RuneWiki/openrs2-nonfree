import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public interface Interface9 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)I")
	int method5233(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)V")
	void method5234(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[I)V")
	void method5235(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method5236(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
	void method5237(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB)V")
	void method5238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
