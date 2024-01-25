import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class228 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	public int anInt6849 = 0;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	public int anInt6851 = 0;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!lh;")
	private final Class151 aClass151_166 = new Class151(64);

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "Lclient!rj;")
	private Interface10 anInterface10_1 = null;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Lclient!hh;")
	private final Class109 aClass109_86;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Lclient!hh;")
	private final Class109 aClass109_87;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(ILclient!hh;Lclient!hh;Lclient!rj;)V")
	public Class228(@OriginalArg(0) int arg0, @OriginalArg(1) Class109 arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Interface10 arg3) {
		this.anInterface10_1 = arg3;
		this.aClass109_86 = arg1;
		this.aClass109_87 = arg2;
		if (this.aClass109_86 != null) {
			this.anInt6849 = this.aClass109_86.method2322(1);
		}
		if (this.aClass109_87 != null) {
			this.anInt6851 = this.aClass109_87.method2322(1);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB)Lclient!cm;")
	public Class1_Sub1_Sub5 method5369(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub1_Sub5 local11 = (Class1_Sub1_Sub5) this.aClass151_166.method3288((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29;
		if (arg0 >= 32768) {
			local29 = this.aClass109_87.method2349(1, arg0 & 0x7FFF);
		} else {
			local29 = this.aClass109_86.method2349(1, arg0);
		}
		local11 = new Class1_Sub1_Sub5();
		local11.aClass228_2 = this;
		if (local29 != null) {
			local11.method771(new Class1_Sub14(local29));
		}
		if (arg0 >= 32768) {
			local11.method772();
		}
		this.aClass151_166.method3291((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(J[ILclient!sv;B)Ljava/lang/String;")
	public String method5370(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class222 arg2) {
		if (this.anInterface10_1 != null) {
			@Pc(14) String local14 = this.anInterface10_1.method1607(arg0, arg1, arg2);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg0);
	}
}
