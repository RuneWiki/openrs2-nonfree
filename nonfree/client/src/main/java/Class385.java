import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public final class Class385 {

	@OriginalMember(owner = "client!vga", name = "j", descriptor = "I")
	public int anInt10757;

	@OriginalMember(owner = "client!vga", name = "h", descriptor = "I")
	public int anInt10758;

	@OriginalMember(owner = "client!vga", name = "l", descriptor = "I")
	public int anInt10759;

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "I")
	public int anInt10760 = -1;

	@OriginalMember(owner = "client!vga", name = "d", descriptor = "Lclient!js;")
	public final Class100 aClass100_11;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lclient!wka;)V")
	public Class385(@OriginalArg(0) Class19_Sub1_Sub3_Sub2 arg0) {
		this.aClass100_11 = new Class100_Sub1(arg0, false);
	}
}
