import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public final class Class8_Sub30_Sub2 extends Class8_Sub30 {

	@OriginalMember(owner = "client!qea", name = "q", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap6;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(I)V")
	public Class8_Sub30_Sub2(@OriginalArg(0) int arg0) {
		this.aNativeHeap6 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
	public void method6850() {
		this.aNativeHeap6.b();
	}
}
