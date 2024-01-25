import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kha")
public final class Class209 {

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "I")
	public int anInt5682 = 0;

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Lclient!fca;B)V")
	public void method4732(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4888();
			if (local13 == 0) {
				return;
			}
			this.method4735(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILclient!fca;)V")
	private void method4735(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 5) {
			this.anInt5682 = arg1.method4858();
		}
	}
}
