import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public final class Class5_Sub1_Sub12 extends Class5_Sub1 {

	@OriginalMember(owner = "client!vga", name = "m", descriptor = "I")
	private int anInt10272;

	@OriginalMember(owner = "client!vga", name = "p", descriptor = "I")
	private int anInt10274;

	@OriginalMember(owner = "client!vga", name = "s", descriptor = "I")
	private int anInt10277;

	@OriginalMember(owner = "client!vga", name = "v", descriptor = "I")
	private int anInt10280;

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(Lclient!im;B)V")
	@Override
	public void method8505(@OriginalArg(0) Class166 arg0) {
		arg0.method4108(this.anInt10280, this.anInt10274, this.anInt10272, this.anInt10277);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(BLclient!mc;)V")
	@Override
	public void method8507(@OriginalArg(1) Class5_Sub41 arg0) {
		this.anInt10274 = arg0.method7804();
		this.anInt10277 = arg0.method7804();
		this.anInt10280 = arg0.method7816();
		this.anInt10272 = arg0.method7816();
	}
}
