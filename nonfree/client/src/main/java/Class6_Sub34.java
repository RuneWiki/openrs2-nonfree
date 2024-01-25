import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class6_Sub34 extends Class6 {

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "Z")
	public boolean aBoolean341;

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "Z")
	public boolean aBoolean342;

	@OriginalMember(owner = "client!ks", name = "o", descriptor = "Z")
	public boolean aBoolean343;

	@OriginalMember(owner = "client!ks", name = "l", descriptor = "I")
	public final int anInt5399;

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
	public final int anInt5400;

	@OriginalMember(owner = "client!ks", name = "m", descriptor = "Lclient!pl;")
	public final Class204_Sub1 aClass204_Sub1_1;

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "Z")
	public final boolean aBoolean344;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(ILclient!pl;IZ)V")
	public Class6_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) Class204_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt5399 = arg2;
		this.anInt5400 = arg0;
		this.aClass204_Sub1_1 = arg1;
		this.aBoolean344 = arg3;
	}
}
