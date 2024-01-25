import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class1_Sub8_Sub32 extends Class1_Sub8 {

	@OriginalMember(owner = "client!sj", name = "I", descriptor = "[I")
	public static final int[] anIntArray624 = new int[256];

	static {
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(38) int local38 = local35;
			for (@Pc(40) int local40 = 0; local40 < 8; local40++) {
				if ((local38 & 0x1) == 1) {
					local38 = local38 >>> 1 ^ 0xEDB88320;
				} else {
					local38 >>>= 0x1;
				}
			}
			anIntArray624[local35] = local38;
		}
	}

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
	public Class1_Sub8_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6031(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass225_41.method5085(arg0);
		if (super.aClass225_41.aBoolean421) {
			Static469.method6015(local17, 0, Static18.anInt439, Static134.anIntArray308[arg0]);
		}
		return local17;
	}
}
