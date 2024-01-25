import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public interface Interface17 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)J")
	long method6467();

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)I")
	int method6468();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "([BIII)V")
	void method6469(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)I")
	int method6470();
}
