import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public interface Interface1 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "()I")
	int method4970();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I[BI)V")
	void method4322(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III)V")
	void method4323(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
