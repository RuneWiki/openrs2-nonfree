import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class4_Sub17_Sub1 extends Class4_Sub17 {

	@OriginalMember(owner = "client!ie", name = "Gb", descriptor = "I")
	private int anInt2434;

	@OriginalMember(owner = "client!ie", name = "Hb", descriptor = "Lclient!cn;")
	private Class29 aClass29_1;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
	public Class4_Sub17_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "(II)I")
	public int method1898(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt2434 >> 3;
		@Pc(12) int local12 = 0;
		@Pc(19) int local19 = 8 - (this.anInt2434 & 0x7);
		this.anInt2434 += arg0;
		while (arg0 > local19) {
			local12 += (this.aByteArray30[local10++] & Static45.anIntArray116[local19]) << arg0 - local19;
			arg0 -= local19;
			local19 = 8;
		}
		if (arg0 == local19) {
			local12 += this.aByteArray30[local10] & Static45.anIntArray116[local19];
		} else {
			local12 += this.aByteArray30[local10] >> local19 - arg0 & Static45.anIntArray116[arg0];
		}
		return local12;
	}

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "(B)I")
	public int method1899() {
		return this.aByteArray30[this.anInt2400++] - this.aClass29_1.method692() & 0xFF;
	}

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "(II)I")
	public int method1900(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt2434;
	}

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "(Z)V")
	public void method1901() {
		this.anInt2400 = (this.anInt2434 + 7) / 8;
	}

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "(I)V")
	public void method1904() {
		this.anInt2434 = this.anInt2400 * 8;
	}

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "(II)V")
	public void method1905(@OriginalArg(1) int arg0) {
		this.aByteArray30[this.anInt2400++] = (byte) (arg0 + this.aClass29_1.method692());
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B[I)V")
	public void method1906(@OriginalArg(1) int[] arg0) {
		this.aClass29_1 = new Class29(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III[B)V")
	public void method1907(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (this.aByteArray30[this.anInt2400++] - this.aClass29_1.method692());
		}
	}
}
