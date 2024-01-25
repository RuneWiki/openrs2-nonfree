import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public final class Class3_Sub7_Sub21 extends Class3_Sub7 {

	@OriginalMember(owner = "client!w", name = "A", descriptor = "I")
	public int anInt10896;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "I")
	public int anInt10897;

	@OriginalMember(owner = "client!w", name = "t", descriptor = "I")
	public int anInt10899;

	@OriginalMember(owner = "client!w", name = "z", descriptor = "Ljava/lang/String;")
	public String aString131;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IJ)V")
	public Class3_Sub7_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong345 = arg1 | (long) arg0 << 56;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)J")
	public long method9253() {
		return super.aLong345 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(I)I")
	public int method9254() {
		return (int) (super.aLong345 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public void method9256() {
		super.aLong336 |= Long.MIN_VALUE;
		if (this.method9258() == 0L) {
			Static647.aClass147_13.method3335(this);
		}
	}

	@OriginalMember(owner = "client!w", name = "h", descriptor = "(I)J")
	public long method9258() {
		return Long.MAX_VALUE & super.aLong336;
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)V")
	public void method9260() {
		super.aLong336 = Static517.method6965() + 500L | Long.MIN_VALUE & super.aLong336;
		Static274.aClass147_4.method3335(this);
	}
}
