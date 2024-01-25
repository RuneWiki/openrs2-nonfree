import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public final class Class157 {

	@OriginalMember(owner = "client!is", name = "e", descriptor = "I")
	public int anInt4788;

	@OriginalMember(owner = "client!is", name = "i", descriptor = "I")
	public int anInt4792;

	@OriginalMember(owner = "client!is", name = "j", descriptor = "I")
	public int anInt4793;

	@OriginalMember(owner = "client!is", name = "g", descriptor = "I")
	public int anInt4790 = 128;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "I")
	public int anInt4794 = 128;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "I")
	public int anInt4789;

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(I)V")
	public Class157(@OriginalArg(0) int arg0) {
		this.anInt4789 = arg0;
	}

	@OriginalMember(owner = "client!is", name = "<init>", descriptor = "(IIIIII)V")
	private Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4790 = arg2;
		this.anInt4794 = arg1;
		this.anInt4788 = arg3;
		this.anInt4789 = arg0;
		this.anInt4793 = arg4;
		this.anInt4792 = arg5;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Lclient!is;")
	public Class157 method4110() {
		return new Class157(this.anInt4789, this.anInt4794, this.anInt4790, this.anInt4788, this.anInt4793, this.anInt4792);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(Lclient!is;B)V")
	public void method4114(@OriginalArg(0) Class157 arg0) {
		this.anInt4790 = arg0.anInt4790;
		this.anInt4788 = arg0.anInt4788;
		this.anInt4794 = arg0.anInt4794;
		this.anInt4793 = arg0.anInt4793;
		this.anInt4792 = arg0.anInt4792;
		this.anInt4789 = arg0.anInt4789;
	}
}
