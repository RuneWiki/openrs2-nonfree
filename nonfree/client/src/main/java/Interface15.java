import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public interface Interface15 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)J")
	long method8704();

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II[BB)V")
	void method8705(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)I")
	int method8706();

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)I")
	int method8707();
}
