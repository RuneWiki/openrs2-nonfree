import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public interface Interface1 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	void method2286(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)I")
	int method2287(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[I)V")
	void method2288(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	void method2289(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V")
	void method2290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
	void method2291(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;
}
