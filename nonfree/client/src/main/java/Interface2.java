import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public interface Interface2 {

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I[BIB)V")
	void method6952(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)I")
	int method6953();

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)J")
	long method6954();

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(I)I")
	int method6955();
}
