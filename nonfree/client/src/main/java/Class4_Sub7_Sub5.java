import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class4_Sub7_Sub5 extends Class4_Sub7 {

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
	public int anInt3348;

	@OriginalMember(owner = "client!fr", name = "B", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!fr", name = "C", descriptor = "I")
	public int anInt3351;

	@OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
	public int anInt3353;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(II)V")
	public Class4_Sub7_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong307 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(B)V")
	public void method3062() {
		super.aLong303 = Static184.method3422() + 500L | super.aLong303 & Long.MIN_VALUE;
		Static211.aClass286_5.method6409(this);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
	public int method3063() {
		return (int) (super.aLong307 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)J")
	public long method3064() {
		return super.aLong303 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)V")
	public void method3066() {
		super.aLong303 |= Long.MIN_VALUE;
		if (this.method3064() == 0L) {
			Static511.aClass286_2.method6409(this);
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)I")
	public int method3067() {
		return (int) super.aLong307;
	}
}
