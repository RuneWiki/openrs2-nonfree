import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class246 {

	@OriginalMember(owner = "client!or", name = "d", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!or", name = "b", descriptor = "I")
	public int anInt6781 = -1;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "I")
	public int anInt6780 = -1;

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!io;B)V")
	private void method5577(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt6781 = arg1.method4426();
		} else if (arg0 == 2) {
			this.anIntArray461 = new int[arg1.method4393()];
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray461.length; local27++) {
				this.anIntArray461[local27] = arg1.method4426();
			}
		} else if (arg0 == 3) {
			this.anInt6780 = arg1.method4393();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!io;)V")
	public void method5578(@OriginalArg(1) Class1_Sub20 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4393();
			if (local13 == 0) {
				return;
			}
			this.method5577(local13, arg0);
		}
	}
}
