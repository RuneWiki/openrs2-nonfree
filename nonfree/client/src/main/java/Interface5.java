import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public interface Interface5 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()I")
	int method5582();

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(III)V")
	void method4904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I[BI)V")
	void method4905(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
