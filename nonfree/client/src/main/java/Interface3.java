import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public interface Interface3 {

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I[I)V")
	void method1933(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	void method1934(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I")
	int method1935(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
	void method1936(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)V")
	void method1937(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method1938(@OriginalArg(0) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;
}
