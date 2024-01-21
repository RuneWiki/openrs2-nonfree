import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public interface Interface2 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)V")
	void method933(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)V")
	void method934(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method935(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
	void method936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[I)V")
	void method937(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)I")
	int method938(@OriginalArg(0) int arg0);
}
