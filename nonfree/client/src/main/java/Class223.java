import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class223 {

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
	public int anInt6328;

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	public int anInt6329;

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	public int anInt6330;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLclient!nj;)V")
	public void method5214(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4096();
			if (local5 == 0) {
				return;
			}
			this.method5216(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!nj;I)V")
	private void method5216(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6330 = arg0.method4083();
			this.anInt6329 = arg0.method4096();
			this.anInt6328 = arg0.method4096();
		}
	}
}
