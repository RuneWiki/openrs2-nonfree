import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public interface Interface4 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "()I")
	int method3932();

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
	void method2310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[BI)V")
	void method2311(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
