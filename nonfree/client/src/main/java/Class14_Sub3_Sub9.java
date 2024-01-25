import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public final class Class14_Sub3_Sub9 extends Class14_Sub3 {

	@OriginalMember(owner = "client!gaa", name = "y", descriptor = "I")
	public int anInt3409;

	@OriginalMember(owner = "client!gaa", name = "D", descriptor = "I")
	public int anInt3413;

	@OriginalMember(owner = "client!gaa", name = "I", descriptor = "Ljava/lang/String;")
	public String aString44;

	@OriginalMember(owner = "client!gaa", name = "M", descriptor = "I")
	public int anInt3419;

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(IJ)V")
	public Class14_Sub3_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong305 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!gaa", name = "e", descriptor = "(B)V")
	public void method2817() {
		super.aLong302 |= Long.MIN_VALUE;
		if (this.method2819() == 0L) {
			Static196.aClass73_3.method1816(this);
		}
	}

	@OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)J")
	public long method2819() {
		return Long.MAX_VALUE & super.aLong302;
	}

	@OriginalMember(owner = "client!gaa", name = "f", descriptor = "(B)I")
	public int method2821() {
		return (int) (super.aLong305 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!gaa", name = "d", descriptor = "(I)V")
	public void method2822() {
		super.aLong302 = Static521.method7499() + 500L | Long.MIN_VALUE & super.aLong302;
		Static23.aClass73_1.method1816(this);
	}

	@OriginalMember(owner = "client!gaa", name = "b", descriptor = "(Z)J")
	public long method2824() {
		return super.aLong305 & 0xFFFFFFFFFFFFFFL;
	}
}
