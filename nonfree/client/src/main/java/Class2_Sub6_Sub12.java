import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class2_Sub6_Sub12 extends Class2_Sub6 {

	@OriginalMember(owner = "client!nj", name = "K", descriptor = "Ljava/lang/String;")
	public String aString73;

	@OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
	public int anInt6934;

	@OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
	public int anInt6936;

	@OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
	public int anInt6938;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IJ)V")
	public Class2_Sub6_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong352 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
	public void method6239() {
		super.aLong311 |= Long.MIN_VALUE;
		if (this.method6240() == 0L) {
			Static398.aClass388_5.method9215(this);
		}
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)J")
	public long method6240() {
		return Long.MAX_VALUE & super.aLong311;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(Z)J")
	public long method6241() {
		return super.aLong352 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)V")
	public void method6245() {
		super.aLong311 = Static567.method7863() + 500L | Long.MIN_VALUE & super.aLong311;
		Static453.aClass388_8.method9215(this);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)I")
	public int method6246() {
		return (int) (super.aLong352 >>> 56 & 0xFFL);
	}
}
