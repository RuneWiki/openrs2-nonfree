import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public interface Interface6 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I[BII)V")
	void method2114(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	int method2115();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)J")
	long method2116();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)I")
	int method2117();
}
