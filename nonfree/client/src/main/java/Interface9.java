import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public interface Interface9 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[I)V")
	void method5309(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)V")
	void method5310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZIZLjava/awt/Component;)V")
	void method5311(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)I")
	int method5312(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
	void method5313(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)V")
	void method5314(@OriginalArg(1) int arg0);
}
