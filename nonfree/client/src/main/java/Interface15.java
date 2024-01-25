import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public interface Interface15 {

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)I")
	int method3616();

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)I")
	int method3617();

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI[BI)V")
	void method3618(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)J")
	long method3619();
}
