import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public interface Interface14 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZII[B)V")
	void method3805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)I")
	int method3806();

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)I")
	int method3807();

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)J")
	long method3808();
}
