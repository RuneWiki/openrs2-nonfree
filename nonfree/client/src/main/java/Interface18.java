import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public interface Interface18 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)I")
	int method9225();

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)I")
	int method9226();

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([BIII)V")
	void method9227(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)J")
	long method9228();
}
