import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public interface Interface16 extends Interface23 {

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(I)V")
	void method7731();

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	boolean method6038(@OriginalArg(1) Source arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(B)Z")
	boolean method6039();

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(BII)Z")
	boolean method6040(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method6041();
}
