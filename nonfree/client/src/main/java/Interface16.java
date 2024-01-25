import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public interface Interface16 {

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V")
	void method2574(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(I[I)V")
	void method2575(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)I")
	int method2576(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mu", name = "c", descriptor = "(II)V")
	void method2577(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
	void method2578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(ZZLjava/awt/Component;I)V")
	void method2579(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;
}
