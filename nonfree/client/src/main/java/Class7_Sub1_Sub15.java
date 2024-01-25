import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class7_Sub1_Sub15 extends Class7_Sub1 {

	@OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
	public int anInt5687;

	@OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
	public int anInt5692;

	@OriginalMember(owner = "client!sn", name = "H", descriptor = "Ljava/lang/String;")
	public String aString363;

	@OriginalMember(owner = "client!sn", name = "M", descriptor = "I")
	public int anInt5696;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(II)V")
	public Class7_Sub1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong232 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)V")
	public void method4788() {
		super.aLong222 = Static335.method5308() + 500L | super.aLong222 & Long.MIN_VALUE;
		Static304.aClass30_10.method515(this);
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)V")
	public void method4790() {
		super.aLong222 |= Long.MIN_VALUE;
		if (this.method4791() == 0L) {
			Static93.aClass30_2.method515(this);
		}
	}

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "(I)J")
	public long method4791() {
		return super.aLong222 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)I")
	public int method4792() {
		return (int) (super.aLong232 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!sn", name = "f", descriptor = "(B)I")
	public int method4793() {
		return (int) super.aLong232;
	}
}
