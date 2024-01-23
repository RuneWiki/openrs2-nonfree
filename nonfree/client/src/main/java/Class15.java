import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class15 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
	public int anInt384;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	public int anInt390;

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
	public int anInt391;

	@OriginalMember(owner = "client!bh", name = "k", descriptor = "B")
	private byte aByte4;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	public int anInt396;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	public int anInt400;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
	public Class15() {
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class15(@OriginalArg(0) Class1_Sub26 arg0) {
		this.aByte4 = arg0.method2992();
		this.anInt396 = arg0.method2964();
		this.anInt391 = arg0.method2958();
		this.anInt390 = arg0.method2958();
		this.anInt400 = arg0.method2958();
		this.anInt384 = arg0.method2958();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I")
	public int method375() {
		return (this.aByte4 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
	public int method378() {
		return this.aByte4 & 0x7;
	}
}
