import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public final class Class3_Sub17_Sub13 extends Class3_Sub17 {

	@OriginalMember(owner = "client!vl", name = "m", descriptor = "Ljava/lang/String;")
	private String aString128;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ika;Z)V")
	@Override
	public void method9119(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aString128 = arg0.method2014();
		arg0.method2036();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BLclient!eaa;)V")
	@Override
	public void method9118(@OriginalArg(1) Class84 arg0) {
		arg0.aString45 = this.aString128;
	}
}
