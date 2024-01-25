import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!db", name = "n", descriptor = "[C")
	public static final char[] aCharArray4 = new char[64];

	@OriginalMember(owner = "client!db", name = "v", descriptor = "I")
	public final int anInt1812;

	@OriginalMember(owner = "client!db", name = "o", descriptor = "I")
	public final int anInt1806;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray4[local4] = (char) (local4 + 65);
		}
		for (@Pc(18) int local18 = 26; local18 < 52; local18++) {
			aCharArray4[local18] = (char) (local18 + 71);
		}
		for (@Pc(32) int local32 = 52; local32 < 62; local32++) {
			aCharArray4[local32] = (char) (local32 + 48 - 52);
		}
		aCharArray4[63] = '/';
		aCharArray4[62] = '+';
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(II)V")
	public Class1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1812 = arg1;
		this.anInt1806 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
	public int method1741() {
		return Static313.method5426(this.anInt1806);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Z")
	public boolean method1742() {
		return (this.anInt1806 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Z")
	public boolean method1743() {
		return (this.anInt1806 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)I")
	public int method1746() {
		return this.anInt1806 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)Z")
	public boolean method1748(@OriginalArg(0) int arg0) {
		return (this.anInt1806 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!db", name = "f", descriptor = "(I)Z")
	public boolean method1749() {
		return (this.anInt1806 & 0x1) != 0;
	}
}
