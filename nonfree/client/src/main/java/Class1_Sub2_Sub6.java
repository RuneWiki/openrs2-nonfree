import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
	public int anInt1557;

	@OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
	public int anInt1558;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
	public int anInt1565;

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "Ljava/lang/String;")
	public String aString50;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(II)V")
	public Class1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aLong201 = (long) arg0 << 32 | (long) arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
	public void method1189() {
		this.aLong198 = Static294.method4792() + 500L | this.aLong198 & Long.MIN_VALUE;
		Static18.aClass104_1.method3145(this);
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)V")
	public void method1192() {
		this.aLong198 |= Long.MIN_VALUE;
		if (this.method1194() == 0L) {
			Static80.aClass104_6.method3145(this);
		}
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)J")
	public long method1194() {
		return this.aLong198 & Long.MAX_VALUE;
	}

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "(I)I")
	public int method1195() {
		return (int) this.aLong201;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(Z)I")
	public int method1196() {
		return (int) (this.aLong201 >>> 32 & 0xFFL);
	}
}
