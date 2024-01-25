import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class227 {

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!fq;")
	public Class77 aClass77_2;

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "B")
	public byte aByte76;

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Lclient!sn;")
	public Class227 aClass227_1;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "Lclient!uq;")
	public Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "Lclient!kr;")
	public Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "Z")
	public boolean aBoolean433;

	@OriginalMember(owner = "client!sn", name = "m", descriptor = "Lclient!jw;")
	public Class1_Sub4 aClass1_Sub4_2;

	@OriginalMember(owner = "client!sn", name = "n", descriptor = "B")
	public byte aByte78;

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "B")
	public byte aByte79;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "Z")
	public boolean aBoolean434;

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "Z")
	public boolean aBoolean435;

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "S")
	public short aShort91;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "B")
	public byte aByte80;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "Lclient!bb;")
	public Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!sn", name = "x", descriptor = "Lclient!kr;")
	public Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "Lclient!j;")
	public Class114 aClass114_2;

	@OriginalMember(owner = "client!sn", name = "A", descriptor = "Lclient!bb;")
	public Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "B")
	public byte aByte77 = 0;

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "S")
	public final short aShort90;

	@OriginalMember(owner = "client!sn", name = "w", descriptor = "B")
	public byte aByte82;

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "B")
	public byte aByte81;

	@OriginalMember(owner = "client!sn", name = "B", descriptor = "S")
	public final short aShort92;

	static {
		new Class174("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(III)V")
	public Class227(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort90 = (short) arg1;
		this.aByte81 = this.aByte82 = (byte) arg0;
		this.aShort92 = (short) arg2;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public void method5249() {
		while (this.aClass114_2 != null) {
			@Pc(12) Class114 local12 = this.aClass114_2.aClass114_1;
			this.aClass114_2.method2898();
			this.aClass114_2 = local12;
		}
		this.aByte77 = 0;
	}
}
