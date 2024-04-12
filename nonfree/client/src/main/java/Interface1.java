import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public interface Interface1 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I")
	int method236();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([I)V")
	void method237(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	void method238(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	void method239();

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)V")
	void method240(@OriginalArg(1) int arg0) throws Exception;
}
