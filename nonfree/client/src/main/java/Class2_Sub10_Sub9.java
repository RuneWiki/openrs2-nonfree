import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public final class Class2_Sub10_Sub9 extends Class2_Sub10 {

	@OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
	private int anInt7136;

	@OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
	private int anInt7137;

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
	private int anInt7139;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
	private int anInt7140;

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		this.anInt7139 = arg0.method8555(-9372);
		this.anInt7137 = arg0.method8555(-9372);
		this.anInt7136 = arg0.method8581(-17416);
		this.anInt7140 = arg0.method8581(-17416);
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.method9393(this.anInt7137, this.anInt7136, this.anInt7140, this.anInt7139);
	}
}
