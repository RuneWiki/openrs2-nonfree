import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class3_Sub17_Sub1 extends Class3_Sub17 {

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	public final NativeHeap aNativeHeap3;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(I)V")
	public Class3_Sub17_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap3 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
	public void method2002() {
		this.aNativeHeap3.b();
	}
}
