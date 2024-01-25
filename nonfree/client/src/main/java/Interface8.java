import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public interface Interface8 {

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIB)V")
	void method1992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/awt/Component;ZB)V")
	void method1993(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(II)V")
	void method1994(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I[I)V")
	void method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BI)V")
	void method1996(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)I")
	int method1997(@OriginalArg(0) int arg0);
}
