import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public interface Interface12 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!qa;I)V")
	void method6314(@OriginalArg(0) Class30 arg0);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!qa;I)Lclient!ka;")
	Class57 method6315(@OriginalArg(1) Class30 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)I")
	int method6316();

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	void method6317();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I")
	int method6318();

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Z")
	boolean method6319();

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)I")
	int method6320();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BLclient!qa;)V")
	void method6321(@OriginalArg(1) Class30 arg0);
}
