import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class193 {

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "I")
	public final int anInt5132;

	@OriginalMember(owner = "client!kfa", name = "g", descriptor = "Lclient!sha;")
	private final Class95_Sub1_Sub1 aClass95_Sub1_Sub1_5;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!sha;II)V")
	public Class193(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5132 = arg2;
		this.aClass95_Sub1_Sub1_5 = arg0;
	}

	@OriginalMember(owner = "client!kfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub1_Sub1_5.method7301(this.anInt5132);
		super.finalize();
	}
}
