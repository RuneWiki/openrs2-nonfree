import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public final class Class8_Sub52 extends Class8 {

	@OriginalMember(owner = "client!wr", name = "k", descriptor = "Z")
	public boolean aBoolean755;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "Z")
	public boolean aBoolean757;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "Z")
	public boolean aBoolean758;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "Z")
	public final boolean aBoolean756;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
	public final int anInt10658;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
	public final int anInt10660;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "Lclient!ih;")
	public final Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(ILclient!ih;IZ)V")
	public Class8_Sub52(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aBoolean756 = arg3;
		this.anInt10658 = arg2;
		this.anInt10660 = arg0;
		this.aClass2_Sub1_1 = arg1;
	}
}
