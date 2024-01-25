import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class25 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_5;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public final int anInt481;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!hd;II)V")
	public Class25(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass89_Sub1_5 = arg0;
		this.anInt481 = arg2;
	}

	@OriginalMember(owner = "client!bh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass89_Sub1_5.method2463(this.anInt481);
		super.finalize();
	}
}
