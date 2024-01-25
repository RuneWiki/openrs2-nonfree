import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public interface Interface12 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)I")
	int method5414();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)I")
	int method5415();

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB[B)V")
	void method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)J")
	long method5417();
}
