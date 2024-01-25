import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!en", name = "v", descriptor = "I")
	public int anInt2055;

	@OriginalMember(owner = "client!en", name = "w", descriptor = "I")
	public int anInt2056;

	@OriginalMember(owner = "client!en", name = "A", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!en", name = "B", descriptor = "I")
	public int anInt2059;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong222 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
	public void method1775() {
		super.aLong213 = super.aLong213 & Long.MIN_VALUE | Static279.method4058() + 500L;
		Static177.aClass227_2.method5106(this);
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)I")
	public int method1776() {
		return (int) (super.aLong222 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public void method1778() {
		super.aLong213 |= Long.MIN_VALUE;
		if (this.method1782() == 0L) {
			Static397.aClass227_10.method5106(this);
		}
	}

	@OriginalMember(owner = "client!en", name = "j", descriptor = "(I)I")
	public int method1781() {
		return (int) super.aLong222;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)J")
	public long method1782() {
		return super.aLong213 & Long.MAX_VALUE;
	}
}
