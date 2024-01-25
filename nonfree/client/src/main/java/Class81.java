import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class81 {

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	public int anInt2629;

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "Lclient!er;")
	public Class71 aClass71_3;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	public int anInt2619 = 1190717;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
	public int anInt2622 = -1;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
	public int anInt2621 = 8;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
	public int anInt2627 = -1;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	public int anInt2618 = -1;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
	public int anInt2626 = 16;

	@OriginalMember(owner = "client!fs", name = "n", descriptor = "Z")
	public boolean aBoolean203 = false;

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "I")
	public int anInt2628 = 128;

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "Z")
	public boolean aBoolean204 = true;

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
	public int anInt2631 = 0;

	@OriginalMember(owner = "client!fs", name = "v", descriptor = "Z")
	public boolean aBoolean205 = true;

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "I")
	public int anInt2634 = 127;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ILclient!bt;I)V")
	private void method2163(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2631 = Static200.method3245(arg0.method6020());
		} else if (arg1 == 2) {
			this.anInt2618 = arg0.method6053();
		} else if (arg1 == 3) {
			this.anInt2618 = arg0.method6004();
			if (this.anInt2618 == 65535) {
				this.anInt2618 = -1;
			}
		} else if (arg1 == 5) {
			this.aBoolean204 = false;
		} else if (arg1 == 7) {
			this.anInt2627 = Static200.method3245(arg0.method6020());
		} else if (arg1 == 8) {
			this.aClass71_3.anInt2259 = this.anInt2629;
		} else if (arg1 == 9) {
			this.anInt2628 = arg0.method6004() << 0;
		} else if (arg1 == 10) {
			this.aBoolean205 = false;
		} else if (arg1 == 11) {
			this.anInt2621 = arg0.method6053();
		} else if (arg1 == 12) {
			this.aBoolean203 = true;
		} else if (arg1 == 13) {
			this.anInt2619 = arg0.method6020();
		} else if (arg1 == 14) {
			this.anInt2626 = arg0.method6053();
		} else if (arg1 == 15) {
			this.anInt2622 = arg0.method6004();
			if (this.anInt2622 == 65535) {
				this.anInt2622 = -1;
			}
		} else if (arg1 == 16) {
			this.anInt2634 = arg0.method6053();
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)V")
	public void method2165() {
		if (this.anInt2622 == -1) {
			this.anInt2622 = this.anInt2618;
		}
		this.anInt2621 = this.anInt2629 | this.anInt2621 << 8;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!bt;B)V")
	public void method2166(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method6053();
			if (local17 == 0) {
				return;
			}
			this.method2163(arg0, local17);
		}
	}
}
