import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class6_Sub4_Sub6 extends Class6_Sub4 {

	@OriginalMember(owner = "client!ht", name = "u", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "I")
	public int anInt4399;

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
	public int anInt4403;

	@OriginalMember(owner = "client!ht", name = "B", descriptor = "I")
	public int anInt4405;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(II)V")
	public Class6_Sub4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong252 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)I")
	public int method3825() {
		return (int) super.aLong252;
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(B)V")
	public void method3826() {
		super.aLong247 |= Long.MIN_VALUE;
		if (this.method3827() == 0L) {
			Static227.aClass143_2.method3835(this);
		}
	}

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "(B)J")
	public long method3827() {
		return super.aLong247 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!ht", name = "g", descriptor = "(B)V")
	public void method3828() {
		super.aLong247 = super.aLong247 & Long.MIN_VALUE | Static174.method3502() + 500L;
		Static279.aClass143_3.method3835(this);
	}

	@OriginalMember(owner = "client!ht", name = "i", descriptor = "(B)I")
	public int method3830() {
		return (int) (super.aLong252 >>> 32 & 0xFFL);
	}
}
