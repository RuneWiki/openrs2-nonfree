import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public final class Class368 {

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "Lclient!da;")
	public Class69 aClass69_14 = null;

	@OriginalMember(owner = "client!vga", name = "f", descriptor = "Lclient!eia;")
	public Class88 aClass88_21 = null;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class368(@OriginalArg(0) Class69 arg0) {
		this.aClass69_14 = arg0;
	}

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!da;Lclient!eia;)V")
	public Class368(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class88 arg1) {
		this.aClass88_21 = arg1;
		this.aClass69_14 = arg0;
	}
}
