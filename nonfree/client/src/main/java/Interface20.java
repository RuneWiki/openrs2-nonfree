import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public interface Interface20 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!ha;)V")
	void method7084(@OriginalArg(1) Class33 arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ha;I)V")
	void method7085(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
	int method7086();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)I")
	int method7087();

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
	int method7088();

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Z")
	boolean method7089();

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V")
	void method7090();
}
