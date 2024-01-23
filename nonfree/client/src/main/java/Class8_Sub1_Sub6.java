import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class8_Sub1_Sub6 extends Class8_Sub1 {

	@OriginalMember(owner = "client!e", name = "u", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!e", name = "v", descriptor = "I")
	public int anInt1284;

	@OriginalMember(owner = "client!e", name = "z", descriptor = "I")
	public int anInt1286;

	@OriginalMember(owner = "client!e", name = "C", descriptor = "I")
	public int anInt1289;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V")
	public Class8_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong203 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)I")
	public int method928() {
		return (int) (this.aLong203 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	public void method929() {
		this.aLong204 = Long.MIN_VALUE & this.aLong204 | Static71.method1143() + 500L;
		Static298.aClass164_2.method3993(this);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(Z)V")
	public void method931() {
		this.aLong204 |= Long.MIN_VALUE;
		if (this.method935() == 0L) {
			Static84.aClass164_4.method3993(this);
		}
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)I")
	public int method933() {
		return (int) this.aLong203;
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)J")
	public long method935() {
		return Long.MAX_VALUE & this.aLong204;
	}
}
