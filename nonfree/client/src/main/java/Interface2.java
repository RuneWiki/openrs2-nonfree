import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public interface Interface2 {

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(IJ)Z")
	boolean method8792(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)I")
	int method8793();

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(B)V")
	void method8794();

	@OriginalMember(owner = "client!bia", name = "c", descriptor = "(B)V")
	void method8795();

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)I")
	int method8796();

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(ZI)V")
	void method8797(@OriginalArg(0) boolean arg0);
}
