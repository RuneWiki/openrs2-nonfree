import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public interface Interface2 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)J")
	long method4930();

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I")
	int method4931();

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(BI[BI)V")
	void method4932(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)I")
	int method4933();
}
