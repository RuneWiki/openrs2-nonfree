import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public interface Interface1 {

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)I")
	int method1766();

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
	int method1767();

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(I)J")
	long method1768();

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BIII)V")
	void method1769(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1);
}
