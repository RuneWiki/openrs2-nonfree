import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public interface Interface25 {

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)I")
	int method6207();

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILclient!ha;)V")
	void method6208(@OriginalArg(1) Class13 arg0);

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(B)V")
	void method6209();

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I")
	int method6210();

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)Z")
	boolean method6211();

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)I")
	int method6212();

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(ILclient!ha;)V")
	void method6213(@OriginalArg(1) Class13 arg0);
}
