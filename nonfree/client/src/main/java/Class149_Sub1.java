import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public final class Class149_Sub1 extends Class149 implements Interface19 {

	@OriginalMember(owner = "client!iv", name = "y", descriptor = "[I")
	public static final int[] anIntArray229 = new int[256];

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
	private int anInt5512;

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
			anIntArray229[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!ac;ILclient!jaclib/memory/Buffer;IZ)V")
	public Class149_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Buffer arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5512 = arg1;
	}

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lclient!ac;I[BIZ)V")
	public Class149_Sub1(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34962, arg2, arg3, arg4);
		this.anInt5512 = arg1;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method7395(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		this.method6030(arg0, arg1);
		this.anInt5512 = arg2;
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)J")
	@Override
	public long method7393() {
		return 0L;
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)I")
	@Override
	public int method7396() {
		return this.anInt5512;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)I")
	@Override
	public int method7394() {
		return super.anInt7207;
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)V")
	@Override
	protected void method6025() {
		super.aClass5_Sub1_27.method376(this);
	}
}
