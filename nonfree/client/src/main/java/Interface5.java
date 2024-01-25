import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public interface Interface5 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "([BIII)V")
	void method4746(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)I")
	int method4747();

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)I")
	int method4748();

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)J")
	long method4749();
}
