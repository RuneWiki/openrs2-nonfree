import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Z")
	public boolean aBoolean318 = false;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "Z")
	public boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
	protected final int anInt4391;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
	protected int anInt4393;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
	protected int anInt4392;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4391 = arg1;
		this.anInt4393 = arg2;
		this.aBoolean318 = arg3;
		this.aBoolean319 = arg4;
		this.anInt4392 = arg0;
	}
}
