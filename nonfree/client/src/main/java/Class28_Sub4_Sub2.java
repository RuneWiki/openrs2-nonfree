import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class28_Sub4_Sub2 extends Class28_Sub4 implements Interface3 {

	@OriginalMember(owner = "client!um", name = "C", descriptor = "Lclient!nt;")
	public final Class170 aClass170_4;

	@OriginalMember(owner = "client!um", name = "K", descriptor = "Z")
	private final boolean aBoolean454;

	static {
		new Class57("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!np;Lclient!dq;IIIIIZIIIIII)V")
	public Class28_Sub4_Sub2(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static5.method87(arg12, arg11));
		this.aClass170_4 = new Class170(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean454 = arg1.anInt1415 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I")
	@Override
	public int method5423() {
		return this.aClass170_4.anInt4272;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!np;)V")
	@Override
	public void method5424(@OriginalArg(1) Class155 arg0) {
		this.aClass170_4.method3978(arg0);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		@Pc(22) Class75 local22 = this.aClass170_4.method3979(super.anInt6100, false, arg0, true, super.anInt6099, 1024);
		if (local22 == null) {
			return null;
		}
		@Pc(29) Class118 local29 = arg0.method4908();
		local29.method2659(super.anInt6096 + super.anInt6100, super.anInt6093, super.anInt6099 + super.anInt6092);
		@Pc(45) Class12_Sub7 local45 = null;
		if (this.aBoolean454) {
			local45 = Static146.method2294(1);
		}
		if (this.aClass170_4.aClass12_Sub4_3 == null) {
			local22.method5469(local29, local45 == null ? null : local45.aClass12_Sub5Array1[0], 0);
		} else {
			@Pc(75) Class47 local75 = this.aClass170_4.aClass12_Sub4_3.method1797();
			arg0.method4905(local22, local75, local29, local45 == null ? null : local45.aClass12_Sub5Array1[0]);
		}
		this.aClass170_4.method3976(true, super.anInt6100 >> 7, super.anInt6099 >> 7, arg0, super.anInt6100 >> 7, local22, super.anInt6099 >> 7);
		return local45;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)I")
	@Override
	public int method5420() {
		return this.aClass170_4.anInt4283;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)I")
	@Override
	public int method5425() {
		return this.aClass170_4.anInt4279;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	@Override
	public Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1) {
		return this.aClass170_4.method3979(0, false, arg0, false, 0, arg1);
	}

	@OriginalMember(owner = "client!um", name = "h", descriptor = "(I)I")
	@Override
	public int method5419() {
		return this.aClass170_4.method3981();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(23) Class75 local23 = this.aClass170_4.method3979(super.anInt6100, false, arg2, false, super.anInt6099, 65536);
		if (local23 == null) {
			return false;
		} else {
			@Pc(30) Class118 local30 = arg2.method4908();
			local30.method2659(super.anInt6096 + super.anInt6100, super.anInt6093, super.anInt6099 + super.anInt6092);
			return local23.method5460(arg0, arg1, local30, false);
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
		@Pc(16) Class75 local16 = this.aClass170_4.method3979(super.anInt6100, false, arg0, true, super.anInt6099, 131072);
		if (local16 != null) {
			this.aClass170_4.method3976(false, super.anInt6100 >> 7, super.anInt6099 >> 7, arg0, super.anInt6100 >> 7, local16, super.anInt6099 >> 7);
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5427() {
		return this.aClass170_4.method3974();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!np;I)V")
	@Override
	public void method5426(@OriginalArg(0) Class155 arg0) {
		this.aClass170_4.method3977(arg0);
	}
}
