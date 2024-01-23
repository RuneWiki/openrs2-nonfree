import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public final class Class4_Sub28 extends Class4 {

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
	public int anInt4718;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "[Lclient!ec;")
	public Class43[] aClass43Array2;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I[Lclient!ec;)V")
	public Class4_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class43[] arg1) {
		this.anInt4718 = arg0;
		this.aClass43Array2 = arg1;
	}
}
