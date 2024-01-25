import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class51 {

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Z")
	public boolean aBoolean92;

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "B")
	public byte aByte10;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "Lclient!mb;")
	public Class25_Sub3 aClass25_Sub3_1;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "Z")
	public boolean aBoolean93;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "Lclient!jq;")
	public Class103 aClass103_1;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "Lclient!ka;")
	public Class25_Sub4 aClass25_Sub4_1;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "Lclient!mb;")
	public Class25_Sub3 aClass25_Sub3_2;

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Z")
	public boolean aBoolean94;

	@OriginalMember(owner = "client!dn", name = "n", descriptor = "Lclient!fm;")
	public Class25_Sub2 aClass25_Sub2_1;

	@OriginalMember(owner = "client!dn", name = "o", descriptor = "S")
	public short aShort14;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "Lclient!mf;")
	public Class25_Sub5 aClass25_Sub5_1;

	@OriginalMember(owner = "client!dn", name = "r", descriptor = "B")
	public byte aByte11;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Lclient!bg;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "Lclient!fm;")
	public Class25_Sub2 aClass25_Sub2_2;

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "Lclient!dn;")
	public Class51 aClass51_1;

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "B")
	public byte aByte14;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "B")
	public byte aByte15;

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "B")
	public byte aByte12 = 0;

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "B")
	public byte aByte13;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "B")
	public byte aByte9;

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "S")
	public final short aShort16;

	@OriginalMember(owner = "client!dn", name = "p", descriptor = "S")
	public final short aShort15;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(III)V")
	public Class51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte9 = this.aByte13 = (byte) arg0;
		this.aShort16 = (short) arg2;
		this.aShort15 = (short) arg1;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V")
	public void method1255() {
		while (this.aClass103_1 != null) {
			@Pc(11) Class103 local11 = this.aClass103_1.aClass103_2;
			this.aClass103_1.method2889();
			this.aClass103_1 = local11;
		}
		this.aByte12 = 0;
	}
}
