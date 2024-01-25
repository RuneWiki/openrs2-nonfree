import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class249 implements Interface11 {

	@OriginalMember(owner = "client!qca", name = "m", descriptor = "Lclient!ak;")
	private final Class14 aClass14_2 = new Class14(256);

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "Lclient!an;")
	private final Class16 aClass16_95;

	@OriginalMember(owner = "client!qca", name = "f", descriptor = "Lclient!an;")
	private final Class16 aClass16_94;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
	private final int anInt7446;

	@OriginalMember(owner = "client!qca", name = "n", descriptor = "[Lclient!sr;")
	private final Class278[] aClass278Array1;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!an;Lclient!an;Lclient!an;)V")
	public Class249(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class16 arg2) {
		this.aClass16_95 = arg2;
		this.aClass16_94 = arg1;
		@Pc(24) Class12_Sub8 local24 = new Class12_Sub8(arg0.method408(0, 0));
		this.anInt7446 = local24.method5199();
		this.aClass278Array1 = new Class278[this.anInt7446];
		for (@Pc(36) int local36 = 0; local36 < this.anInt7446; local36++) {
			if (local24.method5216() == 1) {
				this.aClass278Array1[local36] = new Class278();
			}
		}
		for (@Pc(57) int local57 = 0; local57 < this.anInt7446; local57++) {
			if (this.aClass278Array1[local57] != null) {
				this.aClass278Array1[local57].aBoolean568 = local24.method5216() == 0;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < this.anInt7446; local86++) {
			if (this.aClass278Array1[local86] != null) {
				this.aClass278Array1[local86].aBoolean571 = local24.method5216() == 1;
			}
		}
		for (@Pc(117) int local117 = 0; local117 < this.anInt7446; local117++) {
			if (this.aClass278Array1[local117] != null) {
				this.aClass278Array1[local117].aBoolean567 = local24.method5216() == 1;
			}
		}
		for (@Pc(144) int local144 = 0; local144 < this.anInt7446; local144++) {
			if (this.aClass278Array1[local144] != null) {
				this.aClass278Array1[local144].aBoolean573 = local24.method5216() == 1;
			}
		}
		for (@Pc(177) int local177 = 0; local177 < this.anInt7446; local177++) {
			if (this.aClass278Array1[local177] != null) {
				this.aClass278Array1[local177].aByte85 = local24.method5173();
			}
		}
		for (@Pc(203) int local203 = 0; local203 < this.anInt7446; local203++) {
			if (this.aClass278Array1[local203] != null) {
				this.aClass278Array1[local203].aByte84 = local24.method5173();
			}
		}
		for (@Pc(225) int local225 = 0; local225 < this.anInt7446; local225++) {
			if (this.aClass278Array1[local225] != null) {
				this.aClass278Array1[local225].aByte87 = local24.method5173();
			}
		}
		for (@Pc(251) int local251 = 0; local251 < this.anInt7446; local251++) {
			if (this.aClass278Array1[local251] != null) {
				this.aClass278Array1[local251].aByte83 = local24.method5173();
			}
		}
		for (@Pc(273) int local273 = 0; local273 < this.anInt7446; local273++) {
			if (this.aClass278Array1[local273] != null) {
				this.aClass278Array1[local273].aShort96 = (short) local24.method5199();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < this.anInt7446; local296++) {
			if (this.aClass278Array1[local296] != null) {
				this.aClass278Array1[local296].aByte82 = local24.method5173();
			}
		}
		for (@Pc(318) int local318 = 0; local318 < this.anInt7446; local318++) {
			if (this.aClass278Array1[local318] != null) {
				this.aClass278Array1[local318].aByte88 = local24.method5173();
			}
		}
		for (@Pc(344) int local344 = 0; local344 < this.anInt7446; local344++) {
			if (this.aClass278Array1[local344] != null) {
				this.aClass278Array1[local344].aBoolean572 = local24.method5216() == 1;
			}
		}
		for (@Pc(371) int local371 = 0; local371 < this.anInt7446; local371++) {
			if (this.aClass278Array1[local371] != null) {
				this.aClass278Array1[local371].aBoolean566 = local24.method5216() == 1;
			}
		}
		for (@Pc(400) int local400 = 0; local400 < this.anInt7446; local400++) {
			if (this.aClass278Array1[local400] != null) {
				this.aClass278Array1[local400].aByte86 = local24.method5173();
			}
		}
		for (@Pc(422) int local422 = 0; local422 < this.anInt7446; local422++) {
			if (this.aClass278Array1[local422] != null) {
				this.aClass278Array1[local422].aBoolean574 = local24.method5216() == 1;
			}
		}
		for (@Pc(453) int local453 = 0; local453 < this.anInt7446; local453++) {
			if (this.aClass278Array1[local453] != null) {
				this.aClass278Array1[local453].aBoolean570 = local24.method5216() == 1;
			}
		}
		for (@Pc(480) int local480 = 0; local480 < this.anInt7446; local480++) {
			if (this.aClass278Array1[local480] != null) {
				this.aClass278Array1[local480].aBoolean575 = local24.method5216() == 1;
			}
		}
		for (@Pc(509) int local509 = 0; local509 < this.anInt7446; local509++) {
			if (this.aClass278Array1[local509] != null) {
				this.aClass278Array1[local509].anInt8273 = local24.method5216();
			}
		}
		for (@Pc(531) int local531 = 0; local531 < this.anInt7446; local531++) {
			if (this.aClass278Array1[local531] != null) {
				this.aClass278Array1[local531].anInt8271 = local24.method5225();
			}
		}
		for (@Pc(553) int local553 = 0; local553 < this.anInt7446; local553++) {
			if (this.aClass278Array1[local553] != null) {
				this.aClass278Array1[local553].aBoolean569 = local24.method5216() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)I")
	@Override
	public int method6214() {
		return this.anInt7446;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6213(@OriginalArg(0) int arg0) {
		@Pc(8) Class12_Sub4_Sub14 local8 = this.method6216(arg0);
		return local8 != null && local8.method5721(this.aClass16_95, this);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZIIIIF)[I")
	@Override
	public int[] method6211(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4) {
		return this.method6216(arg1).method5724(this, arg2, arg0, this.aClass16_95, arg3, (double) arg4, this.aClass278Array1[arg1].aBoolean566);
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(BI)Lclient!pb;")
	private Class12_Sub4_Sub14 method6216(@OriginalArg(1) int arg0) {
		@Pc(10) Class12_Sub4 local10 = this.aClass14_2.method357((long) arg0);
		if (local10 != null) {
			return (Class12_Sub4_Sub14) local10;
		}
		@Pc(21) byte[] local21 = this.aClass16_94.method410(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(45) Class12_Sub4_Sub14 local45 = new Class12_Sub4_Sub14(new Class12_Sub8(local21));
			this.aClass14_2.method359((long) arg0, local45);
			return local45;
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(BI)Lclient!sr;")
	@Override
	public Class278 method6215(@OriginalArg(1) int arg0) {
		return this.aClass278Array1[arg0];
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZFIIIB)[I")
	@Override
	public int[] method6210(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method6216(arg2).method5720(this, this.aClass278Array1[arg2].aBoolean566, arg1, arg3, (double) arg0, this.aClass16_95);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIBIZF)[F")
	@Override
	public float[] method6212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3) {
		return this.method6216(arg0).method5719(this.aClass16_95, arg1, this, this.aClass278Array1[arg0].aBoolean566, arg2);
	}
}
