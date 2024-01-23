import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class4_Sub2_Sub21 extends Class4_Sub2 {

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "I")
	public int anInt5492;

	@OriginalMember(owner = "client!wl", name = "v", descriptor = "I")
	public int anInt5495;

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "Ljava/lang/String;")
	public String aString192;

	@OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
	public int anInt5502;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(II)V")
	public Class4_Sub2_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong200 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)I")
	public int method4359() {
		return (int) (this.aLong200 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)V")
	public void method4360() {
		this.aLong201 |= Long.MIN_VALUE;
		if (this.method4364() == 0L) {
			Static115.aClass177_5.method4274(this);
		}
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V")
	public void method4361() {
		this.aLong201 = this.aLong201 & Long.MIN_VALUE | Static133.method2163() + 500L;
		Static75.aClass177_3.method4274(this);
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)I")
	public int method4362() {
		return (int) this.aLong200;
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)J")
	public long method4364() {
		return Long.MAX_VALUE & this.aLong201;
	}
}
