import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class177 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "I")
	public int anInt5515;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "I")
	public int anInt5516;

	@OriginalMember(owner = "client!we", name = "i", descriptor = "I")
	public int anInt5520;

	@OriginalMember(owner = "client!we", name = "j", descriptor = "B")
	private byte aByte24;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	public int anInt5521;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "I")
	public int anInt5524;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
	public Class177() {
	}

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class177(@OriginalArg(0) Class1_Sub11 arg0) {
		this.aByte24 = arg0.method2663();
		this.anInt5515 = arg0.method2691();
		this.anInt5521 = arg0.method2643();
		this.anInt5516 = arg0.method2643();
		this.anInt5520 = arg0.method2643();
		this.anInt5524 = arg0.method2643();
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(I)I")
	public int method4383() {
		return this.aByte24 & 0x7;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I")
	public int method4387() {
		return (this.aByte24 & 0x8) == 8 ? 1 : 0;
	}
}
