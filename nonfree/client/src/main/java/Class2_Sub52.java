import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public final class Class2_Sub52 extends Class2 {

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "Z")
	public boolean aBoolean759;

	@OriginalMember(owner = "client!wu", name = "m", descriptor = "Z")
	public boolean aBoolean760;

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "Z")
	public boolean aBoolean761;

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "I")
	public final int anInt10449;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
	public final int anInt10448;

	@OriginalMember(owner = "client!wu", name = "o", descriptor = "Lclient!iia;")
	public final Class161_Sub1 aClass161_Sub1_1;

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "Z")
	public final boolean aBoolean762;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(ILclient!iia;IZ)V")
	public Class2_Sub52(@OriginalArg(0) int arg0, @OriginalArg(1) Class161_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt10449 = arg0;
		this.anInt10448 = arg2;
		this.aClass161_Sub1_1 = arg1;
		this.aBoolean762 = arg3;
	}
}
