import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class4_Sub1_Sub2 extends Class4_Sub1 implements Interface9 {

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "B")
	private final byte aByte2;

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "B")
	private final byte aByte4;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "Z")
	private final boolean aBoolean43;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "S")
	private final short aShort6;

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "B")
	private final byte aByte3;

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "Z")
	private final boolean aBoolean46;

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "Z")
	private final boolean aBoolean44;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "Lclient!c;")
	private Class32 aClass32_1;

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "Lclient!j;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_1;

	static {
		new Class256("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!qa;Lclient!us;IIIIZIIIII)V")
	public Class4_Sub1_Sub2(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static344.method4850(arg10, arg11));
		super.anInt5533 = arg5;
		this.aByte2 = (byte) arg10;
		this.aByte4 = (byte) arg2;
		this.aBoolean43 = arg1.anInt7186 != 0 && !arg6;
		this.aShort6 = (short) arg1.anInt7160;
		this.aByte3 = (byte) arg11;
		super.anInt5532 = arg3;
		this.aBoolean46 = arg6;
		this.aBoolean44 = arg0.method2273() && arg1.aBoolean617 && !this.aBoolean46 && Static399.aClass167_Sub1_1.method4517(Static281.anInt5126) != 0;
		@Pc(74) Class69 local74 = this.method344(2048, arg0, this.aBoolean44);
		if (local74 != null) {
			this.aClass32_1 = local74.aClass32_2;
			this.aClass2_Sub2_Sub9_1 = local74.aClass2_Sub2_Sub9_2;
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)I")
	@Override
	public int method5902() {
		return this.aByte3;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)I")
	@Override
	public int method5901() {
		return this.aShort6 & 0xFFFF;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	@Override
	public void method5899() {
		if (this.aClass32_1 != null) {
			this.aClass32_1.method5666();
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(B)I")
	@Override
	public int method4502() {
		return this.aClass32_1 == null ? 0 : this.aClass32_1.b();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILclient!qa;Z)Lclient!en;")
	private Class69 method344(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class250 local13 = Static406.aClass150_3.method3508(this.aShort6 & 0xFFFF);
		@Pc(21) Class106 local21;
		@Pc(25) Class106 local25;
		if (this.aBoolean46) {
			local21 = Static77.aClass106Array12[this.aByte4];
			local25 = Static72.aClass106Array4[0];
		} else {
			if (this.aByte4 < 3) {
				local25 = Static72.aClass106Array4[this.aByte4 + 1];
			} else {
				local25 = null;
			}
			local21 = Static72.aClass106Array4[this.aByte4];
		}
		return local13.method5593(arg2, this.aByte2, arg1, super.anInt5533, local21, arg0, local25, super.anInt5532, this.aByte3, super.anInt5528);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	@Override
	public Class32 method5906(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		return this.method345(arg1, arg0);
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)I")
	@Override
	public int method5904() {
		return this.aByte2;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method5894(@OriginalArg(1) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class32 local9 = this.method345(131072, arg1);
		if (local9 == null) {
			return false;
		} else {
			@Pc(19) Class102 local19 = arg1.method2223();
			local19.R(super.anInt5532, super.anInt5528, super.anInt5533);
			return local9.method5671(arg2, arg0, local19, false);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method5900(@OriginalArg(0) Class26 arg0) {
		@Pc(20) Class2_Sub2_Sub9 local20;
		if (this.aClass2_Sub2_Sub9_1 == null && this.aBoolean44) {
			@Pc(31) Class69 local31 = this.method344(262144, arg0, true);
			local20 = local31 == null ? null : local31.aClass2_Sub2_Sub9_2;
		} else {
			local20 = this.aClass2_Sub2_Sub9_1;
			this.aClass2_Sub2_Sub9_1 = null;
		}
		if (local20 != null) {
			Static450.method6081(local20, this.aByte4, super.anInt5532, super.anInt5533, null);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZLclient!qa;)Lclient!c;")
	private Class32 method345(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1) {
		if (this.aClass32_1 != null && arg1.method2259(this.aClass32_1.n(), arg0) == 0) {
			return this.aClass32_1;
		} else {
			@Pc(26) Class69 local26 = this.method344(arg0, arg1, false);
			return local26 == null ? null : local26.aClass32_2;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5903(@OriginalArg(1) Class26 arg0) {
		@Pc(29) Class2_Sub2_Sub9 local29;
		if (this.aClass2_Sub2_Sub9_1 == null && this.aBoolean44) {
			@Pc(22) Class69 local22 = this.method344(262144, arg0, true);
			local29 = local22 == null ? null : local22.aClass2_Sub2_Sub9_2;
		} else {
			local29 = this.aClass2_Sub2_Sub9_1;
			this.aClass2_Sub2_Sub9_1 = null;
		}
		if (local29 != null) {
			Static95.method1600(local29, this.aByte4, super.anInt5532, super.anInt5533, null);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!qa;Z)V")
	@Override
	public void method5893(@OriginalArg(0) Class26 arg0) {
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(ILclient!qa;)Lclient!fm;")
	@Override
	public Class38_Sub3 method5896(@OriginalArg(1) Class26 arg0) {
		if (this.aClass32_1 == null) {
			return null;
		}
		@Pc(17) Class102 local17 = arg0.method2223();
		local17.R(super.anInt5524 + super.anInt5532, super.anInt5528, super.anInt5533 + super.anInt5526);
		@Pc(33) Class38_Sub3 local33 = null;
		if (this.aBoolean43) {
			local33 = Static313.method4433(1);
		}
		this.aClass32_1.method5675(local17, local33 == null ? null : local33.aClass38_Sub4Array1[0], 0);
		return local33;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method5905() {
		return this.aBoolean44;
	}
}
