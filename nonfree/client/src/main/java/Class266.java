import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class266 {

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
	public int anInt7156 = 2;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "Z")
	public boolean aBoolean494 = false;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
	public int anInt7159 = -1;

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Z")
	public boolean aBoolean495 = false;

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
	public int anInt7161 = 64;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	public int anInt7164 = 64;

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
	public int anInt7157 = 1;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!hp;ZII)V")
	private void method5859(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt7159 = arg0.method5362();
			if (this.anInt7159 == 65535) {
				this.anInt7159 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt7161 = arg0.method5362() + 1;
			this.anInt7164 = arg0.method5362() + 1;
		} else if (arg2 == 3) {
			arg0.method5416();
		} else if (arg2 == 4) {
			this.anInt7156 = arg0.method5366();
		} else if (arg2 == 5) {
			this.anInt7157 = arg0.method5366();
		} else if (arg2 == 6) {
			this.aBoolean494 = true;
		} else if (arg2 == 7) {
			this.aBoolean495 = true;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBLclient!hp;)V")
	public void method5860(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		while (true) {
			@Pc(17) int local17 = arg1.method5366();
			if (local17 == 0) {
				return;
			}
			this.method5859(arg1, arg0, local17);
		}
	}
}
