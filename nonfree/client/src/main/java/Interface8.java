import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public interface Interface8 {

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BILclient!en;)Lclient!mj;")
	Class101 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I")
	int method5549();

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLclient!en;)V")
	void method5550(@OriginalArg(1) Class59 arg0);

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)Z")
	boolean method5551();

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)I")
	int method5552();

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
	void method5553();

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)I")
	int method5554();

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!en;B)V")
	void method5555(@OriginalArg(0) Class59 arg0);
}
