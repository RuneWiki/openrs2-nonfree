import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 implements Interface22 {

	@OriginalMember(owner = "client!kt", name = "F", descriptor = "Lclient!cd;")
	private Class44 aClass44_4;

	@OriginalMember(owner = "client!kt", name = "K", descriptor = "Lclient!mda;")
	public final Class210 aClass210_3;

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "Z")
	private final boolean aBoolean510;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!oa;Lclient!sa;IIIIIZIII)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static260.method4596(arg8, arg9));
		this.aClass210_3 = new Class210(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt7258, super.anInt7256, arg7, arg10);
		this.aBoolean510 = arg1.anInt8778 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return this.aClass210_3.anInt6583;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
		this.aClass210_3.method5527(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		@Pc(18) Class21 local18 = this.aClass210_3.method5524(arg0, super.anInt7256, true, 2048, false, super.anInt7258);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class255 local25 = arg0.method5343();
		local25.GA(super.anInt7258, super.anInt7257, super.anInt7256);
		@Pc(43) Class55_Sub6 local43 = null;
		if (this.aBoolean510) {
			local43 = Static232.method3979(1);
		}
		@Pc(55) int local55 = super.anInt7258 >> 9;
		@Pc(60) int local60 = super.anInt7256 >> 9;
		this.aClass210_3.method5518(local60, arg0, local55, local25, local60, true, local18, local55);
		if (this.aClass210_3.aClass55_Sub8_4 == null) {
			local18.method7145(local25, local43 == null ? null : local43.aClass55_Sub3Array1[0], 0);
		} else {
			@Pc(95) Class274 local95 = this.aClass210_3.aClass55_Sub8_4.method7127();
			arg0.method5309(local18, local95, local25, local43 == null ? null : local43.aClass55_Sub3Array1[0], 0);
		}
		if (this.aClass44_4 == null) {
			this.aClass44_4 = Static5.method275(super.anInt7257, local18, super.anInt7258, super.anInt7256);
		} else {
			Static516.method3267(super.anInt7256, this.aClass44_4, super.anInt7258, local18, super.anInt7257);
		}
		return local43;
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return this.aClass44_4;
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return this.aClass210_3.anInt6595;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
		@Pc(22) Class21 local22 = this.aClass210_3.method5524(arg0, super.anInt7256, true, 262144, true, super.anInt7258);
		if (local22 == null) {
			return;
		}
		@Pc(29) int local29 = super.anInt7258 >> 9;
		@Pc(34) int local34 = super.anInt7256 >> 9;
		@Pc(37) Class255 local37 = arg0.method5343();
		local37.GA(super.anInt7258, super.anInt7257, super.anInt7256);
		this.aClass210_3.method5518(local34, arg0, local29, local37, local34, false, local22, local29);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
		this.aClass210_3.method5522(arg0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return this.aClass210_3.method5517();
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return this.aClass210_3.anInt6581;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		@Pc(25) Class21 local25 = this.aClass210_3.method5524(arg2, super.anInt7256, false, 131072, false, super.anInt7258);
		if (local25 == null) {
			return false;
		} else {
			@Pc(32) Class255 local32 = arg2.method5343();
			local32.GA(super.anInt7258, super.anInt7257, super.anInt7256);
			return local25.method7148(arg1, arg0, local32, false);
		}
	}

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return this.aClass210_3.method5524(arg0, 0, false, arg1, false, 0);
	}
}
