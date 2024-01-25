import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class21_Sub1_Sub2_Sub2 extends Class21_Sub1_Sub2 implements Interface21 {

	@OriginalMember(owner = "client!jh", name = "R", descriptor = "Lclient!eh;")
	private Class93 aClass93_4;

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "Z")
	private boolean aBoolean355 = false;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "Lclient!bba;")
	public final Class28 aClass28_2;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "Z")
	private final boolean aBoolean356;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!r;Lclient!nf;IIIIIZIII)V")
	public Class21_Sub1_Sub2_Sub2(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static54.method1272(arg8, arg9));
		this.aClass28_2 = new Class28(arg0, arg1, arg8, arg9, super.aByte127, arg3, this, arg7, arg10);
		this.aBoolean356 = arg1.anInt6681 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
		@Pc(12) Class65 local12 = this.aClass28_2.method964(262144, arg0, true, true);
		if (local12 == null) {
			return;
		}
		@Pc(25) int local25 = super.anInt10551 >> 9;
		@Pc(30) int local30 = super.anInt10550 >> 9;
		@Pc(33) Class81 local33 = arg0.method7812();
		local33.NA(super.anInt10551, super.anInt10554, super.anInt10550);
		this.aClass28_2.method971(local30, false, arg0, local25, local25, local33, local30, local12);
	}

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "(I)I")
	@Override
	public int method8231() {
		return this.aClass28_2.method973();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)I")
	@Override
	public int method8224(@OriginalArg(0) byte arg0) {
		return arg0 > -102 ? -78 : this.aClass28_2.method965((byte) 60);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		@Pc(14) Class65 local14 = this.aClass28_2.method964(2048, arg0, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(28) Class81 local28 = arg0.method7812();
		local28.NA(super.anInt10551, super.anInt10554, super.anInt10550);
		@Pc(38) Class21_Sub4 local38 = null;
		if (this.aBoolean356) {
			local38 = Static227.method3708(1);
		}
		@Pc(50) int local50 = super.anInt10551 >> 9;
		@Pc(55) int local55 = super.anInt10550 >> 9;
		this.aClass28_2.method971(local55, true, arg0, local50, local50, local28, local55, local14);
		if (Static263.aBoolean371) {
			local14.method7686(local28, local38 == null ? null : local38.aClass21_Sub7Array1[0], Static18.anInt941, 0);
		} else {
			local14.method7679(local28, local38 == null ? null : local38.aClass21_Sub7Array1[0], 0);
		}
		if (this.aClass28_2.aClass21_Sub5_1 != null) {
			@Pc(105) Class276 local105 = this.aClass28_2.aClass21_Sub5_1.method3048();
			if (Static263.aBoolean371) {
				arg0.method7832(local105, Static18.anInt941);
			} else {
				arg0.method7777(local105);
			}
		}
		this.aBoolean355 = local14.LA() || this.aClass28_2.aClass21_Sub5_1 != null;
		if (this.aClass93_4 == null) {
			this.aClass93_4 = Static369.method7616(super.anInt10551, super.anInt10554, super.anInt10550, local14);
		} else {
			Static496.method7173(local14, this.aClass93_4, super.anInt10550, super.anInt10554, super.anInt10551);
		}
		return local38;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		return this.aClass93_4;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7278(@OriginalArg(0) Class7 arg0) {
		this.aClass28_2.method972(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)I")
	@Override
	public int method7281() {
		return this.aClass28_2.anInt1119;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)I")
	@Override
	public int method7283() {
		return this.aClass28_2.anInt1125;
	}

	@OriginalMember(owner = "client!jh", name = "j", descriptor = "(I)V")
	@Override
	public void method8232() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8225() {
		return false;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)I")
	@Override
	public int method7280() {
		return this.aClass28_2.anInt1144;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
	@Override
	public void method7284() {
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7282() {
		return this.aClass28_2.method967();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(12) Class65 local12 = this.aClass28_2.method964(131072, arg2, false, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(27) Class81 local27 = arg2.method7812();
			local27.NA(super.anInt10551, super.anInt10554, super.anInt10550);
			return Static263.aBoolean371 ? local12.method7685(arg0, arg1, local27, false, Static18.anInt941) : local12.method7684(arg0, arg1, local27, false);
		}
	}

	@OriginalMember(owner = "client!jh", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8229() {
		return this.aBoolean355;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8235() {
		return false;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7279(@OriginalArg(1) Class7 arg0) {
		this.aClass28_2.method968(arg0);
	}
}
