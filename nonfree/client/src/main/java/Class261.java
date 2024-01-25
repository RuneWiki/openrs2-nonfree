import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class261 {

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
	public int anInt8172 = 2048;

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
	public int anInt8177 = 0;

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
	public int anInt8175 = 2048;

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
	public int anInt8179 = 0;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!ig;)V")
	public void method6715(@OriginalArg(1) Class8_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8525();
			if (local9 == 0) {
				return;
			}
			this.method6719(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!ig;I)V")
	private void method6719(@OriginalArg(1) Class8_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8177 = arg0.method8525();
		} else if (arg1 == 2) {
			this.anInt8175 = arg0.method8578();
		} else if (arg1 == 3) {
			this.anInt8172 = arg0.method8578();
		} else if (arg1 == 4) {
			this.anInt8179 = arg0.method8568();
			return;
		}
	}
}
