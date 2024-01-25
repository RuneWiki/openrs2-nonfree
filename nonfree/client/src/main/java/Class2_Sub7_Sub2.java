import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class2_Sub7_Sub2 extends Class2_Sub7 {

	@OriginalMember(owner = "client!df", name = "z", descriptor = "I")
	public int anInt1462;

	@OriginalMember(owner = "client!df", name = "F", descriptor = "I")
	public int anInt1465;

	@OriginalMember(owner = "client!df", name = "K", descriptor = "I")
	public int anInt1468;

	@OriginalMember(owner = "client!df", name = "T", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(II)V")
	public Class2_Sub7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong213 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)I")
	public int method1194() {
		return (int) super.aLong213;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	public void method1197() {
		super.aLong209 = Static101.method1805() + 500L | super.aLong209 & Long.MIN_VALUE;
		Static299.aClass179_6.method4491(this);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Z)V")
	public void method1198() {
		super.aLong209 |= Long.MIN_VALUE;
		if (this.method1199() == 0L) {
			Static305.aClass179_13.method4491(this);
		}
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(B)J")
	public long method1199() {
		return super.aLong209 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)I")
	public int method1200() {
		return (int) (super.aLong213 >>> 32 & 0xFFL);
	}
}
