import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class4_Sub4_Sub18 extends Class4_Sub4 {

	@OriginalMember(owner = "client!so", name = "I", descriptor = "Ljava/lang/String;")
	public String aString58;

	@OriginalMember(owner = "client!so", name = "L", descriptor = "I")
	public int anInt5703;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "I")
	public int anInt5704;

	@OriginalMember(owner = "client!so", name = "N", descriptor = "I")
	public int anInt5705;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(II)V")
	public Class4_Sub4_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong223 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!so", name = "d", descriptor = "(B)I")
	public int method4901() {
		return (int) super.aLong223;
	}

	@OriginalMember(owner = "client!so", name = "e", descriptor = "(B)V")
	public void method4902() {
		super.aLong222 = Static208.method3879() + 500L | Long.MIN_VALUE & super.aLong222;
		Static301.aClass180_8.method4840(this);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)J")
	public long method4907() {
		return Long.MAX_VALUE & super.aLong222;
	}

	@OriginalMember(owner = "client!so", name = "g", descriptor = "(B)V")
	public void method4908() {
		super.aLong222 |= Long.MIN_VALUE;
		if (this.method4907() == 0L) {
			Static347.aClass180_10.method4840(this);
		}
	}

	@OriginalMember(owner = "client!so", name = "h", descriptor = "(B)I")
	public int method4910() {
		return (int) (super.aLong223 >>> 32 & 0xFFL);
	}
}
