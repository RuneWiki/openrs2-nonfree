import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class171 {

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "Lclient!ai;")
	private final Class16_Sub1_Sub1 aClass16_Sub1_Sub1_8;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "I")
	public final int anInt5758;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(Lclient!ai;II)V")
	public Class171(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass16_Sub1_Sub1_8 = arg0;
		this.anInt5758 = arg2;
	}

	@OriginalMember(owner = "client!kca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub1_Sub1_8.method753(this.anInt5758);
		super.finalize();
	}
}
