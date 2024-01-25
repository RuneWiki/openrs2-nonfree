import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public final class Class3_Sub5_Sub20 extends Class3_Sub5 {

	@OriginalMember(owner = "client!wga", name = "x", descriptor = "I")
	public int anInt10754;

	@OriginalMember(owner = "client!wga", name = "z", descriptor = "I")
	public int anInt10756;

	@OriginalMember(owner = "client!wga", name = "A", descriptor = "I")
	public int anInt10757;

	@OriginalMember(owner = "client!wga", name = "B", descriptor = "Ljava/lang/String;")
	public String aString117;

	@OriginalMember(owner = "client!wga", name = "<init>", descriptor = "(IJ)V")
	public Class3_Sub5_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong313 = arg1 | (long) arg0 << 56;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Z)J")
	public long method8829() {
		return super.aLong313 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V")
	public void method8832() {
		super.aLong312 |= Long.MIN_VALUE;
		if (this.method8835() == 0L) {
			Static515.aClass243_12.method5457(this);
		}
	}

	@OriginalMember(owner = "client!wga", name = "d", descriptor = "(B)I")
	public int method8833() {
		return (int) (super.aLong313 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)V")
	public void method8834() {
		super.aLong312 = Static15.method380() + 500L | super.aLong312 & Long.MIN_VALUE;
		Static283.aClass243_8.method5457(this);
	}

	@OriginalMember(owner = "client!wga", name = "e", descriptor = "(B)J")
	public long method8835() {
		return super.aLong312 & Long.MAX_VALUE;
	}
}
