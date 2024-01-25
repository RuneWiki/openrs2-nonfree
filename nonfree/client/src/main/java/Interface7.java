import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public interface Interface7 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
	int method4612();

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)J")
	long method4613();

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)I")
	int method4614();

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I[BII)V")
	void method4615(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1);
}
