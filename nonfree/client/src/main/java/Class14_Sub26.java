import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class14_Sub26 extends Class14 {

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "[I")
	public static final int[] anIntArray516 = new int[32];

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
	public static int anInt9540;

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "[Lclient!ab;")
	public static final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "[I")
	public static final int[] anIntArray517;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "[B")
	public static final byte[] aByteArray88;

	static {
		@Pc(4) int local4 = 2;
		@Pc(6) int local6;
		for (local6 = 0; local6 < 32; local6++) {
			anIntArray516[local6] = local4 - 1;
			local4 += local4;
		}
		anInt9540 = 0;
		aClass2Array1 = new Class2[100];
		anIntArray517 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		local4 = 0;
		aByteArray88 = new byte[32896];
		for (local6 = 0; local6 < 256; local6++) {
			for (@Pc(115) int local115 = 0; local115 <= local6; local115++) {
				aByteArray88[local4++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local115 * local115 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!rd;)V")
	public Class14_Sub26(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(ILclient!rd;)V")
	public Class14_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(IB)I")
	@Override
	public int method8912(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)I")
	@Override
	protected int method8910() {
		return super.aClass3_Sub41_31.method6699().method8230() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	@Override
	public void method8906() {
		if (super.anInt10805 < 0 && super.anInt10805 > 4) {
			super.anInt10805 = this.method8910();
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IB)V")
	@Override
	protected void method8909(@OriginalArg(0) int arg0) {
		super.anInt10805 = arg0;
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)I")
	public int method7784() {
		return super.anInt10805;
	}
}
