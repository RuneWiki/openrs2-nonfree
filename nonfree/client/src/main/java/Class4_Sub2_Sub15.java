import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class4_Sub2_Sub15 extends Class4_Sub2 {

	@OriginalMember(owner = "client!na", name = "y", descriptor = "I")
	public int anInt3526;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "Ljava/lang/String;")
	public String aString123;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "I")
	public int anInt3536;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "I")
	public int anInt3539;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II)V")
	public Class4_Sub2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong211 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V")
	public void method2875() {
		this.aLong212 = Long.MIN_VALUE & this.aLong212 | Static61.method1150() + 500L;
		Static100.aClass86_2.method2185(this);
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(Z)V")
	public void method2876() {
		this.aLong212 |= Long.MIN_VALUE;
		if (this.method2880() == 0L) {
			Static92.aClass86_1.method2185(this);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(B)I")
	public int method2877() {
		return (int) (this.aLong211 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(I)J")
	public long method2880() {
		return this.aLong212 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)I")
	public int method2882() {
		return (int) this.aLong211;
	}
}
