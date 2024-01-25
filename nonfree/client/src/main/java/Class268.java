import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public final class Class268 {

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
	public int anInt8222;

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
	public int anInt8223;

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
	public int anInt8224;

	@OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
	public int anInt8225;

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "()V")
	public Class268() {
	}

	@OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lclient!qea;)V")
	public Class268(@OriginalArg(0) Class268 arg0) {
		this.anInt8223 = arg0.anInt8223;
		this.anInt8225 = arg0.anInt8225;
		this.anInt8224 = arg0.anInt8224;
		this.anInt8222 = arg0.anInt8222;
	}
}
