import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rh")
public final class Class207 {

	@OriginalMember(owner = "client!rh", name = "j", descriptor = "[I")
	public int[] anIntArray1003;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	public int anInt5076 = -1;

	@OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
	public int anInt5081 = -1;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!kk;BI)V")
	private void method4423(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5076 = arg0.method5312();
		} else if (arg1 == 2) {
			this.anIntArray1003 = new int[arg0.method5350()];
			for (@Pc(43) int local43 = 0; local43 < this.anIntArray1003.length; local43++) {
				this.anIntArray1003[local43] = arg0.method5312();
			}
		} else if (arg1 == 3) {
			this.anInt5081 = arg0.method5350();
			return;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!kk;Z)V")
	public void method4427(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5350();
			if (local5 == 0) {
				return;
			}
			this.method4423(arg0, local5);
		}
	}
}
