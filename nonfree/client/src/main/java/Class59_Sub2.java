import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class59_Sub2 extends Class59 implements Interface8 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "I")
	private int anInt7246;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!ht;I[BI)V")
	public Class59_Sub2(@OriginalArg(0) Class109_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt7246 = arg1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)J")
	@Override
	public long method5607() {
		return super.aNativeBuffer4.c();
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I")
	@Override
	public int method5608() {
		return 0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5609(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.method5606(arg0, arg1);
		this.anInt7246 = 5123;
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)I")
	@Override
	public int method5610() {
		return this.anInt7246;
	}
}
