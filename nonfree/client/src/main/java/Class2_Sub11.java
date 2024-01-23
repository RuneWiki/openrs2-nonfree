import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "[B")
	public static byte[] aByteArray7 = new byte[32896];

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "I")
	public int anInt1534;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
	public int anInt1528;

	static {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 256; local13++) {
			for (@Pc(20) int local20 = 0; local20 <= local13; local20++) {
				aByteArray7[local11++] = (byte) (255.0D / Math.sqrt((double) ((float) (local20 * local20 + local13 * local13 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(II)V")
	public Class2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1534 = arg0;
		this.anInt1528 = arg1;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Z")
	public boolean method1311() {
		return (this.anInt1534 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(I)Z")
	public boolean method1313() {
		return (this.anInt1534 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)Z")
	public boolean method1314() {
		return (this.anInt1534 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)Z")
	public boolean method1315(@OriginalArg(1) int arg0) {
		return (this.anInt1534 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)Z")
	public boolean method1317() {
		return (this.anInt1534 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(Z)I")
	public int method1320() {
		return this.anInt1534 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "(I)Z")
	public boolean method1321() {
		return (this.anInt1534 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "i", descriptor = "(I)I")
	public int method1323() {
		return Static55.method1088(this.anInt1534);
	}

	@OriginalMember(owner = "client!ff", name = "k", descriptor = "(I)Z")
	public boolean method1325() {
		return (this.anInt1534 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(Z)Z")
	public boolean method1326() {
		return (this.anInt1534 >> 31 & 0x1) != 0;
	}
}
