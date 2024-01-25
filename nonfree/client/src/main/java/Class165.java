import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class165 {

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
	public int anInt5071 = 0;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
	public int anInt5069 = 0;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
	public int anInt5074 = 2048;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
	public int anInt5076 = 2048;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!rg;II)V")
	public void method4517(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method5115();
			if (local5 == 0) {
				return;
			}
			this.method4521(arg0, arg1, local5);
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!rg;II)V")
	private void method4521(@OriginalArg(1) Class5_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt5071 = arg0.method5115();
		} else if (arg2 == 2) {
			this.anInt5074 = arg0.method5106();
		} else if (arg2 == 3) {
			this.anInt5076 = arg0.method5106();
		} else if (arg2 == 4) {
			this.anInt5069 = arg0.method5066();
		}
	}
}
