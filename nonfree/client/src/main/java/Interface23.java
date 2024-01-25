import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public interface Interface23 {

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method5749(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(ZI)V")
	void method5750(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(I[I)V")
	void method5751(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(IZI)V")
	void method5752(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(BI)I")
	int method5753(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(II)V")
	void method5754(@OriginalArg(1) int arg0);
}
