import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface Interface8 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)I")
	int method8685();

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)J")
	long method8686();

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)I")
	int method8687();

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "([BIII)V")
	void method8688(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
