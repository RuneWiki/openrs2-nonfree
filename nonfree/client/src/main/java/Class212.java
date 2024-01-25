import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class212 {

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "I")
	public int anInt5261 = 2048;

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "I")
	public int anInt5263 = 0;

	@OriginalMember(owner = "client!lha", name = "g", descriptor = "I")
	public int anInt5266 = 0;

	@OriginalMember(owner = "client!lha", name = "j", descriptor = "I")
	public int anInt5269 = 2048;

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(ILclient!es;I)V")
	private void method4657(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt5263 = arg1.method8865();
		} else if (arg0 == 2) {
			this.anInt5261 = arg1.method8859();
		} else if (arg0 == 3) {
			this.anInt5269 = arg1.method8859();
		} else if (arg0 == 4) {
			this.anInt5266 = arg1.method8834();
		}
	}

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(Lclient!es;Z)V")
	public void method4659(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8865();
			if (local9 == 0) {
				return;
			}
			this.method4657(local9, arg0);
		}
	}
}
