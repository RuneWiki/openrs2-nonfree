import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class15 {

	@OriginalMember(owner = "client!as", name = "e", descriptor = "I")
	public int anInt481 = 2;

	@OriginalMember(owner = "client!as", name = "b", descriptor = "I")
	public int anInt479 = -1;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public int anInt487 = 64;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "I")
	public int anInt485 = 64;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "I")
	public int anInt489 = 1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!cu;II)V")
	public void method379(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(11) int local11 = arg0.method2582();
			if (local11 == 0) {
				return;
			}
			this.method381(arg1, arg0, local11);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!cu;IB)V")
	private void method381(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt479 = arg1.method2588();
			if (this.anInt479 == 65535) {
				this.anInt479 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt485 = arg1.method2588() + 1;
			this.anInt487 = arg1.method2588() + 1;
		} else if (arg2 == 3) {
			arg1.method2612();
		} else if (arg2 == 4) {
			this.anInt481 = arg1.method2582();
		} else if (arg2 == 5) {
			this.anInt489 = arg1.method2582();
		} else if (arg2 == 6) {
			this.aBoolean34 = true;
		} else if (arg2 == 7) {
			this.aBoolean35 = true;
		}
	}
}
