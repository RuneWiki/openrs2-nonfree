import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class164 implements Interface5 {

	@OriginalMember(owner = "client!in", name = "f", descriptor = "Lclient!qi;")
	private final Class282 aClass282_3 = new Class282(256);

	@OriginalMember(owner = "client!in", name = "b", descriptor = "Lclient!uu;")
	private final Class343 aClass343_124;

	@OriginalMember(owner = "client!in", name = "c", descriptor = "Lclient!uu;")
	private final Class343 aClass343_125;

	@OriginalMember(owner = "client!in", name = "h", descriptor = "I")
	private final int anInt4840;

	@OriginalMember(owner = "client!in", name = "j", descriptor = "[Lclient!vk;")
	private final Class355[] aClass355Array1;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;Lclient!uu;)V")
	public Class164(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1, @OriginalArg(2) Class343 arg2) {
		this.aClass343_124 = arg2;
		this.aClass343_125 = arg1;
		@Pc(24) Class3_Sub9 local24 = new Class3_Sub9(arg0.method8132(0, 0));
		this.anInt4840 = local24.method5610();
		this.aClass355Array1 = new Class355[this.anInt4840];
		for (@Pc(36) int local36 = 0; local36 < this.anInt4840; local36++) {
			if (local24.method5633() == 1) {
				this.aClass355Array1[local36] = new Class355();
			}
		}
		for (@Pc(61) int local61 = 0; local61 < this.anInt4840; local61++) {
			if (this.aClass355Array1[local61] != null) {
				this.aClass355Array1[local61].aBoolean743 = local24.method5633() == 0;
			}
		}
		for (@Pc(91) int local91 = 0; local91 < this.anInt4840; local91++) {
			if (this.aClass355Array1[local91] != null) {
				this.aClass355Array1[local91].aBoolean741 = local24.method5633() == 1;
			}
		}
		for (@Pc(118) int local118 = 0; local118 < this.anInt4840; local118++) {
			if (this.aClass355Array1[local118] != null) {
				this.aClass355Array1[local118].aBoolean742 = local24.method5633() == 1;
			}
		}
		for (@Pc(151) int local151 = 0; local151 < this.anInt4840; local151++) {
			if (this.aClass355Array1[local151] != null) {
				this.aClass355Array1[local151].aByte124 = local24.method5619();
			}
		}
		for (@Pc(177) int local177 = 0; local177 < this.anInt4840; local177++) {
			if (this.aClass355Array1[local177] != null) {
				this.aClass355Array1[local177].aByte121 = local24.method5619();
			}
		}
		for (@Pc(199) int local199 = 0; local199 < this.anInt4840; local199++) {
			if (this.aClass355Array1[local199] != null) {
				this.aClass355Array1[local199].aByte119 = local24.method5619();
			}
		}
		for (@Pc(221) int local221 = 0; local221 < this.anInt4840; local221++) {
			if (this.aClass355Array1[local221] != null) {
				this.aClass355Array1[local221].aByte120 = local24.method5619();
			}
		}
		for (@Pc(243) int local243 = 0; local243 < this.anInt4840; local243++) {
			if (this.aClass355Array1[local243] != null) {
				this.aClass355Array1[local243].aShort122 = (short) local24.method5610();
			}
		}
		for (@Pc(270) int local270 = 0; local270 < this.anInt4840; local270++) {
			if (this.aClass355Array1[local270] != null) {
				this.aClass355Array1[local270].aByte125 = local24.method5619();
			}
		}
		for (@Pc(292) int local292 = 0; local292 < this.anInt4840; local292++) {
			if (this.aClass355Array1[local292] != null) {
				this.aClass355Array1[local292].aByte122 = local24.method5619();
			}
		}
		for (@Pc(314) int local314 = 0; local314 < this.anInt4840; local314++) {
			if (this.aClass355Array1[local314] != null) {
				this.aClass355Array1[local314].aBoolean748 = local24.method5633() == 1;
			}
		}
		for (@Pc(345) int local345 = 0; local345 < this.anInt4840; local345++) {
			if (this.aClass355Array1[local345] != null) {
				this.aClass355Array1[local345].aBoolean745 = local24.method5633() == 1;
			}
		}
		for (@Pc(376) int local376 = 0; local376 < this.anInt4840; local376++) {
			if (this.aClass355Array1[local376] != null) {
				this.aClass355Array1[local376].aByte123 = local24.method5619();
			}
		}
		for (@Pc(398) int local398 = 0; local398 < this.anInt4840; local398++) {
			if (this.aClass355Array1[local398] != null) {
				this.aClass355Array1[local398].aBoolean744 = local24.method5633() == 1;
			}
		}
		for (@Pc(431) int local431 = 0; local431 < this.anInt4840; local431++) {
			if (this.aClass355Array1[local431] != null) {
				this.aClass355Array1[local431].aBoolean747 = local24.method5633() == 1;
			}
		}
		for (@Pc(460) int local460 = 0; local460 < this.anInt4840; local460++) {
			if (this.aClass355Array1[local460] != null) {
				this.aClass355Array1[local460].aBoolean746 = local24.method5633() == 1;
			}
		}
		for (@Pc(491) int local491 = 0; local491 < this.anInt4840; local491++) {
			if (this.aClass355Array1[local491] != null) {
				this.aClass355Array1[local491].anInt9794 = local24.method5633();
			}
		}
		for (@Pc(513) int local513 = 0; local513 < this.anInt4840; local513++) {
			if (this.aClass355Array1[local513] != null) {
				this.aClass355Array1[local513].anInt9795 = local24.method5585();
			}
		}
		for (@Pc(535) int local535 = 0; local535 < this.anInt4840; local535++) {
			if (this.aClass355Array1[local535] != null) {
				this.aClass355Array1[local535].anInt9790 = local24.method5633();
			}
		}
	}

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(II)Lclient!ia;")
	private Class3_Sub7_Sub12 method4134(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub7 local10 = this.aClass282_3.method6855((long) arg0);
		if (local10 != null) {
			return (Class3_Sub7_Sub12) local10;
		}
		@Pc(21) byte[] local21 = this.aClass343_125.method8143(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(38) Class3_Sub7_Sub12 local38 = new Class3_Sub7_Sub12(new Class3_Sub9(local21));
			this.aClass282_3.method6850(local38, (long) arg0);
			return local38;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)I")
	@Override
	public int method4128() {
		return this.anInt4840;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IZ)Z")
	@Override
	public boolean method4130(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub7_Sub12 local15 = this.method4134(arg0);
		return local15 != null && local15.method3901(this, this.aClass343_124);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(FIIIZI)[F")
	@Override
	public float[] method4132(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method4134(arg1).method3902(this.aClass355Array1[arg1].aBoolean745, arg2, arg3, this.aClass343_124, this);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIFIIZ)[I")
	@Override
	public int[] method4127(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		return this.method4134(arg0).method3903((double) arg1, arg4, this.aClass355Array1[arg0].aBoolean745, this.aClass343_124, this, arg2, arg3);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IBIZIF)[I")
	@Override
	public int[] method4131(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method4134(arg2).method3906((double) arg3, arg0, this.aClass343_124, arg1, this.aClass355Array1[arg2].aBoolean745, this);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Lclient!vk;")
	@Override
	public Class355 method4129(@OriginalArg(0) int arg0) {
		return this.aClass355Array1[arg0];
	}
}
