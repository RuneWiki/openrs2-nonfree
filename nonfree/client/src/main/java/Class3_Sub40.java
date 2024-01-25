import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public final class Class3_Sub40 extends Class3 {

	@OriginalMember(owner = "client!pca", name = "j", descriptor = "Z")
	public boolean aBoolean532;

	@OriginalMember(owner = "client!pca", name = "l", descriptor = "Z")
	public boolean aBoolean533;

	@OriginalMember(owner = "client!pca", name = "m", descriptor = "Z")
	public boolean aBoolean534;

	@OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
	public final int anInt7435;

	@OriginalMember(owner = "client!pca", name = "o", descriptor = "Lclient!qv;")
	public final Class172_Sub1 aClass172_Sub1_1;

	@OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
	public final int anInt7436;

	@OriginalMember(owner = "client!pca", name = "n", descriptor = "Z")
	public final boolean aBoolean535;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(ILclient!qv;IZ)V")
	public Class3_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) Class172_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt7435 = arg0;
		this.aClass172_Sub1_1 = arg1;
		this.anInt7436 = arg2;
		this.aBoolean535 = arg3;
	}
}
