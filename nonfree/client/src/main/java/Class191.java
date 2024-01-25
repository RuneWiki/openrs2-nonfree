import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class191 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
	public int anInt5135;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
	public int anInt5136;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
	public int anInt5137;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!jc;)V")
	public void method4697(@OriginalArg(1) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3030();
			if (local5 == 0) {
				return;
			}
			this.method4698(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLclient!jc;I)V")
	private void method4698(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5135 = arg0.method3018();
			this.anInt5137 = arg0.method3030();
			this.anInt5136 = arg0.method3030();
		}
	}
}
