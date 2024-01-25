import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class71 {

	@OriginalMember(owner = "client!es", name = "b", descriptor = "I")
	public int anInt2331 = 0;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "I")
	public int anInt2336 = 0;

	@OriginalMember(owner = "client!es", name = "e", descriptor = "Lclient!nj;")
	private final Class171 aClass171_11 = new Class171(64);

	@OriginalMember(owner = "client!es", name = "m", descriptor = "Lclient!dt;")
	private Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!es", name = "i", descriptor = "Lclient!mg;")
	private final Class160 aClass160_12;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "Lclient!mg;")
	private final Class160 aClass160_11;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(ILclient!mg;Lclient!mg;Lclient!dt;)V")
	public Class71(@OriginalArg(0) int arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(3) Interface3 arg3) {
		this.aClass160_12 = arg1;
		this.anInterface3_1 = arg3;
		this.aClass160_11 = arg2;
		if (this.aClass160_12 != null) {
			this.anInt2336 = this.aClass160_12.method3722(1);
		}
		if (this.aClass160_11 != null) {
			this.anInt2331 = this.aClass160_11.method3722(1);
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(J[ILclient!kl;B)Ljava/lang/String;")
	public String method1829(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class142 arg2) {
		if (this.anInterface3_1 != null) {
			@Pc(14) String local14 = this.anInterface3_1.method2011(arg2, arg0, arg1);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg0);
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)Lclient!ni;")
	public Class2_Sub5_Sub10 method1830(@OriginalArg(0) int arg0) {
		@Pc(11) Class2_Sub5_Sub10 local11 = (Class2_Sub5_Sub10) this.aClass171_11.method3941((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(39) byte[] local39;
		if (arg0 >= 32768) {
			local39 = this.aClass160_11.method3696(arg0 & 0x7FFF, 1);
		} else {
			local39 = this.aClass160_12.method3696(arg0, 1);
		}
		local11 = new Class2_Sub5_Sub10();
		local11.aClass71_2 = this;
		if (local39 != null) {
			local11.method3913(new Class2_Sub23(local39));
		}
		if (arg0 >= 32768) {
			local11.method3917();
		}
		this.aClass171_11.method3940((long) arg0, local11);
		return local11;
	}
}
