import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qt")
public final class Class14_Sub9_Sub3 extends Class14_Sub9 {

	@OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
	private int anInt8845;

	@OriginalMember(owner = "client!qt", name = "q", descriptor = "B")
	private byte aByte112;

	@OriginalMember(owner = "client!qt", name = "w", descriptor = "Ljava/lang/String;")
	private String aString101;

	@OriginalMember(owner = "client!qt", name = "m", descriptor = "I")
	private int anInt8850 = -1;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(ZLclient!uq;)V")
	@Override
	public void method8845(@OriginalArg(1) Class14_Sub48 arg0) {
		@Pc(9) Class155 local9 = arg0.aClass155Array1[this.anInt8850];
		local9.aByte85 = this.aByte112;
		local9.aString45 = this.aString101;
		local9.anInt4349 = this.anInt8845;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!jc;I)V")
	@Override
	public void method8846(@OriginalArg(0) Class14_Sub21 arg0) {
		this.anInt8850 = arg0.method7717(-1978450544);
		this.aByte112 = arg0.method7720();
		this.anInt8845 = arg0.method7717(-1978450544);
		arg0.method7729();
		this.aString101 = arg0.method7703(0);
	}
}
