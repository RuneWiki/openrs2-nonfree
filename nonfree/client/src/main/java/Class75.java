import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dda")
public final class Class75 {

	@OriginalMember(owner = "client!dda", name = "l", descriptor = "Z")
	public boolean aBoolean119 = false;

	@OriginalMember(owner = "client!dda", name = "f", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
	public int anInt1731 = 1;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
	public int anInt1728 = 64;

	@OriginalMember(owner = "client!dda", name = "p", descriptor = "I")
	public int anInt1736 = 2;

	@OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
	public int anInt1730 = 64;

	@OriginalMember(owner = "client!dda", name = "o", descriptor = "I")
	public int anInt1735 = -1;

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lclient!rv;III)V")
	private void method1625(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1735 = arg0.method3698();
			if (this.anInt1735 == 65535) {
				this.anInt1735 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt1730 = arg0.method3698() + 1;
			this.anInt1728 = arg0.method3698() + 1;
		} else if (arg2 == 3) {
			arg0.method3677();
		} else if (arg2 == 4) {
			this.anInt1736 = arg0.method3642();
		} else if (arg2 == 5) {
			this.anInt1731 = arg0.method3642();
		} else if (arg2 == 6) {
			this.aBoolean117 = true;
		} else if (arg2 == 7) {
			this.aBoolean119 = true;
		}
	}

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(BILclient!rv;)V")
	public void method1626(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub15 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method3642();
			if (local5 == 0) {
				return;
			}
			this.method1625(arg1, arg0, local5);
		}
	}
}
