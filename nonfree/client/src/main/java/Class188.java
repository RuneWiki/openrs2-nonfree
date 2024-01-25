import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class188 {

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!v;")
	public Class1_Sub5 aClass1_Sub5_1;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!rm;")
	public Class1_Sub3 aClass1_Sub3_2;

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "Lclient!v;")
	public Class1_Sub5 aClass1_Sub5_2;

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "Lclient!rm;")
	public Class1_Sub3 aClass1_Sub3_3;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "Z")
	public boolean aBoolean378;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "Lclient!il;")
	public Class1_Sub4 aClass1_Sub4_1;

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "Lclient!qa;")
	public Class188 aClass188_1;

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "B")
	public byte aByte42;

	@OriginalMember(owner = "client!qa", name = "o", descriptor = "Lclient!cd;")
	public Class34 aClass34_2;

	@OriginalMember(owner = "client!qa", name = "q", descriptor = "S")
	public short aShort65;

	@OriginalMember(owner = "client!qa", name = "r", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "B")
	public byte aByte45;

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "Lclient!va;")
	public Class1_Sub1 aClass1_Sub1_2;

	@OriginalMember(owner = "client!qa", name = "x", descriptor = "B")
	public byte aByte46;

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "Lclient!oe;")
	public Class168 aClass168_2;

	@OriginalMember(owner = "client!qa", name = "B", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!qa", name = "z", descriptor = "B")
	public byte aByte47 = 0;

	@OriginalMember(owner = "client!qa", name = "n", descriptor = "S")
	public final short aShort64;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "S")
	public final short aShort63;

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "B")
	public byte aByte44;

	@OriginalMember(owner = "client!qa", name = "p", descriptor = "B")
	public byte aByte43;

	static {
		new Class62("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(III)V")
	public Class188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort64 = (short) arg2;
		this.aShort63 = (short) arg1;
		this.aByte43 = this.aByte44 = (byte) arg0;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
	public void method4616() {
		while (this.aClass168_2 != null) {
			@Pc(11) Class168 local11 = this.aClass168_2.aClass168_1;
			this.aClass168_2.method4283();
			this.aClass168_2 = local11;
		}
		this.aByte47 = 0;
	}
}
