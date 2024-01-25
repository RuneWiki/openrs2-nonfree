import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class220 {

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "[I")
	public static final int[] anIntArray415 = new int[256];

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "[I")
	public int[] anIntArray416;

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
			anIntArray415[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class220(@OriginalArg(0) Class34 arg0) {
		@Pc(6) byte[] local6 = arg0.method1255(6);
		this.method4760(new Class4_Sub11(local6));
		if (this.anIntArray416 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V")
	private Class220() {
		this.anIntArray416 = new int[0];
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLclient!es;)V")
	private void method4760(@OriginalArg(1) Class4_Sub11 arg0) {
		label19: while (true) {
			@Pc(14) int local14 = arg0.method8865();
			if (local14 != 0) {
				if (local14 != 1) {
					continue;
				}
				@Pc(28) int local28 = arg0.method8865();
				this.anIntArray416 = new int[local28];
				@Pc(34) int local34 = 0;
				while (true) {
					if (local34 >= this.anIntArray416.length) {
						continue label19;
					}
					this.anIntArray416[local34] = arg0.method8865();
					local34++;
				}
			}
			return;
		}
	}
}
