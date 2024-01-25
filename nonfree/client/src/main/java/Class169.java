import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public final class Class169 {

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "Lclient!m;")
	public Class181 aClass181_10;

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
	public int anInt4670;

	@OriginalMember(owner = "client!kv", name = "k", descriptor = "Lclient!kv;")
	public Class169 aClass169_2;

	@OriginalMember(owner = "client!kv", name = "l", descriptor = "I")
	public int anInt4674;

	@OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
	public int anInt4676;

	@OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
	public final int anInt4678;

	@OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
	public final int anInt4667;

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(II)V")
	public Class169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4678 = arg0;
		this.anInt4667 = arg1;
	}

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!kv;I)V")
	public Class169(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1) {
		this.aClass169_2 = arg0;
		this.anInt4667 = this.aClass169_2.anInt4667 + arg1;
		this.aClass181_10 = this.aClass169_2.aClass181_10;
		this.anInt4678 = this.aClass169_2.anInt4678;
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)Lclient!to;")
	public Class274 method4056() {
		return Static121.method2325(this.anInt4678);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Lclient!kv;")
	public Class169 method4059(@OriginalArg(0) int arg0) {
		return new Class169(this.anInt4678, arg0);
	}
}
