import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public interface Interface9 {

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)I")
	int method2933();

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)I")
	int method2934();

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)J")
	long method2935();

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "([BIIB)V")
	void method2936(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
