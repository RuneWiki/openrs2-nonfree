import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class2_Sub10 extends Class2 {

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
	public static int anInt1749 = 0;

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
	public static int anInt1761;

	@OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
	public static int anInt1760;

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
	public final int anInt1757;

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
	public final int anInt1756;

	static {
		new Class79("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
		anInt1761 = -1;
		anInt1760 = 0;
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V", line = 102)
	public Class2_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1757 = arg1;
		this.anInt1756 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)I", line = 4)
	public int method1852() {
		return this.anInt1756 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)Z", line = 15)
	public boolean method1853() {
		return (this.anInt1756 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)I", line = 26)
	public int method1854() {
		return Static13.method346(this.anInt1756);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Z", line = 37)
	public boolean method1855() {
		return (this.anInt1756 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)Z", line = 48)
	public boolean method1856(@OriginalArg(0) int arg0) {
		return (this.anInt1756 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Z", line = 59)
	public boolean method1857() {
		return (this.anInt1756 & 0x1) != 0;
	}
}
