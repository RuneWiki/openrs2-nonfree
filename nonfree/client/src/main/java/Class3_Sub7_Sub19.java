import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public final class Class3_Sub7_Sub19 extends Class3_Sub7 {

	@OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
	public int anInt9377;

	@OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
	public int anInt9381;

	@OriginalMember(owner = "client!uf", name = "O", descriptor = "Ljava/lang/String;")
	public String aString244;

	@OriginalMember(owner = "client!uf", name = "P", descriptor = "I")
	public int anInt9383;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(II)V")
	public Class3_Sub7_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong262 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)I")
	public int method7359() {
		return (int) (super.aLong262 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	public void method7363() {
		super.aLong263 |= Long.MIN_VALUE;
		if (this.method7365() == 0L) {
			Static477.aClass49_9.method1455(this);
		}
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	public void method7364() {
		super.aLong263 = Long.MIN_VALUE & super.aLong263 | Static96.method2000() + 500L;
		Static4.aClass49_1.method1455(this);
	}

	@OriginalMember(owner = "client!uf", name = "g", descriptor = "(I)J")
	public long method7365() {
		return super.aLong263 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)I")
	public int method7367() {
		return (int) super.aLong262;
	}
}
