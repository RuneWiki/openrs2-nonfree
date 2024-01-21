import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public interface Interface3 {

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;ZBI)V")
	void method518(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	void method519();

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)I")
	int method520();

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([I)V")
	void method521(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
	void method522(@OriginalArg(1) int arg0) throws Exception;
}
