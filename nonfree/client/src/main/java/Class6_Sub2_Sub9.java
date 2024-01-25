import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class6_Sub2_Sub9 extends Class6_Sub2 {

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public final int anInt5462;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "Lclient!sea;")
	public final Interface21 anInterface21_3;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!sea;I)V")
	protected Class6_Sub2_Sub9(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) int arg1) {
		this.anInt5462 = arg1;
		this.anInterface21_3 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method4703();

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)Z")
	public abstract boolean method4705();
}
