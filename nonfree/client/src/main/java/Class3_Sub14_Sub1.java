import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public final class Class3_Sub14_Sub1 extends Class3_Sub14 {

	@OriginalMember(owner = "client!eia", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "(I)V")
	public Class3_Sub14_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Z)V")
	public void method2314() {
		this.aNativeHeap3.b();
	}
}
