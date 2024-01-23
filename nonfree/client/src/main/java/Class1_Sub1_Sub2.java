import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!be", name = "B", descriptor = "I")
	public int anInt293;

	@OriginalMember(owner = "client!be", name = "C", descriptor = "I")
	public int anInt294;

	@OriginalMember(owner = "client!be", name = "E", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong223 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)I")
	public int method293() {
		return (int) this.aLong223;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
	public void method294() {
		this.aLong224 |= Long.MIN_VALUE;
		if (this.method295() == 0L) {
			Static73.aClass5_9.method48(this);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)J")
	public long method295() {
		return this.aLong224 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!be", name = "g", descriptor = "(I)I")
	public int method297() {
		return (int) (this.aLong223 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!be", name = "h", descriptor = "(I)V")
	public void method299() {
		this.aLong224 = Long.MIN_VALUE & this.aLong224 | Static135.method2186() + 500L;
		Static51.aClass5_6.method48(this);
	}
}
