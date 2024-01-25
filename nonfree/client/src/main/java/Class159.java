import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class159 {

	@OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
	public int anInt4620;

	@OriginalMember(owner = "client!jp", name = "v", descriptor = "Lclient!ada;")
	public Class7 aClass7_3;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
	public int anInt4610 = 0;

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
	public int anInt4613 = 512;

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
	public int anInt4612 = -1;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
	public int anInt4606 = 8;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "Z")
	public boolean aBoolean339 = false;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "Z")
	public boolean aBoolean340 = true;

	@OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
	public int anInt4608 = 1190717;

	@OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
	public int anInt4617 = -1;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "Z")
	public boolean aBoolean338 = true;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
	public int anInt4611 = 127;

	@OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
	public int anInt4621 = -1;

	@OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
	public int anInt4622 = 64;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!jr;)V")
	private void method3921(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt4610 = Static287.method4364(arg1.method6037());
		} else if (arg0 == 2) {
			this.anInt4617 = arg1.method6019();
		} else if (arg0 == 3) {
			this.anInt4617 = arg1.method6044();
			if (this.anInt4617 == 65535) {
				this.anInt4617 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean340 = false;
		} else if (arg0 == 7) {
			this.anInt4621 = Static287.method4364(arg1.method6037());
			return;
		} else if (arg0 == 8) {
			this.aClass7_3.anInt100 = this.anInt4620;
			return;
		} else if (arg0 == 9) {
			this.anInt4613 = arg1.method6044() << 2;
			return;
		} else if (arg0 == 10) {
			this.aBoolean338 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt4606 = arg1.method6019();
			return;
		} else if (arg0 == 12) {
			this.aBoolean339 = true;
			return;
		} else if (arg0 == 13) {
			this.anInt4608 = arg1.method6037();
			return;
		} else {
			if (arg0 == 14) {
				this.anInt4622 = arg1.method6019() << 2;
			} else if (arg0 == 15) {
				this.anInt4612 = arg1.method6044();
				if (this.anInt4612 == 65535) {
					this.anInt4612 = -1;
					return;
				}
				return;
			} else if (arg0 == 16) {
				this.anInt4611 = arg1.method6019();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!jr;)V")
	public void method3923(@OriginalArg(1) Class6_Sub12 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6019();
			if (local5 == 0) {
				return;
			}
			this.method3921(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V")
	public void method3925() {
		this.anInt4606 = this.anInt4606 << 8 | this.anInt4620;
		if (this.anInt4612 == -1) {
			this.anInt4612 = this.anInt4617;
		}
	}
}
