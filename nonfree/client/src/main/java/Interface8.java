import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public interface Interface8 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BII)V")
	void method4410(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)I")
	int method4411(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
	void method4412(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)V")
	void method4413(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BZLjava/awt/Component;I)V")
	void method4414(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[I)V")
	void method4415(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);
}
