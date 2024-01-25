import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class12_Sub2_Sub2_Sub5 extends Class12_Sub2_Sub2 {

	@OriginalMember(owner = "client!vq", name = "T", descriptor = "Lclient!cv;")
	private Class12_Sub4 aClass12_Sub4_8;

	@OriginalMember(owner = "client!vq", name = "S", descriptor = "Z")
	private boolean aBoolean740 = true;

	@OriginalMember(owner = "client!vq", name = "cb", descriptor = "I")
	private int anInt10757 = 0;

	@OriginalMember(owner = "client!vq", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!vq", name = "gb", descriptor = "Z")
	public boolean aBoolean741 = false;

	@OriginalMember(owner = "client!vq", name = "mb", descriptor = "I")
	private int anInt10764 = 0;

	@OriginalMember(owner = "client!vq", name = "ob", descriptor = "I")
	private int anInt10766 = 0;

	@OriginalMember(owner = "client!vq", name = "nb", descriptor = "I")
	private int anInt10765 = 0;

	@OriginalMember(owner = "client!vq", name = "tb", descriptor = "I")
	private final int anInt10771 = -1;

	@OriginalMember(owner = "client!vq", name = "ib", descriptor = "I")
	private final int anInt10761;

	@OriginalMember(owner = "client!vq", name = "ub", descriptor = "I")
	public final int anInt10772;

	@OriginalMember(owner = "client!vq", name = "Z", descriptor = "Lclient!pf;")
	private Class275 aClass275_3;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class12_Sub2_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt10761 = arg0;
		this.anInt10757 = arg12;
		this.anInt10772 = arg2 + arg1;
		@Pc(54) Class60 local54 = Static556.aClass216_2.method5268(this.anInt10761);
		@Pc(57) int local57 = local54.anInt1664;
		if (local57 == -1) {
			this.aBoolean741 = true;
		} else {
			this.aClass275_3 = Static501.aClass191_2.method4322(local57);
			this.aBoolean741 = false;
		}
		if (this.anInt10772 == arg2) {
			Static51.method1064(this, this.aClass275_3, this.lb);
		}
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method9164(@OriginalArg(1) Class137 arg0) {
		@Pc(11) Class80 local11 = this.method8971(this.anInt10761, 0, arg0);
		if (local11 != null) {
			@Pc(20) Class26 local20 = arg0.method7923();
			local20.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
			this.method8975(arg0, local11, local20);
		}
	}

	@OriginalMember(owner = "client!vq", name = "e", descriptor = "(I)I")
	@Override
	public int method9149(@OriginalArg(0) int arg0) {
		if (arg0 != -1760267218) {
			this.method9149(105);
		}
		return this.anInt10765;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZILclient!ha;)Lclient!ka;")
	private Class80 method8971(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(8) Class60 local8 = Static556.aClass216_2.method5268(arg0);
		@Pc(13) Class51 local13 = Static343.aClass51Array1[super.aByte146];
		@Pc(36) Class51 local36 = super.aByte145 >= 3 ? null : Static343.aClass51Array1[super.aByte145 + 1];
		return this.aBoolean741 ? local8.method1445(Static501.aClass191_2, arg2, local13, 0, super.anInt10997, super.anInt11002, -1, local36, super.anInt10998, arg1, -1) : local8.method1445(Static501.aClass191_2, arg2, local13, this.anInt10764, super.anInt10997, super.anInt11002, this.anInt10771, local36, super.anInt10998, arg1, this.lb);
	}

	@OriginalMember(owner = "client!vq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass12_Sub4_8 != null) {
			this.aClass12_Sub4_8.method1614();
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIILclient!ha;)Z")
	@Override
	public boolean method9154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class137 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)I")
	@Override
	public int method9159() {
		return this.anInt10766;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)V")
	public void method8973(@OriginalArg(1) int arg0) {
		if (this.aBoolean741) {
			return;
		}
		this.anInt10764 += arg0;
		while (this.aClass275_3.anIntArray599[this.lb] < this.anInt10764) {
			this.anInt10764 -= this.aClass275_3.anIntArray599[this.lb];
			this.lb++;
			if (this.lb >= this.aClass275_3.anIntArray598.length) {
				this.aBoolean741 = true;
				break;
			}
		}
		if (!this.aBoolean741) {
			Static51.method1064(this, this.aClass275_3, this.lb);
		}
	}

	@OriginalMember(owner = "client!vq", name = "g", descriptor = "(I)V")
	@Override
	public void method9158() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
	public void method8974() {
		if (this.aClass12_Sub4_8 != null) {
			this.aClass12_Sub4_8.method1614();
		}
	}

	@OriginalMember(owner = "client!vq", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9150() {
		return this.aBoolean740;
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "(Z)Z")
	@Override
	public boolean method9161() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ha;I)Lclient!maa;")
	@Override
	public Class12_Sub8 method9151(@OriginalArg(0) Class137 arg0) {
		@Pc(20) Class80 local20 = this.method8971(this.anInt10761, (this.anInt10757 == 0 ? 0 : 5) | 0x800, arg0);
		if (local20 == null) {
			return null;
		}
		if (this.anInt10757 != 0) {
			local20.a(this.anInt10757 * 2048);
		}
		@Pc(36) Class26 local36 = arg0.method7923();
		local36.method6457(super.anInt10998, super.anInt10997, super.anInt11002);
		this.method8975(arg0, local20, local36);
		@Pc(55) Class12_Sub8 local55 = Static291.method4323(false, 1);
		if (Static401.aBoolean511) {
			local20.method6375(local36, local55.aClass12_Sub1Array1[0], Static331.anInt6277, 0);
		} else {
			local20.method6391(local36, local55.aClass12_Sub1Array1[0], 0);
		}
		if (this.aClass12_Sub4_8 != null) {
			@Pc(83) Class196 local83 = this.aClass12_Sub4_8.method1613();
			if (Static401.aBoolean511) {
				arg0.method7942(local83, Static331.anInt6277);
			} else {
				arg0.method7917(local83);
			}
		}
		this.aBoolean740 = local20.F();
		this.anInt10766 = local20.fa();
		this.anInt10765 = local20.ma();
		return local55;
	}

	@OriginalMember(owner = "client!vq", name = "b", descriptor = "(Lclient!ha;I)Lclient!rn;")
	@Override
	public Class305 method9156(@OriginalArg(0) Class137 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(ZLclient!je;IIILclient!ha;I)V")
	@Override
	public void method9166(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class12_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class137 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method9160() {
		return false;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lclient!ha;ILclient!ka;Lclient!qja;)V")
	private void method8975(@OriginalArg(0) Class137 arg0, @OriginalArg(2) Class80 arg1, @OriginalArg(3) Class26 arg2) {
		arg1.method6373(arg2);
		@Pc(13) Class136[] local13 = arg1.method6376();
		@Pc(16) Class265[] local16 = arg1.method6372();
		if ((this.aClass12_Sub4_8 == null || this.aClass12_Sub4_8.aBoolean155) && (local13 != null || local16 != null)) {
			this.aClass12_Sub4_8 = Static86.method1612(Static87.anInt1951, true);
		}
		if (this.aClass12_Sub4_8 != null) {
			this.aClass12_Sub4_8.method1620(arg0, (long) Static87.anInt1951, local13, local16);
			this.aClass12_Sub4_8.method1621(super.aByte146, super.aShort111, super.aShort112, super.aShort110, super.aShort109);
		}
	}
}
