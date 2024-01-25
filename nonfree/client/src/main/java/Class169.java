import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!no")
public final class Class169 {

	@OriginalMember(owner = "client!no", name = "c", descriptor = "B")
	public byte aByte79;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "S")
	public short aShort79;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "Lclient!uj;")
	public Class25_Sub4 aClass25_Sub4_1;

	@OriginalMember(owner = "client!no", name = "f", descriptor = "Z")
	public boolean aBoolean549;

	@OriginalMember(owner = "client!no", name = "g", descriptor = "Lclient!pj;")
	public Class25_Sub1 aClass25_Sub1_2;

	@OriginalMember(owner = "client!no", name = "i", descriptor = "Z")
	public boolean aBoolean550;

	@OriginalMember(owner = "client!no", name = "k", descriptor = "Lclient!bq;")
	public Class27 aClass27_3;

	@OriginalMember(owner = "client!no", name = "l", descriptor = "Lclient!uj;")
	public Class25_Sub4 aClass25_Sub4_2;

	@OriginalMember(owner = "client!no", name = "m", descriptor = "Lclient!eu;")
	public Class71 aClass71_2;

	@OriginalMember(owner = "client!no", name = "n", descriptor = "B")
	public byte aByte82;

	@OriginalMember(owner = "client!no", name = "o", descriptor = "Z")
	public boolean aBoolean551;

	@OriginalMember(owner = "client!no", name = "p", descriptor = "Lclient!vv;")
	public Class25_Sub2 aClass25_Sub2_2;

	@OriginalMember(owner = "client!no", name = "s", descriptor = "Lclient!pj;")
	public Class25_Sub1 aClass25_Sub1_3;

	@OriginalMember(owner = "client!no", name = "t", descriptor = "B")
	public byte aByte84;

	@OriginalMember(owner = "client!no", name = "u", descriptor = "Lclient!rv;")
	public Class25_Sub3 aClass25_Sub3_1;

	@OriginalMember(owner = "client!no", name = "w", descriptor = "B")
	public byte aByte85;

	@OriginalMember(owner = "client!no", name = "x", descriptor = "Lclient!no;")
	public Class169 aClass169_1;

	@OriginalMember(owner = "client!no", name = "h", descriptor = "B")
	public byte aByte80 = 0;

	@OriginalMember(owner = "client!no", name = "q", descriptor = "B")
	public byte aByte83;

	@OriginalMember(owner = "client!no", name = "j", descriptor = "B")
	public byte aByte81;

	@OriginalMember(owner = "client!no", name = "v", descriptor = "S")
	public final short aShort81;

	@OriginalMember(owner = "client!no", name = "r", descriptor = "S")
	public final short aShort80;

	@OriginalMember(owner = "client!no", name = "<init>", descriptor = "(III)V")
	public Class169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte81 = this.aByte83 = (byte) arg0;
		this.aShort81 = (short) arg2;
		this.aShort80 = (short) arg1;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
	public void method3810() {
		while (this.aClass27_3 != null) {
			@Pc(15) Class27 local15 = this.aClass27_3.aClass27_1;
			this.aClass27_3.method575();
			this.aClass27_3 = local15;
		}
		this.aByte80 = 0;
	}
}
