import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public interface Interface6 {

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BII[B)V")
	void method6017(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)I")
	int method6018();

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(Z)I")
	int method6019();

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)J")
	long method6020();
}
