import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public interface Interface8 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)I")
	int method4985();

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)J")
	long method4986();

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)I")
	int method4987();

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z[BII)V")
	void method4988(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
