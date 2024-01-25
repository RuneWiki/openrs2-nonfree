import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public int anInt381;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
	public int anInt384;

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong236 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I")
	public int method382() {
		return (int) super.aLong236;
	}

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "(I)V")
	public void method384() {
		super.aLong235 |= Long.MIN_VALUE;
		if (this.method386() == 0L) {
			Static190.aClass163_4.method3657(this);
		}
	}

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "(I)V")
	public void method385() {
		super.aLong235 = Long.MIN_VALUE & super.aLong235 | Static183.method2674() + 500L;
		Static156.aClass163_3.method3657(this);
	}

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "(I)J")
	public long method386() {
		return Long.MAX_VALUE & super.aLong235;
	}

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "(I)I")
	public int method387() {
		return (int) (super.aLong236 >>> 32 & 0xFFL);
	}
}
