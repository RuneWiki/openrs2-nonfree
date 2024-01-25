import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public interface Interface9 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V")
	void method102(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)I")
	int method103(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[I)V")
	void method104(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(BI)V")
	void method105(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method106(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)V")
	void method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
