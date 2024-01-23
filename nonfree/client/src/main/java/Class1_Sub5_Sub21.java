import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class1_Sub5_Sub21 extends Class1_Sub5 {

	@OriginalMember(owner = "client!td", name = "D", descriptor = "I")
	public int anInt4862;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "I")
	public int anInt4863;

	@OriginalMember(owner = "client!td", name = "F", descriptor = "I")
	public int anInt4864;

	@OriginalMember(owner = "client!td", name = "H", descriptor = "Ljava/lang/String;")
	public String aString185;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(II)V")
	public Class1_Sub5_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong210 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)I")
	public int method4060() {
		return (int) (this.aLong210 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I")
	public int method4061() {
		return (int) this.aLong210;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
	public void method4062() {
		this.aLong211 |= Long.MIN_VALUE;
		if (this.method4067() == 0L) {
			Static105.aClass189_1.method4603(this);
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)V")
	public void method4064() {
		this.aLong211 = Static244.method3859() + 500L | this.aLong211 & Long.MIN_VALUE;
		Static178.aClass189_5.method4603(this);
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)J")
	public long method4067() {
		return this.aLong211 & Long.MAX_VALUE;
	}
}
