import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public interface Interface22 {

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	void method2192(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)I")
	int method2193(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)V")
	void method2194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)V")
	void method2195(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[I)V")
	void method2196(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjava/awt/Component;BZ)V")
	void method2197(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;
}
