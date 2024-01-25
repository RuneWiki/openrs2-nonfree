import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
	public int anInt75;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
	public int anInt85;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong215 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(B)J")
	public long method164() {
		return Long.MAX_VALUE & super.aLong208;
	}

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "(B)I")
	public int method165() {
		return (int) (super.aLong215 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	public void method167() {
		super.aLong208 = Long.MIN_VALUE & super.aLong208 | Static349.method5647() + 500L;
		Static148.aClass4_8.method180(this);
	}

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "(B)V")
	public void method168() {
		super.aLong208 |= Long.MIN_VALUE;
		if (this.method164() == 0L) {
			Static165.aClass4_4.method180(this);
		}
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)I")
	public int method169() {
		return (int) super.aLong215;
	}
}
