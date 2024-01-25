import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class14 {

	@OriginalMember(owner = "client!as", name = "e", descriptor = "I")
	public int anInt302;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "I")
	public int anInt305;

	@OriginalMember(owner = "client!as", name = "i", descriptor = "I")
	public int anInt306;

	@OriginalMember(owner = "client!as", name = "k", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "I")
	public int anInt311;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	public Class14() {
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lclient!lk;)V")
	public Class14(@OriginalArg(0) Class2_Sub13 arg0) {
		this.aByte5 = arg0.method4217();
		this.anInt309 = arg0.method4245();
		this.anInt306 = arg0.method4239();
		this.anInt311 = arg0.method4239();
		this.anInt305 = arg0.method4239();
		this.anInt302 = arg0.method4239();
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
	public int method372() {
		return (this.aByte5 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)I")
	public int method374() {
		return this.aByte5 & 0x7;
	}
}
