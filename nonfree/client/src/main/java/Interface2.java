import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public interface Interface2 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)V")
	void method930(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BI)I")
	int method931(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method932(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(III)V")
	void method933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[I)V")
	void method934(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	void method935(@OriginalArg(0) int arg0);
}
