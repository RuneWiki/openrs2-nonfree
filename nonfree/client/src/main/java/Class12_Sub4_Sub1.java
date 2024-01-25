import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class12_Sub4_Sub1 extends Class12_Sub4 {

	@OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
	public int anInt803;

	@OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!bk", name = "E", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(II)V")
	public Class12_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		super.aLong248 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)J")
	public long method818() {
		return super.aLong247 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	public void method820() {
		super.aLong247 |= Long.MIN_VALUE;
		if (this.method818() == 0L) {
			Static526.aClass280_10.method6894(this);
		}
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)I")
	public int method821() {
		return (int) (super.aLong248 >>> 32 & 0xFFL);
	}

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "(I)I")
	public int method822() {
		return (int) super.aLong248;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
	public void method823() {
		super.aLong247 = super.aLong247 & Long.MIN_VALUE | Static76.method1679() + 500L;
		Static186.aClass280_7.method6894(this);
	}
}
