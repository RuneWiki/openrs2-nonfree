import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class4_Sub18 extends Class4 {

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "[I")
	public static final int[] anIntArray328 = new int[128];

	static {
		for (@Pc(10) int local10 = 0; local10 < anIntArray328.length; local10++) {
			anIntArray328[local10] = -1;
		}
		for (@Pc(26) int local26 = 65; local26 <= 90; local26++) {
			anIntArray328[local26] = local26 - 65;
		}
		for (@Pc(39) int local39 = 97; local39 <= 122; local39++) {
			anIntArray328[local39] = local39 + 26 - 97;
		}
		for (@Pc(54) int local54 = 48; local54 <= 57; local54++) {
			anIntArray328[local54] = local54 + 52 - 48;
		}
		anIntArray328[45] = anIntArray328[47] = 63;
		anIntArray328[42] = anIntArray328[43] = 62;
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub18(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub54_31.method9551()) {
			return 3;
		} else if (super.aClass2_Sub54_31.aClass4_Sub21_1.method6610() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (super.aClass2_Sub54_31.method9551()) {
			super.anInt10787 = 0;
		}
		if (super.aClass2_Sub54_31.aClass4_Sub21_1.method6610() == 0) {
			super.anInt10787 = 0;
		}
		if (super.anInt10787 < 0 || super.anInt10787 > 2) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)Z")
	public boolean method6162() {
		if (super.aClass2_Sub54_31.method9551()) {
			return false;
		} else {
			return super.aClass2_Sub54_31.aClass4_Sub21_1.method6610() != 0;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return 2;
	}

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "(I)I")
	public int method6164() {
		return super.anInt10787;
	}
}
