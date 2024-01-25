import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class4_Sub20_Sub1 extends Class4_Sub20 {

	@OriginalMember(owner = "client!iu", name = "Mb", descriptor = "Lclient!ph;")
	private Class195 aClass195_1;

	@OriginalMember(owner = "client!iu", name = "Sb", descriptor = "I")
	private int anInt3628;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(I)V")
	public Class4_Sub20_Sub1(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "(I)Z")
	public boolean method3234() {
		@Pc(21) int local21 = super.aByteArray77[super.anInt5526] - this.aClass195_1.method4717() & 0xFF;
		return local21 >= 128;
	}

	@OriginalMember(owner = "client!iu", name = "z", descriptor = "(I)V")
	public void method3235() {
		this.anInt3628 = super.anInt5526 * 8;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I[I)V")
	public void method3236(@OriginalArg(1) int[] arg0) {
		this.aClass195_1 = new Class195(arg0);
	}

	@OriginalMember(owner = "client!iu", name = "A", descriptor = "(I)I")
	public int method3237() {
		@Pc(24) int local24 = super.aByteArray77[super.anInt5526++] - this.aClass195_1.method4720() & 0xFF;
		return local24 < 128 ? local24 : (super.aByteArray77[super.anInt5526++] - this.aClass195_1.method4720() & 0xFF) + (local24 - 128 << 8);
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(ZI)V")
	public void method3238(@OriginalArg(1) int arg0) {
		super.aByteArray77[super.anInt5526++] = (byte) (arg0 + this.aClass195_1.method4720());
	}

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "(II)I")
	public int method3239(@OriginalArg(1) int arg0) {
		return arg0 * 8 - this.anInt3628;
	}

	@OriginalMember(owner = "client!iu", name = "B", descriptor = "(I)V")
	public void method3240() {
		super.anInt5526 = (this.anInt3628 + 7) / 8;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II[BZ)V")
	public void method3244(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			arg1[local3] = (byte) (super.aByteArray77[super.anInt5526++] - this.aClass195_1.method4720());
		}
	}

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "(II)I")
	public int method3245(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = this.anInt3628 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt3628 & 0x7);
		this.anInt3628 += arg0;
		@Pc(30) int local30 = 0;
		while (local18 < arg0) {
			local30 += (super.aByteArray77[local10++] & Static410.anIntArray578[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (local18 == arg0) {
			local30 += Static410.anIntArray578[local18] & super.aByteArray77[local10];
		} else {
			local30 += super.aByteArray77[local10] >> local18 - arg0 & Static410.anIntArray578[arg0];
		}
		return local30;
	}
}
