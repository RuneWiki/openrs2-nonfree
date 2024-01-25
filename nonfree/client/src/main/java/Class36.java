import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class36 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!pc;")
	public Class195 aClass195_1;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!ds;")
	public Class11_Sub3 aClass11_Sub3_1;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "B")
	public byte aByte3;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "S")
	public short aShort2;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "Lclient!fv;")
	public Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Lclient!dm;")
	public Class56 aClass56_2;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "B")
	public byte aByte5;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "Lclient!ej;")
	public Class11_Sub4 aClass11_Sub4_1;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Z")
	public boolean aBoolean31;

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!fv;")
	public Class11_Sub1 aClass11_Sub1_3;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Lclient!or;")
	public Class11_Sub2 aClass11_Sub2_1;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "B")
	public byte aByte6;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "Z")
	public boolean aBoolean32;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "Lclient!or;")
	public Class11_Sub2 aClass11_Sub2_2;

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "Lclient!ce;")
	public Class36 aClass36_1;

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "B")
	public byte aByte8;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "Z")
	public boolean aBoolean33;

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "S")
	public final short aShort3;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "B")
	public byte aByte4;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "B")
	public byte aByte2;

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "S")
	public final short aShort4;

	static {
		new Class231("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(III)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort3 = (short) arg1;
		this.aByte2 = this.aByte4 = (byte) arg0;
		this.aShort4 = (short) arg2;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public void method701() {
		while (this.aClass195_1 != null) {
			@Pc(11) Class195 local11 = this.aClass195_1.aClass195_2;
			this.aClass195_1.method4423();
			this.aClass195_1 = local11;
		}
		this.aByte7 = 0;
	}
}
