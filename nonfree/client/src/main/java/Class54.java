import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class54 {

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "Lclient!ud;")
	public Class324 aClass324_1;

	@OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
	public int anInt1746;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
	public int anInt1740 = -1;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	public int anInt1739 = -1;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
	public int anInt1743 = 512;

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
	public int anInt1744 = 0;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "Z")
	public boolean aBoolean136 = false;

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
	public int anInt1745 = 64;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
	public int anInt1741 = 8;

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "Z")
	public boolean aBoolean137 = true;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	public int anInt1742 = 1190717;

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Z")
	public boolean aBoolean135 = true;

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
	public int anInt1747 = 127;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ek;I)V")
	public void method1461(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7004();
			if (local5 == 0) {
				return;
			}
			this.method1462(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILclient!ek;)V")
	private void method1462(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt1744 = Static12.method742(arg1.method7013());
		} else if (arg0 == 2) {
			this.anInt1740 = arg1.method7004();
		} else if (arg0 == 3) {
			this.anInt1740 = arg1.method7054();
			if (this.anInt1740 == 65535) {
				this.anInt1740 = -1;
			}
		} else if (arg0 == 5) {
			this.aBoolean137 = false;
		} else if (arg0 == 7) {
			this.anInt1739 = Static12.method742(arg1.method7013());
		} else if (arg0 == 8) {
			this.aClass324_1.anInt9646 = this.anInt1746;
		} else if (arg0 == 9) {
			this.anInt1743 = arg1.method7054() << 2;
		} else if (arg0 == 10) {
			this.aBoolean135 = false;
		} else if (arg0 == 11) {
			this.anInt1741 = arg1.method7004();
		} else if (arg0 == 12) {
			this.aBoolean136 = true;
		} else if (arg0 == 13) {
			this.anInt1742 = arg1.method7013();
			return;
		} else if (arg0 == 14) {
			this.anInt1745 = arg1.method7004() << 2;
			return;
		} else if (arg0 == 16) {
			this.anInt1747 = arg1.method7004();
			return;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public void method1463() {
		this.anInt1741 = this.anInt1746 | this.anInt1741 << 8;
	}
}
