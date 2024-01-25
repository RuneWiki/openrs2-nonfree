import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class360 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
	public int anInt10417;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
	public int anInt10418;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public int anInt10419;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
	public int anInt10422;

	@OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
	public int anInt10425;

	@OriginalMember(owner = "client!wi", name = "o", descriptor = "Z")
	public boolean aBoolean709;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
	public int anInt10424 = 8;

	@OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
	public int anInt10426 = 16777215;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ek;B)V")
	public void method8130(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method7004();
			if (local13 == 0) {
				return;
			}
			this.method8131(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ek;IB)V")
	private void method8131(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt10424 = arg0.method7054();
		} else if (arg1 == 2) {
			this.aBoolean709 = true;
		} else if (arg1 == 3) {
			this.anInt10418 = arg0.method7043();
			this.anInt10417 = arg0.method7043();
			this.anInt10419 = arg0.method7043();
		} else if (arg1 == 4) {
			this.anInt10422 = arg0.method7004();
		} else if (arg1 == 5) {
			this.anInt10425 = arg0.method7054();
		} else if (arg1 == 6) {
			this.anInt10426 = arg0.method7013();
		}
	}
}
