import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public interface Interface1 {

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)I")
	int method6305(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I[I)V")
	void method6306(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(BI)V")
	void method6307(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(III)V")
	void method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(II)V")
	void method6309(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method6310(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception;
}
