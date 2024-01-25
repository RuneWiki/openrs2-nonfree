import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public interface Interface27 {

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I")
	int method7909();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)I")
	int method7910();

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	void method7911();

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V")
	void method7912();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(JB)Z")
	boolean method7913(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZZ)V")
	void method7914(@OriginalArg(1) boolean arg0);
}
