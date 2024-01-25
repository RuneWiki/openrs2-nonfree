import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class31_Sub2_Sub2 extends Class31_Sub2 {

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "Lclient!mq;")
	private Class4_Sub7 aClass4_Sub7_3;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	private final int anInt1575 = -1;

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "I")
	private int anInt1572 = 0;

	@OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
	private int anInt1581 = 0;

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
	private int anInt1586 = 0;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
	private int anInt1583 = -32768;

	@OriginalMember(owner = "client!dc", name = "V", descriptor = "Z")
	public boolean aBoolean91 = false;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
	public final int anInt1590;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
	private final int anInt1591;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
	private final int anInt1589;

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!sm;")
	private Class223 aClass223_1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class31_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt1590 = arg1 + arg2;
		this.anInt1591 = arg0;
		this.anInt1581 = arg12;
		this.anInt1589 = arg4;
		@Pc(49) Class38 local49 = Static67.aClass263_2.method5782(this.anInt1591);
		@Pc(52) int local52 = local49.anInt1014;
		if (local52 == -1) {
			this.aBoolean91 = true;
		} else {
			this.aClass223_1 = Static293.aClass127_1.method2975(local52);
			this.aBoolean91 = false;
		}
		if (arg2 == this.anInt1590) {
			Static172.method2762(this.aClass223_1, super.anInt7300, false, this.anInt1572, super.aByte100, super.anInt7298);
		}
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method5971() {
		return false;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public void method1397(@OriginalArg(1) int arg0) {
		if (this.aBoolean91) {
			return;
		}
		this.anInt1586 += arg0;
		while (this.anInt1586 > this.aClass223_1.anIntArray559[this.anInt1572]) {
			this.anInt1586 -= this.aClass223_1.anIntArray559[this.anInt1572];
			this.anInt1572++;
			if (this.aClass223_1.anIntArray557.length <= this.anInt1572) {
				this.aBoolean91 = true;
				break;
			}
		}
		if (!this.aBoolean91) {
			Static172.method2762(this.aClass223_1, super.anInt7300, false, this.anInt1572, super.aByte100, super.anInt7298);
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public void method1398() {
		if (this.aClass4_Sub7_3 != null) {
			this.aClass4_Sub7_3.method3776();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5970() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub7_3 != null) {
			this.aClass4_Sub7_3.method3776();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!t;Lclient!ya;B)V")
	private void method1399(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class39 arg1) {
		@Pc(10) Class244[] local10 = arg0.method3535();
		@Pc(13) Class57[] local13 = arg0.method3530();
		if ((this.aClass4_Sub7_3 == null || this.aClass4_Sub7_3.aBoolean308) && (local10 != null || local13 != null)) {
			this.aClass4_Sub7_3 = new Class4_Sub7(Static378.anInt4244);
		}
		if (this.aClass4_Sub7_3 != null) {
			this.aClass4_Sub7_3.method3779(arg1, (long) Static378.anInt4244, local10, local13);
			this.aClass4_Sub7_3.method3784(super.aByte100, super.aShort103, super.aShort100, super.aShort102, super.aShort101);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	@Override
	public void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)I")
	@Override
	public int method5976() {
		return this.anInt1583;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ya;Z)V")
	@Override
	public void method5969(@OriginalArg(0) Class39 arg0) {
		@Pc(11) Class105 local11 = this.method1400(this.anInt1591, arg0, 0);
		if (local11 != null) {
			this.method1399(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!ya;I)Lclient!t;")
	private Class105 method1400(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class38 local15 = Static67.aClass263_2.method5782(arg0);
		@Pc(20) Class149 local20 = Static269.aClass149Array2[super.aByte100];
		@Pc(35) Class149 local35 = this.anInt1589 >= 3 ? null : Static269.aClass149Array2[this.anInt1589 + 1];
		return this.aBoolean91 ? local15.method914(Static293.aClass127_1, arg2, super.anInt7298, local35, super.anInt7296, -1, 0, super.anInt7300, local20, arg1, -1) : local15.method914(Static293.aClass127_1, arg2, super.anInt7298, local35, super.anInt7296, this.anInt1572, this.anInt1586, super.anInt7300, local20, arg1, this.anInt1575);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!ya;II)Z")
	@Override
	public boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	@Override
	public Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0) {
		@Pc(18) Class105 local18 = this.method1400(this.anInt1591, arg0, (this.anInt1581 == 0 ? 0 : 5) | 0x800);
		if (local18 == null) {
			return null;
		}
		if (this.anInt1581 != 0) {
			local18.Q(this.anInt1581 * 2048);
		}
		@Pc(34) Class33 local34 = arg0.method4516();
		local34.j(super.anInt7300, super.anInt7296, super.anInt7298);
		if (this.aClass4_Sub7_3 == null) {
			local18.method3534(local34, null, 0);
		} else {
			@Pc(49) Class140 local49 = this.aClass4_Sub7_3.method3777();
			arg0.method4526(local18, local49, local34, null);
		}
		this.anInt1583 = local18.MA();
		this.method1399(local18, arg0);
		return null;
	}
}
