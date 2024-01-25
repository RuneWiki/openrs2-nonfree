import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public abstract class Class7_Sub4 extends Class7 {

	@OriginalMember(owner = "client!eh", name = "m", descriptor = "[Lclient!ku;")
	public static final Class138[] aClass138Array4 = new Class138[5];

	@OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
	protected int anInt6147;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
	protected final int anInt6142;

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
	protected int anInt6143;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
	public final int anInt6144;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass138Array4.length; local4++) {
			aClass138Array4[local4] = new Class138();
		}
	}

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIII)V")
	protected Class7_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt6147 = arg0;
		this.anInt6142 = arg1;
		this.anInt6143 = arg2;
		this.anInt6144 = arg3;
	}
}
