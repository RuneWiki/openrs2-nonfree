import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public interface Interface2 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I[I)V")
	void method930(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
	void method931(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
	void method932(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	void method933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(II)I")
	int method934(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
	void method935(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) throws Exception;
}
