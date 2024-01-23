import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class1_Sub3_Sub22 extends Class1_Sub3 {

	@OriginalMember(owner = "client!vd", name = "I", descriptor = "Ljava/lang/String;")
	public String aString417;

	@OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
	public int anInt5843;

	@OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
	public int anInt5849;

	@OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
	public int anInt5852;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong247 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	public void method4464() {
		this.aLong237 = this.aLong237 & Long.MIN_VALUE | Static258.method3967() + 500L;
		Static107.aClass108_7.method2753(this);
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)I")
	public int method4466() {
		return (int) this.aLong247;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V")
	public void method4468() {
		this.aLong237 |= Long.MIN_VALUE;
		if (this.method4470() == 0L) {
			Static275.aClass108_14.method2753(this);
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)J")
	public long method4470() {
		return this.aLong237 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)I")
	public int method4472() {
		return (int) (this.aLong247 >>> 32 & 0xFFL);
	}
}
