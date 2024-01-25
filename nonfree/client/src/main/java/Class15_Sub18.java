import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class15_Sub18 extends Class15 {

	@OriginalMember(owner = "client!mn", name = "n", descriptor = "[I")
	public static final int[] anIntArray412 = new int[128];

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray412.length; local4++) {
			anIntArray412[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray412[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray412[local33] = local33 - 71;
		}
		for (@Pc(46) int local46 = 48; local46 <= 57; local46++) {
			anIntArray412[local46] = local46 + 52 - 48;
		}
		anIntArray412[45] = anIntArray412[47] = 63;
		anIntArray412[42] = anIntArray412[43] = 62;
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub18(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (super.anInt10701 < 0 && super.anInt10701 > 127) {
			super.anInt10701 = this.method8986();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return 127;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I")
	public int method5678() {
		return super.anInt10701;
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}
}
