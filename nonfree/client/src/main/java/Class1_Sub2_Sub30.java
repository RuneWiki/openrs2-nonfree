import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class1_Sub2_Sub30 extends Class1_Sub2 {

	@OriginalMember(owner = "client!pc", name = "L", descriptor = "[I")
	public static final int[] anIntArray562 = new int[256];

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
	private int anInt4580;

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
	private int anInt4581;

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
	private int anInt4584;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray562[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub30(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4053(arg0);
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub30() {
		this(0);
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V")
	private void method4053(@OriginalArg(1) int arg0) {
		this.anInt4581 = arg0 >> 4 & 0xFF0;
		this.anInt4584 = arg0 >> 12 & 0xFF0;
		this.anInt4580 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.method4053(arg1.method5159());
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(23) int[] local23 = local11[0];
			@Pc(27) int[] local27 = local11[1];
			@Pc(31) int[] local31 = local11[2];
			for (@Pc(33) int local33 = 0; local33 < Static158.anInt2658; local33++) {
				local23[local33] = this.anInt4584;
				local27[local33] = this.anInt4581;
				local31[local33] = this.anInt4580;
			}
		}
		return local11;
	}
}
