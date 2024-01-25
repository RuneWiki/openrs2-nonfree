import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public interface Interface5 {

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)V")
	void method3104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "()I")
	int method3103();

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[BI)V")
	void method3105(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
