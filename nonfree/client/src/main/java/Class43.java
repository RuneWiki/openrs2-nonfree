import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class43 {

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public int anInt1243;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "[Lclient!vo;")
	public Class3_Sub4_Sub23[] aClass3_Sub4_Sub23Array1;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(I)V")
	public Class43(@OriginalArg(0) int arg0) {
		this.anInt1243 = arg0;
		this.anIntArray112 = new int[this.anInt1243];
		this.aClass3_Sub4_Sub23Array1 = new Class3_Sub4_Sub23[this.anInt1243];
	}
}
