import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class220 {

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
	public int anInt6171;

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
	public int anInt6173;

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	public int anInt6174;

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!rv;)V")
	private void method5185(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static549.method7576(arg1.method3677());
		} else if (arg0 == 2) {
			this.anInt6174 = arg1.method3698();
			this.anInt6171 = arg1.method3642();
			this.anInt6173 = arg1.method3642();
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!rv;B)V")
	public void method5186(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3642();
			if (local13 == 0) {
				return;
			}
			this.method5185(local13, arg0);
		}
	}
}
