import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class6_Sub1_Sub12 extends Class6_Sub1 {

	@OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
	public int anInt3397;

	@OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
	public int anInt3400;

	@OriginalMember(owner = "client!jt", name = "z", descriptor = "Ljava/lang/String;")
	public String aString32;

	@OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
	public int anInt3403;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(II)V")
	public Class6_Sub1_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong217 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
	public void method3043() {
		super.aLong218 |= Long.MIN_VALUE;
		if (this.method3046() == 0L) {
			Static287.aClass202_9.method4472(this);
		}
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(B)I")
	public int method3044() {
		return (int) super.aLong217;
	}

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)I")
	public int method3045() {
		return (int) (super.aLong217 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "(I)J")
	public long method3046() {
		return super.aLong218 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!jt", name = "i", descriptor = "(I)V")
	public void method3048() {
		super.aLong218 = Static154.method2527() + 500L | super.aLong218 & Long.MIN_VALUE;
		Static217.aClass202_2.method4472(this);
	}
}
