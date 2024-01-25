import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public interface Interface23 {

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I[BBI)V")
	void method5061(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)I")
	int method5062();

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)I")
	int method5063();

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)J")
	long method5064();
}
