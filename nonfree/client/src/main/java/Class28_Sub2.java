import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class28_Sub2 extends Class28 implements Interface2 {

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
	private int anInt7541;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(Lclient!qg;I[BI)V")
	public Class28_Sub2(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7541 = arg1;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)I")
	@Override
	public int method5944() {
		return this.anInt7541;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5945(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5806(arg0, arg1);
		this.anInt7541 = 5123;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z)J")
	@Override
	public long method5943() {
		return super.aNativeBuffer4.b();
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)I")
	@Override
	public int method5942() {
		return 0;
	}
}
