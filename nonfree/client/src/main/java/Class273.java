import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qga")
public final class Class273 implements Interface5 {

	@OriginalMember(owner = "client!qga", name = "h", descriptor = "Lclient!ut;")
	private final Class345 aClass345_4 = new Class345(256);

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "Lclient!kha;")
	private final Class181 aClass181_88;

	@OriginalMember(owner = "client!qga", name = "l", descriptor = "Lclient!kha;")
	private final Class181 aClass181_89;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
	private final int anInt8296;

	@OriginalMember(owner = "client!qga", name = "s", descriptor = "[Lclient!je;")
	private final Class156[] aClass156Array1;

	@OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lclient!kha;Lclient!kha;Lclient!kha;)V")
	public Class273(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class181 arg2) {
		this.aClass181_88 = arg1;
		this.aClass181_89 = arg2;
		@Pc(24) Class3_Sub15 local24 = new Class3_Sub15(arg0.method5023(0, 0));
		this.anInt8296 = local24.method8414();
		this.aClass156Array1 = new Class156[this.anInt8296];
		for (@Pc(36) int local36 = 0; local36 < this.anInt8296; local36++) {
			if (local24.method8401() == 1) {
				this.aClass156Array1[local36] = new Class156();
			}
		}
		for (@Pc(63) int local63 = 0; local63 < this.anInt8296; local63++) {
			if (this.aClass156Array1[local63] != null) {
				this.aClass156Array1[local63].aBoolean497 = local24.method8401() == 0;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt8296; local92++) {
			if (this.aClass156Array1[local92] != null) {
				this.aClass156Array1[local92].aBoolean494 = local24.method8401() == 1;
			}
		}
		for (@Pc(125) int local125 = 0; local125 < this.anInt8296; local125++) {
			if (this.aClass156Array1[local125] != null) {
				this.aClass156Array1[local125].aBoolean496 = local24.method8401() == 1;
			}
		}
		for (@Pc(156) int local156 = 0; local156 < this.anInt8296; local156++) {
			if (this.aClass156Array1[local156] != null) {
				this.aClass156Array1[local156].aByte74 = local24.method8440();
			}
		}
		for (@Pc(182) int local182 = 0; local182 < this.anInt8296; local182++) {
			if (this.aClass156Array1[local182] != null) {
				this.aClass156Array1[local182].aByte71 = local24.method8440();
			}
		}
		for (@Pc(204) int local204 = 0; local204 < this.anInt8296; local204++) {
			if (this.aClass156Array1[local204] != null) {
				this.aClass156Array1[local204].aByte69 = local24.method8440();
			}
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt8296; local226++) {
			if (this.aClass156Array1[local226] != null) {
				this.aClass156Array1[local226].aByte72 = local24.method8440();
			}
		}
		for (@Pc(248) int local248 = 0; local248 < this.anInt8296; local248++) {
			if (this.aClass156Array1[local248] != null) {
				this.aClass156Array1[local248].aShort82 = (short) local24.method8414();
			}
		}
		for (@Pc(275) int local275 = 0; local275 < this.anInt8296; local275++) {
			if (this.aClass156Array1[local275] != null) {
				this.aClass156Array1[local275].aByte68 = local24.method8440();
			}
		}
		for (@Pc(301) int local301 = 0; local301 < this.anInt8296; local301++) {
			if (this.aClass156Array1[local301] != null) {
				this.aClass156Array1[local301].aByte73 = local24.method8440();
			}
		}
		for (@Pc(327) int local327 = 0; local327 < this.anInt8296; local327++) {
			if (this.aClass156Array1[local327] != null) {
				this.aClass156Array1[local327].aBoolean493 = local24.method8401() == 1;
			}
		}
		for (@Pc(360) int local360 = 0; local360 < this.anInt8296; local360++) {
			if (this.aClass156Array1[local360] != null) {
				this.aClass156Array1[local360].aBoolean491 = local24.method8401() == 1;
			}
		}
		for (@Pc(391) int local391 = 0; local391 < this.anInt8296; local391++) {
			if (this.aClass156Array1[local391] != null) {
				this.aClass156Array1[local391].aByte70 = local24.method8440();
			}
		}
		for (@Pc(417) int local417 = 0; local417 < this.anInt8296; local417++) {
			if (this.aClass156Array1[local417] != null) {
				this.aClass156Array1[local417].aBoolean492 = local24.method8401() == 1;
			}
		}
		for (@Pc(444) int local444 = 0; local444 < this.anInt8296; local444++) {
			if (this.aClass156Array1[local444] != null) {
				this.aClass156Array1[local444].aBoolean495 = local24.method8401() == 1;
			}
		}
		for (@Pc(475) int local475 = 0; local475 < this.anInt8296; local475++) {
			if (this.aClass156Array1[local475] != null) {
				this.aClass156Array1[local475].aBoolean498 = local24.method8401() == 1;
			}
		}
		for (@Pc(506) int local506 = 0; local506 < this.anInt8296; local506++) {
			if (this.aClass156Array1[local506] != null) {
				this.aClass156Array1[local506].anInt5676 = local24.method8401();
			}
		}
		for (@Pc(532) int local532 = 0; local532 < this.anInt8296; local532++) {
			if (this.aClass156Array1[local532] != null) {
				this.aClass156Array1[local532].anInt5678 = local24.method8402();
			}
		}
		for (@Pc(558) int local558 = 0; local558 < this.anInt8296; local558++) {
			if (this.aClass156Array1[local558] != null) {
				this.aClass156Array1[local558].anInt5679 = local24.method8401();
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)Lclient!je;")
	@Override
	public Class156 method6869(@OriginalArg(1) int arg0) {
		return this.aClass156Array1[arg0];
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6867(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub1_Sub13 local8 = this.method6875(arg0);
		return local8 != null && local8.method5172(this, this.aClass181_89);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)I")
	@Override
	public int method6872() {
		return this.anInt8296;
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIFZI)[F")
	@Override
	public float[] method6871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method6875(arg1).method5174(this, arg3, arg0, this.aClass181_89, this.aClass156Array1[arg1].aBoolean491);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZI)Lclient!kt;")
	private Class3_Sub1_Sub13 method6875(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1 local10 = this.aClass345_4.method8056((long) arg0);
		if (local10 != null) {
			return (Class3_Sub1_Sub13) local10;
		}
		@Pc(21) byte[] local21 = this.aClass181_88.method5049(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class3_Sub1_Sub13 local38 = new Class3_Sub1_Sub13(new Class3_Sub15(local21));
			this.aClass345_4.method8058(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZFIIII)[I")
	@Override
	public int[] method6868(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		return this.method6875(arg3).method5173(arg0, this.aClass156Array1[arg3].aBoolean491, arg2, this, this.aClass181_89, arg4, (double) arg1);
	}

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IFIIIZ)[I")
	@Override
	public int[] method6870(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		return this.method6875(arg0).method5170(this.aClass156Array1[arg0].aBoolean491, arg3, this, (double) arg1, arg2, this.aClass181_89);
	}
}
