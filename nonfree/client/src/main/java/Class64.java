import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class64 {

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Z")
	public boolean aBoolean130 = false;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
	public int anInt1651 = 64;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public int anInt1654 = 1;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public int anInt1652 = 2;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Z")
	public boolean aBoolean131 = false;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
	public int anInt1656 = -1;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public int anInt1657 = 64;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!rba;II)V")
	public void method1359(@OriginalArg(0) Class3_Sub28 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method5322(-79);
			if (local9 == 0) {
				return;
			}
			this.method1361(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILclient!rba;)V")
	private void method1361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub28 arg2) {
		if (arg1 == 1) {
			this.anInt1656 = arg2.method5272();
			if (this.anInt1656 == 65535) {
				this.anInt1656 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt1651 = arg2.method5272() + 1;
			this.anInt1657 = arg2.method5272() + 1;
		} else if (arg1 == 3) {
			arg2.method5288();
		} else if (arg1 == 4) {
			this.anInt1652 = arg2.method5322(-62);
		} else if (arg1 == 5) {
			this.anInt1654 = arg2.method5322(-58);
		} else if (arg1 == 6) {
			this.aBoolean130 = true;
		} else if (arg1 == 7) {
			this.aBoolean131 = true;
		}
	}
}
