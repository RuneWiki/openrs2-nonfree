import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public interface Interface6 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[BI)V")
	void method5136(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "()I")
	int method5135();

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
	void method5137(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
