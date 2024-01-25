import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public interface Interface9 {

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)J")
	long method4691();

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIB[B)V")
	void method4692(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)I")
	int method4693();

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I")
	int method4694();
}
