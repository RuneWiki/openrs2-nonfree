import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class67_Sub4_Sub2 extends Class67_Sub4 implements Interface7 {

	@OriginalMember(owner = "client!sk", name = "N", descriptor = "Lclient!bi;")
	public final Class25 aClass25_4;

	@OriginalMember(owner = "client!sk", name = "E", descriptor = "Z")
	private final boolean aBoolean367;

	static {
		new Class117("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Lclient!uo;Lclient!gm;IIIIIIZI)V")
	public Class67_Sub4_Sub2(@OriginalArg(0) Class129 arg0, @OriginalArg(1) Class84 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		super(arg5, arg6, arg7, arg1.aBoolean126, arg1.aBoolean123);
		this.aClass25_4 = new Class25(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
		this.aBoolean367 = arg1.anInt2016 != 0 && !arg8;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!uo;I)Z")
	@Override
	public boolean method5400(@OriginalArg(0) int arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class126 local21 = this.aClass25_4.method321(super.anInt5706, false, 65536, arg1, false, super.anInt5712);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class61 local28 = arg1.method4979();
			local28.method3666(super.anInt5706, super.anInt5709, super.anInt5712);
			return local21.method3160(arg2, arg0, local28, false);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5417(@OriginalArg(0) Class129 arg0) {
		this.aClass25_4.method322(arg0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!uo;)V")
	@Override
	public void method5415(@OriginalArg(1) Class129 arg0) {
		this.aClass25_4.method316(arg0);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZLclient!uo;)Lclient!aj;")
	@Override
	public Class10_Sub1 method5401(@OriginalArg(1) Class129 arg0) {
		@Pc(16) Class126 local16 = this.aClass25_4.method321(super.anInt5706, true, 1024, arg0, false, super.anInt5712);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class61 local23 = arg0.method4979();
		local23.method3666(super.anInt5706, super.anInt5709, super.anInt5712);
		@Pc(33) Class10_Sub1 local33 = null;
		if (this.aBoolean367) {
			local33 = Static55.method830(1);
		}
		if (this.aClass25_4.aClass10_Sub2_1 == null) {
			local16.method3139(local23, local33 == null ? null : local33.aClass10_Sub8Array1[0], 0);
		} else {
			@Pc(49) Class136 local49 = this.aClass25_4.aClass10_Sub2_1.method981();
			arg0.method4977(local16, local49, local23, local33 == null ? null : local33.aClass10_Sub8Array1[0]);
		}
		this.aClass25_4.method323(true, super.anInt5706 >> 7, super.anInt5712 >> 7, arg0, super.anInt5706 >> 7, super.anInt5712 >> 7, local16);
		return local33;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
	@Override
	public void method5416() {
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5412() {
		return this.aClass25_4.method313();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IBIILclient!rr;Lclient!uo;Z)V")
	@Override
	public void method5398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class67 arg3, @OriginalArg(5) Class129 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
	@Override
	public int method5413() {
		return this.aClass25_4.anInt413;
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(Lclient!uo;I)V")
	@Override
	public void method5395(@OriginalArg(0) Class129 arg0) {
		@Pc(22) Class126 local22 = this.aClass25_4.method321(super.anInt5706, true, 131072, arg0, true, super.anInt5712);
		if (local22 != null) {
			this.aClass25_4.method323(false, super.anInt5706 >> 7, super.anInt5712 >> 7, arg0, super.anInt5706 >> 7, super.anInt5712 >> 7, local22);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!uo;I)Lclient!mj;")
	@Override
	public Class126 method5411(@OriginalArg(0) int arg0, @OriginalArg(1) Class129 arg1) {
		return this.aClass25_4.method321(0, false, arg0, arg1, false, 0);
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)I")
	@Override
	public int method5414() {
		return this.aClass25_4.anInt412;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)I")
	@Override
	public int method5410() {
		return this.aClass25_4.anInt392;
	}

	@OriginalMember(owner = "client!sk", name = "d", descriptor = "(B)V")
	@Override
	public void method5403() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method5399() {
		return false;
	}
}
