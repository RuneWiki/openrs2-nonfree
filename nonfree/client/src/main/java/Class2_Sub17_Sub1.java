import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class2_Sub17_Sub1 extends Class2_Sub17 {

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "Lclient!jaggl/memory/NativeHeap;")
	public final NativeHeap aNativeHeap2;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I)V")
	public Class2_Sub17_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap2 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
	public void method2526() {
		this.aNativeHeap2.b();
	}
}
