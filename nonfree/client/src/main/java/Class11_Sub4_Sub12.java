import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class11_Sub4_Sub12 extends Class11_Sub4 {

	@OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
	public int anInt4388;

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "I")
	public int anInt4390;

	@OriginalMember(owner = "client!nn", name = "G", descriptor = "Ljava/lang/String;")
	public String aString41;

	@OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
	public int anInt4398;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(II)V")
	public Class11_Sub4_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong215 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)V")
	public void method3858() {
		super.aLong208 |= Long.MIN_VALUE;
		if (this.method3860() == 0L) {
			Static86.aClass74_5.method1290(this);
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)J")
	public long method3860() {
		return super.aLong208 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(B)I")
	public int method3862() {
		return (int) super.aLong215;
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V")
	public void method3864() {
		super.aLong208 = Long.MIN_VALUE & super.aLong208 | Static268.method4627() + 500L;
		Static64.aClass74_4.method1290(this);
	}

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)I")
	public int method3865() {
		return (int) (super.aLong215 >>> 32 & 0xFFL);
	}
}
