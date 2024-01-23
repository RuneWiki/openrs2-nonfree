import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class192 {

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
	public int anInt5619 = 0;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "Z")
	public boolean aBoolean530 = false;

	@OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
	public int anInt5623 = 1190717;

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	public int anInt5625 = 128;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "Z")
	public boolean aBoolean529 = true;

	@OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
	public int anInt5626 = 8;

	@OriginalMember(owner = "client!wm", name = "s", descriptor = "Z")
	public boolean aBoolean531 = true;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	public int anInt5618 = 16;

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
	public int anInt5629 = -1;

	@OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
	public int anInt5624 = -1;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!fh;II)V")
	public void method4668(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method1853();
			if (local5 == 0) {
				return;
			}
			this.method4669(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZLclient!fh;)V")
	private void method4669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub13 arg2) {
		if (arg1 == 1) {
			this.anInt5619 = Static260.method4035(arg2.method1878());
		} else if (arg1 == 2) {
			this.anInt5629 = arg2.method1853();
		} else if (arg1 == 3) {
			this.anInt5629 = arg2.method1879();
			if (this.anInt5629 == 65535) {
				this.anInt5629 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean529 = false;
		} else if (arg1 == 7) {
			this.anInt5624 = Static260.method4035(arg2.method1878());
		} else if (arg1 == 8) {
			Static154.anInt3085 = arg0;
		} else if (arg1 == 9) {
			this.anInt5625 = arg2.method1879();
		} else if (arg1 == 10) {
			this.aBoolean531 = false;
		} else if (arg1 == 11) {
			this.anInt5626 = arg2.method1853();
		} else if (arg1 == 12) {
			this.aBoolean530 = true;
		} else if (arg1 == 13) {
			this.anInt5623 = arg2.method1878();
		} else if (arg1 == 14) {
			this.anInt5618 = arg2.method1853();
		}
	}
}
