import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kia")
public final class Class14_Sub14 extends Class14 {

	@OriginalMember(owner = "client!kia", name = "w", descriptor = "[I")
	public static final int[] anIntArray364 = new int[128];

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray364.length; local4++) {
			anIntArray364[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray364[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray364[local33] = local33 + 26 - 97;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray364[local48] = local48 + 52 - 48;
		}
		anIntArray364[42] = anIntArray364[43] = 62;
		anIntArray364[45] = anIntArray364[47] = 63;
	}

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14_Sub14(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(I)I")
	@Override
	protected int method9029() {
		return 0;
	}

	@OriginalMember(owner = "client!kia", name = "d", descriptor = "(I)I")
	public int method5289() {
		return super.anInt10835;
	}

	@OriginalMember(owner = "client!kia", name = "e", descriptor = "(I)Z")
	public boolean method5290() {
		@Pc(17) int local17 = super.aClass2_Sub13_31.method2606().method7486();
		return local17 >= 96;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(Z)V")
	@Override
	public void method9035() {
		@Pc(10) int local10 = super.aClass2_Sub13_31.method2606().method7486();
		if (local10 < 96) {
			super.anInt10835 = 0;
		}
		if (super.anInt10835 > 1 && local10 < 128) {
			super.anInt10835 = 1;
		}
		if (super.anInt10835 > 2 && local10 < 192) {
			super.anInt10835 = 2;
		}
		if (super.anInt10835 < 0 || super.anInt10835 > 3) {
			super.anInt10835 = this.method9029();
		}
	}

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "(II)I")
	@Override
	public int method9033(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = super.aClass2_Sub13_31.method2606().method7486();
		if (local12 < 96) {
			return 3;
		} else if (arg0 > 1 && local12 < 128) {
			return 3;
		} else if (arg0 > 3 && local12 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(II)V")
	@Override
	protected void method9031(@OriginalArg(1) int arg0) {
		super.anInt10835 = arg0;
	}
}
