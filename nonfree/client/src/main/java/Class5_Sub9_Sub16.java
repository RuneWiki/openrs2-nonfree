import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class5_Sub9_Sub16 extends Class5_Sub9 {

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "Ljava/lang/String;")
	public String aString276;

	@OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
	public int anInt4721;

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
	public int anInt4723;

	@OriginalMember(owner = "client!pm", name = "C", descriptor = "I")
	public int anInt4724;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(II)V")
	public Class5_Sub9_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong218 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(B)V")
	public void method4138() {
		super.aLong208 = Static284.method4783() + 500L | super.aLong208 & Long.MIN_VALUE;
		Static187.aClass176_10.method4772(this);
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(B)V")
	public void method4140() {
		super.aLong208 |= Long.MIN_VALUE;
		if (this.method4144() == 0L) {
			Static54.aClass176_5.method4772(this);
		}
	}

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(B)I")
	public int method4142() {
		return (int) super.aLong218;
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)I")
	public int method4143() {
		return (int) (super.aLong218 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "(I)J")
	public long method4144() {
		return Long.MAX_VALUE & super.aLong208;
	}
}
