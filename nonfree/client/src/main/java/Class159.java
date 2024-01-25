import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public final class Class159 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_29;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	public final int anInt4790;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!hj;I[Lclient!dk;)V")
	public Class159(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40[] arg2) {
		this.aClass2_Sub1_29 = arg0;
		this.anInt4790 = arg1;
	}

	@OriginalMember(owner = "client!q", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass2_Sub1_29.method2319(this.anInt4790);
		super.finalize();
	}
}
