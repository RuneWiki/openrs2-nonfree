import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Ljava/lang/String;")
	private String aString70;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	private int anInt5432;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!tn;I)V")
	@Override
	public void method8290(@OriginalArg(0) Class342 arg0) {
		arg0.method7749(this.anInt5432, this.aString70);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLclient!dt;)V")
	@Override
	public void method8291(@OriginalArg(1) Class3_Sub4 arg0) {
		this.anInt5432 = arg0.method7895();
		this.aString70 = arg0.method7922();
	}
}
