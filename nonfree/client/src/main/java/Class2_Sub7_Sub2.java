import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class2_Sub7_Sub2 extends Class2_Sub7 {

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	public int anInt852;

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
	public int anInt855;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
	public int anInt858;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(II)V")
	public Class2_Sub7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong278 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
	public int method922() {
		return (int) (super.aLong278 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	public void method923() {
		super.aLong260 = Static48.method1203() + 500L | Long.MIN_VALUE & super.aLong260;
		Static67.aClass290_1.method6678(this);
	}

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)I")
	public int method924() {
		return (int) super.aLong278;
	}

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
	public void method925() {
		super.aLong260 |= Long.MIN_VALUE;
		if (this.method927() == 0L) {
			Static103.aClass290_3.method6678(this);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)J")
	public long method927() {
		return Long.MAX_VALUE & super.aLong260;
	}
}
