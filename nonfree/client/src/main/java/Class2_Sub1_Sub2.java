import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 implements Interface22 {

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "Lclient!cd;")
	private Class44 aClass44_2;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "Lclient!mda;")
	public final Class210 aClass210_1;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "Z")
	private final boolean aBoolean80;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!oa;Lclient!sa;IIIIIZII)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class292 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt8784, arg1.aBoolean729, arg1.aBoolean728);
		this.aClass210_1 = new Class210(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean80 = arg1.anInt8778 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		@Pc(16) Class21 local16 = this.aClass210_1.method5524(arg2, super.anInt10396, false, 131072, false, super.anInt10403);
		if (local16 == null) {
			return false;
		} else {
			@Pc(30) Class255 local30 = arg2.method5343();
			local30.GA(super.anInt10403, super.anInt10402, super.anInt10396);
			return local16.method7148(arg1, arg0, local30, false);
		}
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)I")
	@Override
	public int method8399() {
		return this.aClass210_1.anInt6595;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILclient!oa;ILclient!cq;ZI)V")
	@Override
	public void method8387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2 arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method8388() {
		return false;
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)I")
	@Override
	public int method8398() {
		return this.aClass210_1.anInt6581;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	@Override
	public Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1) {
		return this.aClass210_1.method5524(arg0, 0, false, arg1, false, 0);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8396(@OriginalArg(0) Class15 arg0) {
		this.aClass210_1.method5522(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
	@Override
	public void method8386() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8401() {
		return this.aClass210_1.method5517();
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return this.aClass44_2;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I")
	@Override
	public int method8402() {
		return this.aClass210_1.anInt6583;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		@Pc(18) Class21 local18 = this.aClass210_1.method5524(arg0, super.anInt10396, true, 2048, false, super.anInt10403);
		if (local18 == null) {
			return null;
		}
		@Pc(33) Class255 local33 = arg0.method5343();
		local33.GA(super.anInt10403, super.anInt10402, super.anInt10396);
		@Pc(43) Class55_Sub6 local43 = null;
		if (this.aBoolean80) {
			local43 = Static232.method3979(1);
		}
		@Pc(55) int local55 = super.anInt10403 >> 9;
		@Pc(60) int local60 = super.anInt10396 >> 9;
		this.aClass210_1.method5518(local60, arg0, local55, local33, local60, true, local18, local55);
		if (this.aClass210_1.aClass55_Sub8_4 == null) {
			local18.method7145(local33, local43 == null ? null : local43.aClass55_Sub3Array1[0], 0);
		} else {
			@Pc(95) Class274 local95 = this.aClass210_1.aClass55_Sub8_4.method7127();
			arg0.method5309(local18, local95, local33, local43 == null ? null : local43.aClass55_Sub3Array1[0], 0);
		}
		if (this.aClass44_2 == null) {
			this.aClass44_2 = Static5.method275(super.anInt10402, local18, super.anInt10403, super.anInt10396);
		} else {
			Static516.method3267(super.anInt10396, this.aClass44_2, super.anInt10403, local18, super.anInt10402);
		}
		return local43;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
		@Pc(20) Class21 local20 = this.aClass210_1.method5524(arg0, super.anInt10396, true, 262144, true, super.anInt10403);
		if (local20 == null) {
			return;
		}
		@Pc(27) int local27 = super.anInt10403 >> 9;
		@Pc(32) int local32 = super.anInt10396 >> 9;
		@Pc(35) Class255 local35 = arg0.method5343();
		local35.GA(super.anInt10403, super.anInt10402, super.anInt10396);
		this.aClass210_1.method5518(local32, arg0, local27, local35, local32, false, local20, local27);
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	@Override
	public void method8395() {
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8397(@OriginalArg(0) Class15 arg0) {
		this.aClass210_1.method5527(arg0);
	}
}
