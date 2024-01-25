import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public final class Class231 {

	@OriginalMember(owner = "client!nia", name = "d", descriptor = "I")
	public int anInt7107;

	@OriginalMember(owner = "client!nia", name = "f", descriptor = "I")
	public int anInt7109;

	@OriginalMember(owner = "client!nia", name = "g", descriptor = "I")
	public int anInt7110;

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "I")
	public int anInt7104 = 128;

	@OriginalMember(owner = "client!nia", name = "l", descriptor = "I")
	public int anInt7113 = 128;

	@OriginalMember(owner = "client!nia", name = "i", descriptor = "I")
	public int anInt7112;

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(I)V")
	public Class231(@OriginalArg(0) int arg0) {
		this.anInt7112 = arg0;
	}

	@OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(IIIIII)V")
	private Class231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7109 = arg3;
		this.anInt7107 = arg5;
		this.anInt7112 = arg0;
		this.anInt7110 = arg4;
		this.anInt7104 = arg1;
		this.anInt7113 = arg2;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lclient!nia;I)V")
	public void method5968(@OriginalArg(0) Class231 arg0) {
		this.anInt7110 = arg0.anInt7110;
		this.anInt7112 = arg0.anInt7112;
		this.anInt7113 = arg0.anInt7113;
		this.anInt7104 = arg0.anInt7104;
		this.anInt7109 = arg0.anInt7109;
		this.anInt7107 = arg0.anInt7107;
	}

	@OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)Lclient!nia;")
	public Class231 method5970() {
		return new Class231(this.anInt7112, this.anInt7104, this.anInt7113, this.anInt7109, this.anInt7110, this.anInt7107);
	}
}
