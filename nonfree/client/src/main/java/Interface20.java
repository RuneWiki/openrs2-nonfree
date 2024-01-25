import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public interface Interface20 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)I")
	int method8128();

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(II[BI)V")
	void method8129(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)I")
	int method8130();

	@OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)J")
	long method8131();
}
