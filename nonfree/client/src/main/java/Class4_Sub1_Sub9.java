import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class Class4_Sub1_Sub9 extends Class4_Sub1 {

	@OriginalMember(owner = "client!mh", name = "E", descriptor = "Lclient!bq;")
	public final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
	public final int anInt3025;

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lclient!bq;I)V")
	protected Class4_Sub1_Sub9(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1) {
		this.anInterface2_3 = arg0;
		this.anInt3025 = arg1;
	}

	@OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)Z")
	public abstract boolean method2567();

	@OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method2571();
}
