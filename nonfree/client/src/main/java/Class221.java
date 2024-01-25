import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class221 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
	public final int anInt6313;

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_38;

	static {
		new Class174("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
	}

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!nq;II)V")
	public Class221(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6313 = arg2;
		this.aClass167_Sub1_38 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass167_Sub1_38.method3999(this.anInt6313);
		super.finalize();
	}
}
