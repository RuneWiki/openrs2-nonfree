import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class5_Sub5_Sub21 extends Class5_Sub5 {

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
	public int anInt10530;

	@OriginalMember(owner = "client!wj", name = "w", descriptor = "Ljava/lang/String;")
	public String aString106;

	@OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
	public int anInt10533;

	@OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
	public int anInt10537;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II)V")
	public Class5_Sub5_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong278 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(Z)I")
	public int method8955() {
		return (int) super.aLong278;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)I")
	public int method8956() {
		return (int) (super.aLong278 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "(B)V")
	public void method8958() {
		super.aLong274 |= Long.MIN_VALUE;
		if (this.method8963() == 0L) {
			Static547.aClass368_11.method8709(this);
		}
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
	public void method8961() {
		super.aLong274 = super.aLong274 & Long.MIN_VALUE | Static95.method1587() + 500L;
		Static403.aClass368_6.method8709(this);
	}

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "(B)J")
	public long method8963() {
		return super.aLong274 & Long.MAX_VALUE;
	}
}
