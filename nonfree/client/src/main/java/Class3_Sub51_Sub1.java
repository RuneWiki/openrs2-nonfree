import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public final class Class3_Sub51_Sub1 extends Class3_Sub51 {

	@OriginalMember(owner = "client!vu", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(I)V")
	public Class3_Sub51_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
	public void method8725() {
		this.aNativeHeap5.b();
	}
}
