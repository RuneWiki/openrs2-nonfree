import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public interface Interface6 extends Interface13 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)Z")
	boolean method4123();

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZII)Z")
	boolean method4124(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	boolean method4125(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method4126();

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	void method6765();
}
