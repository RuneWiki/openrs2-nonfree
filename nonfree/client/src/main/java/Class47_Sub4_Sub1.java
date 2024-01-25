import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class47_Sub4_Sub1 extends Class47_Sub4 implements Interface11 {

	@OriginalMember(owner = "client!es", name = "J", descriptor = "Lclient!ws;")
	public final Class266 aClass266_1;

	@OriginalMember(owner = "client!es", name = "L", descriptor = "Z")
	private final boolean aBoolean141;

	static {
		new Class96("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!qa;Lclient!bo;IIIIIZIIIIII)V")
	public Class47_Sub4_Sub1(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static305.method4198(arg12, arg11));
		this.aClass266_1 = new Class266(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean141 = arg1.anInt550 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5743(@OriginalArg(0) Class121 arg0) {
		this.aClass266_1.method5981(arg0);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIILclient!qa;)Z")
	@Override
	public boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(16) Class37 local16 = this.aClass266_1.method5988(super.anInt4954, super.anInt4958, false, arg2, 131072, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class43 local29 = arg2.method4588();
			local29.R(super.anInt4956 + super.anInt4958, super.anInt4960, super.anInt4954 + super.anInt4950);
			return local16.method4166(arg1, arg0, local29, false);
		}
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5732(@OriginalArg(0) Class121 arg0) {
		@Pc(16) Class37 local16 = this.aClass266_1.method5988(super.anInt4954, super.anInt4958, false, arg0, 262144, true);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt4958 >> 7;
			@Pc(28) int local28 = super.anInt4954 >> 7;
			this.aClass266_1.method5990(local23, local28, local28, local16, false, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5740() {
		return this.aClass266_1.method5984();
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(Z)I")
	@Override
	public int method4049() {
		return this.aClass266_1.method5985();
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)V")
	@Override
	public void method5745() {
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)I")
	@Override
	public int method5742() {
		return this.aClass266_1.anInt7784;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5741(@OriginalArg(0) Class121 arg0) {
		this.aClass266_1.method5983(arg0);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)I")
	@Override
	public int method5744() {
		return this.aClass266_1.anInt7786;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	@Override
	public Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0) {
		@Pc(16) Class37 local16 = this.aClass266_1.method5988(super.anInt4954, super.anInt4958, false, arg0, 2048, true);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class43 local23 = arg0.method4588();
		local23.R(super.anInt4958 + super.anInt4956, super.anInt4960, super.anInt4954 + super.anInt4950);
		@Pc(45) Class36_Sub1 local45 = null;
		if (this.aBoolean141) {
			local45 = Static309.method4241(1);
		}
		if (this.aClass266_1.aClass36_Sub7_7 == null) {
			local16.method4167(local23, local45 == null ? null : local45.aClass36_Sub8Array1[0], 0);
		} else {
			@Pc(75) Class101 local75 = this.aClass266_1.aClass36_Sub7_7.method4874();
			arg0.method4574(local16, local75, local23, local45 == null ? null : local45.aClass36_Sub8Array1[0]);
		}
		@Pc(94) int local94 = super.anInt4958 >> 7;
		@Pc(99) int local99 = super.anInt4954 >> 7;
		this.aClass266_1.method5990(local94, local99, local99, local16, true, local94, arg0);
		return local45;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)I")
	@Override
	public int method5747() {
		return this.aClass266_1.anInt7768;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	@Override
	public Class37 method5746(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.aClass266_1.method5988(0, 0, false, arg1, arg0, false);
	}
}
