import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class3_Sub4_Sub7 extends Class3_Sub4 {

	@OriginalMember(owner = "client!e", name = "B", descriptor = "I")
	public int anInt1132;

	@OriginalMember(owner = "client!e", name = "H", descriptor = "I")
	public int anInt1136;

	@OriginalMember(owner = "client!e", name = "L", descriptor = "Ljava/lang/String;")
	public String aString46;

	@OriginalMember(owner = "client!e", name = "O", descriptor = "I")
	public int anInt1140;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V")
	public Class3_Sub4_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong243 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)I")
	public int method968() {
		return (int) (this.aLong243 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!e", name = "g", descriptor = "(I)J")
	public long method969() {
		return this.aLong245 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V")
	public void method970() {
		this.aLong245 = Static128.method2196() + 500L | Long.MIN_VALUE & this.aLong245;
		Static156.aClass115_6.method2875(this);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(B)V")
	public void method971() {
		this.aLong245 |= Long.MIN_VALUE;
		if (this.method969() == 0L) {
			Static208.aClass115_8.method2875(this);
		}
	}

	@OriginalMember(owner = "client!e", name = "i", descriptor = "(I)I")
	public int method972() {
		return (int) this.aLong243;
	}
}
