import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public interface Interface16 {

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([BBII)V")
	void method6005(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)I")
	int method6006();

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)J")
	long method6007();

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(B)I")
	int method6008();
}
