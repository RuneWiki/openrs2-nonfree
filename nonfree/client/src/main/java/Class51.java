import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class51 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
	public int anInt1587;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
	public int anInt1588;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	public int anInt1592;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
	public int anInt1593;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "B")
	private byte aByte31;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
	public int anInt1598;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class51() {
	}

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!io;)V")
	public Class51(@OriginalArg(0) Class1_Sub20 arg0) {
		this.aByte31 = arg0.method4432();
		this.anInt1588 = arg0.method4426();
		this.anInt1593 = arg0.method4371();
		this.anInt1587 = arg0.method4371();
		this.anInt1592 = arg0.method4371();
		this.anInt1598 = arg0.method4371();
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)I")
	public int method1448() {
		return this.aByte31 & 0x7;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)I")
	public int method1450() {
		return (this.aByte31 & 0x8) == 8 ? 1 : 0;
	}
}
