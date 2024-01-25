import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public final class Class14_Sub15 extends Class14 {

	@OriginalMember(owner = "client!dia", name = "m", descriptor = "Z")
	public boolean aBoolean179;

	@OriginalMember(owner = "client!dia", name = "q", descriptor = "Z")
	public boolean aBoolean180;

	@OriginalMember(owner = "client!dia", name = "s", descriptor = "Z")
	public boolean aBoolean181;

	@OriginalMember(owner = "client!dia", name = "l", descriptor = "Lclient!cp;")
	public final Class63_Sub1 aClass63_Sub1_1;

	@OriginalMember(owner = "client!dia", name = "u", descriptor = "Z")
	public final boolean aBoolean182;

	@OriginalMember(owner = "client!dia", name = "p", descriptor = "I")
	public final int anInt2175;

	@OriginalMember(owner = "client!dia", name = "o", descriptor = "I")
	public final int anInt2174;

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(ILclient!cp;IZ)V")
	public Class14_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class63_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass63_Sub1_1 = arg1;
		this.aBoolean182 = arg3;
		this.anInt2175 = arg2;
		this.anInt2174 = arg0;
	}
}
