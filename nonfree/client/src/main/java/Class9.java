import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class9 {

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	public int anInt284;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "I")
	public int anInt285;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public int anInt286;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZLclient!at;)V")
	private void method329(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt284 = arg1.method2161();
			this.anInt286 = arg1.method2132();
			this.anInt285 = arg1.method2132();
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!at;B)V")
	public void method330(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method2132();
			if (local11 == 0) {
				return;
			}
			this.method329(local11, arg0);
		}
	}
}
