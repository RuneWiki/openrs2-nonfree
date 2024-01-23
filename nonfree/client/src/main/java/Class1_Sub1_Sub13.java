import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mj", name = "M", descriptor = "Lclient!hh;")
	public Class50 aClass50_937;

	@OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
	public int anInt2779;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong173 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)I")
	public int method2257() {
		return (int) (super.aLong173 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)I")
	public int method2258() {
		return (int) super.aLong173;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
	public void method2259() {
		super.aLong174 = super.aLong174 & Long.MIN_VALUE | Static179.method2941() + 500L;
		Static192.aClass121_4.method3383(this);
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
	public void method2260() {
		super.aLong174 |= Long.MIN_VALUE;
		if (this.method2264() == 0L) {
			Static47.aClass121_2.method3383(this);
		}
	}

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(B)J")
	public long method2264() {
		return Long.MAX_VALUE & super.aLong174;
	}
}
