import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public final class Class3_Sub4_Sub12 extends Class3_Sub4 {

	@OriginalMember(owner = "client!hha", name = "w", descriptor = "I")
	public int anInt4062;

	@OriginalMember(owner = "client!hha", name = "y", descriptor = "I")
	public int anInt4064;

	@OriginalMember(owner = "client!hha", name = "z", descriptor = "I")
	public int anInt4065;

	@OriginalMember(owner = "client!hha", name = "A", descriptor = "Ljava/lang/String;")
	public String aString51;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(II)V")
	public Class3_Sub4_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong276 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "(I)J")
	public long method3604() {
		return Long.MAX_VALUE & super.aLong274;
	}

	@OriginalMember(owner = "client!hha", name = "d", descriptor = "(I)V")
	public void method3607() {
		super.aLong274 = Long.MIN_VALUE & super.aLong274 | Static374.method6036() + 500L;
		Static411.aClass15_12.method901(this);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V")
	public void method3608() {
		super.aLong274 |= Long.MIN_VALUE;
		if (this.method3604() == 0L) {
			Static223.aClass15_7.method901(this);
		}
	}

	@OriginalMember(owner = "client!hha", name = "d", descriptor = "(B)I")
	public int method3610() {
		return (int) (super.aLong276 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "(Z)I")
	public int method3612() {
		return (int) super.aLong276;
	}
}
