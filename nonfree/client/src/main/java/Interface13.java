import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public interface Interface13 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)I")
	int method8086(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
	void method8087(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I[I)V")
	void method8088(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
	void method8089(@OriginalArg(1) boolean arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2) throws Exception;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IB)V")
	void method8090(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIZ)V")
	void method8091(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;
}
