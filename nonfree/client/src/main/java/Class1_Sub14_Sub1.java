import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class1_Sub14_Sub1 extends Class1_Sub14 {

	@OriginalMember(owner = "client!ji", name = "Jb", descriptor = "I")
	private int anInt3036;

	@OriginalMember(owner = "client!ji", name = "Kb", descriptor = "Lclient!wh;")
	private Class192 aClass192_1;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V")
	public Class1_Sub14_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "(II)I")
	public int method2251(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = 8 - (this.anInt3036 & 0x7);
		@Pc(19) int local19 = this.anInt3036 >> 3;
		@Pc(21) int local21 = 0;
		this.anInt3036 += arg0;
		while (arg0 > local14) {
			local21 += (Static250.anIntArray470[local14] & this.aByteArray55[local19++]) << arg0 - local14;
			arg0 -= local14;
			local14 = 8;
		}
		if (local14 == arg0) {
			local21 += Static250.anIntArray470[local14] & this.aByteArray55[local19];
		} else {
			local21 += this.aByteArray55[local19] >> local14 - arg0 & Static250.anIntArray470[arg0];
		}
		return local21;
	}

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "(II)V")
	public void method2252(@OriginalArg(0) int arg0) {
		this.aByteArray55[this.anInt3000++] = (byte) (this.aClass192_1.method4689() + arg0);
	}

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "(II)I")
	public int method2253(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt3036;
	}

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "(I)V")
	public void method2255() {
		this.anInt3036 = this.anInt3000 * 8;
	}

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "(I)V")
	public void method2256() {
		this.anInt3000 = (this.anInt3036 + 7) / 8;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "([II)V")
	public void method2258(@OriginalArg(0) int[] arg0) {
		this.aClass192_1 = new Class192(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B[BII)V")
	public void method2260(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			arg0[local15] = (byte) (this.aByteArray55[this.anInt3000++] - this.aClass192_1.method4689());
		}
	}

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "(I)I")
	public int method2261() {
		return this.aByteArray55[this.anInt3000++] - this.aClass192_1.method4689() & 0xFF;
	}
}
