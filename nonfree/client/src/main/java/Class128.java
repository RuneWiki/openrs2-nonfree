import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class128 {

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "Lclient!rm;")
	public Class176 aClass176_1;

	@OriginalMember(owner = "client!ls", name = "f", descriptor = "B")
	public byte aByte48;

	@OriginalMember(owner = "client!ls", name = "i", descriptor = "Z")
	public boolean aBoolean308;

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Lclient!ls;")
	public Class128 aClass128_1;

	@OriginalMember(owner = "client!ls", name = "k", descriptor = "B")
	public byte aByte50;

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "Lclient!fl;")
	public Class8_Sub2 aClass8_Sub2_1;

	@OriginalMember(owner = "client!ls", name = "o", descriptor = "Lclient!jl;")
	public Class8_Sub3 aClass8_Sub3_1;

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "Lclient!qo;")
	public Class8_Sub5 aClass8_Sub5_1;

	@OriginalMember(owner = "client!ls", name = "q", descriptor = "Lclient!kq;")
	public Class117 aClass117_2;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "S")
	public short aShort62;

	@OriginalMember(owner = "client!ls", name = "s", descriptor = "Z")
	public boolean aBoolean309;

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "Z")
	public boolean aBoolean310;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "B")
	public byte aByte51;

	@OriginalMember(owner = "client!ls", name = "v", descriptor = "Lclient!p;")
	public Class8_Sub4 aClass8_Sub4_1;

	@OriginalMember(owner = "client!ls", name = "w", descriptor = "Lclient!fl;")
	public Class8_Sub2 aClass8_Sub2_2;

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "Lclient!p;")
	public Class8_Sub4 aClass8_Sub4_2;

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "B")
	public byte aByte52;

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "B")
	public byte aByte46 = 0;

	@OriginalMember(owner = "client!ls", name = "g", descriptor = "S")
	public final short aShort60;

	@OriginalMember(owner = "client!ls", name = "m", descriptor = "S")
	public final short aShort61;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "B")
	public byte aByte47;

	@OriginalMember(owner = "client!ls", name = "h", descriptor = "B")
	public byte aByte49;

	static {
		new Class159("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(III)V")
	public Class128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShort60 = (short) arg2;
		this.aShort61 = (short) arg1;
		this.aByte49 = this.aByte47 = (byte) arg0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
	public void method3610() {
		while (this.aClass117_2 != null) {
			@Pc(11) Class117 local11 = this.aClass117_2.aClass117_1;
			this.aClass117_2.method3326();
			this.aClass117_2 = local11;
		}
		this.aByte46 = 0;
	}
}
