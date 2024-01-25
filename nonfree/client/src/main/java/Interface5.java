import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public interface Interface5 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
	int method4783();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I[BII)V")
	void method4784(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)J")
	long method4785();

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)I")
	int method4786();
}
