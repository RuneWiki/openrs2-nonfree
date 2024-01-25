import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public interface Interface22 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILjava/awt/Component;Z)V")
	void method7826(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) boolean arg2) throws Exception;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
	void method7827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) throws Exception;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)V")
	void method7828(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[I)V")
	void method7829(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)I")
	int method7830(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
	void method7831(@OriginalArg(1) int arg0);
}
