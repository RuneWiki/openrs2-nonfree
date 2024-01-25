import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public interface Interface17 {

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I")
	int method9111();

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IJ)Z")
	boolean method9112(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZB)V")
	void method9113(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)V")
	void method9114();

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)I")
	int method9115();

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V")
	void method9116();
}
