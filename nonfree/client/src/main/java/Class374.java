import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public final class Class374 {

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "I")
	public int anInt10925;

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
	public int anInt10926;

	@OriginalMember(owner = "client!vga", name = "c", descriptor = "I")
	public int anInt10927;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "()V")
	public Class374() {
	}

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!vga;)V")
	public Class374(@OriginalArg(0) Class374 arg0) {
		this.anInt10925 = arg0.anInt10925;
		this.anInt10926 = arg0.anInt10926;
		this.anInt10927 = arg0.anInt10927;
	}
}
