import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public interface Interface2 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I[I)V")
	void method1505(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(III)V")
	void method1506(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) throws Exception;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZLjava/awt/Component;Z)V")
	void method1507(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) throws Exception;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZI)I")
	int method1508(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)V")
	void method1509(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
	void method1510(@OriginalArg(0) int arg0);
}
