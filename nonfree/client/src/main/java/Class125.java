import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class125 {

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "Lclient!pga;")
	public Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!gn", name = "g", descriptor = "Lclient!lga;")
	public Class2_Sub4 aClass2_Sub4_1;

	@OriginalMember(owner = "client!gn", name = "h", descriptor = "B")
	public byte aByte31;

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "B")
	public byte aByte32;

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "S")
	public short aShort45;

	@OriginalMember(owner = "client!gn", name = "m", descriptor = "Z")
	public boolean aBoolean271;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "Lclient!lga;")
	public Class2_Sub4 aClass2_Sub4_2;

	@OriginalMember(owner = "client!gn", name = "o", descriptor = "Lclient!sr;")
	public Class302 aClass302_1;

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "Lclient!qu;")
	public Class274 aClass274_1;

	@OriginalMember(owner = "client!gn", name = "s", descriptor = "B")
	public byte aByte35;

	@OriginalMember(owner = "client!gn", name = "t", descriptor = "Z")
	public boolean aBoolean272;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "Lclient!fi;")
	public Class2_Sub3 aClass2_Sub3_1;

	@OriginalMember(owner = "client!gn", name = "v", descriptor = "Z")
	public boolean aBoolean273;

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "Lclient!fi;")
	public Class2_Sub3 aClass2_Sub3_2;

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "Lclient!un;")
	public Class2_Sub5 aClass2_Sub5_1;

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "Lclient!gn;")
	public Class125 aClass125_1;

	@OriginalMember(owner = "client!gn", name = "B", descriptor = "B")
	public byte aByte37;

	@OriginalMember(owner = "client!gn", name = "l", descriptor = "B")
	public byte aByte33 = 0;

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "S")
	public final short aShort46;

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "B")
	public byte aByte34;

	@OriginalMember(owner = "client!gn", name = "y", descriptor = "B")
	public byte aByte36;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "S")
	public final short aShort44;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(III)V")
	public Class125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort46 = (short) arg2;
		this.aByte36 = this.aByte34 = (byte) arg0;
		this.aShort44 = (short) arg1;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V")
	public void method3099() {
		while (this.aClass302_1 != null) {
			@Pc(4) Class302 local4 = this.aClass302_1.aClass302_2;
			this.aClass302_1.method7423();
			this.aClass302_1 = local4;
		}
		this.aByte33 = 0;
	}
}
