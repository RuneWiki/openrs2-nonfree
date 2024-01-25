import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class24 {

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "Lclient!ks;")
	public Class148 aClass148_2;

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	public int anInt598;

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "Z")
	public boolean aBoolean29 = true;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public int anInt588 = 16;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "Z")
	public boolean aBoolean30 = false;

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "I")
	public int anInt596 = -1;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
	public int anInt594 = 0;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	public int anInt601 = -1;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
	public int anInt600 = -1;

	@OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
	public int anInt595 = 128;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public int anInt592 = 127;

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
	public int anInt590 = 8;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "Z")
	public boolean aBoolean31 = true;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
	public int anInt603 = 1190717;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!si;ZI)V")
	private void method501(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt594 = Static164.method2662(arg0.method5485());
		} else if (arg1 == 2) {
			this.anInt600 = arg0.method5495();
		} else if (arg1 == 3) {
			this.anInt600 = arg0.method5500();
			if (this.anInt600 == 65535) {
				this.anInt600 = -1;
				return;
			}
		} else if (arg1 == 5) {
			this.aBoolean29 = false;
			return;
		} else if (arg1 == 7) {
			this.anInt596 = Static164.method2662(arg0.method5485());
			return;
		} else if (arg1 == 8) {
			this.aClass148_2.anInt4113 = this.anInt598;
			return;
		} else if (arg1 == 9) {
			this.anInt595 = arg0.method5500() << 0;
			return;
		} else {
			if (arg1 == 10) {
				this.aBoolean31 = false;
			} else if (arg1 == 11) {
				this.anInt590 = arg0.method5495();
				return;
			} else if (arg1 == 12) {
				this.aBoolean30 = true;
				return;
			} else if (arg1 == 13) {
				this.anInt603 = arg0.method5485();
				return;
			} else if (arg1 == 14) {
				this.anInt588 = arg0.method5495();
				return;
			} else if (arg1 == 15) {
				this.anInt601 = arg0.method5500();
				if (this.anInt601 == 65535) {
					this.anInt601 = -1;
					return;
				}
			} else if (arg1 == 16) {
				this.anInt592 = arg0.method5495();
				return;
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!si;B)V")
	public void method502(@OriginalArg(0) Class2_Sub23 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5495();
			if (local5 == 0) {
				return;
			}
			this.method501(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
	public void method504() {
		this.anInt590 = this.anInt590 << 8 | this.anInt598;
		if (this.anInt601 == -1) {
			this.anInt601 = this.anInt600;
		}
	}
}
