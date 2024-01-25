import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class294 {

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
	public int anInt8224 = 0;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
	public int anInt8225 = 0;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "Lclient!vg;")
	private final Class342 aClass342_165 = new Class342(64);

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "Lclient!mn;")
	private Interface13 anInterface13_1 = null;

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "Lclient!ri;")
	private final Class284 aClass284_134;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "Lclient!ri;")
	private final Class284 aClass284_133;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(ILclient!ri;Lclient!ri;Lclient!mn;)V")
	public Class294(@OriginalArg(0) int arg0, @OriginalArg(1) Class284 arg1, @OriginalArg(2) Class284 arg2, @OriginalArg(3) Interface13 arg3) {
		this.anInterface13_1 = arg3;
		this.aClass284_134 = arg2;
		this.aClass284_133 = arg1;
		if (this.aClass284_133 != null) {
			this.anInt8224 = this.aClass284_133.method6354(1);
		}
		if (this.aClass284_134 != null) {
			this.anInt8225 = this.aClass284_134.method6354(1);
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(JI[ILclient!ui;)Ljava/lang/String;")
	public String method6452(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class329 arg2) {
		if (this.anInterface13_1 != null) {
			@Pc(20) String local20 = this.anInterface13_1.method506(arg2, arg0, arg1);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)Lclient!gg;")
	public Class3_Sub7_Sub8 method6455(@OriginalArg(0) int arg0) {
		@Pc(11) Class3_Sub7_Sub8 local11 = (Class3_Sub7_Sub8) this.aClass342_165.method7684((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = this.aClass284_133.method6331(1, arg0);
		} else {
			local25 = this.aClass284_134.method6331(1, arg0 & 0x7FFF);
		}
		local11 = new Class3_Sub7_Sub8();
		local11.aClass294_1 = this;
		if (local25 != null) {
			local11.method3046(new Class3_Sub26(local25));
		}
		if (arg0 >= 32768) {
			local11.method3045();
		}
		this.aClass342_165.method7683(local11, (long) arg0);
		return local11;
	}
}
