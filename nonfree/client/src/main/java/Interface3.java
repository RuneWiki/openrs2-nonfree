import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public interface Interface3 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)J")
	long method7924();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)I")
	int method7925();

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)I")
	int method7926();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(III[B)V")
	void method7927(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1);
}
