import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public final class Class2_Sub11_Sub19 extends Class2_Sub11 {

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "I")
	public int anInt6362;

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
	public int anInt6365;

	@OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
	public int anInt6368;

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString59;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(II)V")
	public Class2_Sub11_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong213 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)J")
	public long method5535() {
		return Long.MAX_VALUE & super.aLong212;
	}

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
	public void method5537() {
		super.aLong212 |= Long.MIN_VALUE;
		if (this.method5535() == 0L) {
			Static316.aClass54_10.method1662(this);
		}
	}

	@OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)I")
	public int method5538() {
		return (int) (super.aLong213 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
	public void method5539() {
		super.aLong212 = Static51.method1197() + 500L | super.aLong212 & Long.MIN_VALUE;
		Static216.aClass54_3.method1662(this);
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)I")
	public int method5544() {
		return (int) super.aLong213;
	}
}
