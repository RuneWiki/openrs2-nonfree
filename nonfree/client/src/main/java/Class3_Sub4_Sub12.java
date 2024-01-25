import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class3_Sub4_Sub12 extends Class3_Sub4 {

	@OriginalMember(owner = "client!kl", name = "w", descriptor = "I")
	public int anInt4060;

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
	public int anInt4062;

	@OriginalMember(owner = "client!kl", name = "A", descriptor = "I")
	public int anInt4063;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(II)V")
	public Class3_Sub4_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong234 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)I")
	public int method3242() {
		return (int) super.aLong234;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
	public void method3244() {
		super.aLong233 = super.aLong233 & Long.MIN_VALUE | Static118.method1934() + 500L;
		Static74.aClass244_2.method5234(this);
	}

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)I")
	public int method3245() {
		return (int) (super.aLong234 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)J")
	public long method3246() {
		return Long.MAX_VALUE & super.aLong233;
	}

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)V")
	public void method3248() {
		super.aLong233 |= Long.MIN_VALUE;
		if ((long) 0 == this.method3246()) {
			Static319.aClass244_4.method5234(this);
		}
	}
}
