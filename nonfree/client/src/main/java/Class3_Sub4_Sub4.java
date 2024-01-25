import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public final class Class3_Sub4_Sub4 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "B")
	private byte aByte72;

	@OriginalMember(owner = "client!ko", name = "y", descriptor = "Ljava/lang/String;")
	private String aString67;

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "B")
	private byte aByte73;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ika;B)V")
	@Override
	public void method4957(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aString67 = arg0.method2066();
		if (this.aString67 != null) {
			arg0.method2048(255);
			this.aByte72 = arg0.method2022();
			this.aByte73 = arg0.method2022();
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BLclient!cg;)V")
	@Override
	public void method4954(@OriginalArg(1) Class3_Sub14 arg0) {
		arg0.aString32 = this.aString67;
		if (this.aString67 != null) {
			arg0.aByte45 = this.aByte73;
			arg0.aByte44 = this.aByte72;
		}
	}
}
