import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
	public int anInt5458;

	@OriginalMember(owner = "client!rl", name = "z", descriptor = "Ljava/lang/String;")
	public String aString211;

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
	public int anInt5461;

	@OriginalMember(owner = "client!rl", name = "I", descriptor = "I")
	public int anInt5467;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong214 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V")
	public void method4782() {
		super.aLong213 = Static292.method5114() + 500L | Long.MIN_VALUE & super.aLong213;
		Static51.aClass169_2.method4475(this);
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V")
	public void method4783() {
		super.aLong213 |= Long.MIN_VALUE;
		if (this.method4786() == 0L) {
			Static100.aClass169_4.method4475(this);
		}
	}

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)I")
	public int method4784() {
		return (int) super.aLong214;
	}

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "(I)I")
	public int method4785() {
		return (int) (super.aLong214 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)J")
	public long method4786() {
		return Long.MAX_VALUE & super.aLong213;
	}
}
