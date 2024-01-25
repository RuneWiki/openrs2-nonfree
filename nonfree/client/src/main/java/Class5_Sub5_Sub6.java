import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public final class Class5_Sub5_Sub6 extends Class5_Sub5 {

	@OriginalMember(owner = "client!gaa", name = "t", descriptor = "I")
	public int anInt3058;

	@OriginalMember(owner = "client!gaa", name = "A", descriptor = "I")
	public int anInt3059;

	@OriginalMember(owner = "client!gaa", name = "x", descriptor = "Ljava/lang/String;")
	public String aString48;

	@OriginalMember(owner = "client!gaa", name = "z", descriptor = "I")
	public int anInt3064;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(IJ)V")
	public Class5_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong314 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Z)V")
	public void method2686() {
		super.aLong312 = Static515.method7499(81) + 500L | super.aLong312 & Long.MIN_VALUE;
		Static566.aClass149_9.method2889(this);
	}

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "(B)V")
	public void method2687() {
		super.aLong312 |= Long.MIN_VALUE;
		if (this.method2691() == 0L) {
			Static184.aClass149_7.method2889(this);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)I")
	public int method2688() {
		return (int) (super.aLong314 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!gaa", name = "g", descriptor = "(I)J")
	public long method2689() {
		return super.aLong314 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!gaa", name = "c", descriptor = "(B)J")
	public long method2691() {
		return Long.MAX_VALUE & super.aLong312;
	}
}
