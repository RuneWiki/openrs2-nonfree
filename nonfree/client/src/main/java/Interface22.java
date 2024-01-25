import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public interface Interface22 {

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I[I)V")
	void method5949(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IZZLjava/awt/Component;)V")
	void method5950(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Component arg2) throws Exception;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IB)I")
	int method5951(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IBI)V")
	void method5952(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(II)V")
	void method5953(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qfa", name = "b", descriptor = "(II)V")
	void method5954(@OriginalArg(1) int arg0);
}
