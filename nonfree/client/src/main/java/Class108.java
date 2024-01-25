import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class108 {

	@OriginalMember(owner = "client!h", name = "a", descriptor = "I")
	public int anInt2542 = -1;

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public int anInt2544 = 2;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Z")
	public boolean aBoolean167 = false;

	@OriginalMember(owner = "client!h", name = "f", descriptor = "I")
	public int anInt2545 = 64;

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Z")
	public boolean aBoolean168 = false;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "I")
	public int anInt2543 = 1;

	@OriginalMember(owner = "client!h", name = "k", descriptor = "I")
	public int anInt2548 = 64;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IILclient!fh;I)V")
	private void method2010(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt2542 = arg1.method5028();
			if (this.anInt2542 == 65535) {
				this.anInt2542 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt2545 = arg1.method5028() + 1;
			this.anInt2548 = arg1.method5028() + 1;
		} else if (arg0 == 3) {
			arg1.method5063();
		} else if (arg0 == 4) {
			this.anInt2544 = arg1.method5007();
		} else if (arg0 == 5) {
			this.anInt2543 = arg1.method5007();
		} else if (arg0 == 6) {
			this.aBoolean168 = true;
		} else if (arg0 == 7) {
			this.aBoolean167 = true;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BILclient!fh;)V")
	public void method2012(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method5007();
			if (local17 == 0) {
				return;
			}
			this.method2010(local17, arg1, arg0);
		}
	}
}
