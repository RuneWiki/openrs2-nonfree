import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class6_Sub1_Sub6 extends Class6_Sub1 implements Interface15 {

	@OriginalMember(owner = "client!uw", name = "A", descriptor = "Lclient!ew;")
	private Class81 aClass81_6;

	@OriginalMember(owner = "client!uw", name = "H", descriptor = "Lclient!tj;")
	public final Class281 aClass281_2;

	@OriginalMember(owner = "client!uw", name = "I", descriptor = "Z")
	private final boolean aBoolean657;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lclient!oa;Lclient!qd;IIIIIZIIIIIII)V")
	public Class6_Sub1_Sub6(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class242 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt7161 == 1, Static276.method4783(arg12, arg13));
		this.aClass281_2 = new Class281(arg0, arg1, arg12, arg13, super.aByte100, arg3, arg4, arg6, arg7, arg14);
		this.aBoolean657 = arg1.anInt7164 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)I")
	@Override
	public int method7758() {
		return this.aClass281_2.anInt8412;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
		@Pc(16) Class2 local16 = this.aClass281_2.method6979(super.anInt8811, true, super.anInt8813, 262144, arg0, true);
		if (local16 != null) {
			@Pc(26) Class205 local26 = arg0.method7448();
			local26.GA(super.anInt8811, super.anInt8814, super.anInt8813);
			this.aClass281_2.method6974(local26, local16, super.aShort123, false, super.aShort121, super.aShort122, arg0, super.aShort120);
		}
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)V")
	@Override
	public void method7752() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V")
	@Override
	public void method7760() {
	}

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "(I)I")
	@Override
	public int method7761() {
		return this.aClass281_2.anInt8427;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7759(@OriginalArg(1) Class5 arg0) {
		this.aClass281_2.method6973(arg0);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class2 local16 = this.aClass281_2.method6979(super.anInt8811, false, super.anInt8813, 131072, arg1, false);
		if (local16 == null) {
			return false;
		} else {
			@Pc(29) Class205 local29 = arg1.method7448();
			local29.GA(super.anInt8811, super.anInt8814, super.anInt8813);
			return local16.method5786(arg0, arg2, local29, false);
		}
	}

	@OriginalMember(owner = "client!uw", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method7743() {
		return false;
	}

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "(I)I")
	@Override
	public int method7764() {
		return this.aClass281_2.anInt8418;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7757() {
		return this.aClass281_2.method6977();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7762(@OriginalArg(1) Class5 arg0) {
		this.aClass281_2.method6970(arg0);
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIILclient!va;Lclient!oa;ZI)V")
	@Override
	public void method7749(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6 arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		@Pc(18) Class2 local18 = this.aClass281_2.method6979(super.anInt8811, true, super.anInt8813, 2048, arg0, false);
		if (local18 == null) {
			return null;
		}
		@Pc(25) Class205 local25 = arg0.method7448();
		local25.GA(super.anInt8811, super.anInt8814, super.anInt8813);
		@Pc(40) Class4_Sub1 local40 = null;
		if (this.aBoolean657) {
			local40 = Static264.method4641(1);
		}
		this.aClass281_2.method6974(local25, local18, super.aShort123, true, super.aShort121, super.aShort122, arg0, super.aShort120);
		if (this.aClass281_2.aClass4_Sub4_7 == null) {
			local18.method5774(local25, local40 == null ? null : local40.aClass4_Sub7Array1[0], 0);
		} else {
			@Pc(72) Class26 local72 = this.aClass281_2.aClass4_Sub4_7.method4590();
			arg0.method7464(local18, local72, local25, local40 == null ? null : local40.aClass4_Sub7Array1[0], 0);
		}
		if (this.aClass81_6 == null) {
			this.aClass81_6 = Static257.method4541(super.anInt8813, super.anInt8814, super.anInt8811, local18);
		} else {
			Static340.method5407(super.anInt8813, this.aClass81_6, local18, super.anInt8811, super.anInt8814);
		}
		return local40;
	}

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "(B)I")
	@Override
	public int method7240() {
		return this.aClass281_2.method6976();
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	@Override
	public Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1) {
		return this.aClass281_2.method6979(0, false, 0, arg0, arg1, false);
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return this.aClass81_6;
	}
}
