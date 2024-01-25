import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public final class Class5_Sub2_Sub7 extends Class5_Sub2 {

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
	public int anInt1433;

	@OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
	public int anInt1434;

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
	public int anInt1437;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(II)V")
	public Class5_Sub2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong253 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)I")
	public int method1321() {
		return (int) (super.aLong253 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!cn", name = "c", descriptor = "(Z)V")
	public void method1324() {
		super.aLong252 = Static105.method2132() + 500L | super.aLong252 & Long.MIN_VALUE;
		Static77.aClass187_7.method4807(this);
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(Z)I")
	public int method1325() {
		return (int) super.aLong253;
	}

	@OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)J")
	public long method1326() {
		return Long.MAX_VALUE & super.aLong252;
	}

	@OriginalMember(owner = "client!cn", name = "g", descriptor = "(I)V")
	public void method1327() {
		super.aLong252 |= Long.MIN_VALUE;
		if (this.method1326() == 0L) {
			Static241.aClass187_6.method4807(this);
		}
	}
}
