import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ct")
public final class Class11_Sub1_Sub2 extends Class11_Sub1 {

	@OriginalMember(owner = "client!ct", name = "G", descriptor = "Lclient!hm;")
	private Class5_Sub2 aClass5_Sub2_3;

	@OriginalMember(owner = "client!ct", name = "C", descriptor = "I")
	private int anInt1862 = 0;

	@OriginalMember(owner = "client!ct", name = "S", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!ct", name = "T", descriptor = "I")
	private int anInt1876 = 0;

	@OriginalMember(owner = "client!ct", name = "K", descriptor = "I")
	private int anInt1868 = -32768;

	@OriginalMember(owner = "client!ct", name = "U", descriptor = "I")
	private final int anInt1877 = -1;

	@OriginalMember(owner = "client!ct", name = "X", descriptor = "I")
	private int anInt1880 = 0;

	@OriginalMember(owner = "client!ct", name = "P", descriptor = "I")
	private final int anInt1873;

	@OriginalMember(owner = "client!ct", name = "J", descriptor = "I")
	private final int anInt1867;

	@OriginalMember(owner = "client!ct", name = "Q", descriptor = "I")
	public final int anInt1874;

	@OriginalMember(owner = "client!ct", name = "E", descriptor = "Lclient!am;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class11_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt1873 = arg4;
		this.anInt1867 = arg0;
		this.anInt1876 = arg12;
		this.anInt1874 = arg1 + arg2;
		@Pc(49) Class212 local49 = Static355.aClass278_2.method6826(this.anInt1867);
		@Pc(52) int local52 = local49.anInt6056;
		if (local52 == -1) {
			this.aBoolean188 = true;
		} else {
			this.aClass16_1 = Static114.aClass156_2.method4101(local52);
			this.aBoolean188 = false;
		}
		if (arg2 == this.anInt1874) {
			Static360.method5794(super.anInt7347, this.aClass16_1, super.anInt7351, super.aByte77, this.anInt1880, false);
		}
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V")
	@Override
	public void method8107() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(Lclient!oa;I)Lclient!ok;")
	@Override
	public Class5_Sub5 method8109(@OriginalArg(0) Class9 arg0) {
		@Pc(23) Class23 local23 = this.method1687((this.anInt1876 == 0 ? 0 : 5) | 0x800, this.anInt1867, arg0);
		if (local23 == null) {
			return null;
		}
		if (this.anInt1876 != 0) {
			local23.I(this.anInt1876 * 2048);
		}
		@Pc(40) Class8 local40 = arg0.method5417();
		local40.GA(super.anInt7347, super.anInt7350, super.anInt7351);
		this.method1686(arg0, local40, local23);
		if (this.aClass5_Sub2_3 == null) {
			local23.method7077(local40, null, 0);
		} else {
			@Pc(68) Class299 local68 = this.aClass5_Sub2_3.method3789();
			arg0.method5457(local23, local68, local40, null, 0);
		}
		this.anInt1868 = local23.DA();
		return null;
	}

	@OriginalMember(owner = "client!ct", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass5_Sub2_3 != null) {
			this.aClass5_Sub2_3.method3791();
		}
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8110(@OriginalArg(0) Class9 arg0) {
		@Pc(18) Class23 local18 = this.method1687(0, this.anInt1867, arg0);
		if (local18 != null) {
			@Pc(23) Class8 local23 = arg0.method5417();
			local23.GA(super.anInt7347, super.anInt7350, super.anInt7351);
			this.method1686(arg0, local23, local18);
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8104(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "(I)I")
	@Override
	public int method6199() {
		return this.anInt1868;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZIZIILclient!fl;Lclient!oa;)V")
	@Override
	public void method8103(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class11 arg4, @OriginalArg(6) Class9 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)V")
	public void method1685() {
		if (this.aClass5_Sub2_3 != null) {
			this.aClass5_Sub2_3.method3791();
		}
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(BLclient!oa;Lclient!q;Lclient!ba;)V")
	private void method1686(@OriginalArg(1) Class9 arg0, @OriginalArg(2) Class8 arg1, @OriginalArg(3) Class23 arg2) {
		arg2.method7078(arg1);
		@Pc(15) Class69[] local15 = arg2.method7080();
		@Pc(18) Class128[] local18 = arg2.method7071();
		if ((this.aClass5_Sub2_3 == null || this.aClass5_Sub2_3.aBoolean354) && (local15 != null || local18 != null)) {
			this.aClass5_Sub2_3 = Static202.method3777(Static508.anInt8998, true);
		}
		if (this.aClass5_Sub2_3 != null) {
			this.aClass5_Sub2_3.method3784(arg0, (long) Static508.anInt8998, local15, local18);
			this.aClass5_Sub2_3.method3790(super.aByte77, super.aShort78, super.aShort79, super.aShort80, super.aShort77);
		}
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8105() {
		return false;
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILclient!oa;)Lclient!gr;")
	@Override
	public Class122 method8106(@OriginalArg(1) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ct", name = "b", descriptor = "(IILclient!oa;I)Lclient!ba;")
	private Class23 method1687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9 arg2) {
		@Pc(14) Class212 local14 = Static355.aClass278_2.method6826(arg1);
		@Pc(19) Class62 local19 = Static53.aClass62Array2[super.aByte77];
		@Pc(34) Class62 local34 = this.anInt1873 < 3 ? Static53.aClass62Array2[this.anInt1873 + 1] : null;
		return this.aBoolean188 ? local14.method5185(local34, arg2, arg0, Static114.aClass156_2, super.anInt7347, -1, -1, local19, 0, super.anInt7351, super.anInt7350) : local14.method5185(local34, arg2, arg0, Static114.aClass156_2, super.anInt7347, this.anInt1877, this.anInt1880, local19, this.anInt1862, super.anInt7351, super.anInt7350);
	}

	@OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)V")
	public void method1688(@OriginalArg(1) int arg0) {
		if (this.aBoolean188) {
			return;
		}
		this.anInt1862 += arg0;
		while (this.anInt1862 > this.aClass16_1.anIntArray46[this.anInt1880]) {
			this.anInt1862 -= this.aClass16_1.anIntArray46[this.anInt1880];
			this.anInt1880++;
			if (this.anInt1880 >= this.aClass16_1.anIntArray47.length) {
				this.aBoolean188 = true;
				break;
			}
		}
		if (!this.aBoolean188) {
			Static360.method5794(super.anInt7347, this.aClass16_1, super.anInt7351, super.aByte77, this.anInt1880, false);
		}
	}
}
