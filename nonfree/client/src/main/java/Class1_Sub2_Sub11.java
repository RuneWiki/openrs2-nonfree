import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public final class Class1_Sub2_Sub11 extends Class1_Sub2 {

	@OriginalMember(owner = "client!md", name = "C", descriptor = "I")
	public int anInt3315;

	@OriginalMember(owner = "client!md", name = "J", descriptor = "I")
	public int anInt3320;

	@OriginalMember(owner = "client!md", name = "M", descriptor = "I")
	public int anInt3323;

	@OriginalMember(owner = "client!md", name = "O", descriptor = "Ljava/lang/String;")
	public String aString190;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong214 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
	public void method2866() {
		this.aLong196 |= Long.MIN_VALUE;
		if ((long) 0 == this.method2867()) {
			Static206.aClass170_8.method4210(this);
		}
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(B)J")
	public long method2867() {
		return Long.MAX_VALUE & this.aLong196;
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)I")
	public int method2868() {
		return (int) this.aLong214;
	}

	@OriginalMember(owner = "client!md", name = "e", descriptor = "(B)I")
	public int method2872() {
		return (int) (this.aLong214 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)V")
	public void method2873() {
		this.aLong196 = Long.MIN_VALUE & this.aLong196 | Static298.method4535() + 500L;
		Static287.aClass170_11.method4210(this);
	}
}
