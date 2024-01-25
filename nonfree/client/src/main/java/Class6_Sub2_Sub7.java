import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class6_Sub2_Sub7 extends Class6_Sub2 {

	@OriginalMember(owner = "client!jq", name = "G", descriptor = "Ljava/lang/String;")
	public String aString28;

	@OriginalMember(owner = "client!jq", name = "H", descriptor = "I")
	public int anInt3744;

	@OriginalMember(owner = "client!jq", name = "J", descriptor = "I")
	public int anInt3746;

	@OriginalMember(owner = "client!jq", name = "N", descriptor = "I")
	public int anInt3749;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(II)V")
	public Class6_Sub2_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong229 = (long) arg1 | (long) arg0 << 32;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
	public void method3084() {
		super.aLong225 = Long.MIN_VALUE & super.aLong225 | Static449.method6552() + 500L;
		Static79.aClass170_2.method4001(this);
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(I)J")
	public long method3087() {
		return super.aLong225 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!jq", name = "e", descriptor = "(B)V")
	public void method3088() {
		super.aLong225 |= Long.MIN_VALUE;
		if (this.method3087() == 0L) {
			Static96.aClass170_6.method4001(this);
		}
	}

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "(B)I")
	public int method3089() {
		return (int) super.aLong229;
	}

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "(Z)I")
	public int method3090() {
		return (int) (super.aLong229 >>> 32 & 0xFFL);
	}
}
