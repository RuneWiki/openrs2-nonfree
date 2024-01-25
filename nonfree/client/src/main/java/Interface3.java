import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public interface Interface3 {

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(III)V")
	void method3340(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I[I)V")
	void method3341(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
	void method3342(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
	void method3343(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZI)I")
	int method3344(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)V")
	void method3345(@OriginalArg(0) int arg0);
}
