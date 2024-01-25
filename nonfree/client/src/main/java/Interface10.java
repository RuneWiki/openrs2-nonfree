import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public interface Interface10 {

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;ZII)V")
	void method7704(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)I")
	int method7705(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
	void method7706(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[I)V")
	void method7707(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
	void method7708(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII)V")
	void method7709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
