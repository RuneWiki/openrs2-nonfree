import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public interface Interface2 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)I")
	int method4389();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BII)V")
	void method4390(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)J")
	long method4391();

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)I")
	int method4392();
}
