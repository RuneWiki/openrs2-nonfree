import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class10_Sub1_Sub17 extends Class10_Sub1 {

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	public int anInt6806;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
	public int anInt6807;

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "I")
	public int anInt6813;

	@OriginalMember(owner = "client!ub", name = "O", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(II)V")
	public Class10_Sub1_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong264 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)I")
	public int method5339() {
		return (int) (super.aLong264 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)J")
	public long method5341() {
		return super.aLong254 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)I")
	public int method5342() {
		return (int) super.aLong264;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V")
	public void method5345() {
		super.aLong254 |= Long.MIN_VALUE;
		if (this.method5341() == 0L) {
			Static280.aClass136_7.method3197(this);
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	public void method5346() {
		super.aLong254 = super.aLong254 & Long.MIN_VALUE | Static220.method3314() + 500L;
		Static13.aClass136_8.method3197(this);
	}
}
