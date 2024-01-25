import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class21_Sub1_Sub1_Sub3 extends Class21_Sub1_Sub1 implements Interface21 {

	@OriginalMember(owner = "client!jea", name = "X", descriptor = "Lclient!eh;")
	private Class93 aClass93_3;

	@OriginalMember(owner = "client!jea", name = "cb", descriptor = "Z")
	private boolean aBoolean352 = false;

	@OriginalMember(owner = "client!jea", name = "S", descriptor = "Lclient!bba;")
	public final Class28 aClass28_1;

	@OriginalMember(owner = "client!jea", name = "Y", descriptor = "Z")
	private final boolean aBoolean351;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!r;Lclient!nf;IIIIIZIIIIIII)V")
	public Class21_Sub1_Sub1_Sub3(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt6715 == 1, Static433.method6466(arg13, arg12));
		this.aClass28_1 = new Class28(arg0, arg1, arg12, arg13, super.aByte127, arg3, this, arg7, arg14);
		this.aBoolean351 = arg1.anInt6681 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)I")
	@Override
	public int method7283() {
		return this.aClass28_1.anInt1125;
	}

	@OriginalMember(owner = "client!jea", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method8225() {
		return false;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7279(@OriginalArg(1) Class7 arg0) {
		this.aClass28_1.method968(arg0);
	}

	@OriginalMember(owner = "client!jea", name = "j", descriptor = "(I)V")
	@Override
	public void method8232() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7278(@OriginalArg(0) Class7 arg0) {
		this.aClass28_1.method972(arg0);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(12) Class65 local12 = this.aClass28_1.method964(131072, arg2, false, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(27) Class81 local27 = arg2.method7812();
			local27.NA(super.anInt10551, super.anInt10554, super.anInt10550);
			return Static263.aBoolean371 ? local12.method7685(arg0, arg1, local27, false, Static18.anInt941) : local12.method7684(arg0, arg1, local27, false);
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)I")
	@Override
	public int method8224(@OriginalArg(0) byte arg0) {
		if (arg0 >= -102) {
			this.method8232();
		}
		return this.aClass28_1.method965((byte) 60);
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8235() {
		return false;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)I")
	@Override
	public int method7281() {
		return this.aClass28_1.anInt1119;
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!vj;IZLclient!r;IIB)V")
	@Override
	public void method8230(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class7 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		return this.aClass93_3;
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7282() {
		return this.aClass28_1.method967();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		@Pc(14) Class65 local14 = this.aClass28_1.method964(2048, arg0, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class81 local21 = arg0.method7812();
		local21.NA(super.anInt10551, super.anInt10554, super.anInt10550);
		@Pc(31) Class21_Sub4 local31 = null;
		if (this.aBoolean351) {
			local31 = Static227.method3708(1);
		}
		this.aClass28_1.method971(super.aShort121, true, arg0, super.aShort120, super.aShort119, local21, super.aShort122, local14);
		if (Static263.aBoolean371) {
			local14.method7686(local21, local31 == null ? null : local31.aClass21_Sub7Array1[0], Static18.anInt941, 0);
		} else {
			local14.method7679(local21, local31 == null ? null : local31.aClass21_Sub7Array1[0], 0);
		}
		if (this.aClass28_1.aClass21_Sub5_1 != null) {
			@Pc(99) Class276 local99 = this.aClass28_1.aClass21_Sub5_1.method3048();
			if (Static263.aBoolean371) {
				arg0.method7832(local99, Static18.anInt941);
			} else {
				arg0.method7777(local99);
			}
		}
		this.aBoolean352 = local14.LA() || this.aClass28_1.aClass21_Sub5_1 != null;
		if (this.aClass93_3 == null) {
			this.aClass93_3 = Static369.method7616(super.anInt10551, super.anInt10554, super.anInt10550, local14);
		} else {
			Static496.method7173(local14, this.aClass93_3, super.anInt10550, super.anInt10554, super.anInt10551);
		}
		return local31;
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
	@Override
	public void method7284() {
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)I")
	@Override
	public int method7280() {
		return this.aClass28_1.anInt1144;
	}

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
		@Pc(12) Class65 local12 = this.aClass28_1.method964(262144, arg0, true, true);
		if (local12 != null) {
			@Pc(17) Class81 local17 = arg0.method7812();
			local17.NA(super.anInt10551, super.anInt10554, super.anInt10550);
			this.aClass28_1.method971(super.aShort121, false, arg0, super.aShort120, super.aShort119, local17, super.aShort122, local12);
		}
	}

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "(I)I")
	@Override
	public int method8231() {
		return this.aClass28_1.method973();
	}

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8229() {
		return this.aBoolean352;
	}
}
