import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public interface Interface7 {

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII[B)V")
	void method6378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)I")
	int method6379();

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)I")
	int method6380();

	@OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)J")
	long method6381();
}
