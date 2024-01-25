import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class214 {

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
	public int anInt6670;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
	public int anInt6672;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "Z")
	public boolean aBoolean438;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
	public int anInt6673;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
	public int anInt6674;

	@OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
	public int anInt6676;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
	public int anInt6675 = 8;

	@OriginalMember(owner = "client!mw", name = "i", descriptor = "I")
	public int anInt6677 = 16777215;

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!rg;I)V")
	public void method5728(@OriginalArg(0) Class6_Sub40 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method8604();
			if (local17 == 0) {
				return;
			}
			this.method5729(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!rg;II)V")
	private void method5729(@OriginalArg(0) Class6_Sub40 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6675 = arg0.method8571();
		} else if (arg1 == 2) {
			this.aBoolean438 = true;
		} else if (arg1 == 3) {
			this.anInt6670 = arg0.method8615();
			this.anInt6673 = arg0.method8615();
			this.anInt6674 = arg0.method8615();
		} else if (arg1 == 4) {
			this.anInt6672 = arg0.method8604();
		} else if (arg1 == 5) {
			this.anInt6676 = arg0.method8571();
		} else if (arg1 == 6) {
			this.anInt6677 = arg0.method8606();
		}
	}
}
