import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class274 {

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
	public int anInt7912;

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
	public int anInt7914;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
	public int anInt7918;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ILclient!rv;B)V")
	private void method6718(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt7918 = arg1.method3698();
			this.anInt7912 = arg1.method3642();
			this.anInt7914 = arg1.method3642();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!rv;I)V")
	public void method6721(@OriginalArg(0) Class5_Sub15 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method3642();
			if (local7 == 0) {
				return;
			}
			this.method6718(local7, arg0);
		}
	}
}
