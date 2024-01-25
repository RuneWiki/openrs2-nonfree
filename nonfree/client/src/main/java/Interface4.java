import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public interface Interface4 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I[BI)V")
	void method4265(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
	void method4266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()I")
	int method4262();
}
