import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class368 {

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "S")
	public short aShort109;

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "Lclient!cf;")
	public Class34_Sub1_Sub2 aClass34_Sub1_Sub2_1;

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "Lclient!iga;")
	public Class34_Sub1_Sub5 aClass34_Sub1_Sub5_1;

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "Lclient!lda;")
	public Class205 aClass205_4;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "Lclient!vda;")
	public Class368 aClass368_1;

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "Lclient!iga;")
	public Class34_Sub1_Sub5 aClass34_Sub1_Sub5_2;

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "S")
	public short aShort111;

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "Lclient!md;")
	public Class34_Sub1_Sub3 aClass34_Sub1_Sub3_1;

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "S")
	public short aShort112;

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "Lclient!md;")
	public Class34_Sub1_Sub3 aClass34_Sub1_Sub3_2;

	@OriginalMember(owner = "client!vda", name = "p", descriptor = "Lclient!f;")
	public Class34_Sub1_Sub4 aClass34_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "B")
	public byte aByte143;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(I)V")
	public Class368(@OriginalArg(0) int arg0) {
		this.aByte143 = (byte) arg0;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	public void method8580() {
		while (this.aClass205_4 != null) {
			@Pc(7) Class205 local7 = this.aClass205_4.aClass205_3;
			this.aClass205_4.method4729();
			this.aClass205_4 = local7;
		}
	}
}
