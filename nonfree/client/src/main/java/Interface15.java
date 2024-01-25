import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public interface Interface15 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I")
	int method3356();

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[BII)V")
	void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)J")
	long method3358();

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)I")
	int method3359();
}
