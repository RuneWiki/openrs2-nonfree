import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class5_Sub1_Sub18 extends Class5_Sub1 {

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "Ljava/lang/String;")
	public String aString99;

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
	public int anInt8632;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
	public int anInt8635;

	@OriginalMember(owner = "client!sf", name = "H", descriptor = "I")
	public int anInt8638;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IJ)V")
	public Class5_Sub1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong312 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)J")
	public long method7440() {
		return super.aLong298 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
	public void method7441() {
		super.aLong298 |= Long.MIN_VALUE;
		if (this.method7440() == 0L) {
			Static188.aClass388_16.method9022(this);
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)I")
	public int method7442() {
		return (int) (super.aLong312 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)J")
	public long method7443() {
		return super.aLong312 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)V")
	public void method7444() {
		super.aLong298 = Static480.method6763() + 500L | Long.MIN_VALUE & super.aLong298;
		Static424.aClass388_12.method9022(this);
	}
}
