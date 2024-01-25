import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public final class Class2_Sub13_Sub15 extends Class2_Sub13 {

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	public int anInt8314;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	public int anInt8318;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	public int anInt8320;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "Ljava/lang/String;")
	public String aString172;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(II)V")
	public Class2_Sub13_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong241 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)I")
	public int method6967() {
		return (int) (super.aLong241 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
	public void method6968() {
		super.aLong230 |= Long.MIN_VALUE;
		if (this.method6970() == 0L) {
			Static178.aClass185_9.method4621(this);
		}
	}

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)I")
	public int method6969() {
		return (int) super.aLong241;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)J")
	public long method6970() {
		return Long.MAX_VALUE & super.aLong230;
	}

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "(I)V")
	public void method6974() {
		super.aLong230 = Static143.method2502() + 500L | super.aLong230 & Long.MIN_VALUE;
		Static163.aClass185_8.method4621(this);
	}
}
