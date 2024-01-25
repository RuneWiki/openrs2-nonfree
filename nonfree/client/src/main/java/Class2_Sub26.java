import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public final class Class2_Sub26 extends Class2 {

	@OriginalMember(owner = "client!il", name = "s", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!il", name = "B", descriptor = "Z")
	public boolean aBoolean390;

	@OriginalMember(owner = "client!il", name = "D", descriptor = "Z")
	public boolean aBoolean391;

	@OriginalMember(owner = "client!il", name = "C", descriptor = "I")
	public final int anInt5285;

	@OriginalMember(owner = "client!il", name = "o", descriptor = "Lclient!qc;")
	public final Class165_Sub1 aClass165_Sub1_1;

	@OriginalMember(owner = "client!il", name = "t", descriptor = "I")
	public final int anInt5281;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "Z")
	public final boolean aBoolean389;

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(ILclient!qc;IZ)V")
	public Class2_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class165_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt5285 = arg2;
		this.aClass165_Sub1_1 = arg1;
		this.anInt5281 = arg0;
		this.aBoolean389 = arg3;
	}
}
