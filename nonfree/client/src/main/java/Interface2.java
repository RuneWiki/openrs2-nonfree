import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public interface Interface2 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)V")
	void method2595(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "()I")
	int method5698();

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BI)V")
	void method2597(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
