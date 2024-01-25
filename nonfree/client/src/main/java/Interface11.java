import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public interface Interface11 {

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)I")
	int method2433();

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(B[BII)V")
	void method2434(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(I)J")
	long method2435();

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(I)I")
	int method2436();
}
