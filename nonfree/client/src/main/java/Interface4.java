import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public interface Interface4 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
	void method6066(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
	int method6067();

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BI)V")
	void method6068(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
