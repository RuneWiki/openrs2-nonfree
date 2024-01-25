import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public final class Class2_Sub6_Sub6 extends Class2_Sub6 {

	@OriginalMember(owner = "client!et", name = "A", descriptor = "I")
	public int anInt3366;

	@OriginalMember(owner = "client!et", name = "B", descriptor = "I")
	public int anInt3367;

	@OriginalMember(owner = "client!et", name = "C", descriptor = "I")
	public int anInt3368;

	@OriginalMember(owner = "client!et", name = "E", descriptor = "Ljava/lang/String;")
	public String aString27;

	@OriginalMember(owner = "client!et", name = "<init>", descriptor = "(II)V")
	public Class2_Sub6_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong278 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)I")
	public int method3087() {
		return (int) (super.aLong278 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
	public void method3088() {
		super.aLong267 |= Long.MIN_VALUE;
		if (this.method3092() == 0L) {
			Static47.aClass211_2.method6002(this);
		}
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(I)I")
	public int method3090() {
		return (int) super.aLong278;
	}

	@OriginalMember(owner = "client!et", name = "e", descriptor = "(B)J")
	public long method3092() {
		return super.aLong267 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!et", name = "f", descriptor = "(I)V")
	public void method3093() {
		super.aLong267 = Long.MIN_VALUE & super.aLong267 | Static277.method5091() + 500L;
		Static119.aClass211_3.method6002(this);
	}
}
