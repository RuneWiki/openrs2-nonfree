import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!a", name = "K", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!a", name = "O", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong237 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(B)I")
	public int method24() {
		return (int) super.aLong237;
	}

	@OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
	public void method28() {
		super.aLong231 = super.aLong231 & Long.MIN_VALUE | Static107.method1707() + 500L;
		Static375.aClass247_11.method5590(this);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)I")
	public int method30() {
		return (int) (super.aLong237 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(B)J")
	public long method31() {
		return Long.MAX_VALUE & super.aLong231;
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(B)V")
	public void method32() {
		super.aLong231 |= Long.MIN_VALUE;
		if (this.method31() == 0L) {
			Static439.aClass247_12.method5590(this);
		}
	}
}
