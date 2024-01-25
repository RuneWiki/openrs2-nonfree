import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class270 {

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "Z")
	public boolean aBoolean527;

	@OriginalMember(owner = "client!wr", name = "d", descriptor = "B")
	public byte aByte99;

	@OriginalMember(owner = "client!wr", name = "h", descriptor = "Lclient!oa;")
	public Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "Lclient!iq;")
	public Class3_Sub1 aClass3_Sub1_1;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "Z")
	public boolean aBoolean528;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "Lclient!uc;")
	public Class241 aClass241_2;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "Lclient!wr;")
	public Class270 aClass270_1;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "Lclient!oa;")
	public Class3_Sub2 aClass3_Sub2_3;

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "Z")
	public boolean aBoolean529;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "B")
	public byte aByte101;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "Lclient!bp;")
	public Class3_Sub3 aClass3_Sub3_2;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "Lclient!bp;")
	public Class3_Sub3 aClass3_Sub3_3;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "Lclient!vk;")
	public Class256 aClass256_2;

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "Lclient!in;")
	public Class3_Sub5 aClass3_Sub5_2;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "S")
	public short aShort107;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "B")
	public byte aByte103;

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "B")
	public byte aByte104;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "B")
	public byte aByte100 = 0;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "B")
	public byte aByte102;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "B")
	public byte aByte105;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "S")
	public final short aShort106;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "S")
	public final short aShort105;

	static {
		new Class134("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(III)V")
	public Class270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByte105 = this.aByte102 = (byte) arg0;
		this.aShort106 = (short) arg1;
		this.aShort105 = (short) arg2;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public void method5699() {
		while (this.aClass241_2 != null) {
			@Pc(11) Class241 local11 = this.aClass241_2.aClass241_1;
			this.aClass241_2.method5079();
			this.aClass241_2 = local11;
		}
		this.aByte100 = 0;
	}
}
