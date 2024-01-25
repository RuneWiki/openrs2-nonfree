import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public final class Class3_Sub3_Sub7 extends Class3_Sub3 {

	@OriginalMember(owner = "client!bu", name = "t", descriptor = "I")
	public int anInt1086;

	@OriginalMember(owner = "client!bu", name = "v", descriptor = "I")
	public int anInt1088;

	@OriginalMember(owner = "client!bu", name = "x", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!bu", name = "z", descriptor = "I")
	public int anInt1091;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(II)V")
	public Class3_Sub3_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong273 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V")
	public void method839() {
		super.aLong265 |= Long.MIN_VALUE;
		if (this.method843() == 0L) {
			Static529.aClass38_6.method1069(this);
		}
	}

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "(I)I")
	public int method842() {
		return (int) (super.aLong273 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!bu", name = "i", descriptor = "(I)J")
	public long method843() {
		return Long.MAX_VALUE & super.aLong265;
	}

	@OriginalMember(owner = "client!bu", name = "j", descriptor = "(I)V")
	public void method845() {
		super.aLong265 = Static587.method7753() + 500L | super.aLong265 & Long.MIN_VALUE;
		Static293.aClass38_4.method1069(this);
	}

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "(I)I")
	public int method846() {
		return (int) super.aLong273;
	}
}
