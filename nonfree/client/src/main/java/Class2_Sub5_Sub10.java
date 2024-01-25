import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class2_Sub5_Sub10 extends Class2_Sub5 {

	@OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
	public int anInt5245;

	@OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
	public int anInt5246;

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "Ljava/lang/String;")
	public String aString52;

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
	public int anInt5255;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(II)V")
	public Class2_Sub5_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong287 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)J")
	public long method4386() {
		return super.aLong283 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public void method4387() {
		super.aLong283 = Static438.method6517() + 500L | Long.MIN_VALUE & super.aLong283;
		Static81.aClass175_3.method4287(this);
	}

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "(I)I")
	public int method4388() {
		return (int) super.aLong287;
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)I")
	public int method4389() {
		return (int) (super.aLong287 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "(I)V")
	public void method4393() {
		super.aLong283 |= Long.MIN_VALUE;
		if (this.method4386() == 0L) {
			Static627.aClass175_13.method4287(this);
		}
	}
}
