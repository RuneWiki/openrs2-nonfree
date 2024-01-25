import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!om;")
	protected Class219 aClass219_41;

	@OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
	public int anInt9423;

	@OriginalMember(owner = "client!uh", name = "z", descriptor = "Lclient!pba;")
	protected Class226 aClass226_41;

	@OriginalMember(owner = "client!uh", name = "x", descriptor = "Z")
	public boolean aBoolean687;

	@OriginalMember(owner = "client!uh", name = "D", descriptor = "[Lclient!uh;")
	public final Class3_Sub1[] aClass3_Sub1Array42;

	static {
		new Class67("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(IZ)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean687 = arg1;
		this.aClass3_Sub1Array42 = new Class3_Sub1[arg0];
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)[I")
	protected final int[] method7778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass3_Sub1Array42[arg0].aBoolean687 ? this.aClass3_Sub1Array42[arg0].method7784(arg1) : this.aClass3_Sub1Array42[arg0].method7781(arg1)[0];
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(IIB)[[I")
	protected final int[][] method7779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass3_Sub1Array42[arg0].aBoolean687) {
			@Pc(25) int[] local25 = this.aClass3_Sub1Array42[arg0].method7784(arg1);
			return new int[][] { local25, local25, local25 };
		} else {
			return this.aClass3_Sub1Array42[arg0].method7781(arg1);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public void method7780() {
		if (this.aBoolean687) {
			this.aClass219_41.method5565();
			this.aClass219_41 = null;
		} else {
			this.aClass226_41.method5725();
			this.aClass226_41 = null;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)[[I")
	public int[][] method7781(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IILclient!rt;)V")
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI)[I")
	public int[] method7784(@OriginalArg(1) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)I")
	public int method7785() {
		return -1;
	}

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "(I)V")
	public void method7786() {
	}

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)I")
	public int method7787() {
		return -1;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(III)V")
	public void method7790(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt9423 == 255 ? arg0 : this.anInt9423;
		if (this.aBoolean687) {
			this.aClass219_41 = new Class219(local14, arg0, arg1);
		} else {
			this.aClass226_41 = new Class226(local14, arg0, arg1);
		}
	}
}
