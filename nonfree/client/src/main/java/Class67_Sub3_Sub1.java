import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class67_Sub3_Sub1 extends Class67_Sub3 implements Interface7 {

	@OriginalMember(owner = "client!ig", name = "N", descriptor = "Lclient!bi;")
	public final Class25 aClass25_1;

	@OriginalMember(owner = "client!ig", name = "G", descriptor = "Z")
	private final boolean aBoolean154;

	static {
		new Class117("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lclient!uo;Lclient!gm;IIIIIIIZIIIII)V")
	public Class67_Sub3_Sub1(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt2031 == 1, Static275.method4655(arg3, arg2));
		this.aClass25_1 = new Class25(arg0, arg1, arg2, arg3, super.aByte73, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean154 = arg1.anInt2016 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!uo;)V")
	@Override
	public void method5415(@OriginalArg(1) Class129 arg0) {
		this.aClass25_1.method316(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class126 local16 = this.aClass25_1.method321(super.anInt6308, false, 65536, arg1, false, super.anInt6310);
		if (local16 == null) {
			return false;
		} else {
			@Pc(30) Class61 local30 = arg1.method4979();
			local30.method3666(super.anInt6308, super.anInt6313, super.anInt6310);
			return local16.method3160(arg2, arg0, local30, false);
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I")
	@Override
	public int method5414() {
		return this.aClass25_1.anInt412;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!uo;I)Lclient!mj;")
	@Override
	public Class126 method5411(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1) {
		return this.aClass25_1.method321(0, false, arg0, arg1, false, 0);
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V")
	@Override
	public void method5416() {
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5399() {
		return false;
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)I")
	@Override
	public int method5408() {
		return this.aClass25_1.method320();
	}

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V")
	@Override
	public void method5403() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)I")
	@Override
	public int method5410() {
		return this.aClass25_1.anInt392;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5412() {
		return this.aClass25_1.method313();
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		@Pc(20) Class126 local20 = this.aClass25_1.method321(super.anInt6308, true, 1024, arg0, false, super.anInt6310);
		if (local20 == null) {
			return null;
		}
		@Pc(27) Class61 local27 = arg0.method4979();
		local27.method3666(super.anInt6308, super.anInt6313, super.anInt6310);
		@Pc(37) Class10_Sub1 local37 = null;
		if (this.aBoolean154) {
			local37 = Static55.method830(1);
		}
		if (this.aClass25_1.aClass10_Sub2_1 == null) {
			local20.method3139(local27, local37 == null ? null : local37.aClass10_Sub8Array1[0], 0);
		} else {
			@Pc(53) Class136 local53 = this.aClass25_1.aClass10_Sub2_1.method981();
			arg0.method4977(local20, local53, local27, local37 == null ? null : local37.aClass10_Sub8Array1[0]);
		}
		this.aClass25_1.method323(true, super.aShort91, super.aShort92, arg0, super.aShort93, super.aShort90, local20);
		return local37;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5417(@OriginalArg(0) Class129 arg0) {
		this.aClass25_1.method322(arg0);
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
		@Pc(16) Class126 local16 = this.aClass25_1.method321(super.anInt6308, true, 131072, arg0, true, super.anInt6310);
		if (local16 != null) {
			this.aClass25_1.method323(false, super.aShort91, super.aShort92, arg0, super.aShort93, super.aShort90, local16);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
	@Override
	public int method5413() {
		return this.aClass25_1.anInt413;
	}
}
