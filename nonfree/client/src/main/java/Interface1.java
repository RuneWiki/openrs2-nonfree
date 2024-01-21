import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public interface Interface1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[I)V")
	void method4(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILjava/awt/Component;ZI)V")
	void method5(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)V")
	void method6(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
	int method7(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
	void method8(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(II)V")
	void method9(@OriginalArg(0) int arg0);
}
