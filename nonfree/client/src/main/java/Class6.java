import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public final class Class6 implements Interface21 {

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "Lclient!pu;")
	private final Class270 aClass270_4;

	@OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lclient!pu;)V")
	public Class6(@OriginalArg(0) Class270 arg0) {
		this.aClass270_4 = arg0;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)Lclient!vj;")
	@Override
	public Class344 method7689() {
		return Static558.aClass344_2;
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)I")
	@Override
	public int method7690() {
		return this.aClass270_4.method5701() ? 100 : this.aClass270_4.method5687();
	}
}
