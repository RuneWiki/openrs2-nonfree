import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class21_Sub1_Sub3_Sub2 extends Class21_Sub1_Sub3 implements Interface21 {

	@OriginalMember(owner = "client!th", name = "J", descriptor = "Lclient!eh;")
	private Class93 aClass93_8;

	@OriginalMember(owner = "client!th", name = "ab", descriptor = "Z")
	private boolean aBoolean638 = false;

	@OriginalMember(owner = "client!th", name = "Z", descriptor = "Lclient!bba;")
	public final Class28 aClass28_4;

	@OriginalMember(owner = "client!th", name = "Q", descriptor = "Z")
	private final boolean aBoolean637;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!r;Lclient!nf;IIIIIZIIIII)V")
	public Class21_Sub1_Sub3_Sub2(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass28_4 = new Class28(arg0, arg1, arg10, arg11, super.aByte127, arg3, this, arg7, arg12);
		this.aBoolean637 = arg1.anInt6681 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	@Override
	public void method7284() {
	}

	@OriginalMember(owner = "client!th", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8229() {
		return this.aBoolean638;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!r;I)Lclient!ej;")
	@Override
	public Class21_Sub4 method8228(@OriginalArg(0) Class7 arg0) {
		@Pc(14) Class65 local14 = this.aClass28_4.method964(2048, arg0, true, false);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class81 local21 = arg0.method7812();
		local21.NA(super.aShort115 + super.anInt10551, super.anInt10554, super.aShort114 + super.anInt10550);
		@Pc(37) Class21_Sub4 local37 = null;
		if (this.aBoolean637) {
			local37 = Static227.method3708(1);
		}
		@Pc(51) int local51 = super.anInt10551 >> 9;
		@Pc(63) int local63 = super.anInt10550 >> 9;
		this.aClass28_4.method971(local63, true, arg0, local51, local51, local21, local63, local14);
		if (Static263.aBoolean371) {
			local14.method7686(local21, local37 == null ? null : local37.aClass21_Sub7Array1[0], Static18.anInt941, 0);
		} else {
			local14.method7679(local21, local37 == null ? null : local37.aClass21_Sub7Array1[0], 0);
		}
		if (this.aClass28_4.aClass21_Sub5_1 != null) {
			@Pc(113) Class276 local113 = this.aClass28_4.aClass21_Sub5_1.method3048();
			if (Static263.aBoolean371) {
				arg0.method7832(local113, Static18.anInt941);
			} else {
				arg0.method7777(local113);
			}
		}
		this.aBoolean638 = local14.LA() || this.aClass28_4.aClass21_Sub5_1 != null;
		if (this.aClass93_8 == null) {
			this.aClass93_8 = Static369.method7616(super.anInt10551, super.anInt10554, super.anInt10550, local14);
		} else {
			Static496.method7173(local14, this.aClass93_8, super.anInt10550, super.anInt10554, super.anInt10551);
		}
		return local37;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
	@Override
	public int method7281() {
		return this.aClass28_4.anInt1119;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I")
	@Override
	public int method7283() {
		return this.aClass28_4.anInt1125;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(Z)Z")
	@Override
	public boolean method8235() {
		return false;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(ILclient!r;)Lclient!eh;")
	@Override
	public Class93 method8223(@OriginalArg(1) Class7 arg0) {
		return this.aClass93_8;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!r;B)Z")
	@Override
	public boolean method8222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class7 arg2) {
		@Pc(12) Class65 local12 = this.aClass28_4.method964(131072, arg2, false, false);
		if (local12 == null) {
			return false;
		} else {
			@Pc(27) Class81 local27 = arg2.method7812();
			local27.NA(super.anInt10551 + super.aShort115, super.anInt10554, super.aShort114 + super.anInt10550);
			return Static263.aBoolean371 ? local12.method7685(arg0, arg1, local27, false, Static18.anInt941) : local12.method7684(arg0, arg1, local27, false);
		}
	}

	@OriginalMember(owner = "client!th", name = "i", descriptor = "(I)I")
	@Override
	public int method8231() {
		return this.aClass28_4.method973();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)I")
	@Override
	public int method7280() {
		return this.aClass28_4.anInt1144;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method7282() {
		return this.aClass28_4.method967();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)I")
	@Override
	public int method8224(@OriginalArg(0) byte arg0) {
		return arg0 >= -102 ? -116 : this.aClass28_4.method965((byte) 60);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!r;B)V")
	@Override
	public void method7278(@OriginalArg(0) Class7 arg0) {
		this.aClass28_4.method972(arg0);
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(ILclient!r;)V")
	@Override
	public void method8233(@OriginalArg(1) Class7 arg0) {
		@Pc(12) Class65 local12 = this.aClass28_4.method964(262144, arg0, true, false);
		if (local12 == null) {
			return;
		}
		@Pc(23) int local23 = super.anInt10551 >> 9;
		@Pc(28) int local28 = super.anInt10550 >> 9;
		@Pc(31) Class81 local31 = arg0.method7812();
		local31.NA(super.anInt10551, super.anInt10554, super.anInt10550);
		this.aClass28_4.method971(local28, false, arg0, local23, local23, local31, local28, local12);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ILclient!r;)V")
	@Override
	public void method7279(@OriginalArg(1) Class7 arg0) {
		this.aClass28_4.method968(arg0);
	}
}
