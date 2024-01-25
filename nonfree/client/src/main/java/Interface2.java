import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public interface Interface2 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)I")
	int method7244();

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)I")
	int method7245();

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)J")
	long method7246();

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[BII)V")
	void method7247(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
