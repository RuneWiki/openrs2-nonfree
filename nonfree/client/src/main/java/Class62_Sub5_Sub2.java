import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class62_Sub5_Sub2 extends Class62_Sub5 implements Interface9 {

	@OriginalMember(owner = "client!qj", name = "cb", descriptor = "Z")
	private final boolean aBoolean464;

	@OriginalMember(owner = "client!qj", name = "P", descriptor = "B")
	private final byte aByte51;

	@OriginalMember(owner = "client!qj", name = "D", descriptor = "Z")
	private final boolean aBoolean462;

	@OriginalMember(owner = "client!qj", name = "N", descriptor = "B")
	private final byte aByte50;

	@OriginalMember(owner = "client!qj", name = "R", descriptor = "B")
	private final byte aByte52;

	@OriginalMember(owner = "client!qj", name = "Z", descriptor = "S")
	private final short aShort78;

	@OriginalMember(owner = "client!qj", name = "U", descriptor = "Z")
	private final boolean aBoolean463;

	@OriginalMember(owner = "client!qj", name = "H", descriptor = "Lclient!mm;")
	private Class2_Sub11_Sub10 aClass2_Sub11_Sub10_4;

	@OriginalMember(owner = "client!qj", name = "M", descriptor = "Lclient!bk;")
	private Class7 aClass7_5;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!ae;Lclient!jh;IIIIZIIIII)V")
	public Class62_Sub5_Sub2(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class96 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static114.method5711(arg10, arg11));
		this.aBoolean464 = arg6;
		this.aByte51 = (byte) arg2;
		this.aBoolean462 = arg1.anInt3115 != 0 && !arg6;
		this.aByte50 = (byte) arg10;
		this.aByte52 = (byte) arg11;
		super.anInt5051 = (short) arg5;
		this.aShort78 = (short) arg1.anInt3132;
		super.anInt5056 = (short) arg3;
		this.aBoolean463 = arg0.method4279() && arg1.aBoolean270 && !this.aBoolean464 && Static322.anInt6490 != 0;
		@Pc(76) Class183 local76 = this.method4647(arg0, this.aBoolean463, 1024);
		if (local76 != null) {
			this.aClass2_Sub11_Sub10_4 = local76.aClass2_Sub11_Sub10_5;
			this.aClass7_5 = local76.aClass7_6;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLclient!ae;)Lclient!jg;")
	@Override
	public Class55_Sub3 method5568(@OriginalArg(1) Class4 arg0) {
		if (this.aClass7_5 == null) {
			return null;
		}
		@Pc(17) Class133 local17 = arg0.method4244();
		local17.method4324(super.anInt5047 + super.anInt5056, super.anInt5048, super.anInt5051 + super.anInt5057);
		@Pc(33) Class55_Sub3 local33 = null;
		if (this.aBoolean462) {
			local33 = Static241.method4172(1);
		}
		this.aClass7_5.method1441(local17, local33 == null ? null : local33.aClass55_Sub4Array1[0], 0);
		return local33;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)I")
	@Override
	public int method5580() {
		return this.aByte52;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!ae;)V")
	@Override
	public void method5584(@OriginalArg(1) Class4 arg0) {
		@Pc(32) Class2_Sub11_Sub10 local32;
		if (this.aClass2_Sub11_Sub10_4 == null && this.aBoolean463) {
			@Pc(25) Class183 local25 = this.method4647(arg0, true, 131072);
			local32 = local25 == null ? null : local25.aClass2_Sub11_Sub10_5;
		} else {
			local32 = this.aClass2_Sub11_Sub10_4;
			this.aClass2_Sub11_Sub10_4 = null;
		}
		if (local32 != null) {
			Static247.method4484(local32, this.aByte51, super.anInt5056, super.anInt5051, null);
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)I")
	@Override
	public int method4631() {
		return this.aClass7_5 == null ? 0 : this.aClass7_5.method1430();
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	@Override
	public void method5577() {
		if (this.aClass7_5 != null) {
			this.aClass7_5.method1434();
		}
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)I")
	@Override
	public int method5581() {
		return this.aByte50;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ae;ZI)Lclient!bk;")
	@Override
	public Class7 method5582(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		return this.method4645(arg0, arg1);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)I")
	@Override
	public int method5583() {
		return this.aShort78 & 0xFFFF;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ae;BI)Lclient!bk;")
	private Class7 method4645(@OriginalArg(0) Class4 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass7_5 != null && arg0.method4276(this.aClass7_5.method1435(), arg1) == 0) {
			return this.aClass7_5;
		} else {
			@Pc(28) Class183 local28 = this.method4647(arg0, false, arg1);
			return local28 == null ? null : local28.aClass7_6;
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ae;I)V")
	@Override
	public void method5578(@OriginalArg(0) Class4 arg0) {
		@Pc(19) Class2_Sub11_Sub10 local19;
		if (this.aClass2_Sub11_Sub10_4 == null && this.aBoolean463) {
			@Pc(30) Class183 local30 = this.method4647(arg0, true, 131072);
			local19 = local30 == null ? null : local30.aClass2_Sub11_Sub10_5;
		} else {
			local19 = this.aClass2_Sub11_Sub10_4;
			this.aClass2_Sub11_Sub10_4 = null;
		}
		if (local19 != null) {
			Static76.method1680(local19, this.aByte51, super.anInt5056, super.anInt5051, null);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ae;B)V")
	@Override
	public void method5567(@OriginalArg(0) Class4 arg0) {
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5579() {
		return this.aBoolean463;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILclient!ae;II)Z")
	@Override
	public boolean method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class7 local16 = this.method4645(arg1, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class133 local21 = arg1.method4244();
			local21.method4324(super.anInt5056, super.anInt5048, super.anInt5051);
			return local16.method1407(arg0, arg2, local21, false);
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!ae;IZI)Lclient!sk;")
	private Class183 method4647(@OriginalArg(0) Class4 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class96 local17 = Static234.method4051(this.aShort78 & 0xFFFF);
		@Pc(25) Class73 local25;
		@Pc(29) Class73 local29;
		if (this.aBoolean464) {
			local25 = Static313.aClass73Array39[this.aByte51];
			local29 = Static265.aClass73Array44[0];
		} else {
			local25 = Static265.aClass73Array44[this.aByte51];
			if (this.aByte51 < 3) {
				local29 = Static265.aClass73Array44[this.aByte51 + 1];
			} else {
				local29 = null;
			}
		}
		return local17.method2946(this.aByte52, arg1, local25, arg0, this.aByte50, super.anInt5056, super.anInt5051, super.anInt5048, arg2, local29);
	}
}
