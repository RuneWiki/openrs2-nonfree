import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public interface Interface14 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)J")
	long method4146();

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "([BIII)V")
	void method4147(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
	int method4148();

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)I")
	int method4149();
}
