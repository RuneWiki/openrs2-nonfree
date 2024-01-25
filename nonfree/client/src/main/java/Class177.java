import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public final class Class177 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
	public int anInt4929;

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
	public int anInt4930;

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
	public int anInt4931;

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public int anInt4928 = 128;

	@OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
	public int anInt4933 = 128;

	@OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
	public int anInt4934;

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(I)V")
	public Class177(@OriginalArg(0) int arg0) {
		this.anInt4934 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(IIIIII)V")
	private Class177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4933 = arg1;
		this.anInt4929 = arg3;
		this.anInt4934 = arg0;
		this.anInt4930 = arg4;
		this.anInt4928 = arg2;
		this.anInt4931 = arg5;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BLclient!jt;)V")
	public void method4550(@OriginalArg(1) Class177 arg0) {
		this.anInt4930 = arg0.anInt4930;
		this.anInt4933 = arg0.anInt4933;
		this.anInt4928 = arg0.anInt4928;
		this.anInt4929 = arg0.anInt4929;
		this.anInt4934 = arg0.anInt4934;
		this.anInt4931 = arg0.anInt4931;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)Lclient!jt;")
	public Class177 method4552() {
		return new Class177(this.anInt4934, this.anInt4933, this.anInt4928, this.anInt4929, this.anInt4930, this.anInt4931);
	}
}
