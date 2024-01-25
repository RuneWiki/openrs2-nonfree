import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class5_Sub15_Sub2 extends Class5_Sub15 {

	@OriginalMember(owner = "client!uu", name = "Pb", descriptor = "I")
	private int anInt7079;

	@OriginalMember(owner = "client!uu", name = "Ub", descriptor = "Lclient!ot;")
	private Class186 aClass186_1;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(I)V")
	public Class5_Sub15_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "([BIII)V")
	public void method5604(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1; local7++) {
			arg0[local7] = (byte) (super.aByteArray93[super.anInt7013++] - this.aClass186_1.method3816());
		}
	}

	@OriginalMember(owner = "client!uu", name = "v", descriptor = "(I)V")
	public void method5605() {
		this.anInt7079 = super.anInt7013 * 8;
	}

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "(IZ)I")
	public int method5608(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt7079;
	}

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "(II)I")
	public int method5610(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = this.anInt7079 >> 3;
		@Pc(23) int local23 = 8 - (this.anInt7079 & 0x7);
		this.anInt7079 += arg0;
		@Pc(31) int local31 = 0;
		while (arg0 > local23) {
			local31 += (Static111.anIntArray88[local23] & super.aByteArray93[local15++]) << arg0 - local23;
			arg0 -= local23;
			local23 = 8;
		}
		if (local23 == arg0) {
			local31 += super.aByteArray93[local15] & Static111.anIntArray88[local23];
		} else {
			local31 += super.aByteArray93[local15] >> local23 - arg0 & Static111.anIntArray88[arg0];
		}
		return local31;
	}

	@OriginalMember(owner = "client!uu", name = "w", descriptor = "(I)I")
	public int method5611() {
		@Pc(29) int local29 = super.aByteArray93[super.anInt7013++] - this.aClass186_1.method3816() & 0xFF;
		return local29 < 128 ? local29 : (local29 - 128 << 8) + (super.aByteArray93[super.anInt7013++] - this.aClass186_1.method3816() & 0xFF);
	}

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "(B)V")
	public void method5612() {
		super.anInt7013 = (this.anInt7079 + 7) / 8;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I[I)V")
	public void method5613(@OriginalArg(1) int[] arg0) {
		this.aClass186_1 = new Class186(arg0);
	}

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "(II)V")
	public void method5614(@OriginalArg(0) int arg0) {
		super.aByteArray93[super.anInt7013++] = (byte) (this.aClass186_1.method3816() + arg0);
	}

	@OriginalMember(owner = "client!uu", name = "x", descriptor = "(I)Z")
	public boolean method5615() {
		@Pc(17) int local17 = super.aByteArray93[super.anInt7013] - this.aClass186_1.method3819() & 0xFF;
		return local17 >= 128;
	}
}
