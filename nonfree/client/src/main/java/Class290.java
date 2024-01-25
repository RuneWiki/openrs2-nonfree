import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class290 {

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "Lclient!mf;")
	public Class6_Sub4 aClass6_Sub4_2;

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "Lclient!uaa;")
	public Class290 aClass290_1;

	@OriginalMember(owner = "client!uaa", name = "k", descriptor = "Lclient!fv;")
	public Class98 aClass98_3;

	@OriginalMember(owner = "client!uaa", name = "l", descriptor = "Lclient!bw;")
	public Class6_Sub2 aClass6_Sub2_2;

	@OriginalMember(owner = "client!uaa", name = "m", descriptor = "S")
	public short aShort119;

	@OriginalMember(owner = "client!uaa", name = "n", descriptor = "Z")
	public boolean aBoolean639;

	@OriginalMember(owner = "client!uaa", name = "o", descriptor = "Lclient!be;")
	public Class26 aClass26_2;

	@OriginalMember(owner = "client!uaa", name = "p", descriptor = "Z")
	public boolean aBoolean640;

	@OriginalMember(owner = "client!uaa", name = "r", descriptor = "Lclient!hh;")
	public Class6_Sub3 aClass6_Sub3_2;

	@OriginalMember(owner = "client!uaa", name = "s", descriptor = "Lclient!mf;")
	public Class6_Sub4 aClass6_Sub4_3;

	@OriginalMember(owner = "client!uaa", name = "t", descriptor = "Lclient!bw;")
	public Class6_Sub2 aClass6_Sub2_3;

	@OriginalMember(owner = "client!uaa", name = "u", descriptor = "Lclient!tr;")
	public Class6_Sub5 aClass6_Sub5_1;

	@OriginalMember(owner = "client!uaa", name = "w", descriptor = "B")
	public byte aByte96;

	@OriginalMember(owner = "client!uaa", name = "x", descriptor = "B")
	public byte aByte97;

	@OriginalMember(owner = "client!uaa", name = "y", descriptor = "Z")
	public boolean aBoolean641;

	@OriginalMember(owner = "client!uaa", name = "z", descriptor = "B")
	public byte aByte98;

	@OriginalMember(owner = "client!uaa", name = "B", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "B")
	public byte aByte93 = 0;

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "S")
	public final short aShort117;

	@OriginalMember(owner = "client!uaa", name = "j", descriptor = "B")
	public byte aByte94;

	@OriginalMember(owner = "client!uaa", name = "v", descriptor = "B")
	public byte aByte95;

	@OriginalMember(owner = "client!uaa", name = "i", descriptor = "S")
	public final short aShort118;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(III)V")
	public Class290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort117 = (short) arg2;
		this.aByte95 = this.aByte94 = (byte) arg0;
		this.aShort118 = (short) arg1;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
	public void method7120() {
		while (this.aClass98_3 != null) {
			@Pc(17) Class98 local17 = this.aClass98_3.aClass98_1;
			this.aClass98_3.method2517();
			this.aClass98_3 = local17;
		}
		this.aByte93 = 0;
	}
}
