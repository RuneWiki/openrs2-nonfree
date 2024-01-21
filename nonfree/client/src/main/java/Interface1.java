import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public interface Interface1 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	void method789(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	void method790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
	void method791(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[I)V")
	void method792(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(BI)I")
	int method793(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method794(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) throws Exception;
}
