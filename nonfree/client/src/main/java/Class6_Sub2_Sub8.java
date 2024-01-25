import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class6_Sub2_Sub8 extends Class6_Sub2 {

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "Ljava/lang/String;")
	public String aString105;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
	public int anInt2507;

	@OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
	public int anInt2510;

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "I")
	public int anInt2511;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(II)V")
	public Class6_Sub2_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong218 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)J")
	public long method2644() {
		return super.aLong219 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)V")
	public void method2645() {
		super.aLong219 = Static245.method4300() + 500L | super.aLong219 & Long.MIN_VALUE;
		Static176.aClass143_12.method3765(this);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)I")
	public int method2647() {
		return (int) super.aLong218;
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)V")
	public void method2648() {
		super.aLong219 |= Long.MIN_VALUE;
		if (this.method2644() == 0L) {
			Static156.aClass143_15.method3765(this);
		}
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "(B)I")
	public int method2650() {
		return (int) (super.aLong218 >>> 32 & 0xFFL);
	}
}
