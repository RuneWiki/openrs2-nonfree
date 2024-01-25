import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public interface Interface21 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB[BI)V")
	void method8198(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)J")
	long method8199();

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "(I)I")
	int method8200();

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Z)I")
	int method8201();
}
