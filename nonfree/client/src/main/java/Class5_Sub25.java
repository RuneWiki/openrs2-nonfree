import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public final class Class5_Sub25 extends Class5 {

	@OriginalMember(owner = "client!kba", name = "m", descriptor = "Z")
	public boolean aBoolean368;

	@OriginalMember(owner = "client!kba", name = "n", descriptor = "Z")
	public boolean aBoolean369;

	@OriginalMember(owner = "client!kba", name = "p", descriptor = "Z")
	public boolean aBoolean370;

	@OriginalMember(owner = "client!kba", name = "k", descriptor = "Lclient!oe;")
	public final Class103_Sub1 aClass103_Sub1_1;

	@OriginalMember(owner = "client!kba", name = "r", descriptor = "I")
	public final int anInt4568;

	@OriginalMember(owner = "client!kba", name = "q", descriptor = "Z")
	public final boolean aBoolean371;

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
	public final int anInt4565;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(ILclient!oe;IZ)V")
	public Class5_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class103_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass103_Sub1_1 = arg1;
		this.anInt4568 = arg0;
		this.aBoolean371 = arg3;
		this.anInt4565 = arg2;
	}
}
