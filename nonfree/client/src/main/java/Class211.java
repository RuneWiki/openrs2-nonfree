import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class211 {

	@OriginalMember(owner = "client!mp", name = "h", descriptor = "[I")
	public int[] anIntArray413;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
	public int anInt6611 = -1;

	@OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
	public int anInt6617 = -1;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!rg;IB)V")
	private void method5679(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt6611 = arg0.method8571();
		} else if (arg1 == 2) {
			this.anIntArray413 = new int[arg0.method8604()];
			for (@Pc(27) int local27 = 0; local27 < this.anIntArray413.length; local27++) {
				this.anIntArray413[local27] = arg0.method8571();
			}
			return;
		} else if (arg1 == 3) {
			this.anInt6617 = arg0.method8604();
			return;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!rg;Z)V")
	public void method5683(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8604();
			if (local5 == 0) {
				return;
			}
			this.method5679(arg0, local5);
		}
	}
}
