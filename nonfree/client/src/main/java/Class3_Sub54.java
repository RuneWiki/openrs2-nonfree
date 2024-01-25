import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public final class Class3_Sub54 extends Class3 {

	@OriginalMember(owner = "client!we", name = "i", descriptor = "Z")
	public boolean aBoolean751;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Z")
	public boolean aBoolean752;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Z")
	public boolean aBoolean753;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "I")
	public final int anInt10222;

	@OriginalMember(owner = "client!we", name = "o", descriptor = "Z")
	public final boolean aBoolean754;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!ft;")
	public final Class133_Sub1 aClass133_Sub1_1;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "I")
	public final int anInt10223;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(ILclient!ft;IZ)V")
	public Class3_Sub54(@OriginalArg(0) int arg0, @OriginalArg(1) Class133_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt10222 = arg2;
		this.aBoolean754 = arg3;
		this.aClass133_Sub1_1 = arg1;
		this.anInt10223 = arg0;
	}
}
