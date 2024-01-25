import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class346 {

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "Lclient!wr;")
	public Class6_Sub1_Sub4 aClass6_Sub1_Sub4_1;

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "Lclient!lca;")
	public Class6_Sub1_Sub5 aClass6_Sub1_Sub5_1;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "Lclient!vf;")
	public Class346 aClass346_1;

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "Lclient!ida;")
	public Class153 aClass153_3;

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Lclient!ev;")
	public Class6_Sub1_Sub3 aClass6_Sub1_Sub3_1;

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "S")
	public short aShort110;

	@OriginalMember(owner = "client!vf", name = "k", descriptor = "S")
	public short aShort111;

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "Lclient!ev;")
	public Class6_Sub1_Sub3 aClass6_Sub1_Sub3_2;

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "Lclient!dfa;")
	public Class6_Sub1_Sub2 aClass6_Sub1_Sub2_1;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "S")
	public short aShort112;

	@OriginalMember(owner = "client!vf", name = "o", descriptor = "S")
	public short aShort113;

	@OriginalMember(owner = "client!vf", name = "p", descriptor = "Lclient!lca;")
	public Class6_Sub1_Sub5 aClass6_Sub1_Sub5_2;

	@OriginalMember(owner = "client!vf", name = "j", descriptor = "B")
	public byte aByte121;

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V")
	public Class346(@OriginalArg(0) int arg0) {
		this.aByte121 = (byte) arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public void method7616() {
		while (this.aClass153_3 != null) {
			@Pc(11) Class153 local11 = this.aClass153_3.aClass153_1;
			this.aClass153_3.method3484();
			this.aClass153_3 = local11;
		}
	}
}
