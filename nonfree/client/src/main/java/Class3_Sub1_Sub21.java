import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public final class Class3_Sub1_Sub21 extends Class3_Sub1 {

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
	public int anInt10489;

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
	public int anInt10490;

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "Ljava/lang/String;")
	public String aString114;

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
	public int anInt10491;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong277 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)I")
	public int method8625() {
		return (int) super.aLong277;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)J")
	public long method8627() {
		return super.aLong275 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)V")
	public void method8628() {
		super.aLong275 = super.aLong275 & Long.MIN_VALUE | Static444.method6719() + 500L;
		Static614.aClass30_13.method779(this);
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)I")
	public int method8630() {
		return (int) (super.aLong277 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V")
	public void method8631() {
		super.aLong275 |= Long.MIN_VALUE;
		if (this.method8627() == 0L) {
			Static532.aClass30_11.method779(this);
		}
	}
}
