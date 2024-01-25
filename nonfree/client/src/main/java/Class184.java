import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class184 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
	public int anInt4301;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
	public int anInt4302;

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
	public int anInt4304;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!gk;B)V")
	private void method3667(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt4304 = arg1.method4518();
			this.anInt4302 = arg1.method4464();
			this.anInt4301 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ZLclient!gk;)V")
	public void method3669(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4464();
			if (local5 == 0) {
				return;
			}
			this.method3667(local5, arg0);
		}
	}
}
