import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public interface Interface1 {

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)I")
	int method690();

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[BII)V")
	void method691(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)J")
	long method692();

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)I")
	int method693();
}
