import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class155 {

	@OriginalMember(owner = "client!og", name = "i", descriptor = "Lclient!ds;")
	public Class11_Sub4 aClass11_Sub4_1;

	@OriginalMember(owner = "client!og", name = "l", descriptor = "Z")
	public boolean aBoolean338;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "Lclient!ik;")
	public Class11_Sub5 aClass11_Sub5_1;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "B")
	public byte aByte37;

	@OriginalMember(owner = "client!og", name = "p", descriptor = "Lclient!ds;")
	public Class11_Sub4 aClass11_Sub4_2;

	@OriginalMember(owner = "client!og", name = "q", descriptor = "Lclient!ik;")
	public Class11_Sub5 aClass11_Sub5_2;

	@OriginalMember(owner = "client!og", name = "r", descriptor = "B")
	public byte aByte38;

	@OriginalMember(owner = "client!og", name = "t", descriptor = "Z")
	public boolean aBoolean339;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "Lclient!ci;")
	public Class26 aClass26_2;

	@OriginalMember(owner = "client!og", name = "w", descriptor = "Lclient!hl;")
	public Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!og", name = "x", descriptor = "B")
	public byte aByte39;

	@OriginalMember(owner = "client!og", name = "y", descriptor = "B")
	public byte aByte40;

	@OriginalMember(owner = "client!og", name = "z", descriptor = "S")
	public short aShort62;

	@OriginalMember(owner = "client!og", name = "A", descriptor = "Lclient!rr;")
	public Class187 aClass187_2;

	@OriginalMember(owner = "client!og", name = "B", descriptor = "Lclient!cl;")
	public Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "Z")
	public boolean aBoolean340;

	@OriginalMember(owner = "client!og", name = "G", descriptor = "Lclient!og;")
	public Class155 aClass155_1;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "B")
	public byte aByte35 = 0;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "B")
	public byte aByte36;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "B")
	public byte aByte41;

	@OriginalMember(owner = "client!og", name = "D", descriptor = "S")
	public final short aShort63;

	@OriginalMember(owner = "client!og", name = "v", descriptor = "S")
	public final short aShort61;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(III)V")
	public Class155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte41 = this.aByte36 = (byte) arg0;
		this.aShort63 = (short) arg1;
		this.aShort61 = (short) arg2;
	}

	@OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
	public void method4179() {
		while (this.aClass187_2 != null) {
			@Pc(7) Class187 local7 = this.aClass187_2.aClass187_3;
			this.aClass187_2.method5027();
			this.aClass187_2 = local7;
		}
		this.aByte35 = 0;
	}
}
