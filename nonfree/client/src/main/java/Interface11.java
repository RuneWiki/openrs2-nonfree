import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public interface Interface11 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)J")
	long method5867();

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
	int method5868();

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(II[BI)V")
	void method5869(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)I")
	int method5870();
}
