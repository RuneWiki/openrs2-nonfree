import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public final class Class2_Sub10_Sub5 extends Class2_Sub10 {

	@OriginalMember(owner = "client!iha", name = "r", descriptor = "I")
	private int anInt4183;

	@OriginalMember(owner = "client!iha", name = "q", descriptor = "I")
	private int anInt4184;

	@OriginalMember(owner = "client!iha", name = "s", descriptor = "I")
	private int anInt4185;

	@OriginalMember(owner = "client!iha", name = "u", descriptor = "I")
	private int anInt4187 = -1;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.method9394(this.anInt4187, this.anInt4184, this.anInt4183, this.anInt4185);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		this.anInt4187 = arg0.method8575();
		this.anInt4185 = arg0.method8555(-9372);
		this.anInt4184 = arg0.method8581(-17416);
		this.anInt4183 = arg0.method8581(-17416);
	}
}
