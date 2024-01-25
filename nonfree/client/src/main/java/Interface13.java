import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public interface Interface13 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)I")
	int method4214();

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI[BI)V")
	void method4215(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1);

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)J")
	long method4216();

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)I")
	int method4217();
}
