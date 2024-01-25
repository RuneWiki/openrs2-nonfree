import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public final class Class271 {

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "Ljava/lang/String;")
	public String aString164;

	@OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
	public int anInt7991;

	@OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
	public int anInt7987 = 443;

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "Z")
	private boolean aBoolean574 = false;

	@OriginalMember(owner = "client!qaa", name = "o", descriptor = "Z")
	private boolean aBoolean575 = false;

	@OriginalMember(owner = "client!qaa", name = "m", descriptor = "I")
	public int anInt7994 = 43594;

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lclient!wv;I)Lclient!tj;")
	public Class316 method6248(@OriginalArg(0) Class366 arg0) {
		return arg0.method8280(this.aBoolean575, this.aString164, this.aBoolean574 ? this.anInt7987 : this.anInt7994);
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V")
	public void method6250() {
		if (!this.aBoolean574) {
			this.aBoolean575 = true;
			this.aBoolean574 = true;
		} else if (this.aBoolean575) {
			this.aBoolean575 = false;
		} else {
			this.aBoolean574 = false;
		}
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILclient!qaa;)Z")
	public boolean method6252(@OriginalArg(1) Class271 arg0) {
		if (arg0 == null) {
			return false;
		} else {
			return this.anInt7991 == arg0.anInt7991 && this.aString164.equals(arg0.aString164);
		}
	}
}
