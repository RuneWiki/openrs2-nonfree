import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class244 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public int anInt7238 = -1;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	public int anInt7235 = -1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!iaa;)V")
	private void method6072(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub26 arg1) {
		if (arg0 == 1) {
			this.anInt7235 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anIntArray507 = new int[arg1.method4966()];
			for (@Pc(36) int local36 = 0; local36 < this.anIntArray507.length; local36++) {
				this.anIntArray507[local36] = arg1.method4999();
			}
		} else if (arg0 == 3) {
			this.anInt7238 = arg1.method4966();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!iaa;B)V")
	public void method6073(@OriginalArg(0) Class6_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4966();
			if (local13 == 0) {
				return;
			}
			this.method6072(local13, arg0);
		}
	}
}
