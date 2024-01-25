import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class3_Sub7_Sub11 extends Class3_Sub7 {

	@OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
	public int anInt3053;

	@OriginalMember(owner = "client!jr", name = "y", descriptor = "I")
	public int anInt3054;

	@OriginalMember(owner = "client!jr", name = "z", descriptor = "Ljava/lang/String;")
	public String aString117;

	@OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
	public int anInt3057;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(II)V")
	public Class3_Sub7_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong211 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)V")
	public void method2502() {
		super.aLong198 = Static53.method898() + 500L | Long.MIN_VALUE & super.aLong198;
		Static90.aClass195_1.method5213(this);
	}

	@OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I")
	public int method2504() {
		return (int) super.aLong211;
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(Z)I")
	public int method2506() {
		return (int) (super.aLong211 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(Z)J")
	public long method2507() {
		return super.aLong198 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!jr", name = "g", descriptor = "(I)V")
	public void method2509() {
		super.aLong198 |= Long.MIN_VALUE;
		if (this.method2507() == 0L) {
			Static143.aClass195_11.method5213(this);
		}
	}
}
