import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class4_Sub2_Sub17 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
	public int anInt6869;

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
	public int anInt6871;

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "Ljava/lang/String;")
	public String aString71;

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
	public int anInt6873;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(II)V")
	public Class4_Sub2_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong227 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public void method5523() {
		super.aLong208 = Long.MIN_VALUE & super.aLong208 | Static266.method3498() + 500L;
		Static309.aClass239_8.method5126(this);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)I")
	public int method5526() {
		return (int) (super.aLong227 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)J")
	public long method5528() {
		return Long.MAX_VALUE & super.aLong208;
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
	public void method5529() {
		super.aLong208 |= Long.MIN_VALUE;
		if (this.method5528() == 0L) {
			Static96.aClass239_5.method5126(this);
		}
	}

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "(B)I")
	public int method5532() {
		return (int) super.aLong227;
	}
}
