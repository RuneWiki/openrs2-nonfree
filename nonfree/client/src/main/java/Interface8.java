import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public interface Interface8 {

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)I")
	int method4463(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(II)I")
	int method4464(@OriginalArg(0) int arg0);
}
