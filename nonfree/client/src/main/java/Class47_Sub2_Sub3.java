import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class47_Sub2_Sub3 extends Class47_Sub2 implements Interface11 {

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "Lclient!ws;")
	public final Class266 aClass266_4;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "Z")
	private final boolean aBoolean637;

	static {
		new Class96("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!qa;Lclient!bo;IIIIIZIII)V")
	public Class47_Sub2_Sub3(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static300.method4100(arg9, arg8));
		this.aClass266_4 = new Class266(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt7430, super.anInt7431, arg7, arg10);
		this.aBoolean637 = arg1.anInt550 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
	@Override
	public void method5745() {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)I")
	@Override
	public int method5747() {
		return this.aClass266_4.anInt7768;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(16) Class37 local16 = this.aClass266_4.method5988(super.anInt7431, super.anInt7430, false, arg2, 131072, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class43 local23 = arg2.method4588();
			local23.R(super.anInt7430, super.anInt7432, super.anInt7431);
			return local16.method4166(arg1, arg0, local23, false);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I")
	@Override
	public int method5744() {
		return this.aClass266_4.anInt7786;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
		@Pc(16) Class37 local16 = this.aClass266_4.method5988(super.anInt7431, super.anInt7430, true, arg0, 262144, true);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt7430 >> 7;
			@Pc(28) int local28 = super.anInt7431 >> 7;
			this.aClass266_4.method5990(local23, local28, local28, local16, false, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		@Pc(18) Class37 local18 = this.aClass266_4.method5988(super.anInt7431, super.anInt7430, false, arg0, 2048, true);
		if (local18 == null) {
			return null;
		}
		@Pc(32) Class43 local32 = arg0.method4588();
		local32.R(super.anInt7430, super.anInt7432, super.anInt7431);
		@Pc(42) Class36_Sub1 local42 = null;
		if (this.aBoolean637) {
			local42 = Static309.method4241(1);
		}
		if (this.aClass266_4.aClass36_Sub7_7 == null) {
			local18.method4167(local32, local42 == null ? null : local42.aClass36_Sub8Array1[0], 0);
		} else {
			@Pc(72) Class101 local72 = this.aClass266_4.aClass36_Sub7_7.method4874();
			arg0.method4574(local18, local72, local32, local42 == null ? null : local42.aClass36_Sub8Array1[0]);
		}
		@Pc(91) int local91 = super.anInt7430 >> 7;
		@Pc(96) int local96 = super.anInt7431 >> 7;
		this.aClass266_4.method5990(local91, local96, local96, local18, true, local91, arg0);
		return local42;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method5746(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.aClass266_4.method5988(0, 0, false, arg1, arg0, false);
	}

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5725() {
		return false;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	@Override
	public void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5743(@OriginalArg(0) Class121 arg0) {
		this.aClass266_4.method5981(arg0);
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
	@Override
	public void method5723() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5740() {
		return this.aClass266_4.method5984();
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I")
	@Override
	public int method5742() {
		return this.aClass266_4.anInt7784;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5741(@OriginalArg(0) Class121 arg0) {
		this.aClass266_4.method5983(arg0);
	}
}
