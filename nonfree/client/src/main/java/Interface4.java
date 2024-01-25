import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public interface Interface4 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V")
	void method2474(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[I)V")
	void method2475(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method2476(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
	void method2477(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)I")
	int method2478(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBI)V")
	void method2479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
