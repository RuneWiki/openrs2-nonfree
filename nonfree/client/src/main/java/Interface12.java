import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public interface Interface12 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I")
	int method5065();

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)J")
	long method5066();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Z)I")
	int method5067();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "([BIIZ)V")
	void method5068(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
