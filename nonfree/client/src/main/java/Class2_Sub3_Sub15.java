import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class2_Sub3_Sub15 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "Lclient!qe;")
	public Class78 aClass78_458;

	@OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
	public int anInt2073;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(II)V")
	public Class2_Sub3_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong188 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)I")
	public int method1639() {
		return (int) (super.aLong188 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)J")
	public long method1641() {
		return super.aLong184 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)I")
	public int method1642() {
		return (int) super.aLong188;
	}

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "(I)V")
	public void method1647() {
		super.aLong184 |= Long.MIN_VALUE;
		if (this.method1641() == 0L) {
			Static103.aClass102_21.method3629(this);
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	public void method1648() {
		super.aLong184 = super.aLong184 & Long.MIN_VALUE | Static111.method1911() + 500L;
		Static127.aClass102_37.method3629(this);
	}
}
