import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public final class Class3_Sub3_Sub7 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "Ljava/lang/String;")
	public String aString16;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
	public int anInt1930;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
	public int anInt1932;

	@OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
	public int anInt1933;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(II)V")
	public Class3_Sub3_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong227 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public void method1563() {
		super.aLong175 = Static150.method2672() + 500L | super.aLong175 & Long.MIN_VALUE;
		Static435.aClass248_10.method5659(this);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)J")
	public long method1564() {
		return super.aLong175 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I")
	public int method1565() {
		return (int) (super.aLong227 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)I")
	public int method1569() {
		return (int) super.aLong227;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
	public void method1570() {
		super.aLong175 |= Long.MIN_VALUE;
		if (this.method1564() == 0L) {
			Static417.aClass248_9.method5659(this);
		}
	}
}
