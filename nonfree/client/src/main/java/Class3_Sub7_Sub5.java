import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public final class Class3_Sub7_Sub5 extends Class3_Sub7 {

	@OriginalMember(owner = "client!daa", name = "t", descriptor = "I")
	public int anInt1720;

	@OriginalMember(owner = "client!daa", name = "w", descriptor = "I")
	public int anInt1723;

	@OriginalMember(owner = "client!daa", name = "A", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!daa", name = "D", descriptor = "I")
	public int anInt1728;

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(II)V")
	public Class3_Sub7_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong277 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)I")
	public int method1472() {
		return (int) super.aLong277;
	}

	@OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V")
	public void method1473() {
		super.aLong251 = Static191.method3071() + 500L | super.aLong251 & Long.MIN_VALUE;
		Static285.aClass363_42.method8413(this);
	}

	@OriginalMember(owner = "client!daa", name = "f", descriptor = "(I)V")
	public void method1474() {
		super.aLong251 |= Long.MIN_VALUE;
		if (this.method1478() == 0L) {
			Static193.aClass363_57.method8413(this);
		}
	}

	@OriginalMember(owner = "client!daa", name = "b", descriptor = "(B)I")
	public int method1477() {
		return (int) (super.aLong277 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!daa", name = "c", descriptor = "(B)J")
	public long method1478() {
		return Long.MAX_VALUE & super.aLong251;
	}
}
