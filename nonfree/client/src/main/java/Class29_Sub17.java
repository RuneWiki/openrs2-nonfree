import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class29_Sub17 extends Class29 {

	@OriginalMember(owner = "client!no", name = "i", descriptor = "[I")
	public static final int[] anIntArray426 = new int[128];

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray426.length; local4++) {
			anIntArray426[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray426[local20] = local20 - 65;
		}
		for (@Pc(35) int local35 = 97; local35 <= 122; local35++) {
			anIntArray426[local35] = local35 - 71;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray426[local50] = local50 + 4;
		}
		anIntArray426[45] = anIntArray426[47] = 63;
		anIntArray426[42] = anIntArray426[43] = 62;
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
		Static320.method4599(super.anInt10604);
	}

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29_Sub17(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
		Static320.method4599(super.anInt10604);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(II)I")
	@Override
	public int method8994(@OriginalArg(0) int arg0) {
		return super.aClass6_Sub22_31.method2368().method4181() < 96 ? 3 : 1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
	@Override
	protected int method8997() {
		return super.aClass6_Sub22_31.method2368().method4181() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!no", name = "d", descriptor = "(II)V")
	@Override
	protected void method9000(@OriginalArg(0) int arg0) {
		super.anInt10604 = arg0;
		Static320.method4599(super.anInt10604);
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(B)I")
	public int method5777() {
		return super.anInt10604;
	}

	@OriginalMember(owner = "client!no", name = "c", descriptor = "(I)Z")
	public boolean method5778() {
		return super.aClass6_Sub22_31.method2368().method4181() >= 96;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	@Override
	public void method8995() {
		if (super.aClass6_Sub22_31.method2368().method4181() < 96) {
			super.anInt10604 = 0;
		}
		if (super.anInt10604 < 0 || super.anInt10604 > 2) {
			super.anInt10604 = this.method8997();
		}
	}
}
