import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class14_Sub16_Sub1 extends Class14_Sub16 {

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[16384];

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "[F")
	public static final float[] aFloatArray8 = new float[16384];

	@OriginalMember(owner = "client!eh", name = "B", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	static {
		@Pc(66) double local66 = 3.834951969714103E-4D;
		for (@Pc(68) int local68 = 0; local68 < 16384; local68++) {
			aFloatArray8[local68] = (float) Math.sin(local66 * (double) local68);
			aFloatArray9[local68] = (float) Math.cos(local66 * (double) local68);
		}
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V")
	public Class14_Sub16_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
	public void method2008() {
		this.aNativeHeap1.a();
	}
}
