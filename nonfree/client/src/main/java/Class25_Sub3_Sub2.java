import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class25_Sub3_Sub2 extends Class25_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!vi", name = "C", descriptor = "[B")
	public static final byte[] aByteArray90 = new byte[32896];

	@OriginalMember(owner = "client!vi", name = "U", descriptor = "B")
	private final byte aByte68;

	@OriginalMember(owner = "client!vi", name = "Y", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "S")
	private final short aShort90;

	@OriginalMember(owner = "client!vi", name = "V", descriptor = "B")
	private final byte aByte69;

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "Z")
	private final boolean aBoolean467;

	@OriginalMember(owner = "client!vi", name = "P", descriptor = "Z")
	private final boolean aBoolean469;

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "Z")
	private final boolean aBoolean468;

	@OriginalMember(owner = "client!vi", name = "Q", descriptor = "Lclient!mj;")
	private Class101 aClass101_7;

	@OriginalMember(owner = "client!vi", name = "M", descriptor = "Lclient!lg;")
	private Class5_Sub9_Sub14 aClass5_Sub9_Sub14_6;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray90[local6++] = (byte) (255.0D / Math.sqrt((double) ((float) (local8 * local8 + local11 * local11 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!en;Lclient!nl;IIIIZIIIII)V")
	public Class25_Sub3_Sub2(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static355.method5837(arg10, arg11));
		this.aByte68 = (byte) arg11;
		this.aByte70 = (byte) arg2;
		this.aShort90 = (short) arg1.anInt4114;
		this.aByte69 = (byte) arg10;
		this.aBoolean467 = arg6;
		super.anInt6241 = (short) arg3;
		super.anInt6244 = (short) arg5;
		this.aBoolean469 = arg1.anInt4164 != 0;
		this.aBoolean468 = arg0.method4842() && arg1.aBoolean295 && !this.aBoolean467 && Static134.anInt2750 != 0;
		@Pc(77) Class72 local77 = this.method5556(arg0, 1024, this.aBoolean468);
		if (local77 != null) {
			this.aClass101_7 = local77.aClass101_2;
			this.aClass5_Sub9_Sub14_6 = local77.aClass5_Sub9_Sub14_2;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!en;IZB)Lclient!gi;")
	private Class72 method5556(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class137 local12 = Static228.method3923(this.aShort90 & 0xFFFF);
		@Pc(40) Class3 local40;
		@Pc(26) Class3 local26;
		if (this.aBoolean467) {
			local26 = Static262.aClass3Array3[0];
			local40 = Static93.aClass3Array1[this.aByte70];
		} else {
			if (this.aByte70 >= 3) {
				local26 = null;
			} else {
				local26 = Static262.aClass3Array3[this.aByte70 + 1];
			}
			local40 = Static262.aClass3Array3[this.aByte70];
		}
		return local12.method3706(super.anInt6238, local26, this.aByte68, this.aByte69, arg2, super.anInt6241, arg1, arg0, local40, super.anInt6244);
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)I")
	@Override
	public int method5552() {
		return this.aByte68;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLclient!en;)V")
	@Override
	public void method5550(@OriginalArg(1) Class59 arg0) {
		@Pc(29) Class5_Sub9_Sub14 local29;
		if (this.aClass5_Sub9_Sub14_6 == null && this.aBoolean468) {
			@Pc(22) Class72 local22 = this.method5556(arg0, 131072, true);
			local29 = local22 == null ? null : local22.aClass5_Sub9_Sub14_2;
		} else {
			local29 = this.aClass5_Sub9_Sub14_6;
			this.aClass5_Sub9_Sub14_6 = null;
		}
		if (local29 != null) {
			Static204.method3634(local29, this.aByte70, super.anInt6241, super.anInt6244, null);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!en;II)Lclient!mj;")
	private Class101 method5558(@OriginalArg(0) Class59 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass101_7 != null && arg0.method4792(this.aClass101_7.method5171(), arg1) == 0) {
			return this.aClass101_7;
		} else {
			@Pc(30) Class72 local30 = this.method5556(arg0, arg1, false);
			return local30 == null ? null : local30.aClass101_2;
		}
	}

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "(I)I")
	@Override
	public int method5547() {
		return this.aClass101_7 == null ? 0 : this.aClass101_7.method5147();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BILclient!en;)Lclient!mj;")
	@Override
	public Class101 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1) {
		return this.method5558(arg1, arg0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!en;B)V")
	@Override
	public void method5555(@OriginalArg(0) Class59 arg0) {
		@Pc(14) Class5_Sub9_Sub14 local14;
		if (this.aClass5_Sub9_Sub14_6 == null && this.aBoolean468) {
			@Pc(25) Class72 local25 = this.method5556(arg0, 131072, true);
			local14 = local25 == null ? null : local25.aClass5_Sub9_Sub14_2;
		} else {
			local14 = this.aClass5_Sub9_Sub14_6;
			this.aClass5_Sub9_Sub14_6 = null;
		}
		if (local14 != null) {
			Static161.method2990(local14, this.aByte70, super.anInt6241, super.anInt6244, null);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(9) Class101 local9 = this.method5558(arg2, 65536);
		if (local9 == null) {
			return false;
		} else {
			@Pc(23) Class112 local23 = arg2.method4798();
			local23.method3589(super.anInt6241, super.anInt6238, super.anInt6244);
			return local9.method5187(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5551() {
		return this.aBoolean468;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		if (this.aClass101_7 == null) {
			return null;
		}
		@Pc(11) Class112 local11 = arg0.method4798();
		local11.method3589(super.anInt6251 + super.anInt6241, super.anInt6238, super.anInt6244 + super.anInt6248);
		@Pc(34) Class63_Sub3 local34 = null;
		if (this.aBoolean469) {
			local34 = Static273.method4667(1);
		}
		this.aClass101_7.method5172(local11, local34 == null ? null : local34.aClass63_Sub7Array1[0], 0);
		return local34;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)I")
	@Override
	public int method5549() {
		return this.aShort90 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)I")
	@Override
	public int method5554() {
		return this.aByte69;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	@Override
	public void method5553() {
		if (this.aClass101_7 != null) {
			this.aClass101_7.method5189();
		}
	}
}
