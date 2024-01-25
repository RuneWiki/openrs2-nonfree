import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class3_Sub27_Sub1 extends Class3_Sub27 {

	@OriginalMember(owner = "client!rl", name = "y", descriptor = "[B")
	public static final byte[] aByteArray70 = new byte[32896];

	@OriginalMember(owner = "client!rl", name = "A", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray70[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(I)V")
	public Class3_Sub27_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
	public void method4973() {
		this.aNativeHeap2.b();
	}
}
