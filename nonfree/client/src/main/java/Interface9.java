import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public interface Interface9 {

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(III[B)V")
	void method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)I")
	int method4494();

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)J")
	long method4495();

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I")
	int method4496();
}
