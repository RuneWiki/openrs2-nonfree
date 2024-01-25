import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public final class Class1_Sub8_Sub9 extends Class1_Sub8 {

	@OriginalMember(owner = "client!mk", name = "F", descriptor = "Ljava/lang/String;")
	public String aString71;

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "I")
	public int anInt5968;

	@OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
	public int anInt5969;

	@OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
	public int anInt5970;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(II)V")
	public Class1_Sub8_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong268 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)V")
	public void method4833() {
		super.aLong263 |= Long.MIN_VALUE;
		if (this.method4834() == 0L) {
			Static305.aClass170_9.method3550(this);
		}
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)J")
	public long method4834() {
		return Long.MAX_VALUE & super.aLong263;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(I)V")
	public void method4835() {
		super.aLong263 = Long.MIN_VALUE & super.aLong263 | Static480.method6650() + 500L;
		Static440.aClass170_11.method3550(this);
	}

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "(I)I")
	public int method4836() {
		return (int) super.aLong268;
	}

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(Z)I")
	public int method4837() {
		return (int) (super.aLong268 >>> 32 & 0xFFL);
	}
}
