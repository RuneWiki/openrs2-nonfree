import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public final class Class5_Sub3_Sub17 extends Class5_Sub3 {

	@OriginalMember(owner = "client!rha", name = "s", descriptor = "Ljava/lang/String;")
	public String aString82;

	@OriginalMember(owner = "client!rha", name = "w", descriptor = "I")
	public int anInt8545;

	@OriginalMember(owner = "client!rha", name = "x", descriptor = "I")
	public int anInt8546;

	@OriginalMember(owner = "client!rha", name = "B", descriptor = "I")
	public int anInt8549;

	@OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(IJ)V")
	public Class5_Sub3_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong307 = arg1 | (long) arg0 << 56;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V")
	public void method7286() {
		super.aLong297 |= Long.MIN_VALUE;
		if (this.method7290() == 0L) {
			Static126.aClass358_3.method8329(this);
		}
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(Z)V")
	public void method7288() {
		super.aLong297 = Static547.method7619() + 500L | Long.MIN_VALUE & super.aLong297;
		Static174.aClass358_5.method8329(this);
	}

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)J")
	public long method7290() {
		return super.aLong297 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!rha", name = "e", descriptor = "(I)J")
	public long method7292() {
		return super.aLong307 & 0xFFFFFFFFFFFFFFL;
	}

	@OriginalMember(owner = "client!rha", name = "f", descriptor = "(I)I")
	public int method7293() {
		return (int) (super.aLong307 >>> 56 & 0xFFL);
	}
}
