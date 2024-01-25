import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "Z")
	public boolean aBoolean86;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "Z")
	public boolean aBoolean88;

	@OriginalMember(owner = "client!ck", name = "v", descriptor = "Z")
	public boolean aBoolean89;

	@OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
	public final int anInt1179;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "Z")
	public final boolean aBoolean87;

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "Lclient!ov;")
	public final Class275_Sub1 aClass275_Sub1_1;

	@OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
	public final int anInt1181;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(ILclient!ov;IZ)V")
	public Class5_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class275_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1179 = arg2;
		this.aBoolean87 = arg3;
		this.aClass275_Sub1_1 = arg1;
		this.anInt1181 = arg0;
	}
}
