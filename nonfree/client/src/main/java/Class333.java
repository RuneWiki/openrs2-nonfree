import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class333 {

	@OriginalMember(owner = "client!up", name = "c", descriptor = "Lclient!iq;")
	public Class25_Sub2_Sub3 aClass25_Sub2_Sub3_1;

	@OriginalMember(owner = "client!up", name = "d", descriptor = "S")
	public short aShort116;

	@OriginalMember(owner = "client!up", name = "e", descriptor = "S")
	public short aShort117;

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!vb;")
	public Class25_Sub2_Sub1 aClass25_Sub2_Sub1_1;

	@OriginalMember(owner = "client!up", name = "i", descriptor = "Lclient!ht;")
	public Class25_Sub2_Sub5 aClass25_Sub2_Sub5_1;

	@OriginalMember(owner = "client!up", name = "j", descriptor = "Lclient!im;")
	public Class147 aClass147_3;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "Lclient!vb;")
	public Class25_Sub2_Sub1 aClass25_Sub2_Sub1_2;

	@OriginalMember(owner = "client!up", name = "m", descriptor = "Lclient!iq;")
	public Class25_Sub2_Sub3 aClass25_Sub2_Sub3_2;

	@OriginalMember(owner = "client!up", name = "n", descriptor = "Lclient!up;")
	public Class333 aClass333_1;

	@OriginalMember(owner = "client!up", name = "p", descriptor = "S")
	public short aShort118;

	@OriginalMember(owner = "client!up", name = "q", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!up", name = "r", descriptor = "Lclient!cs;")
	public Class25_Sub2_Sub4 aClass25_Sub2_Sub4_1;

	@OriginalMember(owner = "client!up", name = "s", descriptor = "B")
	public byte aByte127;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "(I)V")
	public Class333(@OriginalArg(0) int arg0) {
		this.aByte127 = (byte) arg0;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
	public void method7507() {
		while (this.aClass147_3 != null) {
			@Pc(7) Class147 local7 = this.aClass147_3.aClass147_2;
			this.aClass147_3.method3733();
			this.aClass147_3 = local7;
		}
	}
}
