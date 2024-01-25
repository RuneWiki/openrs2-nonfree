import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public final class Class14_Sub2_Sub9 extends Class14_Sub2 {

	@OriginalMember(owner = "client!hw", name = "y", descriptor = "I")
	public int anInt4592;

	@OriginalMember(owner = "client!hw", name = "E", descriptor = "I")
	public int anInt4595;

	@OriginalMember(owner = "client!hw", name = "v", descriptor = "Ljava/lang/String;")
	public String aString55;

	@OriginalMember(owner = "client!hw", name = "u", descriptor = "I")
	public int anInt4599;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(IJ)V")
	public Class14_Sub2_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		super.aLong324 = (long) arg0 << 56 | arg1;
	}

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "(I)V")
	public void method4001() {
		super.aLong308 = Static26.method382() + 500L | super.aLong308 & Long.MIN_VALUE;
		Static4.aClass269_1.method6493(this);
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)I")
	public int method4002() {
		return (int) (super.aLong324 >>> 56 & 0xFFL);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)J")
	public long method4003() {
		return Long.MAX_VALUE & super.aLong308;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V")
	public void method4004() {
		super.aLong308 |= Long.MIN_VALUE;
		if (this.method4003() == 0L) {
			Static676.aClass269_181.method6493(this);
		}
	}

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "(I)J")
	public long method4006() {
		return super.aLong324 & 0xFFFFFFFFFFFFFFL;
	}
}
