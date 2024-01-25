import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public interface Interface15 {

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)I")
	int method8491();

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)I")
	int method8492();

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(BII[B)V")
	void method8493(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)J")
	long method8494();
}
