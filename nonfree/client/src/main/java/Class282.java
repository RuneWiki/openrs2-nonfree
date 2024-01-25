import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class282 {

	@OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
	public int anInt7389 = 2048;

	@OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
	public int anInt7390 = 0;

	@OriginalMember(owner = "client!qfa", name = "h", descriptor = "I")
	public int anInt7393 = 2048;

	@OriginalMember(owner = "client!qfa", name = "g", descriptor = "I")
	public int anInt7392 = 0;

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!vj;B)V")
	private void method6249(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt7390 = arg1.method8547();
		} else if (arg0 == 2) {
			this.anInt7393 = arg1.method8546();
		} else if (arg0 == 3) {
			this.anInt7389 = arg1.method8546();
		} else if (arg0 == 4) {
			this.anInt7392 = arg1.method8526();
			return;
		}
	}

	@OriginalMember(owner = "client!qfa", name = "a", descriptor = "(ILclient!vj;)V")
	public void method6250(@OriginalArg(1) Class2_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8547();
			if (local5 == 0) {
				return;
			}
			this.method6249(local5, arg0);
		}
	}
}
