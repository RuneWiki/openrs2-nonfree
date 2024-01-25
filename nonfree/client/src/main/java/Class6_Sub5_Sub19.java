import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public final class Class6_Sub5_Sub19 extends Class6_Sub5 {

	@OriginalMember(owner = "client!kw", name = "C", descriptor = "I")
	public int anInt6195;

	@OriginalMember(owner = "client!kw", name = "D", descriptor = "Ljava/lang/String;")
	public String aString68;

	@OriginalMember(owner = "client!kw", name = "F", descriptor = "I")
	public int anInt6197;

	@OriginalMember(owner = "client!kw", name = "G", descriptor = "I")
	public int anInt6198;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(II)V")
	public Class6_Sub5_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong278 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)J")
	public long method5173() {
		return Long.MAX_VALUE & super.aLong254;
	}

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V")
	public void method5174() {
		super.aLong254 = Static582.method8056() + 500L | Long.MIN_VALUE & super.aLong254;
		Static537.aClass231_12.method6048(this);
	}

	@OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)I")
	public int method5176() {
		return (int) super.aLong278;
	}

	@OriginalMember(owner = "client!kw", name = "f", descriptor = "(B)I")
	public int method5178() {
		return (int) (super.aLong278 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!kw", name = "g", descriptor = "(B)V")
	public void method5179() {
		super.aLong254 |= Long.MIN_VALUE;
		if (this.method5173() == 0L) {
			Static625.aClass231_13.method6048(this);
		}
	}
}
