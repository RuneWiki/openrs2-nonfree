import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class3_Sub26_Sub1 extends Class3_Sub26 {

	@OriginalMember(owner = "client!jh", name = "z", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap1;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
	public Class3_Sub26_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap1 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!jh", name = "f", descriptor = "(I)V")
	public void method2992() {
		this.aNativeHeap1.a();
	}
}
