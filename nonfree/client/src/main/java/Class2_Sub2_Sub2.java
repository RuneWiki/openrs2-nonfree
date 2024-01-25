import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!bk", name = "C", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
	public int anInt659;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(II)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong227 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
	public void method434() {
		super.aLong223 |= Long.MIN_VALUE;
		if ((long) 0 == this.method436()) {
			Static71.aClass145_1.method3387(this);
		}
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
	public void method435() {
		super.aLong223 = Static208.method3182() + 500L | Long.MIN_VALUE & super.aLong223;
		Static430.aClass145_10.method3387(this);
	}

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)J")
	public long method436() {
		return Long.MAX_VALUE & super.aLong223;
	}

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "(I)I")
	public int method438() {
		return (int) super.aLong227;
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(B)I")
	public int method439() {
		return (int) (super.aLong227 >>> 32 & 0xFFL);
	}
}
