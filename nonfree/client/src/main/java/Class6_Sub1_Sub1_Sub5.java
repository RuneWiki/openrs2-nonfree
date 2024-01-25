import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class6_Sub1_Sub1_Sub5 extends Class6_Sub1_Sub1 {

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "Lclient!tq;")
	private Class6_Sub8 aClass6_Sub8_6;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "I")
	private int anInt6672 = 0;

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
	private int anInt6681 = 0;

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
	private int anInt6683 = 0;

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
	private final int anInt6686 = -1;

	@OriginalMember(owner = "client!od", name = "mb", descriptor = "I")
	private int anInt6690 = 0;

	@OriginalMember(owner = "client!od", name = "nb", descriptor = "I")
	private int anInt6691 = 0;

	@OriginalMember(owner = "client!od", name = "rb", descriptor = "Z")
	public boolean aBoolean522 = false;

	@OriginalMember(owner = "client!od", name = "db", descriptor = "Z")
	private boolean aBoolean521 = false;

	@OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
	public final int anInt6687;

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
	private final int anInt6682;

	@OriginalMember(owner = "client!od", name = "O", descriptor = "Lclient!dr;")
	private Class84 aClass84_2;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class6_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt6690 = arg12;
		this.anInt6687 = arg1 + arg2;
		this.anInt6682 = arg0;
		@Pc(53) Class167 local53 = Static215.aClass33_1.method587(this.anInt6682);
		@Pc(56) int local56 = local53.anInt4374;
		if (local56 == -1) {
			this.aBoolean522 = true;
		} else {
			this.aClass84_2 = Static116.aClass140_2.method3287(local56);
			this.aBoolean522 = false;
		}
		if (arg2 == this.anInt6687) {
			Static434.method4018(super.aByte112, this.aClass84_2, super.anInt8761, super.anInt8764, this.anInt6672, false);
		}
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)I")
	@Override
	public int method7328() {
		return this.anInt6683;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public void method5596(@OriginalArg(1) int arg0) {
		if (this.aBoolean522) {
			return;
		}
		this.anInt6681 += arg0;
		while (this.aClass84_2.anIntArray110[this.anInt6672] < this.anInt6681) {
			this.anInt6681 -= this.aClass84_2.anIntArray110[this.anInt6672];
			this.anInt6672++;
			if (this.aClass84_2.anIntArray108.length <= this.anInt6672) {
				this.aBoolean522 = true;
				break;
			}
		}
		if (!this.aBoolean522) {
			Static434.method4018(super.aByte112, this.aClass84_2, super.anInt8761, super.anInt8764, this.anInt6672, false);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIBLclient!r;Lclient!lo;II)V")
	@Override
	public void method7325(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2, @OriginalArg(4) Class6_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass6_Sub8_6 != null) {
			this.aClass6_Sub8_6.method7159();
		}
	}

	@OriginalMember(owner = "client!od", name = "h", descriptor = "(B)Z")
	@Override
	public boolean method7330() {
		return false;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)I")
	@Override
	public int method7319(@OriginalArg(0) int arg0) {
		if (arg0 != -22496) {
			this.method7330();
		}
		return this.anInt6691;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
	public void method5597() {
		if (this.aClass6_Sub8_6 != null) {
			this.aClass6_Sub8_6.method7159();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILclient!r;)Lclient!da;")
	private Class66 method5598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class100 arg2) {
		@Pc(8) Class167 local8 = Static215.aClass33_1.method587(arg0);
		@Pc(13) Class67 local13 = Static569.aClass67Array8[super.aByte112];
		@Pc(28) Class67 local28 = super.aByte111 >= 3 ? null : Static569.aClass67Array8[super.aByte111 + 1];
		return this.aBoolean522 ? local8.method3645(super.anInt8761, arg1, -1, super.anInt8759, local13, -1, local28, 0, arg2, Static116.aClass140_2, super.anInt8764) : local8.method3645(super.anInt8761, arg1, this.anInt6686, super.anInt8759, local13, this.anInt6672, local28, this.anInt6681, arg2, Static116.aClass140_2, super.anInt8764);
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(B)Z")
	@Override
	public boolean method7318() {
		return this.aBoolean521;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method7329() {
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!r;)Lclient!og;")
	@Override
	public Class6_Sub5 method7317(@OriginalArg(1) Class100 arg0) {
		@Pc(20) Class66 local20 = this.method5598(this.anInt6682, (this.anInt6690 == 0 ? 0 : 5) | 0x800, arg0);
		if (local20 == null) {
			return null;
		}
		if (this.anInt6690 != 0) {
			local20.M(this.anInt6690 * 2048);
		}
		@Pc(41) Class68 local41 = arg0.method6222();
		local41.NA(super.anInt8761, super.anInt8759, super.anInt8764);
		this.method5600(local41, local20, arg0);
		if (Static338.aBoolean493) {
			local20.method7556(local41, null, Static401.anInt6991, 0);
		} else {
			local20.method7558(local41, null, 0);
		}
		if (this.aClass6_Sub8_6 != null) {
			@Pc(77) Class164 local77 = this.aClass6_Sub8_6.method7161();
			if (Static338.aBoolean493) {
				arg0.method6257(local77, Static401.anInt6991);
			} else {
				arg0.method6193(local77);
			}
		}
		this.aBoolean521 = local20.LA();
		this.anInt6683 = local20.J();
		this.anInt6691 = local20.RA();
		return null;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
	@Override
	public void method7322() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!r;I)Z")
	@Override
	public boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!r;I)Lclient!sd;")
	@Override
	public Class297 method7326(@OriginalArg(0) Class100 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!q;Lclient!da;BLclient!r;)V")
	private void method5600(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) Class100 arg2) {
		arg1.method7552(arg0);
		@Pc(9) Class139[] local9 = arg1.method7550();
		@Pc(20) Class270[] local20 = arg1.method7561();
		if ((this.aClass6_Sub8_6 == null || this.aClass6_Sub8_6.aBoolean660) && (local9 != null || local20 != null)) {
			this.aClass6_Sub8_6 = Static518.method7156(Static412.anInt575, true);
		}
		if (this.aClass6_Sub8_6 != null) {
			this.aClass6_Sub8_6.method7149(arg2, (long) Static412.anInt575, local9, local20);
			this.aClass6_Sub8_6.method7160(super.aByte112, super.aShort85, super.aShort86, super.aShort83, super.aShort84);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(ZLclient!r;)V")
	@Override
	public void method7323(@OriginalArg(1) Class100 arg0) {
		@Pc(19) Class66 local19 = this.method5598(this.anInt6682, 0, arg0);
		if (local19 != null) {
			@Pc(24) Class68 local24 = arg0.method6222();
			local24.NA(super.anInt8761, super.anInt8759, super.anInt8764);
			this.method5600(local24, local19, arg0);
		}
	}
}
