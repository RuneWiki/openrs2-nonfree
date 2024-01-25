import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public interface Interface23 {

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)I")
	int method5651();

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIB[B)V")
	void method5652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)J")
	long method5653();

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)I")
	int method5654();
}
