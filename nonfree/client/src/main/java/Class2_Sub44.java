import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public final class Class2_Sub44 extends Class2 {

	@OriginalMember(owner = "client!ofa", name = "v", descriptor = "Z")
	public boolean aBoolean618;

	@OriginalMember(owner = "client!ofa", name = "p", descriptor = "Z")
	public boolean aBoolean619;

	@OriginalMember(owner = "client!ofa", name = "s", descriptor = "Z")
	public boolean aBoolean620;

	@OriginalMember(owner = "client!ofa", name = "m", descriptor = "I")
	public final int anInt7301;

	@OriginalMember(owner = "client!ofa", name = "t", descriptor = "I")
	public final int anInt7300;

	@OriginalMember(owner = "client!ofa", name = "w", descriptor = "Lclient!hj;")
	public final Class156_Sub1 aClass156_Sub1_1;

	@OriginalMember(owner = "client!ofa", name = "q", descriptor = "Z")
	public final boolean aBoolean621;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "(ILclient!hj;IZ)V")
	public Class2_Sub44(@OriginalArg(0) int arg0, @OriginalArg(1) Class156_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt7301 = arg2;
		this.anInt7300 = arg0;
		this.aClass156_Sub1_1 = arg1;
		this.aBoolean621 = arg3;
	}
}
