import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class363 {

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
	public int anInt10262 = 2048;

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
	public int anInt10268 = 0;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
	public int anInt10261 = 2048;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
	public int anInt10267 = 0;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLclient!dt;I)V")
	private void method8376(@OriginalArg(1) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt10268 = arg0.method7954();
		} else if (arg1 == 2) {
			this.anInt10262 = arg0.method7951();
		} else if (arg1 == 3) {
			this.anInt10261 = arg0.method7951();
		} else if (arg1 == 4) {
			this.anInt10267 = arg0.method7918();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BLclient!dt;)V")
	public void method8379(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7954();
			if (local9 == 0) {
				return;
			}
			this.method8376(arg0, local9);
		}
	}
}
