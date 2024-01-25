import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public final class Class5_Sub9 extends Class5 {

	@OriginalMember(owner = "client!cp", name = "s", descriptor = "Z")
	public boolean aBoolean142;

	@OriginalMember(owner = "client!cp", name = "v", descriptor = "Z")
	public boolean aBoolean143;

	@OriginalMember(owner = "client!cp", name = "w", descriptor = "Z")
	public boolean aBoolean144;

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "Lclient!pa;")
	public final Class272_Sub1 aClass272_Sub1_1;

	@OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
	public final int anInt1440;

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "Z")
	public final boolean aBoolean145;

	@OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
	public final int anInt1438;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(ILclient!pa;IZ)V")
	public Class5_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class272_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass272_Sub1_1 = arg1;
		this.anInt1440 = arg0;
		this.aBoolean145 = arg3;
		this.anInt1438 = arg2;
	}
}
