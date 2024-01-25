import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public interface Interface27 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)J")
	long method7793();

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)I")
	int method7794();

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I[BBI)V")
	void method7795(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)I")
	int method7796();
}
