import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class1_Sub5_Sub6 extends Class1_Sub5 {

	@OriginalMember(owner = "client!wa", name = "J", descriptor = "Lclient!an;")
	private Class10_Sub1 aClass10_Sub1_6;

	@OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
	private int anInt6320 = -32768;

	@OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
	private int anInt6318 = 0;

	@OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
	private final int anInt6313 = -1;

	@OriginalMember(owner = "client!wa", name = "O", descriptor = "I")
	private int anInt6328 = 0;

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "Z")
	public boolean aBoolean447 = false;

	@OriginalMember(owner = "client!wa", name = "R", descriptor = "I")
	public final int anInt6330;

	@OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
	private final int anInt6323;

	@OriginalMember(owner = "client!wa", name = "S", descriptor = "Lclient!qp;")
	private Class202 aClass202_3;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class1_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt6330 = arg1 + arg2;
		this.anInt6323 = arg0;
		@Pc(41) int local41 = Static149.aClass173_5.method3800(this.anInt6323).anInt863;
		if (local41 == -1) {
			this.aBoolean447 = true;
		} else {
			this.aBoolean447 = false;
			this.aClass202_3 = Static36.aClass236_1.method5396(local41);
		}
		if (this.anInt6330 == arg2) {
			Static169.method2965(this.anInt6318, false, super.aByte69, super.anInt6390, this.aClass202_3, super.anInt6386);
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!n;Lclient!vc;B)V")
	private void method5489(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class63 arg1) {
		@Pc(16) Class176[] local16 = arg0.method5123();
		@Pc(19) Class145[] local19 = arg0.method5156();
		if ((this.aClass10_Sub1_6 == null || this.aClass10_Sub1_6.aBoolean27) && (local16 != null || local19 != null)) {
			this.aClass10_Sub1_6 = new Class10_Sub1(Static253.anInt4469);
		}
		if (this.aClass10_Sub1_6 != null) {
			this.aClass10_Sub1_6.method224(arg1, (long) Static253.anInt4469, local16, local19);
			this.aClass10_Sub1_6.method228(super.aByte69, super.aShort96, super.aShort94, super.aShort97, super.aShort95);
		}
	}

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "(B)I")
	@Override
	public int method5540() {
		return this.anInt6320;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!vc;B)Lclient!n;")
	private Class66 method5490(@OriginalArg(0) int arg0, @OriginalArg(1) Class63 arg1) {
		@Pc(18) Class34 local18 = Static149.aClass173_5.method3800(this.anInt6323);
		return this.aBoolean447 ? local18.method735(-1, arg0, -1, Static36.aClass236_1, arg1, 0) : local18.method735(this.anInt6318, arg0, this.anInt6313, Static36.aClass236_1, arg1, this.anInt6328);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public void method5491() {
		if (this.aClass10_Sub1_6 != null) {
			this.aClass10_Sub1_6.method226();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	@Override
	public Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0) {
		@Pc(9) Class66 local9 = this.method5490(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class44 local16 = arg0.method2024();
		local16.method3541(super.anInt6390, super.anInt6387, super.anInt6386);
		if (this.aClass10_Sub1_6 == null) {
			local9.method5126(local16, null, 0);
		} else {
			@Pc(38) Class186 local38 = this.aClass10_Sub1_6.method229();
			arg0.method2055(local9, local38, local16, null);
		}
		this.anInt6320 = local9.method5140();
		this.method5489(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!wa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass10_Sub1_6 != null) {
			this.aClass10_Sub1_6.method226();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	@Override
	public void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!vc;II)Z")
	@Override
	public boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5641() {
		return false;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(ZLclient!vc;)V")
	@Override
	public void method5644(@OriginalArg(1) Class63 arg0) {
		@Pc(9) Class66 local9 = this.method5490(0, arg0);
		if (local9 != null) {
			this.method5489(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(B)V")
	@Override
	public void method5643() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V")
	public void method5492(@OriginalArg(0) int arg0) {
		if (this.aBoolean447) {
			return;
		}
		this.anInt6328 += arg0;
		while (this.aClass202_3.anIntArray973[this.anInt6318] < this.anInt6328) {
			this.anInt6328 -= this.aClass202_3.anIntArray973[this.anInt6318];
			this.anInt6318++;
			if (this.anInt6318 >= this.aClass202_3.anIntArray974.length) {
				this.aBoolean447 = true;
				break;
			}
		}
		if (!this.aBoolean447) {
			Static169.method2965(this.anInt6318, false, super.aByte69, super.anInt6390, this.aClass202_3, super.anInt6386);
		}
	}
}
