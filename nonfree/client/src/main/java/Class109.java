import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class109 {

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "I")
	public int anInt2368 = 64;

	@OriginalMember(owner = "client!fba", name = "d", descriptor = "Z")
	public boolean aBoolean163 = false;

	@OriginalMember(owner = "client!fba", name = "e", descriptor = "I")
	public int anInt2373 = 2;

	@OriginalMember(owner = "client!fba", name = "j", descriptor = "I")
	public int anInt2370 = 64;

	@OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
	public int anInt2375 = 1;

	@OriginalMember(owner = "client!fba", name = "k", descriptor = "I")
	public int anInt2374 = -1;

	@OriginalMember(owner = "client!fba", name = "i", descriptor = "Z")
	public boolean aBoolean162 = false;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!jc;II)V")
	public void method2227(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method7695(126);
			if (local3 == 0) {
				return;
			}
			this.method2228(arg1, local3, arg0);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBILclient!jc;)V")
	private void method2228(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class14_Sub21 arg2) {
		if (arg1 == 1) {
			this.anInt2374 = arg2.method7717(-1978450544);
			if (this.anInt2374 == 65535) {
				this.anInt2374 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt2368 = arg2.method7717(-1978450544) + 1;
			this.anInt2370 = arg2.method7717(-1978450544) + 1;
		} else if (arg1 == 3) {
			arg2.method7720();
		} else if (arg1 == 4) {
			this.anInt2373 = arg2.method7695(125);
		} else if (arg1 == 5) {
			this.anInt2375 = arg2.method7695(112);
		} else if (arg1 == 6) {
			this.aBoolean163 = true;
		} else if (arg1 == 7) {
			this.aBoolean162 = true;
		}
	}
}
