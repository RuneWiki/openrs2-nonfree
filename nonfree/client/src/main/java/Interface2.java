import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public interface Interface2 {

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZ)V")
	void method1563(@OriginalArg(0) int arg0) throws Exception;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)I")
	int method1564();

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
	void method1565();

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
	void method1566(@OriginalArg(0) Component arg0) throws Exception;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([I)V")
	void method1567(@OriginalArg(0) int[] arg0);
}
