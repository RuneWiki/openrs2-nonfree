import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public class Class2 implements Interface3 {

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!pm;")
	private Class125 aClass125_7 = new Class125(256);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!kb;")
	private Class83 aClass83_180;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!kb;")
	private Class83 aClass83_181;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "[Lclient!qc;")
	private Class128[] aClass128Array2;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!kb;Lclient!kb;Lclient!kb;)V")
	protected Class2(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class83 arg2) {
		this.aClass83_180 = arg2;
		this.aClass83_181 = arg1;
		@Pc(24) Class1_Sub16 local24 = new Class1_Sub16(arg0.method2306(0, 0));
		@Pc(28) int local28 = local24.method2652();
		this.aClass128Array2 = new Class128[local28];
		@Pc(34) int local34;
		for (local34 = 0; local34 < local28; local34++) {
			if (local24.method2655() == 1) {
				this.aClass128Array2[local34] = new Class128();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass128Array2[local34] != null) {
				this.aClass128Array2[local34].aBoolean254 = local24.method2655() == 0;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass128Array2[local34] != null) {
				this.aClass128Array2[local34].aBoolean256 = local24.method2655() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass128Array2[local34] != null) {
				this.aClass128Array2[local34].aBoolean251 = local24.method2655() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass128Array2[local34] != null) {
				this.aClass128Array2[local34].aBoolean253 = local24.method2655() == 1;
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass128Array2[local34] != null) {
				this.aClass128Array2[local34].aByte20 = local24.method2633();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass128Array2[local34] != null) {
				this.aClass128Array2[local34].aByte19 = local24.method2633();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass128Array2[local34] != null) {
				this.aClass128Array2[local34].aByte17 = local24.method2633();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass128Array2[local34] != null) {
				this.aClass128Array2[local34].aByte18 = local24.method2633();
			}
		}
		for (local34 = 0; local34 < local28; local34++) {
			if (this.aClass128Array2[local34] != null) {
				this.aClass128Array2[local34].aShort36 = (short) local24.method2652();
			}
		}
		if (local24.anInt3328 < local24.aByteArray39.length) {
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass128Array2[local34] != null) {
					local24.method2633();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass128Array2[local34] != null) {
					local24.method2633();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass128Array2[local34] != null) {
					local24.method2655();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass128Array2[local34] != null) {
					this.aClass128Array2[local34].aBoolean255 = local24.method2655() == 1;
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass128Array2[local34] != null) {
					local24.method2633();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass128Array2[local34] != null) {
					local24.method2655();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass128Array2[local34] != null) {
					local24.method2655();
				}
			}
			for (local34 = 0; local34 < local28; local34++) {
				if (this.aClass128Array2[local34] != null) {
					local24.method2655();
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "(II)Lclient!ef;")
	protected Class1_Sub2_Sub5 method4408(@OriginalArg(0) int arg0) {
		@Pc(6) Class1_Sub2 local6 = this.aClass125_7.method3669((long) arg0);
		if (local6 != null) {
			return (Class1_Sub2_Sub5) local6;
		}
		@Pc(22) byte[] local22 = this.aClass83_181.method2330(arg0);
		if (local22 == null) {
			return null;
		} else {
			@Pc(36) Class1_Sub2_Sub5 local36 = new Class1_Sub2_Sub5(new Class1_Sub16(local22));
			this.aClass125_7.method3671(local36, (long) arg0);
			return local36;
		}
	}

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "(II)Z")
	@Override
	public final boolean method4405(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub2_Sub5 local10 = this.method4408(arg0);
		return local10 != null && local10.method1162(this.aClass83_180, this);
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "(IB)Lclient!qc;")
	@Override
	public final Class128 method4404(@OriginalArg(0) int arg0) {
		return this.aClass128Array2[arg0];
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZBFII)[I")
	@Override
	public final int[] method4406(@OriginalArg(0) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method4408(arg3).method1155(this, false, this.aClass128Array2[arg3].aBoolean255, (double) arg1, arg2, arg0, this.aClass83_180);
	}
}
