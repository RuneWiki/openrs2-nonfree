import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public interface Interface8 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
	void method5256(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()I")
	int method5253();

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[BI)V")
	void method5257(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
