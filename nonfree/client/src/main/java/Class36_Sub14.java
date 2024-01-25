import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ku")
public final class Class36_Sub14 extends Class36 {

	@OriginalMember(owner = "client!ku", name = "l", descriptor = "[I")
	public static final int[] anIntArray351 = new int[128];

	static {
		for (@Pc(8) int local8 = 0; local8 < anIntArray351.length; local8++) {
			anIntArray351[local8] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray351[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray351[local33] = local33 + 26 - 97;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray351[local50] = local50 + 4;
		}
		anIntArray351[45] = anIntArray351[47] = 63;
		anIntArray351[42] = anIntArray351[43] = 62;
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub14(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		if (super.aClass8_Sub25_31.method3471()) {
			return 3;
		} else if (super.aClass8_Sub25_31.aClass36_Sub17_1.method5459() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
	public int method4894() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Z")
	public boolean method4896() {
		if (super.aClass8_Sub25_31.method3471()) {
			return false;
		} else {
			return super.aClass8_Sub25_31.aClass36_Sub17_1.method5459() != 0;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (super.aClass8_Sub25_31.method3471()) {
			super.anInt10496 = 0;
		}
		if (super.aClass8_Sub25_31.aClass36_Sub17_1.method5459() == 0) {
			super.anInt10496 = 0;
		}
		if (super.anInt10496 < 0 || super.anInt10496 > 2) {
			super.anInt10496 = this.method8464();
		}
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return 2;
	}
}
