import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!jh", name = "I", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
	public int anInt3607;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
	public int anInt3610;

	@OriginalMember(owner = "client!jh", name = "N", descriptor = "I")
	public int anInt3611;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(II)V")
	public Class4_Sub1_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong225 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
	public void method2761() {
		super.aLong226 = Static199.method2845() + 500L | super.aLong226 & Long.MIN_VALUE;
		Static300.aClass140_9.method3015(this);
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
	public void method2762() {
		super.aLong226 |= Long.MIN_VALUE;
		if (this.method2765() == 0L) {
			Static152.aClass140_3.method3015(this);
		}
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)I")
	public int method2763() {
		return (int) (super.aLong225 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!jh", name = "e", descriptor = "(B)J")
	public long method2765() {
		return super.aLong226 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I")
	public int method2767() {
		return (int) super.aLong225;
	}
}
