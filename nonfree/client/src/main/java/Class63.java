import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class63 {

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "Z")
	public boolean aBoolean140 = false;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "I")
	public int anInt1558 = 128;

	@OriginalMember(owner = "client!eq", name = "g", descriptor = "Z")
	public boolean aBoolean141 = true;

	@OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
	public int anInt1563 = 1190717;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
	public int anInt1564 = 16;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	public int anInt1559 = -1;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
	public int anInt1557 = 8;

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
	public int anInt1560 = 0;

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
	public int anInt1570 = -1;

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "Z")
	public boolean aBoolean142 = true;

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
	public int anInt1569 = -1;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!ef;BI)V")
	private void method1686(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt1560 = Static50.method945(arg1.method3163());
		} else if (arg0 == 2) {
			this.anInt1559 = arg1.method3124();
			return;
		} else if (arg0 == 3) {
			this.anInt1559 = arg1.method3104();
			if (this.anInt1559 == 65535) {
				this.anInt1559 = -1;
				return;
			}
		} else if (arg0 == 5) {
			this.aBoolean141 = false;
			return;
		} else if (arg0 == 7) {
			this.anInt1569 = Static50.method945(arg1.method3163());
			return;
		} else if (arg0 == 8) {
			Static20.anInt319 = arg2;
			return;
		} else if (arg0 == 9) {
			this.anInt1558 = arg1.method3104();
			return;
		} else if (arg0 == 10) {
			this.aBoolean142 = false;
			return;
		} else if (arg0 == 11) {
			this.anInt1557 = arg1.method3124();
			return;
		} else if (arg0 == 12) {
			this.aBoolean140 = true;
			return;
		} else if (arg0 == 13) {
			this.anInt1563 = arg1.method3163();
			return;
		} else {
			if (arg0 == 14) {
				this.anInt1564 = arg1.method3124();
			} else if (arg0 == 15) {
				this.anInt1570 = arg1.method3104();
				if (this.anInt1570 == 65535) {
					this.anInt1570 = -1;
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)V")
	public void method1687(@OriginalArg(1) int arg0) {
		this.anInt1557 = this.anInt1557 << 8 | arg0;
		if (this.anInt1570 == -1) {
			this.anInt1570 = this.anInt1559;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!ef;B)V")
	public void method1688(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub12 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method3124();
			if (local13 == 0) {
				return;
			}
			this.method1686(local13, arg1, arg0);
		}
	}
}
