import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public interface Interface3 {

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZZLjava/awt/Component;I)V")
	void method2307(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V")
	void method2308(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I")
	int method2309(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
	void method2310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I[I)V")
	void method2311(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(BI)V")
	void method2312(@OriginalArg(1) int arg0);
}
