import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class18_Sub2_Sub2 extends Class18_Sub2 {

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "[Lclient!mm;")
	private static final Class224[] aClass224Array1 = new Class224[32];

	@OriginalMember(owner = "client!re", name = "N", descriptor = "[B")
	private byte[] aByteArray90;

	static {
		@Pc(83) Class224[] local83 = Static177.method3201();
		for (@Pc(85) int local85 = 0; local85 < local83.length; local85++) {
			aClass224Array1[local83[local85].anInt6057] = local83[local85];
		}
	}

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V")
	public Class18_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method7250(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(15) int local15 = arg1 & 0xFF;
		@Pc(18) int local18 = local7;
		@Pc(19) int local19 = local7 + 1;
		this.aByteArray90[local18] = -1;
		this.aByteArray90[local19] = (byte) (local15 * 3 >> 5);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)[B")
	public byte[] method7254() {
		this.aByteArray90 = new byte[524288];
		this.method7247();
		return this.aByteArray90;
	}
}
