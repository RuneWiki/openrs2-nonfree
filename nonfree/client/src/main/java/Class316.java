import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tn")
public final class Class316 {

	@OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
	public int anInt8506;

	@OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
	public int anInt8509;

	@OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
	public int anInt8511;

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "I")
	public int anInt8512;

	@OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
	public int anInt8514;

	@OriginalMember(owner = "client!tn", name = "n", descriptor = "Z")
	public boolean aBoolean627;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
	public int anInt8507 = 16777215;

	@OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
	public int anInt8513 = 8;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lclient!io;I)V")
	public void method7039(@OriginalArg(0) Class1_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4393();
			if (local5 == 0) {
				return;
			}
			this.method7040(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLclient!io;I)V")
	private void method7040(@OriginalArg(1) Class1_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt8513 = arg0.method4426();
		} else if (arg1 == 2) {
			this.aBoolean627 = true;
		} else if (arg1 == 3) {
			this.anInt8514 = arg0.method4391();
			this.anInt8512 = arg0.method4391();
			this.anInt8509 = arg0.method4391();
		} else if (arg1 == 4) {
			this.anInt8506 = arg0.method4393();
		} else if (arg1 == 5) {
			this.anInt8511 = arg0.method4426();
		} else if (arg1 == 6) {
			this.anInt8507 = arg0.method4396();
		}
	}
}
