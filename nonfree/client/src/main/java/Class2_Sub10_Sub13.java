import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public final class Class2_Sub10_Sub13 extends Class2_Sub10 {

	@OriginalMember(owner = "client!vja", name = "q", descriptor = "Z")
	private boolean aBoolean907;

	@OriginalMember(owner = "client!vja", name = "p", descriptor = "B")
	private byte aByte141;

	@OriginalMember(owner = "client!vja", name = "x", descriptor = "B")
	private byte aByte142;

	@OriginalMember(owner = "client!vja", name = "w", descriptor = "B")
	private byte aByte143;

	@OriginalMember(owner = "client!vja", name = "r", descriptor = "B")
	private byte aByte144;

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.aByte149 = this.aByte143;
		arg0.aByte148 = this.aByte144;
		arg0.aBoolean923 = this.aBoolean907;
		arg0.aByte147 = this.aByte142;
		arg0.aByte150 = this.aByte141;
	}

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		this.aBoolean907 = arg0.method8581(-17416) == 1;
		this.aByte143 = arg0.method8536();
		this.aByte141 = arg0.method8536();
		this.aByte144 = arg0.method8536();
		this.aByte142 = arg0.method8536();
	}
}
