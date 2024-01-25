import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class6_Sub1_Sub5 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "client!ch", name = "A", descriptor = "I")
	public int anInt972;

	@OriginalMember(owner = "client!ch", name = "C", descriptor = "I")
	public int anInt974;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "I")
	public int anInt979;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(II)V")
	public Class6_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong249 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
	public void method770() {
		super.aLong250 = super.aLong250 & Long.MIN_VALUE | Static137.method2058() + 500L;
		Static19.aClass144_7.method3114(this);
	}

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "(I)J")
	public long method772() {
		return super.aLong250 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)I")
	public int method773() {
		return (int) (super.aLong249 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)I")
	public int method774() {
		return (int) super.aLong249;
	}

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "(I)V")
	public void method776() {
		super.aLong250 |= Long.MIN_VALUE;
		if (this.method772() == 0L) {
			Static433.aClass144_13.method3114(this);
		}
	}
}
