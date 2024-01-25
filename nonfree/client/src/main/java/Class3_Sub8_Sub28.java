import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class3_Sub8_Sub28 extends Class3_Sub8 {

	@OriginalMember(owner = "client!raa", name = "G", descriptor = "I")
	private int anInt8001;

	@OriginalMember(owner = "client!raa", name = "I", descriptor = "I")
	private int anInt8003;

	@OriginalMember(owner = "client!raa", name = "L", descriptor = "I")
	private int anInt8005;

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "(I)V")
	private Class3_Sub8_Sub28(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method6634(arg0);
	}

	@OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub28() {
		this(0);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.method6634(arg1.method7945());
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8774(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass326_41.method7329(arg0);
		if (super.aClass326_41.aBoolean628) {
			@Pc(28) int[] local28 = local11[0];
			@Pc(32) int[] local32 = local11[1];
			@Pc(36) int[] local36 = local11[2];
			for (@Pc(38) int local38 = 0; local38 < Static91.anInt1849; local38++) {
				local28[local38] = this.anInt8003;
				local32[local38] = this.anInt8001;
				local36[local38] = this.anInt8005;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BI)V")
	private void method6634(@OriginalArg(1) int arg0) {
		this.anInt8005 = (arg0 & 0xFF) << 4;
		this.anInt8003 = arg0 >> 12 & 0xFF0;
		this.anInt8001 = arg0 >> 4 & 0xFF0;
	}
}
