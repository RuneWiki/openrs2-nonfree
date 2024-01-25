import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class340 {

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
	public int anInt9324;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
	public int anInt9325;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
	public int anInt9326;

	@OriginalMember(owner = "client!tt", name = "h", descriptor = "I")
	public int anInt9330;

	@OriginalMember(owner = "client!tt", name = "j", descriptor = "Z")
	public boolean aBoolean672;

	@OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
	public int anInt9335;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
	public int anInt9329 = 8;

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
	public int anInt9331 = 16777215;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!ofa;I)V")
	private void method8050(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt9329 = arg0.method5968();
		} else if (arg1 == 2) {
			this.aBoolean672 = true;
		} else if (arg1 == 3) {
			this.anInt9325 = arg0.method5956();
			this.anInt9326 = arg0.method5956();
			this.anInt9330 = arg0.method5956();
		} else if (arg1 == 4) {
			this.anInt9324 = arg0.method5966();
		} else if (arg1 == 5) {
			this.anInt9335 = arg0.method5968();
		} else if (arg1 == 6) {
			this.anInt9331 = arg0.method5931();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!ofa;I)V")
	public void method8053(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5966();
			if (local5 == 0) {
				return;
			}
			this.method8050(arg0, local5);
		}
	}
}
