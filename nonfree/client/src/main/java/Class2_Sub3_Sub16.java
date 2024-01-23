import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public final class Class2_Sub3_Sub16 extends Class2_Sub3 {

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "Ljava/lang/String;")
	public String aString162;

	@OriginalMember(owner = "client!mf", name = "K", descriptor = "I")
	public int anInt3323;

	@OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
	public int anInt3324;

	@OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
	public int anInt3327;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(II)V")
	public Class2_Sub3_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong315 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)I")
	public int method2716() {
		return (int) this.aLong315;
	}

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)I")
	public int method2717() {
		return (int) (this.aLong315 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
	public void method2718() {
		this.aLong295 |= Long.MIN_VALUE;
		if (this.method2720() == 0L) {
			Static99.aClass144_5.method3662(this);
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(B)V")
	public void method2719() {
		this.aLong295 = Static6.method126() + 500L | Long.MIN_VALUE & this.aLong295;
		Static8.aClass144_1.method3662(this);
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)J")
	public long method2720() {
		return this.aLong295 & Long.MAX_VALUE;
	}
}
