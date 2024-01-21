import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public interface Interface2 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLjava/awt/Component;)V")
	void method652(@OriginalArg(1) Component arg0) throws Exception;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
	void method653(@OriginalArg(1) int arg0) throws Exception;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "([I)V")
	void method654(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)I")
	int method655();

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
	void method656();
}
