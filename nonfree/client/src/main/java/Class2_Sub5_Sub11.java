import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class2_Sub5_Sub11 extends Class2_Sub5 {

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "Ljava/lang/String;")
	public String aString113;

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
	public int anInt3906;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
	public int anInt3911;

	@OriginalMember(owner = "client!mc", name = "F", descriptor = "I")
	public int anInt3916;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(II)V")
	public Class2_Sub5_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong225 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)I")
	public int method3096() {
		return (int) super.aLong225;
	}

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "(I)J")
	public long method3097() {
		return Long.MAX_VALUE & super.aLong220;
	}

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)V")
	public void method3098() {
		super.aLong220 |= Long.MIN_VALUE;
		if (this.method3097() == 0L) {
			Static334.aClass261_10.method5487(this);
		}
	}

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "(I)I")
	public int method3099() {
		return (int) (super.aLong225 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
	public void method3101() {
		super.aLong220 = Static110.method1702() + 500L | super.aLong220 & Long.MIN_VALUE;
		Static242.aClass261_9.method5487(this);
	}
}
