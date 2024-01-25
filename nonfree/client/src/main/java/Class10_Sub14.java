import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public final class Class10_Sub14 extends Class10 {

	@OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
	private final int anInt7394;

	@OriginalMember(owner = "client!nea", name = "k", descriptor = "I")
	private final int anInt7391;

	@OriginalMember(owner = "client!nea", name = "o", descriptor = "Ljava/lang/String;")
	private final String aString103;

	@OriginalMember(owner = "client!nea", name = "h", descriptor = "I")
	private final int anInt7390;

	@OriginalMember(owner = "client!nea", name = "e", descriptor = "I")
	private final int anInt7398;

	@OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub14(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt7394 = arg0.method5272();
		this.anInt7391 = arg0.method5272();
		this.aString103 = arg0.method5295();
		this.anInt7390 = arg0.method5312();
		this.anInt7398 = arg0.method5272();
	}

	@OriginalMember(owner = "client!nea", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static423.method6238(this.aString103, Static712.anInt11117, this.anInt7391, this.anInt7398, Static505.method7237(Static712.anInt11117, this.anInt7391, this.anInt7394), this.anInt7390, this.anInt7394);
	}
}
