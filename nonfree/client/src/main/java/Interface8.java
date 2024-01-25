import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public interface Interface8 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "()I")
	int method4193();

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)V")
	void method1582(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I[BI)V")
	void method1583(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
