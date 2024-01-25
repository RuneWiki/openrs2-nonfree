import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public final class Class3_Sub16_Sub1 extends Class3_Sub16 {

	@OriginalMember(owner = "client!lg", name = "m", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap4;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(I)V")
	public Class3_Sub16_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap4 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
	public void method4727() {
		this.aNativeHeap4.a();
	}
}
