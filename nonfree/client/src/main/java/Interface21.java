import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public interface Interface21 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)V")
	void method5487(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I[I)V")
	void method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V")
	void method5489(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V")
	void method5490(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method5491(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IB)I")
	int method5492(@OriginalArg(0) int arg0);
}
