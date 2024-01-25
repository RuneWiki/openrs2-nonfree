import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public interface Interface9 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)I")
	int method7035();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B[BII)V")
	void method7036(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)I")
	int method7037();

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)J")
	long method7038();
}
