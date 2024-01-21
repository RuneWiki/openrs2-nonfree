import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public interface Interface1 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
	int method255(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)V")
	void method256(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BII)V")
	void method257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI)V")
	void method258(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(I[I)V")
	void method259(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZILjava/awt/Component;B)V")
	void method260(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) throws Exception;
}
