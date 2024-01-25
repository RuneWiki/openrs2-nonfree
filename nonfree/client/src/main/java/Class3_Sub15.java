import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!er", name = "n", descriptor = "Z")
	public boolean aBoolean204;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "Z")
	public boolean aBoolean206;

	@OriginalMember(owner = "client!er", name = "r", descriptor = "Z")
	public boolean aBoolean207;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "Z")
	public final boolean aBoolean205;

	@OriginalMember(owner = "client!er", name = "m", descriptor = "I")
	public final int anInt2738;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "I")
	public final int anInt2737;

	@OriginalMember(owner = "client!er", name = "t", descriptor = "Lclient!vaa;")
	public final Class207_Sub1 aClass207_Sub1_1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(ILclient!vaa;IZ)V")
	public Class3_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class207_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean205 = arg3;
		this.anInt2738 = arg0;
		this.anInt2737 = arg2;
		this.aClass207_Sub1_1 = arg1;
	}
}
