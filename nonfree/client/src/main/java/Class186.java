import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class186 {

	@OriginalMember(owner = "client!lha", name = "e", descriptor = "S")
	public short aShort61;

	@OriginalMember(owner = "client!lha", name = "f", descriptor = "Lclient!jn;")
	public Class9_Sub4_Sub5 aClass9_Sub4_Sub5_1;

	@OriginalMember(owner = "client!lha", name = "g", descriptor = "Lclient!kfa;")
	public Class168 aClass168_3;

	@OriginalMember(owner = "client!lha", name = "h", descriptor = "Lclient!wo;")
	public Class9_Sub4_Sub1 aClass9_Sub4_Sub1_1;

	@OriginalMember(owner = "client!lha", name = "j", descriptor = "S")
	public short aShort62;

	@OriginalMember(owner = "client!lha", name = "k", descriptor = "S")
	public short aShort63;

	@OriginalMember(owner = "client!lha", name = "l", descriptor = "Lclient!lha;")
	public Class186 aClass186_1;

	@OriginalMember(owner = "client!lha", name = "m", descriptor = "Lclient!ic;")
	public Class9_Sub4_Sub4 aClass9_Sub4_Sub4_1;

	@OriginalMember(owner = "client!lha", name = "n", descriptor = "Lclient!hc;")
	public Class9_Sub4_Sub3 aClass9_Sub4_Sub3_1;

	@OriginalMember(owner = "client!lha", name = "o", descriptor = "Lclient!jn;")
	public Class9_Sub4_Sub5 aClass9_Sub4_Sub5_2;

	@OriginalMember(owner = "client!lha", name = "p", descriptor = "Lclient!wo;")
	public Class9_Sub4_Sub1 aClass9_Sub4_Sub1_2;

	@OriginalMember(owner = "client!lha", name = "q", descriptor = "S")
	public short aShort64;

	@OriginalMember(owner = "client!lha", name = "d", descriptor = "B")
	public byte aByte73;

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(I)V")
	public Class186(@OriginalArg(0) int arg0) {
		this.aByte73 = (byte) arg0;
	}

	@OriginalMember(owner = "client!lha", name = "b", descriptor = "(I)V")
	public void method5328() {
		while (this.aClass168_3 != null) {
			@Pc(7) Class168 local7 = this.aClass168_3.aClass168_2;
			this.aClass168_3.method5024();
			this.aClass168_3 = local7;
		}
	}
}
