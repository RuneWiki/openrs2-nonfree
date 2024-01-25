import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public interface Interface6 {

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I")
	int method3068(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(I[I)V")
	void method3069(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)V")
	void method3070(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)V")
	void method3071(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method3072(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZII)V")
	void method3073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
