import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class241 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	public int anInt7715;

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	public int anInt7722;

	@OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
	public int anInt7723;

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
	public int anInt7717 = 128;

	@OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
	public int anInt7719 = 128;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	public int anInt7718;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(I)V")
	public Class241(@OriginalArg(0) int arg0) {
		this.anInt7718 = arg0;
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(IIIIII)V")
	private Class241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7717 = arg2;
		this.anInt7719 = arg1;
		this.anInt7718 = arg0;
		this.anInt7715 = arg5;
		this.anInt7723 = arg4;
		this.anInt7722 = arg3;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)Lclient!oo;")
	public Class241 method6408() {
		return new Class241(this.anInt7718, this.anInt7719, this.anInt7717, this.anInt7722, this.anInt7723, this.anInt7715);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!oo;)V")
	public void method6411(@OriginalArg(1) Class241 arg0) {
		this.anInt7717 = arg0.anInt7717;
		this.anInt7722 = arg0.anInt7722;
		this.anInt7715 = arg0.anInt7715;
		this.anInt7719 = arg0.anInt7719;
		this.anInt7718 = arg0.anInt7718;
		this.anInt7723 = arg0.anInt7723;
	}
}
