import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public interface Interface6 {

	@OriginalMember(owner = "client!is", name = "a", descriptor = "()I")
	int method4256();

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V")
	void method4257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I[BI)V")
	void method4258(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
