import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public interface Interface4 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I[BI)V")
	void method5115(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "()I")
	int method5116();

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
	void method5117(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
