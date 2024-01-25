import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class313 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Lclient!ev;")
	public Class41_Sub1_Sub3 aClass41_Sub1_Sub3_1;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "Lclient!rr;")
	public Class313 aClass313_1;

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "Lclient!jd;")
	public Class41_Sub1_Sub5 aClass41_Sub1_Sub5_1;

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "S")
	public short aShort97;

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "S")
	public short aShort98;

	@OriginalMember(owner = "client!rr", name = "g", descriptor = "S")
	public short aShort99;

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "Lclient!bk;")
	public Class40 aClass40_3;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Lclient!ev;")
	public Class41_Sub1_Sub3 aClass41_Sub1_Sub3_2;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "Lclient!bq;")
	public Class41_Sub1_Sub2 aClass41_Sub1_Sub2_1;

	@OriginalMember(owner = "client!rr", name = "o", descriptor = "Lclient!jd;")
	public Class41_Sub1_Sub5 aClass41_Sub1_Sub5_2;

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "S")
	public short aShort100;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "Lclient!ge;")
	public Class41_Sub1_Sub4 aClass41_Sub1_Sub4_1;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "B")
	public byte aByte112;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(I)V")
	public Class313(@OriginalArg(0) int arg0) {
		this.aByte112 = (byte) arg0;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	public void method7334() {
		while (this.aClass40_3 != null) {
			@Pc(11) Class40 local11 = this.aClass40_3.aClass40_1;
			this.aClass40_3.method626();
			this.aClass40_3 = local11;
		}
	}
}
