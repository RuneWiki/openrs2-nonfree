import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public interface Interface9 {

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[I)V")
	void method4825(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILjava/awt/Component;I)V")
	void method4826(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	void method4827(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
	void method4828(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "(II)I")
	int method4829(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZII)V")
	void method4830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;
}
