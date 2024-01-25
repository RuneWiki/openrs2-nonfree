import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class2_Sub2_Sub2 extends Class2_Sub2 implements Interface22 {

	@OriginalMember(owner = "client!ke", name = "z", descriptor = "Lclient!cd;")
	private Class44 aClass44_3;

	@OriginalMember(owner = "client!ke", name = "N", descriptor = "Lclient!mda;")
	public final Class210 aClass210_2;

	@OriginalMember(owner = "client!ke", name = "D", descriptor = "Z")
	private final boolean aBoolean496;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!oa;Lclient!sa;IIIIIZIIIIIII)V")
	public Class2_Sub2_Sub2(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt8760 == 1, Static322.method5576(arg13, arg12));
		this.aClass210_2 = new Class210(arg0, arg1, arg12, arg13, super.aByte103, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean496 = arg1.anInt8778 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return this.aClass210_2.method5524(arg0, 0, false, arg1, false, 0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
		@Pc(22) Class21 local22 = this.aClass210_2.method5524(arg0, super.anInt9396, true, 262144, true, super.anInt9398);
		if (local22 != null) {
			@Pc(27) Class255 local27 = arg0.method5343();
			local27.GA(super.anInt9398, super.anInt9400, super.anInt9396);
			this.aClass210_2.method5518(super.aShort123, arg0, super.aShort120, local27, super.aShort122, false, local22, super.aShort121);
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)I")
	@Override
	public int method7629() {
		return this.aClass210_2.method5526();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return this.aClass210_2.anInt6583;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return this.aClass44_3;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
		this.aClass210_2.method5522(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		@Pc(18) Class21 local18 = this.aClass210_2.method5524(arg0, super.anInt9396, true, 2048, false, super.anInt9398);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class255 local25 = arg0.method5343();
		local25.GA(super.anInt9398, super.anInt9400, super.anInt9396);
		@Pc(43) Class55_Sub6 local43 = null;
		if (this.aBoolean496) {
			local43 = Static232.method3979(1);
		}
		this.aClass210_2.method5518(super.aShort123, arg0, super.aShort120, local25, super.aShort122, true, local18, super.aShort121);
		if (this.aClass210_2.aClass55_Sub8_4 == null) {
			local18.method7145(local25, local43 == null ? null : local43.aClass55_Sub3Array1[0], 0);
		} else {
			@Pc(75) Class274 local75 = this.aClass210_2.aClass55_Sub8_4.method7127();
			arg0.method5309(local18, local75, local25, local43 == null ? null : local43.aClass55_Sub3Array1[0], 0);
		}
		if (this.aClass44_3 == null) {
			this.aClass44_3 = Static5.method275(super.anInt9400, local18, super.anInt9398, super.anInt9396);
		} else {
			Static516.method3267(super.anInt9396, this.aClass44_3, super.anInt9398, local18, super.anInt9400);
		}
		return local43;
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return this.aClass210_2.method5517();
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return this.aClass210_2.anInt6581;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return this.aClass210_2.anInt6595;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		@Pc(23) Class21 local23 = this.aClass210_2.method5524(arg2, super.anInt9396, false, 131072, false, super.anInt9398);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class255 local30 = arg2.method5343();
			local30.GA(super.anInt9398, super.anInt9400, super.anInt9396);
			return local23.method7148(arg1, arg0, local30, false);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
		this.aClass210_2.method5527(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
	}
}
