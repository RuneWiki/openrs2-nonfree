import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
	public final int anInt5254;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
	public final int anInt5243;

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(II)V")
	public Class1_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5254 = arg1;
		this.anInt5243 = arg0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	public int method4026() {
		return Static206.method3292(this.anInt5243);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)I")
	public int method4027() {
		return this.anInt5243 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)Z")
	public boolean method4029(@OriginalArg(1) int arg0) {
		return (this.anInt5243 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)Z")
	public boolean method4030() {
		return (this.anInt5243 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)Z")
	public boolean method4032() {
		return (this.anInt5243 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(B)Z")
	public boolean method4033() {
		return (this.anInt5243 >> 21 & 0x1) != 0;
	}
}
