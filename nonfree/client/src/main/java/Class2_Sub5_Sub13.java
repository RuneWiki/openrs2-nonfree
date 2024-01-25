import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public final class Class2_Sub5_Sub13 extends Class2_Sub5 {

	@OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
	public int anInt5641;

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
	public int anInt5643;

	@OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
	public int anInt5644;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(II)V")
	public Class2_Sub5_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong227 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V")
	public void method4545() {
		super.aLong211 = super.aLong211 & Long.MIN_VALUE | Static21.method458() + 500L;
		Static11.aClass44_1.method799(this);
	}

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "(I)I")
	public int method4546() {
		return (int) (super.aLong227 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	public void method4547() {
		super.aLong211 |= Long.MIN_VALUE;
		if (this.method4550() == 0L) {
			Static109.aClass44_7.method799(this);
		}
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)I")
	public int method4549() {
		return (int) super.aLong227;
	}

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "(I)J")
	public long method4550() {
		return Long.MAX_VALUE & super.aLong211;
	}
}
