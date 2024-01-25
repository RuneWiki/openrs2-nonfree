import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
	public int anInt817;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
	public int anInt821;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(II)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong280 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public void method662() {
		super.aLong269 |= Long.MIN_VALUE;
		if (this.method668() == 0L) {
			Static471.aClass75_11.method1572(this);
		}
	}

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)I")
	public int method664() {
		return (int) super.aLong280;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)I")
	public int method667() {
		return (int) (super.aLong280 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)J")
	public long method668() {
		return Long.MAX_VALUE & super.aLong269;
	}

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)V")
	public void method669() {
		super.aLong269 = Static476.method6413() + 500L | Long.MIN_VALUE & super.aLong269;
		Static59.aClass75_2.method1572(this);
	}
}
