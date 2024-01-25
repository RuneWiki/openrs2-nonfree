import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public interface Interface7 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)J")
	long method3826();

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)I")
	int method3827();

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(B)I")
	int method3828();

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(III[B)V")
	void method3829(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1);
}
