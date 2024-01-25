import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
	public int anInt341;

	@OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
	public int anInt343;

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
	public int anInt348;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(II)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong208 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)I")
	public int method407() {
		return (int) (super.aLong208 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "(I)J")
	public long method408() {
		return super.aLong209 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
	public void method410() {
		super.aLong209 |= Long.MIN_VALUE;
		if (this.method408() == 0L) {
			Static8.aClass174_1.method4099(this);
		}
	}

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)I")
	public int method411() {
		return (int) super.aLong208;
	}

	@OriginalMember(owner = "client!ba", name = "i", descriptor = "(I)V")
	public void method412() {
		super.aLong209 = super.aLong209 & Long.MIN_VALUE | Static51.method979() + 500L;
		Static258.aClass174_11.method4099(this);
	}
}
