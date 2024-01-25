import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class231 {

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	public int anInt6565 = 2;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
	public boolean aBoolean434 = false;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public int anInt6567 = 1;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public int anInt6566 = -1;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public int anInt6571 = 64;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	public int anInt6572 = 64;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Z")
	public boolean aBoolean435 = false;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!nn;II)V")
	private void method5154(@OriginalArg(1) Class10_Sub8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt6566 = arg0.method2485();
			if (this.anInt6566 == 65535) {
				this.anInt6566 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt6572 = arg0.method2485() + 1;
			this.anInt6571 = arg0.method2485() + 1;
		} else if (arg2 == 3) {
			arg0.method2460();
		} else if (arg2 == 4) {
			this.anInt6565 = arg0.method2502();
		} else if (arg2 == 5) {
			this.anInt6567 = arg0.method2502();
		} else if (arg2 == 6) {
			this.aBoolean435 = true;
		} else if (arg2 == 7) {
			this.aBoolean434 = true;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZLclient!nn;I)V")
	public void method5156(@OriginalArg(1) Class10_Sub8 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2502();
			if (local5 == 0) {
				return;
			}
			this.method5154(arg0, arg1, local5);
		}
	}
}
