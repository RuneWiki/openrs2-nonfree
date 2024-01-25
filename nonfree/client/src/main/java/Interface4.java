import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public interface Interface4 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "()I")
	int method2573();

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I[BI)V")
	void method2574(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)V")
	void method2575(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
