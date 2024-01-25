import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class366 {

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
	public int anInt9649 = 0;

	@OriginalMember(owner = "client!wv", name = "i", descriptor = "I")
	public int anInt9655 = 0;

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "Lclient!mf;")
	private final Class222 aClass222_65 = new Class222(64);

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "Lclient!oe;")
	private Interface13 anInterface13_1 = null;

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "Lclient!pu;")
	private final Class270 aClass270_124;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "Lclient!pu;")
	private final Class270 aClass270_123;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(ILclient!pu;Lclient!pu;Lclient!oe;)V")
	public Class366(@OriginalArg(0) int arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(2) Class270 arg2, @OriginalArg(3) Interface13 arg3) {
		this.aClass270_124 = arg2;
		this.anInterface13_1 = arg3;
		this.aClass270_123 = arg1;
		if (this.aClass270_123 != null) {
			this.anInt9655 = this.aClass270_123.method5685(1);
		}
		if (this.aClass270_124 != null) {
			this.anInt9649 = this.aClass270_124.method5685(1);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B[IJLclient!ff;)Ljava/lang/String;")
	public String method7867(@OriginalArg(1) int[] arg0, @OriginalArg(2) long arg1, @OriginalArg(3) Class101 arg2) {
		if (this.anInterface13_1 != null) {
			@Pc(14) String local14 = this.anInterface13_1.method3416(arg2, arg1, arg0);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg1);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)Lclient!rh;")
	public Class1_Sub6_Sub13 method7873(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub6_Sub13 local11 = (Class1_Sub6_Sub13) this.aClass222_65.method4430((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass270_124.method5704(1, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass270_123.method5704(1, arg0);
		}
		local11 = new Class1_Sub6_Sub13();
		local11.aClass366_2 = this;
		if (local27 != null) {
			local11.method6224(new Class1_Sub35(local27));
		}
		if (arg0 >= 32768) {
			local11.method6228();
		}
		this.aClass222_65.method4434(local11, (long) arg0);
		return local11;
	}
}
