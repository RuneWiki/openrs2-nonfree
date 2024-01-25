import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class5_Sub2_Sub9 extends Class5_Sub2 {

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	public int anInt3818;

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
	public int anInt3821;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "Ljava/lang/String;")
	public String aString42;

	@OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
	public int anInt3826;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(II)V")
	public Class5_Sub2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong234 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)J")
	public long method3022() {
		return super.aLong235 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)I")
	public int method3023() {
		return (int) (super.aLong234 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!lb", name = "g", descriptor = "(I)V")
	public void method3024() {
		super.aLong235 = Long.MIN_VALUE & super.aLong235 | Static446.method5903() + 500L;
		Static383.aClass123_11.method2620(this);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
	public void method3026() {
		super.aLong235 |= Long.MIN_VALUE;
		if (this.method3022() == 0L) {
			Static168.aClass123_9.method2620(this);
		}
	}

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "(I)I")
	public int method3027() {
		return (int) super.aLong234;
	}
}
