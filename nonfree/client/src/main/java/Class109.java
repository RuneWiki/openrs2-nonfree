import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class109 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public int anInt2970;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "I")
	public int anInt2973;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	public int anInt2974;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "I")
	public int anInt2975;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	public int anInt2977;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "B")
	private byte aByte15;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class109() {
	}

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class109(@OriginalArg(0) Class1_Sub18 arg0) {
		this.aByte15 = arg0.method3082();
		this.anInt2974 = arg0.method3107();
		this.anInt2977 = arg0.method3074();
		this.anInt2973 = arg0.method3074();
		this.anInt2970 = arg0.method3074();
		this.anInt2975 = arg0.method3074();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)I")
	public int method2475() {
		return this.aByte15 & 0x7;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)I")
	public int method2476() {
		return (this.aByte15 & 0x8) == 8 ? 1 : 0;
	}
}
