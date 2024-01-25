import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class14_Sub9_Sub1 extends Class14_Sub9 {

	@OriginalMember(owner = "client!cd", name = "q", descriptor = "B")
	private byte aByte17;

	@OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
	private int anInt1033;

	@OriginalMember(owner = "client!cd", name = "m", descriptor = "J")
	private long aLong45 = -1L;

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Ljava/lang/String;")
	private String aString19 = null;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8846(@OriginalArg(0) Class14_Sub21 arg0) {
		if (arg0.method7695(123) != 255) {
			arg0.anInt8936--;
			this.aLong45 = arg0.method7729();
		}
		this.aString19 = arg0.method7706();
		this.anInt1033 = arg0.method7717(-1978450544);
		this.aByte17 = arg0.method7720();
		arg0.method7729();
		if (Static60.aBoolean69) {
			System.out.println("memberhash:" + this.aLong45 + " membername:" + this.aString19);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLclient!uq;)V")
	@Override
	public void method8845(@OriginalArg(1) Class14_Sub48 arg0) {
		@Pc(14) Class155 local14 = new Class155();
		local14.aByte85 = this.aByte17;
		local14.aString45 = this.aString19;
		local14.anInt4349 = this.anInt1033;
		arg0.method8806(local14);
	}
}
