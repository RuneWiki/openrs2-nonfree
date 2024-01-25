import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ah", name = "v", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!ah", name = "x", descriptor = "I")
	public int anInt545;

	@OriginalMember(owner = "client!ah", name = "C", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong425 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
	public void method488() {
		super.aLong420 = Long.MIN_VALUE & super.aLong420 | Static255.method4035() + 500L;
		Static412.aClass117_8.method2550(this);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)I")
	public int method489() {
		return (int) super.aLong425;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(B)J")
	public long method490() {
		return super.aLong420 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V")
	public void method491() {
		super.aLong420 |= Long.MIN_VALUE;
		if (this.method490() == 0L) {
			Static132.aClass117_2.method2550(this);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)I")
	public int method492() {
		return (int) (super.aLong425 >>> 32 & 0xFFL);
	}
}
