import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public interface Interface1 {

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(IBI)V")
	void method1892(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)I")
	int method1893(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method1894(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) throws Exception;

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(I[I)V")
	void method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)V")
	void method1896(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(BI)V")
	void method1897(@OriginalArg(1) int arg0);
}
