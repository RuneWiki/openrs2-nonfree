import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public final class Class128 {

	@OriginalMember(owner = "client!haa", name = "e", descriptor = "Lclient!q;")
	public Class8 aClass8_5;

	@OriginalMember(owner = "client!haa", name = "f", descriptor = "I")
	public int anInt4086;

	@OriginalMember(owner = "client!haa", name = "i", descriptor = "I")
	public int anInt4089;

	@OriginalMember(owner = "client!haa", name = "k", descriptor = "I")
	public int anInt4091;

	@OriginalMember(owner = "client!haa", name = "s", descriptor = "Lclient!haa;")
	public Class128 aClass128_1;

	@OriginalMember(owner = "client!haa", name = "o", descriptor = "I")
	public final int anInt4093;

	@OriginalMember(owner = "client!haa", name = "p", descriptor = "I")
	public final int anInt4094;

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(II)V")
	public Class128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4093 = arg1;
		this.anInt4094 = arg0;
	}

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!haa;I)V")
	public Class128(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1) {
		this.aClass128_1 = arg0;
		this.anInt4094 = this.aClass128_1.anInt4094;
		this.aClass8_5 = this.aClass128_1.aClass8_5;
		this.anInt4093 = this.aClass128_1.anInt4093 + arg1;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)Lclient!vf;")
	public Class330 method3602() {
		return Static329.method5264(this.anInt4094);
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)Lclient!haa;")
	public Class128 method3605(@OriginalArg(1) int arg0) {
		return new Class128(this.anInt4094, arg0);
	}
}
