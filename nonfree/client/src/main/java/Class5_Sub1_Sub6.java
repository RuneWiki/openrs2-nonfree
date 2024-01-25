import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public final class Class5_Sub1_Sub6 extends Class5_Sub1 {

	@OriginalMember(owner = "client!jda", name = "s", descriptor = "B")
	private byte aByte74;

	@OriginalMember(owner = "client!jda", name = "r", descriptor = "I")
	private int anInt5376 = -1;

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.method4106(this.anInt5376, this.aByte74);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		this.anInt5376 = arg0.method7860();
		this.aByte74 = arg0.method7861();
	}
}
