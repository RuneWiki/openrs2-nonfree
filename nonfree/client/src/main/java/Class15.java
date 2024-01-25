import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public final class Class15 {

	@OriginalMember(owner = "client!aja", name = "f", descriptor = "Lclient!nv;")
	private final Class33_Sub2_Sub1 aClass33_Sub2_Sub1_3;

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "I")
	public final int anInt207;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lclient!nv;II)V")
	public Class15(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass33_Sub2_Sub1_3 = arg0;
		this.anInt207 = arg2;
	}

	@OriginalMember(owner = "client!aja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub2_Sub1_3.method5749(this.anInt207);
		super.finalize();
	}
}
