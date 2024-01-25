import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public interface Interface22 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)J")
	long method7398();

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([BIII)V")
	void method7399(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)I")
	int method7400();

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)I")
	int method7401();
}
