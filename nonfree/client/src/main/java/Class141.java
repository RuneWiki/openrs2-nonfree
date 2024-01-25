import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class141 {

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!c;")
	public Class34 aClass34_3;

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "Lclient!kh;")
	public Class141 aClass141_1;

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
	public int anInt4092;

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
	public int anInt4093;

	@OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
	public int anInt4095;

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
	public final int anInt4096;

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
	public final int anInt4090;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(II)V")
	public Class141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4096 = arg0;
		this.anInt4090 = arg1;
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!kh;I)V")
	public Class141(@OriginalArg(0) Class141 arg0, @OriginalArg(1) int arg1) {
		this.aClass141_1 = arg0;
		this.anInt4090 = arg1 + this.aClass141_1.anInt4090;
		this.anInt4096 = this.aClass141_1.anInt4096;
		this.aClass34_3 = this.aClass141_1.aClass34_3;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)Lclient!kh;")
	public Class141 method3253(@OriginalArg(1) int arg0) {
		return new Class141(this.anInt4096, arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lclient!ti;")
	public Class236 method3256() {
		return Static173.method2928(this.anInt4096);
	}
}
