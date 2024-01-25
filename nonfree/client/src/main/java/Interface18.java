import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public interface Interface18 {

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI[BI)V")
	void method3933(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I")
	int method3934();

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)J")
	long method3935();

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)I")
	int method3936();
}
