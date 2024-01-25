import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public interface Interface9 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[I)V")
	void method4799(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)V")
	void method4800(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
	void method4801(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(II)V")
	void method4802(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZ)V")
	void method4803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)I")
	int method4804(@OriginalArg(1) int arg0);
}
