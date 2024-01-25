import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!lb", name = "p", descriptor = "Lclient!bl;")
	public final Class30_Sub1_Sub1_Sub1 aClass30_Sub1_Sub1_Sub1_2;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class1_Sub27(@OriginalArg(0) Class30_Sub1_Sub1_Sub1 arg0) {
		this.aClass30_Sub1_Sub1_Sub1_2 = arg0;
	}
}
