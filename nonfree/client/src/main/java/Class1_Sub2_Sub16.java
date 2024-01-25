import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
	public int anInt7482;

	@OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
	public int anInt7487;

	@OriginalMember(owner = "client!rs", name = "G", descriptor = "I")
	public int anInt7491;

	@OriginalMember(owner = "client!rs", name = "L", descriptor = "Ljava/lang/String;")
	public String aString185;

	@OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong251 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)V")
	public void method6693() {
		super.aLong228 |= Long.MIN_VALUE;
		if (this.method6702() == 0L) {
			Static22.aClass259_1.method6656(this);
		}
	}

	@OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)I")
	public int method6698() {
		return (int) super.aLong251;
	}

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "(I)I")
	public int method6699() {
		return (int) (super.aLong251 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "(I)V")
	public void method6700() {
		super.aLong228 = Static110.method2222() + 500L | super.aLong228 & Long.MIN_VALUE;
		Static412.aClass259_9.method6656(this);
	}

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "(I)J")
	public long method6702() {
		return super.aLong228 & Long.MAX_VALUE;
	}
}
