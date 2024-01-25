import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class6_Sub2_Sub9 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
	public int anInt4291;

	@OriginalMember(owner = "client!ho", name = "H", descriptor = "Ljava/lang/String;")
	public String aString49;

	@OriginalMember(owner = "client!ho", name = "I", descriptor = "I")
	public int anInt4293;

	@OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
	public int anInt4294;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(II)V")
	public Class6_Sub2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong278 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
	public int method3721() {
		return (int) (super.aLong278 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
	public void method3722() {
		super.aLong272 = Long.MIN_VALUE & super.aLong272 | Static32.method595() + 500L;
		Static223.aClass286_3.method7239(this);
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
	public void method3723() {
		super.aLong272 |= Long.MIN_VALUE;
		if (this.method3724() == 0L) {
			Static223.aClass286_4.method7239(this);
		}
	}

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "(I)J")
	public long method3724() {
		return super.aLong272 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(B)I")
	public int method3725() {
		return (int) super.aLong278;
	}
}
