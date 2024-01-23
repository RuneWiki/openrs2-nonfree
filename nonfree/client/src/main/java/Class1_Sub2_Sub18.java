import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!th", name = "v", descriptor = "Ljava/lang/String;")
	public String aString296;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "I")
	public int anInt5000;

	@OriginalMember(owner = "client!th", name = "K", descriptor = "I")
	public int anInt5004;

	@OriginalMember(owner = "client!th", name = "M", descriptor = "I")
	public int anInt5005;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong205 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(I)I")
	public int method3901() {
		return (int) (this.aLong205 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V")
	public void method3905() {
		this.aLong201 |= Long.MIN_VALUE;
		if (this.method3912() == 0L) {
			Static109.aClass140_3.method3414(this);
		}
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)I")
	public int method3908() {
		return (int) this.aLong205;
	}

	@OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V")
	public void method3911() {
		this.aLong201 = Long.MIN_VALUE & this.aLong201 | Static294.method4413() + 500L;
		Static3.aClass140_1.method3414(this);
	}

	@OriginalMember(owner = "client!th", name = "h", descriptor = "(I)J")
	public long method3912() {
		return this.aLong201 & Long.MAX_VALUE;
	}
}
