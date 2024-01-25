import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class207 {

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
	public int anInt6230;

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
	public int anInt6232;

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
	public int anInt6233;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lclient!ek;B)V")
	public void method4907(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7004();
			if (local11 == 0) {
				return;
			}
			this.method4908(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!ek;)V")
	private void method4908(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt6233 = arg1.method7054();
			this.anInt6232 = arg1.method7004();
			this.anInt6230 = arg1.method7004();
		}
	}
}
