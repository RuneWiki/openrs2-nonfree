import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public interface Interface7 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)J")
	long method6580();

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(B)I")
	int method6581();

	@OriginalMember(owner = "client!el", name = "a", descriptor = "([BIIB)V")
	void method6582(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
	int method6583();
}
