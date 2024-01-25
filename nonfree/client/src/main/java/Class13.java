import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public final class Class13 {

	@OriginalMember(owner = "client!an", name = "b", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_3;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "I")
	public final int anInt232;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Lclient!bl;II)V")
	public Class13(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass28_Sub1_3 = arg0;
		this.anInt232 = arg2;
	}

	@OriginalMember(owner = "client!an", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass28_Sub1_3.method700(this.anInt232);
		super.finalize();
	}
}
